package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.h;
import h.i;
import h.m;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f134308a = i.a(m.SYNCHRONIZED, b.f134311a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f134309b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f134310c = i.a((h.f.a.a) c.f134312a);

    public static final class a {
        static {
            Covode.recordClassIndex(87836);
        }

        public static j a() {
            return (j) j.f134308a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134311a = new b();

        static {
            Covode.recordClassIndex(87837);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return new j();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134312a = new c();

        static {
            Covode.recordClassIndex(87838);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("spec_act_debug_time");
        }
    }

    public final boolean a() {
        return ((Keva) this.f134310c.getValue()).getBoolean("use_local_time", false);
    }

    static {
        Covode.recordClassIndex(87835);
    }
}
