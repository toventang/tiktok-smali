package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f136860a;

    /* renamed from: b  reason: collision with root package name */
    public final long f136861b;

    /* renamed from: c  reason: collision with root package name */
    public final long f136862c;

    static {
        Covode.recordClassIndex(89442);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f136860a, lVar.f136860a) && this.f136861b == lVar.f136861b && this.f136862c == lVar.f136862c;
    }

    public final String toString() {
        return "StoryPlayProgressParam(sourceId=" + this.f136860a + ", position=" + this.f136861b + ", duration=" + this.f136862c + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f136860a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f136861b;
        long j3 = this.f136862c;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public l(String str, long j2, long j3) {
        this.f136860a = str;
        this.f136861b = j2;
        this.f136862c = j3;
    }
}
