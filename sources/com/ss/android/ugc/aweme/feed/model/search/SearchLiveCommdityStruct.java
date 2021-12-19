package com.ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class SearchLiveCommdityStruct implements Serializable {
    @c(a = "cover")
    private String cover;
    @c(a = "height")
    private int height;
    @c(a = "price")
    private String price = "";
    @c(a = "product_id")
    private String productId;
    @c(a = "promotion_id")
    private String promotionId;
    @c(a = "scheme")
    private String scheme;
    @c(a = "source")
    private String source;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(59523);
    }

    public final String getCover() {
        return this.cover;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setPrice(String str) {
        l.d(str, "");
        this.price = str;
    }
}
