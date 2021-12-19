package com.bytedance.helios.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.a;
import h.f.b.l;
import java.util.Map;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f30641a;

    static {
        Covode.recordClassIndex(17802);
    }

    @Override // com.bytedance.helios.api.a
    public final void init(com.bytedance.helios.api.config.b bVar, a aVar) {
        l.c(bVar, "");
        l.c(aVar, "");
    }

    @Override // com.bytedance.helios.api.a
    public final void recordRegionEvent(Map<String, Object> map) {
        l.c(map, "");
    }

    @Override // com.bytedance.helios.api.a
    public final void ruleChangeNotify(RuleInfo ruleInfo) {
        l.c(ruleInfo, "");
    }

    @Override // com.bytedance.helios.api.a
    public final void ruleChangeNotify(String str, boolean z) {
        l.c(str, "");
    }

    @Override // com.bytedance.helios.api.a
    public final boolean isEnabled() {
        return this.f30641a;
    }
}
