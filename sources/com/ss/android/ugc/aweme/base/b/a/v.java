package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.notice.api.d.a;

final class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f68030a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f68031b;

    static {
        Covode.recordClassIndex(41903);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.a
    public final int a() {
        return this.f68031b.getInt("notice_count_latency", 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.d.a
    public final void b() {
        SharedPreferences.Editor edit = this.f68031b.edit();
        edit.putBoolean("si_show_user_feed_back_point", true);
        edit.apply();
    }

    public v(Context context) {
        this.f68030a = context;
        this.f68031b = d.a(context, "aweme-app", 0);
    }
}
