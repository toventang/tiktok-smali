package defpackage;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.faceinfo.c;
import com.ss.android.vesdk.faceinfo.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: a  reason: default package */
public final class a {
    static {
        Covode.recordClassIndex(0);
    }

    public static final Rect[] a(d dVar) {
        l.d(dVar, "");
        ArrayList arrayList = new ArrayList();
        c[] cVarArr = dVar.f151307a;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                l.b(cVar, "");
                Rect rect = cVar.f151285a;
                l.b(rect, "");
                arrayList.add(rect);
            }
        }
        Object[] array = arrayList.toArray(new Rect[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Rect[]) array;
    }
}
