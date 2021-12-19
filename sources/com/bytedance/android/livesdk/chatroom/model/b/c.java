package com.bytedance.android.livesdk.chatroom.model.b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public class c {
    @com.google.gson.a.c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f15710a;
    @com.google.gson.a.c(a = "modify_time")

    /* renamed from: b  reason: collision with root package name */
    public long f15711b;
    @com.google.gson.a.c(a = "link_type")

    /* renamed from: c  reason: collision with root package name */
    public int f15712c;
    @com.google.gson.a.c(a = "role_type")

    /* renamed from: d  reason: collision with root package name */
    public int f15713d;
    @com.google.gson.a.c(a = "payed_money")

    /* renamed from: e  reason: collision with root package name */
    public int f15714e;
    @com.google.gson.a.c(a = "fan_ticket")

    /* renamed from: f  reason: collision with root package name */
    public long f15715f;
    @com.google.gson.a.c(a = "linkmic_id_str")

    /* renamed from: g  reason: collision with root package name */
    public String f15716g;

    /* renamed from: h  reason: collision with root package name */
    public int f15717h;

    static {
        Covode.recordClassIndex(8679);
    }

    public String toString() {
        return "LinkPlayerInfo{, mFanTicket=" + this.f15715f + ", mUser=" + this.f15710a + ", mModifyTime=" + this.f15711b + ", mLinkType=" + this.f15712c + ", mRoleType=" + this.f15713d + ", paidMoney=" + this.f15714e + ", mInteractIdStr='" + this.f15716g + '\'' + '}';
    }
}
