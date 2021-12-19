package com.ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final NetWorkStateReceiver f76471a;

    static {
        Covode.recordClassIndex(47219);
    }

    d(NetWorkStateReceiver netWorkStateReceiver) {
        this.f76471a = netWorkStateReceiver;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f76471a.a();
    }
}
