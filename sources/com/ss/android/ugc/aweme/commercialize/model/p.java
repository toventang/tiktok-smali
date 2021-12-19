package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class p implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static final p DEFAULT_DISABLE_VERSION = new p(0, 0, 0, 7, null);
    public static final p DEFAULT_ONLINE_VERSION = new p(0, 0, 0, 7, null);
    public static final p DEFAULT_TEST_VERSION = new p(12, 9, 6);
    @c(a = "request_period")
    private final long requestPeriod;
    @c(a = "visit_ad_max_interval")
    private final long visitAdMaxInterval;
    @c(a = "visit_ad_min_interval")
    private final long visitAdMinInterval;

    public p() {
        this(0, 0, 0, 7, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46183);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long getRequestPeriod() {
        return this.requestPeriod;
    }

    public final long getVisitAdMaxInterval() {
        return this.visitAdMaxInterval;
    }

    public final long getVisitAdMinInterval() {
        return this.visitAdMinInterval;
    }

    static {
        Covode.recordClassIndex(46182);
    }

    public p(long j2, long j3, long j4) {
        this.visitAdMaxInterval = j2;
        this.visitAdMinInterval = j3;
        this.requestPeriod = j4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(long j2, long j3, long j4, int i2, g gVar) {
        this((i2 & 1) != 0 ? 120 : j2, (i2 & 2) != 0 ? 90 : j3, (i2 & 4) != 0 ? 60 : j4);
    }
}
