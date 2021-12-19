package com.ss.android.ugc.aweme.services.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.utils.iq;
import h.f.b.l;

public abstract class ShortVideoConfigBaseImpl implements IShortVideoConfig {
    static {
        Covode.recordClassIndex(79586);
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxDuetVideoTime() {
        return 60500;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxRecordingTime() {
        return 15000;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public long maxStitchVideoTime() {
        return 60000;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isHookLibrary() {
        return iq.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean isRecording() {
        return c.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public boolean getUsingOnline() {
        return l.a((Object) b.a().a(true, "localtest_effect_inhouse_property", "1,2,3,4,5"), (Object) "");
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public void enableHookLibrary(boolean z) {
        iq.a(z);
    }
}
