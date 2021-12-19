package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.profile.ae;

final /* synthetic */ class ay implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72546a;

    static {
        Covode.recordClassIndex(44704);
    }

    ay(k kVar) {
        this.f72546a = kVar;
    }

    public final void run() {
        k kVar = this.f72546a;
        try {
            ae.f115954a.a(kVar.f72764c, bh.a(kVar.f72764c));
        } catch (Exception e2) {
            a.a("", e2);
        }
    }
}
