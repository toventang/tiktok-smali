package com.ss.android.ugc.aweme.ca;

import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.bx;
import com.ss.android.ugc.aweme.utils.cm;
import h.f.b.m;
import h.z;
import java.util.HashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<Integer> f69588a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f69589b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f69590c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static int f69591d = -1;

    private a() {
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ int $tid;

        static {
            Covode.recordClassIndex(42931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(0);
            this.$tid = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Jato.resetCoreBind(this.$tid);
            return z.f158842a;
        }
    }

    private static int d() {
        return Keva.getRepo("ab_repo_cold_boot").getInt("key_big_core_count", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ca.a$a  reason: collision with other inner class name */
    public static final class C1575a extends m implements h.f.a.a<z> {
        final /* synthetic */ int $tid;

        static {
            Covode.recordClassIndex(42930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1575a(int i2) {
            super(0);
            this.$tid = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Jato.bindBigCore(this.$tid);
            a.f69588a.add(Integer.valueOf(this.$tid));
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(42929);
    }

    public static boolean a() {
        if (f69589b || c() - 2 < 2 || !bx.a()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        return Keva.getRepo("ab_repo_cold_boot").getBoolean("key_has_fetched_big_core_count", false);
    }

    private static int c() {
        int i2 = f69591d;
        if (i2 != -1) {
            return i2;
        }
        if (!b()) {
            return 0;
        }
        int d2 = d();
        f69591d = d2;
        return d2;
    }

    public static void a(int i2) {
        cm.f142777a.a("BigCoreBindManager#bindBigCore", new C1575a(i2));
    }

    public static void b(int i2) {
        cm.f142777a.a("BigCoreBindManager#resetBigCore", new b(i2));
    }
}
