package com.ss.android.ugc.aweme.mix.services;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.b;
import com.ss.android.ugc.aweme.mix.api.c;
import com.ss.android.ugc.aweme.mix.api.d;
import com.ss.android.ugc.aweme.mix.api.g;

public interface IMixFeedService {
    static {
        Covode.recordClassIndex(70763);
    }

    RecyclerView.ViewHolder a(ViewGroup viewGroup, boolean z, boolean z2, String str, g gVar);

    com.bytedance.tux.sheet.sheet.a a(Context context, String str, String str2, Aweme aweme, String str3, String str4, String str5);

    void a(Activity activity, Aweme aweme, com.ss.android.ugc.aweme.mix.api.a aVar, String str, String str2);

    void a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4);

    void a(Activity activity, b bVar, String str, String str2, String str3, String str4);

    void a(Context context);

    void a(Context context, Bundle bundle);

    void a(Context context, Bundle bundle, int i2, String str, String str2);

    void a(Context context, Bundle bundle, String str, String str2, Long l2, String str3);

    void a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.mix.e.b bVar, Float f2, String str6);

    void a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, com.ss.android.ugc.aweme.mix.e.b bVar, String str6);

    void a(d dVar);

    void a(String str, String str2, Context context);

    void a(String str, String str2, c cVar);

    void a(String str, String str2, String str3, String str4, float f2, com.ss.android.ugc.aweme.mix.e.b bVar);

    void a(String str, String str2, String str3, String str4, com.ss.android.ugc.aweme.mix.e.b bVar);

    void a(String str, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.mix.e.b bVar);

    void a(boolean z);

    boolean a();

    boolean a(Aweme aweme);

    boolean b();

    boolean b(Aweme aweme);

    boolean c();

    int d();

    void e();

    boolean f();

    void g();

    int h();

    boolean i();

    boolean j();

    public static final class a {
        static {
            Covode.recordClassIndex(70764);
        }

        public static /* synthetic */ void a(IMixFeedService iMixFeedService, String str, String str2, String str3, String str4, float f2, com.ss.android.ugc.aweme.mix.e.b bVar, int i2) {
            if ((i2 & 16) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 32) != 0) {
                bVar = null;
            }
            iMixFeedService.a(str, str2, str3, str4, f2, bVar);
        }
    }
}
