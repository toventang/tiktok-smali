package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f55816a = new HashMap();

    static {
        Covode.recordClassIndex(34901);
    }

    public c(List<a> list) {
        a(list);
    }

    private void a(a aVar) {
        if (aVar != null) {
            String str = aVar.f55782b;
            this.f55816a.get(str);
            this.f55816a.put(str, aVar);
        }
    }

    public final a a(String str) {
        a aVar = this.f55816a.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("No BehaviorController defined for class ".concat(String.valueOf(str)));
    }

    public final void a(List<a> list) {
        if (list != null) {
            for (a aVar : list) {
                a(aVar);
            }
        }
    }
}
