package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class aj implements Serializable {
    private final AwemeRawAd awemeRawAd;
    private long startTime;
    private final String tag;

    static {
        Covode.recordClassIndex(46156);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_OpenAppBackLogParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ aj copy$default(aj ajVar, String str, long j2, AwemeRawAd awemeRawAd2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ajVar.tag;
        }
        if ((i2 & 2) != 0) {
            j2 = ajVar.startTime;
        }
        if ((i2 & 4) != 0) {
            awemeRawAd2 = ajVar.awemeRawAd;
        }
        return ajVar.copy(str, j2, awemeRawAd2);
    }

    public final String component1() {
        return this.tag;
    }

    public final long component2() {
        return this.startTime;
    }

    public final AwemeRawAd component3() {
        return this.awemeRawAd;
    }

    public final aj copy(String str, long j2, AwemeRawAd awemeRawAd2) {
        l.d(str, "");
        return new aj(str, j2, awemeRawAd2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return l.a(this.tag, ajVar.tag) && this.startTime == ajVar.startTime && l.a(this.awemeRawAd, ajVar.awemeRawAd);
    }

    public final int hashCode() {
        String str = this.tag;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_commercialize_model_OpenAppBackLogParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31;
        AwemeRawAd awemeRawAd2 = this.awemeRawAd;
        if (awemeRawAd2 != null) {
            i2 = awemeRawAd2.hashCode();
        }
        return hashCode + i2;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String toJson() {
        String b2 = new f().b(this);
        l.b(b2, "");
        return b2;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f74857a = "";

        /* renamed from: b  reason: collision with root package name */
        public long f74858b;

        /* renamed from: c  reason: collision with root package name */
        public AwemeRawAd f74859c;

        static {
            Covode.recordClassIndex(46157);
        }

        public final aj a() {
            return new aj(this.f74857a, this.f74858b, this.f74859c, null);
        }

        public final a a(long j2) {
            this.f74858b = j2;
            return this;
        }

        public final a a(AwemeRawAd awemeRawAd) {
            this.f74859c = awemeRawAd;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f74857a = str;
            return this;
        }
    }

    public final String toString() {
        return "tag=" + this.tag + ", startTime=" + this.startTime + ", awemeRawAd=" + this.awemeRawAd;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    private aj(String str, long j2, AwemeRawAd awemeRawAd2) {
        this.tag = str;
        this.startTime = j2;
        this.awemeRawAd = awemeRawAd2;
    }

    public /* synthetic */ aj(String str, long j2, AwemeRawAd awemeRawAd2, g gVar) {
        this(str, j2, awemeRawAd2);
    }
}
