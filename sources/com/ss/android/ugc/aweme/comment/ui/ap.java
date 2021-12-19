package com.ss.android.ugc.aweme.comment.ui;

import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72528a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f72529b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72530c;

    static {
        Covode.recordClassIndex(44695);
    }

    ap(k kVar, Aweme aweme, boolean z) {
        this.f72528a = kVar;
        this.f72529b = aweme;
        this.f72530c = z;
    }

    public final void run() {
        k kVar = this.f72528a;
        Aweme aweme = this.f72529b;
        boolean z = this.f72530c;
        e activity = kVar.getActivity();
        String enterFrom = kVar.f72763b.getEnterFrom();
        aq aqVar = new aq(kVar, z, aweme);
        l.d(activity, "");
        l.d(aweme, "");
        l.d(enterFrom, "");
        l.d(aqVar, "");
        com.ss.android.ugc.aweme.comment.gift.e eVar = new com.ss.android.ugc.aweme.comment.gift.e(activity, aweme, enterFrom, aqVar);
        Window window = eVar.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.flags = attributes.flags | 2 | 32 | 262144;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.drawable.lw);
        }
        eVar.show();
    }
}
