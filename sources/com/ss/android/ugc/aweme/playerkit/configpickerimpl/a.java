package com.ss.android.ugc.aweme.playerkit.configpickerimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.b;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class a implements com.ss.android.ugc.aweme.playerkit.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.a f115483a = new com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.a();

    /* renamed from: b  reason: collision with root package name */
    private final b f115484b = new b();

    static {
        Covode.recordClassIndex(74133);
    }

    @Override // com.ss.android.ugc.aweme.playerkit.a.a
    public final <T> List<T> a(f fVar, Type type) {
        return (List) com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a(new b(this, fVar, type));
    }

    /* access modifiers changed from: package-private */
    public final synchronized <T> List<T> b(f fVar, Type type) {
        MethodCollector.i(3890);
        this.f115483a.a(fVar);
        this.f115484b.f115495a = fVar;
        b bVar = this.f115484b;
        if (bVar.f115497c == null) {
            bVar.a();
        }
        List<ConditionConfig> a2 = this.f115483a.a(bVar.f115497c);
        if (a2.size() == 0) {
            MethodCollector.o(3890);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ConditionConfig conditionConfig : a2) {
            arrayList.add(com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(conditionConfig.f115521c, type));
        }
        MethodCollector.o(3890);
        return arrayList;
    }
}
