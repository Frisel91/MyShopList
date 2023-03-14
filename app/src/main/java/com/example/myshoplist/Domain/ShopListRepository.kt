package com.example.myshoplist.Domain

interface ShopListRepository {

    fun addShopList(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopList(shopItem: ShopItem)

    fun getShopItem(shopItem: Int)

    fun getShopList(): List<ShopItem>
}