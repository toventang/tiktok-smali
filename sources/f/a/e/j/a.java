package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.d.k;
import org.a.c;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f157938a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f157939b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f157940c;

    /* renamed from: d  reason: collision with root package name */
    int f157941d;

    /* renamed from: f.a.e.j.a$a  reason: collision with other inner class name */
    public interface AbstractC4175a<T> extends k<T> {
        static {
            Covode.recordClassIndex(104860);
        }

        @Override // f.a.d.k
        boolean a(T t);
    }

    static {
        Covode.recordClassIndex(104859);
    }

    public a() {
        Object[] objArr = new Object[5];
        this.f157939b = objArr;
        this.f157940c = objArr;
    }

    public final void a(AbstractC4175a<? super T> aVar) {
        int i2 = this.f157938a;
        for (Object[] objArr = this.f157939b; objArr != null; objArr = objArr[i2]) {
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                if (obj == null) {
                    continue;
                    break;
                } else if (aVar.a(obj)) {
                    return;
                }
            }
        }
    }

    public final void a(T t) {
        int i2 = this.f157938a;
        int i3 = this.f157941d;
        if (i3 == i2) {
            Object[] objArr = new Object[(i2 + 1)];
            this.f157940c[i2] = objArr;
            this.f157940c = objArr;
            i3 = 0;
        }
        this.f157940c[i3] = t;
        this.f157941d = i3 + 1;
    }

    public final <U> boolean a(c<? super U> cVar) {
        Object[] objArr = this.f157939b;
        int i2 = this.f157938a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr2 = objArr[i3];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (j.acceptFull(objArr2, cVar)) {
                    return true;
                }
            }
            objArr = objArr[i2];
        }
    }
}
