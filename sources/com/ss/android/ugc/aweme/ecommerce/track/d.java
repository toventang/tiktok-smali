package com.ss.android.ugc.aweme.ecommerce.track;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.a.i;
import h.f.b.m;
import h.m.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class d {

    /* renamed from: a */
    public static long f87534a = -1;

    /* renamed from: b */
    public static final l f87535b = new l("\"net_error\":-?\\d+");

    /* renamed from: c */
    public static final l f87536c = new l("\\|.*?,");

    /* renamed from: d */
    public static final d f87537d = new d();

    private d() {
    }

    public static final class c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ HashMap f87539a;

        /* renamed from: b */
        final /* synthetic */ String f87540b;

        static {
            Covode.recordClassIndex(55030);
        }

        c(HashMap hashMap, String str) {
            this.f87539a = hashMap;
            this.f87540b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : this.f87539a.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                r.a(this.f87540b, jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(55027);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.d$d */
    public static final class CallableC2115d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f87541a;

        static {
            Covode.recordClassIndex(55031);
        }

        CallableC2115d(IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f87541a = pdpEnterParam;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            String str;
            try {
                HashMap<String, Object> trackParams = this.f87541a.getTrackParams();
                String str2 = null;
                if (trackParams != null) {
                    obj = trackParams.get("author_id");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str3 = (String) obj;
                HashMap<String, Object> trackParams2 = this.f87541a.getTrackParams();
                if (trackParams2 != null) {
                    obj2 = trackParams2.get("source_page_type");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str4 = (String) obj2;
                HashMap<String, Object> trackParams3 = this.f87541a.getTrackParams();
                if (trackParams3 != null) {
                    obj3 = trackParams3.get("anchor_show_type");
                } else {
                    obj3 = null;
                }
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str5 = (String) obj3;
                HashMap<String, Object> trackParams4 = this.f87541a.getTrackParams();
                if (trackParams4 != null) {
                    obj4 = trackParams4.get("source_content_id");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str2 = obj4;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", this.f87541a.getProductId());
                jSONObject.put("author_id", str3);
                jSONObject.put("source_page_type", str4);
                jSONObject.put("anchor_show_type", str5);
                jSONObject.put("source_content_id", str2);
                HashMap<String, Object> trackParams5 = this.f87541a.getTrackParams();
                if (trackParams5 == null || (str = trackParams5.toString()) == null) {
                    str = "";
                }
                jSONObject.put("track_params", str);
                Activity[] activityStack = ActivityStack.getActivityStack();
                h.f.b.l.b(activityStack, "");
                jSONObject.put("page_stack", i.a(activityStack, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f87538a, 31));
                r.a("rd_tiktokec_report_param_null", jSONObject);
            } catch (Throwable unused) {
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<Activity, CharSequence> {

        /* renamed from: a */
        public static final a f87538a = new a();

        static {
            Covode.recordClassIndex(55028);
        }

        a() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Activity activity) {
            String simpleName = activity.getClass().getSimpleName();
            h.f.b.l.b(simpleName, "");
            return simpleName;
        }
    }

    public static void a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        h.f.b.l.d(pdpEnterParam, "");
        b.i.b(new CallableC2115d(pdpEnterParam), b.i.f4824a);
    }

    public static final class b extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $apiPath;
        final /* synthetic */ int $isCheckPassed;
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $pageName;
        final /* synthetic */ int $prefetchType;
        final /* synthetic */ HashMap $trackParams;

        static {
            Covode.recordClassIndex(55029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, HashMap hashMap, boolean z, int i2, String str2, int i3) {
            super(1);
            this.$pageName = str;
            this.$trackParams = hashMap;
            this.$isRetry = z;
            this.$isCheckPassed = i2;
            this.$apiPath = str2;
            this.$prefetchType = i3;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.b("page_name", this.$pageName);
            HashMap hashMap = this.$trackParams;
            if (hashMap != null) {
                aVar2.c("anchor_show_type", hashMap.get("product_id"));
                aVar2.c("author_id", this.$trackParams.get("author_id"));
                aVar2.c("enter_from_info", this.$trackParams.get("enter_from_info"));
                aVar2.c("entrance_form", this.$trackParams.get("entrance_form"));
                aVar2.c("entrance_info", this.$trackParams.get("entrance_info"));
                aVar2.c("follow_status", this.$trackParams.get("follow_status"));
                aVar2.c("product_id", this.$trackParams.get("product_id"));
                aVar2.c("product_source", this.$trackParams.get("product_source"));
                aVar2.c("source", this.$trackParams.get("source"));
                aVar2.c("source_from", this.$trackParams.get("source_from"));
                aVar2.c("source_page_type", this.$trackParams.get("source_page_type"));
            }
            if (this.$isRetry) {
                str = "yes";
            } else {
                str = "no";
            }
            aVar2.b("is_retry", str);
            aVar2.b("is_check_passed", Integer.valueOf(this.$isCheckPassed));
            aVar2.c("api_path", this.$apiPath);
            aVar2.b("preload_type", Integer.valueOf(this.$prefetchType));
            return z.f158842a;
        }
    }

    public static void a(String str, HashMap<String, Object> hashMap) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(hashMap, "");
        b.i.b(new c(hashMap, str), b.i.f4824a);
    }

    public final void a(IPdpStarter.PdpEnterParam pdpEnterParam, int i2) {
        h.f.b.l.d(pdpEnterParam, "");
        a(pdpEnterParam, (String) null, (String) null, i2, 14);
    }

    public static void a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i2) {
        Object obj;
        String str;
        h.f.b.l.d(pdpEnterParam, "");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams == null || (obj = trackParams.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        h.f.b.l.b(obj, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(pdpEnterParam.getRequestParams());
        HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((obj instanceof Long) && (!h.f.b.l.a(obj, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        hashMap.put("is_retry", str);
        hashMap.put("preload_type", Integer.valueOf(i2));
        hashMap.put("api_path", "/api/v1/shop/product_info/get");
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "product_detail");
        }
        a("rd_tiktokec_product_detail_request_send", hashMap);
    }

    private static void a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, String str, String str2, int i2) {
        Object obj;
        boolean z;
        h.f.b.l.d(semiPdpEnterParams, "");
        HashMap<String, Object> trackParams = semiPdpEnterParams.getTrackParams();
        if (trackParams == null || (obj = trackParams.get("click_product_start_time")) == null) {
            obj = -1L;
        }
        h.f.b.l.b(obj, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(semiPdpEnterParams.getRequestParams());
        HashMap<String, Object> trackParams2 = semiPdpEnterParams.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((obj instanceof Long) && (!h.f.b.l.a(obj, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (f87534a > 0) {
            hashMap.put("api_duration", Long.valueOf(System.currentTimeMillis() - f87534a));
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0) {
            hashMap.put("is_success", "yes");
        } else {
            hashMap.put("error_code", str2);
            hashMap.put("error_message", str);
            hashMap.put("is_success", "no");
        }
        hashMap.put("preload_type", Integer.valueOf(i2));
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "semi_product_detail");
        }
        a("rd_tiktokec_product_detail_request_result", hashMap);
    }

    public final void a(IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2, int i2) {
        h.f.b.l.d(pdpEnterParam, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        a(pdpEnterParam, str, str2, i2, 8);
    }

    public static /* synthetic */ void a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, String str, String str2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        a(semiPdpEnterParams, str, str2, i2);
    }

    private static /* synthetic */ void a(IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2, int i2, int i3) {
        long j2;
        boolean z;
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            str2 = null;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        h.f.b.l.d(pdpEnterParam, "");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams == null || (j2 = trackParams.get("click_product_start_time")) == null) {
            j2 = -1L;
        }
        h.f.b.l.b(j2, "");
        HashMap hashMap = new HashMap();
        hashMap.putAll(pdpEnterParam.getRequestParams());
        HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = new HashMap<>();
        }
        hashMap.putAll(trackParams2);
        if ((j2 instanceof Long) && (!h.f.b.l.a(j2, (Object) -1L))) {
            hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) j2).longValue()));
        }
        if (f87534a > 0) {
            hashMap.put("api_duration", Long.valueOf(System.currentTimeMillis() - f87534a));
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0) {
            hashMap.put("is_success", "yes");
        } else {
            hashMap.put("error_code", str2);
            hashMap.put("error_message", str);
            hashMap.put("is_success", "no");
        }
        hashMap.put("preload_type", Integer.valueOf(i2));
        if (!hashMap.containsKey("page_name")) {
            hashMap.put("page_name", "product_detail");
        }
        a("rd_tiktokec_product_detail_request_result", hashMap);
    }

    public static void a(HashMap<String, Object> hashMap, int i2, boolean z, String str, int i3, String str2) {
        h.f.b.l.d(str2, "");
        c.a("rd_page_params_check", new b(str2, hashMap, z, i2, str, i3));
    }
}
