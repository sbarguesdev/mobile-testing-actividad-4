package com.example.mobiletesting

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ProductServiceTest {

    private val productService = ProductService()

    @Test
    fun dadoUnListadoDeProductos_laInformacionSePuedeMostrarEnPantalla() {
        // 1. Crear los siguientes productos
        val p1 = Product(id = 1, name = "iPhone 13", description = "Apple smartphone", price = 999.99, currency = "USD", inStock = true)
        val p2 = Product(id = 2, name = "Samsung Galaxy S21", description = "Samsung smartphone", price = 899.99, currency = "USD", inStock = true)
        val p3 = Product(id = 3, name = "Google Pixel 6", description = "Google smartphone", price = 799.99, currency = "USD", inStock = false)

        val products = listOf(p1, p2, p3)

        // 2. Verificar que canShowProducts retorne true
        assertTrue(productService.canShowProducts(products))

        // 3. Verificar que getProductsForDisplay retorne 3 elementos
        val displayList = productService.getProductsForDisplay(products)
        assertEquals(3, displayList.size)

        // 4. Verificar los textos resultantes
        assertEquals("iPhone 13 - USD 999.99 - Disponible", displayList[0])
        assertEquals("Samsung Galaxy S21 - USD 899.99 - Disponible", displayList[1])
        assertEquals("Google Pixel 6 - USD 799.99 - Sin stock", displayList[2])
    }

    @Test
    fun dadoUnListadoVacio_noSePuedeMostrarInformacionEnPantalla() {
        // 1. Usar una lista vacía
        val products = emptyList<Product>()

        // 2. Verificar que canShowProducts retorne false
        assertFalse(productService.canShowProducts(products))

        // 3. Verificar que getProductsForDisplay retorne una lista vacía
        val displayList = productService.getProductsForDisplay(products)
        assertTrue(displayList.isEmpty())
    }
}
