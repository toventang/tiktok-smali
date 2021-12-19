package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f72025a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f72026b;

    static {
        Covode.recordClassIndex(44249);
    }

    d(c cVar, Object[] objArr) {
        this.f72025a = cVar;
        this.f72026b = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f72025a;
        Object[] objArr = this.f72026b;
        cVar.f72022b = (String) objArr[0];
        if (objArr.length == 3) {
            return CommentApi.a((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
        }
        return CommentApi.a((String) objArr[0], ((Integer) objArr[1]).intValue());
    }
}
