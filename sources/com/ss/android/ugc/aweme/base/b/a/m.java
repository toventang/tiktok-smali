package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.discover.hitrank.c;

/* access modifiers changed from: package-private */
public final class m implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f68012a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68013b;

    static {
        Covode.recordClassIndex(41894);
    }

    @Override // com.ss.android.ugc.aweme.discover.hitrank.c
    public final boolean a() {
        return this.f68013b.getBoolean("hasShowToast", false);
    }

    @Override // com.ss.android.ugc.aweme.discover.hitrank.c
    public final void b() {
        SharedPreferences.Editor edit = this.f68013b.edit();
        edit.putBoolean("hasShowToast", true);
        edit.apply();
    }

    public m(Context context) {
        this.f68012a = context;
        this.f68013b = d.a(context, "RankSp", 0);
    }
}
