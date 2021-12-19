package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.z;

public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    public final i f143712a;

    static {
        Covode.recordClassIndex(94026);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.m
    public final String b() {
        return "idle_preloader";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(i iVar, com.ss.android.ugc.aweme.video.preload.api.l lVar) {
        super(iVar);
        h.f.b.l.c(iVar, "");
        this.f143712a = iVar;
        if (lVar != null) {
            lVar.a(new a<z>(this) {
                /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(94027);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.c().post(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.l.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f143713a;

                        static {
                            Covode.recordClassIndex(94028);
                        }

                        {
                            this.f143713a = r1;
                        }

                        public final void run() {
                            i iVar = this.f143713a.this$0.f143712a;
                            if (iVar.f143707a == n.Idle) {
                                iVar.f143708b.b();
                            }
                        }
                    });
                    return z.f158842a;
                }
            });
        }
    }
}
