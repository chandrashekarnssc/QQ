package com.aacproject.example.quriosityquiz

object setData_curaff {
    const val name:String="name"
    const val score:String="score"

    fun getQuestion1():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            "Which body has replaced Medical Council of India?",
            1,
            "Medical Body of India",
            "Medical Confederation of India",
            "Indian Medical Council",
            "National Medical Commission",
            4
        )

        var q2=QuestionData(
            "India has signed a MoU with which country in the field of intellectual property cooperation?",
            2,
            "UK",
            "Switzerland",
            "USA",
            "Canada",
            3
        )

        var q3=QuestionData(
            "Which institution has released a draft paper on online fantasy sports platforms?",
            3,
            "Ministry of Information and Technology",
            "World Bank",
            "NITI Aayog",
            "World Economic Forum",
            3
        )

        var q4=QuestionData(
            "India’s largest hockey stadium is planned to be set up in which state?",
            4,
            "Gujarat",
            "Odisha",
            "Kerala",
            "Andhra Pradesh",
            2
        )

        var q5=QuestionData(
            "What is the name of the Tax to be imposed in India on pollution causing vehicles?",
            5,
            "Green Tax",
            "Pollution Tax",
            "Fuel Tax",
            "Environment Tax",
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