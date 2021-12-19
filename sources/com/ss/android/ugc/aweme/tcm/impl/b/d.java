package com.ss.android.ugc.aweme.tcm.impl.b;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.profile.model.BcUsageConfirmThreshold;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.tcm.impl.d.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f138583a = new d();

    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f138584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f138585b;

        /* renamed from: c  reason: collision with root package name */
        private final String f138586c = "notification";

        static {
            Covode.recordClassIndex(90669);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f138586c;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f138584a;
        }

        a(JSONObject jSONObject) {
            this.f138585b = jSONObject;
            this.f138584a = jSONObject;
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(90668);
    }

    public static boolean a() {
        TcmConfig a2;
        TcmConfig a3 = e.a();
        if (a3 == null || !a3.isTcmCreator() || (a2 = e.a()) == null || !a2.getUseNewTcmToggle()) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        BcUsageConfirmThreshold bcUsageConfirmThreshold;
        TcmConfig a2 = e.a();
        if (a2 == null || (bcUsageConfirmThreshold = a2.getBcUsageConfirmThreshold()) == null) {
            return false;
        }
        return bcUsageConfirmThreshold.getApp();
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.d$d  reason: collision with other inner class name */
    public static final class C3656d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f138591a;

        static {
            Covode.recordClassIndex(90672);
        }

        public C3656d(Context context) {
            this.f138591a = context;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(androidx.core.content.b.c(this.f138591a, R.color.a2));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String str;
            l.d(view, "");
            BrandedContentToolSchema a2 = com.ss.android.ugc.aweme.tcm.impl.d.b.a();
            if (a2 == null || (str = a2.brandedContentPolicy) == null) {
                str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
            }
            SmartRouter.buildRoute(this.f138591a, "aweme://webview/").withParam("url", Uri.parse(str).buildUpon().appendQueryParameter("page", "music").appendQueryParameter("music_type", "general").build().toString()).open();
        }
    }

    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.a.a f138587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f138588b;

        static {
            Covode.recordClassIndex(90670);
        }

        public b(com.bytedance.ies.web.a.a aVar, i iVar) {
            this.f138587a = aVar;
            this.f138588b = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            d.a(this.f138587a, this.f138588b, "1");
            r.a("tcm_bctoggle_msc_popup_click", new com.ss.android.ugc.aweme.app.f.d().a("click_button", "accept_confirmation").f66730a);
        }
    }

    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.a.a f138589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f138590b;

        static {
            Covode.recordClassIndex(90671);
        }

        public c(com.bytedance.ies.web.a.a aVar, i iVar) {
            this.f138589a = aVar;
            this.f138590b = iVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            d.a(this.f138589a, this.f138590b, "0");
            r.a("tcm_bctoggle_msc_popup_click", new com.ss.android.ugc.aweme.app.f.d().a("click_button", "cancel").f66730a);
        }
    }

    public static void a(com.bytedance.ies.web.a.a aVar, i iVar, String str) {
        JSONObject jSONObject = new JSONObject();
        new HashMap();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_agreed", str);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "bc_music_alert_confirm");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (aVar != null) {
            aVar.b("notification", jSONObject);
        }
        if (iVar != null) {
            iVar.onEvent(new a(jSONObject));
        }
    }
}
