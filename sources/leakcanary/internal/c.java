package leakcanary.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import h.m.l;
import java.util.Iterator;
import m.a;

public final class c implements a.AbstractC4200a {

    /* renamed from: a  reason: collision with root package name */
    public static final l f159417a = new l("\n");

    /* renamed from: b  reason: collision with root package name */
    public static final a f159418b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(105844);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(105843);
    }

    @Override // m.a.AbstractC4200a
    public final void a(String str) {
        h.f.b.l.c(str, "");
        if (str.length() >= 4000) {
            Iterator<T> it = f159417a.split(str, 0).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // m.a.AbstractC4200a
    public final void a(Throwable th, String str) {
        h.f.b.l.c(th, "");
        h.f.b.l.c(str, "");
        a(str + '\n' + Log.getStackTraceString(th));
    }
}
