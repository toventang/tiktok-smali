package com.bytedance.platform.a.b.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.a.a.g;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Set<Integer> f41827a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static Set<Integer> f41828b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public static Set<String> f41829c;

    /* renamed from: d  reason: collision with root package name */
    public static b f41830d = new C1026a();

    /* renamed from: e  reason: collision with root package name */
    private static final Object f41831e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f41832f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private static final Object f41833g = new Object();

    public interface b {
        static {
            Covode.recordClassIndex(25574);
        }

        boolean a(String str);
    }

    static {
        Covode.recordClassIndex(25572);
        f41827a.add(113);
        f41827a.add(114);
        f41827a.add(115);
        f41827a.add(116);
        f41827a.add(121);
        f41827a.add(122);
        f41827a.add(123);
        f41828b.add(140);
        f41828b.add(118);
        f41828b.add(113);
        f41828b.add(114);
        f41828b.add(115);
        f41828b.add(116);
        f41828b.add(121);
        f41828b.add(122);
        f41828b.add(123);
    }

    /* renamed from: com.bytedance.platform.a.b.a.a$a  reason: collision with other inner class name */
    public static class C1026a implements b {
        static {
            Covode.recordClassIndex(25573);
        }

        @Override // com.bytedance.platform.a.b.a.a.b
        public final boolean a(String str) {
            return a.f41829c.contains(str);
        }
    }

    public static void a(Message message) {
        MethodCollector.i(3939);
        if (message == null) {
            MethodCollector.o(3939);
            return;
        }
        int i2 = message.what;
        g.a(g.a.ERROR);
        Handler handler = (Handler) com.bytedance.platform.a.a.a.b();
        synchronized (f41831e) {
            try {
                message.arg2 = 1000089;
                handler.dispatchMessage(message);
            } finally {
                MethodCollector.o(3939);
            }
        }
    }

    public static boolean b(Message message) {
        if (message.getTarget() == com.bytedance.platform.a.a.a.b() && f41827a.contains(Integer.valueOf(message.what)) && !c(message)) {
            return true;
        }
        return false;
    }

    private static boolean c(Message message) {
        MethodCollector.i(3942);
        if (message != null) {
            Set<String> set = f41829c;
            boolean z = false;
            if (set == null || set.isEmpty()) {
                MethodCollector.o(3942);
                return false;
            }
            com.bytedance.platform.a.b.a a2 = com.bytedance.platform.a.b.a.a(message);
            synchronized (f41833g) {
                try {
                    if (message.what == 114 && f41830d.a(a2.f41821a)) {
                        f41832f.add(a2.f41822b);
                    }
                    if (f41830d.a(a2.f41821a) || f41832f.contains(a2.f41822b)) {
                        z = true;
                    }
                } finally {
                    MethodCollector.o(3942);
                }
            }
            return z;
        }
        RuntimeException runtimeException = new RuntimeException("Argument can not be null");
        MethodCollector.o(3942);
        throw runtimeException;
    }
}
