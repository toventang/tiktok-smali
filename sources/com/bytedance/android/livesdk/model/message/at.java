package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class at extends a {
    @c(a = "content")

    /* renamed from: a  reason: collision with root package name */
    public String f19206a;

    /* renamed from: f  reason: collision with root package name */
    private as f19207f;

    static {
        Covode.recordClassIndex(11414);
    }

    public at() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_SIGNAL;
    }

    public final as c() {
        as asVar = this.f19207f;
        if (asVar != null) {
            return asVar;
        }
        try {
            as asVar2 = (as) e.a.f9628b.a(this.f19206a.replaceAll("\\\\", ""), as.class);
            this.f19207f = asVar2;
            return asVar2;
        } catch (Exception unused) {
            return null;
        }
    }
}
