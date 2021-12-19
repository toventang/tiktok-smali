package com.ss.android.ugc.aweme.qrcode.e;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final File f119742a;

    static {
        Covode.recordClassIndex(77798);
    }

    f(File file) {
        this.f119742a = file;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return d.a(this.f119742a);
    }
}
