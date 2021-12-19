package com.ss.android.ugc.aweme.aabplugin.core.a;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.m.b.a;
import com.bytedance.m.d;
import com.google.android.play.core.e.f;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;

public final class b extends m<d> implements com.bytedance.m.b.b {
    static {
        Covode.recordClassIndex(38427);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final void a() {
        T t = this.f62500g;
        this.f62497d.a();
        this.f62499f = false;
        this.f62502i = null;
        this.f62500g = null;
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final void b() {
        d.a().f41341a.add(this);
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final void c() {
        d.a().f41341a.remove(this);
    }

    public b(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c(a aVar) {
        b(aVar);
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.aabplugin.core.base.n] */
    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final /* bridge */ /* synthetic */ void a(d dVar) {
        T t = this.f62500g;
        this.f62500g = dVar;
        this.f62501h = this.f62494a;
        this.f62502i = null;
        dVar.a(n.b.UNKNOWN);
    }

    @Override // com.bytedance.m.b.b
    public final void a(a aVar) {
        T t = this.f62500g;
        if (t != null && TextUtils.equals(t.f62519m, aVar.f41327a)) {
            if (aVar.f41329c == 5 && !t.b()) {
                aVar.f41329c = 6;
                aVar.f41333g = 2;
            }
            i.b(new c(this, aVar), i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.m
    public final boolean b(com.bytedance.ies.foundation.activity.a aVar) {
        a aVar2 = this.f62502i;
        if (aVar2 == null) {
            return false;
        }
        int i2 = this.f62496c;
        com.bytedance.m.a.b b2 = com.bytedance.m.a.b.b();
        com.bytedance.m.a.a a2 = com.bytedance.m.a.a.a();
        f fVar = a2.f41309a.get(aVar2.f41327a);
        if (fVar == null) {
            return false;
        }
        return b2.f41313c.a(fVar, aVar, i2);
    }
}
