package com.ss.android.ugc.aweme.discover.lynx.delegate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.lynx.a.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f81476a = new ArrayList();

    static {
        Covode.recordClassIndex(50633);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    public final void a() {
        for (b bVar : this.f81476a) {
            bVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f81476a.add(bVar);
    }
}
