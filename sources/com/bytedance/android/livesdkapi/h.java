package com.bytedance.android.livesdkapi;

import com.bytedance.android.live.network.model.c;
import com.bytedance.android.livesdk.livesetting.other.NetMonitorBlockListSettings;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public final /* synthetic */ class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f23208a = new h();

    static {
        Covode.recordClassIndex(13769);
    }

    private h() {
    }

    @Override // com.bytedance.android.live.network.model.c
    public final List a() {
        return Arrays.asList(NetMonitorBlockListSettings.INSTANCE.getValue());
    }
}
