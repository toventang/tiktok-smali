package com.ss.android.ugc.aweme.lancet.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public class ReceiverRegisterLancetHelper {
    static {
        Covode.recordClassIndex(68594);
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(g.a().getBaseContext(), broadcastReceiver, intentFilter);
    }

    public static Intent com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(g.a().getBaseContext(), broadcastReceiver, intentFilter, i2);
    }

    public static Intent com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, i2);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, i2);
            }
            throw e2;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(g.a().getBaseContext(), broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            }
            throw e2;
        }
    }

    public static Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        return com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(g.a().getBaseContext(), broadcastReceiver, intentFilter, str, handler, i2);
    }

    public static Intent com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancetHelper_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2);
            }
            throw e2;
        }
    }
}
