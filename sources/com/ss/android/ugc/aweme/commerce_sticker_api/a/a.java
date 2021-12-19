package com.ss.android.ugc.aweme.commerce_sticker_api.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface a {
    static {
        Covode.recordClassIndex(45282);
    }

    User a();

    void a(Context context, String str, String str2);

    void a(Context context, String str, String str2, String str3, String str4, String str5);

    void a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView);

    boolean a(Context context, String str);

    boolean a(String str);

    boolean b(String str);

    boolean c(String str);
}
