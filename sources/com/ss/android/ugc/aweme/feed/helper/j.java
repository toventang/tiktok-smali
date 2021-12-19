package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "show_interval_time")

    /* renamed from: a  reason: collision with root package name */
    public long f93352a = 0;
    @c(a = "bi_cancel_interval_time")

    /* renamed from: b  reason: collision with root package name */
    public long f93353b = 0;
    @c(a = "fixed_survey")

    /* renamed from: c  reason: collision with root package name */
    public i f93354c = null;
    @c(a = "flexible_survey")

    /* renamed from: d  reason: collision with root package name */
    public i f93355d = null;
    @c(a = "feed_trigger_threshold")

    /* renamed from: e  reason: collision with root package name */
    public int f93356e = 0;

    static {
        Covode.recordClassIndex(59168);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f93352a == jVar.f93352a && this.f93353b == jVar.f93353b && l.a(this.f93354c, jVar.f93354c) && l.a(this.f93355d, jVar.f93355d) && this.f93356e == jVar.f93356e;
    }

    public final String toString() {
        return "FeedSurveyConfig(showIntervalTime=" + this.f93352a + ", biCanceIntervalTime=" + this.f93353b + ", fixedSurvey=" + this.f93354c + ", flexibleSurvey=" + this.f93355d + ", feedTriggerThreshold=" + this.f93356e + ")";
    }

    private j() {
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f93352a;
        long j3 = this.f93353b;
        int i3 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        i iVar = this.f93354c;
        int i4 = 0;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i3 + i2) * 31;
        i iVar2 = this.f93355d;
        if (iVar2 != null) {
            i4 = iVar2.hashCode();
        }
        return ((i5 + i4) * 31) + this.f93356e;
    }
}
