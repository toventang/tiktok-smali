package com.ss.android.ugc.aweme.feed.assem.generalmask;

import com.bytedance.assem.arch.extensions.g;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import h.f.b.l;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final g f92262a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoMaskInfo f92263b;

    static {
        Covode.recordClassIndex(58271);
    }

    public static e a(g gVar, VideoMaskInfo videoMaskInfo) {
        l.d(gVar, "");
        return new e(gVar, videoMaskInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f92262a, eVar.f92262a) && l.a(this.f92263b, eVar.f92263b);
    }

    public final int hashCode() {
        g gVar = this.f92262a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        VideoMaskInfo videoMaskInfo = this.f92263b;
        if (videoMaskInfo != null) {
            i2 = videoMaskInfo.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GeneralVideoMaskState(showGeneralMask=" + this.f92262a + ", generalMaskInfo=" + this.f92263b + ")";
    }

    public /* synthetic */ e() {
        this(new g(false), null);
    }

    private e(g gVar, VideoMaskInfo videoMaskInfo) {
        l.d(gVar, "");
        this.f92262a = gVar;
        this.f92263b = videoMaskInfo;
    }
}
