package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;

public class LiveLoadingView extends DmtLoadingLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f22499a;

    static {
        Covode.recordClassIndex(13276);
    }

    public LiveLoadingView(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout
    public void setVisibility(int i2) {
        if (getContext() != null) {
            super.setVisibility(i2);
            this.f22499a = i2;
        }
    }

    public LiveLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this) {
            return;
        }
        if (i2 != 0) {
            super.setVisibility(8);
        } else {
            super.setVisibility(this.f22499a);
        }
    }

    private LiveLoadingView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (byte) 0);
        setVisibility(getVisibility());
    }
}
