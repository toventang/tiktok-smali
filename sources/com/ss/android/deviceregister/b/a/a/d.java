package com.ss.android.deviceregister.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.a.a;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f59430a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f59431b;

    static {
        Covode.recordClassIndex(36700);
    }

    private SharedPreferences c(String str) {
        if ("device_id".equals(str)) {
            return this.f59431b;
        }
        return this.f59430a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.deviceregister.b.a.a.b
    public final String a(String str) {
        String string = c(str).getString(str, null);
        Logger.debug();
        return string;
    }

    public d(Context context) {
        if (context != null) {
            this.f59430a = com.ss.android.ugc.aweme.bf.d.a(context, a.a(), 0);
            this.f59431b = a.a(context);
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    @Override // com.ss.android.deviceregister.b.a.a.b
    public final void b(String str) {
        SharedPreferences c2 = c(str);
        if (c2 != null && c2.contains(str)) {
            c(str).edit().remove(str).apply();
        }
        a(str);
        super.b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.deviceregister.b.a.a.b
    public final void a(String str, String str2) {
        Logger.debug();
        if (!TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = c(str).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
