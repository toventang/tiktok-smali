package com.ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f83222a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83223b;

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap.Config f83224c;

    static {
        Covode.recordClassIndex(51883);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f83222a == kVar.f83222a && this.f83223b == kVar.f83223b && l.a(this.f83224c, kVar.f83224c);
    }

    public final int hashCode() {
        int i2 = ((this.f83222a * 31) + this.f83223b) * 31;
        Bitmap.Config config = this.f83224c;
        return i2 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return "VideoCoverConfig(displayWidth=" + this.f83222a + ", displayHeight=" + this.f83223b + ", config=" + this.f83224c + ")";
    }

    private /* synthetic */ k() {
        this(0, 0, Bitmap.Config.ARGB_8888);
    }

    public k(int i2, int i3, Bitmap.Config config) {
        l.d(config, "");
        this.f83222a = i2;
        this.f83223b = i3;
        this.f83224c = config;
    }
}
