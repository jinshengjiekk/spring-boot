package org.test.bookpub.utils;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * Created by JINSHENGJIE on 2016/1/19.
 */
public class IsbnEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Isbn isbn = (Isbn) getValue();
        if (isbn != null) {
            return isbn.getIsbn();
        } else {
            return "";
        }
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            setValue(new Isbn(text.trim()));
        } else {
            setValue(null);
        }
    }
}
