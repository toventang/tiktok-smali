package com.ss.android.ugc.aweme.push;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f118909c;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f118910a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f118911b = false;

    static {
        Covode.recordClassIndex(77244);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f118912a;

        static {
            Covode.recordClassIndex(77245);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a) || !TextUtils.equals(((a) obj).f118912a, this.f118912a)) {
                return false;
            }
            return true;
        }
    }

    private g() {
    }

    public static final g a() {
        MethodCollector.i(3520);
        if (f118909c == null) {
            synchronized (g.class) {
                try {
                    if (f118909c == null) {
                        f118909c = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3520);
                    throw th;
                }
            }
        }
        g gVar = f118909c;
        MethodCollector.o(3520);
        return gVar;
    }

    public final boolean a(String str) {
        MethodCollector.i(3523);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(3523);
            return false;
        }
        synchronized (this) {
            try {
                Iterator<a> it = this.f118910a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        a next = it.next();
                        if (next != null && TextUtils.equals(next.f118912a, str)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } finally {
                MethodCollector.o(3523);
            }
        }
        return z;
    }
}
