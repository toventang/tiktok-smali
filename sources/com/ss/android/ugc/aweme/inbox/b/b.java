package com.ss.android.ugc.aweme.inbox.b;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f104051a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f104052b = i.a((h.f.a.a) a.f104056a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f104053c = i.a((h.f.a.a) c.f104058a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f104054d = i.a((h.f.a.a) d.f104059a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f104055e = i.a((h.f.a.a) C2647b.f104057a);

    public static int a() {
        return ((Number) f104052b.getValue()).intValue();
    }

    public static boolean b() {
        return ((Boolean) f104053c.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f104054d.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) f104055e.getValue()).booleanValue();
    }

    private b() {
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104058a = new c();

        static {
            Covode.recordClassIndex(66641);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f104059a = new d();

        static {
            Covode.recordClassIndex(66642);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (b.a() == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104056a = new a();

        static {
            Covode.recordClassIndex(66639);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "inbox_redesign_type", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.b$b  reason: collision with other inner class name */
    static final class C2647b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2647b f104057a = new C2647b();

        static {
            Covode.recordClassIndex(66640);
        }

        C2647b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!(b.a() == 1 || b.a() == 2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(66638);
    }
}
