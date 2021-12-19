package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import d.a.g.b;
import h.f.b.l;
import h.w;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public b<String, a> f153657a = new b<>();

    /* renamed from: b  reason: collision with root package name */
    public d.a.a.b<String, ModelInfo> f153658b = new d.a.a.b<>();

    static {
        Covode.recordClassIndex(102483);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public ModelInfo f153659a;

        static {
            Covode.recordClassIndex(102484);
        }

        public final int hashCode() {
            return this.f153659a.hashCode();
        }

        public a(ModelInfo modelInfo) {
            l.c(modelInfo, "");
            this.f153659a = modelInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                return l.a(this.f153659a, ((a) obj).f153659a);
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final void a(b<String, a> bVar) {
        l.c(bVar, "");
        this.f153657a = bVar;
        this.f153658b.clear();
        for (T t : bVar.a()) {
            this.f153658b.put(t.f153659a.getName(), t.f153659a);
        }
    }

    public final ExtendedUrlModel a(String str) {
        l.c(str, "");
        for (T t : this.f153657a.a()) {
            if (l.a((Object) t.f153659a.getName(), (Object) str)) {
                return t.f153659a.getFile_url();
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }
}
