package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class ai implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ae f128917a;

    static {
        Covode.recordClassIndex(84594);
    }

    ai(ae aeVar) {
        this.f128917a = aeVar;
    }

    public final void run() {
        ae aeVar = this.f128917a;
        aeVar.f128905f.setTranslationY((float) (-aeVar.f128905f.getHeight()));
    }
}
