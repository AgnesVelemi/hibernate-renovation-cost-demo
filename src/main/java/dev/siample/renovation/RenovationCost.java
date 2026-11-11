package dev.siample.renovation;

import jakarta.persistence.*;

@Entity
@Table(name = "renovation_cost")
public class RenovationCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private double amount;

    protected RenovationCost() {
    }

    public RenovationCost(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
