package com.week6.viewmodelv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private QuoteViewModel quoteViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteViewModel = new ViewModelProvider(this).get(QuoteViewModel.class);
        Button loadButton = findViewById(R.id.button_load);
        TextView textView = findViewById(R.id.textView);

        quoteViewModel.getQuoteData().observe(this, quote->
        {
            textView.setText(quote);
        });

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              quoteViewModel.fetchQuote();
                //textView.setText("Be Youself!");
            }
        });



    }
}