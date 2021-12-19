package com.bytedance.android.livesdk.envelope.b;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface a {
    static {
        Covode.recordClassIndex(9519);
    }

    void a();

    void a(DataChannel dataChannel, com.bytedance.android.livesdk.envelope.widget.a aVar);

    void a(String str);

    boolean b();

    boolean c();

    Room d();

    String e();
}
