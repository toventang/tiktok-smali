package com.bytedance.ies.web.jsbridge2;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class TimeLineEvent implements Serializable {
    private final long elapsedTimestamp;
    private final HashMap<String, Object> extra;
    private final String label;
    private final String message;
    private final String time;
    private final long timeInMillis;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.TimeLineEvent$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(21252);
        }
    }

    static {
        Covode.recordClassIndex(21251);
    }

    public long getElapsedTimestamp() {
        return this.elapsedTimestamp;
    }

    public HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTime() {
        return this.time;
    }

    public long getTimeInMillis() {
        return this.timeInMillis;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f35540a;

        /* renamed from: b  reason: collision with root package name */
        public String f35541b;

        /* renamed from: c  reason: collision with root package name */
        public String f35542c;

        /* renamed from: d  reason: collision with root package name */
        public long f35543d;

        /* renamed from: e  reason: collision with root package name */
        public long f35544e;

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, Object> f35545f;

        /* renamed from: g  reason: collision with root package name */
        private SimpleDateFormat f35546g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

        static {
            Covode.recordClassIndex(21253);
        }

        public final TimeLineEvent b() {
            return new TimeLineEvent(this, null);
        }

        public final a a() {
            this.f35542c = this.f35546g.format(new Date());
            this.f35544e = SystemClock.elapsedRealtime();
            this.f35543d = System.currentTimeMillis();
            return this;
        }

        public final TimeLineEvent a(String str, List<TimeLineEvent> list) {
            a a2 = a();
            a2.f35540a = str;
            TimeLineEvent b2 = a2.b();
            if (list != null) {
                list.add(b2);
            }
            return b2;
        }

        public final a a(String str, Object obj) {
            if (this.f35545f == null) {
                this.f35545f = new HashMap<>();
            }
            this.f35545f.put(str, obj);
            return this;
        }
    }

    public static class b {
        public static String A = "rule_permission_group";
        public static String B = "rule_included_method";
        public static String C = "rule_excluded_method";
        public static String D = "validator_check";
        public static String E = "fetch_permission_config";
        public static String F = "permission_config_repository";
        public static String G = "exception_name";
        public static String H = "exception_message";
        public static String I = "from_injection";
        public static String J = "from_storage";
        public static String K = "from_cache";
        public static String L = "from_create";
        public static String M = "from_network";
        public static String N = "from_merge";
        public static String O = "unknown_namespace";
        public static String P = "not_registered_1";
        public static String Q = "not_registered_2";
        public static String R = "url_empty";
        public static String S = "params_invalid";
        public static String T = "call_invalid_1";
        public static String U = "call_invalid_2";
        public static String V = "permission_empty_1";
        public static String W = "permission_empty_2";
        public static String X = "about:blank";
        public static String Y = "about_blank_1";
        public static String Z = "about_blank_2";

        /* renamed from: a  reason: collision with root package name */
        public static String f35547a = "url";
        public static String aA = "label_permission_checker_safe_host";
        public static String aB = "label_permission_checker_validator";
        public static String aC = "label_permission_public_method";
        public static String aD = "label_permission_checker_null_config";
        public static String aE = "label_permission_checker_cache_rule";
        public static String aF = "label_permission_checker_remote_config";
        public static String aG = "label_permission_checker_merge_remote_config";
        public static String aH = "label_permission_checker_result";
        public static String aI = "label_permission_checker_fetch";
        public static String aJ = "label_call_origin_url";
        public static String aK = "label_call_new_url";
        public static String aL = "label_pre_call_origin_url";
        public static String aM = "label_pre_callback_origin_url";
        public static String aN = "label_post_callback_origin_url";
        public static String aO = "label_pre_handle_origin_url";
        public static String aa = "label_enable_permission_check";
        public static String ab = "label_create_fetch_param_exception";
        public static String ac = "label_parse_package_version";
        public static String ad = "label_fetch_on_failed";
        public static String ae = "label_repository_merge_config_exception";
        public static String af = "label_repository_parse_config";
        public static String ag = "label_repository_parse_config_exception";
        public static String ah = "label_repository_create_config";
        public static String ai = "label_repository_update_config";
        public static String aj = "label_create_jsb_environment";
        public static String ak = "label_create_jsb_instance";
        public static String al = "label_illegal_namespace";
        public static String am = "label_permission_storage";
        public static String an = "label_parse_config";
        public static String ao = "label_parse_config_exception";
        public static String ap = "label_create_call_handler";
        public static String aq = "label_pending_call_list";
        public static String ar = "label_create_java_call";
        public static String as = "label_abstract_bridge_reject";
        public static String at = "label_invalid_callback_id";
        public static String au = "label_callback_url_changed";
        public static String av = "label_call_handler_reject";
        public static String aw = "label_call_pending";
        public static String ax = "label_permission_checker";
        public static String ay = "label_permission_checker_filter_url";
        public static String az = "label_permission_checker_null_host";

        /* renamed from: b  reason: collision with root package name */
        public static String f35548b = "param";

        /* renamed from: c  reason: collision with root package name */
        public static String f35549c = "response";

        /* renamed from: d  reason: collision with root package name */
        public static String f35550d = "reason";

        /* renamed from: e  reason: collision with root package name */
        public static String f35551e = "value";

        /* renamed from: f  reason: collision with root package name */
        public static String f35552f = "key";

        /* renamed from: g  reason: collision with root package name */
        public static String f35553g = "from";

        /* renamed from: h  reason: collision with root package name */
        public static String f35554h = "null";

        /* renamed from: i  reason: collision with root package name */
        public static String f35555i = "false";

        /* renamed from: j  reason: collision with root package name */
        public static String f35556j = "true";

        /* renamed from: k  reason: collision with root package name */
        public static String f35557k = "config";

        /* renamed from: l  reason: collision with root package name */
        public static String f35558l = "config_repository_fetched";

        /* renamed from: m  reason: collision with root package name */
        public static String f35559m = "config_size";
        public static String n = "namespace";
        public static String o = "list";
        public static String p = "host";
        public static String q = "shortened_host";
        public static String r = "filter_url";
        public static String s = "safe_host_set";
        public static String t = "public_method_set";
        public static String u = "enable_permission_check";
        public static String v = "disable_all_permission_check";
        public static String w = "method_name";
        public static String x = "method_class";
        public static String y = "method_permission_group";
        public static String z = "call_permission_group";

        static {
            Covode.recordClassIndex(21254);
        }
    }

    private TimeLineEvent(a aVar) {
        this.label = aVar.f35540a;
        this.message = aVar.f35541b;
        this.time = aVar.f35542c;
        this.extra = aVar.f35545f;
        this.elapsedTimestamp = aVar.f35544e;
        this.timeInMillis = aVar.f35543d;
    }

    /* synthetic */ TimeLineEvent(a aVar, AnonymousClass1 r2) {
        this(aVar);
    }
}
