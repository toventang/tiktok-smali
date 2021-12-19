package com.ss.android.ugc.aweme.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.i;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.aweme.setting.model.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements by.a {

    /* renamed from: a  reason: collision with root package name */
    static final by.a f109031a = new k();

    static {
        Covode.recordClassIndex(69820);
    }

    private k() {
    }

    @Override // com.ss.android.ugc.aweme.setting.by.a
    public final void a(d dVar) {
        i k2 = LiveOuterService.s().k();
        if (k2 != null && k2.a() != null) {
            k2.a().a(SettingsManager.a().a("can_be_live_podcast", false));
        }
    }
}
