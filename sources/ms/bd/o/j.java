package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.b.a.e;
import ms.bd.o.b;
import org.json.JSONObject;

public abstract class j extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private static j f159508a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f159509a;

        /* renamed from: b  reason: collision with root package name */
        private long f159510b;

        /* renamed from: c  reason: collision with root package name */
        private String f159511c;

        /* renamed from: d  reason: collision with root package name */
        private String f159512d;

        static {
            Covode.recordClassIndex(105915);
        }

        public final void a(String str) {
            this.f159511c = str;
            this.f159512d = null;
            this.f159509a = System.currentTimeMillis();
        }

        public final void a(String str, int i2) {
            j a2 = j.a();
            if (a2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.f159509a;
                long j3 = currentTimeMillis - j2;
                this.f159510b = j3;
                a2.a(j3, j2, this.f159511c, this.f159512d, str, i2);
            }
        }

        public final void b(String str, int i2) {
            j a2 = j.a();
            if (a2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.f159509a;
                long j3 = currentTimeMillis - j2;
                this.f159510b = j3;
                a2.b(j3, j2, this.f159511c, this.f159512d, str, i2);
            }
        }
    }

    static {
        Covode.recordClassIndex(105914);
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            jVar = f159508a;
        }
        return jVar;
    }

    public static synchronized void a(j jVar) {
        synchronized (j.class) {
            f159508a = jVar;
        }
    }

    @Override // ms.bd.o.b.a
    public final Object a(int i2, int i3, long j2, String str, Object obj) {
        if (i2 != 131073) {
            if (i2 == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !a(str)) {
            return null;
        } else {
            return h.a(16777217, 0, 0, "3120c1", new byte[]{e.f153515b, 24});
        }
    }

    public abstract void a(long j2, long j3, String str, String str2, String str3, int i2);

    public abstract void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean a(String str);

    public abstract void b(long j2, long j3, String str, String str2, String str3, int i2);
}
