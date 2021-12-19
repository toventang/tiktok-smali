package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f145425a;

    static {
        Covode.recordClassIndex(95087);
    }

    public static void a(Context context, boolean z) {
        AwemeRedBadgerManager.f145477b.a();
        f.c().d(ab.f145427a);
        f.d().d(ac.f145428a);
        b(context, z);
    }

    private static void b(final Context context, boolean z) {
        if (z) {
            x.f145471a.execute(new Runnable() {
                /* class com.ss.android.ugc.awemepushlib.interaction.aa.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95088);
                }

                public final void run() {
                    AccountService.a().a(new ag(context));
                }
            });
        } else {
            AccountService.a().a(new ad(context));
        }
    }
}
