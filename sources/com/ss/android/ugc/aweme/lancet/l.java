package com.ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f107235a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f107236b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f107237c;

    static {
        Covode.recordClassIndex(68586);
    }

    l(WeakReference weakReference, Activity activity, ImageView imageView) {
        this.f107235a = weakReference;
        this.f107236b = activity;
        this.f107237c = imageView;
    }

    public final void run() {
        WeakReference weakReference = this.f107235a;
        Activity activity = this.f107236b;
        ImageView imageView = this.f107237c;
        try {
            ImageView imageView2 = (ImageView) weakReference.get();
            if (imageView2 != null && imageView2.getDrawable() != null && !v.y(imageView2)) {
                StringBuffer stringBuffer = new StringBuffer("activity " + activity + " image " + imageView);
                stringBuffer.append(" leak!!!, image drawable is " + imageView.getDrawable());
                stringBuffer.append(", image background is " + imageView.getBackground());
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                imageView.setImageDrawable(null);
                if (imageView.getBackground() != null) {
                    try {
                        imageView.getBackground().setCallback(null);
                        imageView.setBackgroundDrawable(null);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
