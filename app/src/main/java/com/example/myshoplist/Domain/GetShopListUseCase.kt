package com.example.myshoplist.Domain


class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem>{

       return shopListRepository.getShopList()
    }
}