package com.ss.android.ugc.tools.infosticker.a.b.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.infosticker.a.a.f;
import com.ss.android.ugc.tools.infosticker.a.a.g;
import com.ss.android.ugc.tools.infosticker.a.b.h;
import com.ss.android.ugc.tools.infosticker.a.b.j;
import com.ss.android.ugc.tools.infosticker.a.b.k;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<d> f149462a;

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.a<? extends k> f149463b;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.a<? extends j> f149464c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f149465d;

    /* renamed from: e  reason: collision with root package name */
    private h.f.a.a<? extends com.ss.android.ugc.tools.h.a.k<InfoStickerEffect, z>> f149466e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f149467f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f149468g;

    /* renamed from: h  reason: collision with root package name */
    private h.f.a.a<? extends h> f149469h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f149470i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<String> f149471j;

    static {
        Covode.recordClassIndex(98410);
    }

    static final class a extends m implements h.f.a.a<h> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(98411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(this.this$0.f149462a);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.a.a.g
    public final f a() {
        k kVar;
        int i2;
        int i3;
        h hVar;
        h.f.a.a<? extends k> aVar = this.f149463b;
        if (aVar == null || (kVar = (k) aVar.invoke()) == null) {
            Context context = this.f149470i;
            if (com.ss.android.ugc.aweme.lancet.d.f107195c == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107195c = context.getFilesDir();
            }
            String absolutePath = new File(com.ss.android.ugc.aweme.lancet.d.f107195c, "effect").getAbsolutePath();
            l.b(absolutePath, "");
            kVar = new b(absolutePath);
        }
        h.f.a.a aVar2 = this.f149464c;
        if (aVar2 == null) {
            aVar2 = new a(this);
        }
        Integer num = this.f149465d;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        a aVar3 = new a(kVar, aVar2, i2);
        h.f.a.a<? extends com.ss.android.ugc.tools.h.a.k<InfoStickerEffect, z>> aVar4 = this.f149466e;
        if (aVar4 != null) {
            aVar3.a((com.ss.android.ugc.tools.h.a.k) aVar4.invoke());
        }
        f fVar = new f(kVar, aVar3);
        Integer num2 = this.f149467f;
        int i4 = 30;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 30;
        }
        Integer num3 = this.f149468g;
        if (num3 != null) {
            i4 = num3.intValue();
        }
        h.f.a.a<? extends h> aVar5 = this.f149469h;
        if (aVar5 == null || (hVar = (h) aVar5.invoke()) == null) {
            hVar = new g(this.f149462a, this.f149471j, i3, i4);
        }
        return new c(hVar, fVar, aVar3, kVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, h.f.a.a<? extends d> aVar, h.f.a.a<String> aVar2) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f149470i = context;
        this.f149462a = aVar;
        this.f149471j = aVar2;
    }
}
