package com.bytedance.android.livesdkapi.service;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.android.live.n.j;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.d.b.b;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.j.a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public interface d {
    static {
        Covode.recordClassIndex(13856);
    }

    long a(boolean z);

    Fragment a(Context context, Bundle bundle);

    Fragment a(Context context, String str);

    Fragment a(Uri uri, Context context);

    androidx.fragment.app.d a(e eVar, b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar);

    j a(Bundle bundle);

    com.bytedance.android.livesdk.watch.b a(FullDraggableContainer fullDraggableContainer, Bundle bundle);

    com.bytedance.android.livesdkapi.depend.d.b a(Context context, ViewGroup viewGroup);

    g a(String str);

    h a(EnterRoomConfig enterRoomConfig);

    c a(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle);

    f a(a aVar);

    <T> T a(String str, T t);

    String a(long j2, EnterRoomConfig enterRoomConfig, Context context);

    Map<String, Object> a(long j2);

    Map<String, com.bytedance.ies.web.a.d> a(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar);

    void a(int i2);

    void a(long j2, a aVar);

    void a(long j2, b bVar);

    void a(Activity activity);

    void a(Context context);

    void a(Context context, int i2);

    void a(Context context, com.bytedance.android.livesdkapi.depend.e.c cVar);

    void a(Context context, com.bytedance.android.livesdkapi.model.d dVar);

    void a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener);

    void a(Context context, boolean z, Room room, com.bytedance.android.livesdkapi.depend.e.c cVar, IHostLongPressCallback iHostLongPressCallback, com.bytedance.android.livesdkapi.depend.e.b bVar);

    void a(b.a aVar, com.bytedance.android.livesdk.callback.b bVar);

    void a(com.bytedance.android.livesdkapi.depend.d.b.c cVar);

    void a(com.bytedance.android.livesdkapi.depend.d.e eVar);

    void a(com.bytedance.android.livesdkapi.depend.e.c cVar);

    void a(Room room, String str, String str2);

    void a(Room room, String str, String str2, String str3);

    void a(String str, k kVar);

    void a(Locale locale);

    void a(Map<String, Class> map, Map<Class, com.bytedance.android.e.a.a.b> map2);

    boolean a(Context context, Uri uri);

    boolean a(Context context, Uri uri, Map<String, String> map);

    boolean a(String str, Context context);

    boolean a(String str, String str2);

    int b(String str);

    Fragment b(Context context, Bundle bundle);

    com.bytedance.android.livesdk.container.c b(Context context, Uri uri);

    com.bytedance.android.livesdk.watch.c b();

    com.bytedance.android.livesdkapi.b.d b(Bundle bundle);

    com.bytedance.android.livesdkapi.depend.model.a.a b(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle);

    String b(int i2);

    void b(long j2);

    void b(Activity activity);

    void b(com.bytedance.android.livesdkapi.depend.e.c cVar);

    int c(String str);

    Fragment c(Context context, Bundle bundle);

    void c();

    Fragment d();

    void d(String str);

    void e();

    void e(String str);

    g f();

    com.bytedance.android.livesdkapi.depend.d.a.b g();

    Fragment h();

    com.bytedance.android.livesdkapi.depend.model.a.h i();

    Context j();

    Map<String, String> k();

    int l();

    int m();

    void n();

    n o();

    JSONObject p();

    String q();

    com.bytedance.android.livesdkapi.depend.d.f r();

    com.bytedance.android.livesdkapi.depend.d.j s();

    void t();

    com.bytedance.android.live.broadcast.api.d u();

    boolean v();

    boolean w();

    com.bytedance.android.live.l.a x();

    void y();
}
