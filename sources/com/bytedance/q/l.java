package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import com.bytedance.q.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: b  reason: collision with root package name */
    public Map<String, a> f42385b;

    static {
        Covode.recordClassIndex(25905);
    }

    l() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        List<h> f42386a = new ArrayList();

        static {
            Covode.recordClassIndex(25906);
        }

        public final a a(h hVar) {
            this.f42386a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f42386a.addAll(list);
            return this;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.q.b.a f42387a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, a> f42388b = new HashMap();

        static {
            Covode.recordClassIndex(25907);
        }

        public final h a(Class<? extends l> cls) {
            h.a a2 = new h.a().a(cls);
            a2.f42381c = new Object[]{this.f42388b};
            a2.f42380b = this.f42387a;
            return a2.a();
        }

        public final a a(String str) {
            if (!this.f42388b.containsKey(str)) {
                a aVar = new a();
                this.f42388b.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }
    }

    static boolean a(List<h> list) {
        if (!list.isEmpty() && list.get(list.size() - 1).f42376a == g.class) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        if (objArr == null || objArr.length != 1 || objArr[0] == null) {
            throw new IllegalStateException("args error");
        }
        try {
            this.f42385b = (Map) objArr[0];
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
