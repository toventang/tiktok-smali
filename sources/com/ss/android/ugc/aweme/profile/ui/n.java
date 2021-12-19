package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f117147a;

    /* renamed from: b  reason: collision with root package name */
    private final IAVDraftService f117148b;

    static {
        Covode.recordClassIndex(75661);
    }

    n(c cVar, IAVDraftService iAVDraftService) {
        this.f117147a = cVar;
        this.f117148b = iAVDraftService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f117147a.a(this.f117148b);
    }
}
