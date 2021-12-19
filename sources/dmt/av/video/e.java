package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.c;

public class e<T> implements u<T> {

    /* renamed from: a  reason: collision with root package name */
    static boolean f156883a = c.f149147b;

    static {
        Covode.recordClassIndex(104205);
    }

    @Override // androidx.lifecycle.u
    public void onChanged(T t) {
        String obj;
        if (!f156883a) {
            if (t == null) {
                obj = "null";
            } else {
                obj = t.toString();
            }
            c.f149151f.a(obj);
        }
    }
}
