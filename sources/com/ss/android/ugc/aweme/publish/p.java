package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.j.c;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f118836a;

    static {
        Covode.recordClassIndex(77195);
    }

    p(String str) {
        this.f118836a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a().queryDraftWithUserId(this.f118836a);
    }
}
