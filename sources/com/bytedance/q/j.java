package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.i;
import com.bytedance.q.l;
import java.util.List;

public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: a  reason: collision with root package name */
    public String f42382a;

    static {
        Covode.recordClassIndex(25903);
    }

    /* access modifiers changed from: protected */
    public abstract String a(IN in);

    /* access modifiers changed from: protected */
    public abstract String a(IN in, Throwable th, String str);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.q.b<OUT> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.q.d
    public final Object a(b<OUT> bVar, IN in) {
        new m(bVar);
        this.f42382a = a((Object) in);
        l.a aVar = this.f42385b.get(this.f42382a);
        while (aVar != null) {
            List<h> list = aVar.f42386a;
            try {
                Object a2 = c.a(list, bVar, this).a((Object) in);
                if (!a(list)) {
                    return a2;
                }
                return bVar.a((OUT) a2);
            } catch (i.a e2) {
                Throwable cause = e2.getCause();
                new m(bVar);
                this.f42382a = a(in, cause, this.f42382a);
                aVar = this.f42385b.get(this.f42382a);
            } catch (Throwable th) {
                new m(bVar);
                this.f42382a = a(in, th, this.f42382a);
                aVar = this.f42385b.get(this.f42382a);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f42382a);
    }
}
