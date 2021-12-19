package com.ss.android.ugc.aweme.homepage.api.msadapt;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.main.l;

public interface IMSAdaptionService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99155a = a.f99156a;

    static {
        Covode.recordClassIndex(63168);
    }

    Fragment a();

    w a(String str, Bundle bundle);

    l a(Activity activity);

    void a(Fragment fragment);

    void a(e eVar);

    void a(Aweme aweme);

    boolean a(Context context);

    Aweme b();

    void b(e eVar);

    boolean b(Context context);

    void c(e eVar);

    boolean c(Context context);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f99156a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(63169);
        }
    }
}
