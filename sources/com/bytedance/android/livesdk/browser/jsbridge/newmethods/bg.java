package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;

public final class bg extends e<b, Object> {

    /* renamed from: a  reason: collision with root package name */
    private a f14554a;

    public interface a {
        static {
            Covode.recordClassIndex(8101);
        }

        void a(com.bytedance.android.livesdk.browser.i.b bVar);

        com.bytedance.android.livesdk.browser.i.b c();
    }

    static {
        Covode.recordClassIndex(8100);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        this.f14554a = null;
    }

    static final class b {
        @c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        String f14555a;
        @c(a = "desc")

        /* renamed from: b  reason: collision with root package name */
        String f14556b;
        @c(a = "image")

        /* renamed from: c  reason: collision with root package name */
        String f14557c;
        @c(a = "url")

        /* renamed from: d  reason: collision with root package name */
        String f14558d;

        static {
            Covode.recordClassIndex(8102);
        }

        b() {
        }
    }

    public bg(a aVar) {
        this.f14554a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(b bVar, g gVar) {
        b bVar2 = bVar;
        this.f14554a.a(new com.bytedance.android.livesdk.browser.i.b(bVar2.f14555a, bVar2.f14556b, bVar2.f14557c, bVar2.f14558d));
        finishWithSuccess();
    }
}
