package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.a.b.e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.chatroom.backroom.RoomBackProgressView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class cp implements e {
    static {
        Covode.recordClassIndex(2006);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        int i2;
        MethodCollector.i(831);
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setAlpha(0.9f);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(context);
        liveAutoRtlImageView.setId(R.id.dpl);
        liveAutoRtlImageView.setImageResource(2131234696);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-2, (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            int i3 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar)) {
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.q = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar)) {
            aVar.f2051h = 0;
        }
        a.a(liveAutoRtlImageView);
        if (liveAutoRtlImageView.getParent() == null) {
            constraintLayout.addView(liveAutoRtlImageView, aVar);
        }
        HSImageView hSImageView = new HSImageView(context);
        hSImageView.setId(R.id.dpm);
        ConstraintLayout.a aVar2 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i4 = Build.VERSION.SDK_INT;
            aVar2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            int i5 = Build.VERSION.SDK_INT;
            aVar2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(aVar2)) {
            ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2054k = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.s = 0;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.p = R.id.dpl;
        }
        if (ConstraintLayout.a.class.isInstance(aVar2)) {
            aVar2.f2051h = 0;
        }
        a.a(hSImageView);
        if (hSImageView.getParent() == null) {
            constraintLayout.addView(hSImageView, aVar2);
        }
        RoomBackProgressView roomBackProgressView = new RoomBackProgressView(context);
        roomBackProgressView.setId(R.id.dpo);
        ConstraintLayout.a aVar3 = new ConstraintLayout.a((int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            i2 = R.id.dpm;
            aVar3.f2054k = R.id.dpm;
        } else {
            i2 = R.id.dpm;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.s = i2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.q = i2;
        }
        if (ConstraintLayout.a.class.isInstance(aVar3)) {
            aVar3.f2051h = i2;
        }
        a.a(roomBackProgressView);
        if (roomBackProgressView.getParent() == null) {
            constraintLayout.addView(roomBackProgressView, aVar3);
        }
        a.a(constraintLayout);
        constraintLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(constraintLayout);
        }
        MethodCollector.o(831);
        return constraintLayout;
    }
}
