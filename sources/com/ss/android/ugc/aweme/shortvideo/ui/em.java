package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class em implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f131725b;

    static {
        Covode.recordClassIndex(86269);
    }

    em(cj cjVar, String str) {
        this.f131724a = cjVar;
        this.f131725b = str;
    }

    public final void run() {
        cj cjVar = this.f131724a;
        String str = this.f131725b;
        int width = cjVar.u.getWidth();
        Bitmap a2 = d.a(str, width, (int) (((float) width) / ((((float) cjVar.K.videoWidth()) * 1.0f) / ((float) cjVar.K.videoHeight()))));
        if (a2 != null && cjVar.isAdded()) {
            cjVar.u.setImageDrawable(androidx.core.graphics.drawable.d.a(cjVar.requireActivity().getResources(), cjVar.K.getCoverPublishModel().getEffectTextModel().mergeCoverText(a2)));
        }
    }
}
