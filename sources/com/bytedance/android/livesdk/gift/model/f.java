package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f17879a = 0;
    @c(a = "combo_count")

    /* renamed from: b  reason: collision with root package name */
    public Integer f17880b;
    @c(a = "combo_effect_img")

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f17881c;

    static {
        Covode.recordClassIndex(9962);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17880b != null) {
            sb.append(", combo_count=").append(this.f17880b);
        }
        if (this.f17881c != null) {
            sb.append(", combo_effect_img=").append(this.f17881c);
        }
        return sb.replace(0, 2, "GiftComboInfo{").append('}').toString();
    }
}
