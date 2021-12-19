package com.ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f66935a = new c();

    static {
        Covode.recordClassIndex(41250);
    }

    private c() {
    }

    public final void run() {
        Keva.getRepoSync("safemode", 1);
    }
}
