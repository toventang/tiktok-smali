package com.ss.android.ugc.aweme.story.edit.business.a.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.o;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.widget.k;
import com.ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.gamora.editor.aa;
import com.ss.android.ugc.gamora.editor.ab;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.y;
import h.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class b extends com.ss.android.ugc.gamora.editor.sticker.core.c implements com.ss.android.ugc.aweme.story.edit.clip.impl.b {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f137138b = {new y(b.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(b.class, "editCompileCallback", "getEditCompileCallback()Lcom/ss/android/ugc/gamora/editor/IEditCompileCallback;", 0), new y(b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final c f137139f = new c((byte) 0);
    private final h.h.d Q;
    private final h.h R;
    private final h.h.d S;
    private final h.h.d T;
    private final i U;
    private final h.h V;

    /* renamed from: c  reason: collision with root package name */
    k f137140c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f137141d = h.i.a(m.NONE, new C3592b(this));

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f137142e;

    static {
        Covode.recordClassIndex(89676);
    }

    private final VideoPublishEditModel ak() {
        return (VideoPublishEditModel) this.Q.a(this, f137138b[0]);
    }

    private final EditStickerViewModel al() {
        return (EditStickerViewModel) this.R.getValue();
    }

    private final ab am() {
        return (ab) this.S.a(this, f137138b[1]);
    }

    public final SafeHandler F() {
        return (SafeHandler) this.V.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(89679);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$b  reason: collision with other inner class name */
    public static final class C3592b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.editSticker.text.als.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(89678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3592b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.editSticker.text.als.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r1 = com.ss.android.ugc.aweme.editSticker.text.als.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.a.a.b.C3592b.invoke():com.bytedance.als.b");
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.a
    public final /* synthetic */ VEEditClipCluster cy_() {
        return (VEEditClipCluster) this.T.a(this, f137138b[2]);
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        G();
        F().removeCallbacks(this.f137142e);
    }

    public final void G() {
        try {
            k kVar = this.f137140c;
            if (kVar != null && kVar.isShowing()) {
                kVar.dismiss();
            }
            this.f137140c = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137147a;

        static {
            Covode.recordClassIndex(89684);
        }

        h(b bVar) {
            this.f137147a = bVar;
        }

        public final void run() {
            if (this.f137147a.f42913m != null) {
                Activity activity = this.f137147a.f42913m;
                if (activity == null || !activity.isFinishing()) {
                    b bVar = this.f137147a;
                    bVar.G();
                    try {
                        Activity t = bVar.t();
                        l.b(t, "");
                        k kVar = new k(t);
                        kVar.show();
                        bVar.f137140c = kVar;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(89677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_isolate_sticker_StoryEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_story_edit_business_isolate_sticker_StoryEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.business.a.a.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_story_edit_business_isolate_sticker_StoryEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class i implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137148a;

        static {
            Covode.recordClassIndex(89685);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(b bVar) {
            this.f137148a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            l.d(str, "");
            StoryEditClipModel d2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.d(this.f137148a);
            if (d2 == null) {
                return "";
            }
            String a2 = com.ss.android.ugc.aweme.story.base.b.b.a(d2.getSessionId(), "sticker_cache/".concat(String.valueOf(str)));
            d2.getStickerCacheDirMap().put(str, a2);
            return a2;
        }
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.gamora.editor.sticker.core.c
    public final void a(Bundle bundle) {
        super.a(bundle);
        selectNonNullSubscribe(al(), c.f137149a, new ah(), new f(this));
        selectNonNullSubscribe(al(), d.f137150a, new ah(), new g(this));
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f137143a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f137144b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f137145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f137146d;

        static {
            Covode.recordClassIndex(89680);
        }

        d(b bVar, h.f.a.a aVar, long j2, boolean z) {
            this.f137143a = bVar;
            this.f137144b = aVar;
            this.f137145c = j2;
            this.f137146d = z;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f137143a.F().removeCallbacks(this.f137143a.f137142e);
            this.f137143a.G();
            this.f137143a.a(false);
            this.f137143a.ai();
            this.f137144b.invoke();
            q.a("EditSticker,compile sticker finish,time cost:" + (System.currentTimeMillis() - this.f137145c) + ",needExpand:" + this.f137146d);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.o.f fVar) {
        super(fVar);
        l.d(fVar, "");
        this.Q = com.bytedance.o.b.a.a(fVar, VideoPublishEditModel.class);
        h.k.c a2 = h.f.b.ab.a(EditStickerViewModel.class);
        this.R = h.i.a((h.f.a.a) new a(this, a2, a2));
        this.S = com.bytedance.o.b.a.a(fVar, ab.class);
        this.T = com.bytedance.o.b.a.a(fVar, VEEditClipCluster.class);
        this.U = new i(this);
        this.f137142e = new h(this);
        this.V = h.i.a((h.f.a.a) new e(this));
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, com.bytedance.jedi.arch.k, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, com.bytedance.jedi.arch.k kVar) {
            com.bytedance.jedi.arch.k kVar2 = kVar;
            l.d(bVar, "");
            l.d(kVar2, "");
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = (com.ss.android.ugc.aweme.editSticker.text.als.a) this.this$0.f137141d.getValue();
            if (aVar != null) {
                aVar.e(kVar2.f39404b.booleanValue());
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, o<Boolean, Boolean, h.f.a.a<? extends z>>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, o<Boolean, Boolean, h.f.a.a<? extends z>> oVar) {
            o<Boolean, Boolean, h.f.a.a<? extends z>> oVar2 = oVar;
            l.d(bVar, "");
            l.d(oVar2, "");
            T t = oVar2.f39404b;
            this.this$0.a(((Boolean) t.getFirst()).booleanValue(), ((Boolean) t.getSecond()).booleanValue(), (h.f.a.a) t.getThird());
            return z.f158842a;
        }
    }

    public final void a(boolean z, boolean z2, h.f.a.a<z> aVar) {
        com.ss.android.ugc.aweme.editSticker.text.a.c a2;
        String str;
        String effectId;
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar2 = this.M;
        if (aVar2 != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<com.ss.android.ugc.aweme.editSticker.text.view.q> r = aVar2.r();
            int size = r.size();
            for (int i2 = 0; i2 < size; i2++) {
                TextStickerData data = r.get(i2).getData();
                if (!(data == null || (a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(data.getFontType())) == null)) {
                    if (a2.f88294b == null) {
                        str = "";
                    } else {
                        str = a2.f88294b;
                    }
                    sb.append(str);
                    if (a2.f88301i == null) {
                        effectId = "";
                    } else {
                        effectId = a2.f88301i.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i2 != r.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            ak().textTypes = sb.toString();
            ak().textEffectIds = sb2.toString();
        } else {
            ak().textTypes = "";
            ak().textEffectIds = "";
        }
        com.ss.android.ugc.asve.editor.g b2 = com.ss.android.ugc.aweme.story.edit.clip.impl.a.b(this);
        if (b2 != null) {
            bq T2 = Y().T();
            com.ss.android.ugc.aweme.editSticker.interact.d[] dVarArr = new com.ss.android.ugc.aweme.editSticker.interact.d[9];
            dVarArr[0] = Z().h();
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar3 = this.M;
            dVarArr[1] = aVar3 != null ? aVar3.q() : null;
            dVarArr[2] = Q().i();
            dVarArr[3] = R().c();
            aa aaVar = this.f146432k;
            dVarArr[4] = aaVar != null ? aaVar.L() : null;
            com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = ((com.ss.android.ugc.gamora.editor.sticker.core.c) this).f146430i;
            dVarArr[5] = hVar != null ? hVar.K() : null;
            com.ss.android.ugc.gamora.editor.o oVar = this.t;
            dVarArr[6] = oVar != null ? ((com.ss.android.ugc.gamora.editor.a) oVar).f145663b : null;
            com.ss.android.ugc.gamora.editor.l lVar = this.u;
            dVarArr[7] = lVar != null ? ((com.ss.android.ugc.gamora.editor.a) lVar).f145663b : null;
            com.ss.android.ugc.gamora.editor.subtitle.b bVar = this.v;
            dVarArr[8] = bVar != null ? bVar.C() : null;
            boolean a3 = com.ss.android.ugc.aweme.shortvideo.edit.y.a(b2, T2, dVarArr);
            Y().T().a(a3, false);
            a(true);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(b(b2, am(), this.U));
            }
            if (z) {
                View view = this.n;
                l.b(view, "");
                view.setVisibility(4);
            }
            arrayList.add(a(b2, am(), this.U));
            b.i<Void> b3 = b.i.b((Collection<? extends b.i<?>>) arrayList);
            l.b(b3, "");
            if (!b3.a()) {
                F().postDelayed(this.f137142e, 500);
            }
            b3.a(new d(this, aVar, currentTimeMillis, a3), b.i.f4826c, null);
        }
    }
}
