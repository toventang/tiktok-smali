package com.bytedance.geckox.e.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.c.c;
import com.bytedance.geckox.e;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.i;
import com.bytedance.geckox.utils.q;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.q.b;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public class a extends d<Pair<com.bytedance.geckox.buffer.a, UpdatePackage>, Pair<com.bytedance.geckox.buffer.a, UpdatePackage>> {

    /* renamed from: a  reason: collision with root package name */
    private e f29811a;

    static {
        Covode.recordClassIndex(17293);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f29811a = (e) objArr[0];
    }

    private static boolean a(File file) {
        MethodCollector.i(7389);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(7389);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7389);
        return delete;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* bridge */ /* synthetic */ Object a(b<Pair<com.bytedance.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bytedance.geckox.buffer.a, UpdatePackage> pair) {
        return a(bVar, pair);
    }

    private static Object a(b<Pair<com.bytedance.geckox.buffer.a, UpdatePackage>> bVar, Pair<com.bytedance.geckox.buffer.a, UpdatePackage> pair) {
        com.bytedance.geckox.i.a.a("start decompress zstd file, channel:", ((UpdatePackage) pair.second).getChannel());
        com.bytedance.geckox.buffer.a aVar = (com.bytedance.geckox.buffer.a) pair.first;
        aVar.b(0);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(aVar.f().getParentFile(), "res.zst.tmp");
        com.bytedance.geckox.utils.e.a(file);
        com.bytedance.geckox.buffer.a a2 = com.bytedance.geckox.buffer.impl.a.a(file, file.length());
        try {
            q.a(aVar, a2);
            a(aVar.f());
            a2.b(0);
            try {
                i.a(new com.bytedance.geckox.buffer.a.a(a2), updatePackage.getPackage().getDecompressMd5());
                try {
                    return bVar.a(new Pair<>(a2, updatePackage));
                } finally {
                    a2.e();
                }
            } catch (Throwable th) {
                a(a2.f());
                throw new com.bytedance.geckox.c.a(th.getMessage(), th);
            }
        } catch (Exception e2) {
            a(a2.f());
            throw new c(e2.getMessage(), e2);
        } catch (Throwable th2) {
            a(aVar.f());
            throw th2;
        }
    }
}
