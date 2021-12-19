package com.ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class d implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static String MODE_CREATE = "1";
    public static String MODE_EDIT = "4";
    public static String MODE_POST = "2";
    public static String MODE_SEND = "3";
    public static String MOD_ORDER_ID = "order_id";
    public static String MOD_REVIEWED = "reviewed";
    public static String shootWay = "shoutouts";
    @c(a = "buyer_payment")
    private a buyerMoneyDes;
    @c(a = "so_coins")
    private int coins;
    @c(a = "img")
    private String coverUrl;
    @c(a = "des")
    private String desc;
    @c(a = "music_id")
    private String musicId;
    @c(a = "so_order_id")
    private String orderId;
    @c(a = "post_video_path")
    private String postVideoPath;
    @c(a = "price")
    private g price;
    @c(a = "so_product_id")
    private String productId;
    @c(a = "reviewed")
    private int reviewed;
    @c(a = "shoutouts_mode")
    private String shoutOutsMode;

    public static final class a {
        static {
            Covode.recordClassIndex(87083);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final a getBuyerMoneyDes() {
        return this.buyerMoneyDes;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPostVideoPath() {
        return this.postVideoPath;
    }

    public final g getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getReviewed() {
        return this.reviewed;
    }

    public final String getShoutOutsMode() {
        return this.shoutOutsMode;
    }

    static {
        Covode.recordClassIndex(87082);
    }

    public final void setBuyerMoneyDes(a aVar) {
        this.buyerMoneyDes = aVar;
    }

    public final void setCoins(int i2) {
        this.coins = i2;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setPostVideoPath(String str) {
        this.postVideoPath = str;
    }

    public final void setPrice(g gVar) {
        this.price = gVar;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setReviewed(int i2) {
        this.reviewed = i2;
    }

    public final void setShoutOutsMode(String str) {
        this.shoutOutsMode = str;
    }
}
