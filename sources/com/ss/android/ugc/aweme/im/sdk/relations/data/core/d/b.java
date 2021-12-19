package com.ss.android.ugc.aweme.im.sdk.relations.data.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import h.f.b.l;
import java.util.Comparator;
import java.util.Map;

public final class b extends a<h> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103100b = new a((byte) 0);

    static {
        Covode.recordClassIndex(66103);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66104);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.d.b$b  reason: collision with other inner class name */
    public static final class C2614b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f103101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f103102b;

        static {
            Covode.recordClassIndex(66105);
        }

        public C2614b(Map map, Map map2) {
            this.f103101a = map;
            this.f103102b = map2;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Integer num = (Integer) this.f103101a.get(obj);
            Integer num2 = (Integer) this.f103101a.get(obj2);
            if (!l.a(num, num2)) {
                return h.b.a.a(num2, num);
            }
            return h.b.a.a((Long) this.f103102b.get(obj2), (Long) this.f103102b.get(obj));
        }
    }
}
