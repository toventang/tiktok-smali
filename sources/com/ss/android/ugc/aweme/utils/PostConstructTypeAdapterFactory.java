package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import com.google.gson.w;

public class PostConstructTypeAdapterFactory implements w {
    static {
        Covode.recordClassIndex(93254);
    }

    static class a<T> extends v<T> {

        /* renamed from: a  reason: collision with root package name */
        private final v<T> f142569a;

        static {
            Covode.recordClassIndex(93255);
        }

        a(v<T> vVar) {
            this.f142569a = vVar;
        }

        @Override // com.google.gson.v
        public final T read(com.google.gson.c.a aVar) {
            return this.f142569a.read(aVar);
        }

        @Override // com.google.gson.v
        public final void write(c cVar, T t) {
            this.f142569a.write(cVar, t);
        }
    }

    @Override // com.google.gson.w
    public <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
        return new a(fVar.a(this, aVar));
    }
}
