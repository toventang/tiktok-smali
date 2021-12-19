package com.bytedance.android.livesdk.r;

import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final DataChannel f20564a;

    /* renamed from: b  reason: collision with root package name */
    u f20565b;

    /* renamed from: c  reason: collision with root package name */
    final f.a.b.a f20566c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    a f20567d;

    public interface a {
        static {
            Covode.recordClassIndex(12144);
        }

        void a(u uVar);
    }

    static {
        Covode.recordClassIndex(12143);
    }

    public g(DataChannel dataChannel) {
        this.f20564a = dataChannel;
        l.DUMMY_FAST_GIFT.hide(dataChannel);
        this.f20565b = null;
    }
}
