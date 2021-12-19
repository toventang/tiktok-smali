package com.bytedance.hybrid.spark.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.a.f;
import com.bytedance.hybrid.spark.b;
import com.bytedance.hybrid.spark.d;
import com.bytedance.hybrid.spark.page.SparkActivity;
import h.f.b.l;

public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f31164a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.lynx.a.a.b.a f31165b;

    /* renamed from: c  reason: collision with root package name */
    private final SparkActivity f31166c;

    static {
        Covode.recordClassIndex(18097);
    }

    public static final class a {

        /* renamed from: com.bytedance.hybrid.spark.d.o$a$a  reason: collision with other inner class name */
        public enum EnumC0658a {
            DARK,
            Light;

            static {
                Covode.recordClassIndex(18099);
            }
        }

        static {
            Covode.recordClassIndex(18098);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.a.f
    public final void a() {
        String statusFontMode;
        b bVar = d.f31109a;
        a.EnumC0658a aVar = null;
        if (bVar != null) {
            aVar = bVar.c().f31128b;
        }
        com.bytedance.lynx.a.a.b.a aVar2 = this.f31165b;
        if (!(aVar2 == null || (statusFontMode = aVar2.getStatusFontMode()) == null)) {
            int hashCode = statusFontMode.hashCode();
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && statusFontMode.equals("light")) {
                    aVar = a.EnumC0658a.Light;
                }
            } else if (statusFontMode.equals("dark")) {
                aVar = a.EnumC0658a.DARK;
            }
        }
        this.f31166c.f31204e = aVar;
    }

    public o(com.bytedance.lynx.a.a.b.a aVar, SparkActivity sparkActivity) {
        l.c(sparkActivity, "");
        this.f31165b = aVar;
        this.f31166c = sparkActivity;
    }
}
