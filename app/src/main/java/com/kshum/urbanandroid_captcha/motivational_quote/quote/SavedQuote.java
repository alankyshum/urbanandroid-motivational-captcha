package com.kshum.urbanandroid_captcha.motivational_quote.quote;

public class SavedQuote implements BaseQuote {
    private String savedQuoteLocation;

    public SavedQuote(String savedQuoteLocation) {
        this.savedQuoteLocation = savedQuoteLocation;
    }

    @Override
    public String getSourceName() { return "Saved Quotes"; }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String displayText() {
        return null;
    }

    @Override
    public BaseQuote loadQuote() {
        return null;
    }
}
