package com.bytedance.netecho;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import h.k.d;
import h.z;

final /* synthetic */ class NetechoConfig$loadLibrary$1 extends i implements b<String, z> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    static {
        Covode.recordClassIndex(25442);
    }

    NetechoConfig$loadLibrary$1() {
        super(1);
    }

    @Override // h.f.b.c, h.k.b
    public final String getName() {
        return "loadLibrary";
    }

    @Override // h.f.b.c
    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    @Override // h.f.b.c
    public final d getOwner() {
        return ab.a(System.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(String str) {
        invoke(str);
        return z.f158842a;
    }

    public static void com_bytedance_netecho_NetechoConfig$loadLibrary$1_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str);
        m.a(uptimeMillis, str);
    }

    public final void invoke(String str) {
        l.c(str, "");
        com_bytedance_netecho_NetechoConfig$loadLibrary$1_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
    }
}
