package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;

final /* synthetic */ class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111896a;

    static {
        Covode.recordClassIndex(71920);
    }

    aq(ah ahVar) {
        this.f111896a = ahVar;
    }

    public final void run() {
        ah ahVar = this.f111896a;
        if (ahVar.getActivity() != null && !ahVar.getActivity().isFinishing() && ahVar.ab_()) {
            try {
                ahVar.ae.a();
            } catch (Exception e2) {
                a.a("", e2);
            }
        }
    }
}
