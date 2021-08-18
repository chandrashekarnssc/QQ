package com.aacproject.example.quriosityquiz

object setData_sci_tech {
    const val name:String="name"
    const val score:String="score"

    fun getQuestion4():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            "In reference to Defence Research and Development Organization (DRDO), the Microwave Tube Research and Development Center is located in",
            1,
            "Bengaluru",
            "Pune",
            "Hyderabad",
            "Delhi",
            1
        )

        var q2=QuestionData(
            "Which among the following has the largest carbon footprint?",
            2,
            "Coal burning power system",
            "Petroleum burning power system",
            "Heavy industries",
            "Motor vehicles",
            1
        )

        var q3=QuestionData(
            "The Indian Meteorological Department has set up a Mountain Meteorology Center at",
            3,
            "Delhi",
            "Kolkata",
            "Shimla",
            "Srinagar",
            1
        )

        var q4=QuestionData(
            "Which among the following is used to measure the age of water (up to 50,000 years)",
            4,
            "Chlorine-36",
            "Carbon-14",
            "Lead-210",
            "Americium-241",
            2
        )

        var q5=QuestionData(
            " What is Women Scientists Scheme?",
            5,
            "It aims to provide Women scientists for pursuing research in engineering only.",
            "It aims to provide Women Scientists for pursuing research in applied sciences only.",
            "Both A and B",
            "Only A",
            3
        )
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}
