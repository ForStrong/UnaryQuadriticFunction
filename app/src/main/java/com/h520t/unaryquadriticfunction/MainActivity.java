package com.h520t.unaryquadriticfunction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText aEt, bEt, cEt;
    private Button getDataSet;
    private TextView dataSetTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getDataSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(aEt.getText().toString());
                int b = Integer.parseInt(bEt.getText().toString());
                int c = Integer.parseInt(cEt.getText().toString());
                UQFBean uqfBean = new UQFBean(a, b, c);
                final String dataSet = uqfBean.getDataSet();
                dataSetTv.setText(dataSet);
            }
        });
    }

    private void initView() {
        aEt = findViewById(R.id.et_param_a);
        bEt = findViewById(R.id.et_param_b);
        cEt = findViewById(R.id.et_param_c);

        getDataSet = findViewById(R.id.bt_get_data_set);
        dataSetTv = findViewById(R.id.tv_data_set);
    }
}
