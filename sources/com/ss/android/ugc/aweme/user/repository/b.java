package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public User f142427a;

    /* renamed from: b  reason: collision with root package name */
    public String f142428b;

    /* renamed from: c  reason: collision with root package name */
    public int f142429c;

    static {
        Covode.recordClassIndex(93153);
    }

    private b(User user, String str) {
        l.d(user, "");
        l.d(str, "");
        this.f142427a = user;
        this.f142428b = str;
        this.f142429c = 0;
    }

    public /* synthetic */ b(User user, String str, byte b2) {
        this(user, str);
    }
}
