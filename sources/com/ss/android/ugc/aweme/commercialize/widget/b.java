package com.ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.c;
import com.ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static WeakReference<CommonWebPageWidget> f76336a = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    static boolean f76337b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f76338c = new b();

    public static final class a implements IInterceptor {
        static {
            Covode.recordClassIndex(47090);
        }

        a() {
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String str;
            if (routeIntent != null) {
                str = routeIntent.getHost();
            } else {
                str = null;
            }
            if (!l.a((Object) str, (Object) "overlay_webview") || b.f76336a.get() == null) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            String str;
            String str2;
            CommonPopUpWebPageView b2;
            e activity;
            Fragment fragment;
            Context context2;
            Intent extra;
            Bundle a2;
            MethodCollector.i(3690);
            Activity activity2 = null;
            String originUrl = routeIntent != null ? routeIntent.getOriginUrl() : null;
            if (!hl.a(originUrl)) {
                originUrl = null;
            }
            if (originUrl == null) {
                MethodCollector.o(3690);
                return false;
            }
            String queryParameter = Uri.parse(originUrl).getQueryParameter("url");
            if (!hl.a(queryParameter) || queryParameter == null) {
                MethodCollector.o(3690);
                return false;
            }
            l.b(queryParameter, "");
            HashMap hashMap = new HashMap();
            if (!(routeIntent == null || (extra = routeIntent.getExtra()) == null || (a2 = a(extra)) == null)) {
                for (String str3 : a2.keySet()) {
                    l.b(str3, "");
                    String string = a2.getString(str3);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str3, string);
                }
            }
            CommonWebPageWidget commonWebPageWidget = b.f76336a.get();
            if (commonWebPageWidget != null) {
                l.d(hashMap, "");
                String str4 = commonWebPageWidget.q;
                if (str4 == null) {
                    str4 = "";
                }
                hashMap.put("enter_from", str4);
                Aweme aweme = commonWebPageWidget.o;
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
                hashMap.put("group_id", str);
                Aweme aweme2 = commonWebPageWidget.o;
                if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                    str2 = "";
                }
                hashMap.put("author_id", str2);
                hashMap.put("music_id", String.valueOf(ac.c(commonWebPageWidget.o).longValue()));
                l.d(queryParameter, "");
                Fragment fragment2 = commonWebPageWidget.p;
                if (!(fragment2 == null || (activity = fragment2.getActivity()) == null || (fragment = commonWebPageWidget.p) == null || (context2 = fragment.getContext()) == null)) {
                    ac.a a3 = new ac.a().a(queryParameter).a(commonWebPageWidget.p);
                    l.d(context2, "");
                    com.ss.android.ugc.aweme.commercialize.utils.ac a4 = a3.a(h.g.a.a((double) n.e(context2))).b("").a(new Bundle()).a();
                    CommonWebPageWidget.b bVar = commonWebPageWidget.f76329i;
                    CommonWebPageWidget.c cVar = commonWebPageWidget.f76331k;
                    l.d(activity, "");
                    l.d(a4, "");
                    CommonPopUpWebPageView b3 = CommonWebPageWidget.a.b(activity);
                    if (b3 == null) {
                        b3 = new CommonPopUpWebPageView(activity, (byte) 0);
                        b3.setId(R.id.acc);
                        b3.setParams(a4);
                        b3.setMBehaviorCallback(bVar);
                        b3.setKeyDownCallBack(cVar);
                        FrameLayout a5 = CommonWebPageWidget.a.a(activity);
                        if (a5 != null) {
                            a5.addView(b3);
                        }
                    }
                    commonWebPageWidget.f76327a = b3;
                    CommonPopUpWebPageView commonPopUpWebPageView = commonWebPageWidget.f76327a;
                    if (commonPopUpWebPageView != null) {
                        commonPopUpWebPageView.setTitleBarCallback(commonWebPageWidget.f76330j);
                    }
                    commonWebPageWidget.hashCode();
                }
                c.a aVar = new c.a();
                aVar.f76255a = context;
                l.d(queryParameter, "");
                aVar.f76256b = queryParameter;
                l.d(hashMap, "");
                aVar.f76257c.putAll(hashMap);
                c cVar2 = new c(aVar.f76255a, aVar.f76256b, aVar.f76257c, (byte) 0);
                Context context3 = cVar2.f76250a;
                if (context3 instanceof Activity) {
                    activity2 = context3;
                }
                Activity activity3 = activity2;
                if (!(activity3 == null || (b2 = CommonWebPageWidget.a.b(activity3)) == null || b2.a())) {
                    CommonWebPageWidget.a.C1738a aVar2 = new CommonWebPageWidget.a.C1738a(cVar2, b2);
                    if (b2.a(R.id.d19) == null) {
                        b2.f76209h = aVar2;
                    } else {
                        aVar2.invoke();
                    }
                }
            }
            MethodCollector.o(3690);
            return true;
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(47089);
    }
}
