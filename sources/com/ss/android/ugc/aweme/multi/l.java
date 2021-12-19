package com.ss.android.ugc.aweme.multi;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.c.a.s;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.n.e;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.video.v;
import h.a.am;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f110921a = am.a((Object[]) new String[]{"enter_from", "enter_from_info", "source_page_type"});

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f110922a = new a();

        static {
            Covode.recordClassIndex(71161);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            v.O().y();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f110923a = new b();

        static {
            Covode.recordClassIndex(71162);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            v.O().B();
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(71160);
    }

    private static final boolean a(String str) {
        return f110921a.contains(str);
    }

    public static final String a(Aweme aweme, boolean z) {
        AnchorCustomData anchorCustomData;
        Map<String, String> trackingData;
        String str;
        h.f.b.l.d(aweme, "");
        if (z || (anchorCustomData = aweme.getAnchorCustomData()) == null || (trackingData = anchorCustomData.getTrackingData()) == null || (str = trackingData.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final Map<String, String> a(Aweme aweme, String str, String str2) {
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(str, "");
        AnchorCustomData anchorCustomData = aweme.getAnchorCustomData();
        LinkedHashMap linkedHashMap = null;
        Map<String, String> trackingData = anchorCustomData != null ? anchorCustomData.getTrackingData() : null;
        Map<String, String> a2 = w.a(aweme, str, str2);
        if (!(!a2.isEmpty())) {
            a2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Map<String, String> a3 = e.a.a(str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : a3.entrySet()) {
            String key = entry.getKey();
            if (h.f.b.l.a((Object) key, (Object) "search_id") || h.f.b.l.a((Object) key, (Object) "search_result_id")) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap = linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (trackingData != null) {
            linkedHashMap3.putAll(trackingData);
        }
        if (a2 != null) {
            linkedHashMap3.putAll(a2);
        }
        if (linkedHashMap != null) {
            linkedHashMap3.putAll(linkedHashMap);
        }
        linkedHashMap3.remove("enter_from_info");
        linkedHashMap3.remove("source_page_type");
        return linkedHashMap3;
    }

    private static String b(k kVar, Aweme aweme, String str, String str2, boolean z) {
        h.f.b.l.d(kVar, "");
        Integer num = kVar.f110914b.f110932i;
        if (num == null || num.intValue() != 100) {
            return kVar.f110914b.f110933j;
        }
        try {
            return Uri.parse(kVar.f110914b.f110933j).buildUpon().appendQueryParameter("trackParams", a(kVar, Uri.parse(kVar.f110914b.f110933j).getQueryParameter("trackParams"), aweme, str, str2, z)).build().toString();
        } catch (Exception unused) {
            return kVar.f110914b.f110933j;
        }
    }

    public static final String a(k kVar, Aweme aweme, String str, String str2, boolean z) {
        boolean z2;
        Integer num;
        h.f.b.l.d(kVar, "");
        Integer num2 = kVar.f110914b.f110932i;
        if ((num2 == null || num2.intValue() != 5) && ((num = kVar.f110914b.f110932i) == null || num.intValue() != 6)) {
            return kVar.f110914b.f110933j;
        }
        try {
            Uri parse = Uri.parse(kVar.f110914b.f110933j);
            Uri.Builder builder = new Uri.Builder();
            h.f.b.l.b(parse, "");
            builder.scheme(parse.getScheme());
            builder.authority(parse.getHost());
            builder.path(parse.getPath());
            for (String str3 : parse.getQueryParameterNames()) {
                if (h.f.b.l.a((Object) str3, (Object) "requestParams")) {
                    JSONObject jSONObject = new JSONObject(parse.getQueryParameter(str3));
                    if (aweme != null) {
                        z2 = aweme.isAd();
                    } else {
                        z2 = false;
                    }
                    jSONObject.put("is_ad", z2);
                    builder.appendQueryParameter(str3, jSONObject.toString());
                } else if (!h.f.b.l.a((Object) str3, (Object) "trackParams")) {
                    if (h.f.b.l.a((Object) str3, (Object) "fullScreen")) {
                        builder.appendQueryParameter(str3, "false");
                    } else {
                        builder.appendQueryParameter(str3, parse.getQueryParameter(str3));
                    }
                }
            }
            builder.appendQueryParameter("trackParams", a(kVar, parse.getQueryParameter("trackParams"), aweme, str, str2, z));
            if (!parse.getQueryParameterNames().contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", "false");
            }
            return builder.build().toString();
        } catch (Exception e2) {
            r.a("rd_tiktokec_shop_anchor_exception", new d().a("e_stack_trace", s.b(e2)).a("extra_data", "ShopWindowAnchorModel : ".concat(String.valueOf(kVar))).a("where", "ShopWindowAnchorModel").f66730a);
            return kVar.f110914b.f110933j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (r4 != null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String a(com.ss.android.ugc.aweme.multi.k r10, java.lang.String r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 753
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.l.a(com.ss.android.ugc.aweme.multi.k, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r9 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(android.app.Activity r7, com.ss.android.ugc.aweme.multi.k r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.l.a(android.app.Activity, com.ss.android.ugc.aweme.multi.k, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):void");
    }
}
