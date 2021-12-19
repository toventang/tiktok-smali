package com.ss.android.ugc.aweme.compliance.business.personalization.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity;
import com.ss.android.ugc.aweme.compliance.common.b;
import h.f.b.l;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77025a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47606);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.a.a$a  reason: collision with other inner class name */
    public static final class CallableC1767a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f77026a;

        static {
            Covode.recordClassIndex(47607);
        }

        CallableC1767a(Context context) {
            this.f77026a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            boolean z = false;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f77026a);
                if (advertisingIdInfo != null) {
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                }
            } catch (Exception unused) {
            }
            return Boolean.valueOf(z);
        }
    }

    public static void a() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
        if (i2 != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(i2, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048571, null);
        } else {
            adPersonalitySettings = null;
        }
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (complianceSetting = ComplianceSetting.copy$default(c2, null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553919, null);
        }
        com.ss.android.ugc.aweme.compliance.common.b.b(complianceSetting);
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f77028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f77029b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f77030c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f77031d;

        static {
            Covode.recordClassIndex(47609);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f77028a, "//webview").withParam("url", this.f77029b).withParam("use_webview_title", true).open();
        }

        c(Activity activity, String str, int i2, int i3) {
            this.f77028a = activity;
            this.f77029b = str;
            this.f77030c = i2;
            this.f77031d = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.c.b f77027a;

        static {
            Covode.recordClassIndex(47608);
        }

        b(com.ss.android.ugc.aweme.compliance.api.c.b bVar) {
            this.f77027a = bVar;
        }

        @Override // b.g
        public final Object then(i<Boolean> iVar) {
            boolean z;
            Boolean lat;
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            aj<Boolean> n = sVar.n();
            l.b(n, "");
            l.b(iVar, "");
            n.b(iVar.d());
            Boolean d2 = iVar.d();
            l.b(d2, "");
            boolean booleanValue = d2.booleanValue();
            AdPersonalitySettings i2 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i2 == null || (lat = i2.getLat()) == null) {
                z = false;
            } else {
                z = lat.booleanValue();
            }
            if (booleanValue != z) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(new JSONObject().put("field", "limit_ad_tracking").put("value", String.valueOf(booleanValue)));
                String jSONArray2 = jSONArray.toString();
                l.b(jSONArray2, "");
                com.ss.android.ugc.aweme.compliance.common.b.a(jSONArray2, new b.e(booleanValue));
            }
            com.ss.android.ugc.aweme.compliance.api.c.b bVar = this.f77027a;
            if (bVar == null) {
                return null;
            }
            Boolean d3 = iVar.d();
            l.b(d3, "");
            bVar.a(d3.booleanValue());
            return null;
        }
    }

    public static void a(Context context, com.ss.android.ugc.aweme.compliance.api.c.b bVar) {
        l.d(context, "");
        i.b(new CallableC1767a(context), i.f4824a).a(new b(bVar), i.f4826c, null);
    }

    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f77032a = new d();

        static {
            Covode.recordClassIndex(47610);
        }

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            Integer promptStyle;
            AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
            String str2 = null;
            if (i3 != null) {
                str = i3.getBusiness();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.compliance.common.b.a(true, str, "1");
            AdPersonalitySettings i4 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (!(i4 == null || (promptStyle = i4.getPromptStyle()) == null || promptStyle.intValue() != 1)) {
                r.a("revised_PA_old_prompt_EU_click", new com.ss.android.ugc.aweme.app.f.d().a("click_button", 1).f66730a);
            }
            AdPersonalitySettings i5 = com.ss.android.ugc.aweme.compliance.common.b.i();
            if (i5 != null) {
                str2 = i5.getBusiness();
            }
            if (l.a((Object) str2, (Object) "lat_strategy_update")) {
                a.a();
            }
            a.C0732a.f33434a.a(b.a.PERSONALIZED_AD);
        }
    }

    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f77033a;

        static {
            Covode.recordClassIndex(47611);
        }

        public e(Activity activity) {
            this.f77033a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Integer num;
            String str;
            AdPersonalitySettings i3 = com.ss.android.ugc.aweme.compliance.common.b.i();
            String str2 = null;
            if (i3 != null) {
                num = i3.getPromptStyle();
            } else {
                num = null;
            }
            boolean z = false;
            if (num != null && num.intValue() == 1) {
                AdPersonalitySettings i4 = com.ss.android.ugc.aweme.compliance.common.b.i();
                if (i4 != null) {
                    str2 = i4.getBusiness();
                }
                com.ss.android.ugc.aweme.compliance.common.b.a(false, str2, "2");
                r.a("revised_PA_old_prompt_EU_click", new com.ss.android.ugc.aweme.app.f.d().a("click_button", 0).f66730a);
            } else {
                r.a("enter_personalize_data", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").f66730a);
                AdPersonalitySettings i5 = com.ss.android.ugc.aweme.compliance.common.b.i();
                if (i5 != null) {
                    str = i5.getBusiness();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) "lat_strategy_update")) {
                    if (com.ss.android.ugc.aweme.compliance.common.b.f() == 1) {
                        z = true;
                    }
                    AdPersonalitySettings i6 = com.ss.android.ugc.aweme.compliance.common.b.i();
                    if (i6 != null) {
                        str2 = i6.getBusiness();
                    }
                    com.ss.android.ugc.aweme.compliance.common.b.a(z, str2, "2");
                    a.a();
                }
                Intent intent = new Intent(this.f77033a, PersonalizationActivity.class);
                intent.putExtra("enterfrom", "feed");
                this.f77033a.startActivityForResult(intent, 1);
            }
            a.C0732a.f33434a.a(b.a.PERSONALIZED_AD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r8 == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder a(android.app.Activity r12, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo r13) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.personalization.a.a.a(android.app.Activity, com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo):android.text.SpannableStringBuilder");
    }
}
