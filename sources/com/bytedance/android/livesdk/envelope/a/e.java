package com.bytedance.android.livesdk.envelope.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = "envelope_infos")

    /* renamed from: a  reason: collision with root package name */
    public List<a> f17151a;

    static {
        Covode.recordClassIndex(9513);
    }

    public e(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f17151a, ((e) obj).f17151a);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.f17151a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RedEnvelopeListResponse(envelopList=" + this.f17151a + ")";
    }

    private e() {
        this.f17151a = null;
    }

    private /* synthetic */ e(byte b2) {
        this();
    }
}
