package com.ss.android.ugc.aweme.video.preload.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class d {
    @c(a = "enable_preload")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f143601a;
    @c(a = "preload_when_download_complete")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f143602b;
    @c(a = "preload_when_preload_next_video_done")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f143603c;
    @c(a = "preload_cover_cnt")

    /* renamed from: d  reason: collision with root package name */
    public final int f143604d;

    static {
        Covode.recordClassIndex(93944);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f143601a == dVar.f143601a && this.f143602b == dVar.f143602b && this.f143603c == dVar.f143603c && this.f143604d == dVar.f143604d;
    }

    public final int hashCode() {
        boolean z = this.f143601a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f143602b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f143603c) {
            i2 = 0;
        }
        return ((i10 + i2) * 31) + this.f143604d;
    }

    public final String toString() {
        return "VideoCoverPreloadConfig(enablePreload=" + this.f143601a + ", preloadWhenDownloadComplete=" + this.f143602b + ", preloadWhenPreloadNextVideoDown=" + this.f143603c + ", preloadCoverCnt=" + this.f143604d + ")";
    }

    private d() {
        this.f143601a = false;
        this.f143602b = false;
        this.f143603c = false;
        this.f143604d = 0;
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
