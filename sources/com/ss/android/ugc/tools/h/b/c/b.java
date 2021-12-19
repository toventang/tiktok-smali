package com.ss.android.ugc.tools.h.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.b.a.d;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.h.b.b.k;
import com.ss.android.ugc.tools.h.b.b.n;
import h.f.a.a;
import h.f.b.l;

public final class b implements com.ss.android.ugc.tools.h.a.a.b<Effect> {

    /* renamed from: a  reason: collision with root package name */
    private final a<d> f149352a;

    /* renamed from: b  reason: collision with root package name */
    private final int f149353b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f149354c;

    static {
        Covode.recordClassIndex(98349);
    }

    /* Return type fixed from 'com.ss.android.ugc.tools.h.a.j' to match base method */
    @Override // com.ss.android.ugc.tools.h.a.a.b
    public final /* synthetic */ j<Effect, CategoryEffectModel> a(com.ss.android.ugc.tools.h.a.b bVar) {
        String str = "";
        l.d(bVar, str);
        a<d> aVar = this.f149352a;
        String str2 = bVar.f149203a;
        int i2 = this.f149353b;
        String str3 = bVar.f149205c;
        if (str3 != null) {
            str = str3;
        }
        return new n(aVar, str2, i2, new k(0, 0, "", true, str), this.f149354c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(a<? extends d> aVar, int i2, boolean z) {
        l.d(aVar, "");
        this.f149352a = aVar;
        this.f149353b = i2;
        this.f149354c = z;
    }
}
