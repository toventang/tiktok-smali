package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.gif.h;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Map;

public interface ShareDependService {

    /* renamed from: a */
    public static final a f123250a = a.f123251a;

    static {
        Covode.recordClassIndex(80954);
    }

    q<PromoteEntryCheck> a(String str, String str2);

    com.ss.android.ugc.aweme.account.model.a a(User user);

    h a();

    com.ss.android.ugc.aweme.sharer.b a(SharePackage sharePackage, String str);

    i a(Activity activity, e eVar, int i2);

    String a(Aweme aweme, int i2);

    void a(Activity activity);

    void a(Activity activity, Aweme aweme);

    void a(Context context, Aweme aweme);

    void a(Context context, Aweme aweme, String str);

    void a(Context context, Aweme aweme, String str, String str2, String str3);

    void a(Context context, Aweme aweme, boolean z, ArrayList<String> arrayList, String str, int i2, boolean z2);

    void a(Context context, String str);

    void a(Context context, String str, int i2);

    void a(Context context, boolean z);

    void a(Aweme aweme, Activity activity, String str);

    void a(Aweme aweme, String str);

    void a(Aweme aweme, String str, Context context, String str2, String str3);

    void a(com.ss.android.ugc.aweme.sharer.b bVar);

    void a(String str, Context context);

    void a(String str, d dVar);

    void a(String str, Aweme aweme, Activity activity, String str2, Map<String, String> map, boolean z, boolean z2);

    void a(boolean z);

    boolean a(Aweme aweme);

    int b(Aweme aweme);

    void b(Context context, Aweme aweme);

    boolean b();

    void c(Context context, Aweme aweme);

    boolean c();

    boolean c(Aweme aweme);

    void d(Context context, Aweme aweme);

    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f123251a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80955);
        }

        public static ShareDependService a() {
            ShareDependService d2 = ShareDependServiceImpl.d();
            l.b(d2, "");
            return d2;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(80956);
        }

        public static /* synthetic */ com.ss.android.ugc.aweme.sharer.b a(ShareDependService shareDependService, SharePackage sharePackage, String str, int i2) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            return shareDependService.a(sharePackage, str);
        }
    }
}
