package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.graphics.Point;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity f132529a;

    /* renamed from: b  reason: collision with root package name */
    private final NormalTrackTimeStamp f132530b;

    /* renamed from: c  reason: collision with root package name */
    private final int f132531c;

    /* renamed from: d  reason: collision with root package name */
    private final float f132532d;

    /* renamed from: e  reason: collision with root package name */
    private final int f132533e;

    /* renamed from: f  reason: collision with root package name */
    private final View f132534f;

    /* renamed from: g  reason: collision with root package name */
    private final int f132535g;

    /* renamed from: h  reason: collision with root package name */
    private final int f132536h;

    /* renamed from: i  reason: collision with root package name */
    private final int f132537i;

    static {
        Covode.recordClassIndex(86745);
    }

    e(ChooseCoverActivity chooseCoverActivity, NormalTrackTimeStamp normalTrackTimeStamp, int i2, float f2, int i3, View view, int i4, int i5, int i6) {
        this.f132529a = chooseCoverActivity;
        this.f132530b = normalTrackTimeStamp;
        this.f132531c = i2;
        this.f132532d = f2;
        this.f132533e = i3;
        this.f132534f = view;
        this.f132535g = i4;
        this.f132536h = i5;
        this.f132537i = i6;
    }

    public final void run() {
        ChooseCoverActivity chooseCoverActivity = this.f132529a;
        NormalTrackTimeStamp normalTrackTimeStamp = this.f132530b;
        int i2 = this.f132531c;
        float f2 = this.f132532d;
        int i3 = this.f132533e;
        View view = this.f132534f;
        int i4 = this.f132535g;
        int i5 = this.f132536h;
        int i6 = this.f132537i;
        float f3 = (float) i2;
        Point point = new Point((int) (normalTrackTimeStamp.getX() * f3 * f2), (int) (normalTrackTimeStamp.getY() * ((float) i3) * f2));
        view.setX(((float) ((chooseCoverActivity.f132506g.getLeft() + i4) + point.x)) - (((float) view.getWidth()) / 2.0f));
        if (chooseCoverActivity.f132503d.notUseCanvasSize()) {
            float width = ((((float) chooseCoverActivity.f132506g.getWidth()) * 1.0f) / ((float) chooseCoverActivity.f132503d.mVideoCanvasWidth)) * ((float) chooseCoverActivity.f132503d.mVideoCanvasHeight);
            view.setY((((normalTrackTimeStamp.getY() * width) + ((((float) chooseCoverActivity.f132506g.getHeight()) - width) / 2.0f)) - (((((float) chooseCoverActivity.f132506g.getHeight()) / 2.0f) - ((float) i5)) - (((float) i6) / 2.0f))) - (((float) view.getHeight()) / 2.0f));
        } else {
            view.setY(((float) ((chooseCoverActivity.f132506g.getTop() + i5) + point.y)) - (((float) view.getHeight()) / 2.0f));
        }
        view.setRotation(normalTrackTimeStamp.getRotation());
        float width2 = (normalTrackTimeStamp.getWidth() * f3) / (normalTrackTimeStamp.getScale().floatValue() * ((float) view.getWidth()));
        view.setScaleX(normalTrackTimeStamp.getScale().floatValue() * f2 * width2);
        view.setScaleY(normalTrackTimeStamp.getScale().floatValue() * f2 * width2);
        view.setVisibility(0);
    }
}
