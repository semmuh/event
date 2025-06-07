@startuml
entity "Event" {
  * id : Long
  * name : String
  * datum : LocalDate
}

entity "Teilnehmer" {
  * id : Long
  * name : String
  * email : String
}

Event ||--o{ Teilnehmer : hat
@enduml
