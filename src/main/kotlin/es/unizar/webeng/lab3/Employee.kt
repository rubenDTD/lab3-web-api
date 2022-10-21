package es.unizar.webeng.lab3

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee(
    var name: String,
    var role: String,
    @Id
    @GeneratedValue
    var id: Long? = null
)
