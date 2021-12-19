package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private View f136005a;

    static {
        Covode.recordClassIndex(88854);
    }

    public final void dismiss() {
        super.dismiss();
        View view = this.f136005a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void show() {
        super.show();
        View view = this.f136005a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, R.style.gf);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aif);
        this.f136005a = findViewById(R.id.ci9);
        Window window = getWindow();
        if (window != null) {
            l.b(window, "");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
            Paint paint = shapeDrawable.getPaint();
            l.b(paint, "");
            paint.setColor(0);
            window.setBackgroundDrawable(shapeDrawable);
        }
        setCanceledOnTouchOutside(false);
    }
}
