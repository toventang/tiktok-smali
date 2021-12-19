package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.trill.share.a.a;

/* access modifiers changed from: package-private */
public final class ac implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f67997a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f67998b;

    static {
        Covode.recordClassIndex(41882);
    }

    public ac(Context context) {
        this.f67997a = context;
        this.f67998b = d.a(context, "VideoPublishManager", 0);
    }

    @Override // com.ss.android.ugc.trill.share.a.a
    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f67998b.edit();
        edit.putBoolean("is_aweme_private", z);
        edit.apply();
    }
}
