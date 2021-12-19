package com.facebook.imagepipeline.n;

import android.content.ContentResolver;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.util.concurrent.Executor;

public final class ao extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f48202a;

    static {
        Covode.recordClassIndex(29112);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "QualifiedResourceFetchProducer";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        MethodCollector.i(11840);
        e b2 = b(this.f48202a.openInputStream(bVar.mSourceUri), -1);
        MethodCollector.o(11840);
        return b2;
    }

    public ao(Executor executor, i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f48202a = contentResolver;
    }
}
