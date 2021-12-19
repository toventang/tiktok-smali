package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.c.c;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final f f72031a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f72032b;

    static {
        Covode.recordClassIndex(44252);
    }

    g(f fVar, Object[] objArr) {
        this.f72031a = fVar;
        this.f72032b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        f fVar = this.f72031a;
        Object[] objArr = this.f72032b;
        fVar.f72027b = (String) objArr[0];
        fVar.f72028c = (String) objArr[1];
        fVar.f72029d = (String) objArr[2];
        return CommentApi.a((String) objArr[0], (String) objArr[1], (String) objArr[2], c.a((String) objArr[3]));
    }
}
