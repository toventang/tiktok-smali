package com.facebook.imagepipeline.g;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Map<c, c> f47969a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c.a> f47970b;

    static {
        Covode.recordClassIndex(29006);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<c, c> f47971a;

        /* renamed from: b  reason: collision with root package name */
        public List<c.a> f47972b;

        static {
            Covode.recordClassIndex(29007);
        }

        public final d a() {
            return new d(this, (byte) 0);
        }

        private a a(c cVar, c cVar2) {
            if (this.f47971a == null) {
                this.f47971a = new HashMap();
            }
            this.f47971a.put(cVar, cVar2);
            return this;
        }

        public final a a(c cVar, c.a aVar, c cVar2) {
            if (this.f47972b == null) {
                this.f47972b = new ArrayList();
            }
            this.f47972b.add(aVar);
            a(cVar, cVar2);
            return this;
        }
    }

    private d(a aVar) {
        this.f47969a = aVar.f47971a;
        this.f47970b = aVar.f47972b;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
