package com.bytedance.android.livesdk.chatroom.model.d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class a {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public User f15750a;
    @c(a = "modify_time")

    /* renamed from: b  reason: collision with root package name */
    public long f15751b;
    @c(a = "link_type")

    /* renamed from: c  reason: collision with root package name */
    public int f15752c;
    @c(a = "role_type")

    /* renamed from: d  reason: collision with root package name */
    public int f15753d;
    @c(a = "linkmic_id_str")

    /* renamed from: e  reason: collision with root package name */
    public String f15754e;
    @c(a = "mute_status")

    /* renamed from: f  reason: collision with root package name */
    public int f15755f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15756g;

    static {
        Covode.recordClassIndex(8698);
    }

    public String toString() {
        return "SocialLinkPlayerInfo{, mUser=" + this.f15750a + ", mModifyTime=" + this.f15751b + ", mLinkType=" + this.f15752c + ", mRoleType=" + this.f15753d + ", mInteractIdStr='" + this.f15754e + '\'' + ", outOfDate=" + this.f15756g + '}';
    }
}
