package com.ss.android.ugc.aweme.im.sdk.notification.a;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.service.e;
import com.ss.android.ugc.aweme.inbox.a.a;
import com.ss.android.ugc.aweme.utils.cy;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    int f102858a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Integer> f102859b;

    /* renamed from: c  reason: collision with root package name */
    private final g f102860c;

    static {
        Covode.recordClassIndex(65949);
    }

    public final boolean a() {
        if (this.f102858a == 2) {
            return true;
        }
        return false;
    }

    private final int b() {
        if (a.e()) {
            return 2;
        }
        n a2 = n.a();
        l.b(a2, "");
        if (!a2.k() || a(com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a()) || this.f102859b.containsValue(2)) {
            return 2;
        }
        e b2 = b.b();
        if (b2 == null || !b2.canShowInnerNotification() || this.f102859b.containsValue(1)) {
            return 1;
        }
        return 0;
    }

    public h(g gVar) {
        l.d(gVar, "");
        this.f102860c = gVar;
        this.f102859b = new LinkedHashMap();
        this.f102858a = 2;
        this.f102858a = b();
    }

    private static boolean a(Activity activity) {
        Fragment fragment;
        if ((activity instanceof com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b) || (activity instanceof com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.a) || (activity instanceof GroupChatDetailActivity)) {
            return true;
        }
        if (activity != null) {
            fragment = cy.a(activity);
        } else {
            fragment = null;
        }
        if (fragment instanceof SessionListFragment) {
            return true;
        }
        return false;
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        if (i2 == 0) {
            this.f102859b.remove(str);
        } else {
            this.f102859b.put(str, Integer.valueOf(i2));
        }
        int b2 = b();
        if (this.f102858a != b2) {
            this.f102858a = b2;
            this.f102860c.a(b2);
        }
    }
}
