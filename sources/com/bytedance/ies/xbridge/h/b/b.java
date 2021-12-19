package com.bytedance.ies.xbridge.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.h.a.b;
import com.bytedance.ies.xbridge.h.c.b;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;

public final class b extends com.bytedance.ies.xbridge.h.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36022a = new a((byte) 0);

    static {
        Covode.recordClassIndex(21547);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21548);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.h.a.b
    public final void a(com.bytedance.ies.xbridge.h.c.b bVar, b.a aVar, e eVar) {
        String str;
        String str2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str3 = bVar.f36034b;
        if (str3 == null) {
            l.a("message");
        }
        String str4 = bVar.f36035c;
        if (str4 == null) {
            l.a("tag");
        }
        String str5 = bVar.f36033a;
        if (str5 == null) {
            l.a("level");
        }
        int i2 = 0;
        b.a aVar2 = bVar.f36036d;
        if (aVar2 != null) {
            i2 = aVar2.f36039c;
            str = aVar2.f36038b;
            str2 = aVar2.f36037a;
        } else {
            str2 = "";
            str = str2;
        }
        try {
            l.c(str3, "");
            l.c(str4, "");
            l.c(str5, "");
            l.c(str2, "");
            l.c(str, "");
            String sb = new StringBuilder(str3.length() + 100).append("[").append(str2).append(", ").append(str).append(", ").append(i2).append("]").append(str3).toString();
            l.a((Object) sb, "");
            String concat = "web_".concat(String.valueOf(str4));
            switch (str5.hashCode()) {
                case 3237038:
                    if (str5.equals("info")) {
                        ALog.i(concat, sb);
                        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 3641990:
                    if (str5.equals("warn")) {
                        ALog.w(concat, sb);
                        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 95458899:
                    if (str5.equals("debug")) {
                        ALog.d(concat, sb);
                        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 96784904:
                    if (str5.equals("error")) {
                        ALog.e(concat, sb);
                        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                case 351107458:
                    if (str5.equals("verbose")) {
                        ALog.v(concat, sb);
                        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                        return;
                    }
                    throw new IllegalArgumentException("Illegal level!");
                default:
                    throw new IllegalArgumentException("Illegal level!");
            }
        } catch (IllegalArgumentException e2) {
            ALog.w("XReportALogMethod", e2);
            aVar.a("Level is illegal!");
        }
    }
}
