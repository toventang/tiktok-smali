package com.ss.android.ugc.aweme.port.internal;

import android.graphics.Bitmap;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.ss.android.ugc.aweme.shortvideo.x;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MainActivityCallback f115678a;

    /* renamed from: b  reason: collision with root package name */
    private final e f115679b;

    /* renamed from: c  reason: collision with root package name */
    private final String f115680c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f115681d;

    static {
        Covode.recordClassIndex(74633);
    }

    k(MainActivityCallback mainActivityCallback, e eVar, String str, boolean z) {
        this.f115678a = mainActivityCallback;
        this.f115679b = eVar;
        this.f115680c = str;
        this.f115681d = z;
    }

    public final void run() {
        MainActivityCallback mainActivityCallback = this.f115678a;
        e eVar = this.f115679b;
        String str = this.f115680c;
        boolean z = this.f115681d;
        eVar.getLifecycle().a(mainActivityCallback);
        mainActivityCallback.f115660a = new h(str) {
            /* class com.ss.android.ugc.aweme.port.internal.MainActivityCallback.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f115668a;

            static {
                Covode.recordClassIndex(74621);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final Object a() {
                return MainActivityCallback.this.f115663d.f129882k;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final int b() {
                return MainActivityCallback.this.f115663d.f129879h;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final int c() {
                return MainActivityCallback.this.f115663d.f129880i;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final String e() {
                return MainActivityCallback.this.f115663d.f129873b;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final Bitmap d() {
                return MainActivityCallback.this.f115662c.getCover(MainActivityCallback.this.f115663d);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final void a(x xVar) {
                MainActivityCallback.this.f115662c.addPublishCallback(xVar, this.f115668a);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.h
            public final void b(x xVar) {
                MainActivityCallback.this.f115662c.removePublishCallback(xVar);
            }

            {
                this.f115668a = r2;
            }
        };
        mainActivityCallback.f115660a.a(mainActivityCallback);
        mainActivityCallback.f115661b = new a(eVar);
        c.a(new f(2));
        if (eVar instanceof MainActivity) {
            if (z) {
                ((MainActivity) eVar).changeTabAfterPublish(AccountService.a().e().getCurUser().getFollowerCount());
            }
            ((MainActivity) eVar).onPublishServiceConnected(mainActivityCallback.f115660a, mainActivityCallback.f115660a.a(), str, mainActivityCallback.f115663d);
        } else if (eVar instanceof com.ss.android.ugc.aweme.live.k) {
            mainActivityCallback.f115660a.a();
        }
    }
}
