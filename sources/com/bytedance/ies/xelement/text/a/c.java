package com.bytedance.ies.xelement.text.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class c implements b {

    /* renamed from: b  reason: collision with root package name */
    public static c f37434b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37435c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f37436a;

    static {
        Covode.recordClassIndex(22509);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22510);
        }

        private a() {
        }

        public static c a() {
            MethodCollector.i(13349);
            if (c.f37434b == null) {
                synchronized (c.class) {
                    try {
                        if (c.f37434b == null) {
                            c.f37434b = new c((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(13349);
                        throw th;
                    }
                }
            }
            c cVar = c.f37434b;
            if (cVar == null) {
                l.a();
            }
            MethodCollector.o(13349);
            return cVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        this.f37436a = bVar;
    }

    @Override // com.bytedance.ies.xelement.text.a.b
    public final Drawable a(Context context, String str) {
        b bVar = this.f37436a;
        if (bVar == null) {
            l.a("adapter");
        }
        return bVar.a(context, str);
    }
}
