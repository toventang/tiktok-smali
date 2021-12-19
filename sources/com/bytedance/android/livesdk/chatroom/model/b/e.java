package com.bytedance.android.livesdk.chatroom.model.b;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class e {
    @c(a = "fan_ticket")

    /* renamed from: a  reason: collision with root package name */
    public long f15720a;
    @c(a = "linkmic_id")

    /* renamed from: b  reason: collision with root package name */
    public int f15721b;
    @c(a = "user")

    /* renamed from: c  reason: collision with root package name */
    public User f15722c;
    @c(a = "modify_time")

    /* renamed from: d  reason: collision with root package name */
    public long f15723d;
    @c(a = "link_status")

    /* renamed from: e  reason: collision with root package name */
    public int f15724e;
    @c(a = "link_type")

    /* renamed from: f  reason: collision with root package name */
    public int f15725f;
    @c(a = "role_type")

    /* renamed from: g  reason: collision with root package name */
    public int f15726g;
    @c(a = "payed_money")

    /* renamed from: h  reason: collision with root package name */
    public int f15727h;
    @c(a = "link_duration")

    /* renamed from: i  reason: collision with root package name */
    public int f15728i;
    @c(a = "linkmic_id_str")

    /* renamed from: j  reason: collision with root package name */
    public String f15729j;

    /* renamed from: k  reason: collision with root package name */
    public int f15730k;

    static {
        Covode.recordClassIndex(8681);
    }

    public int hashCode() {
        User user = this.f15722c;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f15729j)) {
            return String.valueOf(this.f15721b);
        }
        return this.f15729j;
    }

    public String toString() {
        return "LinkPlayerInfo{, mFanTicket=" + this.f15720a + ", mInteractId=" + this.f15721b + ", mUser=" + this.f15722c + ", mModifyTime=" + this.f15723d + ", mLinkStatus=" + this.f15724e + ", mLinkType=" + this.f15725f + ", mRoleType=" + this.f15726g + ", paidMoney=" + this.f15727h + ", linkDuration=" + this.f15728i + ", mInteractIdStr='" + this.f15729j + '\'' + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            User user = this.f15722c;
            if (user == null || eVar.f15722c == null || !user.getIdStr().equals(eVar.f15722c.getIdStr())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
