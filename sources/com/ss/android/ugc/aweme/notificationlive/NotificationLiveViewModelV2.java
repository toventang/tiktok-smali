package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class NotificationLiveViewModelV2 extends AssemViewModel<y> {

    /* renamed from: j  reason: collision with root package name */
    private final u f114301j = new u();

    static {
        Covode.recordClassIndex(73499);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ y f() {
        return new y();
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationLiveViewModelV2 f114302a;

        static {
            Covode.recordClassIndex(73500);
        }

        public a(NotificationLiveViewModelV2 notificationLiveViewModelV2) {
            this.f114302a = notificationLiveViewModelV2;
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModelV2$a$a  reason: collision with other inner class name */
        static final class C2927a extends m implements b<y, y> {
            final /* synthetic */ w $it;

            static {
                Covode.recordClassIndex(73501);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2927a(w wVar) {
                super(1);
                this.$it = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ y invoke(y yVar) {
                y yVar2 = yVar;
                l.d(yVar2, "");
                return new y(this.$it.f114475a.f114478a, this.$it.f114477c, new r(), yVar2.f114484d);
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            w wVar = (w) ((com.bytedance.jedi.a.c.f) obj).a();
            if (wVar != null) {
                this.f114302a.a(new C2927a(wVar));
            }
        }
    }
}
