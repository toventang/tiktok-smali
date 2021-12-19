package com.bytedance.ies.bullet.service.popup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.a;
import h.f.b.l;

public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f32855g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f32856a;

    /* renamed from: b  reason: collision with root package name */
    public final h f32857b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32858c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32859d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32860e;

    /* renamed from: f  reason: collision with root package name */
    public final a.b f32861f;

    static {
        Covode.recordClassIndex(19627);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f32856a, eVar.f32856a) && l.a(this.f32857b, eVar.f32857b) && this.f32858c == eVar.f32858c && this.f32859d == eVar.f32859d && this.f32860e == eVar.f32860e && l.a(this.f32861f, eVar.f32861f);
    }

    public final int hashCode() {
        h hVar = this.f32856a;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        h hVar2 = this.f32857b;
        int hashCode2 = (((((((hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31) + this.f32858c) * 31) + this.f32859d) * 31) + this.f32860e) * 31;
        a.b bVar = this.f32861f;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CenterSheetConfig(keyboardOnStyle=" + this.f32856a + ", keyboardOffStyle=" + this.f32857b + ", width=" + this.f32858c + ", height=" + this.f32859d + ", radius=" + this.f32860e + ", cancelableProvider=" + this.f32861f + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19628);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ e() {
        this(new h(), new h(), -1, -2, -1, null);
    }

    public e(h hVar, h hVar2, int i2, int i3, int i4, a.b bVar) {
        l.c(hVar, "");
        l.c(hVar2, "");
        this.f32856a = hVar;
        this.f32857b = hVar2;
        this.f32858c = i2;
        this.f32859d = i3;
        this.f32860e = i4;
        this.f32861f = bVar;
    }
}
