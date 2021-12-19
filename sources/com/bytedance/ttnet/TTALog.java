package com.bytedance.ttnet;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.ss.android.agilelogger.ALog;

public class TTALog {
    private static volatile long sALogFuncAddr;

    static {
        Covode.recordClassIndex(27215);
    }

    public static int com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    public static void init() {
        ensureALogInitialized();
    }

    private static h getCronetHttpClient() {
        if (c.a()) {
            return h.a(TTNetInit.getTTNetDepend().a());
        }
        return null;
    }

    private static void ensureALogInitialized() {
        sALogFuncAddr = ALog.getALogWriteFuncAddr();
        com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_i("TTNET_ALog", "ALog function address is " + sALogFuncAddr);
        if (sALogFuncAddr == 0) {
            ALog.addNativeFuncAddrCallback(e.f44592a);
        }
    }

    static final /* synthetic */ void lambda$ensureALogInitialized$0$TTALog(long j2) {
        if (sALogFuncAddr != 0) {
            com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_i("TTNET_ALog", "ALog function address has initialized.");
        } else if (j2 == 0) {
            com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_w("TTNET_ALog", "Cannot get ALog function address in init callback.");
        } else {
            sALogFuncAddr = j2;
            com_bytedance_ttnet_TTALog_com_ss_android_ugc_aweme_lancet_LogLancet_i("TTNET_ALog", "ALog function address is " + sALogFuncAddr + " from callback.");
            try {
                if (getCronetHttpClient() != null) {
                    long j3 = sALogFuncAddr;
                    if (h.f29075c != null) {
                        Reflect.on(h.f29075c).call("setAlogFuncAddr", new Class[]{Long.TYPE}, Long.valueOf(j3));
                        return;
                    }
                    throw new UnsupportedOperationException("CronetEngine has not been initialized.");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
