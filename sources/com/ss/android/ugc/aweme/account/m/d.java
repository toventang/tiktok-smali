package com.ss.android.ugc.aweme.account.m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f65149a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f65150b = new a((byte) 0);

    static {
        Covode.recordClassIndex(40050);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40051);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public static void a(int r2, int r3, java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                org.json.JSONObject r1 = a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_email"
                com.ss.android.ugc.aweme.account.m.b.a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.m.d.a.a(int, int, java.lang.String):void");
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public static void b(boolean r2, int r3, java.lang.String r4) {
            /*
                r2 = r2 ^ 1
                java.lang.String r0 = ""
                org.json.JSONObject r1 = a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_phone_sms"
                com.ss.android.ugc.aweme.account.m.b.a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.m.d.a.b(boolean, int, java.lang.String):void");
        }

        private static JSONObject b(int i2, String str, String str2) {
            c cVar = new c();
            long currentTimeMillis = System.currentTimeMillis() - d.f65149a;
            d.f65149a = 0;
            if (i2 != 0) {
                cVar.a("error_code", Integer.valueOf(i2)).a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.a("platform", str2);
            }
            cVar.a("time", Long.valueOf(currentTimeMillis));
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            return a2;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public static void a(boolean r2, int r3, java.lang.String r4) {
            /*
                r2 = r2 ^ 1
                java.lang.String r0 = ""
                org.json.JSONObject r1 = a(r3, r4, r0)
                java.lang.String r0 = "monitor_login_phone_passport"
                com.ss.android.ugc.aweme.account.m.b.a(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.m.d.a.a(boolean, int, java.lang.String):void");
        }

        public static void b(int i2, int i3, String str) {
            c cVar = new c();
            if (i3 != 0) {
                cVar.a("error_code", Integer.valueOf(i3)).a("error_desc", str);
            }
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            b.a("monitor_login_verified_env", i2, a2);
        }

        public static void a(int i2, String str, int i3, String str2) {
            l.d(str, "");
            b.a("monitor_login_thirdparty", i2, b(i3, str2, str));
        }

        /* access modifiers changed from: private */
        public static JSONObject a(int i2, String str, String str2, String str3) {
            l.d(str2, "");
            l.d(str3, "");
            c cVar = new c();
            if (i2 != 0) {
                cVar.a("error_code", Integer.valueOf(i2)).a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cVar.a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                cVar.a("carrier_type", str3);
            }
            JSONObject a2 = cVar.a();
            l.b(a2, "");
            return a2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:78)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public static final void a(boolean r7, int r8, java.lang.String r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.m.d.a(boolean, int, java.lang.String, android.os.Bundle):void");
    }
}
