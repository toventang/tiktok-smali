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
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class h implements ISearchService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f121133a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ISearchService f121134b;

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Intent a(Activity activity, Uri uri) {
        l.d(activity, "");
        l.d(uri, "");
        return this.f121134b.a(activity, uri);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final JediSimpleViewHolder<?> a(ViewGroup viewGroup, e eVar) {
        l.d(viewGroup, "");
        return this.f121134b.a(viewGroup, eVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> a(j jVar) {
        l.d(jVar, "");
        return this.f121134b.a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ae a(d dVar, a.AbstractC2689a aVar, com.ss.android.ugc.aweme.following.ui.adapter.d dVar2, b bVar, String str) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(dVar2, "");
        return this.f121134b.a(dVar, aVar, dVar2, bVar, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final af a(boolean z) {
        return this.f121134b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final FeedSearchIconViewModel a(e eVar) {
        l.d(eVar, "");
        return this.f121134b.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String a(User user, Context context) {
        return this.f121134b.a(user, context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return this.f121134b.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a() {
        this.f121134b.a();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(int i2) {
        this.f121134b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(int i2, String str, int i3, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f121134b.a(i2, str, i3, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(m mVar, String str, Map<String, String> map) {
        l.d(mVar, "");
        l.d(str, "");
        l.d(map, "");
        this.f121134b.a(mVar, str, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(g gVar) {
        l.d(gVar, "");
        this.f121134b.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(com.ss.android.sdk.webview.e eVar, WeakReference<Context> weakReference) {
        l.d(eVar, "");
        l.d(weakReference, "");
        this.f121134b.a(eVar, weakReference);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f121134b.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f121134b.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(Exception exc, String str) {
        l.d(exc, "");
        l.d(str, "");
        this.f121134b.a(exc, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(String str, String str2, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f121134b.a(str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(JSONObject jSONObject) {
        this.f121134b.a(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void a(boolean z, List<? extends Aweme> list, int i2) {
        this.f121134b.a(z, list, i2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean a(Activity activity) {
        return this.f121134b.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> b(j jVar) {
        l.d(jVar, "");
        return this.f121134b.b(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b() {
        this.f121134b.b();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b(d dVar) {
        l.d(dVar, "");
        this.f121134b.b(dVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void b(boolean z) {
        this.f121134b.b(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> c(j jVar) {
        l.d(jVar, "");
        return this.f121134b.c(jVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchResultStatistics c() {
        return this.f121134b.c();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void c(boolean z) {
        this.f121134b.c(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final e d() {
        return this.f121134b.d();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.search.model.b e() {
        return this.f121134b.e();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.discover.h.b f() {
        return this.f121134b.f();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Fragment g() {
        return this.f121134b.g();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean h() {
        return this.f121134b.h();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean i() {
        return this.f121134b.i();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean j() {
        return this.f121134b.j();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean k() {
        return this.f121134b.k();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean l() {
        return this.f121134b.l();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void m() {
        this.f121134b.m();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final com.ss.android.ugc.aweme.discover.helper.h n() {
        return this.f121134b.n();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean o() {
        return this.f121134b.o();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Map<String, String> p() {
        return this.f121134b.p();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean q() {
        return this.f121134b.q();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final t<?> r() {
        return this.f121134b.r();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean s() {
        return this.f121134b.s();
    }

    static {
        Covode.recordClassIndex(78909);
    }

    private h() {
        ISearchService t = SearchServiceImpl.t();
        l.b(t, "");
        this.f121134b = t;
    }
}
