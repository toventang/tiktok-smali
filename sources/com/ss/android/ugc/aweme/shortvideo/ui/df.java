package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.shortvideo.k.a;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class df implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131680a;

    /* renamed from: b  reason: collision with root package name */
    private final v f131681b;

    static {
        Covode.recordClassIndex(86235);
    }

    df(cj cjVar, v vVar) {
        this.f131680a = cjVar;
        this.f131681b = vVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        cj cjVar = this.f131680a;
        v vVar = this.f131681b;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        bd.a(cjVar.requireActivity(), booleanValue ? 1 : 0, cjVar.K, null, new er((CommonItemView) obj, vVar));
        if (a.a() && i.a.a() && !bool.booleanValue()) {
            vVar.f129892d = true;
        }
        return null;
    }
}
