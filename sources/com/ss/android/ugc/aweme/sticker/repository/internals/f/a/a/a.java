package com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import f.a.l.b;
import h.f.b.l;
import h.h;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public b<CategoryEffectModel> f135661a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.b.b f135662b;

    /* renamed from: c  reason: collision with root package name */
    private final u<com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse>> f135663c = new C3537a(this);

    /* renamed from: d  reason: collision with root package name */
    private final h<com.ss.android.ugc.aweme.sticker.repository.a.h> f135664d;

    static {
        Covode.recordClassIndex(88678);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.c
    public final void a() {
        f.a.b.b bVar = this.f135662b;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f135664d.isInitialized()) {
            this.f135664d.getValue().a().b().removeObserver(this.f135663c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(h<? extends com.ss.android.ugc.aweme.sticker.repository.a.h> hVar) {
        l.d(hVar, "");
        this.f135664d = hVar;
        b<CategoryEffectModel> bVar = new b<>();
        l.b(bVar, "");
        this.f135661a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a$a  reason: collision with other inner class name */
    static final class C3537a<T> implements u<com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135666a;

        static {
            Covode.recordClassIndex(88679);
        }

        C3537a(a aVar) {
            this.f135666a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse> aVar) {
            a.EnumC1574a aVar2;
            com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse> aVar3 = aVar;
            if (aVar3 != null && (aVar2 = aVar3.f69569b) != null) {
                int i2 = b.f135667a[aVar2.ordinal()];
                if (i2 == 1) {
                    this.f135666a.f135661a.onError(aVar3.f69570c);
                    a aVar4 = this.f135666a;
                    b<CategoryEffectModel> bVar = new b<>();
                    l.b(bVar, "");
                    aVar4.f135661a = bVar;
                } else if (i2 == 2) {
                    M m2 = aVar3.f69568a;
                    if (m2 != null) {
                        b<CategoryEffectModel> bVar2 = this.f135666a.f135661a;
                        CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
                        categoryEffectModel.setCategoryKey("sticker_category:favorite");
                        categoryEffectModel.setEffects(m2.getEffects());
                        categoryEffectModel.setCollectEffects(m2.getCollectEffects());
                        categoryEffectModel.setBindEffects(m2.getBindEffects());
                        bVar2.onNext(categoryEffectModel);
                        return;
                    }
                    this.f135666a.f135661a.onError(new IllegalStateException("data invalid"));
                    a aVar5 = this.f135666a;
                    b<CategoryEffectModel> bVar3 = new b<>();
                    l.b(bVar3, "");
                    aVar5.f135661a = bVar3;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r1 == com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR) goto L_0x0032;
     */
    @Override // com.ss.android.ugc.aweme.sticker.repository.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.t<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> a(com.ss.android.ugc.aweme.sticker.repository.c.a r5) {
        /*
            r4 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r5, r2)
            h.h<com.ss.android.ugc.aweme.sticker.repository.a.h> r0 = r4.f135664d
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.sticker.repository.a.h r3 = (com.ss.android.ugc.aweme.sticker.repository.a.h) r3
            com.ss.android.ugc.aweme.sticker.repository.a.i r0 = r3.a()
            androidx.lifecycle.LiveData r1 = r0.b()
            androidx.lifecycle.u<com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse>> r0 = r4.f135663c
            r1.observeForever(r0)
            boolean r0 = r5.f135480f
            if (r0 != 0) goto L_0x0032
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.bw.b.a r0 = (com.ss.android.ugc.aweme.bw.b.a) r0
            if (r0 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.bw.b.a$a r1 = r0.f69569b
        L_0x002e:
            com.ss.android.ugc.aweme.bw.b.a$a r0 = com.ss.android.ugc.aweme.bw.b.a.EnumC1574a.ERROR
            if (r1 != r0) goto L_0x0047
        L_0x0032:
            f.a.b.b r0 = r4.f135662b
            if (r0 == 0) goto L_0x0039
            r0.dispose()
        L_0x0039:
            boolean r0 = r5.f135480f
            f.a.ab r1 = r3.a(r0)
            f.a.d.f<java.lang.Object> r0 = f.a.e.b.a.f157191d
            f.a.b.b r0 = r1.a(r0, r0)
            r4.f135662b = r0
        L_0x0047:
            f.a.l.b<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> r0 = r4.f135661a
            f.a.t r0 = r0.c()
            h.f.b.l.b(r0, r2)
            return r0
        L_0x0051:
            r1 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a.a(com.ss.android.ugc.aweme.sticker.repository.c.a):f.a.t");
    }
}
