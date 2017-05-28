package com.me.iTextTrial.viewResolver;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.me.iTextTrial.view.PdfView;

import java.util.Locale;

public class PdfViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) throws Exception {
        PdfView view = new PdfView();
        return view;
    }
}
