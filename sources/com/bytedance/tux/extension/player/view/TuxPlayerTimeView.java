package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class TuxPlayerTimeView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    HashMap f44991g;

    static {
        Covode.recordClassIndex(27459);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        l.c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerTimeView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        a.a(LayoutInflater.from(getContext()), R.layout.bjs, this, true);
    }
}
