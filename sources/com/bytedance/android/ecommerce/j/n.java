package com.bytedance.android.ecommerce.j;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class n implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f7117a;

    static {
        Covode.recordClassIndex(3421);
    }

    public n(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f7117a = d.a(applicationContext, "e_commerce_sp", 0);
    }

    @Override // com.bytedance.android.ecommerce.j.i
    public final String a(String str) {
        return this.f7117a.getString("sp_key_starling_data_".concat(String.valueOf(str)), "");
    }

    @Override // com.bytedance.android.ecommerce.j.i
    public final long b(String str) {
        return this.f7117a.getLong("sp_key_starling_version_".concat(String.valueOf(str)), 0);
    }

    @Override // com.bytedance.android.ecommerce.j.i
    public final void a(String str, Long l2) {
        this.f7117a.edit().putLong("sp_key_starling_version_".concat(String.valueOf(str)), l2.longValue()).apply();
    }

    @Override // com.bytedance.android.ecommerce.j.i
    public final void a(String str, String str2) {
        this.f7117a.edit().putString("sp_key_starling_data_".concat(String.valueOf(str)), str2).apply();
    }
}
