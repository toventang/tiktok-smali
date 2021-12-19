package com.ss.android.ugc.aweme.photo;

import android.os.Environment;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final String f114835a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleDateFormat f114836b;

    static {
        Covode.recordClassIndex(73871);
    }

    public a() {
        File file = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera/");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f114835a = file.getAbsolutePath();
        this.f114836b = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    @Override // com.ss.android.ugc.aweme.photo.s
    public final String a() {
        return com.a.a(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.f114835a, this.f114836b.format(new Date())});
    }
}
