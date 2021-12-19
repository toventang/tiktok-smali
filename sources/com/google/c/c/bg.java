package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.io.Serializable;

final class bg extends az<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final bg f54004a = new bg();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private bg() {
    }

    private Object readResolve() {
        return f54004a;
    }

    @Override // com.google.c.c.az
    public final <S extends Comparable> az<S> a() {
        return aw.f53956a;
    }

    static {
        Covode.recordClassIndex(33470);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.c.c.az, java.util.Comparator
    public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
        Comparable comparable3 = comparable2;
        k.a(comparable);
        if (comparable == comparable3) {
            return 0;
        }
        return comparable3.compareTo(comparable);
    }
}
