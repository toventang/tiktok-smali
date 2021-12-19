package com.ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.business.base.jira.IGoToFeedbackListener;
import com.bytedance.business.base.jira.IOnGetMoreParamsListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static IBusinessToolsService f142488a;

    /* renamed from: b  reason: collision with root package name */
    private static IOnGetMoreParamsListener f142489b = f.f142491a;

    /* renamed from: c  reason: collision with root package name */
    private static IGoToFeedbackListener f142490c = g.f142492a;

    static {
        Covode.recordClassIndex(93192);
    }

    public static IBusinessToolsService a() {
        if (f142488a == null) {
            try {
                f142488a = (IBusinessToolsService) ServiceManager.get().getService(IBusinessToolsService.class);
            } catch (IllegalArgumentException unused) {
                f142488a = null;
            }
        }
        return f142488a;
    }

    public static boolean b() {
        if (TextUtils.equals(d.s, "business") || TextUtils.equals(d.s, "release_outer_test")) {
            return true;
        }
        return false;
    }
}
