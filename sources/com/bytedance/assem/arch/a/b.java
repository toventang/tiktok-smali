package com.bytedance.assem.arch.a;

import com.bytedance.covode.number.Covode;
import h.f.a;
import h.f.b.l;
import h.k.c;
import java.lang.reflect.InvocationTargetException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f25413a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(14768);
    }

    public static <OPT extends d> a<OPT> a(c<? extends a<OPT>> cVar) {
        l.c(cVar, "");
        if (a.class.isAssignableFrom(a.a(cVar))) {
            try {
                return (a) a.a(cVar).newInstance();
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cVar)), e5);
            }
        } else {
            throw new IllegalArgumentException("Custom Model must be a subclass of AssemModel<ModelOperator>.");
        }
    }
}
