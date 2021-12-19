package com.ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface ISettingService {
    static {
        Covode.recordClassIndex(80504);
    }

    BaseResponse a(String str, int i2);

    b a(Context context);

    String a(String str, Map<String, String> map);

    String a(Locale locale);

    List<a> a();

    Locale a(String str);

    void a(Activity activity);

    void a(String str, String str2, Context context);

    void a(boolean z, i iVar);

    boolean b();

    boolean b(Context context);

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    String getReleaseBuildString();

    String h();

    List<b> i();

    Map<String, b> j();

    String k();

    String l();

    String m();

    String n();

    boolean o();

    boolean p();

    c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePrivateSettingChangePresenter();

    c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePushSettingChangePresenter();

    c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter();

    Locale q();

    void r();

    boolean s();

    c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> t();

    c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> u();
}
