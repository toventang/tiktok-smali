package com.ss.android.ugc.tools.view.b;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.z;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f150022a;

    /* renamed from: b  reason: collision with root package name */
    private final List f150023b;

    static {
        Covode.recordClassIndex(98774);
    }

    b(a aVar, List list) {
        this.f150022a = aVar;
        this.f150023b = list;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        a aVar = this.f150022a;
        aVar.f150019f = this.f150023b;
        aVar.notifyDataSetChanged();
        return z.f158842a;
    }
}
