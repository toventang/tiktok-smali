package com.ss.android.ugc.aweme.notice.api.services;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class b implements INoticeService {

    /* renamed from: a  reason: collision with root package name */
    public static final b f112773a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ INoticeService f112774b;

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final <T extends a> Class<? extends T> a() {
        return this.f112774b.a();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final String a(User user) {
        return this.f112774b.a(user);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(int i2) {
        this.f112774b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(Context context) {
        l.d(context, "");
        this.f112774b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(Bundle bundle, int i2) {
        this.f112774b.a(bundle, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void a(Handler handler, String str) {
        l.d(handler, "");
        l.d(str, "");
        this.f112774b.a(handler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean a(Context context, User user, String str, String str2, boolean z) {
        return this.f112774b.a(context, user, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean a(BaseResponse baseResponse) {
        l.d(baseResponse, "");
        return this.f112774b.a(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final a b() {
        return this.f112774b.b();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void b(Handler handler, String str) {
        l.d(handler, "");
        l.d(str, "");
        this.f112774b.b(handler, str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final boolean b(BaseResponse baseResponse) {
        l.d(baseResponse, "");
        return this.f112774b.b(baseResponse);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void c() {
        this.f112774b.c();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final void d() {
        this.f112774b.d();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeService
    public final int e() {
        return this.f112774b.e();
    }

    static {
        Covode.recordClassIndex(72489);
    }

    private b() {
        INoticeService f2 = NoticeServiceImpl.f();
        l.b(f2, "");
        this.f112774b = f2;
    }
}
