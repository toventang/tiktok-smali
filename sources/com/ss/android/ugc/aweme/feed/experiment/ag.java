package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    static final h f93034a = i.a((h.f.a.a) c.f93041a);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f93035b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final ag f93036c = new ag();

    /* renamed from: d  reason: collision with root package name */
    private static final h f93037d = i.a((h.f.a.a) b.f93040a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f93038e = i.a((h.f.a.a) a.f93039a);

    public static boolean a() {
        return ((Boolean) f93037d.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) f93038e.getValue()).booleanValue();
    }

    private ag() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93039a = new a();

        static {
            Covode.recordClassIndex(59005);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!ag.f93035b || !ag.a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93040a = new b();

        static {
            Covode.recordClassIndex(59006);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((((Number) ag.f93034a.getValue()).intValue() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f93041a = new c();

        static {
            Covode.recordClassIndex(59007);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("jump_cookie", 0));
        }
    }

    static {
        Covode.recordClassIndex(59004);
    }
}
