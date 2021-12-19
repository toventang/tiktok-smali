package com.bytedance.android.monitorV2.l;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.h.a.d;
import com.bytedance.android.monitorV2.h.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import h.m.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(14157);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(String str, a.C0514a aVar) {
        boolean z;
        str.hashCode();
        switch (str.hashCode()) {
            case -1480388560:
                if (str.equals("performance")) {
                    z = aVar.A;
                    break;
                }
                z = false;
                break;
            case -1323516222:
                if (str.equals("jsbPerf")) {
                    z = aVar.E;
                    break;
                }
                z = false;
                break;
            case -892481938:
                if (str.equals("static")) {
                    z = aVar.O;
                    break;
                }
                z = false;
                break;
            case 93819220:
                if (str.equals("blank")) {
                    z = aVar.B;
                    break;
                }
                z = false;
                break;
            case 281935726:
                if (str.equals("fetchError")) {
                    z = aVar.C;
                    break;
                }
                z = false;
                break;
            case 299602137:
                if (str.equals("js_exception")) {
                    z = aVar.N;
                    break;
                }
                z = false;
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    z = aVar.M;
                    break;
                }
                z = false;
                break;
            case 1008268974:
                if (str.equals("navigationStart")) {
                    z = aVar.G;
                    break;
                }
                z = false;
                break;
            case 1727072305:
                if (str.equals("nativeError")) {
                    z = aVar.F;
                    break;
                }
                z = false;
                break;
            case 1910899023:
                if (str.equals("jsbError")) {
                    z = aVar.D;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        com.bytedance.android.monitorV2.i.b.c("HybridMonitor", com.a.a("sampling eventType: %s, sampleHit: %b， use: %s", new Object[]{str, Boolean.valueOf(z), aVar.f23925a}));
        return z;
    }

    public static int b(String str) {
        Map<String, Integer> e2 = HybridMultiMonitor.getInstance().getHybridSettingManager().e();
        if (!e2.containsKey(str)) {
            return -1;
        }
        return e2.get(str).intValue();
    }

    public static d a(String str) {
        com.bytedance.android.monitorV2.i.b.a("HybridMonitor", "resToSettingsResponse: ".concat(String.valueOf(str)));
        JSONObject optJSONObject = f.a(str).optJSONObject("data");
        d dVar = new d();
        dVar.f23962c = f.c(optJSONObject, "update_time");
        dVar.f23963d = f.a(optJSONObject, "duration");
        dVar.f23964e = f.b(optJSONObject, "setting_id");
        dVar.f23960a = a(f.d(optJSONObject, "bid_info"), dVar.f23964e);
        dVar.f23961b = a(f.b(optJSONObject, "enable_switch"));
        dVar.f23965f = a(f.d(optJSONObject, "all_event_sample"));
        return dVar;
    }

    private static e a(long j2) {
        e eVar = new e();
        int i2 = 0;
        while (true) {
            if (j2 % 2 == 0) {
                switch (i2) {
                    case 0:
                        eVar.f23966a = false;
                        break;
                    case 1:
                        eVar.f23967b = false;
                        break;
                    case 2:
                        eVar.f23968c = false;
                        break;
                    case 3:
                        eVar.f23969d = false;
                        break;
                    case 4:
                        eVar.f23970e = false;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        eVar.f23971f = false;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        eVar.f23972g = false;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        eVar.f23973h = false;
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        eVar.f23974i = false;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        eVar.f23975j = false;
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        eVar.f23976k = false;
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        eVar.f23977l = false;
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        eVar.f23978m = false;
                        break;
                }
            }
            i2++;
            if (i2 < 13) {
                if (i2 != 0) {
                    j2 >>= 1;
                }
            }
        }
        return eVar;
    }

    private static Map<String, Integer> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(f.a(jSONObject, next)));
        }
        return hashMap;
    }

    public static boolean c(String str, a.C0514a aVar) {
        str.hashCode();
        if (!str.equals("containerError")) {
            return false;
        }
        return aVar.M;
    }

    public static int a(String str, String str2) {
        Map<String, Integer> b2 = HybridMultiMonitor.getInstance().getHybridSettingManager().b().b(str);
        if (!b2.containsKey(str2)) {
            return -1;
        }
        return b2.get(str2).intValue();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static a a(JSONObject jSONObject, long j2) {
        a aVar = new a();
        if (jSONObject == null) {
            return aVar;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject d2 = f.d(jSONObject, next);
            long b2 = f.b(d2, "hit_sample");
            a.C0514a aVar2 = new a.C0514a(next);
            aVar2.f23926b = b2;
            aVar2.f23927c = j2;
            aVar2.f23928d = a(f.d(d2, "event_name_sample"));
            Map<String, a.C0514a> map = aVar.f23923b;
            int i2 = 0;
            while (true) {
                if (i2 != 0) {
                    b2 >>= 1;
                }
                if (b2 % 2 == 1) {
                    switch (i2) {
                        case 0:
                            aVar2.f23929e = true;
                            break;
                        case 1:
                            aVar2.f23930f = true;
                            break;
                        case 2:
                            aVar2.f23931g = true;
                            break;
                        case 3:
                            aVar2.f23932h = true;
                            break;
                        case 4:
                            aVar2.f23933i = true;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            aVar2.f23934j = true;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            aVar2.f23935k = true;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            aVar2.f23936l = true;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            aVar2.f23937m = true;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            aVar2.n = true;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            aVar2.o = true;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            aVar2.p = true;
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            aVar2.q = true;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            aVar2.r = true;
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            aVar2.s = true;
                            break;
                        case 15:
                            aVar2.t = true;
                            break;
                        case 16:
                            aVar2.u = true;
                            break;
                        case 17:
                            aVar2.v = true;
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            aVar2.w = true;
                            break;
                        case 19:
                            aVar2.x = true;
                            break;
                        case v.U /*{ENCODED_INT: 20}*/:
                            aVar2.y = true;
                            break;
                        case 21:
                            aVar2.z = true;
                            break;
                        case 22:
                            aVar2.A = true;
                            break;
                        case 23:
                            aVar2.B = true;
                            break;
                        case 24:
                            aVar2.C = true;
                            break;
                        case 25:
                            aVar2.D = true;
                            break;
                        case 26:
                            aVar2.E = true;
                            break;
                        case 27:
                            aVar2.F = true;
                            break;
                        case 28:
                            aVar2.G = true;
                            break;
                        case 29:
                            aVar2.H = true;
                            break;
                        case 30:
                            aVar2.I = true;
                            break;
                        case 31:
                            aVar2.J = true;
                            break;
                        case 32:
                            aVar2.K = true;
                            break;
                        case 33:
                            aVar2.L = true;
                            break;
                        case 34:
                            aVar2.M = true;
                            break;
                        case 35:
                            aVar2.N = true;
                            break;
                        case 36:
                            aVar2.O = true;
                            break;
                    }
                }
                i2++;
                if (i2 >= 37) {
                }
            }
            map.put(next, aVar2);
            JSONArray optJSONArray = d2.optJSONArray("regex_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    aVar.f23924c.add(new com.bytedance.android.monitorV2.h.a.b(next, new l(optJSONArray.optString(i3))));
                }
            }
        }
        Collections.sort(aVar.f23924c);
        return aVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean b(String str, a.C0514a aVar) {
        boolean z;
        str.hashCode();
        switch (str.hashCode()) {
            case -1898518694:
                if (str.equals("falconPerf")) {
                    z = aVar.w;
                    break;
                }
                z = false;
                break;
            case -1577087617:
                if (str.equals("resource_performance")) {
                    z = aVar.p;
                    break;
                }
                z = false;
                break;
            case -1323516222:
                if (str.equals("jsbPerf")) {
                    z = aVar.v;
                    break;
                }
                z = false;
                break;
            case -892481938:
                if (str.equals("static")) {
                    z = aVar.q;
                    break;
                }
                z = false;
                break;
            case -109980519:
                if (str.equals("static_sri")) {
                    z = aVar.z;
                    break;
                }
                z = false;
                break;
            case 2994720:
                if (str.equals("ajax")) {
                    z = aVar.o;
                    break;
                }
                z = false;
                break;
            case 3437289:
                if (str.equals("perf")) {
                    z = aVar.n;
                    break;
                }
                z = false;
                break;
            case 93819220:
                if (str.equals("blank")) {
                    z = aVar.s;
                    break;
                }
                z = false;
                break;
            case 281935726:
                if (str.equals("fetchError")) {
                    z = aVar.t;
                    break;
                }
                z = false;
                break;
            case 299602137:
                if (str.equals("js_exception")) {
                    z = aVar.r;
                    break;
                }
                z = false;
                break;
            case 831602183:
                if (str.equals("containerError")) {
                    z = aVar.M;
                    break;
                }
                z = false;
                break;
            case 1008268974:
                if (str.equals("navigationStart")) {
                    z = aVar.y;
                    break;
                }
                z = false;
                break;
            case 1727072305:
                if (str.equals("nativeError")) {
                    z = aVar.x;
                    break;
                }
                z = false;
                break;
            case 1910899023:
                if (str.equals("jsbError")) {
                    z = aVar.u;
                    break;
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        com.bytedance.android.monitorV2.i.b.c("HybridMonitor", com.a.a("sampling eventType: %s, sampleHit: %b, use: %s", new Object[]{str, Boolean.valueOf(z), aVar.f23925a}));
        return z;
    }

    public static boolean a(a.C0514a aVar, int i2) {
        boolean z;
        switch (i2) {
            case 0:
                z = aVar.f23929e;
                break;
            case 1:
                z = aVar.f23930f;
                break;
            case 2:
                z = aVar.f23931g;
                break;
            case 3:
                z = aVar.f23932h;
                break;
            case 4:
                z = aVar.f23933i;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                z = aVar.f23934j;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                z = aVar.f23935k;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                z = aVar.f23936l;
                break;
            default:
                z = aVar.f23937m;
                break;
        }
        com.bytedance.android.monitorV2.i.b.b("CustomMonitor", com.a.a("canSample level: %s, sampleHit: %b, use: %s", new Object[]{Integer.valueOf(i2), Boolean.valueOf(z), aVar.f23925a}));
        return z;
    }
}
