package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.aj;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class NotificationGameViewModel extends AssemViewModel<b> {

    /* renamed from: j  reason: collision with root package name */
    private final h f114290j = com.bytedance.assem.arch.a.c.a(this, c.f114294a);

    static {
        Covode.recordClassIndex(73485);
    }

    static final class c extends m implements h.f.a.a<com.bytedance.assem.arch.a.a<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114294a = new c();

        static {
            Covode.recordClassIndex(73490);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.assem.arch.a.a<f> invoke() {
            return new e();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ b f() {
        return new b();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationGameViewModel f114293a;

        static {
            Covode.recordClassIndex(73488);
        }

        b(NotificationGameViewModel notificationGameViewModel) {
            this.f114293a = notificationGameViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f114293a.a(new h.f.a.b<b, b>() {
                /* class com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73489);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ b invoke(b bVar) {
                    b bVar2 = bVar;
                    l.d(bVar2, "");
                    Throwable th = th;
                    l.b(th, "");
                    return b.a(bVar2, new com.bytedance.jedi.arch.f(th), -1, new d());
                }
            });
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationGameViewModel f114291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f114292b;

        static {
            Covode.recordClassIndex(73486);
        }

        a(NotificationGameViewModel notificationGameViewModel, g gVar) {
            this.f114291a = notificationGameViewModel;
            this.f114292b = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final h hVar = (h) obj;
            this.f114291a.a(new h.f.a.b<b, b>(this) {
                /* class com.ss.android.ugc.aweme.notificationlive.NotificationGameViewModel.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(73487);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ b invoke(b bVar) {
                    b bVar2 = bVar;
                    l.d(bVar2, "");
                    return b.a(bVar2, new aj(Boolean.valueOf(this.this$0.f114292b.f114319a)), hVar.f114323b, new d());
                }
            });
            if (hVar.f114323b == 0) {
                com.ss.android.ugc.d.a.c.a(new i(this.f114292b.f114320b, this.f114292b.f114319a));
            }
        }
    }

    public final void a(g gVar) {
        l.d(gVar, "");
        f.a.b.b a2 = ((f) ((com.bytedance.assem.arch.a.a) this.f114290j.getValue()).a()).a(gVar.f114319a, gVar.f114320b, gVar.f114321c).a(new a(this, gVar), new b(this));
        l.b(a2, "");
        a(a2);
    }
}
