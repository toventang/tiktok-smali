package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Locale;

public interface ICrossPlatformLegacyService {
    static {
        Covode.recordClassIndex(38373);
    }

    <T> T a(Object obj, Class<T> cls);

    String a(String str);

    void a();

    void a(Activity activity, Uri.Builder builder);

    void a(Activity activity, View view, float f2, String... strArr);

    void a(Activity activity, String str);

    void a(Context context, Aweme aweme, String str);

    boolean a(Context context);

    boolean a(Context context, Uri uri);

    boolean a(Context context, String str);

    boolean a(Uri uri);

    int b();

    void b(Context context, Aweme aweme, String str);

    boolean b(Context context, Uri uri);

    Locale c();

    void c(Context context, Aweme aweme, String str);

    boolean c(Context context, Uri uri);

    String d();

    boolean d(Context context, Uri uri);

    String e();

    boolean e(Context context, Uri uri);

    boolean f(Context context, Uri uri);
}
