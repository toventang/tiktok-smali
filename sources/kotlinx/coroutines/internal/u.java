package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.c.b.a.e;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import h.v;
import h.w;
import java.util.ArrayDeque;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f159156a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f159157b;

    private static final boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && l.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && l.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && l.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        String str2;
        String str3 = "kotlinx.coroutines.internal.u";
        String str4 = "h.c.b.a.a";
        Covode.recordClassIndex(105673);
        try {
            str = q.m223constructorimpl(Class.forName(str4).getCanonicalName());
        } catch (Throwable th) {
            str = q.m223constructorimpl(r.a(th));
        }
        if (q.m226exceptionOrNullimpl(str) == null) {
            str4 = str;
        }
        f159156a = str4;
        try {
            str2 = q.m223constructorimpl(Class.forName(str3).getCanonicalName());
        } catch (Throwable th2) {
            str2 = q.m223constructorimpl(r.a(th2));
        }
        if (q.m226exceptionOrNullimpl(str2) == null) {
            str3 = str2;
        }
        f159157b = str3;
    }

    private static boolean a(StackTraceElement stackTraceElement) {
        return p.b(stackTraceElement.getClassName(), "\b\b\b", false);
    }

    private static StackTraceElement a(String str) {
        return new StackTraceElement("\b\b\b(".concat(String.valueOf(str)), "\b", "\b", -1);
    }

    private static final <E extends Throwable> h.p<E, StackTraceElement[]> b(E e2) {
        Throwable cause = e2.getCause();
        if (cause == null || !l.a(cause.getClass(), e2.getClass())) {
            return v.a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (a(stackTraceElement)) {
                return v.a(cause, stackTrace);
            }
        }
        return v.a(e2, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E a(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && !(!l.a(e3.getClass(), e2.getClass()))) {
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (a(stackTraceElement)) {
                    return e3;
                }
            }
        }
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> a(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while ((eVar instanceof e) && (eVar = eVar.getCallerFrame()) != null) {
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    private static final int a(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (l.a((Object) str, (Object) stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E extends Throwable> E a(E e2, e eVar) {
        h.p b2 = b(e2);
        Throwable th = (Throwable) b2.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b2.component2();
        Throwable a2 = f.a(th);
        if (a2 == null || (!l.a((Object) a2.getMessage(), (Object) th.getMessage()))) {
            return e2;
        }
        ArrayDeque<StackTraceElement> a3 = a(eVar);
        if (a3.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            a(stackTraceElementArr, a3);
        }
        return (E) a(th, a2, a3);
    }

    private static final void a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (a(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i3) {
            while (true) {
                if (a(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    private static final <E extends Throwable> E a(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int a2 = a(stackTrace, f159156a);
        int i2 = 0;
        if (a2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e3.setStackTrace((StackTraceElement[]) array);
                return e3;
            }
            throw new w("null cannot be cast to non-null type");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a2)];
        for (int i3 = 0; i3 < a2; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a2 + i2] = stackTraceElement;
            i2++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }
}
