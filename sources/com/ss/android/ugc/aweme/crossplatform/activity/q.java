package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MixActivityContainer f78560a;

    static {
        Covode.recordClassIndex(48788);
    }

    q(MixActivityContainer mixActivityContainer) {
        this.f78560a = mixActivityContainer;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MixActivityContainer mixActivityContainer = this.f78560a;
        MixActivityContainer.a aVar = (MixActivityContainer.a) obj;
        if (aVar.f78526b && com.bytedance.ies.ugc.appcontext.f.f34637l) {
            aVar.f78525a.h();
        }
        Activity activity = aVar.f78527c.get();
        if (mixActivityContainer.p && activity != null && (activity instanceof CrossPlatformActivity)) {
            if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                r.a("exit_referral_new_user_guide", new d().a("stay_time", mixActivityContainer.f78512h).a("exit_method", "background").f66730a);
            } else {
                r.a("exit_referral_new_user_guide", new d().a("stay_time", mixActivityContainer.f78512h).a("exit_method", "dismiss").f66730a);
            }
        }
        if (mixActivityContainer.f78513i != null) {
            mixActivityContainer.f78513i.dispose();
        }
    }
}
