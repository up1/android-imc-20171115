package cc.somkiat.demo01;

import android.widget.TextView;

interface CalculatorListener {
    void showResult(int result);

    void showError();
}

public class CalculatorController {
    private boolean isAdd = false;

    private CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void process(int no1, int no2) {
        Calculator calculator = new Calculator();
        if(this.isAdd) {
            int result = calculator.add(no1, no2);
            this.listener.showResult(result);
        } else {
            this.listener.showError();
        }
    }

    public void setAdd(boolean flag) {
        this.isAdd = flag;
    }
}
