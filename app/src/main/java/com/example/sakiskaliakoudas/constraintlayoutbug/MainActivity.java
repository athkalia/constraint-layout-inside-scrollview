package com.example.sakiskaliakoudas.constraintlayoutbug;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_input_layout_extra_field) TextInputLayout textInputLayoutArmedForcesEnlistingDate;
    @BindView(R.id.text_input_layout_previous_names) TextInputLayout textInputLayoutPreviousPracticeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged(R.id.switch_1)
    public void registeredWithPracticeInUkClicked(boolean enabled) {
        if (enabled) {
            textInputLayoutPreviousPracticeName.setVisibility(View.VISIBLE);
        } else {
            textInputLayoutPreviousPracticeName.setVisibility(View.GONE);
        }
    }

    @OnCheckedChanged(R.id.switch_2)
    public void returningFromTheArmedForcesClicked(boolean enabled) {
        if (enabled) {
            textInputLayoutArmedForcesEnlistingDate.setVisibility(View.VISIBLE);
        } else {
            textInputLayoutArmedForcesEnlistingDate.setVisibility(View.GONE);
        }
    }

}
