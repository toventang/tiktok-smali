package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import h.f.b.m;
import h.h;
import h.i;

public final class ab extends p {

    /* renamed from: k  reason: collision with root package name */
    private final h f104814k = i.a((h.f.a.a) a.f104815a);

    static {
        Covode.recordClassIndex(67226);
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int c() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int e() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int f() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final String g() {
        return "";
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104815a = new a();

        static {
            Covode.recordClassIndex(67227);
        }

        a() {
            super(0);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean a2;
            d.a();
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = a();
            }
            if (!j.f107226e) {
                a2 = false;
            } else {
                a2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.a(true);
            }
            return Boolean.valueOf(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.p
    public final int d() {
        if (((Boolean) this.f104814k.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }
}
