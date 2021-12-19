package com.bytedance.android.live.wallet.g;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveCustomRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeContactUsUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveSubscribeFeedbackUrlSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13168a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(7308);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13174a = new b();

        static {
            Covode.recordClassIndex(7310);
        }

        b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.wallet.a.a f13180a;

        static {
            Covode.recordClassIndex(7312);
        }

        d(com.bytedance.android.livesdk.wallet.a.a aVar) {
            this.f13180a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            if (this.f13180a.f22401h) {
                b.a.a("livesdk_abnormal_subscribe_popup_click").a("failed_reason", this.f13180a.f22399f).a("click_type", "dismiss").a().b();
            }
            dialogInterface.dismiss();
        }
    }

    private static void a(Throwable th, int i2) {
        String a2;
        if (th != null) {
            if (!(th instanceof com.bytedance.android.live.a.a.b.a)) {
                th = null;
            }
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (aVar == null || (a2 = aVar.getPrompt()) == null || a2.length() <= 0) {
                a2 = y.a(i2);
            }
            ao.a(y.e(), a2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.g.a$a  reason: collision with other inner class name */
    public static final class DialogInterface$OnClickListenerC0279a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13169a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f13170b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.wallet.a.a f13171c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f13172d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13173e;

        static {
            Covode.recordClassIndex(7309);
        }

        DialogInterface$OnClickListenerC0279a(Context context, Uri uri, com.bytedance.android.livesdk.wallet.a.a aVar, String str, String str2) {
            this.f13169a = context;
            this.f13170b = uri;
            this.f13171c = aVar;
            this.f13172d = str;
            this.f13173e = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f13169a, this.f13170b);
            b.a.a("livesdk_recharge_fail_contact_us_click").a().a("package", this.f13171c.f22400g).a("fail_from", this.f13172d).a("fail_reason", this.f13173e).a("charge_reason", this.f13171c.f22399f).b();
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f13176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.wallet.a.a f13177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f13178d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13179e;

        static {
            Covode.recordClassIndex(7311);
        }

        c(Context context, Uri uri, com.bytedance.android.livesdk.wallet.a.a aVar, String str, String str2) {
            this.f13175a = context;
            this.f13176b = uri;
            this.f13177c = aVar;
            this.f13178d = str;
            this.f13179e = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f13175a, this.f13176b);
            if (this.f13177c.f22401h) {
                b.a.a("livesdk_abnormal_subscribe_popup_click").a("failed_reason", this.f13177c.f22399f).a("click_type", "contact_us").a().b();
            } else {
                b.a.a("livesdk_recharge_fail_contact_us_click").a("package", this.f13177c.f22400g).a("fail_from", this.f13178d).a("fail_reason", this.f13179e).a("charge_reason", this.f13177c.f22399f).a().b();
            }
            dialogInterface.dismiss();
        }
    }

    public static void a(com.bytedance.android.livesdk.wallet.a.a aVar, Context context) {
        String string;
        l.d(aVar, "");
        if (context != null) {
            if (aVar.f22394a == 3) {
                ao.a(y.e(), (int) R.string.ehe);
                return;
            }
            Exception exc = aVar.f22397d;
            if (exc instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.a.a.b.a aVar2 = (com.bytedance.android.live.a.a.b.a) exc;
                switch (aVar2.getErrorCode()) {
                    case 41155:
                        a(aVar.f22397d, (int) R.string.eoj);
                        return;
                    case 4005189:
                        a(context, exc, "other", "risk", aVar);
                        return;
                    case 4005208:
                        String string2 = context.getString(R.string.epk);
                        l.b(string2, "");
                        String prompt = aVar2.getPrompt();
                        l.b(prompt, "");
                        a(context, string2, prompt, "refund", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4005209:
                        String string3 = context.getString(R.string.epk);
                        l.b(string3, "");
                        String prompt2 = aVar2.getPrompt();
                        l.b(prompt2, "");
                        a(context, string3, prompt2, "underground", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4025001:
                        String string4 = context.getString(R.string.enz);
                        l.b(string4, "");
                        String prompt3 = aVar2.getPrompt();
                        l.b(prompt3, "");
                        a(context, string4, prompt3, "risk", "other", aVar2.getErrorCode(), aVar);
                        return;
                    case 4025002:
                        String string5 = context.getString(R.string.enw);
                        l.b(string5, "");
                        String prompt4 = aVar2.getPrompt();
                        l.b(prompt4, "");
                        a(context, string5, prompt4, "risk", "other", aVar2.getErrorCode(), aVar);
                        return;
                    default:
                        a(exc, (int) R.string.efp);
                        return;
                }
            } else if (aVar.f22395b == 206 && aVar.f22396c == 1) {
                ao.a(context, (int) R.string.ehd);
            } else if (aVar.f22395b == 203) {
                if (e.a.a()) {
                    string = context.getString(R.string.epk);
                } else {
                    string = context.getString(R.string.epn);
                }
                l.b(string, "");
                String string6 = context.getString(R.string.glj);
                l.b(string6, "");
                a(context, string6, string, "google-apple", "pay", 203, aVar);
            } else if (aVar.f22395b == 205) {
                if (aVar.f22401h) {
                    ao.a(context, (int) R.string.epq);
                } else {
                    ao.a(context, (int) R.string.epp);
                }
            } else if (aVar.f22395b == 204) {
                if (aVar.f22401h) {
                    ao.a(context, (int) R.string.epq);
                } else {
                    ao.a(context, (int) R.string.epp);
                }
            } else if (aVar.f22395b == 208) {
                ao.a(context, (int) R.string.epo);
            } else {
                ao.a(y.e(), (int) R.string.efp);
            }
        }
    }

    private static void a(Context context, Throwable th, String str, String str2, com.bytedance.android.livesdk.wallet.a.a aVar) {
        if (context != null) {
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a2, "");
                if (((IHostApp) a2).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            Uri parse = Uri.parse(value);
            String string = context.getString(R.string.dzh);
            l.b(string, "");
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                string = ((com.bytedance.android.live.a.a.b.a) th).getPrompt();
                l.b(string, "");
            }
            b.a aVar2 = new b.a(context);
            aVar2.f18285b = string;
            b.a b2 = aVar2.a(R.string.gn0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC0279a(context, parse, aVar, str, str2), false).b(R.string.gn1, (DialogInterface.OnClickListener) b.f13174a, false);
            b2.f18296m = false;
            b2.a().show();
            b.a.a("livesdk_recharge_fail_popup_show").a().a("package", aVar.f22400g).a("fail_from", str).a("fail_reason", str2).a("charge_reason", aVar.f22399f).b();
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, int i2, com.bytedance.android.livesdk.wallet.a.a aVar) {
        g gVar;
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(aVar, "");
        if (aVar.f22401h) {
            gVar = new g(LiveSubscribeFeedbackUrlSetting.INSTANCE.getValue());
        } else if (LiveWebRechargeAuditing.INSTANCE.getValue() || !aVar.f22398e) {
            gVar = new g(LiveRechargeContactUsUrlSetting.INSTANCE.getValue());
        } else {
            gVar = new g(LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue());
            gVar.a("error_code", i2);
            gVar.a("fail_from", str4);
            gVar.a("fail_reason", str3);
            gVar.a("charge_reason", aVar.f22399f);
            gVar.a("package", aVar.f22400g);
        }
        Uri parse = Uri.parse(gVar.a());
        l.b(parse, "");
        b.a aVar2 = new b.a(context);
        aVar2.f18284a = str;
        aVar2.f18285b = str2;
        b.a b2 = aVar2.a(R.string.gn0, (DialogInterface.OnClickListener) new c(context, parse, aVar, str4, str3), false).b(R.string.gn1, (DialogInterface.OnClickListener) new d(aVar), false);
        b2.f18296m = false;
        b2.a().show();
        if (aVar.f22401h) {
            b.a.a("livesdk_abnormal_subscribe_popup").a("failed_reason", aVar.f22399f).a().b();
        } else {
            b.a.a("livesdk_recharge_fail_popup_show").a().a("package", aVar.f22400g).a("fail_from", str4).a("fail_reason", str3).a("charge_reason", aVar.f22399f).b();
        }
    }
}
