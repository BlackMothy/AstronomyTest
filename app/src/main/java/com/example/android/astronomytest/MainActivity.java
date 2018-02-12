package com.example.android.astronomytest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int rightAnswers = 0;

    // Радио-кнопки
    RadioButton cancer;
    RadioButton chameleon;
    RadioButton lira;
    RadioButton unicorn;
    RadioButton urMajor;

    // Радио-группы
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Привязка радио-кнопок
        cancer = (RadioButton) findViewById(R.id.radio_cancer);
        chameleon = (RadioButton) findViewById(R.id.radio_chameleon);
        lira = (RadioButton) findViewById(R.id.radio_lira);
        unicorn = (RadioButton) findViewById(R.id.radio_unicorn);
        urMajor = (RadioButton) findViewById(R.id.radio_urmaj);

        // Приязка радио-групп
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);

    }

    public void checkAnswers(View view) {

        // Проверка отмечен ли правильный ответ №1
        boolean firstRightAnswer = cancer.isChecked();

        // Проверка отмечен ли правильный ответ №2
        boolean secondRightAnswer = chameleon.isChecked();

        // Проверка отмечен ли правильный ответ №3
        boolean thirdRightAnswer = lira.isChecked();

        // Проверка отмечен ли правильный ответ №4
        boolean forthRightAnswer = unicorn.isChecked();

        // Проверка отмечен ли правильный ответ №5
        boolean fifthRightAnswer = urMajor.isChecked();

        // Подсчёт правильных ответов
        getCountOfRightAnswers(firstRightAnswer, secondRightAnswer, thirdRightAnswer, forthRightAnswer, fifthRightAnswer);

        // Вывод финального сообщения
        Toast results = Toast.makeText(this, getString(R.string.message) + " " + rightAnswers + " " + getString(R.string.of) + " " + 5, Toast.LENGTH_LONG);
        results.show();

        // Сброс счётчика
        rightAnswers = 0;

    }

    // При нажатии "Попробовать ещё"
    public void tryAgain (View view){
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();

        cancer.setTextColor(Color.BLACK);
        chameleon.setTextColor(Color.BLACK);
        lira.setTextColor(Color.BLACK);
        unicorn.setTextColor(Color.BLACK);
        urMajor.setTextColor(Color.BLACK);
    }

    public void getRightAnswers (View view){
        // Очистка текущих ответов
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();

        // Пометка правильных ответов
        cancer.setChecked(true);
        chameleon.setChecked(true);
        lira.setChecked(true);
        unicorn.setChecked(true);
        urMajor.setChecked(true);

        // Окраска правильных ответов
        cancer.setTextColor(Color.YELLOW);
        chameleon.setTextColor(Color.YELLOW);
        lira.setTextColor(Color.YELLOW);
        unicorn.setTextColor(Color.YELLOW);
        urMajor.setTextColor(Color.YELLOW);

    }

    /**
     * Метод увеличения кол-ва баллов в зависимости от правильного или неправильного ответа
     *
     * @param answer1 и т.д. - ответы
     * @return кол-во правильных ответов
     */
    private int getCountOfRightAnswers(boolean answer1, boolean answer2, boolean answer3, boolean answer4, boolean answer5) {
        if (answer1) {
            rightAnswers++;
        }
        if (answer2) {
            rightAnswers++;
        }
        if (answer3) {
            rightAnswers++;
        }
        if (answer4) {
            rightAnswers++;
        }
        if (answer5) {
            rightAnswers++;
        }
        return rightAnswers;
    }

}


