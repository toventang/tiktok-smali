package com.bytedance.ies.ugc.aweme.commercialize.splash.service;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.w;
import java.util.List;

public interface ISplashAdService {
    static {
        Covode.recordClassIndex(20873);
    }

    int a();

    View a(Activity activity, ViewGroup viewGroup);

    View a(View view);

    View a(Fragment fragment, ViewGroup viewGroup);

    b a(Activity activity);

    Aweme a(String str);

    w a(List<? extends Aweme> list);

    void a(Context context, String str);

    void a(com.bytedance.ies.ugc.aweme.commercialize.splash.a.b bVar);

    void a(boolean z);

    boolean a(Context context);

    Drawable b(Context context);

    View b(Fragment fragment, ViewGroup viewGroup);

    void b();

    void b(com.bytedance.ies.ugc.aweme.commercialize.splash.a.b bVar);

    w c();

    w d();

    q e();

    void f();

    void g();
}
