package androidx.work;

import com.bytedance.covode.number.Covode;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static g f4504a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f4505b = 20;

    static {
        Covode.recordClassIndex(1753);
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f4504a == null) {
                f4504a = new a(3);
            }
            gVar = f4504a;
        }
        return gVar;
    }

    public static class a extends g {

        /* renamed from: a  reason: collision with root package name */
        private int f4506a;

        static {
            Covode.recordClassIndex(1754);
        }

        public a(int i2) {
            this.f4506a = i2;
        }
    }

    public static synchronized void a(g gVar) {
        synchronized (g.class) {
            f4504a = gVar;
        }
    }

    public static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i2 = f4505b;
        if (length >= i2) {
            sb.append(str.substring(0, i2));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
