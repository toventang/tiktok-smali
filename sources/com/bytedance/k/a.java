package com.bytedance.k;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(24493);
    }

    /* renamed from: com.bytedance.k.a$a  reason: collision with other inner class name */
    public static final class C0974a implements u<X> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f39756a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f39757b;

        static {
            Covode.recordClassIndex(24494);
        }

        C0974a(r rVar) {
            this.f39757b = rVar;
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(X x) {
            Object value = this.f39757b.getValue();
            if (!this.f39756a) {
                if (value == null) {
                    if (x == null) {
                        return;
                    }
                } else if (!(!l.a(value, (Object) x))) {
                    return;
                }
            }
            this.f39756a = false;
            this.f39757b.setValue(x);
        }
    }

    public static final <X> LiveData<X> a(LiveData<X> liveData) {
        l.d(liveData, "");
        r rVar = new r();
        rVar.a(liveData, new C0974a(rVar));
        return rVar;
    }
}
