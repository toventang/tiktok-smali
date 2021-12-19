package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.lancet.k;
import com.zhiliaoapp.musically.R;

public class MusAvatarWithBorderView extends AvatarImageView {
    static {
        Covode.recordClassIndex(75430);
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public final void d() {
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).a(((a) getHierarchy()).f47454a);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CircleImageView, com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, com.ss.android.ugc.aweme.base.ui.AvatarImageView
    public final void a() {
        super.a();
        if (((a) getHierarchy()).f47454a != null) {
            ((a) getHierarchy()).f47454a.c(n.b(getContext(), 1.0f));
            ((a) getHierarchy()).f47454a.f47480f = b.c(getContext(), R.color.f159926j);
            ((a) getHierarchy()).f47454a.d(n.b(getContext(), 1.0f));
        }
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

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
