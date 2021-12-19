package com.ss.android.deviceregister.b.a.a;

import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;

public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    public b f59428d;

    /* access modifiers changed from: package-private */
    public interface a<L> {
        static {
            Covode.recordClassIndex(36698);
        }

        L a();

        L a(L l2, L l3, b bVar);

        void a(L l2);

        boolean a(L l2, L l3);

        boolean b(L l2);
    }

    static {
        Covode.recordClassIndex(36696);
    }

    /* access modifiers changed from: protected */
    public abstract String a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(String str, String str2);

    public void b(String str) {
        b bVar = this.f59428d;
        if (bVar != null) {
            bVar.b(str);
        }
    }

    public final String b(String str, String str2) {
        return (String) a(str, str2, new a<String>() {
            /* class com.ss.android.deviceregister.b.a.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36697);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.ss.android.deviceregister.b.a.a.b.a
            public final /* bridge */ /* synthetic */ String a() {
                return b.this.a("device_id");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.deviceregister.b.a.a.b.a
            public final /* synthetic */ boolean b(String str) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
                return false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.deviceregister.b.a.a.b.a
            public final /* bridge */ /* synthetic */ void a(String str) {
                b.this.a("device_id", str);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // com.ss.android.deviceregister.b.a.a.b.a
            public final /* bridge */ /* synthetic */ boolean a(String str, String str2) {
                return m.a(str, str2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.ss.android.deviceregister.b.a.a.b] */
            @Override // com.ss.android.deviceregister.b.a.a.b.a
            public final /* synthetic */ String a(String str, String str2, b bVar) {
                String str3 = str;
                String str4 = str2;
                if (bVar == null) {
                    return str3;
                }
                return bVar.b(str3, str4);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7.b(r6) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r7.a(r6, r3) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r7.a(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T a(T r5, T r6, com.ss.android.deviceregister.b.a.a.b.a<T> r7) {
        /*
            r4 = this;
            com.ss.android.deviceregister.b.a.a.b r0 = r4.f59428d
            java.lang.Object r3 = r7.a()
            boolean r2 = r7.b(r5)
            boolean r1 = r7.b(r3)
            if (r2 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            r5 = r3
        L_0x0013:
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r7.a(r5, r6, r0)
            boolean r0 = r7.a(r1, r3)
            if (r0 != 0) goto L_0x0022
            r7.a(r1)
        L_0x0022:
            return r1
        L_0x0023:
            r0 = 0
            if (r2 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            boolean r0 = r7.b(r6)
            if (r0 != 0) goto L_0x0036
        L_0x002e:
            if (r2 == 0) goto L_0x0039
            boolean r0 = r7.a(r6, r3)
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            r7.a(r6)
        L_0x0039:
            return r6
        L_0x003a:
            r6 = r5
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.b.a.a.b.a(java.lang.Object, java.lang.Object, com.ss.android.deviceregister.b.a.a.b$a):java.lang.Object");
    }
}
