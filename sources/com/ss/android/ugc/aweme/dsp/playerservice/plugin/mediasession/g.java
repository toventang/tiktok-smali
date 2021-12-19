package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f83666a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83667b;

    /* renamed from: c  reason: collision with root package name */
    public final String f83668c;

    /* renamed from: d  reason: collision with root package name */
    public final String f83669d;

    /* renamed from: e  reason: collision with root package name */
    public final String f83670e;

    /* renamed from: f  reason: collision with root package name */
    public final String f83671f;

    static {
        Covode.recordClassIndex(52205);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f83666a == gVar.f83666a && this.f83667b == gVar.f83667b && l.a(this.f83668c, gVar.f83668c) && l.a(this.f83669d, gVar.f83669d) && l.a(this.f83670e, gVar.f83670e) && l.a(this.f83671f, gVar.f83671f);
    }

    public final int hashCode() {
        int i2 = ((this.f83666a * 31) + this.f83667b) * 31;
        String str = this.f83668c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83669d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83670e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83671f;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "NotificationConfig(notificationId=" + this.f83666a + ", notificationIconRes=" + this.f83667b + ", notificationGroup=" + this.f83668c + ", channelName=" + this.f83669d + ", channelDesc=" + this.f83670e + ", channelId=" + this.f83671f + ")";
    }

    public /* synthetic */ g(int i2) {
        this(i2, "music_player_service", "Music Play Service", "MUSIC_PLAY_SERVICE", "MUSIC_PLAY_SERVICE");
    }

    private g(int i2, String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f83666a = R.id.cq3;
        this.f83667b = i2;
        this.f83668c = str;
        this.f83669d = str2;
        this.f83670e = str3;
        this.f83671f = str4;
    }
}
