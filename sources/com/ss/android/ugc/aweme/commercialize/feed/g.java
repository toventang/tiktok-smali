package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.commercialize.feed.assem.t;
import com.ss.android.ugc.aweme.feed.assem.f;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final bd f74206a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f74207b;

    static {
        Covode.recordClassIndex(45796);
    }

    static final class a extends m implements b<Assembler, z> {
        final /* synthetic */ Assembler $assembler$inlined;
        final /* synthetic */ v $this_apply;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(45797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(v vVar, g gVar, Assembler assembler) {
            super(1);
            this.$this_apply = vVar;
            this.this$0 = gVar;
            this.$assembler$inlined = assembler;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            final Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.$this_apply, (b<? super com.bytedance.assem.arch.core.m, z>) new b<com.bytedance.assem.arch.core.m, z>(this) {
                /* class com.ss.android.ugc.aweme.commercialize.feed.g.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(45798);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.m mVar) {
                    com.bytedance.assem.arch.core.m mVar2 = mVar;
                    l.d(mVar2, "");
                    mVar2.a(ab.a(t.class));
                    mVar2.f25578b = new t();
                    mVar2.f25580d = R.id.fjk;
                    assembler2.a(this.this$0.$this_apply, (b<? super i<c>, z>) new b<i<c>, z>(this) {
                        /* class com.ss.android.ugc.aweme.commercialize.feed.g.a.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(45799);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(i<c> iVar) {
                            i<c> iVar2 = iVar;
                            l.d(iVar2, "");
                            iVar2.a(new com.ss.android.ugc.aweme.commercialize.feed.assem.v(this.this$0.this$0.this$0.f74206a, this.this$0.this$0.$this_apply.ar_()));
                            iVar2.f25573b = "commerce_video_delegate_key";
                            return z.f158842a;
                        }
                    });
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public g(bd bdVar, Context context) {
        l.d(bdVar, "");
        l.d(context, "");
        this.f74206a = bdVar;
        this.f74207b = context;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.f
    public final void a(BaseFeedPageParams baseFeedPageParams, Assembler assembler, v<? extends d> vVar) {
        l.d(baseFeedPageParams, "");
        l.d(assembler, "");
        l.d(vVar, "");
        a aVar = new a(vVar, this, assembler);
        l.d(assembler, "");
        l.d(aVar, "");
        aVar.invoke(assembler);
    }
}
