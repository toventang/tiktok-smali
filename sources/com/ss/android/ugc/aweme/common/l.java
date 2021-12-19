package com.ss.android.ugc.aweme.common;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.api.a.a;
import com.ss.android.ugc.aweme.experiment.cj;
import com.zhiliaoapp.musically.R;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f76465a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(47209);
    }

    public static final void a(Activity activity, Throwable th) {
        a aVar;
        Integer valueOf;
        h.f.b.l.d(activity, "");
        if (th != null) {
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                aVar = (a) th;
            } else if (th.getCause() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                Throwable cause = th.getCause();
                if (!(cause instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    cause = null;
                }
                aVar = (a) cause;
            } else {
                aVar = null;
            }
            if (cj.a()) {
                if (!(aVar == null || (valueOf = Integer.valueOf(aVar.getErrorCode())) == null)) {
                    if (valueOf.intValue() == 5) {
                        new b(activity).e(R.string.bz2).b();
                        return;
                    } else if (valueOf.intValue() == 2059) {
                        new b(activity).e(R.string.bz0).b();
                        return;
                    } else if (valueOf.intValue() == 2065) {
                        new b(activity).e(R.string.bz3).b();
                        return;
                    } else if (valueOf.intValue() == 2149) {
                        new b(activity).e(R.string.bz6).b();
                        return;
                    } else if (valueOf.intValue() == 4) {
                        new b(activity).e(R.string.bz5).b();
                        return;
                    } else if (valueOf != null) {
                        if (valueOf.intValue() == 3231) {
                            new b(activity).e(R.string.bz4).b();
                            return;
                        } else if (valueOf.intValue() == 3058) {
                            new b(activity).e(R.string.bz4).b();
                            return;
                        } else if (valueOf.intValue() == 3059) {
                            new b(activity).e(R.string.bz4).b();
                            return;
                        }
                    }
                }
                new b(activity).e(R.string.bz9).b();
                return;
            }
            new b(activity).e(R.string.bz9).b();
        }
    }
}
