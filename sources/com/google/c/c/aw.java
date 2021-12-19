package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.io.Serializable;

public final class aw extends az<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final aw f53956a = new aw();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    private aw() {
    }

    private Object readResolve() {
        return f53956a;
    }

    @Override // com.google.c.c.az
    public final <S extends Comparable> az<S> a() {
        return bg.f54004a;
    }

    static {
        Covode.recordClassIndex(33450);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.c.c.az, java.util.Comparator
    public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        Comparable comparable3 = comparable;
        k.a(comparable3);
        k.a(comparable2);
        return comparable3.compareTo(comparable2);
    }
}
