package com.ss.android.ugc.aweme.photo;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f114897a;

    static {
        Covode.recordClassIndex(73901);
    }

    r(String str) {
        this.f114897a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new Pair(this.f114897a, null);
    }
}
