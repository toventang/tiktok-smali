package com.ss.android.ugc.aweme.money.growth;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfoApi;
import com.ss.android.ugc.aweme.ug.guide.i;
import h.a.n;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f110852f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f110853g = b.f110861a;

    /* renamed from: h  reason: collision with root package name */
    public static final a f110854h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f110855a;

    /* renamed from: b  reason: collision with root package name */
    public final d f110856b;

    /* renamed from: c  reason: collision with root package name */
    public String f110857c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f110858d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f110859e;

    /* renamed from: i  reason: collision with root package name */
    private final List<WeakReference<a>> f110860i;

    public static final class a {
        static {
            Covode.recordClassIndex(71129);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final e f110861a = new e((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f110862b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(71130);
        }
    }

    public static void h() {
        com.ss.android.ugc.d.a.c.a(new i());
    }

    static {
        Covode.recordClassIndex(71128);
    }

    private e() {
        this.f110860i = new ArrayList();
        d dVar = new d();
        this.f110856b = dVar;
        this.f110859e = true;
        i();
        this.f110857c = dVar.f110850c;
    }

    private final boolean j() {
        UrlModel urlModel;
        UgLoginBanner loginBanner;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
            if (ugAwemeActivitySetting == null || (loginBanner = ugAwemeActivitySetting.getLoginBanner()) == null) {
                urlModel = null;
            } else {
                urlModel = loginBanner.getResourceUrl();
            }
            return b(urlModel);
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        UrlModel urlModel;
        UgChannelPopup channelPopup;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
            if (ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) {
                urlModel = null;
            } else {
                urlModel = channelPopup.getResourceUrl();
            }
            return b(urlModel);
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f110858d = true;
        if (!this.f110859e) {
            l.d("not first video,show dialog", "");
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        UrlModel urlModel;
        UgProfileActivityButton profileActivityButton;
        l.d("tryLoadCouponIconImage", "");
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
            if (ugAwemeActivitySetting == null || (profileActivityButton = ugAwemeActivitySetting.getProfileActivityButton()) == null) {
                urlModel = null;
            } else {
                urlModel = profileActivityButton.getResourceUrl();
            }
            b(urlModel);
        } catch (com.bytedance.ies.a unused) {
            l.d("tryLoadCouponIconImage:NullValueException", "");
        }
    }

    private final void i() {
        String str;
        UgChannelPopup channelPopup;
        l.d(" initActivityEntry", "");
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            this.f110855a = iESSettingsProxy.getAwemeActivitySetting();
            try {
                if (TextUtils.isEmpty(this.f110857c)) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
                    if (ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) {
                        str = null;
                    } else {
                        str = channelPopup.getCampaignName();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        b.i.b(GoogleCampaignInfoApi.a.CallableC2830a.f110827a, b.i.f4824a);
                    }
                }
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
            if (e()) {
                c();
                d();
            }
            j();
        } catch (com.bytedance.ies.a unused) {
            l.d(" initEntry NullValueException", "");
        }
    }

    public final void a() {
        a aVar;
        f110852f = true;
        i();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
        if (ugAwemeActivitySetting != null) {
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    this.f110856b.a(false);
                    this.f110856b.a(0);
                    this.f110856b.a("");
                }
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
            for (WeakReference weakReference : n.k(this.f110860i)) {
                if (!(weakReference == null || (aVar = (a) weakReference.get()) == null)) {
                    aVar.a(this.f110855a);
                }
            }
        } else {
            l.d("settingRequestComplete -> activityEntry empty", "");
        }
        if (this.f110858d && !this.f110859e) {
            h();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f110856b.f110848a == 2) {
            l.d("DeepLink not show ： have shown", "");
            return false;
        } else if (this.f110856b.f110848a == 1) {
            return true;
        } else {
            try {
                String str = this.f110857c;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
                String str2 = null;
                if (ugAwemeActivitySetting != null) {
                    str2 = ugAwemeActivitySetting.getActivityId();
                }
                if (!TextUtils.equals(str, str2)) {
                    l.d("DeepLink not show： DeepLinkID != activityId--->" + this.f110857c, "");
                    return false;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f110855a;
                if (ugAwemeActivitySetting2 == null || ugAwemeActivitySetting2.getChannelPopup() == null) {
                    l.d("DeepLink not show： channelPopup==null", "");
                    return false;
                }
                this.f110856b.a(1);
                return true;
            } catch (com.bytedance.ies.a unused) {
                l.d("DeepLink not show： setting is null", "");
                return false;
            }
        }
    }

    public final UgLoginBanner g() {
        String str;
        List<String> list;
        UgLoginBanner loginBanner;
        UrlModel resourceUrl;
        UgLoginBanner loginBanner2;
        if (!f110852f || !j()) {
            return null;
        }
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
            if (ugAwemeActivitySetting == null || (loginBanner2 = ugAwemeActivitySetting.getLoginBanner()) == null) {
                str = null;
            } else {
                str = loginBanner2.getText();
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f110855a;
            if (ugAwemeActivitySetting2 == null || (loginBanner = ugAwemeActivitySetting2.getLoginBanner()) == null || (resourceUrl = loginBanner.getResourceUrl()) == null) {
                list = null;
            } else {
                list = resourceUrl.getUrlList();
            }
            if (d.a(list)) {
                return null;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f110855a;
            if (ugAwemeActivitySetting3 != null) {
                return ugAwemeActivitySetting3.getLoginBanner();
            }
            return null;
        } catch (com.bytedance.ies.a unused) {
        }
    }

    public final UgChannelPopup f() {
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        UgChannelPopup channelPopup;
        UrlModel resourceUrl;
        UgChannelPopup channelPopup2;
        UgChannelPopup channelPopup3;
        UgChannelPopup channelPopup4;
        UgChannelPopup channelPopup5;
        this.f110859e = false;
        if (!f110852f) {
            l.d("DeepLink not show： setting not return", "");
            return null;
        } else if (!e()) {
            return null;
        } else {
            if (!c()) {
                l.d("DeepLink not show： resourcce not ready", "");
                return null;
            }
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f110855a;
                if (ugAwemeActivitySetting == null || (channelPopup5 = ugAwemeActivitySetting.getChannelPopup()) == null) {
                    str = null;
                } else {
                    str = channelPopup5.getButtonText();
                }
                if (TextUtils.isEmpty(str)) {
                    l.d("DeepLink not show： activityEntry?.channelPopup?.buttonText is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f110855a;
                if (ugAwemeActivitySetting2 == null || (channelPopup4 = ugAwemeActivitySetting2.getChannelPopup()) == null) {
                    str2 = null;
                } else {
                    str2 = channelPopup4.getContent();
                }
                if (TextUtils.isEmpty(str2)) {
                    l.d("DeepLink not show： activityEntry?.channelPopup?.content is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f110855a;
                if (ugAwemeActivitySetting3 == null || (channelPopup3 = ugAwemeActivitySetting3.getChannelPopup()) == null) {
                    str3 = null;
                } else {
                    str3 = channelPopup3.getTitle();
                }
                if (TextUtils.isEmpty(str3)) {
                    l.d("DeepLink not show： activityEntry?.channelPopup?.title is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting4 = this.f110855a;
                if (ugAwemeActivitySetting4 == null || (channelPopup2 = ugAwemeActivitySetting4.getChannelPopup()) == null) {
                    str4 = null;
                } else {
                    str4 = channelPopup2.getH5Link();
                }
                if (TextUtils.isEmpty(str4)) {
                    l.d("DeepLink not show： activityEntry?.channelPopup?.h5Link is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting5 = this.f110855a;
                if (ugAwemeActivitySetting5 == null || (channelPopup = ugAwemeActivitySetting5.getChannelPopup()) == null || (resourceUrl = channelPopup.getResourceUrl()) == null) {
                    list = null;
                } else {
                    list = resourceUrl.getUrlList();
                }
                if (d.a(list)) {
                    l.d("DeepLink not show： activityEntry?.channelPopup?.resourceUrl is empty", "");
                    return null;
                }
                UgAwemeActivitySetting ugAwemeActivitySetting6 = this.f110855a;
                if (ugAwemeActivitySetting6 != null) {
                    return ugAwemeActivitySetting6.getChannelPopup();
                }
                return null;
            } catch (com.bytedance.ies.a unused) {
                l.d("DeepLink not show： setting channelPopup is empty", "");
                return null;
            }
        }
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f110860i.add(new WeakReference<>(aVar));
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements com.ss.android.ugc.aweme.base.e.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f110863a;

        static {
            Covode.recordClassIndex(71131);
        }

        c(e eVar) {
            this.f110863a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.base.e.a.a
        public final /* synthetic */ void a(Object obj) {
            if (obj != null && this.f110863a.f110858d && !this.f110863a.f110859e) {
                l.d("resoure ready,show dialog", "");
                e.h();
            }
        }
    }

    private final boolean b(UrlModel urlModel) {
        com.ss.android.ugc.aweme.base.model.UrlModel a2 = a(urlModel);
        if (c(urlModel)) {
            return true;
        }
        com.ss.android.ugc.aweme.base.e.a(a2, 0, 0, new c(this));
        return false;
    }

    public static com.ss.android.ugc.aweme.base.model.UrlModel a(UrlModel urlModel) {
        List<String> list;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        String str = null;
        if (urlModel != null) {
            try {
                list = urlModel.getUrlList();
            } catch (com.bytedance.ies.a e2) {
                e2.printStackTrace();
            }
        } else {
            list = null;
        }
        urlModel2.setUrlList(list);
        if (urlModel != null) {
            str = urlModel.getUri();
        }
        urlModel2.setUri(str);
        return urlModel2;
    }

    private static boolean c(UrlModel urlModel) {
        com.ss.android.ugc.aweme.base.model.UrlModel a2 = a(urlModel);
        if (d.a(a2.getUrlList()) || !com.ss.android.ugc.aweme.base.e.a(Uri.parse(a2.getUrlList().get(0)))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        try {
            if (this.f110856b.f110848a != 2) {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                l.b(awemeActivitySetting, "");
                Boolean isNewUser = awemeActivitySetting.getIsNewUser();
                String str2 = "old_user";
                l.b(isNewUser, "");
                if (isNewUser.booleanValue()) {
                    str2 = "new_user";
                }
                r.a("coupon_targetusers", new com.ss.android.ugc.aweme.app.f.d().a("media_source", str).a("user_type", str2).f66730a);
            }
        } catch (com.bytedance.ies.a unused) {
        }
    }

    public final boolean a(String str) {
        l.d("feacebook DeepLink:".concat(String.valueOf(str)), "");
        if (TextUtils.indexOf(str, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(str, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        this.f110857c = parse.getLastPathSegment();
        l.d("deepLinkRequestComplete:".concat(String.valueOf(str)), "");
        b("facebook");
        String str2 = this.f110857c;
        if (str2 != null) {
            d dVar = this.f110856b;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            dVar.a(str2);
        }
        b();
        if (!e()) {
            return true;
        }
        c();
        d();
        return true;
    }

    public static void a(String str, Context context) {
        l.d(str, "");
        l.d(context, "");
        SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
    }
}
