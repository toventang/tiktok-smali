package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public int f112023a;

    /* renamed from: b  reason: collision with root package name */
    public int f112024b;

    /* renamed from: c  reason: collision with root package name */
    public Effect f112025c;

    /* renamed from: d  reason: collision with root package name */
    public long f112026d;

    static {
        Covode.recordClassIndex(71994);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f112023a == pVar.f112023a && this.f112024b == pVar.f112024b && l.a(this.f112025c, pVar.f112025c) && this.f112026d == pVar.f112026d;
    }

    public final int hashCode() {
        int i2 = ((this.f112023a * 31) + this.f112024b) * 31;
        Effect effect = this.f112025c;
        int hashCode = effect != null ? effect.hashCode() : 0;
        long j2 = this.f112026d;
        return ((i2 + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "MusicAndEffectProgress(type=" + this.f112023a + ", progress=" + this.f112024b + ", effect=" + this.f112025c + ", effectTotalSize=" + this.f112026d + ")";
    }

    public p(int i2, int i3, Effect effect, long j2) {
        this.f112023a = i2;
        this.f112024b = i3;
        this.f112025c = effect;
        this.f112026d = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, int i3, Effect effect, int i4) {
        this(i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? null : effect, 0L);
    }
}
