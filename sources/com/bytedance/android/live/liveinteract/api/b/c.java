package com.bytedance.android.live.liveinteract.api.b;

import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9968a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9969b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9970c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9971d;

    /* renamed from: e  reason: collision with root package name */
    public final m f9972e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f9973f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9974g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f9975h;

    static {
        Covode.recordClassIndex(5166);
    }

    public c(String str, String str2, String str3, String str4, m mVar, List<String> list, char c2) {
        this(str, str2, str3, str4, mVar, list, (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f9968a, cVar.f9968a) && l.a(this.f9969b, cVar.f9969b) && l.a(this.f9970c, cVar.f9970c) && l.a(this.f9971d, cVar.f9971d) && l.a(this.f9972e, cVar.f9972e) && l.a(this.f9973f, cVar.f9973f) && l.a(this.f9974g, cVar.f9974g) && l.a(this.f9975h, cVar.f9975h);
    }

    public final int hashCode() {
        String str = this.f9968a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9969b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9970c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9971d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        m mVar = this.f9972e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        List<String> list = this.f9973f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Object obj = this.f9974g;
        int hashCode7 = (hashCode6 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f9975h;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "InviteAnchorInfo(receiveUid=" + this.f9968a + ", receiveSecUid=" + this.f9969b + ", invitedRoomID=" + this.f9970c + ", inviteeName=" + this.f9971d + ", inviteType=" + this.f9972e + ", avatarUrlList=" + this.f9973f + ", extra=" + this.f9974g + ", trackInfo=" + this.f9975h + ")";
    }

    private c(String str, String str2, String str3, String str4, m mVar, List<String> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(mVar, "");
        l.d(list, "");
        this.f9968a = str;
        this.f9969b = str2;
        this.f9970c = str3;
        this.f9971d = str4;
        this.f9972e = mVar;
        this.f9973f = list;
        this.f9974g = null;
        this.f9975h = null;
    }

    private /* synthetic */ c(String str, String str2, String str3, String str4, m mVar, List list, byte b2) {
        this(str, str2, str3, str4, mVar, list);
    }
}
