package com.ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.b.c;
import com.ss.android.ugc.aweme.notice.api.b;
import h.a.n;
import h.f.b.k;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f113809a = i.a((h.f.a.a) a.f113811a);

    /* renamed from: b  reason: collision with root package name */
    public static final g f113810b = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(73191);
    }

    public static int c() {
        if (com.ss.android.ugc.aweme.inbox.a.a.c()) {
            return 0;
        }
        return b.a(99);
    }

    public static boolean a() {
        List g2 = n.g((Collection) f.a());
        com.ss.android.ugc.aweme.inbox.a.a.a(g2);
        k kVar = new k();
        kVar.b(n.e((Collection<Integer>) g2));
        kVar.a();
        if (!b.c(kVar.b())) {
            if (!b.c(101) || com.ss.android.ugc.aweme.inbox.a.a.c()) {
                return false;
            }
        }
        return true;
    }

    public static int b() {
        int c2 = c();
        List g2 = n.g((Collection) f.b());
        com.ss.android.ugc.aweme.inbox.a.a.a(g2);
        if (c.h()) {
            g2.remove((Object) 225);
            g2.remove((Object) 233);
        }
        int[] e2 = n.e((Collection<Integer>) g2);
        return b.b(Arrays.copyOf(e2, e2.length)) + c2;
    }

    static final class a extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113811a = new a();

        static {
            Covode.recordClassIndex(73192);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ int[] invoke() {
            List c2 = n.c(3, 2, 6, 14, 7, 12, 228);
            com.ss.android.ugc.aweme.inbox.a.a.a(c2);
            return n.e((Collection<Integer>) c2);
        }
    }

    public static boolean a(int i2) {
        if (com.ss.android.ugc.aweme.inbox.a.a.a(i2)) {
            return false;
        }
        if (f.a(i2) || i2 == 1000 || i2 == 101) {
            return true;
        }
        return false;
    }

    public static final boolean b(int i2) {
        if (com.ss.android.ugc.aweme.inbox.a.a.a(i2)) {
            return false;
        }
        if (f.b(i2) || i2 == 99) {
            return true;
        }
        return false;
    }
}
