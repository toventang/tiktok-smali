package com.airbnb.epoxy;

import androidx.c.d;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final s<?> f5047a;

    /* renamed from: b  reason: collision with root package name */
    final d<s<?>> f5048b;

    static {
        Covode.recordClassIndex(2131);
    }

    public j(s<?> sVar) {
        this(Collections.singletonList(sVar));
    }

    private j(List<? extends s<?>> list) {
        if (!list.isEmpty()) {
            int size = list.size();
            if (size == 1) {
                this.f5047a = (s) list.get(0);
                this.f5048b = null;
                return;
            }
            this.f5047a = null;
            this.f5048b = new d<>(size);
            for (s<?> sVar : list) {
                this.f5048b.b(sVar.f5077a, sVar);
            }
            return;
        }
        throw new IllegalStateException("Models must not be empty");
    }
}
