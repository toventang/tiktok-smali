package com.ss.android.ugc.aweme.sticker.types.game;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f136103a;

    static {
        Covode.recordClassIndex(88903);
    }

    f(String str) {
        this.f136103a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return g.a().D().a(this.f136103a);
    }
}
