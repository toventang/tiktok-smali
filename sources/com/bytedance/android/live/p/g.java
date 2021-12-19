package com.bytedance.android.live.p;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

public interface g {
    static {
        Covode.recordClassIndex(6672);
    }

    View a(l lVar);

    void a();

    void a(l lVar, int i2);

    void a(l lVar, DataChannel dataChannel);

    void a(l lVar, DataChannel dataChannel, f fVar);

    void a(l lVar, DataChannel dataChannel, boolean z);

    void a(o oVar, DataChannel dataChannel);

    void a(DataChannel dataChannel);

    void a(DataChannel dataChannel, LinearLayout linearLayout, List<? extends l> list, q qVar, o oVar);

    void a(DataChannel dataChannel, List<l> list, q qVar, o oVar);

    void b(l lVar, DataChannel dataChannel);

    void b(l lVar, DataChannel dataChannel, boolean z);

    void b(DataChannel dataChannel, LinearLayout linearLayout, List<l> list, q qVar, o oVar);

    void c(l lVar, DataChannel dataChannel);

    boolean d(l lVar, DataChannel dataChannel);

    void e(l lVar, DataChannel dataChannel);

    void f(l lVar, DataChannel dataChannel);
}
