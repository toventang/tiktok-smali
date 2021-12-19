package com.ss.android.ugc.aweme.commercialize.preview.manager;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.bytedance.tux.dialog.a f75045a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f75046b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46263);
    }

    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ h.f.a.a $onDialogShow;

        static {
            Covode.recordClassIndex(46266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.f.a.a aVar) {
            super(1);
            this.$onDialogShow = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            h.f.a.a aVar2 = this.$onDialogShow;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.a$a  reason: collision with other inner class name */
    public static final class C1708a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.a $onDialogDismiss;

        static {
            Covode.recordClassIndex(46264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1708a(h.f.a.a aVar) {
            super(1);
            this.$onDialogDismiss = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.q1, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.commercialize.preview.manager.a.C1708a.AnonymousClass1 */
                final /* synthetic */ C1708a this$0;

                static {
                    Covode.recordClassIndex(46265);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    com.bytedance.tux.dialog.b.a aVar2 = aVar;
                    l.d(aVar2, "");
                    aVar2.f44816b = true;
                    h.f.a.a aVar3 = this.this$0.$onDialogDismiss;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }
}
