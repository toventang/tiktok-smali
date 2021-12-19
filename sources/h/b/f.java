package h.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Comparator;

public final class f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f158658a = new f();

    private f() {
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return e.f158657a;
    }

    static {
        Covode.recordClassIndex(105099);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable2;
        l.d(comparable, "");
        l.d(comparable3, "");
        return comparable3.compareTo(comparable);
    }
}
