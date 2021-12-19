package com.ss.android.ugc.aweme.ad.feed.h;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.a;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.commercialize.f;
import h.f.b.l;

public abstract class b implements a, f {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f65877c;

    static {
        Covode.recordClassIndex(40536);
    }

    private final void a() {
        Activity activity = this.f65877c;
        if (activity instanceof g) {
            ((g) activity).registerActivityOnKeyDownListener(this);
        }
    }

    private final void b() {
        Activity activity = this.f65877c;
        if (activity instanceof g) {
            ((g) activity).unRegisterActivityOnKeyDownListener(this);
        }
    }

    public b(Activity activity) {
        l.d(activity, "");
        this.f65877c = activity;
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
