package com.ss.android.ugc.aweme.cs.e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import h.f.b.l;
import java.io.File;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f79040b = new a((byte) 0);

    static {
        Covode.recordClassIndex(49060);
    }

    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String f() {
        return "av-effect-model";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final String g() {
        return "effectmodel";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49061);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final b h() {
        return b.RESOURCE;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final void i() {
        super.i();
        com.ss.android.ugc.aweme.cs.a.a(true);
    }

    @Override // com.bytedance.u.a
    public final File c() {
        com.ss.android.ugc.aweme.cs.h.c c2 = g.a().g().c();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        return c2.a(filesDir, "effectmodel");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final boolean j() {
        if (!c().exists()) {
            return true;
        }
        com.ss.android.ugc.aweme.cs.d.b.a.c cVar = new com.ss.android.ugc.aweme.cs.d.b.a.c(com.ss.android.ugc.aweme.cs.d.b.a(), null, 2);
        cVar.f79016a = true;
        com.ss.android.ugc.aweme.cs.d.b.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a();
        aVar.a(cVar);
        aVar.a(c());
        cVar.a();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final long k() {
        com.ss.android.ugc.aweme.cs.d.b.a.a aVar = new com.ss.android.ugc.aweme.cs.d.b.a.a(null, null, 3);
        if (c().exists()) {
            com.ss.android.ugc.aweme.cs.d.b.a aVar2 = new com.ss.android.ugc.aweme.cs.d.b.a();
            aVar2.a(aVar);
            aVar2.a(c());
        }
        return aVar.f79012a + 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.cs.e.a
    public final void a(boolean z) {
        super.a(z);
        com.ss.android.ugc.aweme.cs.a.a(false);
    }
}
