package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.l;
import java.util.List;

public abstract class a<IN, OUT> extends l<IN, OUT> {
    static {
        Covode.recordClassIndex(25884);
    }

    /* access modifiers changed from: protected */
    public abstract String a(IN in);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.q.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.q.d
    public final Object a(b<OUT> bVar, IN in) {
        new m(bVar);
        String a2 = a((Object) in);
        l.a aVar = this.f42385b.get(a2);
        if (aVar != null) {
            List<h> list = aVar.f42386a;
            Object a3 = c.a(list, bVar, this).a((Object) in);
            if (!a(list)) {
                return a3;
            }
            return bVar.a((OUT) a3);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(a2)));
    }
}
