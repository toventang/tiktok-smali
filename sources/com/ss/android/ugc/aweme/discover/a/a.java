package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import h.a.am;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f80120a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f80121b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f80122c = i.a((h.f.a.a) C1871a.f80124a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f80123d = i.a((h.f.a.a) b.f80127a);

    public static b a() {
        return (b) f80123d.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.a$a  reason: collision with other inner class name */
    static final class C1871a extends m implements h.f.a.a<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1871a f80124a = new C1871a();

        static {
            Covode.recordClassIndex(49871);
        }

        C1871a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<? extends String> invoke() {
            return am.a((Object[]) new String[]{"general", "discover"});
        }
    }

    static final class b extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f80127a = new b();

        static {
            Covode.recordClassIndex(49872);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return com.bytedance.ies.abmock.b.a().a(true, "search_direct_account_sug", b.class, a.f80120a);
        }
    }

    static {
        Covode.recordClassIndex(49870);
    }

    public static final boolean a(String str) {
        if (str == null) {
            str = "";
        }
        if (((Set) f80122c.getValue()).contains(str) && d.a() > 0 && d.b() > 0) {
            return true;
        }
        return false;
    }
}
