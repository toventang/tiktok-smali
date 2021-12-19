package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.v;
import com.google.gson.w;
import h.f.b.l;
import java.util.Objects;

public final class FilterBoxEffectNetListResponseTypeAdapter implements w {
    static {
        Covode.recordClassIndex(60578);
    }

    public static final class a extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f95591a;

        static {
            Covode.recordClassIndex(60579);
        }

        a(v vVar) {
            this.f95591a = vVar;
        }

        @Override // com.google.gson.v
        public final T read(com.google.gson.c.a aVar) {
            return (T) this.f95591a.read(aVar);
        }

        @Override // com.google.gson.v
        public final void write(c cVar, T t) {
            v vVar = this.f95591a;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponse2");
            vVar.write(cVar, t);
        }
    }

    @Override // com.google.gson.w
    public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        l.d(aVar, "");
        if (!l.a(aVar.rawType, g.class)) {
            return null;
        }
        return new a(new g().a(new FilterEffectTypeAdapterFactory()).b().a((Class) h.class));
    }
}
