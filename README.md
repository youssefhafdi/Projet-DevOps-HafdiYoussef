# Projet DevOps

**Etudiant:** Hafdi Youssef
**Etablissement:** EMSI Tanger
**Module:** DevOps
**Annee Universitaire:** 2025/2026

---

## A Propos

Ce projet implemente une pipeline CI/CD complete pour une application Java/Maven.

**Message de l'application:**
> Bonjour et bon courage dans votre projet en DevOps

---

## Outils Utilises

- **Java 17** - Developpement
- **Maven** - Build et dependances
- **Git/GitHub** - Versioning
- **GitHub Actions** - CI
- **Jenkins** - CD
- **Docker** - Conteneurisation
- **Slack** - Notifications

---

## Utilisation

```bash
# Cloner
git clone https://github.com/youssefhafdi/Projet-DevOps-HafdiYoussef.git

# Build
mvn clean package

# Run
java -jar target/devops-app-1.0-SNAPSHOT.jar
```

---

## Pipeline

**Jenkins:** `PipeLine-HafdiYoussef`
1. Recuperation du code
2. Compilation
3. Tests
4. Packaging
5. Archivage
6. Notification Slack

---

## Branches

- `main` - Production
- `dev` - Developpement

---

## Tests

8 tests unitaires couvrent les fonctionnalites:
- Message de bienvenue
- Nom etudiant
- Version
- Annee
- Ecole
- Module
- Groupe
- Contenu du message
