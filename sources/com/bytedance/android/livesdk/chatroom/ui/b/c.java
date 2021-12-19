package com.bytedance.android.livesdk.chatroom.ui.b;

import android.os.SystemClock;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static long f15928a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f15929b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f15930c = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(8812);
    }

    public static void a(DataChannel dataChannel, av avVar) {
        if (avVar != null && f15928a > 0) {
            b.a.a("livesdk_live_prop_use_time").a(dataChannel).d("live_take_detail").a("prop_type", avVar.f19005g).a("words", avVar.f19002d).a("prop_id", avVar.f19006h).a("live_type", "video_live").a("use_time", SystemClock.elapsedRealtime() - f15928a).b();
        }
    }
}
