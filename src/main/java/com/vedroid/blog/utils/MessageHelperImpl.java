package com.vedroid.blog.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageHelperImpl implements MessageHelper {

    private static final Logger log = LoggerFactory.getLogger(MessageHelperImpl.class);

//    @Value("${locale.code}")
//    private String localePropertyCode;

    @Autowired
    private AbstractMessageSource messageSource;

    private Locale defaultLocale = Locale.forLanguageTag("en");

//    public MessageHelperImpl() {
//        defaultLocale = Locale.forLanguageTag(localePropertyCode);
//    }

    public AbstractMessageSource getMessageSource() {
        return messageSource;
    }

    @Override
    public String getMessage(String code, Object... params) {
        try {
            return messageSource.getMessage(code, params, defaultLocale);
        } catch (NoSuchMessageException e) {
            log.error(e.getMessage(), e);
        }
        return messageSource.getMessage("Common.message.NotFound", new Object[]{code}, Locale.US);
    }

}
