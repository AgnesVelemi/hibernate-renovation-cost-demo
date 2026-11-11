# Hibernate Renovation Cost Demo

## A projektről

A projekt célja a **Hibernate ORM és a JPA működésének gyakorlati bemutatása** egy egyszerű felújításiköltség-nyilvántartó alkalmazáson keresztül.

Az alkalmazás felújítási költségeket tárol és kérdez le egy H2 adatbázisból. A példában olyan kiadások szerepelhetnek, mint az építőanyagok, a munkadíjak vagy az egyéb felújítási költségek.

A projekt önálló Java alkalmazásként működik, Spring Boot és alkalmazásszerver nélkül.

## Felhasznált technológiák

- **Java 21** – programozási nyelv
- **Maven** – projekt- és függőségkezelés
- **Hibernate ORM** – objektum-relációs leképezés
- **Jakarta Persistence (JPA)** – perzisztenciaannotációk és API
- **H2 Database** – beágyazott relációs adatbázis
- **SQL / HQL** – adatbázis-lekérdezések

## A projekt főbb funkciói

- Felújítási költségek Java objektumként történő kezelése.
- Entitások leképezése adatbázistáblákra JPA annotációkkal.
- Adatok mentése Hibernate segítségével.
- Adatok lekérdezése HQL használatával.
- Tranzakciók kezelése.
- H2 adatbázis használata memóriában vagy fájlalapú módban.

## Hogyan működik?

A Hibernate ORM kapcsolatot teremt a Java objektumok és a relációs adatbázis között.

A `RenovationCost` Java osztály egy adatbázis-entitást reprezentál. A JPA annotációk határozzák meg, hogyan történik az objektum és az adatbázistábla közötti leképezés.

Az alkalmazás a Hibernate `Session` és `Transaction` API-ján keresztül menti és kérdezi le az adatokat.

**Egyszerűsített működési folyamat:**

1. Java objektum létrehozása.
2. Hibernate kapcsolat létrehozása az adatbázissal.
3. Tranzakció indítása.
4. Objektum mentése az adatbázisba.
5. Tranzakció véglegesítése.
6. Adatok lekérdezése.

## A projekt futtatása

### Szükséges környezet

- JDK 21
- Apache Maven 3.9 vagy újabb
- Hibernate 7

### Maven java projekt fordítása és futtatása

A projekt gyökérkönyvtárában:

```bash
mvn clean compile exec:java
```

A memóriában tárolt adatbázis az alkalmazás leállításakor elveszíti az adatait. A fájlalapú változat az adatokat a helyi `data` könyvtárban tárolja.

## A projekt célja

A projekt gyakorlati példán keresztül mutatja be a Java és az ORM technológia kapcsolatát, különös tekintettel a Hibernate működésére, a JPA annotációkra, az adatbázis-műveletekre és a tranzakciókezelésre.

A megoldás egy egyszerű, továbbfejleszthető alapot ad összetettebb Java backend alkalmazások megvalósításához.
