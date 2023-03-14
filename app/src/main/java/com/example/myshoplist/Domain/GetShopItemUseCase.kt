package com.example.myshoplist.Domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int) {

      return shopListRepository.getShopItem(shopItemId)
    }
}