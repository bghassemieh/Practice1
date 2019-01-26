package cejv669.concordia.com.practice1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button hiButton;
    private TextView txtView;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_layout);

        hiButton = findViewById(R.id.btn_Addd);
        hiButton.setText(R.string.btn_Add);
        hiButton.setTextColor(Color.BLUE);

        txtView = findViewById(R.id.tv_helloWorld);
        txtView.setText("Goodbye!");
        txtView.setTextColor(Color.RED);

    }
}
