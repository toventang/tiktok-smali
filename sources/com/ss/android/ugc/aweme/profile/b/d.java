package com.ss.android.ugc.aweme.profile.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f116045a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(74862);
    }

    public static String a() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            return createIUserServicebyMonsterPlugin.getCurrentUserID();
        }
        return null;
    }
}
