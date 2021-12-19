package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cz.a.m;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.b;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.a {
    static {
        Covode.recordClassIndex(91866);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.a$a  reason: collision with other inner class name */
    public static final class C3719a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140685a;

        static {
            Covode.recordClassIndex(91867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3719a(a aVar) {
            this.f140685a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.m
        public final void a(String str, String str2) {
            l.d(str, "");
            this.f140685a.f140641b.a("upload pictures", "success");
            this.f140685a.f140641b.f140703a = System.currentTimeMillis();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.e
    public final void a(Object obj) {
        this.f140641b.f140703a = System.currentTimeMillis();
        aa aaVar = (aa) g.a().s();
        if (aaVar == null || this.f140642c.f140681j == null) {
            this.f140641b.a("upload pictures", "failed.");
            com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar = this.f140642c.f140680i;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        aaVar.k().b(new C3719a(this));
    }
}
