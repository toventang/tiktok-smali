package com.ss.android.ugc.aweme.commercialize.live.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.HashMap;

public final class a {
    @c(a = "enter_from_ad")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f74531a;
    @c(a = "room_id")

    /* renamed from: b  reason: collision with root package name */
    public String f74532b;
    @c(a = "author_id")

    /* renamed from: c  reason: collision with root package name */
    public String f74533c;
    @c(a = "follow_status")

    /* renamed from: d  reason: collision with root package name */
    public String f74534d;
    @c(a = "live_ad_type")

    /* renamed from: e  reason: collision with root package name */
    public final String f74535e;
    @c(a = "live_ad_log_param")

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, String> f74536f;
    @c(a = "live_ad_log_extra_param")

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, String> f74537g;

    static {
        Covode.recordClassIndex(45962);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f74535e, aVar.f74535e) && l.a(this.f74536f, aVar.f74536f) && l.a(this.f74537g, aVar.f74537g);
    }

    public final int hashCode() {
        String str = this.f74535e;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, String> hashMap = this.f74536f;
        int hashCode2 = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        HashMap<String, String> hashMap2 = this.f74537g;
        if (hashMap2 != null) {
            i2 = hashMap2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AdLiveEnterRoomConfig(liveAdType=" + this.f74535e + ", liveAdLogParam=" + this.f74536f + ", liveAdLogExtraParam=" + this.f74537g + ")";
    }

    private /* synthetic */ a() {
        this("0", new HashMap(), new HashMap());
    }

    public a(String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        l.d(str, "");
        l.d(hashMap, "");
        l.d(hashMap2, "");
        this.f74535e = str;
        this.f74536f = hashMap;
        this.f74537g = hashMap2;
        this.f74531a = true;
    }
}
