package com.ss.android.ugc.tools.infosticker.a.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.h.a.a.c;
import com.ss.android.ugc.tools.h.a.a.f;
import com.ss.android.ugc.tools.h.a.k;
import com.ss.android.ugc.tools.h.b.b.h;
import com.ss.android.ugc.tools.infosticker.a.a.e;
import com.ss.android.ugc.tools.infosticker.a.b.b;
import com.ss.android.ugc.tools.infosticker.a.b.m;
import h.f.b.l;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<? extends k<Effect, m>> f149394a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f149395b = true;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<com.ss.android.ugc.tools.b.a.d> f149396c;

    /* renamed from: d  reason: collision with root package name */
    private h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.a> f149397d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.a<? extends b> f149398e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f149399f;

    /* renamed from: g  reason: collision with root package name */
    private h.f.a.a<? extends f<EffectCategoryResponse>> f149400g;

    /* renamed from: h  reason: collision with root package name */
    private h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.b<Effect>> f149401h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f149402i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<c> f149403j;

    static {
        Covode.recordClassIndex(98378);
    }

    static final class a extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(98379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0.f149396c);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.e
    public final com.ss.android.ugc.tools.infosticker.a.a.d a() {
        com.ss.android.ugc.tools.h.a.a.a aVar;
        int i2;
        f fVar;
        int i3;
        com.ss.android.ugc.tools.h.a.a.b bVar;
        h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.a> aVar2 = this.f149397d;
        if (aVar2 == null || (aVar = (com.ss.android.ugc.tools.h.a.a.a) aVar2.invoke()) == null) {
            aVar = new com.ss.android.ugc.tools.h.b.c.c(this.f149396c);
        }
        h.f.a.a aVar3 = this.f149398e;
        if (aVar3 == null) {
            aVar3 = new a(this);
        }
        Integer num = this.f149399f;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        a aVar4 = new a(aVar, aVar3, i2);
        h.f.a.a<? extends k<Effect, m>> aVar5 = this.f149394a;
        if (aVar5 != null) {
            aVar4.a((k) aVar5.invoke());
        }
        c invoke = this.f149403j.invoke();
        h.f.a.a<? extends f<EffectCategoryResponse>> aVar6 = this.f149400g;
        if (aVar6 == null || (fVar = (f) aVar6.invoke()) == null) {
            fVar = new h(this.f149396c);
        }
        f fVar2 = new f(aVar, aVar4);
        Integer num2 = this.f149402i;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 75;
        }
        h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.b<Effect>> aVar7 = this.f149401h;
        if (aVar7 == null || (bVar = (com.ss.android.ugc.tools.h.a.a.b) aVar7.invoke()) == null) {
            bVar = new com.ss.android.ugc.tools.h.b.c.b(this.f149396c, i3, this.f149395b);
        }
        return new b(invoke, fVar, bVar, fVar2, aVar4, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.h.a.a.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar, h.f.a.a<? extends c> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149396c = aVar;
        this.f149403j = aVar2;
    }
}
