package com.bytedance.ies.xelement.overlay;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final List<a> f37197a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    static int f37198b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f37199c = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(22373);
    }

    public static JavaOnlyArray a() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        Iterator<T> it = f37197a.iterator();
        while (it.hasNext()) {
            javaOnlyArray.pushString(it.next().f37200a);
        }
        return javaOnlyArray;
    }

    public static void a(String str) {
        if (str != null) {
            for (T t : f37197a) {
                if (l.a((Object) t.f37200a, (Object) str)) {
                    f37197a.remove(t);
                    return;
                }
            }
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f37200a;

        /* renamed from: b  reason: collision with root package name */
        public final a f37201b;

        static {
            Covode.recordClassIndex(22374);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f37200a, aVar.f37200a) && l.a(this.f37201b, aVar.f37201b);
        }

        public final int hashCode() {
            String str = this.f37200a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a aVar = this.f37201b;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "OverlayData(id=" + this.f37200a + ", dialog=" + this.f37201b + ")";
        }

        public a(String str, a aVar) {
            l.c(str, "");
            l.c(aVar, "");
            this.f37200a = str;
            this.f37201b = aVar;
        }
    }
}
