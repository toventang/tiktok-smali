package com.ss.android.ugc.aweme.commerce.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.a.z;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class e extends c implements Serializable {
    @c(a = "card_url")
    private String cardUrl = "";
    @c(a = "comment_area")
    private String commentArea;
    @c(a = "elastic_images")
    private List<? extends UrlModel> elasticImages = z.INSTANCE;
    @c(a = "elastic_title")
    private String elasticTitle = "";
    @c(a = "jump_to_url")
    private boolean jumpToUrl;
    @c(a = "label")
    private List<String> labels = z.INSTANCE;
    @c(a = "meta_param")
    private String metaParam;
    @c(a = "price")
    private int price;
    @c(a = "product_id")
    private String productId = "";
    @c(a = "promotion_id")
    private String promotionId = "";
    @c(a = "promotion_source")
    private int promotionSource;
    @c(a = "sales")
    private int sales;
    @c(a = "title")
    private String title = "";
    @c(a = "visitor")
    private PromotionVisitor visitor;

    static {
        Covode.recordClassIndex(45218);
    }

    public final String getCardUrl() {
        return this.cardUrl;
    }

    public final String getCommentArea() {
        return this.commentArea;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final boolean getJumpToUrl() {
        return this.jumpToUrl;
    }

    public final List<String> getLabels() {
        return this.labels;
    }

    public final String getMetaParam() {
        return this.metaParam;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final int getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final String getLongTitle() {
        if (!TextUtils.isEmpty(this.title)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public final String getShortTitle() {
        if (TextUtils.isEmpty(this.elasticTitle)) {
            return this.title;
        }
        return this.elasticTitle;
    }

    public final void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public final void setCommentArea(String str) {
        this.commentArea = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticTitle(String str) {
        this.elasticTitle = str;
    }

    public final void setJumpToUrl(boolean z) {
        this.jumpToUrl = z;
    }

    public final void setMetaParam(String str) {
        this.metaParam = str;
    }

    public final void setPrice(int i2) {
        this.price = i2;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(int i2) {
        this.promotionSource = i2;
    }

    public final void setSales(int i2) {
        this.sales = i2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }

    public final void setLabels(List<String> list) {
        l.d(list, "");
        this.labels = list;
    }
}
