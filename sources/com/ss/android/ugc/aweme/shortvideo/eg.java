package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.l;
import com.google.c.h.a.u;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class eg implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f128416a = new eg();

    static {
        Covode.recordClassIndex(84210);
    }

    private eg() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        l.a(TTUploaderService.b().getUploadAuthKeyConfig(new HashMap(0)), new TTUploaderService.a(0), u.a.INSTANCE);
        return null;
    }
}
