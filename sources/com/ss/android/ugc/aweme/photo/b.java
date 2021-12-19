package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    static int f114837a;

    /* renamed from: b  reason: collision with root package name */
    String f114838b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap.CompressFormat f114839c = Bitmap.CompressFormat.PNG;

    /* renamed from: d  reason: collision with root package name */
    final SimpleDateFormat f114840d;

    static {
        Covode.recordClassIndex(73874);
    }

    public b() {
        File file = new File(AVServiceImpl.a().shortVideoDir(), UGCMonitor.TYPE_PHOTO);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f114838b = file.getAbsolutePath();
        this.f114840d = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    @Override // com.ss.android.ugc.aweme.photo.s
    public final String a() {
        String str;
        if (this.f114839c == Bitmap.CompressFormat.JPEG) {
            str = ".jpeg";
        } else {
            str = ".png";
        }
        Locale locale = Locale.getDefault();
        String concat = "%s/IMG_%s".concat(str);
        StringBuilder append = new StringBuilder().append(this.f114840d.format(new Date())).append("_");
        int i2 = f114837a + 1;
        f114837a = i2;
        return a.a(locale, concat, new Object[]{this.f114838b, append.append(i2).toString()});
    }
}
