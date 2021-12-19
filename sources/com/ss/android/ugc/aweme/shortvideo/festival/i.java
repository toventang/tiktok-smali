package com.ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private float f128497a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f128498b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f128499c;

    static {
        Covode.recordClassIndex(84255);
    }

    private final int a(l lVar) {
        return (int) ((((float) lVar.getWeight()) / this.f128497a) * 100.0f);
    }

    public i(boolean z, boolean z2) {
        if (z) {
            this.f128497a += (float) l.VIDEO_DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.f128497a += (float) l.VIDEO_WATER_TYPE.getWeight();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.festival.h
    public final int a(l lVar, int i2) {
        l.d(lVar, "");
        int i3 = j.f128500a[lVar.ordinal()];
        if (i3 == 1) {
            this.f128498b = true;
        } else if (i3 == 2) {
            this.f128499c = true;
        }
        float weight = (((float) lVar.getWeight()) / this.f128497a) * ((float) i2);
        int i4 = 0;
        if (lVar != l.VIDEO_DOWNLOAD_TYPE && this.f128498b) {
            i4 = 0 + a(l.VIDEO_DOWNLOAD_TYPE);
        }
        if (lVar != l.VIDEO_WATER_TYPE && this.f128499c) {
            i4 += a(l.VIDEO_WATER_TYPE);
        }
        return (int) (weight + ((float) i4));
    }
}
