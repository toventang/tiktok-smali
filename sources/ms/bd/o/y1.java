package ms.bd.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class y1 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile y1 f159566a;

    /* renamed from: b  reason: collision with root package name */
    private int f159567b = 0;

    /* renamed from: c  reason: collision with root package name */
    private Throwable f159568c = null;

    static {
        Covode.recordClassIndex(105975);
    }

    private y1() {
    }

    public static List<Method> a(Class cls, String str) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && !TextUtils.isEmpty(str)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method != null && method.getName().equals(str)) {
                    arrayList.add(method);
                }
            }
        }
        return arrayList;
    }

    public static y1 a() {
        MethodCollector.i(8062);
        if (f159566a == null) {
            synchronized (y1.class) {
                try {
                    if (f159566a == null) {
                        f159566a = new y1();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8062);
                    throw th;
                }
            }
        }
        y1 y1Var = f159566a;
        MethodCollector.o(8062);
        return y1Var;
    }

    public final synchronized void b() {
        MethodCollector.i(8063);
        if (this.f159568c == null) {
            int i2 = this.f159567b;
            this.f159567b = i2 + 1;
            if (i2 >= 30) {
                this.f159567b = 0;
                this.f159568c = new Throwable();
                MethodCollector.o(8063);
                return;
            }
        }
        MethodCollector.o(8063);
    }

    public final synchronized Throwable c() {
        Throwable th;
        MethodCollector.i(8064);
        th = this.f159568c;
        MethodCollector.o(8064);
        return th;
    }
}
