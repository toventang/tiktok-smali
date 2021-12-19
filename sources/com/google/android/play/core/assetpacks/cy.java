package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

final /* synthetic */ class cy implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f53030a = new cy();

    static {
        Covode.recordClassIndex(32744);
    }

    private cy() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
