package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class y extends a {
    @c(a = "list")

    /* renamed from: a  reason: collision with root package name */
    public x.c f17978a;

    static {
        Covode.recordClassIndex(9986);
    }

    public y() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.WISH_LIST_UPDATE_MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.O == null || this.O.f23218j == null) {
            return false;
        }
        return true;
    }
}
