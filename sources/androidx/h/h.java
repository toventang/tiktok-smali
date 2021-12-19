package androidx.h;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

final class h<T> {

    /* renamed from: a  reason: collision with root package name */
    static final h f3131a = new h(Collections.emptyList());

    /* renamed from: b  reason: collision with root package name */
    static final h f3132b = new h(Collections.emptyList());

    /* renamed from: c  reason: collision with root package name */
    public final List<T> f3133c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3134d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3135e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3136f;

    static abstract class a<T> {
        static {
            Covode.recordClassIndex(1124);
        }

        public abstract void a(int i2, h<T> hVar);

        a() {
        }
    }

    static {
        Covode.recordClassIndex(1123);
    }

    public final String toString() {
        return "Result " + this.f3134d + ", " + this.f3133c + ", " + this.f3135e + ", offset " + this.f3136f;
    }

    h(List<T> list) {
        this.f3133c = list;
        this.f3136f = 0;
    }

    h(List<T> list, int i2, int i3) {
        this.f3133c = list;
        this.f3134d = 0;
        this.f3135e = i2;
        this.f3136f = 0;
    }
}
