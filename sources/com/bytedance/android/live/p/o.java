package com.bytedance.android.live.p;

import android.widget.LinearLayout;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.z;
import java.util.List;

public enum o {
    LEFT,
    RIGHT,
    POPUP;

    static {
        Covode.recordClassIndex(6682);
    }

    private static g a() {
        return ((h) a.a(h.class)).toolbarManager();
    }

    public final z release(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel);
        return z.f158842a;
    }

    public final z createHolder(DataChannel dataChannel, LinearLayout linearLayout, List<? extends l> list, q qVar) {
        l.d(linearLayout, "");
        l.d(list, "");
        l.d(qVar, "");
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(dataChannel, linearLayout, list, qVar, this);
        return z.f158842a;
    }

    public final z onVisibility(boolean z, DataChannel dataChannel, List<l> list, q qVar) {
        l.d(list, "");
        l.d(qVar, "");
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(dataChannel, list, qVar, this);
        return z.f158842a;
    }

    public final z refreshHolder(DataChannel dataChannel, LinearLayout linearLayout, List<l> list, q qVar) {
        l.d(linearLayout, "");
        l.d(list, "");
        l.d(qVar, "");
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.b(dataChannel, linearLayout, list, qVar, this);
        return z.f158842a;
    }
}
