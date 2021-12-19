package com.bytedance.ies.bullet.service.g.b;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.web.e;
import com.bytedance.ies.bullet.service.base.web.n;
import com.bytedance.webx.h.a.c;
import com.bytedance.webx.h.c.a;
import h.f.b.l;

public final class a extends com.bytedance.ies.bullet.service.base.b.a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final C0710a f32773a = new C0710a((byte) 0);

    static {
        Covode.recordClassIndex(19585);
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.b.a$a  reason: collision with other inner class name */
    public static final class C0710a {
        static {
            Covode.recordClassIndex(19586);
        }

        private C0710a() {
        }

        public /* synthetic */ C0710a(byte b2) {
            this();
        }
    }

    static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f32774a;

        static {
            Covode.recordClassIndex(19587);
        }

        b(n nVar) {
            this.f32774a = nVar;
        }

        @Override // com.bytedance.webx.h.a.c
        public final WebView a(Context context) {
            n.a aVar = this.f32774a.f32651b;
            if (aVar == null) {
                return null;
            }
            l.a((Object) context, "");
            return aVar.a(context);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.e
    public final WebView a(Context context, String str) {
        l.c(context, "");
        return com.bytedance.webx.h.a.f46014b.a(context, "webx_bullet");
    }

    @Override // com.bytedance.ies.bullet.service.base.web.e
    public final void a(Context context, n nVar) {
        l.c(context, "");
        l.c(nVar, "");
        if (nVar.f32651b != null) {
            com.bytedance.webx.h.a aVar = com.bytedance.webx.h.a.f46014b;
            if (com.bytedance.webx.h.a.f46013a == null) {
                com.bytedance.webx.h.a.f46013a = new com.bytedance.webx.h.b.a(context);
            }
            String str = nVar.f32650a;
            if (str == null) {
                str = "webx_bullet";
            }
            aVar.a(str, new a.C1143a().a(new b(nVar)).a(nVar.f32652c).a(nVar.f32653d).a());
        }
    }
}
