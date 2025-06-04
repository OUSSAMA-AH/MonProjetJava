# MonProjetJava 🚀

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)]()
[![Java Version](https://img.shields.io/badge/java-11+-orange.svg)]()
[![Maven](https://img.shields.io/badge/maven-3.9+-blue.svg)]()

## 📖 Description

Application Java démonstrative développée pour le **TP1 DevOps** . Intégration complète des outils modernes : **Maven**, **Git**, et **GitHub**.

---

## 🎯 Objectifs du TP

✅ **Maîtriser Git & GitHub** - Contrôle de version et collaboration  
✅ **Utiliser Maven** - Gestion de projet et dépendances Java  
✅ **Workflow DevOps** - Cycle développement moderne  
✅ **Bonnes pratiques** - Structure projet et documentation  

---

## ⚡ Quick Start

### 🔧 Prérequis
```bash
java --version    # Java 11+
mvn --version     # Maven 3.6+
git --version     # Git 2.0+
```

### 📥 Installation
```bash
# Cloner le projet
git clone https://github.com/OUSSAMA-AH/MonProjetJava.git
cd MonProjetJava

# Build & Test
mvn clean install

# Exécuter
java -cp target/classes com.example.App
```
---

## 🛠️ Commandes Essentielles

### Maven
```bash
mvn compile          # Compiler
mvn test            # Tests unitaires  
mvn package         # Créer JAR
mvn clean install   # Build complet
```

### Git
```bash
git status          # État du repo
git add .           # Ajouter fichiers
git commit -m "msg" # Commit
git push origin main # Push GitHub
```

---

## 📁 Structure Projet

```
MonProjetJava/
├── pom.xml                    # Config Maven
├── README.md                  # Documentation
├── .gitignore                 # Exclusions Git
└── src/
    ├── main/java/com/example/
    │   └── App.java           # Code principal
    └── test/java/com/example/
        └── AppTest.java       # Tests JUnit
```

---

## 🧪 Tests & Qualité

- **Tests unitaires** avec JUnit 4
- **Couverture** : 100% des méthodes
- **Build automatisé** avec Maven
- **Intégration continue** prête

```bash
mvn test    # Exécuter tous les tests
# Tests run: 2, Failures: 0, Errors: 0 ✅
```

---

## 📈 Étapes Réalisées

| Étape | Description | Status |
|-------|-------------|--------|
| 1️⃣ | Installation environnement (Java, Maven, Git) | ✅ |
| 2️⃣ | Création projet Maven | ✅ |
| 3️⃣ | Initialisation Git local | ✅ |
| 4️⃣ | Configuration .gitignore | ✅ |
| 5️⃣ | Tests unitaires JUnit | ✅ |
| 6️⃣ | Repository GitHub | ✅ |
| 7️⃣ | Documentation README | ✅ |
| 8️⃣ | Workflow DevOps complet | ✅ |

---

## 🔗 Liens Utiles

- [Repository GitHub](https://github.com/OUSSAMA-AH/MonProjetJava)
- [Documentation Maven](https://maven.apache.org/guides/)
- [Git Documentation](https://git-scm.com/doc)

---

## 📄 Licence

Projet académique - Académie Mohammed VI de l'Aviation Civile © 2024
