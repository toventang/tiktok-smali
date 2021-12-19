package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import h.f.b.l;

public final class o implements IInterceptor {

    /* renamed from: g  reason: collision with root package name */
    public static final a f71139g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f71140a;

    /* renamed from: b  reason: collision with root package name */
    public String f71141b;

    /* renamed from: c  reason: collision with root package name */
    public String f71142c;

    /* renamed from: d  reason: collision with root package name */
    public String f71143d;

    /* renamed from: e  reason: collision with root package name */
    public String f71144e;

    /* renamed from: f  reason: collision with root package name */
    public String f71145f;

    static {
        Covode.recordClassIndex(43792);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43793);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f71146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f71147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f71148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RouteIntent f71149d;

        static {
            Covode.recordClassIndex(43794);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        public static final class a extends SimpleServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f71150a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecordConfig.Builder f71151b;

            static {
                Covode.recordClassIndex(43795);
            }

            a(Context context, RecordConfig.Builder builder) {
                this.f71150a = context;
                this.f71151b = builder;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                l.d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f71150a, this.f71151b.build());
            }
        }

        private static void a(Context context, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            if (this.f71147b instanceof Activity) {
                a(this.f71147b, o.a(new Intent(this.f71147b, this.f71148c), this.f71149d));
                return;
            }
            this.f71146a.f71140a = v.b(this.f71149d.getOriginUrl(), "sticker_id");
            this.f71146a.f71141b = v.b(this.f71149d.getOriginUrl(), StringSet.type);
            this.f71146a.f71142c = v.b(this.f71149d.getOriginUrl(), "shoot_way");
            this.f71146a.f71143d = v.b(this.f71149d.getOriginUrl(), "enter_from");
            this.f71146a.f71144e = v.b(this.f71149d.getOriginUrl(), "enter_method");
            this.f71146a.f71145f = v.b(this.f71149d.getOriginUrl(), "session_id");
            if (this.f71146a.f71141b == null || this.f71146a.f71140a == null || this.f71146a.f71142c == null || this.f71146a.f71143d == null || this.f71146a.f71144e == null || !l.a((Object) this.f71146a.f71141b, (Object) "use_sticker")) {
                Context context = this.f71147b;
                if (context == null) {
                    context = d.a();
                }
                Intent intent = new Intent(this.f71147b, this.f71148c);
                intent.addFlags(268435456);
                a(context, intent);
                return;
            }
            Context context2 = this.f71147b;
            if (context2 == null) {
                context2 = d.a();
            }
            r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", this.f71146a.f71142c).a("enter_from", this.f71146a.f71143d).a("enter_method", this.f71146a.f71144e).f66730a);
            RecordConfig.Builder showStickerPanel = new RecordConfig.Builder().showStickerPanel(false);
            String str = this.f71146a.f71140a;
            if (str == null) {
                l.b();
            }
            RecordConfig.Builder enterFrom = showStickerPanel.autoUseSticker(str).shootWay(this.f71146a.f71142c).sharedARSessionId(this.f71146a.f71145f).enterFrom(this.f71146a.f71143d);
            IExternalService a2 = AVExternalServiceImpl.a();
            String str2 = this.f71146a.f71144e;
            if (str2 == null) {
                l.b();
            }
            a2.asyncService(context2, str2, new a(context2, enterFrom));
        }

        b(o oVar, Context context, Class cls, RouteIntent routeIntent) {
            this.f71146a = oVar;
            this.f71147b = context;
            this.f71148c = cls;
            this.f71149d = routeIntent;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r4 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x004b
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = h.f.b.l.a(r1, r0)
            java.lang.String r0 = "studio/task/create"
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 != 0) goto L_0x0045
            if (r4 == 0) goto L_0x0047
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.getHost()
        L_0x002f:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r0.getPath()
        L_0x0039:
            java.lang.String r1 = h.f.b.l.a(r1, r2)
            java.lang.String r0 = "studio/create"
            boolean r0 = h.f.b.l.a(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            r1 = r2
            if (r4 == 0) goto L_0x0039
            goto L_0x002f
        L_0x004b:
            r1 = r2
            if (r4 == 0) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            r0 = r2
            goto L_0x0017
        L_0x0051:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.o.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        l.d(routeIntent, "");
        AVExternalServiceImpl.a().asyncService("RecordPermissionInterceptor", new b(this, context, AVExternalServiceImpl.a().classnameService().getVideoRecordPermissionActivityClass(), routeIntent));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Intent r7, com.bytedance.router.RouteIntent r8) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.o.a(android.content.Intent, com.bytedance.router.RouteIntent):android.content.Intent");
    }
}
