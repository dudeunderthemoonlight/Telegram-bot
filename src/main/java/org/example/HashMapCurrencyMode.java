package org.example;

import org.example.Currency;
import org.example.CurrencyMode;
import java.util.HashMap;
import java.util.Map;

public class HashMapCurrencyMode implements CurrencyMode {
    private final Map<Long, Currency> originalCurrency = new HashMap<>();
    private final Map<Long, Currency> targetCurrency = new HashMap<>();

    public HashMapCurrencyMode() {
        System.out.println("HASHMAP MODE is created");
    }

    @Override
    public Currency getOriginalCurrency(long chatId) {
        return originalCurrency.getOrDefault(chatId, Currency.USD);
    }

    @Override
    public Currency getTargetCurrency(long chatId) {
        return targetCurrency.getOrDefault(chatId, Currency.USD);
    }

    @Override
    public void setOriginalCurrency(long chatId, Currency currency) {
        originalCurrency.put(chatId, currency);
    }

    @Override
    public void setTargetCurrency(long chatId, Currency currency) {
        targetCurrency.put(chatId, currency);
    }
}