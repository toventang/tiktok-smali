package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.z;
import java.net.InetAddress;

final class Netecho$resolveDns$1 implements Runnable {
    final /* synthetic */ String $hostName;
    final /* synthetic */ z.e $ip;
    final /* synthetic */ z.e $latch;
    final /* synthetic */ z.e $throwableMsg;

    static {
        Covode.recordClassIndex(25440);
    }

    Netecho$resolveDns$1(z.e eVar, String str, z.e eVar2, z.e eVar3) {
        this.$ip = eVar;
        this.$hostName = str;
        this.$throwableMsg = eVar2;
        this.$latch = eVar3;
    }

    public static int com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public final void run() {
        try {
            z.e eVar = this.$ip;
            InetAddress byName = InetAddress.getByName(this.$hostName);
            l.a((Object) byName, "");
            eVar.element = (T) byName.getHostAddress();
            com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_LogLancet_w(Netecho.access$getTAG$p(Netecho.INSTANCE), "resolve dns " + this.$hostName + " to " + ((String) this.$ip.element));
        } catch (Throwable th) {
            th = th;
            do {
                this.$throwableMsg.element = (T) (th.getClass().getSimpleName() + ":" + th.getMessage());
                th = th.getCause();
            } while (th != null);
        }
        this.$latch.element.countDown();
    }
}
