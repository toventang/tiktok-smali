package com.ss.android.ugc.aweme.ttep.ttepcomponent.c;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.f;
import com.ss.android.ugc.aweme.sticker.repository.a.g;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final C3751a f141439f = new C3751a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h f141440b = i.a((h.f.a.a) new d(this));

    /* renamed from: c  reason: collision with root package name */
    public final f.a.l.b<CategoryEffectModel> f141441c;

    /* renamed from: d  reason: collision with root package name */
    final Effect f141442d;

    /* renamed from: e  reason: collision with root package name */
    public final e f141443e;

    /* renamed from: g  reason: collision with root package name */
    private final EffectCategoryModel f141444g = g.a(new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.repository.a.d f141445h;

    /* renamed from: i  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> f141446i;

    static {
        Covode.recordClassIndex(92371);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final int a() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final void e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$a  reason: collision with other inner class name */
    public static final class C3751a {
        static {
            Covode.recordClassIndex(92372);
        }

        private C3751a() {
        }

        public /* synthetic */ C3751a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final EffectCategoryModel b() {
        return this.f141444g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> c() {
        return this.f141446i;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final com.ss.android.ugc.aweme.sticker.repository.a.d d() {
        return this.f141445h;
    }

    static final class d extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string = this.this$0.f141443e.getString(R.string.p);
            l.b(string, "");
            return string;
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.sticker.repository.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141447a;

        static {
            Covode.recordClassIndex(92374);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f141447a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.a.d
        public final t<CategoryEffectModel> a(com.ss.android.ugc.aweme.sticker.repository.c.a aVar) {
            l.d(aVar, "");
            t<CategoryEffectModel> c2 = this.f141447a.f141441c.c((f.a.d.f<? super f.a.b.b>) new C3752a(this));
            l.b(c2, "");
            return c2;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.c.a$c$a  reason: collision with other inner class name */
        static final class C3752a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f141448a;

            static {
                Covode.recordClassIndex(92375);
            }

            C3752a(c cVar) {
                this.f141448a = cVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                a aVar = this.f141448a.f141447a;
                f.a.l.b<CategoryEffectModel> bVar = aVar.f141441c;
                Effect effect = aVar.f141442d;
                CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
                categoryEffectModel.setCategoryKey("category:ttep");
                categoryEffectModel.setEffects(n.a(effect));
                categoryEffectModel.setCollectEffects(new ArrayList());
                categoryEffectModel.setBindEffects(new ArrayList());
                bVar.onNext(categoryEffectModel);
            }
        }
    }

    static final class b extends m implements h.f.a.b<EffectCategoryModel, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            l.d(effectCategoryModel2, "");
            effectCategoryModel2.setId("0");
            effectCategoryModel2.setKey("category:ttep");
            effectCategoryModel2.setName((String) this.this$0.f141440b.getValue());
            return z.f158842a;
        }
    }

    public a(Effect effect, e eVar) {
        l.d(effect, "");
        l.d(eVar, "");
        this.f141442d = effect;
        this.f141443e = eVar;
        f.a.l.b<CategoryEffectModel> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        this.f141441c = bVar;
        this.f141445h = new c(this);
    }
}
