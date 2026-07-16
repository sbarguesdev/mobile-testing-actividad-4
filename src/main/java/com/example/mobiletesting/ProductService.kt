package com.example.mobiletesting

class ProductService {

    fun canShowProducts(products: List<Product>): Boolean {
        return products.isNotEmpty()
    }

    fun getProductsForDisplay(products: List<Product>): List<String> {
        if (products.isEmpty()) {
            return emptyList()
        }
        return products.map { product ->
            val stockStatus = if (product.inStock) "Disponible" else "Sin stock"
            "${product.name} - ${product.currency} ${product.price} - $stockStatus"
        }
    }
}
