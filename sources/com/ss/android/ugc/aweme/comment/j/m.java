package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.i.f;
import java.util.concurrent.Callable;

final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f72052a;

    static {
        Covode.recordClassIndex(44260);
    }

    m(Object[] objArr) {
        this.f72052a = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CommentApi.a((f) this.f72052a[0]);
    }
}
