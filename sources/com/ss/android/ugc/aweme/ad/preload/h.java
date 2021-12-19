package com.ss.android.ugc.aweme.ad.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public long f66140a;

    /* renamed from: b  reason: collision with root package name */
    public int f66141b;

    /* renamed from: c  reason: collision with root package name */
    public final long f66142c;

    /* renamed from: d  reason: collision with root package name */
    public final String f66143d;

    /* renamed from: e  reason: collision with root package name */
    public AwemeRawAd f66144e;

    static {
        Covode.recordClassIndex(40657);
    }

    public h() {
        this(0, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f66142c == hVar.f66142c && l.a(this.f66143d, hVar.f66143d) && l.a(this.f66144e, hVar.f66144e);
    }

    public final String toString() {
        return "PreloadDownloadMsg(creativeId=" + this.f66142c + ", logExtra=" + this.f66143d + ", rawAd=" + this.f66144e + ")";
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f66142c;
        int i3 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f66143d;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i3 + i2) * 31;
        AwemeRawAd awemeRawAd = this.f66144e;
        if (awemeRawAd != null) {
            i4 = awemeRawAd.hashCode();
        }
        return i5 + i4;
    }

    public h(long j2, String str, AwemeRawAd awemeRawAd) {
        this.f66142c = j2;
        this.f66143d = str;
        this.f66144e = awemeRawAd;
        this.f66141b = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(long j2, String str, int i2) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? "" : str, (AwemeRawAd) null);
    }
}
