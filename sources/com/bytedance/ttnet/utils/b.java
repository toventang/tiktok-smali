package com.bytedance.ttnet.utils;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.LinkedHashMap;

public final class b {
    static {
        Covode.recordClassIndex(27303);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Context context, int i2) {
        String a2;
        switch (i2) {
            case 1:
                a2 = TTNetInit.getTTNetDepend().a(context, "ssids", "");
                break;
            case 2:
                a2 = TTNetInit.getTTNetDepend().a(context, "dns", "");
                break;
            case 3:
                a2 = TTNetInit.getTTNetDepend().a(context, "https_dns", "");
                break;
            case 4:
                a2 = TTNetInit.getTTNetDepend().a(context, "tnc_config", "");
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                try {
                    a2 = TTNetInit.getTTNetDepend().a(context, "tnc_etag", "");
                    break;
                } catch (Exception unused) {
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                a2 = TTNetInit.getTTNetDepend().a(context, "tnc_abtest", "");
                break;
            default:
                a2 = "";
                break;
        }
        if (a2 instanceof String) {
            return String.valueOf(a2);
        }
        return "";
    }

    public static void a(Context context, int i2, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i2) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
            }
            Logger.debug();
            TTNetInit.getTTNetDepend().a(context, linkedHashMap);
        } catch (Exception unused) {
        }
    }
}
