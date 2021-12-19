package com.bytedance.android.live.liveinteract.platform.common.h;

import androidx.lifecycle.m;
import com.bytedance.android.live.liveinteract.cohost.a.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.live.liveinteract.cohost.ui.b.c;
import com.bytedance.android.live.liveinteract.linkroom.a.a.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(6564);
    }

    public static final d.AbstractC0159d a(m mVar) {
        l.d(mVar, "");
        return new c(mVar).b(w.a.MULTI_LIVE_ANCHOR_SETTING_FRAGMENT, a.c.C0189a.a());
    }

    public static final d.AbstractC0159d a(m mVar, boolean z) {
        l.d(mVar, "");
        return new c(mVar).b(w.a.INVITE_USER_LIST_FRAGMENT, b.c.a(z));
    }
}
