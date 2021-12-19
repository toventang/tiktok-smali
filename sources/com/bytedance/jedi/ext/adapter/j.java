package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.w;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39753a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final ad.b f39754b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39755c;

    static {
        Covode.recordClassIndex(24488);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(24489);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static j a(ad.b bVar, h hVar) {
            l.c(bVar, "");
            l.c(hVar, "");
            return new j(bVar, hVar);
        }
    }

    public j(ad.b bVar, h hVar) {
        l.c(bVar, "");
        l.c(hVar, "");
        this.f39754b = bVar;
        this.f39755c = hVar;
    }

    public final <VM extends ac> VM a(String str, Class<VM> cls) {
        VM vm;
        MethodCollector.i(5480);
        l.c(str, "");
        l.c(cls, "");
        h hVar = this.f39755c;
        l.c(str, "");
        VM vm2 = (VM) hVar.a().get(str);
        if (!cls.isInstance(vm2)) {
            synchronized (cls) {
                try {
                    vm = (VM) this.f39754b.a(cls);
                } catch (Throwable th) {
                    MethodCollector.o(5480);
                    throw th;
                }
            }
            h hVar2 = this.f39755c;
            l.a((Object) vm, "");
            l.c(str, "");
            l.c(vm, "");
            ac put = hVar2.a().put(str, vm);
            if (put != null) {
                put.onCleared();
            }
            l.a((Object) vm, "");
            MethodCollector.o(5480);
            return vm;
        } else if (vm2 != null) {
            MethodCollector.o(5480);
            return vm2;
        } else {
            w wVar = new w("null cannot be cast to non-null type");
            MethodCollector.o(5480);
            throw wVar;
        }
    }
}
