package com.ss.android.ugc.aweme.authorize;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.authorize.a;
import com.ss.android.ugc.aweme.authorize.a.a;
import com.ss.android.ugc.aweme.authorize.c;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cx;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public class b extends Fragment implements com.ss.android.ugc.aweme.openauthorize.h, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static Fragment q;
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AuthCommonViewModel f67118a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f67119b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.authorize.c.a f67120c;

    /* renamed from: d  reason: collision with root package name */
    int f67121d;

    /* renamed from: e  reason: collision with root package name */
    public String f67122e;

    /* renamed from: f  reason: collision with root package name */
    String f67123f;

    /* renamed from: g  reason: collision with root package name */
    String f67124g;

    /* renamed from: h  reason: collision with root package name */
    String f67125h;

    /* renamed from: i  reason: collision with root package name */
    String f67126i;

    /* renamed from: j  reason: collision with root package name */
    String f67127j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.sdk.a.b.d.d f67128k;

    /* renamed from: l  reason: collision with root package name */
    boolean f67129l;

    /* renamed from: m  reason: collision with root package name */
    String f67130m = "";
    public String n;
    String o;
    String p;
    private AwemeAuthorizePlatformDepend s;
    private a.AbstractC1045a t;
    private Handler u = new Handler(Looper.getMainLooper());
    private boolean v;
    private SparseArray w;

    static {
        Covode.recordClassIndex(41352);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(356, new org.greenrobot.eventbus.g(b.class, "onUserBannedEvent", com.ss.android.ugc.aweme.base.d.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41353);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static boolean c() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            h.f.b.l.b(awemeActivitySetting, "");
            Boolean isNewUser = awemeActivitySetting.getIsNewUser();
            h.f.b.l.b(isNewUser, "");
            return isNewUser.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67139a;

        static {
            Covode.recordClassIndex(41359);
        }

        f(b bVar) {
            this.f67139a = bVar;
        }

        public final void run() {
            EventBus.a(EventBus.a(), this.f67139a);
            r.a("login_notify", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f67139a.a()).f66730a);
            OpenPlatformServiceImpl.b().a(this.f67139a, new ArrayList<>());
        }
    }

    public final String a() {
        c.a aVar = this.f67119b;
        if (aVar == null) {
            h.f.b.l.a("request");
        }
        return aVar.f43134c;
    }

    public final void b() {
        Fragment fragment = q;
        if (fragment == null || !(fragment instanceof e)) {
            c(com.ss.android.ugc.aweme.authorize.b.b.a(-2, cx.f79187a, "", "", ""));
            return;
        }
        AuthCommonViewModel authCommonViewModel = this.f67118a;
        if (authCommonViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel.f67211c.observe(this, new n(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.authorize.c.a aVar = this.f67120c;
        if (aVar == null) {
            h.f.b.l.a("authLoading");
        }
        if (aVar.isShowing()) {
            com.ss.android.ugc.aweme.authorize.c.a aVar2 = this.f67120c;
            if (aVar2 == null) {
                h.f.b.l.a("authLoading");
            }
            aVar2.dismiss();
        }
        EventBus.a().b(this);
    }

    public static final /* synthetic */ c.a a(b bVar) {
        c.a aVar = bVar.f67119b;
        if (aVar == null) {
            h.f.b.l.a("request");
        }
        return aVar;
    }

    @org.greenrobot.eventbus.r
    public final void onUserBannedEvent(com.ss.android.ugc.aweme.base.d.e eVar) {
        h.f.b.l.d(eVar, "");
        this.v = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.b$b  reason: collision with other inner class name */
    static final class C1512b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(41354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1512b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.b(R.string.dlz, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.authorize.b.C1512b.AnonymousClass1 */
                final /* synthetic */ C1512b this$0;

                static {
                    Covode.recordClassIndex(41355);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.b(com.ss.android.ugc.aweme.authorize.b.b.a(-5, cx.f79188b, "", "", ""));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.openauthorize.a.b f67136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f67137b;

        static {
            Covode.recordClassIndex(41357);
        }

        d(com.ss.android.ugc.aweme.openauthorize.a.b bVar, b bVar2) {
            this.f67136a = bVar;
            this.f67137b = bVar2;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            int i2;
            Integer resultCode = this.f67136a.getResultCode();
            if (resultCode != null) {
                i2 = resultCode.intValue();
            } else {
                i2 = -1;
            }
            this.f67137b.b(com.ss.android.ugc.aweme.authorize.b.b.a(i2, this.f67136a.getResultMsg(), "", "", ""));
        }
    }

    private final void a(int i2) {
        if (i2 != 0) {
            c(com.ss.android.ugc.aweme.authorize.b.b.a(-30, "login fail", "", "", ""));
            return;
        }
        AuthCommonViewModel authCommonViewModel = this.f67118a;
        if (authCommonViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel.a();
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67144a;

        static {
            Covode.recordClassIndex(41364);
        }

        k(b bVar) {
            this.f67144a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.openauthorize.a.j jVar = (com.ss.android.ugc.aweme.openauthorize.a.j) obj;
            if (jVar == null) {
                return;
            }
            if (jVar.f114505b) {
                androidx.fragment.app.e activity = this.f67144a.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            String str = "";
            if (this.f67144a.getActivity() != null) {
                androidx.fragment.app.e activity2 = this.f67144a.getActivity();
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                String string = activity2.getString(R.string.de3);
                h.f.b.l.b(string, str);
                str = string;
            }
            this.f67144a.a(str);
        }
    }

    static final class m<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67146a;

        static {
            Covode.recordClassIndex(41366);
        }

        m(b bVar) {
            this.f67146a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.openauthorize.a.a aVar = (com.ss.android.ugc.aweme.openauthorize.a.a) obj;
            if (aVar != null) {
                if (aVar.f114496a) {
                    com.ss.android.ugc.aweme.authorize.c.a aVar2 = this.f67146a.f67120c;
                    if (aVar2 == null) {
                        h.f.b.l.a("authLoading");
                    }
                    aVar2.show();
                }
                if (aVar.f114497b) {
                    this.f67146a.c(com.ss.android.ugc.aweme.authorize.b.b.a(-2, cx.f79187a, "", "", ""));
                }
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67142a;

        static {
            Covode.recordClassIndex(41362);
        }

        i(b bVar) {
            this.f67142a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.ss.android.ugc.aweme.openauthorize.a.j jVar = (com.ss.android.ugc.aweme.openauthorize.a.j) obj;
            if (jVar == null) {
                return;
            }
            if (jVar.f114505b) {
                b bVar = this.f67142a;
                AuthCommonViewModel authCommonViewModel = bVar.f67118a;
                if (authCommonViewModel == null) {
                    h.f.b.l.a("viewModel");
                }
                String a2 = bVar.a();
                if (a2 == null) {
                    a2 = "";
                }
                int i2 = bVar.f67121d;
                c.a aVar = bVar.f67119b;
                if (aVar == null) {
                    h.f.b.l.a("request");
                }
                String a3 = com.bytedance.sdk.a.b.c.a.a.a(aVar);
                h.f.b.l.b(a3, "");
                authCommonViewModel.a(a2, i2, a3, null, null, false);
                return;
            }
            b bVar2 = this.f67142a;
            com.ss.android.ugc.aweme.openauthorize.a.k kVar = jVar.f114506c;
            if (kVar != null) {
                str = kVar.f114509c;
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            com.ss.android.ugc.aweme.authorize.c.a aVar2 = bVar2.f67120c;
            if (aVar2 == null) {
                h.f.b.l.a("authLoading");
            }
            aVar2.hide();
            a.C0731a a4 = new a.C0731a(bVar2.getContext()).a(R.string.d02);
            a4.f33402b = valueOf;
            a4.M = false;
            a4.a(R.string.dm0, (DialogInterface.OnClickListener) new c(bVar2), false).a().c();
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67145a;

        static {
            Covode.recordClassIndex(41365);
        }

        l(b bVar) {
            this.f67145a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            com.ss.android.ugc.aweme.openauthorize.a.h hVar = (com.ss.android.ugc.aweme.openauthorize.a.h) obj;
            if (hVar == null) {
                return;
            }
            if (hVar.f114499b) {
                androidx.fragment.app.e activity = this.f67145a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f67145a.getContext(), "aweme://webview");
                com.ss.android.ugc.aweme.openauthorize.a.i iVar = hVar.f114500c;
                if (iVar != null) {
                    str2 = iVar.f114501a;
                } else {
                    str2 = null;
                }
                buildRoute.withParam(Uri.parse(str2)).withParam("hide_nav_bar", true).open();
                return;
            }
            b bVar = this.f67145a;
            com.ss.android.ugc.aweme.openauthorize.a.i iVar2 = hVar.f114500c;
            if (iVar2 == null || (str = iVar2.f114503c) == null) {
                str = "error";
            }
            bVar.a(str);
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.authorize.c.a aVar = this.f67120c;
        if (aVar == null) {
            h.f.b.l.a("authLoading");
        }
        aVar.hide();
        if (!TextUtils.isEmpty(str) && getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(str).a();
        }
    }

    public final void b(c.b bVar) {
        int i2 = a.f67103d;
        int i3 = bVar.errorCode;
        String str = bVar.errorMsg;
        if (str == null) {
            str = "";
        }
        String a2 = a();
        String str2 = this.f67123f;
        if (str2 == null) {
            h.f.b.l.a("mTikTokSdkName");
        }
        String str3 = this.f67124g;
        if (str3 == null) {
            h.f.b.l.a("mTikTokSdkVersion");
        }
        String str4 = this.f67125h;
        if (str4 == null) {
            h.f.b.l.a("mCommonSdkName");
        }
        String str5 = this.f67126i;
        if (str5 == null) {
            h.f.b.l.a("mCommonSdkVersion");
        }
        a.C1510a.a(i2, i3, str, a2, str2, str3, str4, str5);
        a(bVar);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void c(c.b bVar) {
        h.f.b.l.d(bVar, "");
        int i2 = a.f67104e;
        String a2 = a();
        String str = this.f67123f;
        if (str == null) {
            h.f.b.l.a("mTikTokSdkName");
        }
        String str2 = this.f67124g;
        if (str2 == null) {
            h.f.b.l.a("mTikTokSdkVersion");
        }
        String str3 = this.f67125h;
        if (str3 == null) {
            h.f.b.l.a("mCommonSdkName");
        }
        String str4 = this.f67126i;
        if (str4 == null) {
            h.f.b.l.a("mCommonSdkVersion");
        }
        a.C1510a.a(i2, 0, "", a2, str, str2, str3, str4);
        a(bVar);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67141a;

        static {
            Covode.recordClassIndex(41361);
        }

        h(b bVar) {
            this.f67141a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.openauthorize.a.g> scopeList;
            com.ss.android.ugc.aweme.openauthorize.a.d dVar = (com.ss.android.ugc.aweme.openauthorize.a.d) obj;
            if (dVar != null) {
                Integer statusCode = dVar.getStatusCode();
                int i2 = -1;
                if (statusCode != null && statusCode.intValue() == 0) {
                    Boolean isLite = dVar.isLite();
                    if (isLite == null || !isLite.booleanValue()) {
                        com.ss.android.ugc.aweme.openauthorize.a.e pageDetail = dVar.getPageDetail();
                        String str = null;
                        if (pageDetail == null || (scopeList = pageDetail.getScopeList()) == null) {
                            Integer statusCode2 = dVar.getStatusCode();
                            if (statusCode2 != null) {
                                i2 = statusCode2.intValue();
                            }
                            this.f67141a.b(com.ss.android.ugc.aweme.authorize.b.b.a(i2, dVar.getStatusMsg(), "", "", ""));
                            return;
                        }
                        int size = scopeList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            str = com.ss.android.ugc.aweme.authorize.b.a.a(str, i3, scopeList);
                        }
                        AuthCommonViewModel authCommonViewModel = this.f67141a.f67118a;
                        if (authCommonViewModel == null) {
                            h.f.b.l.a("viewModel");
                        }
                        h.f.b.l.d(scopeList, "");
                        authCommonViewModel.f67211c.postValue(h.a.n.a((Iterable) scopeList, (Comparator) new AuthCommonViewModel.g()));
                        b.a(this.f67141a).f43139h = str;
                        Bundle arguments = this.f67141a.getArguments();
                        if (arguments == null) {
                            h.f.b.l.b();
                        }
                        arguments.putString("_bytedance_params_scope", str);
                        this.f67141a.a(dVar);
                        this.f67141a.b(dVar);
                        return;
                    }
                    this.f67141a.a(dVar);
                    this.f67141a.b(dVar);
                    return;
                }
                Integer statusCode3 = dVar.getStatusCode();
                if (statusCode3 != null) {
                    i2 = statusCode3.intValue();
                }
                this.f67141a.b(com.ss.android.ugc.aweme.authorize.b.b.a(i2, dVar.getStatusMsg(), "", "", ""));
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67143a;

        static {
            Covode.recordClassIndex(41363);
        }

        j(b bVar) {
            this.f67143a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.sdk.a.b.d.b bVar = (com.bytedance.sdk.a.b.d.b) obj;
            if (bVar == null) {
                return;
            }
            if (bVar.t) {
                c.b a2 = com.ss.android.ugc.aweme.authorize.b.b.a(0, bVar.v, b.a(this.f67143a).f43139h, bVar.f43115a, b.a(this.f67143a).f43132a);
                b bVar2 = this.f67143a;
                int i2 = a.f67102c;
                String a3 = bVar2.a();
                String str = bVar2.f67123f;
                if (str == null) {
                    h.f.b.l.a("mTikTokSdkName");
                }
                String str2 = bVar2.f67124g;
                if (str2 == null) {
                    h.f.b.l.a("mTikTokSdkVersion");
                }
                String str3 = bVar2.f67125h;
                if (str3 == null) {
                    h.f.b.l.a("mCommonSdkName");
                }
                String str4 = bVar2.f67126i;
                if (str4 == null) {
                    h.f.b.l.a("mCommonSdkVersion");
                }
                a.C1510a.a(i2, 0, "", a3, str, str2, str3, str4);
                com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("auth_app", bVar2.f67127j).a("channel", bVar2.a()).a("is_login", (Object) true);
                c.a aVar = bVar2.f67119b;
                if (aVar == null) {
                    h.f.b.l.a("request");
                }
                r.a("auth_success", a4.a("auth_scope", aVar.f43139h).a("disabled_scope", bVar2.n).a("is_mobile_show", 0).a("is_mobile", 0).a("platform", "native_click").a("enter_method", "android").a("is_register", b.c() ? 1 : 0).f66730a);
                bVar2.a(a2);
                androidx.fragment.app.e activity = bVar2.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f67143a.b(com.ss.android.ugc.aweme.authorize.b.b.a(bVar.u, bVar.v, "", "", ""));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67147a;

        static {
            Covode.recordClassIndex(41367);
        }

        n(b bVar) {
            this.f67147a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
            if (r0.booleanValue() != false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            if (r0.booleanValue() == false) goto L_0x0030;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 170
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.b.n.onChanged(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c.b bVar) {
        List<String> a2;
        c.a aVar = this.f67119b;
        if (aVar == null) {
            h.f.b.l.a("request");
        }
        String callerPackage = aVar.getCallerPackage();
        c.a aVar2 = this.f67119b;
        if (aVar2 == null) {
            h.f.b.l.a("request");
        }
        String str = aVar2.callerLocalEntry;
        if (!TextUtils.isEmpty(callerPackage) && !TextUtils.isEmpty(str) && bVar.checkArgs()) {
            h.f.b.l.b(callerPackage, "");
            if (this.f67122e == null) {
                Bundle bundle = new Bundle();
                bVar.toBundle(bundle);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(callerPackage, str));
                intent.putExtras(bundle);
                intent.addFlags(67108864);
                intent.addFlags(268435456);
            } else {
                Context context = getContext();
                String str2 = this.f67122e;
                if (!(TextUtils.isEmpty(callerPackage) || TextUtils.isEmpty(str2) || context == null || (a2 = com.bytedance.sdk.a.c.b.b.a(context, callerPackage)) == null || a2.size() <= 0)) {
                    for (String str3 : a2) {
                        if (str2.equalsIgnoreCase(str3)) {
                        }
                    }
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bVar.toBundle(bundle2);
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(callerPackage, str));
            intent2.putExtras(bundle2);
            intent2.addFlags(67108864);
            intent2.addFlags(268435456);
            try {
                startActivity(intent2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b(com.ss.android.ugc.aweme.openauthorize.a.d dVar) {
        com.ss.android.ugc.aweme.openauthorize.a.b checkResult = dVar.getCheckResult();
        if (checkResult != null) {
            a.C0731a aVar = new a.C0731a(getContext());
            aVar.f33402b = checkResult.getResultMsg();
            a.C0731a a2 = aVar.a(R.string.asq, (DialogInterface.OnClickListener) e.f67138a, false);
            a2.n = new d(checkResult, this);
            a2.a().c();
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67140a;

        static {
            Covode.recordClassIndex(41360);
        }

        g(b bVar) {
            this.f67140a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.sdk.a.b.d.d dVar = (com.bytedance.sdk.a.b.d.d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.t) {
                this.f67140a.f67128k = dVar;
                b bVar = this.f67140a;
                if (bVar.f67129l && bVar.o == null && bVar.p == null) {
                    String str = bVar.f67130m;
                    Integer valueOf = Integer.valueOf(bVar.f67121d);
                    c.a aVar = bVar.f67119b;
                    if (aVar == null) {
                        h.f.b.l.a("request");
                    }
                    String str2 = aVar.f43134c;
                    c.a aVar2 = bVar.f67119b;
                    if (aVar2 == null) {
                        h.f.b.l.a("request");
                    }
                    String str3 = aVar2.f43135d;
                    c.a aVar3 = bVar.f67119b;
                    if (aVar3 == null) {
                        h.f.b.l.a("request");
                    }
                    String str4 = aVar3.f43139h;
                    c.a aVar4 = bVar.f67119b;
                    if (aVar4 == null) {
                        h.f.b.l.a("request");
                    }
                    com.ss.android.ugc.aweme.authorize.a.b bVar2 = new com.ss.android.ugc.aweme.authorize.a.b("", str, valueOf, str2, str3, str4, aVar4.f43136e);
                    AuthCommonViewModel authCommonViewModel = bVar.f67118a;
                    if (authCommonViewModel == null) {
                        h.f.b.l.a("viewModel");
                    }
                    h.f.b.l.d(bVar2, "");
                    AuthCommonViewModel.f fVar = new AuthCommonViewModel.f(authCommonViewModel);
                    h.f.b.l.d(bVar2, "");
                    h.f.b.l.d(fVar, "");
                    h.f.b.l.d(bVar2, "");
                    com.ss.android.ugc.aweme.authorize.network.a.f67207a.scanQrcode(bVar2.f67111a, bVar2.f67112b, bVar2.f67113c, bVar2.f67114d, bVar2.f67115e, bVar2.f67116f, bVar2.f67117g).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a_(new a.e(fVar));
                } else if (!dVar.q || bVar.o != null) {
                    AuthCommonViewModel authCommonViewModel2 = bVar.f67118a;
                    if (authCommonViewModel2 == null) {
                        h.f.b.l.a("viewModel");
                    }
                    String a2 = bVar.a();
                    if (a2 == null) {
                        a2 = "";
                    }
                    int i2 = bVar.f67121d;
                    c.a aVar5 = bVar.f67119b;
                    if (aVar5 == null) {
                        h.f.b.l.a("request");
                    }
                    String a3 = com.bytedance.sdk.a.b.c.a.a.a(aVar5);
                    h.f.b.l.b(a3, "");
                    authCommonViewModel2.a(a2, i2, a3, bVar.p, bVar.o, false);
                } else {
                    AuthCommonViewModel authCommonViewModel3 = bVar.f67118a;
                    if (authCommonViewModel3 == null) {
                        h.f.b.l.a("viewModel");
                    }
                    String a4 = bVar.a();
                    if (a4 == null) {
                        a4 = "";
                    }
                    int i3 = bVar.f67121d;
                    c.a aVar6 = bVar.f67119b;
                    if (aVar6 == null) {
                        h.f.b.l.a("request");
                    }
                    String a5 = com.bytedance.sdk.a.b.c.a.a.a(aVar6);
                    h.f.b.l.b(a5, "");
                    authCommonViewModel3.a(a4, i3, a5, bVar.p, bVar.o, true);
                }
            } else {
                this.f67140a.b(com.ss.android.ugc.aweme.authorize.b.b.a(dVar.u, dVar.v, "", "", ""));
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.openauthorize.a.d dVar) {
        boolean z;
        if (getArguments() == null) {
            b(com.ss.android.ugc.aweme.authorize.b.b.a(-1, "", "", "", ""));
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            h.f.b.l.b();
        }
        arguments.putSerializable("auth_page_info", dVar);
        com.ss.android.ugc.aweme.authorize.c.a aVar = this.f67120c;
        if (aVar == null) {
            h.f.b.l.a("authLoading");
        }
        aVar.dismiss();
        Boolean isLite = dVar.isLite();
        if (isLite != null) {
            z = isLite.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            Bundle arguments2 = getArguments();
            String str = this.f67122e;
            d dVar2 = new d();
            if (arguments2 != null) {
                arguments2.putString("caller_signature_key", str);
            }
            dVar2.setArguments(arguments2);
            q = dVar2;
            androidx.fragment.app.n a2 = getChildFragmentManager().a();
            Fragment fragment = q;
            if (fragment == null) {
                h.f.b.l.b();
            }
            a2.a(R.id.b9i, fragment).c();
        } else if (this.o != null) {
            Bundle arguments3 = getArguments();
            String str2 = this.f67122e;
            f fVar = new f();
            if (arguments3 != null) {
                arguments3.putString("caller_signature_key", str2);
            }
            fVar.setArguments(arguments3);
            q = fVar;
            androidx.fragment.app.n a3 = getChildFragmentManager().a();
            Fragment fragment2 = q;
            if (fragment2 == null) {
                h.f.b.l.b();
            }
            a3.a(R.id.b9i, fragment2).c();
        } else {
            q = c.a.a(getArguments(), this.f67122e);
            androidx.fragment.app.n a4 = getChildFragmentManager().a();
            Fragment fragment3 = q;
            if (fragment3 == null) {
                h.f.b.l.b();
            }
            a4.a(R.id.b9i, fragment3).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        super.onCreate(bundle);
        this.s = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.s;
        if (awemeAuthorizePlatformDepend == null) {
            h.f.b.l.a("depend");
        }
        this.t = new com.bytedance.sdk.a.b.c.a.b(context, awemeAuthorizePlatformDepend);
        this.f67119b = new c.a(getArguments());
        Bundle arguments = getArguments();
        String str8 = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("_aweme_params_caller_open_sdk_common_name")) == null) {
            str = "";
        }
        this.f67125h = str;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("_aweme_params_caller_open_sdk_common_version")) == null) {
            str2 = "";
        }
        this.f67126i = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str3 = arguments4.getString("_aweme_params_caller_open_sdk_name")) == null) {
            str3 = "";
        }
        this.f67123f = str3;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str4 = arguments5.getString("_aweme_params_caller_open_sdk_version")) == null) {
            str4 = "";
        }
        this.f67124g = str4;
        boolean z = false;
        if (bundle2 != null) {
            i2 = bundle2.getInt("authType");
        } else {
            i2 = 0;
        }
        this.f67121d = i2;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z = arguments6.getBoolean("key_qrcode_auth", false);
        }
        this.f67129l = z;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (str5 = arguments7.getString("key_qrcode_token")) == null) {
            str5 = "";
        }
        this.f67130m = str5;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            str6 = arguments8.getString("key_qrcode_bc_params");
        } else {
            str6 = null;
        }
        this.o = str6;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            str7 = arguments9.getString("key_qrcode_redirect_uri");
        } else {
            str7 = null;
        }
        this.p = str7;
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            str8 = arguments10.getString("caller_signature_key");
        }
        this.f67122e = str8;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.s;
        if (awemeAuthorizePlatformDepend2 == null) {
            h.f.b.l.a("depend");
        }
        a.AbstractC1045a aVar = this.t;
        if (aVar == null) {
            h.f.b.l.a("model");
        }
        c.a aVar2 = this.f67119b;
        if (aVar2 == null) {
            h.f.b.l.a("request");
        }
        com.ss.android.ugc.aweme.authorize.viewmodel.a aVar3 = new com.ss.android.ugc.aweme.authorize.viewmodel.a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            h.f.b.l.b();
        }
        ac a2 = ae.a(activity, aVar3).a(AuthCommonViewModel.class);
        h.f.b.l.b(a2, "");
        this.f67118a = (AuthCommonViewModel) a2;
        Context context2 = getContext();
        if (context2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(context2, "");
        String string = getString(R.string.g4k);
        h.f.b.l.b(string, "");
        this.f67120c = new com.ss.android.ugc.aweme.authorize.c.a(context2, string);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f67138a = new e();

        static {
            Covode.recordClassIndex(41358);
        }

        e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67135a;

        static {
            Covode.recordClassIndex(41356);
        }

        c(b bVar) {
            this.f67135a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            androidx.fragment.app.e activity = this.f67135a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.authorize.c.a aVar = this.f67120c;
        if (aVar == null) {
            h.f.b.l.a("authLoading");
        }
        aVar.show();
        if (com.ss.android.ugc.aweme.account.b.g() != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin()) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                if (g3.isChildrenMode()) {
                    Context context = getContext();
                    if (context != null) {
                        h.f.b.l.b(context, "");
                        com.bytedance.tux.dialog.a a2 = com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context).d("This feature is not available for your account due to the age restriction. Try using another account."), new C1512b(this)).a();
                        if (a2 != null) {
                            a2.b().show();
                        }
                    }
                } else {
                    a(0);
                }
            } else {
                q.d(true);
                IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                IAccountUserService g5 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g5, "");
                g4.delete(g5.getCurUserId(), "authorize");
                this.u.postDelayed(new f(this), 1500);
            }
        } else {
            a(-1);
        }
        AuthCommonViewModel authCommonViewModel = this.f67118a;
        if (authCommonViewModel == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel.f67209a.observe(this, new g(this));
        AuthCommonViewModel authCommonViewModel2 = this.f67118a;
        if (authCommonViewModel2 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel2.f67210b.observe(this, new h(this));
        AuthCommonViewModel authCommonViewModel3 = this.f67118a;
        if (authCommonViewModel3 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel3.f67214f.observe(this, new i(this));
        AuthCommonViewModel authCommonViewModel4 = this.f67118a;
        if (authCommonViewModel4 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel4.f67212d.observe(this, new j(this));
        AuthCommonViewModel authCommonViewModel5 = this.f67118a;
        if (authCommonViewModel5 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel5.f67213e.observe(this, new k(this));
        AuthCommonViewModel authCommonViewModel6 = this.f67118a;
        if (authCommonViewModel6 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel6.f67216h.observe(this, new l(this));
        AuthCommonViewModel authCommonViewModel7 = this.f67118a;
        if (authCommonViewModel7 == null) {
            h.f.b.l.a("viewModel");
        }
        authCommonViewModel7.f67215g.observe(this, new m(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2001) {
            int i4 = -1;
            if (i3 == -1 && !this.v && !in.d()) {
                i4 = 0;
            }
            a(i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9586);
        h.f.b.l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b0, (ViewGroup) null);
        MethodCollector.o(9586);
        return inflate;
    }
}
