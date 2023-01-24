package com.example.quizapp

object ConstantFlags {

    const val  USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestionsFlags(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
        "Argentina", "Australia", "Portugalia", "Spain", 1)
        questionList.add(que1)

        val que2 = Question(2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
        "USA", "Australia", "New Zealand", "England", 2)
        questionList.add(que2)

        val que3 = Question(3, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Germany", "France", "Belgium", "Italy", 3)
        questionList.add(que3)

        val que4 = Question(4, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Jamaica", "Brazil", "India", "England", 2)
        questionList.add(que4)

        val que5 = Question(5, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Switzerland", "Norway", "Sweden", "Denmark", 4)
        questionList.add(que5)

        val que6 = Question(6, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "USA", "Australia", "Tuvalu", "Fiji", 4)
        questionList.add(que6)

        val que7 = Question(7, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Belgium", "Germany", "Poland", "Hungary", 2)
        questionList.add(que7)

        val que8 = Question(8, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "India", "Niger", "Republic of Ireland", "Ivory Coast", 1)
        questionList.add(que8)

        val que9 = Question(9, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "USA", "Australia", "Kuwait", "England", 3)
        questionList.add(que9)


        val que11 = Question(11, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
            "USA", "Australia", "New Zealand", "Kenya", 3)
        questionList.add(que11)




    return questionList
    }
}

object ConstantsCapitals {

    const val  USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getConstantsCapitals(): ArrayList<Question2>
    {
        val questionListCap = ArrayList<Question2>()
        val que1 = Question2(
            1, "What is the capital of Argentina?", R.drawable.ic_flag_of_argentina,
            "Canberra", "Buenos Aires", "Bridgetown", "Lomé", 2)

        val que2 = Question2(2, "What is the capital of Australia?", R.drawable.ic_flag_of_australia,
            "Luxemburg", "Canberra", "Helsinki", "Monaco", 2)

        val que3 = Question2(3, "What is the capital of Belgium?", R.drawable.ic_flag_of_belgium,
            "Berlin", "Stockholm", "Singapore", "Brussels", 4)

        val que4 = Question2(4, "What is the capital of Brazil?", R.drawable.ic_flag_of_brazil,
            "Brasília", "Brazzaville", "Brades", "Basseterre", 1)

        val que5 = Question2(5, "What is the capital of Denmark?", R.drawable.ic_flag_of_denmark,
            "Bern", "Bamako", "Copenhagen", "Avura", 3)

        val que6 = Question2(6, "What is the capital of Fiji?", R.drawable.ic_flag_of_fiji,
            "Suva", "Sukhumi", "Stanley", "St. Heiler", 1)

        val que7 = Question2(7, "What is the capital of Germany", R.drawable.ic_flag_of_germany,
            "Berlin", "Kingston", "Lima", "Luanda", 1)

        val que8 = Question2(8, "What is the capital of India?", R.drawable.ic_flag_of_india,
            "Ngerulmud", "Niamey", "Nairobi", "New Delhi", 4)

        val que9 = Question2(9, "What is the capital of Kuwait?", R.drawable.ic_flag_of_kuwait,
            "Kuwait City", "Kyiv", "Lisbon", "Libreville", 1)


        val que11 = Question2(11, "What is the capital of New Zealand?", R.drawable.ic_flag_of_new_zealand,
            "Vienna", "Warsaw", "Washington DC", "Wellington", 4)


        questionListCap.add(que1)
        questionListCap.add(que2)
        questionListCap.add(que3)
        questionListCap.add(que4)
        questionListCap.add(que5)
        questionListCap.add(que6)
        questionListCap.add(que7)
        questionListCap.add(que8)
        questionListCap.add(que9)
        questionListCap.add(que11)
        return questionListCap
    }


}