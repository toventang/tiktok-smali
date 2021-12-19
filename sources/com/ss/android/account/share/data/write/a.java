package com.ss.android.account.share.data.write;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f58227c;

    /* renamed from: d  reason: collision with root package name */
    public static final C1281a f58228d = new C1281a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f58229a = "account_sec_share_data";

    /* renamed from: b  reason: collision with root package name */
    public final Context f58230b;

    static {
        Covode.recordClassIndex(36183);
    }

    /* renamed from: com.ss.android.account.share.data.write.a$a  reason: collision with other inner class name */
    public static final class C1281a {
        static {
            Covode.recordClassIndex(36184);
        }

        private C1281a() {
        }

        public /* synthetic */ C1281a(byte b2) {
            this();
        }

        public static a a(Context context) {
            MethodCollector.i(1223);
            l.c(context, "");
            if (a.f58227c == null) {
                synchronized (a.class) {
                    try {
                        if (a.f58227c == null) {
                            Context applicationContext = context.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                                if (applicationContext == null) {
                                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                            }
                            l.a((Object) applicationContext, "");
                            a.f58227c = new a(applicationContext);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(1223);
                        throw th;
                    }
                }
            }
            a aVar = a.f58227c;
            if (aVar == null) {
                l.a();
            }
            MethodCollector.o(1223);
            return aVar;
        }
    }

    public a(Context context) {
        l.c(context, "");
        this.f58230b = context;
    }

    public final String a(String str) {
        l.c(str, "");
        SharedPreferences a2 = d.a(this.f58230b, this.f58229a, 0);
        l.a((Object) a2, "");
        return a2.getString(str, "");
    }
}
