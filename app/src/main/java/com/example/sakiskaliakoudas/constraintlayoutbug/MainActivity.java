package com.example.sakiskaliakoudas.constraintlayoutbug;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_input_layout_extra_field) TextInputLayout secondTextInputLayout;
    @BindView(R.id.text_input_layout_previous_names) TextInputLayout firstTextInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnCheckedChanged(R.id.switch_1)
    public void firstSwitchClicked(boolean enabled) {
        if (enabled) {
            firstTextInputLayout.setVisibility(View.VISIBLE);
        } else {
            firstTextInputLayout.setVisibility(View.GONE);
        }
    }

    @OnCheckedChanged(R.id.switch_2)
    public void secondSwitchClicked(boolean enabled) {
        if (enabled) {
            secondTextInputLayout.setVisibility(View.VISIBLE);
        } else {
            secondTextInputLayout.setVisibility(View.GONE);
        }
    }

}
