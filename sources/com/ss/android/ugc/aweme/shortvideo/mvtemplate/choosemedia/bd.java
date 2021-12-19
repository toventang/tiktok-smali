package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

final /* synthetic */ class bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MvImageChooseAdapter.e f129054a;

    /* renamed from: b  reason: collision with root package name */
    private final int f129055b = 4;

    static {
        Covode.recordClassIndex(84702);
    }

    bd(MvImageChooseAdapter.e eVar) {
        this.f129054a = eVar;
    }

    public final void run() {
        MvImageChooseAdapter.e eVar = this.f129054a;
        eVar.f128875g.setVisibility(this.f129055b);
    }
}
