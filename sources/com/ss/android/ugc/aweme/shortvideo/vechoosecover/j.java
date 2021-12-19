package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.editSticker.text.bean.o;
import com.ss.android.ugc.aweme.shortvideo.cover.b;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ChooseCoverActivity.a f132552a;

    /* renamed from: b  reason: collision with root package name */
    private final b f132553b;

    static {
        Covode.recordClassIndex(86750);
    }

    j(ChooseCoverActivity.a aVar, b bVar) {
        this.f132552a = aVar;
        this.f132553b = bVar;
    }

    public final void run() {
        boolean z;
        ChooseCoverActivity.a aVar = this.f132552a;
        b bVar = this.f132553b;
        e activity = bVar.getActivity();
        if (!bVar.isDetached() && activity != null && !activity.isFinishing()) {
            int c2 = androidx.core.content.b.c(ChooseCoverActivity.this, R.color.f159921e);
            int measuredHeight = bVar.f125233d.getMeasuredHeight();
            int measuredHeight2 = bVar.f125236g.getMeasuredHeight() + bVar.f125237h.getMeasuredHeight();
            int measuredHeight3 = bVar.f125234e.getMeasuredHeight();
            int d2 = dh.d(activity);
            ChooseCoverActivity.this.f132504e.w.b(c2);
            int e2 = dh.e(bVar.getActivity());
            int width = ChooseCoverActivity.this.f132506g.getWidth();
            VESize b2 = ChooseCoverActivity.this.f132504e.w.b();
            float f2 = (float) b2.height;
            float f3 = ((float) b2.width) / f2;
            float f4 = (float) width;
            float f5 = (float) measuredHeight3;
            if (f3 > f4 / f5) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, (float) ((int) (f4 / f3)));
                ofFloat.setDuration(0L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new k(aVar, f3, e2, d2, measuredHeight2, measuredHeight));
                ofFloat.start();
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f5);
                ofFloat2.setDuration(0L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.addUpdateListener(new l(aVar, f3, width, measuredHeight));
                ofFloat2.start();
            }
            ChooseCoverActivity.this.f132504e.w.a(false);
            float f6 = ((float) b2.width) / ((float) b2.height);
            int width2 = bVar.f125235f.getWidth();
            int height = bVar.f125235f.getHeight();
            float f7 = (float) width2;
            float f8 = (float) height;
            int i2 = -1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f125235f.getLayoutParams();
            float f9 = 1.0f;
            if (f6 > f7 / f8) {
                layoutParams.width = width2;
                layoutParams.height = ((int) (f7 / f6)) + 2;
                i2 = (height * 9) / 16;
                z = false;
            } else {
                float f10 = ((float) ((int) (f6 * f8))) / f7;
                if (f10 != 0.0f && !Float.isNaN(f10) && !Float.isInfinite(f10)) {
                    f9 = f10;
                }
                layoutParams.height = (int) (f8 / f9);
                z = true;
            }
            bVar.f125235f.setLayoutParams(layoutParams);
            bVar.f125235f.setScaleX(f9);
            bVar.f125235f.setScaleY(f9);
            bVar.f125235f.setTag(new o(z, f9, i2));
            if (!ChooseCoverActivity.this.f132503d.isMvThemeVideoType() || SettingsManager.a().a("enable_mv_type_video_show_last_chosen_cover", true)) {
                float j2 = (ChooseCoverActivity.this.f132503d.mVideoCoverStartTm * 1000.0f) / ((float) ChooseCoverActivity.this.f132504e.w.j());
                b bVar2 = ChooseCoverActivity.this.f132505f;
                bVar2.u = true;
                bVar2.a(j2, false);
                if (j2 != 0.0f) {
                    bVar2.f125241l.c().getCoverPublishModel().setVideoCoverViewX((((float) bVar2.f125230a.getWidth()) - bVar2.f125230a.getOneThumbWidth()) * j2);
                }
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = bVar2.f125230a;
                chooseVideoCoverViewV2.f132773a.setX(bVar2.f125241l.c().getCoverPublishModel().getVideoCoverViewX());
            }
        }
    }
}
