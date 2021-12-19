package com.bytedance.ies.bullet.ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.d;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.d.c;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.base.a.n;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.ui.common.c.c;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    final b f33107a;

    /* renamed from: b  reason: collision with root package name */
    private final c f33108b = new com.bytedance.ies.bullet.c.d.a();

    /* renamed from: c  reason: collision with root package name */
    private volatile String f33109c = "";

    static {
        Covode.recordClassIndex(19767);
    }

    @Override // com.bytedance.ies.bullet.ui.common.i
    public final b b() {
        return this.f33107a;
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public final void a() {
        this.f33108b.a();
        this.f33107a.a(Context.class);
        e.a.a().c(this.f33109c);
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends d<?, ?, ?, ?>> i a(Class<? extends T> cls) {
        l.c(cls, "");
        return this.f33108b.a(cls);
    }

    public e(Context context) {
        l.c(context, "");
        b bVar = new b();
        bVar.b(Context.class, context);
        this.f33107a = bVar;
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final i a(String str) {
        l.c(str, "");
        return this.f33108b.a(str);
    }

    static final class a extends m implements q<i, Uri, Boolean, z> {
        final /* synthetic */ h.f.a.b $providerFactoryHandler;
        final /* synthetic */ h.f.a.b $reject;
        final /* synthetic */ q $resolve;
        final /* synthetic */ h.f.a.b $viewComponentHandler;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(19768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, h.f.a.b bVar, h.f.a.b bVar2, q qVar, h.f.a.b bVar3) {
            super(3);
            this.this$0 = eVar;
            this.$providerFactoryHandler = bVar;
            this.$viewComponentHandler = bVar2;
            this.$resolve = qVar;
            this.$reject = bVar3;
        }

        /* renamed from: com.bytedance.ies.bullet.ui.common.e$a$a  reason: collision with other inner class name */
        static final class C0722a extends m implements h.f.a.b<List<? extends com.bytedance.ies.bullet.ui.common.c.d<View>>, z> {
            final /* synthetic */ com.bytedance.ies.bullet.ui.common.c.c $containerApi;
            final /* synthetic */ boolean $isNewInstance$inlined;
            final /* synthetic */ Uri $uri$inlined;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(19769);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0722a(com.bytedance.ies.bullet.ui.common.c.c cVar, a aVar, boolean z, Uri uri) {
                super(1);
                this.$containerApi = cVar;
                this.this$0 = aVar;
                this.$isNewInstance$inlined = z;
                this.$uri$inlined = uri;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.bytedance.ies.bullet.ui.common.c.d<View>> list) {
                List<? extends com.bytedance.ies.bullet.ui.common.c.d<View>> list2 = list;
                l.c(list2, "");
                if (!list2.isEmpty()) {
                    boolean z = false;
                    for (T t : list2) {
                        if (!z) {
                            this.$containerApi.a(t, this.$uri$inlined);
                            z = true;
                        }
                        this.$containerApi.a((com.bytedance.ies.bullet.ui.common.c.d) t);
                        this.this$0.$viewComponentHandler.invoke(t);
                    }
                    this.this$0.$resolve.invoke(this.$containerApi, list2, Boolean.valueOf(this.$isNewInstance$inlined));
                } else {
                    this.this$0.$reject.invoke(new IllegalStateException("initiateViewComponents failed for uri " + this.$uri$inlined));
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(i iVar, Uri uri, Boolean bool) {
            com.bytedance.ies.bullet.ui.common.c.c cVar;
            i iVar2 = iVar;
            Uri uri2 = uri;
            boolean booleanValue = bool.booleanValue();
            l.c(iVar2, "");
            l.c(uri2, "");
            if (!(!(iVar2 instanceof com.bytedance.ies.bullet.ui.common.c.c) || iVar2 == null || (cVar = (com.bytedance.ies.bullet.ui.common.c.c) iVar2) == null)) {
                if (booleanValue) {
                    this.$providerFactoryHandler.invoke(this.this$0.f33107a);
                    C0722a aVar = new C0722a(cVar, this, booleanValue, uri2);
                    l.c(aVar, "");
                    cVar.a(new c.a(cVar, aVar));
                } else {
                    this.$resolve.invoke(cVar, cVar.H, Boolean.valueOf(booleanValue));
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.c.d.a
    public final void a(d.b bVar) {
        l.c(bVar, "");
        this.f33108b.a(bVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.i
    public final void a(Uri uri, b bVar, h.f.a.b<? super b, z> bVar2, h.f.a.b<? super com.bytedance.ies.bullet.ui.common.c.d<? extends View>, z> bVar3, q<? super i, ? super List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>>, ? super Boolean, z> qVar, h.f.a.b<? super Throwable, z> bVar4) {
        String str;
        l.c(uri, "");
        l.c(bVar, "");
        l.c(bVar2, "");
        l.c(bVar3, "");
        l.c(qVar, "");
        l.c(bVar4, "");
        b bVar5 = this.f33107a;
        bVar5.a(bVar);
        bVar5.b(Uri.class, uri);
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) this.f33107a.c(com.bytedance.ies.bullet.c.i.class);
        if (iVar == null || (str = iVar.f32089a) == null) {
            str = n.a();
        }
        this.f33109c = str;
        Context context = (Context) this.f33107a.c(Context.class);
        if (context != null) {
            e.a.a().a(this.f33109c, context);
        }
        com.bytedance.ies.bullet.c.d.c cVar = this.f33108b;
        cVar.b(this.f33109c);
        cVar.a(uri, this.f33107a, new a(this, bVar2, bVar3, qVar, bVar4), bVar4);
    }
}
