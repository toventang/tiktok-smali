package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.a;
import com.bytedance.bpea.basics.b;
import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.core.c.f;
import com.bytedance.bpea.core.d.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.bytedance.bpea.basics.e> f26659a;

    static {
        Covode.recordClassIndex(15702);
    }

    public e() {
        super(f.START_CHECK, f.END_CHECK);
        ArrayList arrayList = new ArrayList();
        this.f26659a = arrayList;
        arrayList.add(new d());
        arrayList.add(new b());
    }

    @Override // com.bytedance.bpea.core.checker.a, com.bytedance.bpea.basics.e
    public final h a(d dVar, com.bytedance.bpea.basics.f fVar) {
        String str = "";
        l.c(fVar, str);
        try {
            return super.a(dVar, fVar);
        } catch (a e2) {
            l.c("cert verify fail!\ncert = " + dVar + " \n context =" + fVar, str);
            throw e2;
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                str = localizedMessage;
            }
            return new h(-1, str);
        }
    }

    @Override // com.bytedance.bpea.core.checker.c
    public final h b(d dVar, com.bytedance.bpea.basics.f fVar) {
        l.c(fVar, "");
        h a2 = a.C0566a.a();
        Iterator<com.bytedance.bpea.basics.e> it = this.f26659a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h a3 = it.next().a(dVar, fVar);
            Map<String, Object> map = a3.f26606a;
            l.c(map, "");
            a2.f26606a.putAll(map);
            l.c(a3, "");
            if (l.a(a3.f26606a.get("isInterrupt"), (Object) true)) {
                l.c("the check is intercepted", "");
                break;
            }
        }
        b.a("MainCertChecker", "checkResult=".concat(String.valueOf(a2)));
        return a2;
    }
}
