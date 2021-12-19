package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class VideoTag implements Serializable {
    @c(a = "background_color")
    private String backgroundColor;
    @c(a = "en_title")
    private String englishTitle;
    @c(a = "font_color")
    private String fontColor;
    @c(a = "url")
    private UrlModel iconUrl;
    @c(a = "id")
    private int id;
    @c(a = "opacity")
    private int opacity;
    @c(a = "left_right_padding")
    private int padding = 4;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(50985);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getEnglishTitle() {
        return this.englishTitle;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOpacity() {
        return this.opacity;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setEnglishTitle(String str) {
        this.englishTitle = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(int i2) {
        this.id = i2;
    }

    public final void setOpacity(int i2) {
        this.opacity = i2;
    }

    public final void setPadding(int i2) {
        this.padding = i2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
