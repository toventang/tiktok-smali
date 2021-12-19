package com.ss.android.ugc.aweme;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public interface IChallengeDetailLegacyService {
    static {
        Covode.recordClassIndex(38372);
    }

    void a(Activity activity, Bundle bundle);

    void a(Context context, String str);

    void a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i2, int i3, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter);

    void a(ImageView imageView);

    void a(String str, String str2, String str3, boolean z);
}
