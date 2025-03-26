package za.co.varsitycollege.st10479242.myfirstimadassignment

//ST10479242
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Finding variables
        val txeTime = findViewById<EditText>(R.id.txeTime)
        val clickyBtn = findViewById<Button>(R.id.clickyBtn)
        val txtFood = findViewById<TextView>(R.id.txtFood)
        val resetBtn = findViewById<Button>(R.id.resetBtn)


        //Button to get meal suggestions
        clickyBtn.setOnClickListener {
            val inputText = txeTime.text.toString().trim().lowercase()

            val mealSuggestion = when (inputText) {
                "morning" -> {
                    "Breakfast: Scrambled eggs and toast"
                }

                "mid-morning" -> {
                    "Mid-Morning Snack: Yogurt with fruits"
                }

                "afternoon" -> {
                    "Lunch: Grilled chicken sandwich"
                }

                "dinner" -> {
                    "Dinner: Steak and Rice"
                }

                "midnight snack" -> {
                    "Midnight Snack: Warm Tea and Biscuits"
                }

                else -> {
                    "Invalid input. Please enter: One of the options above."
                }
            }

            txtFood.text = mealSuggestion
            //Reset Button
            resetBtn.setOnClickListener {
                txeTime.setText("")   // Clear EditText
                txtFood.text = ""     // Reset TextView to empty
            }
        }
    }
}