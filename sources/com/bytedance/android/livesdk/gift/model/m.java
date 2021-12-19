package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class m {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public w f17912a;

    static {
        Covode.recordClassIndex(9970);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17912a != null) {
            sb.append(", data=").append(this.f17912a);
        }
        return sb.replace(0, 2, "GiftSendResponse{").append('}').toString();
    }
}
