package com.ss.android.ugc.aweme.dsp.common.arch;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import f.a.b.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public class BaseMusicDspViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f83283a = new ArrayList<>();

    static {
        Covode.recordClassIndex(51926);
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        Iterator<T> it = this.f83283a.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.f83283a.clear();
    }

    /* access modifiers changed from: protected */
    public final void a(b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        this.f83283a.add(bVar);
    }
}
