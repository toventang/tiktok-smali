package com.ss.android.ugc.aweme.editSticker.interact.view;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface e {
    static {
        Covode.recordClassIndex(55450);
    }

    float a(float f2);

    int a(PointF[] pointFArr, boolean z);

    int a(PointF[] pointFArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    PointF a(PointF[] pointFArr);

    PointF a(PointF[] pointFArr, float f2, float f3);

    void a(float f2, float f3, float f4);

    boolean a(PointF[] pointFArr, float f2);

    void b();

    boolean b(PointF[] pointFArr, float f2);

    boolean b(PointF[] pointFArr, float f2, float f3);

    void c();

    View getContentView();

    void setEnableFakeFeedView(boolean z);
}
