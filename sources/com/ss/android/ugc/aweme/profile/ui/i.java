package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f117139a;

    /* renamed from: b  reason: collision with root package name */
    private final IAVDraftService f117140b;

    static {
        Covode.recordClassIndex(75656);
    }

    i(c cVar, IAVDraftService iAVDraftService) {
        this.f117139a = cVar;
        this.f117140b = iAVDraftService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.b(new k(this.f117139a, this.f117140b.draftList(false)));
        return null;
    }
}
