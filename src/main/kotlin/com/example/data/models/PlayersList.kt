package com.example.data.models

import com.example.data.models.BaseModel
import com.example.data.models.PlayerData
import com.example.other.Constants.TYPE_PLAYERS_LIST

data class PlayersList(
    val players: List<PlayerData>
): BaseModel(TYPE_PLAYERS_LIST)
