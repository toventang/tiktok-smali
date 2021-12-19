package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import com.ss.android.ugc.aweme.filter.repository.internal.l;
import com.ss.android.ugc.aweme.filter.repository.internal.m;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.c;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.u;
import java.io.File;
import java.io.IOException;

public class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private m f95652a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.filter.repository.a.l f95653b;

    static {
        Covode.recordClassIndex(60618);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String a(int i2) {
        return this.f95653b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String b(int i2) {
        return this.f95653b.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.l
    public final String c(int i2) {
        return this.f95653b.c(i2);
    }

    public e(com.ss.android.ugc.aweme.filter.repository.a.l lVar) {
        h.f.b.l.d(lVar, "");
        this.f95653b = lVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.l
    public final void a(m mVar) {
        h.f.b.l.d(mVar, "");
        this.f95652a = mVar;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.l
    public final d d(int i2) {
        String c2 = c(i2);
        return new d(c.a(c2), c2);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.l
    public boolean a(f fVar) {
        h.f.b.l.d(fVar, "");
        return f(fVar.f95550a);
    }

    private static boolean a(File file) {
        MethodCollector.i(9724);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.b(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(9724);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9724);
        return delete;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.ss.android.ugc.aweme.filter.repository.internal.l
    public final boolean e(int i2) {
        if (f(i2)) {
            return true;
        }
        String c2 = c(i2);
        File file = new File(c2);
        File file2 = new File(b(i2), a(i2));
        try {
            i.a(c2, false);
            i.a(file);
            u.a(file2, file);
            m mVar = this.f95652a;
            if (mVar != null) {
                mVar.a(file2);
            }
            a(file2);
            return true;
        } catch (IOException e2) {
            m mVar2 = this.f95652a;
            if (mVar2 != null) {
                mVar2.a(i2, file2, e2);
            }
            a(file2);
            return false;
        } catch (Throwable th) {
            a(file2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean f(int i2) {
        File[] listFiles;
        File file = new File(c(i2));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z = false;
        for (File file2 : listFiles) {
            h.f.b.l.b(file2, "");
            if (file2.isDirectory()) {
                String name = file2.getName();
                if (new File(file2.getAbsolutePath() + File.separator + name + ".png").exists() || new File(file2.getAbsolutePath() + File.separator + name + ".jpg").exists() || new File(file2.getAbsolutePath() + File.separator + name + ".JPG").exists()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
