package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f102416a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(65564);
    }

    public static final boolean a(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.f124595i.getString("is_friend_private"), "true");
    }
}
