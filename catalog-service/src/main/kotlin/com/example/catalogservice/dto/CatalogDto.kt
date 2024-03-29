package com.example.catalogservice.dto

data class CatalogDto(
    val productId: String,
    val qty: Int,
    val unitPrice: Int,
    val totalPrice: Int,

    val orderId: Long,
    val userId: Long,
) {

}