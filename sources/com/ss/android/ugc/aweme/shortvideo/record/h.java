package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f130109a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Boolean> f130110b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f130111c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f130112d;

    static {
        Covode.recordClassIndex(85363);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f130109a == hVar.f130109a && l.a(this.f130110b, hVar.f130110b) && this.f130111c == hVar.f130111c && this.f130112d == hVar.f130112d;
    }

    public final int hashCode() {
        boolean z = this.f130109a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        a<Boolean> aVar = this.f130110b;
        int hashCode = (i6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z2 = this.f130111c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode + i7) * 31;
        if (!this.f130112d) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "CameraDegradationConfig(enableRemoveCameraOpened=" + this.f130109a + ", forbidOpenCameraInBackground=" + this.f130110b + ", enableAudioCapture=" + this.f130111c + ", optimizeAntiShake=" + this.f130112d + ")";
    }

    public /* synthetic */ h() {
        this(false, AnonymousClass1.f130113a, false, false);
    }

    public static /* synthetic */ h a(h hVar, a aVar) {
        boolean z = hVar.f130112d;
        l.d(aVar, "");
        return new h(true, aVar, true, z);
    }

    private h(boolean z, a<Boolean> aVar, boolean z2, boolean z3) {
        l.d(aVar, "");
        this.f130109a = z;
        this.f130110b = aVar;
        this.f130111c = z2;
        this.f130112d = z3;
    }
}
