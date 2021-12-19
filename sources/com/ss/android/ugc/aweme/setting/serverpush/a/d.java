package com.ss.android.ugc.aweme.setting.serverpush.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class d extends BaseResponse {
    @c(a = "notification_settings_info")

    /* renamed from: a  reason: collision with root package name */
    public final e f122559a;

    static {
        Covode.recordClassIndex(80414);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f122559a, ((d) obj).f122559a);
        }
        return true;
    }

    public final int hashCode() {
        e eVar = this.f122559a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NotificationSettings(notificationSettingsInfo=" + this.f122559a + ")";
    }
}
