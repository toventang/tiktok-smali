package com.ss.android.ugc.aweme.utils;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class az {
    static {
        Covode.recordClassIndex(93321);
    }

    public static void a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i2, int i3, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        float dimension;
        float b2;
        int i4;
        ValueAnimator ofInt;
        ValueAnimator ofInt2;
        if (z2) {
            dimension = n.b(imageView.getContext(), 20.0f);
        } else {
            dimension = imageView.getResources().getDimension(R.dimen.jm);
        }
        int i5 = (int) dimension;
        if (z2) {
            b2 = n.b(imageView.getContext(), 12.0f);
        } else {
            b2 = n.b(imageView.getContext(), 0.0f);
        }
        int i6 = (int) b2;
        int i7 = -180;
        if (z) {
            i4 = 0;
        } else {
            i4 = -180;
            i7 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", (float) i4, (float) i7);
        int[] iArr = new int[2];
        if (z) {
            iArr[0] = i5;
            iArr[1] = i6;
            ofInt = ValueAnimator.ofInt(iArr);
            ofInt2 = ValueAnimator.ofInt(i3, i2);
        } else {
            iArr[0] = i6;
            iArr[1] = i5;
            ofInt = ValueAnimator.ofInt(iArr);
            ofInt2 = ValueAnimator.ofInt(i2, i3);
        }
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new ba(viewGroup, z2));
        ofInt2.addUpdateListener(new bb(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofInt).with(ofInt2);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.setDuration(400L);
        animatorSet.start();
    }
}
