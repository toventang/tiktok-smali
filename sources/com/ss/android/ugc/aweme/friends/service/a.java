package com.ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.fi;
import com.ss.android.ugc.aweme.friends.d;
import com.ss.android.ugc.aweme.friends.g;
import com.ss.android.ugc.aweme.friends.invite.b;
import com.ss.android.ugc.aweme.friends.invite.c;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.ui.f;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.friends.ui.x;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import f.a.ab;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.List;

public final class a implements IFriendsService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97047a = new a();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ IFriendsService f97048c;

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent a(Context context, int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f97048c.a(context, i2, i3, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final fi a(int i2) {
        return this.f97048c.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final b a(e eVar) {
        l.d(eVar, "");
        return this.f97048c.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final c a(Fragment fragment) {
        l.d(fragment, "");
        return this.f97048c.a(fragment);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final x a(Context context) {
        l.d(context, "");
        return this.f97048c.a(context);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final y a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        l.d(context, "");
        l.d(hashMap, "");
        return this.f97048c.a(context, hashMap, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ab<CheckMatchedFriendsResponse> a() {
        return this.f97048c.a();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<FriendList<Friend>> a(String str, int i2) {
        l.d(str, "");
        return this.f97048c.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final p<String, HashMap<String, Object>> a(String str, p<String, ? extends HashMap<String, Object>> pVar) {
        l.d(str, "");
        l.d(pVar, "");
        return this.f97048c.a(str, pVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(int i2, String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        this.f97048c.a(i2, str, str2, context);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(Activity activity, f fVar) {
        l.d(activity, "");
        l.d(fVar, "");
        this.f97048c.a(activity, fVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(fi fiVar, String str, String str2, Context context) {
        l.d(fiVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        this.f97048c.a(fiVar, str, str2, context);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(g gVar) {
        l.d(gVar, "");
        this.f97048c.a(gVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(String str) {
        l.d(str, "");
        this.f97048c.a(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f97048c.a(str, z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(Activity activity) {
        l.d(activity, "");
        return this.f97048c.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(User user) {
        return this.f97048c.a(user);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(boolean z) {
        return this.f97048c.a(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.invite.a b(Context context) {
        l.d(context, "");
        return this.f97048c.b(context);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IContactService b() {
        return this.f97048c.b();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<UploadContactsResult> b(int i2) {
        return this.f97048c.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void b(g gVar) {
        l.d(gVar, "");
        this.f97048c.b(gVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void b(boolean z) {
        this.f97048c.b(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean b(Activity activity) {
        return this.f97048c.b(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<List<Friend>> c(int i2) {
        return this.f97048c.c(i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends com.ss.android.ugc.aweme.ufr.a> c() {
        return this.f97048c.c();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void c(boolean z) {
        this.f97048c.c(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.c d() {
        return this.f97048c.d();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean e() {
        return this.f97048c.e();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends com.ss.android.ugc.aweme.ufr.a> f() {
        return this.f97048c.f();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final d g() {
        return this.f97048c.g();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final long h() {
        return this.f97048c.h();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final w i() {
        return this.f97048c.i();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IFriendsService.b j() {
        return this.f97048c.j();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IFriendsService.d k() {
        return this.f97048c.k();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean l() {
        return this.f97048c.l();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean m() {
        return this.f97048c.m();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.widget.contact.c n() {
        return this.f97048c.n();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void o() {
        this.f97048c.o();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean p() {
        return this.f97048c.p();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final b q() {
        return this.f97048c.q();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void r() {
        this.f97048c.r();
    }

    static {
        Covode.recordClassIndex(61683);
    }

    private a() {
        IFriendsService s = FriendsServiceImpl.s();
        l.b(s, "");
        this.f97048c = s;
    }
}
