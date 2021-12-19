package dmt.av.video;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class g<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<T> f156894a = new ArrayList<>();

    static {
        Covode.recordClassIndex(104224);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        super.setValue(t);
        this.f156894a.add(t);
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(m mVar, final u<? super T> uVar) {
        super.observe(mVar, new u<T>() {
            /* class dmt.av.video.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            boolean f156895a;

            static {
                Covode.recordClassIndex(104225);
            }

            @Override // androidx.lifecycle.u
            public final void onChanged(T t) {
                if (this.f156895a || g.this.f156894a.isEmpty()) {
                    uVar.onChanged(t);
                } else {
                    for (int i2 = 0; i2 < g.this.f156894a.size(); i2++) {
                        uVar.onChanged(g.this.f156894a.get(i2));
                    }
                }
                this.f156895a = true;
            }
        });
    }
}
