package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public class ap {

    /* renamed from: a  reason: collision with root package name */
    public int f15105a;

    /* renamed from: b  reason: collision with root package name */
    public String f15106b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15107c;

    /* renamed from: d  reason: collision with root package name */
    public int f15108d;

    /* renamed from: e  reason: collision with root package name */
    public User f15109e;

    /* renamed from: f  reason: collision with root package name */
    public String f15110f;

    static {
        Covode.recordClassIndex(8382);
    }

    public ap() {
        this(0, "");
    }

    public ap(boolean z) {
        this(2, "", "", z);
    }

    public ap(int i2, String str) {
        this(i2, str, "", false);
    }

    public ap(String str, String str2) {
        this(1, str, str2, false);
        this.f15108d = 1;
    }

    private ap(int i2, String str, String str2, boolean z) {
        this.f15105a = i2;
        this.f15106b = str;
        this.f15110f = str2;
        this.f15107c = z;
    }
}
