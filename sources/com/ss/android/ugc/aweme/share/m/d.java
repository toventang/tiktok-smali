package com.ss.android.ugc.aweme.share.m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f124083a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(81483);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ f $onClickDialogListener;

        static {
            Covode.recordClassIndex(81484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(1);
            this.$onClickDialogListener = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.bbm, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.m.d.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(81485);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    f fVar = this.this$0.$onClickDialogListener;
                    if (fVar != null) {
                        fVar.a();
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.bbp, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.m.d.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(81486);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    f fVar = this.this$0.$onClickDialogListener;
                    if (fVar != null) {
                        fVar.b();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ f $onClickDialogListener;

        static {
            Covode.recordClassIndex(81487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.$onClickDialogListener = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.b(R.string.bbp, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.share.m.d.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(81488);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    f fVar = this.this$0.$onClickDialogListener;
                    if (fVar != null) {
                        fVar.b();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static void a(Context context, String str, Integer num, f fVar) {
        l.d(context, "");
        l.d(str, "");
        com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).d(str).a(false);
        if (num != null && num.intValue() == 0) {
            c.a(bVar, new a(fVar));
        } else {
            c.a(bVar, new b(fVar));
        }
        bVar.a().b().show();
    }
}
