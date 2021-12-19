package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.r;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.sertting.PersonalizationModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79503a = new a((byte) 0);

    static {
        Covode.recordClassIndex(49387);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49388);
        }

        private a() {
        }

        public static boolean a() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            l.b(createIMainServicebyMonsterPlugin, "");
            return createIMainServicebyMonsterPlugin.isAppHot();
        }

        public static List<aw> b() {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            l.b(createIMainServicebyMonsterPlugin, "");
            List<aw> deeplinkCommands = createIMainServicebyMonsterPlugin.getDeeplinkCommands();
            l.b(deeplinkCommands, "");
            return deeplinkCommands;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(Activity activity) {
            String[] strArr;
            l.d(activity, "");
            String a2 = d.a();
            try {
                strArr = (String[]) SettingsManager.a().a("app_action_allowlist", String[].class);
                if (strArr == null) {
                    strArr = new String[]{"US"};
                }
            } catch (Throwable unused) {
                strArr = new String[]{"US"};
            }
            for (String str : strArr) {
                if (TextUtils.equals(a2, str)) {
                    return false;
                }
            }
            if (!a()) {
                Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity);
                mainActivityIntent.putExtra("app_action_restricted", true);
                a(activity, mainActivityIntent);
            } else {
                Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
                new com.bytedance.ies.dmt.ui.e.a(a3, a3.getString(R.string.buo), 3, com.bytedance.ies.dmt.ui.e.a.b()).a();
            }
            return true;
        }

        public static boolean a(Uri uri) {
            if (uri == null) {
                return false;
            }
            String a2 = l.a(uri.getHost(), (Object) uri.getPath());
            if (!TextUtils.isEmpty(a2) && com.ss.android.ugc.aweme.sertting.b.a() != null) {
                String str = null;
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.contains("sharer_biz")) {
                    str = uri.getQueryParameter("sharer_biz");
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                com.ss.android.ugc.aweme.sertting.a[] a3 = com.ss.android.ugc.aweme.sertting.b.a();
                if (a3 == null) {
                    l.b();
                }
                for (com.ss.android.ugc.aweme.sertting.a aVar : a3) {
                    if (Pattern.compile(aVar.f121824a).matcher(a2).matches()) {
                        for (PersonalizationModel personalizationModel : aVar.f121825b) {
                            if (TextUtils.equals(str, personalizationModel.getBizName())) {
                                personalizationModel.getNeedPersonalization();
                                if (personalizationModel.getNeedPersonalization()) {
                                    c.f79479i = true;
                                }
                                return personalizationModel.getNeedPersonalization();
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }

        public static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        /* access modifiers changed from: package-private */
        public static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f79510a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f79511b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f79512c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f79513d;

            static {
                Covode.recordClassIndex(49390);
            }

            b(String str, String str2, String str3, String str4) {
                this.f79510a = str;
                this.f79511b = str2;
                this.f79512c = str3;
                this.f79513d = str4;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (dialogInterface != null) {
                    r.a("2131828515", new com.ss.android.ugc.aweme.app.f.d().a("rule_id", this.f79510a).a("push_label", this.f79511b).a("anchor_id", this.f79512c).a("room_id", this.f79513d).f66730a);
                    dialogInterface.dismiss();
                }
            }
        }

        public static boolean a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str3 : com.ss.android.ugc.aweme.buildconfigdiff.a.f68817a) {
                if (TextUtils.equals(str, str3)) {
                    return true;
                }
            }
            if (str == null || str2 == null || !p.c(str, ".tiktok.com", false) || !p.b(str2, "/t/", false)) {
                return false;
            }
            return true;
        }

        public static boolean b(String str, String str2) {
            if (str2 != null && p.b(str2, "/t/", false)) {
                return false;
            }
            String[] a2 = r.a.a();
            int i2 = 0;
            while (!l.a((Object) a2[i2], (Object) str)) {
                i2++;
                if (i2 >= 34) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.deeplink.n$a$a  reason: collision with other inner class name */
        public static final class DialogInterface$OnClickListenerC1853a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f79504a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f79505b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f79506c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f79507d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f79508e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Intent f79509f;

            static {
                Covode.recordClassIndex(49389);
            }

            DialogInterface$OnClickListenerC1853a(String str, String str2, String str3, String str4, Context context, Intent intent) {
                this.f79504a = str;
                this.f79505b = str2;
                this.f79506c = str3;
                this.f79507d = str4;
                this.f79508e = context;
                this.f79509f = intent;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                Class<? extends Activity> deepLinkHandlerActivityClass;
                String str;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                    com.ss.android.ugc.aweme.common.r.a("2131828516", new com.ss.android.ugc.aweme.app.f.d().a("rule_id", this.f79504a).a("push_label", this.f79505b).a("anchor_id", this.f79506c).a("room_id", this.f79507d).f66730a);
                }
                Context context = this.f79508e;
                if (context instanceof Activity) {
                    Intent intent = this.f79509f;
                    Activity activity = (Activity) context;
                    l.d(activity, "");
                    if (!(intent == null || intent.getData() == null)) {
                        if (l.a((Object) "from_deep_link", (Object) "from_app_link")) {
                            deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(true);
                        } else {
                            deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(true);
                        }
                        Intent intent2 = new Intent(activity, deepLinkHandlerActivityClass);
                        Uri data = intent.getData();
                        if (data != null) {
                            str = data.toString();
                        } else {
                            str = null;
                        }
                        g gVar = new g(str);
                        gVar.a("random", new Random(1000).toString());
                        intent2.setData(Uri.parse(gVar.a()));
                        intent2.putExtras(intent);
                        intent2.putExtra("inner_from", "require_login");
                        a.a(activity, intent2);
                    }
                    ((Activity) this.f79508e).finish();
                }
            }
        }
    }
}
