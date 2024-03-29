package com.example.userservice.domain.user

import com.example.catalogservice.domain.BaseTimeEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserEntity(
    email: String,
    name: String,
    encryptedPwd: String,
): BaseTimeEntity() {

    @Column(nullable = false, length = 50, unique = true)
    var email: String = email
        protected set

    @Column(nullable = false, length = 50)
    var name: String = name
        protected set

    @Column(nullable = false, unique = true)
    var encryptedPwd: String = encryptedPwd
        protected set



}