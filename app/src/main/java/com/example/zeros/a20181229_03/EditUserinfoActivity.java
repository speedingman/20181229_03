package com.example.zeros.a20181229_03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditUserinfoActivity extends BaseActivity {



    private android.widget.EditText nameEdt;
    private android.widget.Button iBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_userinfo);

        setupEvents();
        setValues();
        bindViews();
    }

    @Override
    public void setupEvents() {
        iBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("이름",nameEdt.getText().toString());
                setResult(RESULT_OK,intent);

                finish();


            }
        });


    }


    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.iBtn = (Button) findViewById(R.id.iBtn);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);

    }
}
