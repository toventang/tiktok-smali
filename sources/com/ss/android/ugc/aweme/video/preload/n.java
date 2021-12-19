package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public final c f143758a;

    static {
        Covode.recordClassIndex(94053);
    }

    public static final class a extends n {

        /* renamed from: b  reason: collision with root package name */
        public static final a f143759b = new a();

        private a() {
            super(c.GHouse, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94054);
        }
    }

    public static final class b extends n {

        /* renamed from: b  reason: collision with root package name */
        public static final b f143760b = new b();

        private b() {
            super(c.Normal, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94055);
        }
    }

    public static final class c extends n {

        /* renamed from: b  reason: collision with root package name */
        public static final c f143761b = new c();

        private c() {
            super(c.Normal, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94056);
        }
    }

    public int hashCode() {
        return this.f143758a.hashCode();
    }

    private n(c cVar) {
        this.f143758a = cVar;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new w("null cannot be cast to non-null type");
        } else if (this.f143758a != ((n) obj).f143758a) {
            return false;
        } else {
            return true;
        }
    }

    public /* synthetic */ n(c cVar, byte b2) {
        this(cVar);
    }
}
