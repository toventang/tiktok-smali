package com.ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.google.gson.g;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.discover.helper.h;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.ui.ae;
import com.ss.android.ugc.aweme.discover.ui.af;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.d.b;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.search.model.c;
import com.ss.android.ugc.aweme.search.model.d;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface ISearchService {
    static {
        Covode.recordClassIndex(78786);
    }

    Intent a(Activity activity, Uri uri);

    JediSimpleViewHolder<?> a(ViewGroup viewGroup, e eVar);

    LynxUI<?> a(j jVar);

    ae a(d dVar, a.AbstractC2689a aVar, com.ss.android.ugc.aweme.following.ui.adapter.d dVar2, b bVar, String str);

    af a(boolean z);

    FeedSearchIconViewModel a(e eVar);

    String a(User user, Context context);

    List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar);

    void a();

    void a(int i2);

    void a(int i2, String str, int i3, String str2, String str3, String str4);

    void a(m mVar, String str, Map<String, String> map);

    void a(g gVar);

    void a(com.ss.android.sdk.webview.e eVar, WeakReference<Context> weakReference);

    void a(c cVar);

    void a(d dVar);

    void a(Exception exc, String str);

    void a(String str, String str2, String str3, boolean z);

    void a(JSONObject jSONObject);

    void a(boolean z, List<? extends Aweme> list, int i2);

    boolean a(Activity activity);

    LynxUI<?> b(j jVar);

    void b();

    void b(d dVar);

    void b(boolean z);

    LynxUI<?> c(j jVar);

    ISearchResultStatistics c();

    void c(boolean z);

    e d();

    com.ss.android.ugc.aweme.search.model.b e();

    com.ss.android.ugc.aweme.discover.h.b f();

    Fragment g();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    void m();

    h n();

    boolean o();

    Map<String, String> p();

    boolean q();

    t<?> r();

    boolean s();
}
