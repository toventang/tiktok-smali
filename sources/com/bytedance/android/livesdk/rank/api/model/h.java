package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class h implements e<h> {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f20607a;
    @c(a = "score")

    /* renamed from: b  reason: collision with root package name */
    public long f20608b;
    @c(a = "rank")

    /* renamed from: c  reason: collision with root package name */
    public int f20609c;
    @c(a = "gap_description")

    /* renamed from: d  reason: collision with root package name */
    public String f20610d;
    @c(a = "delta")

    /* renamed from: e  reason: collision with root package name */
    public long f20611e;
    @c(a = "rich_description")

    /* renamed from: f  reason: collision with root package name */
    public String f20612f;
    @c(a = "city_code")

    /* renamed from: g  reason: collision with root package name */
    public String f20613g;
    @c(a = "gap_rich_description")

    /* renamed from: h  reason: collision with root package name */
    public String f20614h;
    @c(a = "user_restriction_level")

    /* renamed from: i  reason: collision with root package name */
    public int f20615i;

    static {
        Covode.recordClassIndex(12178);
    }

    private long a() {
        User user = this.f20607a;
        if (user == null) {
            return 0;
        }
        return user.getLiveRoomId();
    }

    public int hashCode() {
        int a2 = (((((int) (((long) (((int) this.f20608b) * 37)) + a())) * 37) + this.f20607a.hashCode()) * 37) + this.f20609c;
        String str = this.f20610d;
        if (str != null) {
            return (a2 * 37) + str.hashCode();
        }
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.livesdk.rank.api.model.e
    public final /* synthetic */ boolean a(h hVar) {
        if (this.f20607a.getId() == hVar.f20607a.getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals */
    public boolean b(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        long a2 = a();
        if (this.f20608b == hVar.f20608b && a2 == hVar.a() && this.f20609c == hVar.f20609c && this.f20607a.equals(hVar.f20607a) && (str = this.f20610d) != null) {
            return str.equals(hVar.f20610d);
        }
        return true;
    }
}
