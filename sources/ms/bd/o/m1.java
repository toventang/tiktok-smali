package ms.bd.o;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Objects;
import ms.bd.o.n1;

public final class m1 implements n1.a {

    /* renamed from: a  reason: collision with root package name */
    private long f159518a;

    /* renamed from: b  reason: collision with root package name */
    private Context f159519b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f159520c;

    static {
        Covode.recordClassIndex(105928);
    }

    @Override // ms.bd.o.n1.a
    public final void a(int i2) {
        long j2 = this.f159518a;
        if (j2 != -1) {
            b.a(33554438, i2, j2, null, null);
        }
    }

    @Override // ms.bd.o.n1.a
    public final void a(String str) {
        if (this.f159518a != -1 && !TextUtils.isEmpty(str)) {
            b.a(33554433, 0, this.f159518a, str, this.f159519b);
        }
    }

    @Override // ms.bd.o.n1.a
    public final void b(String str) {
        this.f159520c.f159498d = str;
        long j2 = this.f159518a;
        if (j2 != -1) {
            b.a(33554434, 0, j2, str, this.f159519b);
        }
    }

    @Override // ms.bd.o.n1.a
    public final void c(String str) {
        this.f159520c.f159500f = str;
        long j2 = this.f159518a;
        if (j2 != -1) {
            b.a(33554435, 0, j2, str, this.f159519b);
        }
    }

    @Override // ms.bd.o.n1.a
    public final void d(String str) {
        this.f159520c.f159501g = str;
        long j2 = this.f159518a;
        if (j2 != -1) {
            b.a(33554436, 0, j2, str, this.f159519b);
        }
    }

    m1(e0 e0Var, Context context, long j2) {
        Objects.requireNonNull(e0Var, "config could not be null");
        Objects.requireNonNull(context, "context could not be null");
        this.f159520c = e0Var;
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f159519b = applicationContext;
        this.f159518a = j2;
    }
}
