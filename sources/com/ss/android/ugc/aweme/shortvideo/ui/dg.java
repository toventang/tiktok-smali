package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.shortvideo.k.a;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dg implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131682a;

    static {
        Covode.recordClassIndex(86236);
    }

    dg(cj cjVar) {
        this.f131682a = cjVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        cj cjVar = this.f131682a;
        View view = (View) obj;
        CommonItemView commonItemView = (CommonItemView) obj2;
        if (!a.a()) {
            return null;
        }
        if ((!i.a.a() && !cj.j().booleanValue()) || !cjVar.G) {
            return null;
        }
        view.setAlpha(0.34f);
        commonItemView.setChecked(false);
        return null;
    }
}
