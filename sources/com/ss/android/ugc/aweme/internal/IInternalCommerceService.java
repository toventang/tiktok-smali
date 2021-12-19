package com.ss.android.ugc.aweme.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.LinkedHashMap;

public interface IInternalCommerceService {
    static {
        Covode.recordClassIndex(67179);
    }

    UrlModel a(String str);

    void a(int i2);

    void a(String str, String str2);

    boolean a();

    boolean a(Context context, String str, TextView textView, Boolean bool, String str2);

    boolean a(Music music);

    boolean b();

    void c();

    LinkedHashMap<String, Bitmap> d();

    boolean e();

    boolean f();

    void g();
}
