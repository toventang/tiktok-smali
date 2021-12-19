package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

public final class ab extends aa {
    static {
        Covode.recordClassIndex(29081);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "LocalFileFetchProducer";
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        MethodCollector.i(13827);
        e b2 = b(new FileInputStream(bVar.getSourceFile().toString()), (int) bVar.getSourceFile().length());
        MethodCollector.o(13827);
        return b2;
    }

    public ab(Executor executor, i iVar) {
        super(executor, iVar);
    }
}
