package com.bytedance.android.livesdk.util.rxutils;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import f.a.b.a;
import f.a.l.b;
import java.util.ArrayList;
import java.util.List;

public class RxViewModel extends ac {
    public final b<com.bytedance.android.livesdk.util.rxutils.b.b> E = new b<>();

    /* renamed from: a  reason: collision with root package name */
    private final a f22117a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final List<Pair<LiveData, u>> f22118b = new ArrayList();

    static {
        Covode.recordClassIndex(13028);
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.f22117a.a();
        for (Pair<LiveData, u> pair : this.f22118b) {
            ((LiveData) pair.first).removeObserver((u) pair.second);
        }
        this.f22118b.clear();
        this.E.onNext(com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY);
    }

    /* access modifiers changed from: protected */
    public final void a(f.a.b.b bVar) {
        this.f22117a.a(bVar);
    }
}
