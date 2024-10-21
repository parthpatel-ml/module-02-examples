package com.spring.professional.exam.tutorial.module02.question02;

import com.spring.professional.exam.tutorial.module02.question02.bls.AlternativeCurrenciesRepository;
import com.spring.professional.exam.tutorial.module02.question02.bls.CurrenciesRepository;
import com.spring.professional.exam.tutorial.module02.question02.bls.CurrencyService;
import com.spring.professional.exam.tutorial.module02.question02.ds.CurrencyId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;

public class Runner {
    private static final String SEPARATOR = "=========================================================================";

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        out.println("context.getBean(CurrencyService.class)");
        CurrencyService currencyService = context.getBean(CurrencyService.class);
        out.println(SEPARATOR);
        out.println("context.getBean(CurrenciesRepository.class)");
        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        out.println(SEPARATOR);
        out.println("context.getBean(AlternativeCurrenciesRepository.class)");
        AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);
        out.println(SEPARATOR);
        out.println("currencyService.getExchangeRate(\"EUR\", \"USD\")");
        currencyService.getExchangeRate("EUR", "USD");
        out.println(SEPARATOR);
        out.println("currencyService.getExchangeRate(\"EUR\", \"USD\", 100)");
        currencyService.getExchangeRate("EUR", "USD", 100);
        out.println(SEPARATOR);
        out.println("currencyService.getCurrencyLongName(CurrencyId.EUR)");
        currencyService.getCurrencyLongName(CurrencyId.EUR);
        try {
            out.println("Inside TRY BLOCK " + SEPARATOR);
            out.println("currencyService.getCurrencyCountryName(CurrencyId.EUR)");
            currencyService.getCurrencyCountryName(CurrencyId.EUR);
        } catch (Exception e) {
            // ignored on purpose
        }
        out.println("Inside TRY BLOCK " + SEPARATOR);
        out.println("urrencyService.getCurrencyCountryName(CurrencyId.USD)");
        currencyService.getCurrencyCountryName(CurrencyId.USD);
        out.println("Inside TRY BLOCK " + SEPARATOR);
        out.println("currenciesRepository.getCurrenciesCount()");
        currenciesRepository.getCurrenciesCount();
        out.println("Inside TRY BLOCK " + SEPARATOR);
        out.println("alternativeCurrenciesRepository.getCurrenciesCount()");
        alternativeCurrenciesRepository.getCurrenciesCount();
    }
}
