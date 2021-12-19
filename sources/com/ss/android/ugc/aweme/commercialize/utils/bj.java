package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.a;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.commercialize.f;
import h.f.b.l;

public abstract class bj implements a, f {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f75671c;

    static {
        Covode.recordClassIndex(46672);
    }

    private final void a() {
        Activity activity = this.f75671c;
        if (activity instanceof g) {
            ((g) activity).registerActivityOnKeyDownListener(this);
        }
    }

    private final void b() {
        Activity activity = this.f75671c;
        if (activity instanceof g) {
            ((g) activity).unRegisterActivityOnKeyDownListener(this);
        }
    }

    public bj(Activity activity) {
        l.d(activity, "");
        this.f75671c = activity;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.f
    public final void a(boolean z) {
        if (z) {
            a();
        } else {
            b();
        }
    }
}
