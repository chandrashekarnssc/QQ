package com.aacproject.example.quriosityquiz

import android.os.Parcel
import android.os.Parcelable

data class QuestionData (
    var question:String,
    var id:Int,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var correct_ans:Int
        )