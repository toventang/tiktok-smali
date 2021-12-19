package h.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Comparator;

final class e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f158657a = new e();

    private e() {
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return f.f158658a;
    }

    static {
        Covode.recordClassIndex(105098);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        l.d(comparable3, "");
        l.d(comparable2, "");
        return comparable3.compareTo(comparable2);
    }
}
