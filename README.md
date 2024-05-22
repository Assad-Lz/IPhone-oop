@startuml
class Person {
  + name: String
  + age: int
  - email: String
  + getName(): String
  + getAge(): int
  + setEmail(String email): void
}
class Address {
  + street: String
  + city: String
  + state: String
  + zipCode: int
}
Person --* Address
@enduml
