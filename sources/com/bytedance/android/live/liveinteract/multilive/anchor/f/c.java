package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import i.a.a.a.a.b;

public final class c extends g {
    static {
        Covode.recordClassIndex(6333);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd5;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final int b() {
        return R.layout.bcw;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.GRID_FIX;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        l.d(view, "");
        ViewGroup viewGroup = this.f11783d;
        if (viewGroup == null) {
            return -1;
        }
        int c2 = c(i2);
        int i3 = 3;
        if (c2 == 1) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d63);
            l.b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.avx);
            l.b(frameLayout2, "");
            a(frameLayout, frameLayout2, view);
            i3 = 1;
        } else if (c2 == 2) {
            FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d64);
            l.b(frameLayout3, "");
            FrameLayout frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.avy);
            l.b(frameLayout4, "");
            a(frameLayout3, frameLayout4, view);
            i3 = 2;
        } else if (c2 != 3) {
            i3 = super.a(view, i2);
        } else {
            FrameLayout frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d65);
            l.b(frameLayout5, "");
            FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.avz);
            l.b(frameLayout6, "");
            a(frameLayout5, frameLayout6, view);
        }
        p();
        return i3;
    }

    private static void a(ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        MethodCollector.i(7428);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, o());
            b.a(viewGroup2);
        }
        MethodCollector.o(7428);
    }
}
