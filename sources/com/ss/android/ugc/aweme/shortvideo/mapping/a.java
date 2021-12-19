package com.ss.android.ugc.aweme.shortvideo.mapping;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.io.Serializable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.bytedance.creativex.a.a.a f128766a = new com.bytedance.creativex.a.a.a(C3358a.f128767a);

    static {
        Covode.recordClassIndex(84395);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mapping.a$a  reason: collision with other inner class name */
    static final class C3358a extends m implements b<Class<?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3358a f128767a = new C3358a();

        static {
            Covode.recordClassIndex(84396);
        }

        C3358a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            l.d(cls2, "");
            return Boolean.valueOf(Serializable.class.isAssignableFrom(cls2));
        }
    }
}
