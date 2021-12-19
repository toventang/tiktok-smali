package com.ss.android.ugc.aweme.user.c;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.profile.model.User;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f142353a;

    /* renamed from: b  reason: collision with root package name */
    private f f142354b = new f();

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f142355c;

    static {
        Covode.recordClassIndex(93108);
    }

    public b() {
        SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_user", 0);
        this.f142353a = a2;
        this.f142355c = a2.edit();
    }

    public final User a() {
        String string = this.f142353a.getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) this.f142354b.a(string, User.class);
            }
            return new a().a();
        } catch (Exception unused) {
            return new User();
        }
    }
}
