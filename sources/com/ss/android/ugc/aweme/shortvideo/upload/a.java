package com.ss.android.ugc.aweme.shortvideo.upload;

import androidx.core.d.a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a implements a.AbstractC0029a {

    /* renamed from: a  reason: collision with root package name */
    private final List<a.AbstractC0029a> f131966a = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(86469);
    }

    @Override // androidx.core.d.a.AbstractC0029a
    public final void a() {
        for (a.AbstractC0029a aVar : this.f131966a) {
            aVar.a();
        }
    }

    public final void a(a.AbstractC0029a aVar) {
        this.f131966a.add(aVar);
    }
}
