package com.ss.android.ugc.aweme.settingsrequest.api;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.im.service.model.i;
import com.ss.android.ugc.aweme.setting.model.d;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface ISettingsRequestService {
    static {
        Covode.recordClassIndex(80888);
    }

    i a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    List<a> a();

    void a(Activity activity);

    void a(Context context);

    void a(o oVar);

    void a(d dVar);

    void a(f fVar);

    void a(a aVar);

    void a(String str);

    void a(Map<String, String> map);

    i b();

    JSONObject b(String str);

    boolean c();

    int d();

    int e();

    int f();

    boolean g();

    boolean h();
}
