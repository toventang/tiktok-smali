package com.ss.android.ugc.gamora.recorder.m;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.db;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f148073a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(97610);
    }

    public static final boolean a() {
        if (db.a() != 0) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (db.a() == 1) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (db.a() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!a() && videoPublishEditModel.getOriginal() == 1 && videoPublishEditModel.mShootMode == 14) {
            return true;
        }
        return false;
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f148074a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f148075b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f148076c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f148077d;

        static {
            Covode.recordClassIndex(97611);
        }

        a(TextView textView, int i2, int i3) {
            this.f148075b = textView;
            this.f148076c = i2;
            this.f148077d = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z = this.f148074a;
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (!z) {
                animatedFraction = 1.0f - animatedFraction;
            }
            TextView textView = this.f148075b;
            int i2 = this.f148076c;
            int i3 = this.f148077d;
            float f2 = ((float) ((i2 >> 24) & 255)) / 255.0f;
            float pow = (float) Math.pow((double) (((float) ((i2 >> 16) & 255)) / 255.0f), 2.2d);
            float pow2 = (float) Math.pow((double) (((float) ((i2 >> 8) & 255)) / 255.0f), 2.2d);
            float pow3 = (float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d);
            textView.setShadowLayer(8.0f, 0.0f, 1.0f, (h.g.a.a((f2 + (((((float) ((i3 >> 24) & 255)) / 255.0f) - f2) * animatedFraction)) * 255.0f) << 24) | (h.g.a.a(((float) Math.pow((double) (pow + ((((float) Math.pow((double) (((float) ((i3 >> 16) & 255)) / 255.0f), 2.2d)) - pow) * animatedFraction)), 0.45454545454545453d)) * 255.0f) << 16) | (h.g.a.a(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((i3 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * animatedFraction)), 0.45454545454545453d)) * 255.0f) << 8) | h.g.a.a(((float) Math.pow((double) (pow3 + (animatedFraction * (((float) Math.pow((double) (((float) (i3 & 255)) / 255.0f), 2.2d)) - pow3))), 0.45454545454545453d)) * 255.0f));
        }
    }

    public static ObjectAnimator a(TextView textView, int i2, int i3) {
        l.d(textView, "");
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        l.b(duration, "");
        duration.addUpdateListener(new a(textView, i2, i3));
        duration.setStartDelay(0);
        duration.start();
        return duration;
    }
}
