package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final b f39459a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39460b;

    static {
        Covode.recordClassIndex(24267);
    }

    public o() {
        this(false, 3, (byte) 0);
    }

    public int hashCode() {
        return (this.f39459a.hashCode() * 31) + this.f39460b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!(!l.a(this.f39459a, oVar.f39459a)) && this.f39460b == oVar.f39460b) {
            return true;
        }
        return false;
    }

    public o(boolean z, int i2) {
        this.f39460b = i2;
        this.f39459a = new b(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(boolean z, int i2, byte b2) {
        this((i2 & 1) != 0 ? true : z, 0);
    }
}
