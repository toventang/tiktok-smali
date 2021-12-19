package dmt.av.video;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public final class k<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    T f156899a;

    static {
        Covode.recordClassIndex(104229);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        super.setValue(t);
        this.f156899a = t;
    }

    public final void a(m mVar, d<T> dVar) {
        super.observe(mVar, new l(this, dVar));
    }
}
