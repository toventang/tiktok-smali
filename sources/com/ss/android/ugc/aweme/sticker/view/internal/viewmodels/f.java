package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g.c;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class f<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final DATA f136649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f136650b;

    /* renamed from: c  reason: collision with root package name */
    public final int f136651c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f136652d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f136653e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f136654f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f136655g;

    /* renamed from: h  reason: collision with root package name */
    public final c.b f136656h;

    /* renamed from: i  reason: collision with root package name */
    public final a<z> f136657i;

    /* renamed from: j  reason: collision with root package name */
    public final a<z> f136658j;

    static {
        Covode.recordClassIndex(89247);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f136649a, fVar.f136649a) && this.f136650b == fVar.f136650b && this.f136651c == fVar.f136651c && this.f136652d == fVar.f136652d && this.f136653e == fVar.f136653e && this.f136654f == fVar.f136654f && l.a(this.f136655g, fVar.f136655g) && l.a(this.f136656h, fVar.f136656h) && l.a(this.f136657i, fVar.f136657i) && l.a(this.f136658j, fVar.f136658j);
    }

    public final int hashCode() {
        DATA data = this.f136649a;
        int i2 = 0;
        int hashCode = (((((data != null ? data.hashCode() : 0) * 31) + this.f136650b) * 31) + this.f136651c) * 31;
        boolean z = this.f136652d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.f136653e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f136654f) {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        Bundle bundle = this.f136655g;
        int hashCode2 = (i12 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        c.b bVar = this.f136656h;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a<z> aVar = this.f136657i;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<z> aVar2 = this.f136658j;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "StickerSelectRequest(effect=" + ((Object) this.f136649a) + ", adapterPosition=" + this.f136650b + ", categoryPosition=" + this.f136651c + ", supportCancel=" + this.f136652d + ", isChildEffect=" + this.f136653e + ", autoDownloadNext=" + this.f136654f + ", extraData=" + this.f136655g + ", onUpdate=" + this.f136656h + ", doOnCancel=" + this.f136657i + ", doOnSelected=" + this.f136658j + ")";
    }

    private f(DATA data, int i2, int i3, boolean z, boolean z2, boolean z3, Bundle bundle, c.b bVar, a<z> aVar) {
        this.f136649a = data;
        this.f136650b = i2;
        this.f136651c = i3;
        this.f136652d = z;
        this.f136653e = z2;
        this.f136654f = z3;
        this.f136655g = bundle;
        this.f136656h = bVar;
        this.f136657i = aVar;
        this.f136658j = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i2, int i3, boolean z, boolean z2, boolean z3, Bundle bundle, c.b bVar, a aVar, int i4) {
        this(obj, i2, i3, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? null : bundle, (i4 & 128) != 0 ? null : bVar, (i4 & 256) == 0 ? aVar : null);
    }
}
