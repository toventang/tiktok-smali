package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.common.utility.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.ecommerce.ab.k;
import com.ss.android.ugc.aweme.ecommerce.common.a.b;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.d;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.g;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public interface IPdpStarter {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86291a = a.f86292a;

    static {
        Covode.recordClassIndex(54001);
    }

    d a(PdpEnterParam pdpEnterParam, boolean z);

    void a(e eVar, PdpEnterParam pdpEnterParam);

    public static final class PdpEnterParam implements Serializable {
        private String chainKey;
        private final Float collapsedHeight;
        private final boolean collapsible;
        private final float expandHeight;
        private final boolean fullScreen;
        private final boolean isPromotionPage;
        private final HashMap<String, Object> orderRequestParams;
        private final boolean playerControl;
        private final HashMap<String, Object> productEnterContext;
        private final HashMap<String, Object> requestParams;
        private final HashMap<String, Object> trackParams;
        private final HashMap<String, Object> visitReportParams;

        static {
            Covode.recordClassIndex(54002);
        }

        public PdpEnterParam() {
            this(null, null, null, null, false, 0.0f, null, false, false, false, null, 2047, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PdpEnterParam copy$default(PdpEnterParam pdpEnterParam, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, float f2, Float f3, boolean z2, boolean z3, boolean z4, HashMap hashMap5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                hashMap = pdpEnterParam.requestParams;
            }
            if ((i2 & 2) != 0) {
                hashMap2 = pdpEnterParam.orderRequestParams;
            }
            if ((i2 & 4) != 0) {
                hashMap3 = pdpEnterParam.trackParams;
            }
            if ((i2 & 8) != 0) {
                hashMap4 = pdpEnterParam.visitReportParams;
            }
            if ((i2 & 16) != 0) {
                z = pdpEnterParam.fullScreen;
            }
            if ((i2 & 32) != 0) {
                f2 = pdpEnterParam.expandHeight;
            }
            if ((i2 & 64) != 0) {
                f3 = pdpEnterParam.collapsedHeight;
            }
            if ((i2 & 128) != 0) {
                z2 = pdpEnterParam.collapsible;
            }
            if ((i2 & 256) != 0) {
                z3 = pdpEnterParam.playerControl;
            }
            if ((i2 & 512) != 0) {
                z4 = pdpEnterParam.isPromotionPage;
            }
            if ((i2 & 1024) != 0) {
                hashMap5 = pdpEnterParam.productEnterContext;
            }
            return pdpEnterParam.copy(hashMap, hashMap2, hashMap3, hashMap4, z, f2, f3, z2, z3, z4, hashMap5);
        }

        public final HashMap<String, Object> component1() {
            return this.requestParams;
        }

        public final boolean component10() {
            return this.isPromotionPage;
        }

        public final HashMap<String, Object> component11() {
            return this.productEnterContext;
        }

        public final HashMap<String, Object> component2() {
            return this.orderRequestParams;
        }

        public final HashMap<String, Object> component3() {
            return this.trackParams;
        }

        public final HashMap<String, Object> component4() {
            return this.visitReportParams;
        }

        public final boolean component5() {
            return this.fullScreen;
        }

        public final float component6() {
            return this.expandHeight;
        }

        public final Float component7() {
            return this.collapsedHeight;
        }

        public final boolean component8() {
            return this.collapsible;
        }

        public final boolean component9() {
            return this.playerControl;
        }

        public final PdpEnterParam copy(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, boolean z, float f2, Float f3, boolean z2, boolean z3, boolean z4, HashMap<String, Object> hashMap5) {
            l.d(hashMap, "");
            return new PdpEnterParam(hashMap, hashMap2, hashMap3, hashMap4, z, f2, f3, z2, z3, z4, hashMap5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PdpEnterParam)) {
                return false;
            }
            PdpEnterParam pdpEnterParam = (PdpEnterParam) obj;
            return l.a(this.requestParams, pdpEnterParam.requestParams) && l.a(this.orderRequestParams, pdpEnterParam.orderRequestParams) && l.a(this.trackParams, pdpEnterParam.trackParams) && l.a(this.visitReportParams, pdpEnterParam.visitReportParams) && this.fullScreen == pdpEnterParam.fullScreen && Float.compare(this.expandHeight, pdpEnterParam.expandHeight) == 0 && l.a(this.collapsedHeight, pdpEnterParam.collapsedHeight) && this.collapsible == pdpEnterParam.collapsible && this.playerControl == pdpEnterParam.playerControl && this.isPromotionPage == pdpEnterParam.isPromotionPage && l.a(this.productEnterContext, pdpEnterParam.productEnterContext);
        }

        public final int hashCode() {
            HashMap<String, Object> hashMap = this.requestParams;
            int i2 = 0;
            int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
            HashMap<String, Object> hashMap2 = this.orderRequestParams;
            int hashCode2 = (hashCode + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap3 = this.trackParams;
            int hashCode3 = (hashCode2 + (hashMap3 != null ? hashMap3.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap4 = this.visitReportParams;
            int hashCode4 = (hashCode3 + (hashMap4 != null ? hashMap4.hashCode() : 0)) * 31;
            boolean z = this.fullScreen;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i4) * 31) + com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.expandHeight)) * 31;
            Float f2 = this.collapsedHeight;
            int hashCode5 = (com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
            boolean z2 = this.collapsible;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (hashCode5 + i7) * 31;
            boolean z3 = this.playerControl;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            if (!this.isPromotionPage) {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 31;
            HashMap<String, Object> hashMap5 = this.productEnterContext;
            if (hashMap5 != null) {
                i2 = hashMap5.hashCode();
            }
            return i15 + i2;
        }

        public final String toString() {
            return "PdpEnterParam(requestParams=" + this.requestParams + ", orderRequestParams=" + this.orderRequestParams + ", trackParams=" + this.trackParams + ", visitReportParams=" + this.visitReportParams + ", fullScreen=" + this.fullScreen + ", expandHeight=" + this.expandHeight + ", collapsedHeight=" + this.collapsedHeight + ", collapsible=" + this.collapsible + ", playerControl=" + this.playerControl + ", isPromotionPage=" + this.isPromotionPage + ", productEnterContext=" + this.productEnterContext + ")";
        }

        public final String getChainKey() {
            return this.chainKey;
        }

        public final Float getCollapsedHeight() {
            return this.collapsedHeight;
        }

        public final boolean getCollapsible() {
            return this.collapsible;
        }

        public final float getExpandHeight() {
            return this.expandHeight;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final boolean getPlayerControl() {
            return this.playerControl;
        }

        public final HashMap<String, Object> getProductEnterContext() {
            return this.productEnterContext;
        }

        public final HashMap<String, Object> getRequestParams() {
            return this.requestParams;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final boolean isPromotionPage() {
            return this.isPromotionPage;
        }

        public final String getProductId() {
            try {
                Object obj = this.requestParams.get("product_id");
                if (obj != null) {
                    return (String) ((List) obj).get(0);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            } catch (Exception unused) {
                return "";
            }
        }

        public final void setChainKey(String str) {
            this.chainKey = str;
        }

        public static int com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
            return Float.floatToIntBits(f2);
        }

        public PdpEnterParam(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, boolean z, float f2, Float f3, boolean z2, boolean z3, boolean z4, HashMap<String, Object> hashMap5) {
            Object obj;
            l.d(hashMap, "");
            this.requestParams = hashMap;
            this.orderRequestParams = hashMap2;
            this.trackParams = hashMap3;
            this.visitReportParams = hashMap4;
            this.fullScreen = z;
            this.expandHeight = f2;
            this.collapsedHeight = f3;
            this.collapsible = z2;
            this.playerControl = z3;
            this.isPromotionPage = z4;
            this.productEnterContext = hashMap5;
            String str = null;
            if (hashMap4 != null) {
                obj = hashMap4.get("chain_key");
            } else {
                obj = null;
            }
            this.chainKey = obj instanceof String ? obj : str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PdpEnterParam(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, float f2, Float f3, boolean z2, boolean z3, boolean z4, HashMap hashMap5, int i2, g gVar) {
            this((i2 & 1) != 0 ? new HashMap() : hashMap, (i2 & 2) != 0 ? null : hashMap2, (i2 & 4) != 0 ? null : hashMap3, (i2 & 8) != 0 ? null : hashMap4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? (float) h.f87568b : f2, (i2 & 64) != 0 ? null : f3, (i2 & 128) != 0 ? true : z2, (i2 & 256) == 0 ? z3 : true, (i2 & 512) == 0 ? z4 : false, (i2 & 1024) == 0 ? hashMap5 : null);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f86292a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final m f86293b = new m();

        /* renamed from: c  reason: collision with root package name */
        private static final n f86294c = new n();

        private a() {
        }

        public static IPdpStarter a() {
            if (k.a() == k.f84232b) {
                return f86294c;
            }
            return f86293b;
        }

        static {
            Covode.recordClassIndex(54003);
        }

        public static int a(HashMap<String, Object> hashMap) {
            Object obj;
            if (hashMap != null) {
                obj = hashMap.get("source_page_type");
            } else {
                obj = null;
            }
            if (l.a(obj, (Object) "live")) {
                return 1;
            }
            if (l.a(obj, (Object) "video")) {
                return 2;
            }
            if (l.a(obj, (Object) "show_window")) {
                return 3;
            }
            return 0;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$a$a  reason: collision with other inner class name */
        static final class C2079a extends m implements h.f.a.b<View, z> {
            final /* synthetic */ Context $context;
            final /* synthetic */ i $fm;
            final /* synthetic */ h.f.a.a $onReportClick;
            final /* synthetic */ Uri $uri;

            static {
                Covode.recordClassIndex(54004);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2079a(i iVar, Context context, Uri uri, h.f.a.a aVar) {
                super(1);
                this.$fm = iVar;
                this.$context = context;
                this.$uri = uri;
                this.$onReportClick = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                l.d(view, "");
                if (this.$fm != null) {
                    Uri build = j.a("bullet://bullet", ag.c(new p("url", this.$uri.toString()))).build();
                    l.b(build, "");
                    b.a.a(build, (int) (((float) (h.f87568b - (c.a(this.$context) + c.b(this.$context)))) * 0.95f), this.$fm, "report_page");
                    h.f.a.a aVar = this.$onReportClick;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(Context context, i iVar, HashMap<String, Object> hashMap, h.f.a.a<z> aVar) {
            com.ss.android.ugc.aweme.language.b a2;
            String a3;
            String str = "";
            l.d(context, str);
            l.d(hashMap, str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hide_nav_bar", 1);
            hashMap2.put("disableBounces", 1);
            hashMap2.put("soft_input_adjust", "pan");
            ISettingService v = SettingServiceImpl.v();
            if (!(v == null || (a2 = v.a(context)) == null || (a3 = a2.a()) == null)) {
                str = a3;
            }
            hashMap2.put("locale", str);
            hashMap2.putAll(hashMap);
            new a.b().a(((a.d) new a.d().a(R.string.bfx)).c(R.raw.icon_flag).a(new C2079a(iVar, context, j.a("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_report/index.html/reasons", hashMap2).build(), aVar))).b().show(iVar, "pdp_more");
        }
    }

    public static final class b extends RuntimeException {
        private final int code;
        private final com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b resp;

        static {
            Covode.recordClassIndex(54005);
        }

        public final int getCode() {
            return this.code;
        }

        public final com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b getResp() {
            return this.resp;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i2, String str, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar) {
            super(str);
            l.d(bVar, "");
            this.code = i2;
            this.resp = bVar;
        }
    }
}
