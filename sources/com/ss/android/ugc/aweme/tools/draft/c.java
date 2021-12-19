package com.ss.android.ugc.aweme.tools.draft;

import b.i;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f139451a;

    /* renamed from: b  reason: collision with root package name */
    private final List f139452b;

    static {
        Covode.recordClassIndex(91189);
    }

    c(a aVar, List list) {
        this.f139451a = aVar;
        this.f139452b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        for (com.ss.android.ugc.aweme.draft.model.c cVar : this.f139452b) {
            if (cVar.y) {
                a.a(cVar);
                i.b(new f(cVar), i.f4826c);
            }
        }
        return null;
    }
}
