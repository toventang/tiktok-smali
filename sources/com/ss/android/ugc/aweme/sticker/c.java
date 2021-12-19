package com.ss.android.ugc.aweme.sticker;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class c implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final c f134724a = new c();

    private c() {
    }

    public static final class a implements aq {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f134725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f134727c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f134728d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f134729e;

        static {
            Covode.recordClassIndex(88060);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a() {
            this.f134725a.invoke();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.c$a$a  reason: collision with other inner class name */
        public static final class C3507a implements p.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f134730a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f134731b;

            static {
                Covode.recordClassIndex(88061);
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(int i2) {
                this.f134730a.f134727c.invoke(Integer.valueOf(i2));
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(String str) {
                l.d(str, "");
                this.f134730a.f134728d.invoke(this.f134731b, str);
            }

            C3507a(a aVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
                this.f134730a = aVar;
                this.f134731b = cVar;
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(Integer num, String str) {
                this.f134730a.f134725a.invoke();
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            boolean z;
            if (cVar == null) {
                this.f134725a.invoke();
                return;
            }
            String a2 = e.a(this.f134726b);
            p s = g.a().s();
            Application application = i.f115645a;
            l.b(application, "");
            Context applicationContext = application.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            l.b(applicationContext, "");
            if (!s.a(cVar, applicationContext, false)) {
                this.f134725a.invoke();
                return;
            }
            if (a2 == null || a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f134727c.invoke(100);
                this.f134728d.invoke(cVar, a2);
            } else if (!this.f134729e) {
                this.f134727c.invoke(100);
                this.f134728d.invoke(cVar, null);
            } else {
                p s2 = g.a().s();
                Application application2 = i.f115645a;
                l.b(application2, "");
                s2.a(application2, cVar, 0, new C3507a(this, cVar));
            }
        }

        a(h.f.a.a aVar, String str, b bVar, m mVar, boolean z) {
            this.f134725a = aVar;
            this.f134726b = str;
            this.f134727c = bVar;
            this.f134728d = mVar;
            this.f134729e = z;
        }
    }

    static {
        Covode.recordClassIndex(88059);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.t
    public final void a(String str, boolean z, b<? super Integer, z> bVar, m<? super g, ? super String, z> mVar, h.f.a.a<z> aVar) {
        l.d(str, "");
        l.d(bVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        g.a().s().a(str, new a(aVar, str, bVar, mVar, z));
    }
}
