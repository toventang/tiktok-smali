package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a;

final class q implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f68020a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68021b;

    static {
        Covode.recordClassIndex(41898);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a
    public final String a() {
        return this.f68021b.getString("teenage_mode_setting", "");
    }

    public q(Context context) {
        this.f68020a = context;
        this.f68021b = d.a(context, "TeenageModeSetting", 0);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a
    public final void a(String str) {
        SharedPreferences.Editor edit = this.f68021b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
