package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LoginGuideConfig {
    @c(a = "from_comment")
    private String fromComment;
    @c(a = "from_default")
    private String fromDefault;
    @c(a = "from_favorite")
    private String fromFavorite;
    @c(a = "from_follow")
    private String fromFollow;
    @c(a = "from_home_upper_right")
    private String fromHomeUpperRight;
    @c(a = "image_url_from_comment")
    private String imageUrlFromComment;
    @c(a = "image_url_from_default")
    private String imageUrlFromDefault;
    @c(a = "image_url_from_favorite")
    private String imageUrlFromFavorite;
    @c(a = "image_url_from_follow")
    private String imageUrlFromFollow;
    @c(a = "image_url_from_home_upper_right")
    private String imageUrlFromHomeUpperRight;

    static {
        Covode.recordClassIndex(11283);
    }

    public String getFromComment() {
        return this.fromComment;
    }

    public String getFromDefault() {
        return this.fromDefault;
    }

    public String getFromFavorite() {
        return this.fromFavorite;
    }

    public String getFromFollow() {
        return this.fromFollow;
    }

    public String getFromHomeUpperRight() {
        return this.fromHomeUpperRight;
    }

    public String getImageUrlFromComment() {
        return this.imageUrlFromComment;
    }

    public String getImageUrlFromDefault() {
        return this.imageUrlFromDefault;
    }

    public String getImageUrlFromFavorite() {
        return this.imageUrlFromFavorite;
    }

    public String getImageUrlFromFollow() {
        return this.imageUrlFromFollow;
    }

    public String getImageUrlFromHomeUpperRight() {
        return this.imageUrlFromHomeUpperRight;
    }

    public void setFromComment(String str) {
        this.fromComment = str;
    }

    public void setFromDefault(String str) {
        this.fromDefault = str;
    }

    public void setFromFavorite(String str) {
        this.fromFavorite = str;
    }

    public void setFromFollow(String str) {
        this.fromFollow = str;
    }

    public void setFromHomeUpperRight(String str) {
        this.fromHomeUpperRight = str;
    }

    public void setImageUrlFromComment(String str) {
        this.imageUrlFromComment = str;
    }

    public void setImageUrlFromDefault(String str) {
        this.imageUrlFromDefault = str;
    }

    public void setImageUrlFromFavorite(String str) {
        this.imageUrlFromFavorite = str;
    }

    public void setImageUrlFromFollow(String str) {
        this.imageUrlFromFollow = str;
    }

    public void setImageUrlFromHomeUpperRight(String str) {
        this.imageUrlFromHomeUpperRight = str;
    }
}
