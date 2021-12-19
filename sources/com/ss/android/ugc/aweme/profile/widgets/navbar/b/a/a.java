package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityIcon;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> {

    /* renamed from: i  reason: collision with root package name */
    public static final C3008a f117976i = new C3008a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public List<? extends UgProfileActivityButton> f117977h;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$a  reason: collision with other inner class name */
    public static final class C3008a {
        static {
            Covode.recordClassIndex(76489);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$a$a  reason: collision with other inner class name */
        public static final class C3009a extends com.bytedance.lighten.a.c.d {
            static {
                Covode.recordClassIndex(76490);
            }

            C3009a() {
            }

            @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
            public final void a(Uri uri, Throwable th) {
                l.d(uri, "");
                l.d(th, "");
                com.ss.android.ugc.aweme.framework.a.a.b("activity_image_log", "Entrance image intermediate failed ".concat(String.valueOf(th)));
            }

            @Override // com.bytedance.lighten.a.c.k
            public final void a(Uri uri, View view, Throwable th) {
                l.d(uri, "");
                if (th != null) {
                    com.ss.android.ugc.aweme.framework.a.a.b("activity_image_log", "Entrance image failed ".concat(String.valueOf(th)));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "1");
                } catch (JSONException e2) {
                    ALog.d("ug_activity_button", e2.toString());
                }
                com.bytedance.apm.b.a("profile_activity_reward_button_show", jSONObject, (JSONObject) null, (JSONObject) null);
            }

            @Override // com.bytedance.lighten.a.c.k
            public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                l.d(uri, "");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "0");
                } catch (JSONException e2) {
                    ALog.d("ug_activity_button", e2.toString());
                }
                com.bytedance.apm.b.a("profile_activity_reward_button_show", jSONObject, (JSONObject) null, (JSONObject) null);
            }
        }

        private C3008a() {
        }

        public /* synthetic */ C3008a(byte b2) {
            this();
        }

        public static void a(Context context, UgProfileActivityButton ugProfileActivityButton) {
            l.d(ugProfileActivityButton, "");
            String h5Link = ugProfileActivityButton.getH5Link();
            if (h5Link != null) {
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                intent.setFlags(268435456);
                intent.setData(Uri.parse(h5Link));
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                com.ss.android.ugc.tiktok.security.a.a.a(intent, a2);
                a2.startActivity(intent);
            }
        }

        public static void a(UrlModel urlModel, TuxIconView tuxIconView) {
            l.d(tuxIconView, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i.a((View) tuxIconView, valueOf, valueOf2, valueOf3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
            if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
                String str = urlModel.getUrlList().get(0);
                if (!TextUtils.isEmpty(str)) {
                    v a2 = r.a(str);
                    a2.F = tuxIconView;
                    a2.a(new C3009a());
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(76488);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.Activity;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        if (s()) {
            z();
            com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), b.f117978a, new f(this));
        }
    }

    public final void z() {
        UrlModel resourceUrl;
        UrlModel urlModel;
        List<UgProfileActivityButton> list;
        List<String> urlList;
        if (in.d()) {
            com.ss.android.ugc.aweme.framework.a.a.b("activity_image_log", "child mode");
            return;
        }
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            UgProfileActivityButton a2 = a(awemeActivitySetting);
            UgProfileActivityIcon b2 = b(awemeActivitySetting);
            String str = null;
            if (a(b2)) {
                if (b2 != null) {
                    urlModel = b2.getIconUrl();
                    list = b2.getProfileActivityButtonList();
                } else {
                    urlModel = null;
                    list = null;
                }
                this.f117977h = a(list);
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
                    str = urlList.get(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    x();
                    a(new b(urlModel));
                    List<? extends UgProfileActivityButton> list2 = this.f117977h;
                    if (list2 == null) {
                        l.a("profileActivityButtonList");
                    }
                    if (list2.size() == 1) {
                        a(new c(this));
                    } else {
                        List<? extends UgProfileActivityButton> list3 = this.f117977h;
                        if (list3 == null) {
                            l.a("profileActivityButtonList");
                        }
                        if (list3.size() > 1) {
                            a(new d(this));
                        } else {
                            y();
                            return;
                        }
                    }
                }
                List<? extends UgProfileActivityButton> list4 = this.f117977h;
                if (list4 == null) {
                    l.a("profileActivityButtonList");
                }
                if (list4.size() > 1) {
                    com.ss.android.ugc.aweme.common.r.a("gift_entrance_show", new com.ss.android.ugc.aweme.app.f.d().a("bubble_type", "merge_button").a("enter_from", "personal_homepage").f66730a);
                    return;
                }
                List<? extends UgProfileActivityButton> list5 = this.f117977h;
                if (list5 == null) {
                    l.a("profileActivityButtonList");
                }
                if (list5.size() == 1) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    List<? extends UgProfileActivityButton> list6 = this.f117977h;
                    if (list6 == null) {
                        l.a("profileActivityButtonList");
                    }
                    com.ss.android.ugc.aweme.common.r.a("gift_entrance_show", dVar.a("bubble_type", ((UgProfileActivityButton) list6.get(0)).getId()).a("enter_from", "personal_homepage").f66730a);
                }
            } else if (b2 != null || a2 == null) {
                y();
            } else {
                a2.setId("Coupon");
                if (TextUtils.isEmpty(a2.getH5Link())) {
                    return;
                }
                if ((b(a2) || com.ss.android.ugc.aweme.profile.c.a().g()) && (resourceUrl = a2.getResourceUrl()) != null && resourceUrl.getUrlList() != null && !resourceUrl.getUrlList().isEmpty() && !TextUtils.isEmpty(resourceUrl.getUrlList().get(0))) {
                    x();
                    a(new e(this, resourceUrl, a2));
                }
            }
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
    }

    private static UgProfileActivityButton a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return null;
        }
        try {
            return ugAwemeActivitySetting.getProfileActivityButton();
        } catch (com.bytedance.ies.a unused) {
            return null;
        }
    }

    private static UgProfileActivityIcon b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return null;
        }
        try {
            return ugAwemeActivitySetting.getProfileActivityIcon();
        } catch (com.bytedance.ies.a unused) {
            return null;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            if (aVar != null) {
                this.this$0.z();
            }
            return z.f158842a;
        }
    }

    public static final /* synthetic */ List a(a aVar) {
        List<? extends UgProfileActivityButton> list = aVar.f117977h;
        if (list == null) {
            l.a("profileActivityButtonList");
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
        final /* synthetic */ UrlModel $iconUrl;

        static {
            Covode.recordClassIndex(76491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UrlModel urlModel) {
            super(1);
            this.$iconUrl = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
            com.bytedance.tux.navigation.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a((h.f.a.b<? super TuxIconView, z>) new h.f.a.b<TuxIconView, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(76492);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TuxIconView tuxIconView) {
                    TuxIconView tuxIconView2 = tuxIconView;
                    l.d(tuxIconView2, "");
                    C3008a.a(this.this$0.$iconUrl, tuxIconView2);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
            com.bytedance.tux.navigation.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(76494);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.aweme.common.r.a("gift_entrance_click", new com.ss.android.ugc.aweme.app.f.d().a("bubble_type", ((UgProfileActivityButton) a.a(this.this$0.this$0).get(0)).getId()).a("enter_from", "personal_homepage").f66730a);
                    C3008a.a(this.this$0.this$0.ar_(), (UgProfileActivityButton) a.a(this.this$0.this$0).get(0));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
            com.bytedance.tux.navigation.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(76496);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.aweme.common.r.a("gift_entrance_click", new com.ss.android.ugc.aweme.app.f.d().a("bubble_type", "merge_button").a("enter_from", "personal_homepage").f66730a);
                    ArrayList arrayList = new ArrayList();
                    for (final UgProfileActivityButton ugProfileActivityButton : a.a(this.this$0.this$0)) {
                        a.d dVar = new a.d();
                        AnonymousClass1 r0 = new h.f.a.b<TuxIconView, z>() {
                            /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.d.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(76497);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(TuxIconView tuxIconView) {
                                TuxIconView tuxIconView2 = tuxIconView;
                                l.d(tuxIconView2, "");
                                UrlModel resourceUrl = ugProfileActivityButton.getResourceUrl();
                                l.b(resourceUrl, "");
                                v a2 = r.a(resourceUrl.getUrlList().get(0));
                                a2.F = tuxIconView2;
                                a2.c();
                                return z.f158842a;
                            }
                        };
                        l.c(r0, "");
                        dVar.f45255g = r0;
                        String name = ugProfileActivityButton.getName();
                        l.b(name, "");
                        arrayList.add(dVar.a(name).a(new h.f.a.b<View, z>(this) {
                            /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.d.AnonymousClass1.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(76498);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(View view) {
                                l.d(view, "");
                                C3008a.a(this.this$0.this$0.this$0.ar_(), ugProfileActivityButton);
                                com.ss.android.ugc.aweme.common.r.a("activity_button_click", new com.ss.android.ugc.aweme.app.f.d().a("button_type", ugProfileActivityButton.getId()).a("enter_from", "personal_homepage").f66730a);
                                return z.f158842a;
                            }
                        }));
                    }
                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                    com.bytedance.tux.sheet.a.a b2 = new a.b().a(arrayList).b();
                    if (j2 != null && (j2 instanceof androidx.fragment.app.e)) {
                        b2.show(((androidx.fragment.app.e) j2).getSupportFragmentManager(), "");
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.navigation.a.b, z> {
        final /* synthetic */ UgProfileActivityButton $profileActivityButton;
        final /* synthetic */ UrlModel $resourceUrl;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, UrlModel urlModel, UgProfileActivityButton ugProfileActivityButton) {
            super(1);
            this.this$0 = aVar;
            this.$resourceUrl = urlModel;
            this.$profileActivityButton = ugProfileActivityButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.b bVar) {
            com.bytedance.tux.navigation.a.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a((h.f.a.b<? super TuxIconView, z>) new h.f.a.b<TuxIconView, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(76500);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(TuxIconView tuxIconView) {
                    TuxIconView tuxIconView2 = tuxIconView;
                    l.d(tuxIconView2, "");
                    C3008a.a(this.this$0.$resourceUrl, tuxIconView2);
                    return z.f158842a;
                }
            }).a((h.f.a.a<z>) new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(76501);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.aweme.common.r.a("gift_entrance_click", new com.ss.android.ugc.aweme.app.f.d().a("bubble_type", "coupon_fission").a("enter_from", "personal_homepage").f66730a);
                    C3008a.a(this.this$0.this$0.ar_(), this.this$0.$profileActivityButton);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    private static boolean b(UgProfileActivityButton ugProfileActivityButton) {
        try {
            Integer showScenery = ugProfileActivityButton.getShowScenery();
            if (showScenery == null) {
                return false;
            }
            if (showScenery.intValue() == 1) {
                return true;
            }
            return false;
        } catch (com.bytedance.ies.a unused) {
            com.ss.android.ugc.aweme.framework.a.a.b("activity_image_log", "show scenery not get");
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        l.d(bVar, "");
    }

    private static List<UgProfileActivityButton> a(List<? extends UgProfileActivityButton> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (UgProfileActivityButton ugProfileActivityButton : list) {
                if (l.a((Object) ugProfileActivityButton.getId(), (Object) "Coupon") && a(ugProfileActivityButton)) {
                    arrayList.add(ugProfileActivityButton);
                } else if (!l.a((Object) ugProfileActivityButton.getId(), (Object) "Coupon")) {
                    arrayList.add(ugProfileActivityButton);
                }
            }
        }
        return arrayList;
    }

    private static boolean a(UgProfileActivityButton ugProfileActivityButton) {
        UrlModel resourceUrl;
        if (ugProfileActivityButton == null || (resourceUrl = ugProfileActivityButton.getResourceUrl()) == null || resourceUrl.getUrlList() == null) {
            return false;
        }
        List<String> urlList = resourceUrl.getUrlList();
        l.b(urlList, "");
        if (!(!urlList.isEmpty()) || (!b(ugProfileActivityButton) && !com.ss.android.ugc.aweme.profile.c.a().g())) {
            return false;
        }
        return true;
    }

    private static boolean a(UgProfileActivityIcon ugProfileActivityIcon) {
        if (ugProfileActivityIcon == null) {
            return false;
        }
        UrlModel iconUrl = ugProfileActivityIcon.getIconUrl();
        List<UgProfileActivityButton> profileActivityButtonList = ugProfileActivityIcon.getProfileActivityButtonList();
        if (iconUrl == null || profileActivityButtonList == null || !(!profileActivityButtonList.isEmpty()) || iconUrl.getUrlList() == null) {
            return false;
        }
        List<String> urlList = iconUrl.getUrlList();
        l.b(urlList, "");
        if (!urlList.isEmpty()) {
            return true;
        }
        return false;
    }
}
