package com.ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class d {
    @c(a = "fix_miss_callback_splash_feed_ad")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f143755a;
    @c(a = "fix_miss_callback_click")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f143756b;
    @c(a = "add_callback_when_play_complete")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f143757c;

    static {
        Covode.recordClassIndex(94052);
    }

    public d(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f143755a == dVar.f143755a && this.f143756b == dVar.f143756b && this.f143757c == dVar.f143757c;
    }

    public final int hashCode() {
        boolean z = this.f143755a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f143756b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f143757c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "PreloadPromptConfig(fixSplashFeedAdMissCallback=" + this.f143755a + ", fixClickPlayMissCallback=" + this.f143756b + ", preloadWhenPlayComplete=" + this.f143757c + ")";
    }

    private d() {
        this.f143755a = false;
        this.f143756b = false;
        this.f143757c = false;
    }

    private /* synthetic */ d(byte b2) {
        this();
    }
}
