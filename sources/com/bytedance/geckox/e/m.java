package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public class m extends d<UpdatePackage, UpdatePackage> {

    /* renamed from: a  reason: collision with root package name */
    private a f29838a;

    static {
        Covode.recordClassIndex(17309);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f29838a = (a) objArr[0];
    }

    private static boolean a(File file) {
        MethodCollector.i(7928);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7928);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7928);
        return delete;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(com.bytedance.q.b<com.bytedance.geckox.model.UpdatePackage> r21, com.bytedance.geckox.model.UpdatePackage r22) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.e.m.a(com.bytedance.q.b, com.bytedance.geckox.model.UpdatePackage):java.lang.Object");
    }
}
