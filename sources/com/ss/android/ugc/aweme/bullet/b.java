package com.ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f68849a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(42415);
    }

    public static final IBulletService a() {
        IBulletService f2 = BulletService.f();
        l.b(f2, "");
        return f2;
    }

    public static final void a(Context context, String str, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        a(context, str, null, bundle);
    }

    public static final void a(Context context, String str, String str2, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        BulletService.f().a(context, str, str2, bundle);
    }
}
