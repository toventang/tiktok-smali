package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "preview_start_time")

    /* renamed from: a  reason: collision with root package name */
    public long f23055a;
    @c(a = "preview_config")

    /* renamed from: b  reason: collision with root package name */
    public List<k> f23056b;
    @c(a = "target_config")

    /* renamed from: c  reason: collision with root package name */
    public m f23057c;
    @c(a = "reward_config")

    /* renamed from: d  reason: collision with root package name */
    public l f23058d;

    static {
        Covode.recordClassIndex(13668);
    }

    public b(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23055a == bVar.f23055a && l.a(this.f23056b, bVar.f23056b) && l.a(this.f23057c, bVar.f23057c) && l.a(this.f23058d, bVar.f23058d);
    }

    public final String toString() {
        return "BattleBonusConfig(previewStartTime=" + this.f23055a + ", previewPeriodConfig=" + this.f23056b + ", taskPeriodConfig=" + this.f23057c + ", rewardPeriodConfig=" + this.f23058d + ")";
    }

    private b() {
        this.f23055a = 0;
        this.f23056b = null;
        this.f23057c = null;
        this.f23058d = null;
    }

    public final int hashCode() {
        int i2;
        int i3;
        long j2 = this.f23055a;
        int i4 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        List<k> list = this.f23056b;
        int i5 = 0;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        m mVar = this.f23057c;
        if (mVar != null) {
            i3 = mVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        l lVar = this.f23058d;
        if (lVar != null) {
            i5 = lVar.hashCode();
        }
        return i7 + i5;
    }

    private /* synthetic */ b(byte b2) {
        this();
    }
}
