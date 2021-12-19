package com.ss.android.ugc.aweme.setting.serverpush.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "push_device_recommend_video")

    /* renamed from: a  reason: collision with root package name */
    public int f122560a;
    @c(a = "push_device_other_channel")

    /* renamed from: b  reason: collision with root package name */
    public int f122561b;

    static {
        Covode.recordClassIndex(80415);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f122560a == eVar.f122560a && this.f122561b == eVar.f122561b;
    }

    public final int hashCode() {
        return (this.f122560a * 31) + this.f122561b;
    }

    public final String toString() {
        return "NotificationSettingsInfo(pushDeviceRecommendVideo=" + this.f122560a + ", pushDeviceOtherChannel=" + this.f122561b + ")";
    }
}
