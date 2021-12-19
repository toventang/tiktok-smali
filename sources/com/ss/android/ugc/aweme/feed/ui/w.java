package com.ss.android.ugc.aweme.feed.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.l;
import java.util.concurrent.Callable;

final /* synthetic */ class w implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final p f95123a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95124b;

    static {
        Covode.recordClassIndex(60290);
    }

    w(p pVar, String str) {
        this.f95123a = pVar;
        this.f95124b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        p pVar = this.f95123a;
        String str = this.f95124b;
        l a2 = new l("enter_homepage_follow").a("open_app");
        a2.f109583a = "open_app";
        if (!TextUtils.isEmpty(str)) {
            a2.f109584b = str;
        }
        if (!(pVar.q == null || pVar.q.aD() == null)) {
            a2.f(pVar.q.aD());
        }
        a2.f();
        return null;
    }
}
