package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class am extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f127129a;

    static {
        Covode.recordClassIndex(83396);
    }

    public final void onBackPressed() {
    }

    public final void dismiss() {
        super.dismiss();
        a(false);
    }

    public final void show() {
        super.show();
        a(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am(Context context) {
        super(context, R.style.gf);
        l.d(context, "");
    }

    private final void a(boolean z) {
        MethodCollector.i(3637);
        if (z) {
            ImageView imageView = this.f127129a;
            if (imageView != null) {
                imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.e6));
                MethodCollector.o(3637);
                return;
            }
            MethodCollector.o(3637);
            return;
        }
        ImageView imageView2 = this.f127129a;
        if (imageView2 != null) {
            imageView2.clearAnimation();
            MethodCollector.o(3637);
            return;
        }
        MethodCollector.o(3637);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ai_);
        this.f127129a = (ImageView) findViewById(R.id.byw);
        Window window = getWindow();
        if (window == null) {
            l.b();
        }
        l.b(window, "");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            l.b();
        }
        l.b(window2, "");
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        l.b(paint, "");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            l.b();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(false);
    }
}
