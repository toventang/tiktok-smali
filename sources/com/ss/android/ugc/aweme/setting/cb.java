package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f122154a = new cb();

    static {
        Covode.recordClassIndex(80081);
    }

    private cb() {
    }

    public final void run() {
        AVExternalServiceImpl.a().initService().initTask(3, null);
    }
}
