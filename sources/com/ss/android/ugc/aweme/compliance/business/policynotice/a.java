package com.ss.android.ugc.aweme.compliance.business.policynotice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.i;
import com.ss.android.ugc.aweme.compliance.api.model.j;
import com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static i f77067a;

    /* renamed from: b  reason: collision with root package name */
    public static i f77068b;

    /* renamed from: c  reason: collision with root package name */
    public static i f77069c;

    /* renamed from: d  reason: collision with root package name */
    public static i f77070d;

    /* renamed from: e  reason: collision with root package name */
    public static List<i> f77071e = z.INSTANCE;

    /* renamed from: f  reason: collision with root package name */
    public static int f77072f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f77073g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final h f77074h = h.i.a((h.f.a.a) g.f77095a);

    public static com.ss.android.ugc.aweme.compliance.business.policynotice.a.a a() {
        return (com.ss.android.ugc.aweme.compliance.business.policynotice.a.a) f77074h.getValue();
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final e f77087a = new e();

        static {
            Covode.recordClassIndex(47631);
        }

        e() {
        }

        public final void run() {
            a.C0732a.f33434a.a(b.a.POLICY_NOTICE);
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.compliance.business.policynotice.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f77095a = new g();

        static {
            Covode.recordClassIndex(47633);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.compliance.business.policynotice.a.a invoke() {
            return new com.ss.android.ugc.aweme.compliance.business.policynotice.a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f77082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f77083b;

        static {
            Covode.recordClassIndex(47628);
        }

        b(i iVar, Activity activity) {
            this.f77082a = iVar;
            this.f77083b = activity;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a(this.f77083b, this.f77082a).show();
            a.f77068b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f77084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f77085b;

        static {
            Covode.recordClassIndex(47629);
        }

        c(i iVar, Activity activity) {
            this.f77084a = iVar;
            this.f77085b = activity;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b(this.f77085b, this.f77084a).a();
            a.f77069c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f77086a;

        static {
            Covode.recordClassIndex(47630);
        }

        d(Activity activity) {
            this.f77086a = activity;
        }

        public final void run() {
            SmartRouter.buildRoute(this.f77086a, "//policynotice/fullscreen").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.a$a  reason: collision with other inner class name */
    public static final class C1768a extends m implements h.f.a.a<h.z> {
        final /* synthetic */ j $policyNoticeAction;

        static {
            Covode.recordClassIndex(47626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1768a(j jVar) {
            super(0);
            this.$policyNoticeAction = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (l.a((Object) this.$policyNoticeAction.f76678k, (Object) true)) {
                new Handler().postDelayed(AnonymousClass1.f77076a, 500);
            }
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(47625);
    }

    public static void c() {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.fe.method.j("notification", new JSONObject().put("eventName", "cancel_post_success")));
    }

    public static void b() {
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (f77070d == null) {
            i iVar = f77067a;
            if (iVar != null) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.compliance.api.b.c(iVar));
                f77067a = null;
                return;
            }
            i iVar2 = f77068b;
            if (iVar2 == null) {
                i iVar3 = f77069c;
                if (iVar3 == null) {
                    if (j2 != null) {
                        j2.runOnUiThread(e.f77087a);
                    }
                    com.ss.android.ugc.aweme.compliance.common.a.a(null);
                } else if (j2 != null) {
                    j2.runOnUiThread(new c(iVar3, j2));
                }
            } else if (j2 != null) {
                j2.runOnUiThread(new b(iVar2, j2));
            }
        } else if (j2 != null) {
            j2.runOnUiThread(new d(j2));
        }
    }

    public static final class f extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f77088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f77089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PolicyBodyLinkList f77090c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f77091d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f77092e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f77093f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f77094g;

        static {
            Covode.recordClassIndex(47632);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            Boolean bool;
            l.d(view, "");
            SmartRouter.buildRoute(this.f77088a, this.f77089b).withParam("use_webview_title", true).open();
            PolicyBodyLinkList policyBodyLinkList = this.f77090c;
            Boolean bool2 = null;
            if (policyBodyLinkList != null) {
                bool = policyBodyLinkList.getApprove();
            } else {
                bool = null;
            }
            if (l.a((Object) bool, (Object) true)) {
                this.f77091d.invoke(new j(null, null, null, this.f77090c.getExtra(), this.f77090c.getOperation(), null, null, null, null, 1967));
            }
            PolicyBodyLinkList policyBodyLinkList2 = this.f77090c;
            if (policyBodyLinkList2 != null) {
                bool2 = policyBodyLinkList2.getDismiss();
            }
            if (l.a((Object) bool2, (Object) true)) {
                this.f77092e.invoke();
            }
        }

        f(Context context, String str, PolicyBodyLinkList policyBodyLinkList, h.f.a.b bVar, h.f.a.a aVar, int i2, int i3) {
            this.f77088a = context;
            this.f77089b = str;
            this.f77090c = policyBodyLinkList;
            this.f77091d = bVar;
            this.f77092e = aVar;
            this.f77093f = i2;
            this.f77094g = i3;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("tns_general_dialog_show", new com.ss.android.ugc.aweme.app.f.d().a("business", str).a("style", str2).f66730a);
    }

    private static void a(String str, Context context) {
        T t;
        String style;
        Iterator<T> it = f77071e.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!l.a((Object) t.getBusiness(), (Object) str));
        T t2 = t;
        if (t2 != null && (style = t2.getStyle()) != null) {
            switch (style.hashCode()) {
                case -1383228885:
                    if (style.equals("bottom")) {
                        new com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a(context, t2).show();
                        return;
                    }
                    return;
                case 111185:
                    if (style.equals("pop")) {
                        new com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b(context, t2).a();
                        return;
                    }
                    return;
                case 97526364:
                    if (style.equals("float")) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.compliance.api.b.c(t2));
                        return;
                    }
                    return;
                case 110066619:
                    if (style.equals("fullscreen")) {
                        f77070d = t2;
                        a(context, new Intent(context, PolicyNoticeFullscreenActivity.class));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static void a(i iVar, j jVar, int i2) {
        String str;
        String str2;
        l.d(jVar, "");
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a aVar = new com.ss.android.ugc.aweme.compliance.business.policynotice.a.a();
        String str3 = null;
        if (iVar != null) {
            str3 = iVar.getBusiness();
            str = iVar.getPolicyVersion();
            str2 = iVar.getStyle();
        } else {
            str = null;
            str2 = null;
        }
        aVar.a(str3, str, str2, jVar.f76672e, jVar.f76674g, Integer.valueOf(i2), new C1768a(jVar));
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("qa_tns_general_dialog_click", new com.ss.android.ugc.aweme.app.f.d().a("business", str2).a("style", str3).a("button_info", str).f66730a);
    }

    public static void a(j jVar, Context context, h.f.a.b<? super j, h.z> bVar, h.f.a.a<h.z> aVar) {
        l.d(jVar, "");
        l.d(context, "");
        l.d(bVar, "");
        l.d(aVar, "");
        String str = jVar.f76670c;
        int hashCode = str.hashCode();
        if (hashCode != -1052618729) {
            if (hashCode != -172220347) {
                if (hashCode != 3277) {
                    if (hashCode == 111185 && str.equals("pop")) {
                        a(jVar.f76675h, context);
                    }
                } else if (str.equals("h5")) {
                    Intent intent = new Intent(context, CrossPlatformActivity.class);
                    intent.setData(Uri.parse(jVar.f76671d));
                    intent.putExtra("use_webview_title", true);
                    a(context, intent);
                }
            } else if (str.equals("callback")) {
                bVar.invoke(jVar);
            }
        } else if (str.equals("native")) {
            SmartRouter.buildRoute(context, jVar.f76671d).open();
        }
        if (jVar.f76673f) {
            bVar.invoke(jVar);
        }
        if (l.a((Object) jVar.f76676i, (Object) true)) {
            aVar.invoke();
        }
        if (l.a((Object) jVar.f76677j, (Object) true)) {
            c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder a(android.content.Context r17, java.lang.String r18, java.util.List<com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList> r19, h.f.a.b<? super com.ss.android.ugc.aweme.compliance.api.model.j, h.z> r20, h.f.a.a<h.z> r21) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(android.content.Context, java.lang.String, java.util.List, h.f.a.b, h.f.a.a):android.text.SpannableStringBuilder");
    }
}
