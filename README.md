# Santander bootcamp fullstack 2023
Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Diagrama de Classes

```mermaid

classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User --> Account
  User --> Feature
  User --> Card
  User --> News
```

