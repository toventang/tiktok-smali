package com.ss.android.ugc.aweme.sticker;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class o implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final o f134974a = new o();

    private o() {
    }

    public static final class a implements aq {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f134975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f134976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f134977c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f134978d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f134979e;

        static {
            Covode.recordClassIndex(88257);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a() {
            this.f134975a.invoke();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.o$a$a  reason: collision with other inner class name */
        public static final class C3516a implements p.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f134980a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f134981b;

            static {
                Covode.recordClassIndex(88258);
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(int i2) {
                this.f134980a.f134977c.invoke(Integer.valueOf(i2));
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(String str) {
                l.d(str, "");
                this.f134980a.f134978d.invoke(this.f134981b, str);
            }

            C3516a(a aVar, c cVar) {
                this.f134980a = aVar;
                this.f134981b = cVar;
            }

            @Override // com.ss.android.ugc.aweme.port.in.p.a
            public final void a(Integer num, String str) {
                this.f134980a.f134975a.invoke();
            }
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a(c cVar) {
            boolean z;
            if (cVar == null) {
                this.f134975a.invoke();
            } else if (!AVCommerceServiceImpl.h().a() || cVar.isCommerceMusic()) {
                String a2 = e.a(this.f134976b);
                p s = g.a().s();
                Application application = i.f115645a;
                l.b(application, "");
                Context applicationContext = application.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                l.b(applicationContext, "");
                if (!s.a(cVar, applicationContext, false)) {
                    this.f134975a.invoke();
                    return;
                }
                if (a2 == null || a2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && FileUtils.INSTANCE.checkFileExists(a2)) {
                    this.f134977c.invoke(100);
                    this.f134978d.invoke(cVar, a2);
                } else if (!this.f134979e) {
                    this.f134977c.invoke(100);
                    this.f134978d.invoke(cVar, null);
                } else {
                    p s2 = g.a().s();
                    Application application2 = i.f115645a;
                    l.b(application2, "");
                    s2.a(application2, cVar, 0, new C3516a(this, cVar));
                }
            } else {
                this.f134975a.invoke();
            }
        }

        a(h.f.a.a aVar, String str, b bVar, m mVar, boolean z) {
            this.f134975a = aVar;
            this.f134976b = str;
            this.f134977c = bVar;
            this.f134978d = mVar;
            this.f134979e = z;
        }
    }

    static {
        Covode.recordClassIndex(88256);
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
