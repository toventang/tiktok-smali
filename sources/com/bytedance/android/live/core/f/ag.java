package com.bytedance.android.live.core.f;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

public final class ag {
    static {
        Covode.recordClassIndex(4613);
    }

    static class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        private float f9047a;

        static {
            Covode.recordClassIndex(4614);
        }

        private a(float f2) {
            this.f9047a = f2;
        }

        /* synthetic */ a(float f2, byte b2) {
            this(f2);
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom()), this.f9047a);
        }
    }

    static class b extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        private float f9048a;

        /* renamed from: b  reason: collision with root package name */
        private int f9049b;

        static {
            Covode.recordClassIndex(4615);
        }

        /* synthetic */ b(float f2) {
            this(f2, 1);
        }

        private b(float f2, int i2) {
            this.f9049b = 1;
            this.f9048a = f2;
        }

        public final void getOutline(View view, Outline outline) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int width = view.getWidth() - view.getPaddingRight();
            int height = view.getHeight() - view.getPaddingBottom();
            int i2 = this.f9049b;
            if (i2 == 1) {
                height = (int) (((float) height) + this.f9048a);
            } else if (i2 == 2) {
                paddingTop = (int) (((float) paddingTop) - this.f9048a);
            } else if (i2 == 3) {
                paddingLeft = (int) (((float) paddingLeft) - this.f9048a);
            } else if (i2 == 4) {
                width = (int) (((float) width) + this.f9048a);
            }
            outline.setRoundRect(new Rect(paddingLeft, paddingTop, width, height), this.f9048a);
        }
    }

    public static void a(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new a((float) i2, (byte) 0));
            view.setClipToOutline(true);
        }
    }

    public static void b(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new b((float) i2));
            view.setClipToOutline(true);
        }
    }
}
