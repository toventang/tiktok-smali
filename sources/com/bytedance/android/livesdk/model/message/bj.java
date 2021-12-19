package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class bj {
    @c(a = "question_id")

    /* renamed from: a  reason: collision with root package name */
    public long f19332a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public String f19333b;
    @c(a = "answer_status")

    /* renamed from: c  reason: collision with root package name */
    public int f19334c;
    @c(a = "create_time")

    /* renamed from: d  reason: collision with root package name */
    public long f19335d;
    @c(a = "user")

    /* renamed from: e  reason: collision with root package name */
    public User f19336e;

    static {
        Covode.recordClassIndex(11480);
    }

    public bj() {
    }

    public bj(String str, int i2, User user) {
        this.f19332a = 0;
        this.f19333b = str;
        this.f19334c = i2;
        this.f19335d = 0;
        this.f19336e = user;
    }
}
