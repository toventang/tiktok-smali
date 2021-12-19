package com.ss.android.ugc.aweme.ah;

import android.app.Activity;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.j;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.a;
import com.bytedance.creativex.recorder.filter.panel.c;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.tools.view.a.c;
import com.ss.android.ugc.tools.view.a.e;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;

public final class d {
    static {
        Covode.recordClassIndex(40741);
    }

    public static final class b extends e {
        static {
            Covode.recordClassIndex(40747);
        }

        b() {
        }

        @Override // com.ss.android.ugc.tools.view.a.e
        public final c a(Object obj) {
            l.d(obj, "");
            if (obj instanceof Activity) {
                return bi.a((Activity) obj);
            }
            return super.a(obj);
        }
    }

    static final class a extends m implements h.f.a.b<a.C0604a, z> {
        final /* synthetic */ b $activityRegistryConverter;
        final /* synthetic */ f $diContainer;

        static {
            Covode.recordClassIndex(40742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, f fVar) {
            super(1);
            this.$activityRegistryConverter = bVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.C0604a aVar) {
            a.C0604a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f28309b = new h.f.a.b<c.C0605c, z>(this) {
                /* class com.ss.android.ugc.aweme.ah.d.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(40743);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(c.C0605c cVar) {
                    c.C0605c cVar2 = cVar;
                    l.d(cVar2, "");
                    b bVar = this.this$0.$activityRegistryConverter;
                    l.d(bVar, "");
                    cVar2.f28324a = bVar;
                    cVar2.f28325b = AnonymousClass1.f66315a;
                    return z.f158842a;
                }
            };
            aVar2.f28308a = new h.f.a.b<Activity, Boolean>(this) {
                /* class com.ss.android.ugc.aweme.ah.d.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(40745);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Boolean invoke(Activity activity) {
                    T t;
                    Activity activity2 = activity;
                    boolean z = false;
                    if (!g.a().A().b()) {
                        final z.e eVar = new z.e();
                        eVar.element = null;
                        eVar.element = (T) this.this$0.$diContainer.b(com.bytedance.creativex.recorder.b.a.d.class, null);
                        T t2 = eVar.element;
                        if ((t2 == null || !t2.b()) && (t = eVar.element) != null) {
                            t.b(false, new PrivacyCert(new j("1033"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
                        }
                        com.ss.android.ugc.aweme.port.in.z A = g.a().A();
                        if (activity2 == null) {
                            l.b();
                        }
                        A.a(activity2, "", "", null, new z.a() {
                            /* class com.ss.android.ugc.aweme.ah.d.a.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(40746);
                            }

                            @Override // com.ss.android.ugc.aweme.port.in.z.a
                            public final void a() {
                                T t;
                                T t2 = eVar.element;
                                if ((t2 == null || !t2.b()) && (t = eVar.element) != null) {
                                    t.a(false, new PrivacyCert(new j("1013"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
                                }
                            }

                            @Override // com.ss.android.ugc.aweme.port.in.z.a
                            public final void b() {
                                T t;
                                T t2 = eVar.element;
                                if ((t2 == null || !t2.b()) && (t = eVar.element) != null) {
                                    t.a(false, new PrivacyCert(new j("1014"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()}));
                                }
                            }
                        });
                    } else {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
            return h.z.f158842a;
        }
    }

    public static final com.bytedance.creativex.recorder.filter.panel.a a(com.bytedance.scene.group.b bVar, f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        return new com.bytedance.creativex.recorder.filter.panel.a(bVar, fVar, new com.ss.android.ugc.aweme.filter.view.internal.main.b(g.a().r().e(), g.a().r().d()), g.a().r().f().a(), new a(new b(), fVar));
    }
}
