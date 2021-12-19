package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.i.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private List<s> f5151a = new ArrayList();

    static {
        Covode.recordClassIndex(2187);
    }

    /* access modifiers changed from: package-private */
    public final void a(s sVar) {
        this.f5151a.add(sVar);
    }

    public final void a(Path path) {
        for (int size = this.f5151a.size() - 1; size >= 0; size--) {
            g.a(path, this.f5151a.get(size));
        }
    }
}
