package com.ss.android.ugc.aweme.inbox.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104021a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final h f104022b = i.a((h.f.a.a) c.f104028a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f104023c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final h f104024d = i.a((h.f.a.a) C2645b.f104027a);

    public static List<Integer> a() {
        return (List) f104024d.getValue();
    }

    private b() {
    }

    static final class c extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104028a = new c();

        static {
            Covode.recordClassIndex(66622);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            Object a2 = SettingsManager.a().a("inbox_reverse_notification_meta", a.class, b.f104021a);
            if (a2 == null) {
                return b.f104021a;
            }
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.a.b$b  reason: collision with other inner class name */
    static final class C2645b extends m implements h.f.a.a<List<? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2645b f104027a = new C2645b();

        static {
            Covode.recordClassIndex(66621);
        }

        C2645b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends Integer> invoke() {
            return n.b(99, 101, 997, 998);
        }
    }

    static {
        Covode.recordClassIndex(66619);
    }

    public static final class a {
        @com.google.gson.a.c(a = "interact_group")

        /* renamed from: a  reason: collision with root package name */
        public final List<Integer> f104025a;
        @com.google.gson.a.c(a = "interact_type")

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f104026b;

        static {
            Covode.recordClassIndex(66620);
        }

        public /* synthetic */ a() {
            this(n.b(7, 233, 12, 13, 2, 231, 3, 241, 6), n.b(33, 233, 13, 23, 31, 231, 1003, 41, 241, 45));
        }

        private a(List<Integer> list, List<Integer> list2) {
            l.d(list, "");
            l.d(list2, "");
            this.f104025a = list;
            this.f104026b = list2;
        }
    }
}
