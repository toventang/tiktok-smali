package com.ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.language.b;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import h.f.b.l;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class f implements ISettingService {

    /* renamed from: a  reason: collision with root package name */
    public static final f f122672a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ISettingService f122673b;

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final BaseResponse a(String str, int i2) {
        return this.f122673b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final b a(Context context) {
        l.d(context, "");
        return this.f122673b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String a(String str, Map<String, String> map) {
        l.d(str, "");
        l.d(map, "");
        return this.f122673b.a(str, map);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String a(Locale locale) {
        return this.f122673b.a(locale);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<a> a() {
        return this.f122673b.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale a(String str) {
        l.d(str, "");
        return this.f122673b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(Activity activity) {
        l.d(activity, "");
        this.f122673b.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        this.f122673b.a(str, str2, context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void a(boolean z, i iVar) {
        l.d(iVar, "");
        this.f122673b.a(z, iVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean b() {
        return this.f122673b.b();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean b(Context context) {
        l.d(context, "");
        return this.f122673b.b(context);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean c() {
        return this.f122673b.c();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean d() {
        return this.f122673b.d();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean e() {
        return this.f122673b.e();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean f() {
        return this.f122673b.f();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean g() {
        return this.f122673b.g();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String getReleaseBuildString() {
        return this.f122673b.getReleaseBuildString();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String h() {
        return this.f122673b.h();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final List<b> i() {
        return this.f122673b.i();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Map<String, b> j() {
        return this.f122673b.j();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String k() {
        return this.f122673b.k();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String l() {
        return this.f122673b.l();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String m() {
        return this.f122673b.m();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final String n() {
        return this.f122673b.n();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean o() {
        return this.f122673b.o();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean p() {
        return this.f122673b.p();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePrivateSettingChangePresenter() {
        return this.f122673b.providePrivateSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePushSettingChangePresenter() {
        return this.f122673b.providePushSettingChangePresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter() {
        return this.f122673b.providePushSettingFetchPresenter();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final Locale q() {
        return this.f122673b.q();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final void r() {
        this.f122673b.r();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final boolean s() {
        return this.f122673b.s();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> t() {
        return this.f122673b.t();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingService
    public final c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> u() {
        return this.f122673b.u();
    }

    static {
        Covode.recordClassIndex(80520);
    }

    private f() {
        ISettingService v = SettingServiceImpl.v();
        l.b(v, "");
        this.f122673b = v;
    }
}
