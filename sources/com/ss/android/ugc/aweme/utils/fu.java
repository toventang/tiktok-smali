package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public final class fu implements Serializable {
    public static final a Companion = new a((byte) 0);
    private final h mParams$delegate = i.a((h.f.a.a) b.f142954a);

    static {
        Covode.recordClassIndex(93547);
    }

    private final Map<String, Object> a() {
        return (Map) this.mParams$delegate.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93548);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Map<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142954a = new b();

        static {
            Covode.recordClassIndex(93549);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public final <T> T get(String str) {
        l.d(str, "");
        T t = (T) a().get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> cls) {
        l.d(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        T t = (T) a().get("com.ss.android.ugc.aweme.utils.ParamsBundle:".concat(String.valueOf(canonicalName)));
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> cls, T t) {
        l.d(cls, "");
        T t2 = (T) get(cls);
        return t2 == null ? t : t2;
    }

    public final <T> void put(String str, T t) {
        l.d(str, "");
        a().put(str, t);
    }

    public final <T> void put(Class<T> cls, T t) {
        l.d(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            a().put("com.ss.android.ugc.aweme.utils.ParamsBundle:".concat(String.valueOf(canonicalName)), t);
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can't be the key of ParamBundle");
    }

    public final <T> T get(String str, T t) {
        l.d(str, "");
        T t2 = (T) get(str);
        return t2 == null ? t : t2;
    }
}
