package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.upvote.service.a;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f94031a;

    static {
        Covode.recordClassIndex(59781);
    }

    i(List list) {
        this.f94031a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.f142308a.a(this.f94031a);
        return null;
    }
}
