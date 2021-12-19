package com.ss.android.ugc.aweme.story.edit.business.shared.f;

import android.app.Activity;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.y;
import h.m;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class f extends com.bytedance.als.j<e> implements com.bytedance.o.a, e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137442a = {new y(f.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new y(f.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new y(f.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final c f137443f = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final e f137444b = this;

    /* renamed from: c  reason: collision with root package name */
    final com.bytedance.als.g<g> f137445c = new k();

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f137446d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    final h.h f137447e = h.i.a(m.NONE, new a(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f137448g = com.bytedance.o.b.a.a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f137449h = com.bytedance.o.b.a.a(getDiContainer(), StoryEditModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f137450i = h.i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.o.f f137451j;

    static {
        Covode.recordClassIndex(89883);
    }

    public final VEEditClipCluster c() {
        return (VEEditClipCluster) this.f137448g.a(this, f137442a[0]);
    }

    public final StoryEditModel d() {
        return (StoryEditModel) this.f137449h.a(this, f137442a[1]);
    }

    public final b e() {
        return (b) this.f137450i.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(89886);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.shortvideo.publish.k {
        static {
            Covode.recordClassIndex(89893);
        }

        h() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            if (dVar instanceof d.c) {
                com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.f.e
    public final com.bytedance.als.g<g> b() {
        return this.f137445c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ e getApiComponent() {
        return this.f137444b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f137451j;
    }

    public static final class g implements z.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f137457a;

        static {
            Covode.recordClassIndex(89892);
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void a() {
            this.f137457a.invoke();
        }

        g(h.f.a.a aVar) {
            this.f137457a = aVar;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.edit.b.e> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(89884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.edit.b.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.ss.android.ugc.aweme.story.edit.b.e.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.f.f.a.invoke():com.bytedance.als.b");
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            com.ss.android.ugc.asve.editor.g gVar;
            Activity b2 = com.bytedance.als.dsl.g.b(this.this$0);
            VEEditClip vEEditClip = (VEEditClip) com.ss.android.ugc.aweme.story.edit.clip.a.b.a(this.this$0.c());
            if (vEEditClip != null) {
                gVar = com.ss.android.ugc.aweme.story.edit.clip.impl.a.a(vEEditClip);
            } else {
                gVar = null;
            }
            return new b(b2, gVar, (com.ss.android.ugc.aweme.story.edit.b.e) this.this$0.f137447e.getValue(), new com.ss.android.ugc.aweme.publish.a(true, AnonymousClass1.f137453a));
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f137454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.j f137455b;

        static {
            Covode.recordClassIndex(89889);
        }

        e(f fVar, b.j jVar) {
            this.f137454a = fVar;
            this.f137455b = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            f fVar = this.f137454a;
            com.ss.android.ugc.gamora.editor.sticker.core.a aVar = (com.ss.android.ugc.gamora.editor.sticker.core.a) fVar.f137446d.a(fVar, f.f137442a[2]);
            if (aVar == null) {
                return Boolean.valueOf(this.f137455b.a(h.z.f158842a));
            }
            aVar.a(false, (h.f.a.a<h.z>) new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.story.edit.business.shared.f.f.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(89890);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    this.this$0.f137455b.a(h.z.f158842a);
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            f fVar = this.this$0;
            AnonymousClass1 r4 = new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.story.edit.business.shared.f.f.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(89898);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new i(this.this$0.this$0, null), 3);
                    return h.z.f158842a;
                }
            };
            b.j jVar = new b.j();
            b.i.b(new e(fVar, jVar), b.i.f4825b);
            b.i<TResult> iVar = jVar.f4869a;
            l.b(iVar, "");
            b.i.b((Collection<? extends b.i<?>>) n.b(iVar, fVar.e().a())).a(new C3608f(r4), b.i.f4826c, null);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.f.e
    public final void a() {
        j jVar = new j(this);
        if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            q.b("story publish in children mode is not allowed");
        } else if (!com.ss.android.ugc.aweme.port.in.g.a().A().b()) {
            com.ss.android.ugc.tools.view.widget.d.c(com.ss.android.ugc.aweme.port.in.i.f115645a, R.string.g8i).b();
            com.ss.android.ugc.aweme.port.in.g.a().A().a(com.bytedance.als.dsl.g.b(this), "video_edit_page", "click_shoot", null, new g(jVar));
        } else {
            jVar.invoke();
        }
    }

    public static final class b implements h.h.d<Object, com.ss.android.ugc.gamora.editor.sticker.core.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f137452a;

        static {
            Covode.recordClassIndex(89885);
        }

        public b(com.bytedance.o.a aVar) {
            this.f137452a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.h.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a a(java.lang.Object r3, h.k.i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                h.f.b.l.d(r3, r0)
                h.f.b.l.d(r4, r0)
                com.bytedance.o.a r0 = r2.f137452a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.ss.android.ugc.aweme.story.edit.business.a.a.a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                java.lang.Object r0 = r1.a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.f.f.b.a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$f  reason: collision with other inner class name */
    static final class C3608f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f137456a;

        static {
            Covode.recordClassIndex(89891);
        }

        C3608f(h.f.a.a aVar) {
            this.f137456a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f137456a.invoke();
            return h.z.f158842a;
        }
    }

    public f(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f137451j = fVar;
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(89894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = fVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new i(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((i) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0129 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.shared.f.f.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
