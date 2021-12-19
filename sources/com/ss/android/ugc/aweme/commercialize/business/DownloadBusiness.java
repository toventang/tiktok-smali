package com.ss.android.ugc.aweme.commercialize.business;

import android.app.Activity;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import com.ss.android.ugc.aweme.commercialize.model.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class DownloadBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public String f73742a;

    /* renamed from: b  reason: collision with root package name */
    public int f73743b;

    /* renamed from: c  reason: collision with root package name */
    public int f73744c;

    /* renamed from: d  reason: collision with root package name */
    private final ap f73745d = new ap();

    /* renamed from: e  reason: collision with root package name */
    private final boolean f73746e;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73747a = new a();

        static {
            Covode.recordClassIndex(45370);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(45369);
    }

    public final void a() {
        Activity a2 = this.f69222k.a();
        if (a2 != null) {
            int i2 = this.f73743b;
            if (i2 == 0) {
                i2 = R.id.dw;
            }
            a2.findViewById(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadBusiness(com.ss.android.ugc.aweme.bullet.business.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void a(SSWebView sSWebView) {
        FrameLayout frameLayout;
        int i2;
        int i3;
        Activity a2 = this.f69222k.a();
        j jVar = null;
        if (a2 != null) {
            int i4 = this.f73743b;
            if (i4 == 0) {
                i4 = R.id.dw;
            }
            frameLayout = (FrameLayout) a2.findViewById(i4);
        } else {
            frameLayout = null;
        }
        boolean z = false;
        if (!this.f73746e) {
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.bytedance.ies.bullet.service.f.a.b bVar = this.f69222k.f69252a;
        if (bVar instanceof j) {
            jVar = bVar;
        }
        j jVar2 = jVar;
        ap apVar = this.f73745d;
        if (jVar2 != null) {
            apVar.f74870a = jVar2.ao.b();
            apVar.f74872c = jVar2.h();
            apVar.f74873d = jVar2.c();
            apVar.f74874e = jVar2.aj.b();
            apVar.f74876g = jVar2.ah.b();
            apVar.f74875f = jVar2.ai.b();
            if (jVar2.ar.b() != null) {
                i2 = ((Integer) jVar2.ar.b()).intValue();
            } else {
                i2 = 0;
            }
            apVar.f74877h = i2;
            apVar.f74879j = jVar2.ak.b();
            if (jVar2.at.b() != null) {
                i3 = ((Integer) jVar2.at.b()).intValue();
            } else {
                i3 = 0;
            }
            apVar.f74882m = i3;
            if (jVar2.av.b() == Boolean.TRUE) {
                z = true;
            }
            apVar.n = z;
            try {
                apVar.f74880k = new JSONObject(jVar2.aw.b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            apVar.f74881l = jVar2.aq.b();
            apVar.f74878i = ap.a(apVar.f74877h);
            try {
                apVar.f74871b = Long.parseLong(apVar.f74870a);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(a.f73747a);
        }
        if (sSWebView != null) {
            sSWebView.setDownloadListener(new b(this, sSWebView, a2, jVar2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadBusiness f73748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SSWebView f73749b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f73750c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f73751d;

        static {
            Covode.recordClassIndex(45371);
        }

        b(DownloadBusiness downloadBusiness, SSWebView sSWebView, Activity activity, j jVar) {
            this.f73748a = downloadBusiness;
            this.f73749b = sSWebView;
            this.f73750c = activity;
            this.f73751d = jVar;
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
            long j3;
            String str5;
            com.bytedance.ies.bullet.service.f.a.b.a aVar;
            com.bytedance.ies.bullet.service.f.a.b.j jVar;
            Long l2;
            String url = this.f73749b.getUrl();
            Activity activity = this.f73750c;
            j jVar2 = this.f73751d;
            if (jVar2 == null || (jVar = jVar2.Y) == null || (l2 = (Long) jVar.b()) == null) {
                j3 = 0;
            } else {
                j3 = l2.longValue();
            }
            j jVar3 = this.f73751d;
            Object obj = null;
            if (jVar3 != null) {
                str5 = jVar3.c();
            } else {
                str5 = null;
            }
            JSONObject a2 = com.ss.android.sdk.activity.a.a(activity, j3, str5, str, url, this.f73749b.getUrl());
            j jVar4 = this.f73751d;
            if (!(jVar4 == null || (aVar = jVar4.an) == null)) {
                obj = aVar.b();
            }
            if (!l.a(obj, (Object) true)) {
                m.a(str);
            }
            this.f73748a.f73742a = str;
            com.ss.android.sdk.activity.a.a(this.f73750c, str, str2, str3, str4, a2);
        }
    }
}
