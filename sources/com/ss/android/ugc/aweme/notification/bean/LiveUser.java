package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class LiveUser {
    @c(a = "id")
    public final long id;

    static {
        Covode.recordClassIndex(72804);
    }

    public LiveUser() {
        this(0, 1, null);
    }

    public static int com_ss_android_ugc_aweme_notification_bean_LiveUser_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ LiveUser copy$default(LiveUser liveUser, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = liveUser.id;
        }
        return liveUser.copy(j2);
    }

    public final LiveUser copy(long j2) {
        return new LiveUser(j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveUser) && this.id == ((LiveUser) obj).id;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_notification_bean_LiveUser_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id);
    }

    public final String toString() {
        return "LiveUser(id=" + this.id + ")";
    }

    public LiveUser(long j2) {
        this.id = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveUser(long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2);
    }
}
