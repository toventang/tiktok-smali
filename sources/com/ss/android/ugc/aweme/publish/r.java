package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.j.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f118838a;

    static {
        Covode.recordClassIndex(77197);
    }

    public r(String str) {
        this.f118838a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return c.a().queryDraftWithUserId(this.f118838a);
    }
}
