package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;

public final class NotificationLiveViewModel extends JediViewModel<ResponseState> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114297a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final u f114298b = new u();

    static {
        Covode.recordClassIndex(73493);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73494);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ ResponseState d() {
        return new ResponseState(0, 0, null, null, 15, null);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationLiveViewModel f114299a;

        static {
            Covode.recordClassIndex(73495);
        }

        b(NotificationLiveViewModel notificationLiveViewModel) {
            this.f114299a = notificationLiveViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final w wVar = (w) obj;
            this.f114299a.c(new h.f.a.b<ResponseState, ResponseState>() {
                /* class com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73496);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                    ResponseState responseState2 = responseState;
                    l.d(responseState2, "");
                    return ResponseState.copy$default(responseState2, wVar.f114475a.f114478a, wVar.f114477c, null, new r(), 4, null);
                }
            });
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationLiveViewModel f114300a;

        static {
            Covode.recordClassIndex(73497);
        }

        c(NotificationLiveViewModel notificationLiveViewModel) {
            this.f114300a = notificationLiveViewModel;
        }

        static final class a extends m implements h.f.a.b<ResponseState, ResponseState> {
            final /* synthetic */ w $it;

            static {
                Covode.recordClassIndex(73498);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(w wVar) {
                super(1);
                this.$it = wVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                ResponseState responseState2 = responseState;
                l.d(responseState2, "");
                return ResponseState.copy$default(responseState2, this.$it.f114475a.f114478a, this.$it.f114477c, new r(), null, 8, null);
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            w wVar = (w) ((com.bytedance.jedi.a.c.f) obj).a();
            if (wVar != null) {
                this.f114300a.c(new a(wVar));
            }
        }
    }

    public final void a(v vVar) {
        l.d(vVar, "");
        f.a.b.b d2 = this.f114298b.a(vVar).d(new b(this));
        l.b(d2, "");
        a(d2);
    }

    public final void a(String str) {
        l.d(str, "");
        f.a.b.b d2 = u.a(str).d(new c(this));
        l.b(d2, "");
        a(d2);
    }
}
