package com.darkrai.gargi.domain.repositories

import com.darkrai.gargi.data.models.PlantDto

interface PlantRepository{
    suspend fun getSearchedPlants(query:String):List<PlantDto>
    suspend fun getPlantsByCategory(cat:String):List<PlantDto>
    suspend fun getTopPlants():List<PlantDto>
    suspend fun addDonation(plantId:Int,userId:String):Boolean
    suspend fun getPlantById(id: Int):PlantDto?
}