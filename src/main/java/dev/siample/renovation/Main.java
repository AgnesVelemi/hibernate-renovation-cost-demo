package dev.siample.renovation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                        .build();

        try (SessionFactory factory =
                     new MetadataSources(registry)
                             .addAnnotatedClass(RenovationCost.class)
                             .buildMetadata()
                             .buildSessionFactory()) {

            // SAVE
            try (Session session = factory.openSession()) {

                Transaction tx = session.beginTransaction();

                RenovationCost cost =
                        new RenovationCost("Burkolás", 450000);

                session.persist(cost);

                tx.commit();
            }

            // READ
            try (Session session = factory.openSession()) {

                List<RenovationCost> costs =
                        session.createQuery(
                                "FROM RenovationCost",
                                RenovationCost.class
                        ).list();

                costs.forEach(cost ->
                        System.out.println(
                                cost.getCategory() + ": "
                                        + (int) cost.getAmount() + " Ft"
                        )
                );
            }

        } finally {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}