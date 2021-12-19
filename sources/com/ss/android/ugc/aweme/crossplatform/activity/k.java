package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    Activity f78549a;

    /* renamed from: b  reason: collision with root package name */
    m f78550b;

    /* renamed from: c  reason: collision with root package name */
    String f78551c = "first jump: in allowlist\nsecond jump：no limit";

    /* renamed from: d  reason: collision with root package name */
    private c f78552d;

    static {
        Covode.recordClassIndex(48781);
    }

    public final void a() {
        c cVar;
        if (!b.a((Collection) e.f78539a) && (cVar = this.f78552d) != null) {
            cVar.a(e.f78539a);
        }
    }

    k(Activity activity, m mVar) {
        this.f78549a = activity;
        this.f78550b = mVar;
    }
}
