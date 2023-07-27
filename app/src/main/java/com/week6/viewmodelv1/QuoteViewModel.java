package com.week6.viewmodelv1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuoteViewModel extends ViewModel {
    private MutableLiveData<String> quotes = new MutableLiveData<>();

    public LiveData<String> getQuoteData()
    {
        return quotes;
    }

    public void fetchQuote()
    {
        String quote = "Be Yourself!!";
        quotes.setValue(quote);
    }

}
