package com.ss.android.ugc.aweme.s;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final h f120814a = i.a((h.f.a.a) a.f120819a);

    /* renamed from: b  reason: collision with root package name */
    public static final f f120815b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f120816c = i.a((h.f.a.a) c.f120821a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f120817d = i.a((h.f.a.a) b.f120820a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f120818e = i.a((h.f.a.a) d.f120822a);

    public static boolean a() {
        return ((Boolean) f120816c.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) f120817d.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f120818e.getValue()).booleanValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120819a = new a();

        static {
            Covode.recordClassIndex(78715);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_dont_move_doframe_opt", false));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120820a = new b();

        static {
            Covode.recordClassIndex(78716);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_asynchronous_opt", false));
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120821a = new c();

        static {
            Covode.recordClassIndex(78717);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_focus_send_opt", false));
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f120822a = new d();

        static {
            Covode.recordClassIndex(78718);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("first_feed_msg_post_animation_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(78714);
    }
}
