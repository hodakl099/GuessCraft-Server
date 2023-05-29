package com.example.data.models

import com.example.data.models.BaseModel
import com.example.other.Constants.TYPE_CUR_ROUND_DRAW_INFO

data class RoundDrawInfo(
    val data: List<String>
): BaseModel(TYPE_CUR_ROUND_DRAW_INFO)
