package com.bytedance.helios.sdk.f.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.f;
import h.a.n;
import h.f.a.a;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f30974a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final List<f> f30975b = n.b(new i(), new t(), new p(), new a(), new c(), new m(), new e(), new d(), new j(), new h(), new s(), new u(), new l(), new b(), new k(), new g(), new q(), new n());

    private r() {
    }

    static {
        Covode.recordClassIndex(17990);
    }

    private static f a(String str) {
        T t;
        Iterator<T> it = f30975b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.a(), (Object) str)) {
                break;
            }
        }
        return t;
    }

    public static boolean a(Object obj) {
        String valueOf = String.valueOf(obj);
        Locale locale = Locale.getDefault();
        l.a((Object) locale, "");
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        l.b(lowerCase, "");
        if (l.a((Object) lowerCase, (Object) "true")) {
            return true;
        }
        if (l.a((Object) lowerCase, (Object) "false")) {
            return false;
        }
        throw new RuntimeException("not valid boolean, value = ".concat(String.valueOf(lowerCase)));
    }

    private static boolean a(List<Object> list) {
        Object a2;
        Object obj;
        String str;
        String str2;
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (list.size() == 1 && ((obj = list.get(0)) == null || (obj instanceof String))) {
            String str3 = (String) obj;
            if (str3 != null) {
                Locale locale = Locale.getDefault();
                l.a((Object) locale, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                str = str3.toLowerCase(locale);
                l.b(str, "");
            } else {
                str = null;
            }
            if (l.a((Object) str, (Object) "true")) {
                return true;
            }
            if (str3 != null) {
                Locale locale2 = Locale.getDefault();
                l.a((Object) locale2, "");
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                str2 = str3.toLowerCase(locale2);
                l.b(str2, "");
            } else {
                str2 = null;
            }
            if (l.a((Object) str2, (Object) "false")) {
                return false;
            }
        }
        Stack stack = new Stack();
        for (T t : list) {
            if (t instanceof f) {
                if (t instanceof n) {
                    a2 = t.a(null, stack.pop());
                } else {
                    a2 = t.a(stack.pop(), stack.pop());
                }
                stack.push(a2);
            } else {
                stack.push(t);
            }
        }
        return a(stack.pop());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(java.lang.String r11, java.util.Map<java.lang.String, h.f.a.a<java.lang.Object>> r12) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.f.c.r.a(java.lang.String, java.util.Map):boolean");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0096 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    private static List<Object> b(String str, Map<String, a<Object>> map) {
        List<String> b2 = p.b(str, new String[]{" "});
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            if (!p.a((CharSequence) t)) {
                arrayList.add(t);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (String str2 : arrayList2) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            String a2 = p.a(p.b((CharSequence) str2).toString(), "$@", " ");
            f a3 = a(a2);
            a<Object> aVar = map.get(a2);
            if (a3 != null) {
                a2 = a3;
            } else if (map.containsKey(a2)) {
                Object invoke = aVar != null ? aVar.invoke() : null;
                f.a("Helios-Control-Api", "parseExpression " + a2 + '=' + invoke, (String) null, 12);
                a2 = invoke;
            }
            arrayList3.add(a2 == true ? 1 : 0);
        }
        ArrayList arrayList4 = new ArrayList();
        Stack stack = new Stack();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof f)) {
                arrayList4.add(next);
            } else if (next instanceof i) {
                stack.add(next);
            } else if (next instanceof t) {
                while (!(stack.peek() instanceof i)) {
                    arrayList4.add(stack.pop());
                }
                stack.pop();
            } else {
                while ((!stack.isEmpty()) && ((f) next).b() <= ((f) stack.peek()).b()) {
                    arrayList4.add(stack.pop());
                }
                stack.push(next);
            }
        }
        while (!stack.isEmpty()) {
            arrayList4.add(stack.pop());
        }
        return arrayList4;
    }
}
