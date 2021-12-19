package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

final /* synthetic */ class cz implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f53031a = new cz();

    static {
        Covode.recordClassIndex(32745);
    }

    private cz() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
