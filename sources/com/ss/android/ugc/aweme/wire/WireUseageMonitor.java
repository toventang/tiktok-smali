package com.ss.android.ugc.aweme.wire;

import android.util.Log;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class WireUseageMonitor {
    private static final Set<a> DEDUPLICATE_SET = new HashSet();

    public static int com_ss_android_ugc_aweme_wire_WireUseageMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_v(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(94886);
    }

    private static String getStackTrace() {
        return Log.getStackTraceString(new Throwable());
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f145096a;

        /* renamed from: b  reason: collision with root package name */
        private String f145097b;

        static {
            Covode.recordClassIndex(94887);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.f145096a;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.f145097b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f145096a;
            if (str != null ? str.equals(aVar.f145096a) : aVar.f145096a == null) {
                String str2 = this.f145097b;
                String str3 = aVar.f145097b;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        private a(String str, String str2) {
            this.f145096a = str;
            this.f145097b = str2;
        }

        /* synthetic */ a(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    public static void upload(String str, String str2) {
        a aVar = new a(str, str2, (byte) 0);
        Set<a> set = DEDUPLICATE_SET;
        if (!set.contains(aVar)) {
            set.add(aVar);
            com_ss_android_ugc_aweme_wire_WireUseageMonitor_com_ss_android_ugc_aweme_lancet_LogLancet_v("wire_usage_monitor", com.a.a("find useage of %s.%s\n stacktarce: %s", new Object[]{str, str2, getStackTrace()}));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("class_name", str);
                jSONObject.put("method_name", str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            b.a("wire_usage_monitor", 1, jSONObject);
        }
    }
}
