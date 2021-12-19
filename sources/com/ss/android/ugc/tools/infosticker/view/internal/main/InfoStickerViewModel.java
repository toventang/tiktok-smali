package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.infosticker.a.a.f;
import com.ss.android.ugc.tools.infosticker.view.internal.e;
import com.ss.android.ugc.tools.infosticker.view.internal.h;
import com.ss.android.ugc.tools.infosticker.view.internal.i;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.infosticker.view.internal.l;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.a.n;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public final class InfoStickerViewModel extends HumbleViewModel implements au, l {

    /* renamed from: a  reason: collision with root package name */
    public boolean f149656a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f149657b;

    /* renamed from: c  reason: collision with root package name */
    final com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> f149658c;

    /* renamed from: d  reason: collision with root package name */
    final e<Effect> f149659d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedBlockingQueue<Effect> f149660e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f149661f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f149662g;

    /* renamed from: h  reason: collision with root package name */
    private final f.a.b.a f149663h;

    /* renamed from: i  reason: collision with root package name */
    private final d f149664i;

    /* renamed from: j  reason: collision with root package name */
    private final m f149665j;

    /* renamed from: k  reason: collision with root package name */
    private final String f149666k;

    /* renamed from: l  reason: collision with root package name */
    private final String f149667l;

    /* renamed from: m  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.d f149668m;
    private final com.ss.android.ugc.tools.infosticker.a.a.b n;
    private final f o;
    private final k<Effect> p;
    private final k<Effect> q;
    private final h<ProviderEffect> r;
    private final k<ProviderEffect> s;
    private final i<InfoStickerEffect> t;
    private final k<InfoStickerEffect> u;
    private final com.ss.android.ugc.tools.infosticker.view.internal.d v;
    private final h.f.a.b<com.ss.android.ugc.tools.h.a.b, e<Effect>> w;
    private final h.f.a.a<k<Effect>> x;

    static {
        Covode.recordClassIndex(98547);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final com.ss.android.ugc.tools.infosticker.view.internal.d a() {
        return this.v;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> b() {
        return this.f149658c;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final k<Effect> c() {
        return this.p;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final e<Effect> d() {
        return this.f149659d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final k<Effect> e() {
        return this.q;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final h<ProviderEffect> f() {
        return this.r;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final k<ProviderEffect> g() {
        return this.s;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final com.ss.android.ugc.tools.infosticker.view.internal.i<InfoStickerEffect> h() {
        return this.t;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final k<InfoStickerEffect> i() {
        return this.u;
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.s.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerViewModel f149672a;

        static {
            Covode.recordClassIndex(98553);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.s.a
        public final void a() {
            if (com.ss.android.ugc.aweme.shortvideo.s.c.c(this.f149672a.f149657b)) {
                this.f149672a.j();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(InfoStickerViewModel infoStickerViewModel) {
            this.f149672a = infoStickerViewModel;
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f149660e.clear();
        this.f149663h.dispose();
        com.ss.android.ugc.aweme.shortvideo.s.b.b(this.f149664i);
    }

    public final void j() {
        if (!isDestroyed() && this.f149661f && !this.f149656a && !com.ss.android.ugc.aweme.shortvideo.s.c.c(this.f149657b)) {
            this.f149656a = true;
            k();
        }
    }

    private final void k() {
        Effect poll = this.f149660e.poll();
        if (poll == null) {
            this.f149656a = false;
            return;
        }
        this.f149663h.a(this.f149668m.a(poll, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new b(this), new c(this)));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final void a(boolean z) {
        this.f149661f = z;
        if (z) {
            j();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerViewModel f149671a;

        static {
            Covode.recordClassIndex(98552);
        }

        c(InfoStickerViewModel infoStickerViewModel) {
            this.f149671a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149671a.f149656a = false;
            this.f149671a.j();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f<com.ss.android.ugc.tools.infosticker.a.a.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerViewModel f149670a;

        static {
            Covode.recordClassIndex(98551);
        }

        b(InfoStickerViewModel infoStickerViewModel) {
            this.f149670a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.infosticker.a.a.h hVar) {
            com.ss.android.ugc.tools.infosticker.a.a.h hVar2 = hVar;
            if (hVar2.f149358b.f149380a == com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOAD_SUCCESS || hVar2.f149358b.f149380a == com.ss.android.ugc.tools.infosticker.a.a.l.INFO_STICKER_STATE_DOWNLOAD_FAILED) {
                this.f149670a.f149656a = false;
                this.f149670a.j();
            }
        }
    }

    static final class a<T> implements u<List<? extends com.ss.android.ugc.tools.h.a.m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerViewModel f149669a;

        static {
            Covode.recordClassIndex(98550);
        }

        a(InfoStickerViewModel infoStickerViewModel) {
            this.f149669a = infoStickerViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends com.ss.android.ugc.tools.h.a.m> list) {
            com.ss.android.ugc.tools.h.a.m mVar;
            e<Effect> eVar;
            List<? extends com.ss.android.ugc.tools.h.a.m> list2 = list;
            if (list2 != null && (mVar = (com.ss.android.ugc.tools.h.a.m) n.h((List) list2)) != null) {
                com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar = this.f149669a.f149658c;
                if (aVar != null) {
                    aVar.a(mVar);
                }
                com.ss.android.ugc.tools.h.a.m mVar2 = (com.ss.android.ugc.tools.h.a.m) n.b((List) list2, 1);
                if (mVar2 != null && (eVar = this.f149669a.f149659d) != null) {
                    eVar.a(mVar2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.l
    public final void a(List<? extends Effect> list) {
        h.f.b.l.d(list, "");
        if (!isDestroyed()) {
            this.f149660e.addAll(list);
            if (!this.f149662g) {
                com.ss.android.ugc.aweme.shortvideo.s.b.a(this.f149657b);
                com.ss.android.ugc.aweme.shortvideo.s.b.b(this.f149664i);
                this.f149662g = true;
            }
            j();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InfoStickerViewModel(android.content.Context r15, final androidx.lifecycle.m r16, final com.ss.android.ugc.tools.infosticker.a.a.d r17, com.ss.android.ugc.tools.infosticker.a.a.b r18, com.ss.android.ugc.tools.infosticker.view.internal.a r19) {
        /*
            r14 = this;
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel r6 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel
            r2 = r16
            r3 = r17
            r6.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerEmojiListViewModel r7 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerEmojiListViewModel
            r7.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel r8 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel
            r8.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel r9 = new com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel
            r4 = r18
            r9.<init>(r2, r4)
            r10 = r9
            com.ss.android.ugc.tools.infosticker.view.internal.k r10 = (com.ss.android.ugc.tools.infosticker.view.internal.k) r10
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel r11 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListMetaViewModel
            r11.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$1 r12 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$1
            r12.<init>(r2, r3)
            com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$2 r13 = new com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel$2
            r13.<init>(r2, r3)
            r0 = r14
            r5 = r19
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerViewModel.<init>(android.content.Context, androidx.lifecycle.m, com.ss.android.ugc.tools.infosticker.a.a.d, com.ss.android.ugc.tools.infosticker.a.a.b, com.ss.android.ugc.tools.infosticker.view.internal.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super com.ss.android.ugc.tools.h.a.b, ? extends com.ss.android.ugc.tools.infosticker.view.internal.e<com.ss.android.ugc.effectmanager.effect.model.Effect>> */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.view.internal.k<com.ss.android.ugc.effectmanager.effect.model.Effect>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InfoStickerViewModel(Context context, m mVar, com.ss.android.ugc.tools.infosticker.a.a.d dVar, com.ss.android.ugc.tools.infosticker.a.a.b bVar, com.ss.android.ugc.tools.infosticker.view.internal.a<EffectCategoryResponse, Effect> aVar, k<Effect> kVar, e<Effect> eVar, k<Effect> kVar2, h<ProviderEffect> hVar, k<ProviderEffect> kVar3, com.ss.android.ugc.tools.infosticker.view.internal.d dVar2, h.f.a.b<? super com.ss.android.ugc.tools.h.a.b, ? extends e<Effect>> bVar2, h.f.a.a<? extends k<Effect>> aVar2) {
        super(mVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(bVar, "");
        this.f149657b = context;
        this.f149665j = mVar;
        this.f149666k = null;
        this.f149667l = null;
        this.f149668m = dVar;
        this.n = bVar;
        this.o = null;
        this.f149658c = aVar;
        this.p = kVar;
        this.f149659d = eVar;
        this.q = kVar2;
        this.r = hVar;
        this.s = kVar3;
        this.t = null;
        this.u = null;
        this.v = dVar2;
        this.w = bVar2;
        this.x = aVar2;
        if (dVar2 != null) {
            dVar2.a().observe(mVar, new a(this));
        }
        this.f149660e = new LinkedBlockingQueue<>();
        this.f149663h = new f.a.b.a();
        this.f149664i = new d(this);
    }
}
