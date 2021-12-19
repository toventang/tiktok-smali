package com.ss.android.ugc.aweme.kids.intergration.common;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.e;
import com.bytedance.ies.uikit.a.d;

public final class a implements d.a, d.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106699a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(68196);
    }

    @Override // com.bytedance.ies.uikit.a.d.a
    public final void a(Activity activity) {
        if (activity != null) {
            e.a(activity);
        }
    }

    @Override // com.bytedance.ies.uikit.a.d.a
    public final void b(Activity activity) {
        if (activity != null) {
            e.b(activity);
        }
    }
}
