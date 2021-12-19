package com.ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.main.g;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f135105a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f135106b;

    /* renamed from: c  reason: collision with root package name */
    public b<? super View, z> f135107c;

    /* renamed from: d  reason: collision with root package name */
    public b<? super Boolean, Boolean> f135108d;

    /* renamed from: e  reason: collision with root package name */
    public int f135109e;

    /* renamed from: f  reason: collision with root package name */
    public b<? super g.a, z> f135110f;

    static {
        Covode.recordClassIndex(88328);
    }

    public e() {
        this(false, null, null, 0, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f135105a == eVar.f135105a && this.f135106b == eVar.f135106b && l.a(this.f135107c, eVar.f135107c) && l.a(this.f135108d, eVar.f135108d) && this.f135109e == eVar.f135109e && l.a(this.f135110f, eVar.f135110f);
    }

    public final int hashCode() {
        int i2 = this.f135105a * 31;
        boolean z = this.f135106b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        b<? super View, z> bVar = this.f135107c;
        int i7 = 0;
        int hashCode = (i6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b<? super Boolean, Boolean> bVar2 = this.f135108d;
        int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f135109e) * 31;
        b<? super g.a, z> bVar3 = this.f135110f;
        if (bVar3 != null) {
            i7 = bVar3.hashCode();
        }
        return hashCode2 + i7;
    }

    public final String toString() {
        return "ReverseCameraConfigure(topMargin=" + this.f135105a + ", usingTextInToolBar=" + this.f135106b + ", onSwitchCamera=" + this.f135107c + ", interceptCameraReverse=" + this.f135108d + ", cameraIconResId=" + this.f135109e + ", viewConfigureBuilder=" + this.f135110f + ")";
    }

    private e(boolean z, b<? super View, z> bVar, b<? super Boolean, Boolean> bVar2, int i2, b<? super g.a, z> bVar3) {
        this.f135105a = 0;
        this.f135106b = z;
        this.f135107c = bVar;
        this.f135108d = bVar2;
        this.f135109e = i2;
        this.f135110f = bVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, b bVar, b bVar2, int i2, b bVar3, int i3) {
        this((i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? null : bVar, (i3 & 8) != 0 ? null : bVar2, (i3 & 16) != 0 ? 2131232565 : i2, (i3 & 32) == 0 ? bVar3 : null);
    }
}
