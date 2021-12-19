package com.ss.android.ugc.aweme.tools.detail;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.sticker.model.h;
import java.util.ArrayList;
import java.util.List;

public interface IPropReuseService {
    static {
        Covode.recordClassIndex(91070);
    }

    a<Aweme, ?> a();

    aa a(a<?, ?> aVar, b bVar);

    h a(String str);

    String a(Context context);

    void a(Activity activity, ArrayList<g> arrayList, Music music, String str, String str2, String str3, int i2);

    void a(Activity activity, ArrayList<g> arrayList, String str, Music music, String str2, String str3, int i2, boolean z);

    void a(Context context, Aweme aweme, String str, String str2, String str3, String str4, int i2);

    void a(Context context, List<String> list, com.ss.android.ugc.aweme.model.a.a aVar, boolean z);

    boolean a(Aweme aweme);

    Class<? extends Activity> b();
}
