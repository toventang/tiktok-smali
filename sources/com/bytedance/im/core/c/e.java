package com.bytedance.im.core.c;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static b f37627a;

    static {
        Covode.recordClassIndex(22635);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.c.e$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(82:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 486
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.c.e.AnonymousClass1.<clinit>():void");
        }
    }

    public static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        if (stackTrace != null) {
            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                if (i2 > 0) {
                    sb.append("\n");
                }
                sb.append(stackTrace[i2].getClassName()).append(":").append(stackTrace[i2].getMethodName()).append(":").append(stackTrace[i2].getLineNumber());
            }
        }
        if (sb.length() > 1000) {
            sb.substring(0, 999);
        }
        return sb.toString();
    }

    public static void a(Throwable th) {
        new i().a("imsdk_exception").a("error_stack", Log.getStackTraceString(th)).b();
        if (f37627a != null && d.a().b().af) {
            f37627a.a(th);
        }
    }

    public static boolean a(float f2) {
        if (d.a().b().aD) {
            if (f2 <= 0.0f || Math.random() >= ((double) f2)) {
                return false;
            }
            return true;
        } else if (f37627a != null) {
            return true;
        }
        return false;
    }

    public static void b(String str, JSONObject jSONObject) {
        b bVar = f37627a;
        if (bVar != null) {
            bVar.b(str, jSONObject);
        }
    }

    public static void c(String str, JSONObject jSONObject) {
        b bVar = f37627a;
        if (bVar != null) {
            bVar.c(str, jSONObject);
        }
    }

    public static void d(String str, JSONObject jSONObject) {
        b bVar = f37627a;
        if (bVar != null) {
            bVar.d(str, jSONObject);
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        b bVar = f37627a;
        if (bVar != null) {
            bVar.a(str, jSONObject);
        }
        f.b("imsdk", "IMMonitor serviceName=" + str + " duration=" + jSONObject + " logExtra=" + ((Object) null), (Throwable) null);
    }

    public static void a(String str, String str2) {
        if (f37627a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str2, 1.0d);
                jSONObject.put("service", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            f37627a.a(jSONObject);
        }
        f.b("imsdk", "IMMonitor serviceName=" + str + " key=" + str2 + " value=1.0", (Throwable) null);
    }

    public static d a(k kVar, boolean z) {
        d a2 = new d().a("duration", Long.valueOf(SystemClock.uptimeMillis() - kVar.f38729j));
        IMCMD fromValue = IMCMD.fromValue(kVar.k());
        if (fromValue == null) {
            fromValue = IMCMD.IMCMD_NOT_USED;
        }
        switch (AnonymousClass1.f37628a[fromValue.ordinal()]) {
            case 1:
                a2.f37623a = "conversation";
                a2.f37624b = "add_participants";
                break;
            case 2:
                a2.f37623a = "core";
                a2.f37624b = "create_conversation";
                break;
            case 3:
                a2.f37623a = "core";
                a2.f37624b = "get_conversation_info";
                break;
            case 4:
                a2.f37623a = "core";
                a2.f37624b = "get_conversation_info_list";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                a2.f37623a = "core";
                a2.f37624b = "get_favorite_conversation_list";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                a2.f37623a = "core";
                a2.f37624b = "get_top_conversation_list";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                a2.f37623a = "core";
                a2.f37624b = "get_msg_by_user";
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                a2.f37623a = "core";
                a2.f37624b = "get_stranger_conversation_list";
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                a2.f37623a = "core";
                a2.f37624b = "get_stranger_msg_list";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                a2.f37623a = "core";
                a2.f37624b = "install_init";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                a2.f37623a = "conversation";
                a2.f37624b = "leave";
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                a2.f37623a = "core";
                a2.f37624b = "load_history";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                a2.f37623a = "core";
                a2.f37624b = "load_member";
                break;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                a2.f37623a = "conversation";
                a2.f37624b = "remove_member";
                break;
            case 15:
                a2.f37623a = "core";
                a2.f37624b = "message_send";
                break;
            case 16:
                a2.f37623a = "conversation";
                a2.f37624b = "update_core";
                break;
            case 17:
                a2.f37623a = "conversation";
                a2.f37624b = "update_setting";
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                a2.f37623a = "conversation";
                a2.f37624b = "update_member";
                break;
            case 19:
                a2.f37623a = "conversation";
                a2.f37624b = "update_core_ext";
                break;
            case v.U /*{ENCODED_INT: 20}*/:
                a2.f37623a = "conversation";
                a2.f37624b = "update_setting_ext";
                break;
            case 21:
                a2.f37623a = "conversation";
                a2.f37624b = "dissolve";
                break;
            case 22:
                a2.f37623a = "core";
                a2.f37624b = "message_set_property_send";
                break;
            case 23:
                a2.f37623a = "conversation";
                a2.f37624b = "get_conversation_participants_read_index";
                break;
            case 24:
                a2.f37623a = "conversation";
                a2.f37624b = "get_conversation_participants_min_index";
                break;
            case 25:
                a2.f37623a = "upload";
                a2.f37624b = "get_upload_token";
                break;
            case 26:
                a2.f37623a = "upload";
                a2.f37624b = "get_media_urls";
                break;
            case 27:
                a2.f37623a = "conversation";
                a2.f37624b = "get_user_count";
                break;
            case 28:
                a2.f37623a = "core";
                a2.f37624b = "broadcast_send_msg";
                break;
            case 29:
                a2.f37623a = "core";
                a2.f37624b = "broadcast_recv_msg";
                break;
            case 30:
                a2.f37623a = "conversation";
                a2.f37624b = "get_user_conversation_list";
                break;
            case 31:
                a2.f37623a = "conversation";
                a2.f37624b = "batch_update_participant";
                break;
            case 32:
                a2.f37623a = "core";
                a2.f37624b = "rtc_call";
                break;
            case 33:
                a2.f37623a = "core";
                a2.f37624b = "rtc_create";
                break;
            case 34:
                a2.f37623a = "core";
                a2.f37624b = "rtc_update";
            case 35:
                a2.f37623a = "core";
                a2.f37624b = "stranger_mark_read";
                break;
            case 36:
                a2.f37623a = "core";
                a2.f37624b = "stranger_mark_all_read";
                break;
            case 37:
                a2.f37623a = "core";
                a2.f37624b = "stranger_delete_all_conversations";
                break;
            case 38:
                a2.f37623a = "core";
                a2.f37624b = "get_recent_msg";
                break;
            case 39:
                a2.f37623a = "core";
                a2.f37624b = "get_cmd_msg";
                break;
            case 40:
                a2.f37623a = "core";
                a2.f37624b = "get_msg_by_index_v2_range";
                break;
            default:
                a2.f37623a = "unknown";
                a2.f37624b = "not_use";
                break;
        }
        if (z) {
            a2.a("success", 1);
        } else {
            a2.a("error", Integer.valueOf(kVar.f38728i));
            a2.a("success", 0);
            try {
                if (kVar.f38724e != null) {
                    a2.b("origin_request", h.f38770a.b(kVar.f38724e));
                }
                if (kVar.f38725f != null) {
                    a2.b("origin_response", h.f38770a.b(kVar.f38725f));
                }
            } catch (Exception e2) {
                j.b("IMMonitor wrapMonitor ", e2);
            }
        }
        return a2;
    }

    public static void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        b bVar = f37627a;
        if (bVar != null) {
            bVar.a(str, str2, map);
        }
        f.b("imsdk", "IMMonitor monitorImEvent() called with: service = [" + str + "], name = [" + str2 + "], map = [" + map + "], originData = [" + map2 + "]", (Throwable) null);
    }
}
