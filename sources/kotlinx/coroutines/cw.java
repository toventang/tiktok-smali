package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

public final class cw {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<bl> f159100a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final cw f159101b = new cw();

    private cw() {
    }

    public static bl b() {
        return f159100a.get();
    }

    static {
        Covode.recordClassIndex(105614);
    }

    public static bl a() {
        ThreadLocal<bl> threadLocal = f159100a;
        bl blVar = threadLocal.get();
        if (blVar != null) {
            return blVar;
        }
        bl a2 = bn.a();
        threadLocal.set(a2);
        return a2;
    }
}
