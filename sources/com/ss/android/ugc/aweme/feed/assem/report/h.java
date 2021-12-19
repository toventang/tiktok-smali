package com.ss.android.ugc.aweme.feed.assem.report;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import h.f.b.l;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f92415a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoMaskInfo f92416b;

    static {
        Covode.recordClassIndex(58487);
    }

    public static h a(boolean z, VideoMaskInfo videoMaskInfo) {
        return new h(z, videoMaskInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f92415a == hVar.f92415a && l.a(this.f92416b, hVar.f92416b);
    }

    public final int hashCode() {
        boolean z = this.f92415a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        VideoMaskInfo videoMaskInfo = this.f92416b;
        return i5 + (videoMaskInfo != null ? videoMaskInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ReportVideoState(showReport=" + this.f92415a + ", maskInfo=" + this.f92416b + ")";
    }

    public /* synthetic */ h() {
        this(false, null);
    }

    private h(boolean z, VideoMaskInfo videoMaskInfo) {
        this.f92415a = z;
        this.f92416b = videoMaskInfo;
    }
}
