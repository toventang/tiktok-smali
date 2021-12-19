package com.ss.android.ugc.aweme.ck;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;

public final class i implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71135a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43782);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        String str2 = null;
        if (routeIntent == null || (uri2 = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri2.getHost();
        }
        if (l.a((Object) str, (Object) "feedback_input")) {
            return true;
        }
        if (!(routeIntent == null || (uri = routeIntent.getUri()) == null)) {
            str2 = uri.getHost();
        }
        if (l.a((Object) str2, (Object) "i18n_feedback_input")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            l.b(feedbackConf, "");
            u a2 = u.a(feedbackConf.getFeHelp());
            if (routeIntent != null) {
                str = routeIntent.getOriginUrl();
            } else {
                str = null;
            }
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            for (String str2 : parse.getQueryParameterNames()) {
                a2.a(str2, parse.getQueryParameter(str2));
            }
            t.a(t.a(), a2.f71178a.a());
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
