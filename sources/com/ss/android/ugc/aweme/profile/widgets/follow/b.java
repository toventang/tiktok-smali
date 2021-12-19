package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.recommend.g;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f117774a;

    /* renamed from: b  reason: collision with root package name */
    public final String f117775b;

    /* renamed from: c  reason: collision with root package name */
    public final String f117776c;

    /* renamed from: d  reason: collision with root package name */
    public final String f117777d;

    /* renamed from: e  reason: collision with root package name */
    public final String f117778e;

    /* renamed from: f  reason: collision with root package name */
    public final g f117779f;

    /* renamed from: g  reason: collision with root package name */
    public final String f117780g;

    static {
        Covode.recordClassIndex(76274);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f117774a, bVar.f117774a) && l.a(this.f117775b, bVar.f117775b) && l.a(this.f117776c, bVar.f117776c) && l.a(this.f117777d, bVar.f117777d) && l.a(this.f117778e, bVar.f117778e) && l.a(this.f117779f, bVar.f117779f) && l.a(this.f117780g, bVar.f117780g);
    }

    public final int hashCode() {
        String str = this.f117774a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117775b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f117776c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f117777d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f117778e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        g gVar = this.f117779f;
        int hashCode6 = (hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str6 = this.f117780g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "FollowLogEvenParams(liveRequestId=" + this.f117774a + ", liveRoomId=" + this.f117775b + ", liveRoomOwnerId=" + this.f117776c + ", liveType=" + this.f117777d + ", fromSearch=" + this.f117778e + ", recommendEnterProfile=" + this.f117779f + ", position=" + this.f117780g + ")";
    }

    private /* synthetic */ b() {
        this(null, null, null, null, null, null, null);
    }

    public b(String str, String str2, String str3, String str4, String str5, g gVar, String str6) {
        this.f117774a = str;
        this.f117775b = str2;
        this.f117776c = str3;
        this.f117777d = str4;
        this.f117778e = str5;
        this.f117779f = gVar;
        this.f117780g = str6;
    }
}
