package com.ss.android.ugc.aweme.be;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f68573c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f68574d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f68575e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f68576f;

    static {
        Covode.recordClassIndex(42213);
    }

    public e(String str) {
        this(str, true, false, 12);
    }

    public e(String str, byte b2) {
        this(str, false, false, 14);
    }

    public e(String str, boolean z, boolean z2) {
        this(str, z, z2, 8);
    }

    private static e a(String str, boolean z, boolean z2, Object obj) {
        l.d(str, "");
        return new e(str, z, z2, obj);
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean a() {
        return this.f68574d;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final boolean b() {
        return this.f68575e;
    }

    @Override // com.ss.android.ugc.aweme.be.a
    public final Object c() {
        return this.f68576f;
    }

    public final int hashCode() {
        int i2;
        String str = this.f68573c;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        boolean z = this.f68574d;
        int i5 = 1;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i4 + i6) * 31;
        if (!this.f68575e) {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        Object obj = this.f68576f;
        if (obj != null) {
            i3 = obj.hashCode();
        }
        return i10 + i3;
    }

    public final String toString() {
        return "DividerItem(text=" + this.f68573c + ", divider=" + this.f68574d + ", visibility=" + this.f68575e + ", tag=" + this.f68576f + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.a((Object) this.f68573c, (Object) eVar.f68573c) || this.f68574d != eVar.f68574d || this.f68575e != eVar.f68575e || !l.a(this.f68576f, eVar.f68576f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, boolean z, boolean z2, int i2) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private e(String str, boolean z, boolean z2, Object obj) {
        super(z, z2, obj, null, 8);
        l.d(str, "");
        this.f68573c = str;
        this.f68574d = z;
        this.f68575e = z2;
        this.f68576f = obj;
    }

    public static /* synthetic */ e a(e eVar, String str, boolean z, boolean z2, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            str = eVar.f68573c;
        }
        if ((i2 & 2) != 0) {
            z = eVar.f68574d;
        }
        if ((i2 & 4) != 0) {
            z2 = eVar.f68575e;
        }
        if ((i2 & 8) != 0) {
            obj = eVar.f68576f;
        }
        return a(str, z, z2, obj);
    }
}
