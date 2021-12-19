package com.ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "text")
    private String bodyText;
    @c(a = "button_text")
    private String buttonText;
    @c(a = "landing_page_schema")
    private String landingPageSchema;
    @c(a = "message_id")
    private String messageId;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(45184);
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getLandingPageSchema() {
        return this.landingPageSchema;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBodyText(String str) {
        this.bodyText = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setLandingPageSchema(String str) {
        this.landingPageSchema = str;
    }

    public final void setMessageId(String str) {
        this.messageId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
