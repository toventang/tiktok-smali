package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.facebook.imagepipeline.common.d;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;

public class AvatarWithBorderView extends CircleImageView {

    /* renamed from: b  reason: collision with root package name */
    private d f127768b;

    static {
        Covode.recordClassIndex(83743);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    @Override // com.ss.android.ugc.tools.view.widget.CircleImageView
    public final void a() {
        super.a();
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c(n.b(getContext(), 1.0f));
            ((a) getHierarchy()).f47454a.f47480f = b.c(getContext(), R.color.f159928l);
            ((a) getHierarchy()).f47454a.d(n.b(getContext(), 1.0f));
        }
    }

    public void setResizeOptions(d dVar) {
        this.f127768b = dVar;
    }

    public void setBorderColor(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.f47480f = b.c(getContext(), i2);
        }
    }

    public void setBorderWidth(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c(n.b(getContext(), (float) i2));
        }
    }

    public void setBorderWidthPx(int i2) {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c((float) i2);
        }
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
