package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.d;
import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.basics.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0572a f26666a = new C0572a((byte) 0);

    static {
        Covode.recordClassIndex(15720);
    }

    /* renamed from: com.bytedance.bpea.entry.common.a$a  reason: collision with other inner class name */
    public static final class C0572a {
        static {
            Covode.recordClassIndex(15721);
        }

        private C0572a() {
        }

        public /* synthetic */ C0572a(byte b2) {
            this();
        }

        public static void b(d dVar, String str) {
            l.c(str, "");
            a(dVar, new String[]{DataType.AUDIO}, str);
        }

        public static void c(d dVar, String str) {
            l.c(str, "");
            a(dVar, new String[]{"clipboard"}, str);
        }

        public static void d(d dVar, String str) {
            l.c(str, "");
            a(dVar, new String[]{"latitudeAndLongitude"}, str);
        }

        public static void a(d dVar, String str) {
            l.c(str, "");
            a(dVar, new String[]{"video"}, str);
        }

        private static f a(String[] strArr, String str, int i2) {
            f fVar = new f();
            fVar.f26601b = strArr;
            fVar.f26600a = str;
            fVar.f26602c = Integer.valueOf(i2);
            return fVar;
        }

        public static void a(d dVar, String[] strArr, String str) {
            l.c(str, "");
            b.a(dVar, a(strArr, str, i.BPEA_ENTRY.getType()));
        }

        public static void a(d dVar, String[] strArr, String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            f a2 = a(strArr, str + '_' + str2, i.DIRECT_AUTH.getType());
            a2.a("sdkName", str);
            a2.a("methodName", str2);
            b.a(dVar, a2);
        }
    }
}
