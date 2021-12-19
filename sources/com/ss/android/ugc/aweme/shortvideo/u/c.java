package com.ss.android.ugc.aweme.shortvideo.u;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f131093a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f131094b;

    static {
        Covode.recordClassIndex(85907);
    }

    c(String str, Bitmap bitmap) {
        this.f131093a = str;
        this.f131094b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f131093a;
        Bitmap bitmap = this.f131094b;
        if (TextUtils.isEmpty(str) || bitmap == null) {
            return null;
        }
        com.ss.android.ugc.tools.utils.c.a(bitmap, new File(str), 60, Bitmap.CompressFormat.PNG);
        return null;
    }
}
