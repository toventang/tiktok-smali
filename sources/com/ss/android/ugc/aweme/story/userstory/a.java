package com.ss.android.ugc.aweme.story.userstory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class a implements IAwemeService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138506a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAwemeService f138507b;

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(Aweme aweme) {
        return this.f138507b.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(Aweme aweme, int i2) {
        return this.f138507b.a(aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(String str) {
        return this.f138507b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme a(String str, int i2) {
        return this.f138507b.a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a() {
        this.f138507b.a();
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a(long j2) {
        this.f138507b.a(j2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void a(String str, long j2) {
        this.f138507b.a(str, j2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme b(String str) {
        return this.f138507b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void b(Aweme aweme, int i2) {
        this.f138507b.b(aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void b(String str, int i2) {
        this.f138507b.b(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(Aweme aweme, int i2) {
        this.f138507b.c(aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(String str) {
        this.f138507b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final void c(String str, int i2) {
        this.f138507b.c(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme d(String str) {
        return this.f138507b.d(str);
    }

    @Override // com.ss.android.ugc.aweme.awemeservice.api.IAwemeService
    public final Aweme e(String str) {
        return this.f138507b.e(str);
    }

    static {
        Covode.recordClassIndex(90597);
    }

    private a() {
        IAwemeService b2 = AwemeService.b();
        l.b(b2, "");
        this.f138507b = b2;
    }
}
