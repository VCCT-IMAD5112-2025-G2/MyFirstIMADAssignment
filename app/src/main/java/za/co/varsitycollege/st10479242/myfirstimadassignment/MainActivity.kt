package za.co.varsitycollege.st10479242.myfirstimadassignment

//ST10479242
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finding variables
        val txeTime = findViewById<EditText>(R.id.txeTime)  // EditText where user inputs time of day
        val clickyBtn = findViewById<Button>(R.id.clickyBtn)  // Button to get meal suggestions
        val txtFood = findViewById<TextView>(R.id.txtFood)  // TextView to display meal suggestion
        val resetBtn = findViewById<Button>(R.id.resetBtn)  // Button to reset the input and output fields

        // Button click event for generating meal suggestions
        clickyBtn.setOnClickListener {
            val userInputText = txeTime.text.toString().trim().lowercase()

            Toast.makeText(this, "Getting meal suggestion...", Toast.LENGTH_SHORT).show()


            // meal suggestions based on user input
            val mealSuggestion = when (userInputText) {

                "morning" -> {
                    "Breakfast: Scrambled eggs and toast"  // Suggestion for morning meal
                }
                "mid-morning" -> {
                    "Mid-Morning Snack: Yogurt with fruits"  // Suggestion for mid-morning snack
                }
                "afternoon" -> {
                    "Lunch: Grilled chicken sandwich"  // Suggestion for afternoon lunch
                }
                "dinner" -> {
                    "Dinner: Steak and Rice"  // Suggestion for dinner
                }
                "midnight snack" -> {
                    "Midnight Snack: Warm Tea and Biscuits"  // Suggestion for a midnight night snack
                }
                else -> {
                    // Invalid input, display an error toast
                    Toast.makeText(this, "Invalid input! Please enter a valid time of day.", Toast.LENGTH_LONG).show()
                    return@setOnClickListener // Prevent further processing if input is invalid
                }
            }

            // Display the meal suggestion
            txtFood.text = mealSuggestion

            // Reset Button click event to clear input and output
            resetBtn.setOnClickListener {
                txeTime.setText("")   // Clears the EditText
                txtFood.text = ""     // Resets the TextView
                // Show a toast when the reset button is clicked
                Toast.makeText(this, "Text cleared.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}