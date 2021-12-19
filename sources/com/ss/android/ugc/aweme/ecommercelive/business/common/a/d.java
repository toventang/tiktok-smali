package com.ss.android.ugc.aweme.ecommercelive.business.common.a;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;

public class d extends a {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public String f87963a;
    @c(a = "price")

    /* renamed from: f  reason: collision with root package name */
    public String f87964f;
    @c(a = "image_url")

    /* renamed from: g  reason: collision with root package name */
    public String f87965g;
    @c(a = "open_url")

    /* renamed from: h  reason: collision with root package name */
    public String f87966h;
    @c(a = "product_type")

    /* renamed from: i  reason: collision with root package name */
    public String f87967i;
    @c(a = "product_id")

    /* renamed from: j  reason: collision with root package name */
    public long f87968j;
    @c(a = "source")

    /* renamed from: k  reason: collision with root package name */
    public String f87969k;
    @c(a = "source_from")

    /* renamed from: l  reason: collision with root package name */
    public int f87970l;
    @c(a = "schema")

    /* renamed from: m  reason: collision with root package name */
    public String f87971m;
    @c(a = "platform")
    public int n;
    @c(a = "product_status")
    public int o;
    @c(a = "promotion_view")
    public PromotionView p;
    public boolean q = true;

    static {
        Covode.recordClassIndex(55303);
    }

    public String toString() {
        return "PopProduct{title='" + this.f87963a + '\'' + ", price='" + this.f87964f + '\'' + ", imageUrl='" + this.f87965g + '\'' + ", openUrl='" + this.f87966h + '\'' + ", productType='" + this.f87967i + '\'' + ", productId=" + this.f87968j + ", source='" + this.f87969k + '\'' + ", sourceFrom=" + this.f87970l + ", schema='" + this.f87971m + '\'' + ", platform=" + this.n + ", productStatus=" + this.o + '}';
    }
}
