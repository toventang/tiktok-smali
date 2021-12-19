package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.settingsrequest.d.a;

public final class ab implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f67995a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f67996b;

    static {
        Covode.recordClassIndex(41881);
    }

    public ab(Context context) {
        this.f67995a = context;
        this.f67996b = d.a(context, "VerifyActionManager", 0);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.d.a
    public final void a(String str) {
        SharedPreferences.Editor edit = this.f67996b.edit();
        edit.putString("verify_action", str);
        edit.apply();
    }
}
