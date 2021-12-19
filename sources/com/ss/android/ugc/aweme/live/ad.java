package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.e.a.a.b;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.d.e;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.j;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class ad implements c {
    static {
        Covode.recordClassIndex(69307);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.live.c
    public final void z() {
        Live.refreshLoginState();
    }

    @Override // com.ss.android.ugc.aweme.live.c
    public final boolean a() {
        return Live.openLiveRecord();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Activity activity) {
        Live.getService().a(activity);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Locale locale) {
        Live.getService().a(locale);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(Context context, Uri uri) {
        return Live.getService().a(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Map<String, Class> map, Map<Class, b> map2) {
        Live.getService().a(map, map2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final f a(com.bytedance.android.livesdkapi.j.a aVar) {
        return Live.getService().a(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final g a(String str) {
        if (Live.getService() != null) {
            return Live.getService().a(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(String str, k kVar) {
        Live.getService().a(str, kVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context) {
        Live.getService().a(context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final h a(EnterRoomConfig enterRoomConfig) {
        return Live.getService().a(enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final c a(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        return Live.getService().a(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(long j2, com.bytedance.android.livesdkapi.service.b bVar) {
        Live.getService().a(j2, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(com.bytedance.android.livesdkapi.depend.d.b.c cVar) {
        Live.getService().a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final <T> T a(String str, T t) {
        d service = Live.getService();
        return service == null ? t : (T) service.a(str, (Object) t);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, com.bytedance.android.livesdkapi.depend.e.c cVar) {
        Live.getService().a(context, cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String a(long j2, EnterRoomConfig enterRoomConfig, Context context) {
        return Live.getService().a(j2, enterRoomConfig, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(String str, Context context) {
        return Live.getService().a(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(e eVar) {
        Live.getService().a(eVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(int i2) {
        if (Live.getService() != null) {
            Live.getService().a(i2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, boolean z, Room room, com.bytedance.android.livesdkapi.depend.e.c cVar, IHostLongPressCallback iHostLongPressCallback, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        Live.getService().a(context, z, room, cVar, iHostLongPressCallback, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, com.bytedance.android.livesdkapi.model.d dVar) {
        Live.getService().a(context, dVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        Live.getService().a(context, str, str2, bundle, onDismissListener);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, Object> a(long j2) {
        return Live.getService().a(j2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, com.bytedance.ies.web.a.d> a(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        return Live.getService().a(weakReference, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(com.bytedance.android.livesdkapi.depend.e.c cVar) {
        Live.getService().a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Room room, String str, String str2) {
        Live.getService().a(room, str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Room room, String str, String str2, String str3) {
        Live.getService().a(room, str, str2, str3);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(String str, String str2) {
        return Live.getService().a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean a(Context context, Uri uri, Map<String, String> map) {
        return Live.getService().a(context, uri, map);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(Context context, int i2) {
        Live.getService().a(context, i2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(b.a aVar, com.bytedance.android.livesdk.callback.b bVar) {
        Live.getService().a(aVar, bVar);
    }

    @Override // com.ss.android.ugc.aweme.live.c
    public final t<NewLiveRoomStruct> a(long j2, String str) {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://" + Live.getLiveDomain()).create(LiveRoomInfoApi.class);
        l.b(create, "");
        return ((LiveRoomInfoApi) create).fetchUserRoom(j2, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(ae.f108098a);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void c() {
        Live.getService().c();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void e() {
        Live.getService().e();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void n() {
        Live.getService().n();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void t() {
        Live.getService().t();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void y() {
        Live.getService().y();
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f108097a = new ad();

        static {
            Covode.recordClassIndex(69308);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment d() {
        return Live.getService().d();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.a.b g() {
        return Live.getService().g();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment h() {
        return Live.getService().h();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.model.a.h i() {
        return Live.getService().i();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Map<String, String> k() {
        return Live.getService().k();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int l() {
        return Live.getService().l();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int m() {
        return Live.getService().m();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final n o() {
        return Live.getService().o();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final JSONObject p() {
        d service = Live.getService();
        if (service == null) {
            return null;
        }
        return service.p();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String q() {
        return Live.getService().q();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.f r() {
        return Live.getService().r();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final j s() {
        return Live.getService().s();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.broadcast.api.d u() {
        return Live.getService().u();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean v() {
        return Live.getService().v();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final boolean w() {
        return Live.getService().w();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.l.a x() {
        return Live.getService().x();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final g f() {
        if (Live.getService() != null) {
            return Live.getService().f();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Context j() {
        if (Live.getService() != null) {
            return Live.getService().j();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.watch.c b() {
        return Live.getService().b();
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(long j2) {
        Live.getService().b(j2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void d(String str) {
        Live.getService().d(str);
    }

    @Override // com.ss.android.ugc.aweme.live.c
    public final boolean f(String str) {
        return Live.openLiveRecordBySchema(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final long a(boolean z) {
        return Live.getService().a(z);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int b(String str) {
        return Live.getService().b(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final int c(String str) {
        return Live.getService().c(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void e(String str) {
        Live.getService().e(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.b.d b(Bundle bundle) {
        return Live.getService().b(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.live.n.j a(Bundle bundle) {
        return Live.getService().a(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final String b(int i2) {
        return Live.getService().b(i2);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void b(com.bytedance.android.livesdkapi.depend.e.c cVar) {
        Live.getService().b(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final void a(long j2, com.bytedance.android.livesdkapi.service.a aVar) {
        Live.getService().a(j2, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Context context, Bundle bundle) {
        return Live.getService().a(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment b(Context context, Bundle bundle) {
        return Live.getService().b(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment c(Context context, Bundle bundle) {
        return Live.getService().c(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Context context, String str) {
        return Live.getService().a(context, str);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.container.c b(Context context, Uri uri) {
        return Live.getService().b(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final Fragment a(Uri uri, Context context) {
        return Live.getService().a(uri, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.model.a.a b(com.bytedance.android.livesdkapi.depend.model.a.b bVar, Bundle bundle) {
        return Live.getService().b(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdk.watch.b a(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).createDrawerFeedFragment(fullDraggableContainer, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final com.bytedance.android.livesdkapi.depend.d.b a(Context context, ViewGroup viewGroup) {
        return Live.getService().a(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdkapi.service.d
    public final androidx.fragment.app.d a(androidx.fragment.app.e eVar, com.bytedance.android.livesdkapi.depend.d.b.b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar) {
        return Live.getService().a(eVar, bVar, bundle, dVar);
    }
}
