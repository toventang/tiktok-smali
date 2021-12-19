package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.a.m;
import h.z;
import java.io.File;
import java.util.List;

public interface IProfileNaviService {

    public static final class a {
        static {
            Covode.recordClassIndex(38389);
        }
    }

    static {
        Covode.recordClassIndex(38388);
    }

    bu a(Activity activity, String str);

    void a(int i2, int i3, m<? super Integer, ? super List<? extends bt>, z> mVar);

    void a(Activity activity, View view, String str);

    void a(Activity activity, View view, String str, String str2);

    void a(Activity activity, String str, Bitmap bitmap, b<? super File, z> bVar);

    void b(Activity activity, View view, String str);
}
