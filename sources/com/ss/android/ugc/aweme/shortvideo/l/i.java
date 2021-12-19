package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f128684a = new i();

    static {
        Covode.recordClassIndex(84353);
    }

    private i() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AVServiceImpl.a().tryCopyDuetDefaultLayout();
        return null;
    }
}
