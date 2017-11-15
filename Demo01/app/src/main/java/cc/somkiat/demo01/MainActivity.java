package cc.somkiat.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isAdd = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalculate(View view) {
        EditText edtNo1 = findViewById(R.id.edt_no_1);
        EditText edtNo2 = findViewById(R.id.edt_no_2);

        IntegerConverter converter = new IntegerConverter();
        int no1 = converter.toInteger(edtNo1.getText().toString());
        int no2 = converter.toInteger(edtNo2.getText().toString());

        Calculator calculator = new Calculator();
        if(isAdd) {
            int result = calculator.add(no1, no2);
            TextView tvResult = findViewById(R.id.tv_result);
            tvResult.setText(String.format("Result = %s", result));
        }
    }

    public void onAdd(View view) {
        this.isAdd = true;
    }
}
