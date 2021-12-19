package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

class SpecialEventIconGenerator$1 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebViewPreloadEntry f44208a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f44209b;

    static {
        Covode.recordClassIndex(27085);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        this.f44209b.a(this.f44208a.getUrl(), this.f44208a.getDelay(), this.f44208a.isNeedRender());
    }

    SpecialEventIconGenerator$1(g gVar, WebViewPreloadEntry webViewPreloadEntry) {
        this.f44209b = gVar;
        this.f44208a = webViewPreloadEntry;
    }
}
