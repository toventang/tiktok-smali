package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {
    public static final a u = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f130921a;

    /* renamed from: b  reason: collision with root package name */
    public long f130922b;

    /* renamed from: c  reason: collision with root package name */
    public long f130923c;

    /* renamed from: d  reason: collision with root package name */
    public long f130924d;

    /* renamed from: e  reason: collision with root package name */
    public long f130925e;

    /* renamed from: f  reason: collision with root package name */
    public long f130926f;

    /* renamed from: g  reason: collision with root package name */
    public double f130927g;

    /* renamed from: h  reason: collision with root package name */
    public double f130928h;

    /* renamed from: i  reason: collision with root package name */
    public double f130929i;

    /* renamed from: j  reason: collision with root package name */
    public double f130930j;

    /* renamed from: k  reason: collision with root package name */
    public double f130931k;

    /* renamed from: l  reason: collision with root package name */
    public long f130932l;

    /* renamed from: m  reason: collision with root package name */
    public long f130933m;
    public String n = "";
    public String o = "";
    public volatile int p;
    public int q;
    public String r = "";
    public long s;
    public String t = "";

    static {
        Covode.recordClassIndex(85814);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85815);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "CaptionMonitorData(duration=" + this.f130921a + ", getConfigDuration=" + this.f130922b + ", extractDuration=" + this.f130923c + ", uploadDuration=" + this.f130924d + ", submitDuration=" + this.f130925e + ", queryDuration=" + this.f130926f + ", extractDurationPerSecond=" + this.f130927g + ", uploadDurationPerSecond=" + this.f130928h + ", submitDurationPerSecond=" + this.f130929i + ", queryDurationPerSecond=" + this.f130930j + ", recognizeDurationPerSecond=" + this.f130931k + ", perceivedGetConfigDuration=" + this.f130932l + ", perceivedExtractDuration=" + this.f130933m + ", tosKey='" + this.n + "', jobId='" + this.o + "', failedStep=" + this.p + ", failedCode=" + this.q + ", failedMsg='" + this.r + "', audioFileSize=" + this.s + ", audioUploadDomain='" + this.t + "')";
    }

    public final void a(String str) {
        l.d(str, "");
        this.n = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.o = str;
    }

    public final void c(String str) {
        l.d(str, "");
        this.t = str;
    }
}
