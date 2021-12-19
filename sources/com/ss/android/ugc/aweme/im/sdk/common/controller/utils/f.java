package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f102411a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(65558);
    }

    public static final class a extends m implements b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $negativeTextId;
        final /* synthetic */ Runnable $onConfirm;
        final /* synthetic */ int $positiveTextId = R.string.chh;

        static {
            Covode.recordClassIndex(65559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable) {
            super(1);
            this.$onConfirm = runnable;
            this.$negativeTextId = R.string.cdh;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.$positiveTextId, new b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.common.controller.utils.f.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(65560);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    Runnable runnable = this.this$0.$onConfirm;
                    if (runnable != null) {
                        runnable.run();
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(this.$negativeTextId, (b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }
}
