package com.facebook.imagepipeline.g;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.j.h;
import java.util.Collections;
import java.util.List;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f47981a;

    public interface b {
        static {
            Covode.recordClassIndex(29012);
        }

        List<Integer> a();
    }

    static {
        Covode.recordClassIndex(29010);
    }

    static class a implements b {
        static {
            Covode.recordClassIndex(29011);
        }

        private a() {
        }

        @Override // com.facebook.imagepipeline.g.g.b
        public final List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public g() {
        this(new a((byte) 0));
    }

    @Override // com.facebook.imagepipeline.g.e
    public final h b(int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        return com.facebook.imagepipeline.j.g.a(i2, z, false);
    }

    private g(b bVar) {
        this.f47981a = (b) i.a(bVar);
    }

    @Override // com.facebook.imagepipeline.g.e
    public final int a(int i2) {
        List<Integer> a2 = this.f47981a.a();
        if (a2 == null || a2.isEmpty()) {
            return i2 + 1;
        }
        for (int i3 = 0; i3 < a2.size(); i3++) {
            if (a2.get(i3).intValue() > i2) {
                return a2.get(i3).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
