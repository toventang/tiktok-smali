package com.ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

public interface IAdTaskDepend {
    static {
        Covode.recordClassIndex(46470);
    }

    Intent a(Context context);

    String a();

    JSONObject a(Context context, Aweme aweme, String str);

    void a(Context context, int i2, int i3);

    void a(Context context, String str, String str2, Bundle bundle);

    void a(String str);

    boolean a(Context context, int i2);

    boolean a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i2);

    boolean a(Context context, String str);

    boolean a(Context context, String str, String str2);

    boolean a(Context context, String str, String str2, String str3, String str4);

    boolean a(Aweme aweme);

    boolean a(AwemeRawAd awemeRawAd);

    boolean a(String str, Context context, AwemeRawAd awemeRawAd);

    boolean a(boolean z, String str, String str2);

    void b(Context context);

    boolean b();

    boolean b(String str);

    boolean c(String str);

    void d(String str);
}
