package com.ss.android.ugc.aweme.sticker.repository.internals.f.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.d;
import com.ss.android.ugc.aweme.sticker.repository.a.g;
import com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.c;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class a implements c {

    /* renamed from: b  reason: collision with root package name */
    public final Context f135654b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f135655c;

    /* renamed from: d  reason: collision with root package name */
    private final int f135656d;

    /* renamed from: e  reason: collision with root package name */
    private final EffectCategoryModel f135657e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> f135658f;

    /* renamed from: g  reason: collision with root package name */
    private final d f135659g;

    /* renamed from: h  reason: collision with root package name */
    private final c f135660h;

    static {
        Covode.recordClassIndex(88675);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final int a() {
        return this.f135656d;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final EffectCategoryModel b() {
        return this.f135657e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> c() {
        return this.f135658f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final d d() {
        return this.f135659g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final void e() {
        this.f135660h.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a$a  reason: collision with other inner class name */
    static final class C3536a extends m implements b<EffectCategoryModel, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3536a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            l.d(effectCategoryModel2, "");
            effectCategoryModel2.setId("1");
            effectCategoryModel2.setKey("sticker_category:favorite");
            String string = this.this$0.f135654b.getString(R.string.g77);
            l.b(string, "");
            effectCategoryModel2.setName(string);
            if (this.this$0.f135655c) {
                AnonymousClass1 r3 = AnonymousClass1.f135665a;
                l.d(effectCategoryModel2, "");
                l.d(r3, "");
                UrlModel urlModel = new UrlModel(null, 1, null);
                r3.invoke(urlModel);
                effectCategoryModel2.setIcon(urlModel);
            }
            return z.f158842a;
        }
    }

    public a(c cVar, Context context) {
        l.d(cVar, "");
        l.d(context, "");
        this.f135660h = cVar;
        this.f135654b = context;
        this.f135655c = true;
        this.f135657e = g.a(new C3536a(this));
        this.f135659g = cVar;
    }

    public /* synthetic */ a(c cVar, Context context, byte b2) {
        this(cVar, context);
    }
}
