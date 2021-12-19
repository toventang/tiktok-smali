package com.facebook;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.c.a;
import com.facebook.internal.a.d;
import com.facebook.internal.o;
import java.util.Random;

public class j extends RuntimeException {
    static final long serialVersionUID = 1;

    static {
        Covode.recordClassIndex(29371);
    }

    public j() {
    }

    public String toString() {
        return getMessage();
    }

    public j(Throwable th) {
        super(th);
    }

    public j(final String str) {
        super(str);
        Random random = new Random();
        if (str != null && m.a() && random.nextInt(100) > 50) {
            o.a(o.b.ErrorReport, new o.a() {
                /* class com.facebook.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(29372);
                }

                @Override // com.facebook.internal.o.a
                public final void a(boolean z) {
                    if (z) {
                        try {
                            a aVar = new a(str);
                            if (aVar.a()) {
                                d.a(aVar.f48503a, aVar.toString());
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public j(String str, Throwable th) {
        super(str, th);
    }

    public j(String str, Object... objArr) {
        this(com.a.a(str, objArr));
    }
}
