package com.ss.ugc.live.a.a.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.ugc.live.a.a.a;
import com.ss.ugc.live.a.a.c;
import java.io.File;

public final class b implements a<String>, d<String> {

    /* renamed from: a  reason: collision with root package name */
    private d<String> f154012a;

    /* renamed from: b  reason: collision with root package name */
    private a<String> f154013b;

    static {
        Covode.recordClassIndex(102711);
    }

    public b(d dVar) {
        this.f154012a = dVar;
    }

    private static boolean a(File file) {
        MethodCollector.i(7526);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7526);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7526);
        return delete;
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, int i2) {
        a<String> aVar = this.f154013b;
        if (aVar != null) {
            aVar.a(cVar, i2);
        }
    }

    @Override // com.ss.ugc.live.a.a.d.d
    public final void a(c cVar, a<String> aVar) {
        this.f154013b = aVar;
        this.f154012a.a(cVar, this);
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, com.ss.ugc.live.a.a.c.a aVar) {
        a<String> aVar2 = this.f154013b;
        if (aVar2 != null) {
            aVar2.a(cVar, aVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.ss.ugc.live.a.a.a
    public final /* synthetic */ void a(c cVar, String str) {
        String str2 = str;
        try {
            File file = new File(str2);
            String a2 = com.ss.ugc.live.a.a.e.a.a(file);
            if (!cVar.f154008e.equals(a2)) {
                a(cVar, (com.ss.ugc.live.a.a.c.a) new com.ss.ugc.live.a.a.c.b(com.a.a("File %1$s md5 is not equals", new Object[]{str2}), cVar, a2));
                a(file);
                return;
            }
            a<String> aVar = this.f154013b;
            if (aVar != null) {
                aVar.a(cVar, str2);
            }
        } catch (Exception e2) {
            a(cVar, (com.ss.ugc.live.a.a.c.a) new com.ss.ugc.live.a.a.c.b(com.a.a("File %1$s md5 error", new Object[]{str2}), e2, cVar, ""));
        }
    }
}
