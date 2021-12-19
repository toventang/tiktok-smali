package com.bytedance.apm.m;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.k.e;
import com.bytedance.apm.n.b;
import com.bytedance.covode.number.Covode;

public final class a implements b {
    static {
        Covode.recordClassIndex(14672);
    }

    @Override // com.bytedance.apm.n.b
    public final boolean a(String str) {
        return ApmDelegate.a.f25042a.a(str);
    }

    @Override // com.bytedance.apm.n.b
    public final boolean b(String str) {
        return ApmDelegate.a.f25042a.b(str);
    }

    @Override // com.bytedance.apm.n.b
    public final boolean e(String str) {
        return e.a.f25105a.a(str);
    }

    @Override // com.bytedance.apm.n.b
    public final boolean c(String str) {
        ApmDelegate apmDelegate = ApmDelegate.a.f25042a;
        if (!apmDelegate.f25014h || apmDelegate.f25013g == null) {
            return false;
        }
        return apmDelegate.f25013g.getMetricTypeSwitch(str);
    }

    @Override // com.bytedance.apm.n.b
    public final boolean d(String str) {
        Boolean bool = e.a.f25105a.f25098a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.apm.n.b
    public final boolean a(String str, String str2) {
        boolean z;
        e eVar = e.a.f25105a;
        Boolean bool = eVar.f25099b.get(str);
        if (eVar.f25100c == null || eVar.f25100c.optInt(str2) != 1) {
            z = false;
        } else {
            z = true;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            return false;
        }
        return true;
    }
}
