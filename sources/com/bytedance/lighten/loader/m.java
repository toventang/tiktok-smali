package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.d.b;
import com.facebook.c.a.c;
import com.facebook.c.a.e;
import com.facebook.imagepipeline.e.k;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class m extends com.facebook.c.a.a {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<e, List<SoftReference<b>>> f39987a;

    interface b {
        static {
            Covode.recordClassIndex(24656);
        }

        void a(File file);
    }

    static {
        Covode.recordClassIndex(24653);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f39990a = new m((byte) 0);

        static {
            Covode.recordClassIndex(24655);
        }
    }

    private m() {
        this.f39987a = new ConcurrentHashMap<>();
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    @Override // com.facebook.c.a.a, com.facebook.c.a.d
    public final void a(c cVar) {
        final e a2 = cVar.a();
        b.a.f39818a.execute(new Runnable() {
            /* class com.bytedance.lighten.loader.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24654);
            }

            public final void run() {
                e eVar;
                File file;
                b bVar;
                if (!(m.this.f39987a.size() == 0 || (eVar = a2) == null)) {
                    com.facebook.b.a a2 = k.a().d().a(eVar);
                    if (a2 == null) {
                        a2 = k.a().h().a(eVar);
                    }
                    if ((a2 instanceof com.facebook.b.b) && (file = ((com.facebook.b.b) a2).f46951a) != null && file.exists()) {
                        m mVar = m.this;
                        e eVar2 = a2;
                        List<SoftReference<b>> list = mVar.f39987a.get(eVar2);
                        if (!(list == null || list.isEmpty())) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                SoftReference<b> softReference = list.get(i2);
                                if (!(softReference == null || (bVar = softReference.get()) == null)) {
                                    bVar.a(file);
                                }
                            }
                            mVar.f39987a.remove(eVar2);
                        }
                    }
                }
            }
        });
    }
}
