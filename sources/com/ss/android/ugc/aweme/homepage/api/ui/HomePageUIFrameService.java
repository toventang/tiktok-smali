package com.ss.android.ugc.aweme.homepage.api.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.b;
import com.ss.android.ugc.aweme.ar;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.o;

public interface HomePageUIFrameService {
    static {
        Covode.recordClassIndex(63170);
    }

    View.OnClickListener a(Context context, String str);

    b a(e eVar);

    o a(Context context);

    Class<? extends Activity> a();

    void a(e eVar, Bundle bundle);

    void a(String str);

    ImageView b(e eVar);

    by b(Context context);

    Class<? extends Fragment> b(String str);

    void b();

    View c();

    View c(e eVar);

    ar c(Context context);

    View d();

    ImageView d(e eVar);

    ar d(Context context);

    View e(e eVar);

    View f(e eVar);

    View g(e eVar);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    View h(e eVar);

    View i(e eVar);

    View j(e eVar);

    View k(e eVar);

    void runInTabHostRunnable(com.bytedance.ies.uikit.a.b bVar);

    void setTitleTabVisibility(boolean z);
}
