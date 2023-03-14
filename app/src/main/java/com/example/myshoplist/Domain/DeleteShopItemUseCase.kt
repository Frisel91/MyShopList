package com.example.myshoplist.Domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopList(shopItem: ShopItem){
        shopListRepository.deleteShopList(shopItem)
    }

}