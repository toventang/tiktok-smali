package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;

public class a extends SimpleDraweeView {
    static {
        Covode.recordClassIndex(94620);
    }

    @Override // com.facebook.drawee.view.c
    public void setController(com.facebook.drawee.h.a aVar) {
        super.setController(aVar);
    }

    public final void a(boolean z) {
        try {
            com.facebook.drawee.h.a controller = getController();
            if (controller != null) {
                Animatable i2 = controller.i();
                if (i2 != null) {
                    if (z) {
                        i2.start();
                    } else {
                        i2.stop();
                    }
                }
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        boolean z = false;
        if (i2 == 0 && getVisibility() == 0) {
            z = true;
        }
        a(z);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.facebook.drawee.view.c
    public void onVisibilityChanged(View view, int i2) {
        boolean z;
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        a(z);
    }
}
