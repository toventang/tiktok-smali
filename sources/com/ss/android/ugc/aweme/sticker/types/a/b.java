package com.ss.android.ugc.aweme.sticker.types.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f135749a;

    static {
        Covode.recordClassIndex(88732);
    }

    b(String str) {
        this.f135749a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return g.a().D().a(this.f135749a);
    }
}
