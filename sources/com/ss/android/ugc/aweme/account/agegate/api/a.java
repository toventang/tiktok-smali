package com.ss.android.ugc.aweme.account.agegate.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f62625a;

    static {
        Covode.recordClassIndex(38552);
    }

    a(String str) {
        this.f62625a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Api.lambda$emailForExportVideo$0$Api(this.f62625a);
    }
}
