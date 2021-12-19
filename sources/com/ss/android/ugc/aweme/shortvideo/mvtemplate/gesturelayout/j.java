package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Rect;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f129294a = new a((byte) 0);

    static {
        Covode.recordClassIndex(84870);
    }

    /* access modifiers changed from: protected */
    public abstract View c();

    public static final class a {
        static {
            Covode.recordClassIndex(84871);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Rect b() {
        View c2 = c();
        if (c2 == null || !v.y(c2)) {
            return null;
        }
        Rect rect = new Rect();
        c2.getGlobalVisibleRect(rect);
        return rect;
    }

    public final Rect a() {
        View c2 = c();
        if (c2 == null || !v.y(c2)) {
            return null;
        }
        int[] iArr = new int[2];
        c2.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new Rect(i2, i3, (int) (((float) i2) + (((float) c2.getWidth()) * c2.getScaleX())), (int) (((float) i3) + (((float) c2.getHeight()) * c2.getScaleY())));
    }
}
