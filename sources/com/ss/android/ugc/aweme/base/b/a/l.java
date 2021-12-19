package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.b;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f68010a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68011b;

    static {
        Covode.recordClassIndex(41893);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.b
    public final String a() {
        return this.f68011b.getString("teenage_mode_setting", "");
    }

    public l(Context context) {
        this.f68010a = context;
        this.f68011b = d.a(context, "TeenageModeSetting", 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.b
    public final void a(String str) {
        SharedPreferences.Editor edit = this.f68011b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
