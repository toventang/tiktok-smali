package com.ss.android.ugc.aweme.ug.praise.c;

import android.app.Activity;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f141986a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92777);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.c.b$b  reason: collision with other inner class name */
    public static final class C3782b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C3782b f141988a = new C3782b();

        static {
            Covode.recordClassIndex(92779);
        }

        C3782b() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            Activity j2 = f.j();
            if (j2 != null) {
                l.b(iVar, "");
                Boolean bool = (Boolean) iVar.d();
                l.b(bool, "");
                if (bool.booleanValue()) {
                    new com.ss.android.ugc.aweme.ug.praise.b(new a(j2)).a();
                }
            }
            return z.f158842a;
        }
    }

    public static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f141987a = new a();

        static {
            Covode.recordClassIndex(92778);
        }

        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
            if (com.ss.android.ugc.aweme.ug.praise.b.a.a() != false) goto L_0x0028;
         */
        @Override // b.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(b.i r12) {
            /*
            // Method dump skipped, instructions count: 209
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.praise.c.b.a.then(b.i):java.lang.Object");
        }
    }
}
