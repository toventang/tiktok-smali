package com.ss.android.ugc.aweme.profile;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f116613a;

    static {
        Covode.recordClassIndex(75338);
    }

    q(k kVar) {
        this.f116613a = kVar;
    }

    public final void run() {
        e activity = this.f116613a.getActivity();
        if (activity != null) {
            ScrollSwitchStateManager.a.a(activity).a(false);
        }
    }
}
