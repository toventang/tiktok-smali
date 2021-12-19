package com.ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f118630a = i.a((h.f.a.a) c.f118635a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f118631b = i.a((h.f.a.a) C3022b.f118634a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f118632c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h f118633d;

    public final m a() {
        return (m) this.f118633d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77042);
        }

        public static b a() {
            return (b) b.f118630a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f118635a = new c();

        static {
            Covode.recordClassIndex(77044);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.upload.b$b  reason: collision with other inner class name */
    static final class C3022b extends h.f.b.m implements h.f.a.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3022b f118634a = new C3022b();

        static {
            Covode.recordClassIndex(77043);
        }

        C3022b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return a.a().a();
        }
    }

    private b() {
        this.f118633d = i.a((h.f.a.a) d.f118636a);
    }

    static final class d extends h.f.b.m implements h.f.a.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f118636a = new d();

        static {
            Covode.recordClassIndex(77045);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            SmartSliceModel a2 = a.a();
            if (a2 != null) {
                return new m(new c(a2));
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(77041);
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
