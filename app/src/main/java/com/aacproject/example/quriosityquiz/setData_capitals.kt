package com.aacproject.example.quriosityquiz

object setData_capitals {
    const val name:String="name"
    const val score:String="score"

    fun getQuestion2():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            "Dinar is the currency of which of the following countries?",
            1,
            "Bahrain",
            "Brazil",
            "Bhutan",
            "Georgia",
            1
        )

        var q2=QuestionData(
            "Phnom Penh is the capital of which of the following country?",
            2,
            "Denmark",
            "Canada",
            "Cambodia",
            "Cuba",
            3
        )

        var q3=QuestionData(
            "What is the national currency of Algeria?",
            3,
            "Dram",
            "Algerian Dollar",
            "Algerian Dinar",
            "Taka",
            3
        )

        var q4=QuestionData(
            "What is the national currency of Afghanistan?",
            4,
            "Afghan Afghani",
            "US Dollar",
            "Afghan Dollar",
            "Afghan yen",
            1
        )

        var q5=QuestionData(
            "Which is the capital of Tajikistan?",
            5,
            "Moscow",
            "Dodoma",
            "Damascus",
            "Dushanbe",
            4
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}
