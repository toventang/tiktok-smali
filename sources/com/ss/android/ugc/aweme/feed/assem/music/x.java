package com.ss.android.ugc.aweme.feed.assem.music;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.music.model.Music;
import h.f.b.l;

public final class x implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Music f92337a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f92338b;

    /* renamed from: c  reason: collision with root package name */
    public final AwemeRawAd f92339c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f92340d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f92341e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f92342f;

    static {
        Covode.recordClassIndex(58379);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return l.a(this.f92337a, xVar.f92337a) && this.f92338b == xVar.f92338b && l.a(this.f92339c, xVar.f92339c) && this.f92340d == xVar.f92340d && this.f92341e == xVar.f92341e && this.f92342f == xVar.f92342f;
    }

    public final int hashCode() {
        Music music = this.f92337a;
        int i2 = 0;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        boolean z = this.f92338b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        AwemeRawAd awemeRawAd = this.f92339c;
        if (awemeRawAd != null) {
            i2 = awemeRawAd.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        boolean z2 = this.f92340d;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.f92341e;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        if (!this.f92342f) {
            i3 = 0;
        }
        return i16 + i3;
    }

    public final String toString() {
        return "VideoMusicTitleState(music=" + this.f92337a + ", isScheduleVideo=" + this.f92338b + ", awemeRawAd=" + this.f92339c + ", startMusicAnimation=" + this.f92340d + ", pauseNotesAnimation=" + this.f92341e + ", stopNotesAnimation=" + this.f92342f + ")";
    }

    public /* synthetic */ x() {
        this(null, false, null, false, false, false);
    }

    private x(Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4) {
        this.f92337a = music;
        this.f92338b = z;
        this.f92339c = awemeRawAd;
        this.f92340d = z2;
        this.f92341e = z3;
        this.f92342f = z4;
    }

    public static /* synthetic */ x a(x xVar, Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4, int i2) {
        boolean z5 = z4;
        boolean z6 = z3;
        Music music2 = music;
        boolean z7 = z;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        boolean z8 = z2;
        if ((i2 & 1) != 0) {
            music2 = xVar.f92337a;
        }
        if ((i2 & 2) != 0) {
            z7 = xVar.f92338b;
        }
        if ((i2 & 4) != 0) {
            awemeRawAd2 = xVar.f92339c;
        }
        if ((i2 & 8) != 0) {
            z8 = xVar.f92340d;
        }
        if ((i2 & 16) != 0) {
            z6 = xVar.f92341e;
        }
        if ((i2 & 32) != 0) {
            z5 = xVar.f92342f;
        }
        return new x(music2, z7, awemeRawAd2, z8, z6, z5);
    }
}
