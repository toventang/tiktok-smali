package com.ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.l;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Music f92312a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f92313b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f92314c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f92315d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f92316e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f92317f;

    static {
        Covode.recordClassIndex(58347);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f92312a, mVar.f92312a) && this.f92313b == mVar.f92313b && this.f92314c == mVar.f92314c && this.f92315d == mVar.f92315d && this.f92316e == mVar.f92316e && this.f92317f == mVar.f92317f;
    }

    public final int hashCode() {
        Music music = this.f92312a;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        boolean z = this.f92313b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f92314c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f92315d;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f92316e;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        if (!this.f92317f) {
            i2 = 0;
        }
        return i18 + i2;
    }

    public final String toString() {
        return "VideoMusicCoverState(music=" + this.f92312a + ", isScheduleVideo=" + this.f92313b + ", startMusicAnimation=" + this.f92314c + ", startNotesAnimation=" + this.f92315d + ", pauseNotesAnimation=" + this.f92316e + ", stopNotesAnimation=" + this.f92317f + ")";
    }

    public /* synthetic */ m() {
        this(null, false, false, false, false, false);
    }

    private m(Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f92312a = music;
        this.f92313b = z;
        this.f92314c = z2;
        this.f92315d = z3;
        this.f92316e = z4;
        this.f92317f = z5;
    }

    public static /* synthetic */ m a(m mVar, Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        boolean z6 = z5;
        boolean z7 = z4;
        Music music2 = music;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        if ((i2 & 1) != 0) {
            music2 = mVar.f92312a;
        }
        if ((i2 & 2) != 0) {
            z8 = mVar.f92313b;
        }
        if ((i2 & 4) != 0) {
            z9 = mVar.f92314c;
        }
        if ((i2 & 8) != 0) {
            z10 = mVar.f92315d;
        }
        if ((i2 & 16) != 0) {
            z7 = mVar.f92316e;
        }
        if ((i2 & 32) != 0) {
            z6 = mVar.f92317f;
        }
        return new m(music2, z8, z9, z10, z7, z6);
    }
}
