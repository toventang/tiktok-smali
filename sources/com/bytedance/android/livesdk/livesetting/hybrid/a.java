package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "widget_width")

    /* renamed from: a  reason: collision with root package name */
    public final int f18714a = 150;
    @c(a = "widget_height")

    /* renamed from: b  reason: collision with root package name */
    public final int f18715b = 40;
    @c(a = "widget_top_margin")

    /* renamed from: c  reason: collision with root package name */
    public final int f18716c = 8;
    @c(a = "widget_start_margin")

    /* renamed from: d  reason: collision with root package name */
    public final int f18717d = 12;
    @c(a = "widget_end_margin")

    /* renamed from: e  reason: collision with root package name */
    public final int f18718e = 12;
    @c(a = "item_width")

    /* renamed from: f  reason: collision with root package name */
    public final int f18719f = 40;
    @c(a = "item_height")

    /* renamed from: g  reason: collision with root package name */
    public final int f18720g = 40;
    @c(a = "item_spacing")

    /* renamed from: h  reason: collision with root package name */
    public final int f18721h = 4;
    @c(a = "preview_width")

    /* renamed from: i  reason: collision with root package name */
    public final int f18722i = 70;
    @c(a = "preview_height")

    /* renamed from: j  reason: collision with root package name */
    public final int f18723j = 70;
    @c(a = "preview_top_margin")

    /* renamed from: k  reason: collision with root package name */
    public final int f18724k = 15;
    @c(a = "preview_start_margin")

    /* renamed from: l  reason: collision with root package name */
    public final int f18725l = 15;

    static {
        Covode.recordClassIndex(10714);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18714a == aVar.f18714a && this.f18715b == aVar.f18715b && this.f18716c == aVar.f18716c && this.f18717d == aVar.f18717d && this.f18718e == aVar.f18718e && this.f18719f == aVar.f18719f && this.f18720g == aVar.f18720g && this.f18721h == aVar.f18721h && this.f18722i == aVar.f18722i && this.f18723j == aVar.f18723j && this.f18724k == aVar.f18724k && this.f18725l == aVar.f18725l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.f18714a * 31) + this.f18715b) * 31) + this.f18716c) * 31) + this.f18717d) * 31) + this.f18718e) * 31) + this.f18719f) * 31) + this.f18720g) * 31) + this.f18721h) * 31) + this.f18722i) * 31) + this.f18723j) * 31) + this.f18724k) * 31) + this.f18725l;
    }

    public final String toString() {
        return "LynxCardWidget(widgetWidth=" + this.f18714a + ", widgetHeight=" + this.f18715b + ", widgetTopMargin=" + this.f18716c + ", widgetStartMargin=" + this.f18717d + ", widgetEndMargin=" + this.f18718e + ", itemWidth=" + this.f18719f + ", itemHeight=" + this.f18720g + ", itemSpacing=" + this.f18721h + ", previewWidth=" + this.f18722i + ", previewHeight=" + this.f18723j + ", previewTopMargin=" + this.f18724k + ", previewStartMargin=" + this.f18725l + ")";
    }
}
