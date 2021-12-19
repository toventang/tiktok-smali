package com.ss.android.ugc.aweme.kids.commonfeed.report;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2707a f106155d = new C2707a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<String> f106156a;

    /* renamed from: b  reason: collision with root package name */
    Keva f106157b;

    /* renamed from: c  reason: collision with root package name */
    String[] f106158c;

    /* renamed from: e  reason: collision with root package name */
    private final String f106159e;

    static {
        Covode.recordClassIndex(67887);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.a$a  reason: collision with other inner class name */
    public static final class C2707a {
        static {
            Covode.recordClassIndex(67888);
        }

        private C2707a() {
        }

        public /* synthetic */ C2707a(byte b2) {
            this();
        }
    }

    public a() {
        String str = "report_aweme" + KidsAccountServiceImpl.h().b().getUserId();
        this.f106159e = str;
        Keva repo = Keva.getRepo(str);
        l.b(repo, "");
        this.f106157b = repo;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] a() {
        /*
            r6 = this;
            java.util.List<java.lang.String> r1 = r6.f106156a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r5 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Objects.requireNonNull(r0, r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0013:
            com.bytedance.keva.Keva r1 = r6.f106157b
            java.lang.String r0 = "report_aweme_list"
            r3 = 0
            java.lang.String[] r2 = r1.getStringArray(r0, r3)
            r1 = 1
            if (r2 == 0) goto L_0x0025
            int r0 = r2.length
            if (r0 != 0) goto L_0x002b
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002d
            return r3
        L_0x0029:
            r0 = 0
            goto L_0x0026
        L_0x002b:
            r0 = 0
            goto L_0x0023
        L_0x002d:
            int r0 = r2.length
            if (r0 != 0) goto L_0x0035
            r0 = 1
        L_0x0031:
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0042
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0031
        L_0x0037:
            java.util.List r0 = h.a.i.k(r2)     // Catch:{ Exception -> 0x003e }
            r6.f106156a = r0     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            java.util.List<java.lang.String> r1 = r6.f106156a
            if (r1 == 0) goto L_0x0052
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Objects.requireNonNull(r0, r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.report.a.a():java.lang.String[]");
    }
}
