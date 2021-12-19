package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static final h f89567a = i.a((h.f.a.a) a.f89573a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f89568b = i.a((h.f.a.a) d.f89576a);

    /* renamed from: c  reason: collision with root package name */
    public static final aw f89569c = new aw();

    /* renamed from: d  reason: collision with root package name */
    private static final h f89570d = i.a((h.f.a.a) e.f89577a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f89571e = i.a((h.f.a.a) b.f89574a);

    /* renamed from: f  reason: collision with root package name */
    private static final h f89572f = i.a((h.f.a.a) c.f89575a);

    public static int a() {
        return ((Number) f89570d.getValue()).intValue();
    }

    public static final boolean b() {
        return ((Boolean) f89571e.getValue()).booleanValue();
    }

    public static final boolean c() {
        return ((Boolean) f89572f.getValue()).booleanValue();
    }

    private aw() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89573a = new a();

        static {
            Covode.recordClassIndex(56295);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((aw.a() & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89574a = new b();

        static {
            Covode.recordClassIndex(56296);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((aw.a() & 1) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89575a = new c();

        static {
            Covode.recordClassIndex(56297);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((aw.a() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89576a = new d();

        static {
            Covode.recordClassIndex(56298);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((aw.a() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f89577a = new e();

        static {
            Covode.recordClassIndex(56299);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("coldboot_mainact_task_exp", 0));
        }
    }

    static {
        Covode.recordClassIndex(56294);
    }
}
