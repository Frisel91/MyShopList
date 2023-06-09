package com.example.myshoplist.Domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopList(shopItem: ShopItem){
        shopListRepository.addShopList(shopItem)
    }
}