package com.ss.android.ugc.aweme.shortvideo.transition;

import android.graphics.Bitmap;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class VideoCoverBitmapHolder implements au {

    /* renamed from: a  reason: collision with root package name */
    public static Bitmap f131084a;

    static {
        Covode.recordClassIndex(85902);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        if (f131084a != null) {
            f131084a = null;
        }
    }
}
