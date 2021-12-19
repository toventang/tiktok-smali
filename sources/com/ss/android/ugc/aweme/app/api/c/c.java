package com.ss.android.ugc.aweme.app.api.c;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.app.api.d;
import f.a.d.g;

public class c<P extends Message, J> implements e, d {

    /* renamed from: a  reason: collision with root package name */
    final J f66603a;

    /* renamed from: b  reason: collision with root package name */
    final P f66604b;
    @com.google.gson.a.c(a = "rid")

    /* renamed from: c  reason: collision with root package name */
    String f66605c;

    /* renamed from: d  reason: collision with root package name */
    private transient Long f66606d;

    static {
        Covode.recordClassIndex(40947);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.f66605c;
    }

    @Override // com.ss.android.ugc.aweme.app.api.c.e
    public void setNetworkInfoKey(Long l2) {
        this.f66606d = l2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.f66605c = str;
    }

    public final J a(g<P, J> gVar) {
        J j2 = this.f66603a;
        if (j2 == null) {
            j2 = gVar.apply(this.f66604b);
        }
        if (j2 instanceof d) {
            j2.setRequestId(this.f66605c);
        }
        if (j2 instanceof e) {
            j2.setNetworkInfoKey(this.f66606d);
        }
        return j2;
    }

    c(J j2, P p) {
        if (j2 == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.f66603a = j2;
        this.f66604b = p;
    }
}
