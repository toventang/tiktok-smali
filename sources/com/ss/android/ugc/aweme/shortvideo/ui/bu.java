package com.ss.android.ugc.aweme.shortvideo.ui;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.property.dc;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.data.a;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.gamora.editor.subtitle.d;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.ugc.tools.utils.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VEVideoPublishPreviewActivity f131554a;

    static {
        Covode.recordClassIndex(86162);
    }

    bu(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.f131554a = vEVideoPublishPreviewActivity;
    }

    public final void run() {
        float width;
        int b2;
        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.f131554a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.f131175g.getLayoutParams();
        if (vEVideoPublishPreviewActivity.t.getVideoWidth() == null || vEVideoPublishPreviewActivity.t.getVideoWidth().intValue() == 0) {
            width = ((float) vEVideoPublishPreviewActivity.f131175g.getWidth()) * 1.0f;
            b2 = dh.b(b.a());
        } else {
            width = ((float) vEVideoPublishPreviewActivity.f131175g.getWidth()) * 1.0f;
            b2 = vEVideoPublishPreviewActivity.t.getVideoWidth().intValue();
        }
        float f2 = width / ((float) b2);
        q.d("renderCaption surface width " + vEVideoPublishPreviewActivity.f131175g.getWidth());
        float height = (float) ((vEVideoPublishPreviewActivity.f131175g.getHeight() - vEVideoPublishPreviewActivity.f131174f.w.b().height) / 2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vEVideoPublishPreviewActivity.s.getLayoutParams();
        int i2 = d.t;
        int i3 = d.s;
        int i4 = d.r;
        if (vEVideoPublishPreviewActivity.t.getMarginStart() != null && vEVideoPublishPreviewActivity.t.getMarginStart().intValue() > 0) {
            i2 = vEVideoPublishPreviewActivity.t.getMarginStart().intValue();
            i3 = vEVideoPublishPreviewActivity.t.getMarginTop().intValue();
            i4 = vEVideoPublishPreviewActivity.t.getMarginBottom().intValue();
        }
        if (vEVideoPublishPreviewActivity.t.getLocation() == a.LEFT_BOTTOM.getValue()) {
            layoutParams2.gravity = 80;
            if (dc.b()) {
                layoutParams2.bottomMargin = (int) (vEVideoPublishPreviewActivity.f131178j.getBottomMarginForCaptionSticker() + r.a(vEVideoPublishPreviewActivity, 8.0f));
            } else {
                layoutParams2.bottomMargin = (int) ((((((float) vEVideoPublishPreviewActivity.p.getHeight()) + height) - ((float) layoutParams.topMargin)) - ((float) layoutParams.height)) + (((float) i4) * f2));
            }
        } else {
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = (int) (height + ((float) layoutParams.topMargin) + (((float) i3) * f2));
        }
        if (gb.a()) {
            layoutParams2.rightMargin = (int) (((float) layoutParams.rightMargin) + (((float) i2) * f2));
        } else {
            layoutParams2.leftMargin = (int) (((float) layoutParams.leftMargin) + (((float) i2) * f2));
        }
        vEVideoPublishPreviewActivity.s.bringToFront();
        vEVideoPublishPreviewActivity.s.setLayoutParams(layoutParams2);
        vEVideoPublishPreviewActivity.f131174f.w.a(new bw(vEVideoPublishPreviewActivity));
    }
}
