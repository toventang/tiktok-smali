package com.bytedance.ies.bullet.service.popup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.a;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32830a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32831b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32832c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32833d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32834e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32835f;

    /* renamed from: g  reason: collision with root package name */
    public final a.b f32836g;

    static {
        Covode.recordClassIndex(19620);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32830a == cVar.f32830a && this.f32831b == cVar.f32831b && this.f32832c == cVar.f32832c && this.f32833d == cVar.f32833d && this.f32834e == cVar.f32834e && this.f32835f == cVar.f32835f && l.a(this.f32836g, cVar.f32836g);
    }

    public final int hashCode() {
        boolean z = this.f32830a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((((((((((i2 * 31) + this.f32831b) * 31) + this.f32832c) * 31) + this.f32833d) * 31) + this.f32834e) * 31) + this.f32835f) * 31;
        a.b bVar = this.f32836g;
        return i5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "BottomUpConfig(rightIn=" + this.f32830a + ", worldHeight=" + this.f32831b + ", worldWidth=" + this.f32832c + ", peekWidth=" + this.f32833d + ", peekHeight=" + this.f32834e + ", radius=" + this.f32835f + ", cancelableProvider=" + this.f32836g + ")";
    }

    public /* synthetic */ c() {
        this(false, 0, 0, 0, 0, -1, null);
    }

    public c(boolean z, int i2, int i3, int i4, int i5, int i6, a.b bVar) {
        this.f32830a = z;
        this.f32831b = i2;
        this.f32832c = i3;
        this.f32833d = i4;
        this.f32834e = i5;
        this.f32835f = i6;
        this.f32836g = bVar;
    }
}
