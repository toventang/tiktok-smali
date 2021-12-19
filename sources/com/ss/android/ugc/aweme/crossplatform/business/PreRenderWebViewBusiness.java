package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.d.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.i;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.ss.android.ugc.aweme.fe.method.GetWebViewInfo;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;
import org.json.JSONObject;

public final class PreRenderWebViewBusiness extends BusinessService.Business {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, String> f78646b = ag.a(v.a(2, "video_bottom_button"), v.a(3, "video_mask_button"), v.a(6, "comment_end_button"), v.a(8, "profile_bottom_button"), v.a(33, "ad_card"), v.a(46, "ads_explain_clic"), v.a(47, "ad_desc_label"));

    /* renamed from: c  reason: collision with root package name */
    public static final a f78647c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.web.a.a f78648a;

    /* renamed from: d  reason: collision with root package name */
    private int f78649d;

    /* renamed from: e  reason: collision with root package name */
    private String f78650e;

    public static final class a {
        static {
            Covode.recordClassIndex(48833);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(int i2) {
            String str = PreRenderWebViewBusiness.f78646b.get(Integer.valueOf(i2));
            if (str == null) {
                return "others";
            }
            return str;
        }

        public static PreRenderWebViewBusiness a(c cVar) {
            Context context;
            com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
            b bVar;
            g crossPlatformBusiness;
            if (cVar != null) {
                context = cVar.getContext();
            } else {
                context = null;
            }
            if ((context instanceof CrossPlatformActivity) || cVar == null || (crossPlatformParams = cVar.getCrossPlatformParams()) == null || (bVar = crossPlatformParams.f78742b) == null || bVar.w != 7 || (crossPlatformBusiness = cVar.getCrossPlatformBusiness()) == null) {
                return null;
            }
            return (PreRenderWebViewBusiness) crossPlatformBusiness.a(PreRenderWebViewBusiness.class);
        }
    }

    public final void a() {
        this.f78649d = 0;
        com.bytedance.ies.web.a.a aVar = this.f78648a;
        if (aVar != null) {
            aVar.b("webViewDidHide", null);
        }
    }

    static {
        Covode.recordClassIndex(48832);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }

    public final void a(String str) {
        this.f78649d = 2;
        com.bytedance.ies.web.a.a aVar = this.f78648a;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            aVar.b("webViewDidShow", jSONObject);
        }
        this.f78650e = str;
    }

    public final void a(com.ss.android.ugc.aweme.crossplatform.view.a aVar, GetWebViewInfo.b bVar) {
        l.d(aVar, "");
        if (bVar != null && bVar.f91058b != null) {
            int i2 = bVar.f91057a;
            i a2 = aVar.a(j.class);
            l.b(a2, "");
            SingleWebView a3 = ((j) a2).a();
            if (a3 != null && i2 == a3.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f78649d);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f78650e);
                String str = this.f78617k.f78742b.H;
                if (l.a((Object) "splash", (Object) str)) {
                    jSONObject.put("scene", 2);
                } else if (l.a((Object) "feedad", (Object) str)) {
                    jSONObject.put("scene", 1);
                }
                bVar.f91058b.a(jSONObject);
            }
        }
    }
}
