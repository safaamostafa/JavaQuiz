package com.example.safsaf.javaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This  app display the result of java quiz
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button submitTest = (Button) findViewById(R.id.submit_test);

        submitTest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                submitResult(v);
            }
        });

    }


    /**
     * This method is called when the submit button is clicked.
     */
    private void submitResult(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        RadioButton d1RadioButton = (RadioButton) findViewById(R.id.d1);
        boolean hasD1RadioButton = d1RadioButton.isChecked();
        RadioButton c2RadioButton = (RadioButton) findViewById(R.id.c2);
        boolean hasC2RadioButton = c2RadioButton.isChecked();
        RadioButton c3RadioButton = (RadioButton) findViewById(R.id.c3);
        boolean hasC3RadioButton = c3RadioButton.isChecked();
        RadioButton c4RadioButton = (RadioButton) findViewById(R.id.c4);
        boolean hasC4RadioButton = c4RadioButton.isChecked();
        RadioButton c5RadioButton = (RadioButton) findViewById(R.id.c5);
        boolean hasC5RadioButton = c5RadioButton.isChecked();
        RadioButton d6RadioButton = (RadioButton) findViewById(R.id.d6);
        boolean hasD6RadioButton = d6RadioButton.isChecked();
        RadioButton a8RadioButton = (RadioButton) findViewById(R.id.a8);
        boolean hasA8RadioButton = a8RadioButton.isChecked();
        EditText answerQuestion9 = (EditText) findViewById(R.id.answer_question9);
        String editText9 = answerQuestion9.getText().toString();
        EditText answerQuestion10 = (EditText) findViewById(R.id.answer_question10);
        String editText10 = answerQuestion10.getText().toString();
        CheckBox a11CheckBox = (CheckBox) findViewById(R.id.a11);
        boolean hasA11Checkbox = a11CheckBox.isChecked();
        CheckBox b11CheckBox = (CheckBox) findViewById(R.id.b11);
        boolean hasB11Checkbox = b11CheckBox.isChecked();
        int result = calcuِlateResult(hasD1RadioButton, hasC2RadioButton, hasC3RadioButton, hasC4RadioButton, hasC5RadioButton,
                hasD6RadioButton, hasA8RadioButton, editText9, editText10, hasA11Checkbox, hasB11Checkbox);
        String resultMessage = createResultSummery(result, name);
        displayMessage(resultMessage);
    }

    /**
     * This method is calculate the result .
     */
    private int calcuِlateResult(boolean d1RadioButton, boolean c2RadioButton, boolean c3RadioButton, boolean c4RadioButton,
                                 boolean c5RadioButton, boolean d6RadioButton, boolean a8RadioButton,
                                 String editText9, String editText10, boolean a11CheckBox, boolean b11CheckBox) {


        int result = 0;


        if (editText9.equals("int day = 1;")) {

            result += 1;

        }

        if (editText10.equals("String month = \"January\";")) {
            result += 1;
        }

        if (d1RadioButton) {

            result += 1;

        }

        if (c2RadioButton) {

            result += 1;
        }

        if (c3RadioButton) {

            result += 1;

        }

        if (c4RadioButton) {

            result += 1;
        }

        if (c5RadioButton) {

            result += 1;

        }

        if (d6RadioButton) {

            result += 1;
        }

        if (a8RadioButton) {

            result += 1;
        }

        if (a11CheckBox && b11CheckBox) {

            result += 1;

        }

        return result;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        resultTextView.setText(message);
    }

    private String createResultSummery(int result, String name) {

        String resultMessage = getString(R.string.name_text) + name;
        resultMessage += "\n" + getString(R.string.result_name) + result + getString(R.string.result1_name);
        if (result > 5) {
            Toast.makeText(getApplicationContext(),
                   " your Result: "+ result +"/11"+ "\n"+"Congratulations you passed the test",
                    Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(getApplicationContext(),
                    " your Result: "+ result +"/11"+"\n" + "Sorry! Better luck next time.",
                    Toast.LENGTH_SHORT)
                    .show();
        }

        return resultMessage;
    }

    ;

}
