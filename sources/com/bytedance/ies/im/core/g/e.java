package com.bytedance.ies.im.core.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.ies.im.core.api.f.c;
import com.bytedance.im.core.proto.ReferenceInfo;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class e implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f34187a;

    static {
        Covode.recordClassIndex(20359);
    }

    public e() {
        int i2 = d.f34172l + 1;
        d.f34172l = i2;
        this.f34187a = new d(i2, (byte) 0);
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final void a() {
        c.a(this.f34187a);
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b a(ReferenceInfo referenceInfo) {
        this.f34187a.f34182i = referenceInfo;
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b b(String str) {
        this.f34187a.f34174a = str;
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b a(c cVar) {
        List<? extends c> list;
        d dVar = this.f34187a;
        if (cVar != null) {
            list = n.a(cVar);
        } else {
            list = null;
        }
        dVar.f34175b = list;
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b a(String str) {
        this.f34187a.f34174a = b.a.b(str);
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b a(List<? extends c> list) {
        this.f34187a.f34175b = list;
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final g.b a(Map<String, String> map) {
        this.f34187a.f34178e = map;
        return this;
    }

    @Override // com.bytedance.ies.im.core.api.b.g.b
    public final void a(com.bytedance.ies.im.core.api.b.a.e eVar) {
        l.d(eVar, "");
        d dVar = this.f34187a;
        l.d(eVar, "");
        dVar.f34181h = eVar;
        c.a(dVar);
    }
}
