package com.ss.android.ugc.aweme.kids.homepage.bottomview;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final HomeBottomTabView f106567a;

    /* renamed from: b  reason: collision with root package name */
    private final String f106568b;

    /* renamed from: c  reason: collision with root package name */
    private final String f106569c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f106570d = false;

    static {
        Covode.recordClassIndex(68093);
    }

    f(HomeBottomTabView homeBottomTabView, String str, String str2) {
        this.f106567a = homeBottomTabView;
        this.f106568b = str;
        this.f106569c = str2;
    }

    public final void run() {
        HomeBottomTabView homeBottomTabView = this.f106567a;
        String str = this.f106568b;
        String str2 = this.f106569c;
        if (str2 == null) {
            str2 = "homepage_hot";
        }
        if (!TextUtils.equals(str, str2)) {
            if (homeBottomTabView.f106542c != null) {
                homeBottomTabView.f106542c.a(homeBottomTabView.f106541b, str);
            }
            if (!TextUtils.equals(str, "tab_publish")) {
                homeBottomTabView.a(str);
                homeBottomTabView.f106541b = str;
            }
        }
    }
}
