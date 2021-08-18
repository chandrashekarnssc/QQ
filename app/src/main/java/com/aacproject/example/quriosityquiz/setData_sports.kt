package com.aacproject.example.quriosityquiz

object setData_sports {


    const val name: String = "name"
    const val score: String = "score"

    fun getQuestion3(): ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            "Rovers Cup is related to which of the following sports?",
            1,
            "Football",
            "Cricket",
            "Hockey",
            "Tennis",
            1
        )

        var q2 = QuestionData(
            "Who was the first Indian International Cricket Council President?",
            2,
            "Sharad Pawar",
            "Jag Mohan Dalmiya",
            "Ray Mali",
            "Gavaskar",
            2
        )

        var q3 = QuestionData(
            "Where were the Commonwealth Games 2018 held?",
            3,
            "New Delhi",
            "Auckland",
            "Gold Coast",
            "Manchester",
            3
        )

        var q4 = QuestionData(
            "Who is the President of World Boxing Council?",
            4,
            "Ray Mancini",
            "Luis Spota",
            "Edwin Rosario",
            "Mauricio Sulaiman",
            4
        )

        var q5 = QuestionData(
            "Who is the captain of Indian National Football team?",
            5,
            "Sunil Chhetri",
            "Gurpreet Singh Sandhu",
            "Sandesh Jhingan",
            "Jeje Lalpekhlua",
            1
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}

