package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "score_location")

    /* renamed from: a  reason: collision with root package name */
    public int f20643a;
    @c(a = "threshold_config")

    /* renamed from: b  reason: collision with root package name */
    public h f20644b;
    @c(a = "exempt_config")

    /* renamed from: c  reason: collision with root package name */
    public a f20645c;

    static {
        Covode.recordClassIndex(12198);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f20643a == eVar.f20643a && l.a(this.f20644b, eVar.f20644b) && l.a(this.f20645c, eVar.f20645c);
    }

    public final int hashCode() {
        int i2 = this.f20643a * 31;
        h hVar = this.f20644b;
        int i3 = 0;
        int hashCode = (i2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        a aVar = this.f20645c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ScoreDisplayConfig(scoreLocation=" + this.f20643a + ", thresholdConfig=" + this.f20644b + ", exemptConfig=" + this.f20645c + ")";
    }

    private /* synthetic */ e() {
        this(g.UNKNOWN.getValue());
    }

    private e(int i2) {
        this.f20643a = i2;
        this.f20644b = null;
        this.f20645c = null;
    }
}
