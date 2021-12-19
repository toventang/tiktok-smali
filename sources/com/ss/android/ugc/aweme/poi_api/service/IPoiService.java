package com.ss.android.ugc.aweme.poi_api.service;

import android.content.Context;
import android.view.View;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.d;
import com.ss.android.ugc.aweme.detail.operators.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.GuitarBundle;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import h.f.a.a;
import h.f.a.b;
import h.f.a.r;
import h.z;
import java.util.HashMap;
import java.util.Map;

public interface IPoiService {
    static {
        Covode.recordClassIndex(74414);
    }

    View a(Context context, Aweme aweme, String str);

    d a(Context context, a<z> aVar, a<z> aVar2, a<z> aVar3);

    GuitarBundle a(Context context, String str, long j2, com.bytedance.bpea.basics.d dVar);

    PoiData a(b<? super Class<? extends Object>, ? extends Object> bVar);

    PokerBundle a(String str, double d2, double d3);

    a a();

    Map<String, String> a(String str, Aweme aweme);

    void a(Context context);

    void a(com.bytedance.bpea.basics.d dVar);

    void a(String str);

    void a(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7);

    void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10);

    void a(String str, boolean z, r<? super Double, ? super Double, ? super String, ? super Boolean, z> rVar, b<? super Boolean, z> bVar);

    e<Class<?>, IAVPublishExtension<?>> b();

    void b(b<? super String, z> bVar);

    boolean b(Context context);

    void c();

    boolean c(Context context);

    String d();

    boolean e();

    void f();

    void g();

    Map<String, Object> h();

    String i();

    String j();

    String k();

    HashMap<String, ae> l();
}
