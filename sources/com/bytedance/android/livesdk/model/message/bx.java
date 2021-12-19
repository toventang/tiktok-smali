package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class bx extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19385a;

    static {
        Covode.recordClassIndex(11495);
    }

    public bx() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.ROOM;
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
        if (!TextUtils.isEmpty(this.f19385a)) {
            return true;
        }
        return false;
    }
}
