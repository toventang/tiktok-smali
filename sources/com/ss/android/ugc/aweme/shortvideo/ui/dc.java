package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.k.a;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dc implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131677a;

    static {
        Covode.recordClassIndex(86232);
    }

    dc(cj cjVar) {
        this.f131677a = cjVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        cj cjVar = this.f131677a;
        View view = (View) obj;
        if (!a.a() || !cj.j().booleanValue() || !cjVar.G) {
            return null;
        }
        view.setAlpha(0.34f);
        return null;
    }
}
