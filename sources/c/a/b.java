package c.a;

import c.c.a;
import c.c.b;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<c.c.b> f4877a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4878b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4879c;

    /* renamed from: d  reason: collision with root package name */
    private int f4880d;

    static {
        Covode.recordClassIndex(1921);
    }

    @Override // c.c.b.a
    public final a a() {
        return this.f4879c;
    }

    @Override // c.c.b.a
    public final a a(a aVar) {
        if (this.f4878b >= this.f4877a.size()) {
            if (aVar.f4908a == null && aVar.f4910c != null) {
                if (aVar.f4909b == null || aVar.f4909b.isEmpty()) {
                    aVar.f4908a = aVar.f4910c;
                } else {
                    String str = aVar.f4909b;
                    String str2 = aVar.f4910c;
                    if (!str2.isEmpty() && !str2.equals("/")) {
                        str = str2.charAt(0) == '/' ? str.equals("/") ? str2 : str + str2 : str.equals("/") ? str + str2 : str + '/' + str2;
                    }
                    aVar.f4908a = str;
                }
            }
            return aVar;
        }
        int i2 = this.f4880d + 1;
        this.f4880d = i2;
        if (i2 <= 1) {
            b bVar = new b(this.f4877a, this.f4878b + 1, aVar);
            c.c.b bVar2 = this.f4877a.get(this.f4878b);
            a a2 = bVar2.a(bVar);
            if (a2 == null) {
                throw new NullPointerException("resolver " + bVar2 + " returned null");
            } else if (a2.f4908a != null) {
                return a2;
            } else {
                throw new IllegalStateException("resolver " + bVar2 + " returned a file with no body");
            }
        } else {
            throw new IllegalStateException("FileResolver " + this.f4877a.get(this.f4878b - 1) + " must call handle() exactly once");
        }
    }

    public b(List<c.c.b> list, int i2, a aVar) {
        this.f4877a = list;
        this.f4878b = i2;
        this.f4879c = aVar;
    }
}
