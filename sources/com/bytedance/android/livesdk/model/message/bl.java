package com.bytedance.android.livesdk.model.message;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class bl extends a {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public bj f19340a;

    static {
        Covode.recordClassIndex(11482);
    }

    public bl() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.QUESTION;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        bj bjVar = this.f19340a;
        if (bjVar == null || bjVar.f19336e == null || TextUtils.isEmpty(this.f19340a.f19333b)) {
            return false;
        }
        return true;
    }
}
