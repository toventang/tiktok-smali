package com.ss.android.ugc.aweme.base.ui.anchor;

import android.net.Uri;
import com.bytedance.assem.arch.b.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import h.f.b.l;
import h.k.c;
import java.util.List;

public final class a implements ICommonFeedApiService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f68349a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ICommonFeedApiService f68350b;

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final c<? extends v<? extends d>> a() {
        return this.f68350b.a();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final List<AnchorCommonStruct> a(Aweme aweme) {
        return this.f68350b.a(aweme);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void a(Uri uri, boolean z) {
        l.d(uri, "");
        this.f68350b.a(uri, z);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final long b() {
        return this.f68350b.b();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean c() {
        return this.f68350b.c();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean d() {
        return this.f68350b.d();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final boolean e() {
        return this.f68350b.e();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService
    public final void f() {
        this.f68350b.f();
    }

    static {
        Covode.recordClassIndex(42078);
    }

    private a() {
        ICommonFeedApiService g2 = CommonFeedApiService.g();
        l.b(g2, "");
        this.f68350b = g2;
    }
}
