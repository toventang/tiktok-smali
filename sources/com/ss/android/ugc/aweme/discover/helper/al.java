package com.ss.android.ugc.aweme.discover.helper;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static final al f81091a = new al();

    private al() {
    }

    public static final class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f81092a = 2.0f;

        static {
            Covode.recordClassIndex(50399);
        }

        a() {
        }

        public final void getOutline(View view, Outline outline) {
            l.d(view, "");
            l.d(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), n.b(view.getContext(), this.f81092a));
        }
    }

    static {
        Covode.recordClassIndex(50398);
    }

    public static void a(View view) {
        l.d(view, "");
        if (Build.VERSION.SDK_INT >= 21 && view.getContext() != null) {
            view.setOutlineProvider(new a());
            view.setClipToOutline(true);
        }
    }
}
