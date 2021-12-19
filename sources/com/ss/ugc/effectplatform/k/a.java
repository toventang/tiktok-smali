package com.ss.ugc.effectplatform.k;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f153639a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f153640b;

    /* renamed from: c  reason: collision with root package name */
    private final String f153641c;

    static {
        Covode.recordClassIndex(102437);
    }

    @Override // com.ss.ugc.effectplatform.k.c
    public final void a() {
        SharedPreferences.Editor edit = this.f153639a.edit();
        if (edit != null) {
            for (String str : this.f153639a.getAll().keySet()) {
                edit.remove(str);
            }
            edit.apply();
        }
    }

    @Override // com.ss.ugc.effectplatform.k.c
    public final void a(String str, String str2) {
        SharedPreferences.Editor putString;
        l.c(str, "");
        l.c(str2, "");
        SharedPreferences.Editor edit = this.f153639a.edit();
        if (edit != null && (putString = edit.putString(str, str2)) != null) {
            putString.apply();
        }
    }

    @Override // com.ss.ugc.effectplatform.k.c
    public final String b(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        String string = this.f153639a.getString(str, str2);
        return string == null ? str2 : string;
    }

    public a(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        this.f153640b = context;
        this.f153641c = str;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        SharedPreferences a2 = d.a(applicationContext, str, 0);
        l.a((Object) a2, "");
        this.f153639a = a2;
    }
}
