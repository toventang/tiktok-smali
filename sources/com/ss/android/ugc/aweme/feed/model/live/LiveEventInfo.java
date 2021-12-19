package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class LiveEventInfo implements Serializable {
    @c(a = "description")
    private String description;
    @c(a = "duration")
    private long duration;
    @c(a = "event_id")
    private long id;
    @c(a = "start_time")
    private long startTime;
    @c(a = "has_subscribed")
    private boolean subscribed;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(59497);
    }

    public LiveEventInfo() {
        this(0, 0, 0, null, null, false, 63, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ LiveEventInfo copy$default(LiveEventInfo liveEventInfo, long j2, long j3, long j4, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = liveEventInfo.id;
        }
        if ((i2 & 2) != 0) {
            j3 = liveEventInfo.startTime;
        }
        if ((i2 & 4) != 0) {
            j4 = liveEventInfo.duration;
        }
        if ((i2 & 8) != 0) {
            str = liveEventInfo.title;
        }
        if ((i2 & 16) != 0) {
            str2 = liveEventInfo.description;
        }
        if ((i2 & 32) != 0) {
            z = liveEventInfo.subscribed;
        }
        return liveEventInfo.copy(j2, j3, j4, str, str2, z);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.duration;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final boolean component6() {
        return this.subscribed;
    }

    public final LiveEventInfo copy(long j2, long j3, long j4, String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        return new LiveEventInfo(j2, j3, j4, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveEventInfo)) {
            return false;
        }
        LiveEventInfo liveEventInfo = (LiveEventInfo) obj;
        return this.id == liveEventInfo.id && this.startTime == liveEventInfo.startTime && this.duration == liveEventInfo.duration && l.a(this.title, liveEventInfo.title) && l.a(this.description, liveEventInfo.description) && this.subscribed == liveEventInfo.subscribed;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31) + com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duration)) * 31;
        String str = this.title;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_live_LiveEventInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.subscribed;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "LiveEventInfo(id=" + this.id + ", startTime=" + this.startTime + ", duration=" + this.duration + ", title=" + this.title + ", description=" + this.description + ", subscribed=" + this.subscribed + ")";
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setSubscribed(boolean z) {
        this.subscribed = z;
    }

    public final void setDescription(String str) {
        l.d(str, "");
        this.description = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }

    public LiveEventInfo(long j2, long j3, long j4, String str, String str2, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        this.id = j2;
        this.startTime = j3;
        this.duration = j4;
        this.title = str;
        this.description = str2;
        this.subscribed = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LiveEventInfo(long r11, long r13, long r15, java.lang.String r17, java.lang.String r18, boolean r19, int r20, h.f.b.g r21) {
        /*
            r10 = this;
            r9 = r19
            r7 = r17
            r3 = r13
            r1 = r11
            r0 = r20 & 1
            r5 = 0
            if (r0 == 0) goto L_0x000e
            r1 = 0
        L_0x000e:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x0014
            r3 = 0
        L_0x0014:
            r0 = r20 & 4
            if (r0 == 0) goto L_0x0030
        L_0x0018:
            r0 = r20 & 8
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x001f
            r7 = r8
        L_0x001f:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x002d
        L_0x0023:
            r0 = r20 & 32
            if (r0 == 0) goto L_0x0028
            r9 = 0
        L_0x0028:
            r0 = r10
            r0.<init>(r1, r3, r5, r7, r8, r9)
            return
        L_0x002d:
            r8 = r18
            goto L_0x0023
        L_0x0030:
            r5 = r15
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo.<init>(long, long, long, java.lang.String, java.lang.String, boolean, int, h.f.b.g):void");
    }
}
