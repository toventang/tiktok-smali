package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.notice.api.d.c;

final class x implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f68034a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68035b;

    static {
        Covode.recordClassIndex(41905);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.c
    public final void a() {
        SharedPreferences.Editor edit = this.f68035b.edit();
        edit.putBoolean("stick_game_assistant", true);
        edit.apply();
    }

    public x(Context context) {
        this.f68034a = context;
        this.f68035b = d.a(context, "IMPreferences", 0);
    }
}
