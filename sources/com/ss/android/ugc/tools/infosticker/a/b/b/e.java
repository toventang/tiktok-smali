package com.ss.android.ugc.tools.infosticker.a.b.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.k;
import com.ss.android.ugc.tools.infosticker.a.a.b;
import com.ss.android.ugc.tools.infosticker.a.a.c;
import com.ss.android.ugc.tools.infosticker.a.b.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<d> f149427a;

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.a<? extends f> f149428b;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.e> f149429c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f149430d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.a<? extends k<ProviderEffect, z>> f149431e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f149432f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f149433g;

    /* renamed from: h  reason: collision with root package name */
    private h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.c> f149434h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f149435i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<String> f149436j;

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<String> f149437k;

    static {
        Covode.recordClassIndex(98395);
    }

    static final class a extends m implements h.f.a.a<h> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(98396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(this.this$0.f149427a);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.c
    public final b a() {
        f fVar;
        int i2;
        int i3;
        int i4;
        com.ss.android.ugc.tools.infosticker.a.b.c cVar;
        h.f.a.a<? extends f> aVar = this.f149428b;
        if (aVar == null || (fVar = (f) aVar.invoke()) == null) {
            Context context = this.f149435i;
            if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
            }
            String absolutePath = new File(com.ss.android.ugc.aweme.lancet.d.f107195c, "effect").getAbsolutePath();
            l.b(absolutePath, "");
            fVar = new b(absolutePath);
        }
        h.f.a.a aVar2 = this.f149429c;
        if (aVar2 == null) {
            aVar2 = new a(this);
        }
        Integer num = this.f149430d;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        a aVar3 = new a(fVar, aVar2, i2);
        h.f.a.a<? extends k<ProviderEffect, z>> aVar4 = this.f149431e;
        if (aVar4 != null) {
            aVar3.a((k) aVar4.invoke());
        }
        f fVar2 = new f(aVar3, fVar);
        Integer num2 = this.f149432f;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 30;
        }
        Integer num3 = this.f149433g;
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            i4 = 30;
        }
        h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.c> aVar5 = this.f149434h;
        if (aVar5 == null || (cVar = (com.ss.android.ugc.tools.infosticker.a.b.c) aVar5.invoke()) == null) {
            cVar = new g(this.f149427a, this.f149436j, this.f149437k, i3, i4);
        }
        return new c(cVar, fVar2, aVar3, fVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, h.f.a.a<? extends d> aVar, h.f.a.a<String> aVar2, h.f.a.a<String> aVar3) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f149435i = context;
        this.f149427a = aVar;
        this.f149436j = aVar2;
        this.f149437k = aVar3;
    }
}
