package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public interface ILiveHostOuterService {

    public interface a {
        static {
            Covode.recordClassIndex(69273);
        }

        void a(User user);

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(69272);
    }

    Dialog a(Activity activity, c cVar, b bVar);

    Intent a(Context context);

    String a();

    void a(long j2);

    void a(Activity activity);

    void a(Activity activity, boolean z, boolean z2);

    void a(Context context, String str);

    void a(String str, String str2, a aVar);

    void a(boolean z);

    Dialog b(Activity activity, c cVar, b bVar);

    Intent b(Context context);

    void b(Context context, String str);

    boolean b();

    Locale c();

    void c(Activity activity, c cVar, b bVar);

    boolean c(Context context);

    List<String> d();

    boolean e();

    String f();

    boolean g();

    long h();

    void i();

    List<com.bytedance.android.livesdkapi.model.b> j();

    String k();

    String l();

    int m();

    double n();

    JSONObject o();

    String p();
}
