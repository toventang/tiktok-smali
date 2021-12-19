package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.dc;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131555a;

    /* renamed from: b  reason: collision with root package name */
    private final NormalTrackTimeStamp f131556b;

    /* renamed from: c  reason: collision with root package name */
    private final View f131557c;

    /* renamed from: d  reason: collision with root package name */
    private final View f131558d;

    static {
        Covode.recordClassIndex(86163);
    }

    bv(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity, NormalTrackTimeStamp normalTrackTimeStamp, View view, View view2) {
        this.f131555a = vEVideoPublishPreviewActivity;
        this.f131556b = normalTrackTimeStamp;
        this.f131557c = view;
        this.f131558d = view2;
    }

    public final void run() {
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131555a;
        NormalTrackTimeStamp normalTrackTimeStamp = this.f131556b;
        View view = this.f131557c;
        View view2 = this.f131558d;
        Point a2 = vEVideoPublishPreviewActivity.a(new PointF(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY()));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f131175g.getLayoutParams();
        view.setX(((float) (a2.x + layoutParams.leftMargin)) - (((float) view.getWidth()) / 2.0f));
        view.setY(((float) (a2.y + layoutParams.topMargin)) - (((float) view.getHeight()) / 2.0f));
        view.setRotation(normalTrackTimeStamp.getRotation());
        float floatValue = ((float) vEVideoPublishPreviewActivity.a(new PointF(normalTrackTimeStamp.getWidth(), normalTrackTimeStamp.getHeight())).x) / (normalTrackTimeStamp.getScale().floatValue() * ((float) view.getWidth()));
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * floatValue);
        view.bringToFront();
        view2.bringToFront();
        view.setVisibility(0);
        if (dc.b()) {
            vEVideoPublishPreviewActivity.k();
        }
    }
}
