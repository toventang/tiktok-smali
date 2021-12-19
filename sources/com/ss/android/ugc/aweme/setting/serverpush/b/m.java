package com.ss.android.ugc.aweme.setting.serverpush.b;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.v;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final LiveData<l> f122594a;

    /* renamed from: b  reason: collision with root package name */
    private final t<l> f122595b;

    static {
        Covode.recordClassIndex(80446);
    }

    public m() {
        t<l> tVar = new t<>();
        this.f122595b = tVar;
        this.f122594a = tVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.f122595b.setValue(l.HIDDEN);
            return;
        }
        r.a("notifications_show", ag.a(v.a("status", "off")));
        this.f122595b.setValue(l.WITH_TEXT);
    }
}
