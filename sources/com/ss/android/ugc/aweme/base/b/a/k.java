package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.t;
import com.ss.android.ugc.aweme.bf.d;

public final class k implements t {

    /* renamed from: a  reason: collision with root package name */
    private Context f68008a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68009b;

    static {
        Covode.recordClassIndex(41892);
    }

    public k(Context context) {
        this.f68008a = context;
        this.f68009b = d.a(context, "LoginSharePreferences", 0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.t
    public final void a(String str) {
        SharedPreferences.Editor edit = this.f68009b.edit();
        edit.putString("latest_login_info", str);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.account.login.t
    public final String b(String str) {
        return this.f68009b.getString("latest_login_info", str);
    }

    @Override // com.ss.android.ugc.aweme.account.login.t
    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f68009b.edit();
        edit.putBoolean("save_login_info", z);
        edit.apply();
    }

    @Override // com.ss.android.ugc.aweme.account.login.t
    public final boolean b(boolean z) {
        return this.f68009b.getBoolean("save_login_info", z);
    }
}
