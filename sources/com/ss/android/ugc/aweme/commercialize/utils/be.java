package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f75662a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(46667);
    }

    public final boolean a() {
        return this.f75662a.compareAndSet(false, true);
    }
}
