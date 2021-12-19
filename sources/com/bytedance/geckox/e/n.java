package com.bytedance.geckox.e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.e;
import com.bytedance.q.b;
import com.bytedance.q.d;
import java.io.File;

public class n extends d<Pair<a, UpdatePackage>, Pair<UpdatePackage, Long>> {
    static {
        Covode.recordClassIndex(17310);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(b<Pair<UpdatePackage, Long>> bVar, Pair<a, UpdatePackage> pair) {
        MethodCollector.i(10874);
        Pair<a, UpdatePackage> pair2 = pair;
        com.bytedance.geckox.i.a.a("start active channel:", ((UpdatePackage) pair2.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        long version = updatePackage.getVersion();
        File a2 = b.a(updatePackage);
        File file = new File(a2.getParentFile(), String.valueOf(version));
        e.a(file);
        if (a2.renameTo(file)) {
            Object a3 = bVar.a(new Pair<>(updatePackage, Long.valueOf(version)));
            MethodCollector.o(10874);
            return a3;
        }
        RuntimeException runtimeException = new RuntimeException("active merged single file failed:" + a2.getAbsolutePath());
        MethodCollector.o(10874);
        throw runtimeException;
    }
}
