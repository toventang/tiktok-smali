package com.bytedance.lynx.hybrid.webkit.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b f41279a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f41280b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(25299);
        }

        public static Object a(String str) {
            Object obj;
            Stack stack;
            l.c(str, "");
            try {
                Map map = (Map) f.f41279a.get();
                obj = q.m223constructorimpl((map == null || (stack = (Stack) map.get(str)) == null) ? null : stack.pop());
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                return null;
            }
            return obj;
        }

        public static Object b(String str) {
            Object obj;
            Stack stack;
            l.c(str, "");
            try {
                Map map = (Map) f.f41279a.get();
                obj = q.m223constructorimpl((map == null || (stack = (Stack) map.get(str)) == null) ? null : stack.peek());
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            if (q.m228isFailureimpl(obj)) {
                return null;
            }
            return obj;
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends ThreadLocal<Map<String, Stack<Object>>> {
        static {
            Covode.recordClassIndex(25300);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Map<String, Stack<Object>> initialValue() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(25298);
    }
}
