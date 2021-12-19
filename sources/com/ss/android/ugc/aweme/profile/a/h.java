package com.ss.android.ugc.aweme.profile.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final e f115845a;

    static {
        Covode.recordClassIndex(74723);
    }

    h(e eVar) {
        this.f115845a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(AVExternalServiceImpl.a().draftService().draftList(false).size());
    }
}
