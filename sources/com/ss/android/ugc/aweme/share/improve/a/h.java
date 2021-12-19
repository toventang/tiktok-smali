package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.m.l;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.util.concurrent.Callable;

public final class h extends d {

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f123723c;

    /* renamed from: d  reason: collision with root package name */
    public final String f123724d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f123725e;

    /* renamed from: f  reason: collision with root package name */
    public final int f123726f;

    /* renamed from: g  reason: collision with root package name */
    public final PrivacyCert f123727g;

    /* renamed from: h  reason: collision with root package name */
    private final String f123728h;

    static {
        Covode.recordClassIndex(81211);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.a.d, com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return this.f123723c.getAwemeControl().canShare();
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f123729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SharePackage f123730b;

        static {
            Covode.recordClassIndex(81212);
        }

        a(h hVar, SharePackage sharePackage) {
            this.f123729a = hVar;
            this.f123730b = sharePackage;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String replaceAll;
            String str = this.f123730b.f124590d;
            ShareInfo shareInfo = this.f123729a.f123723c.getShareInfo();
            if (shareInfo == null) {
                return "";
            }
            String shareUrl = shareInfo.getShareUrl();
            if (TextUtils.isEmpty(shareUrl) || shareUrl.contains("utm_source")) {
                replaceAll = shareUrl.replaceAll("utm_source=\\w*_?\\w?", "utm_source=".concat("copy_link"));
            } else {
                g gVar = new g(shareUrl);
                gVar.a("utm_source", "copy_link");
                gVar.a("utm_campaign", "client_share");
                gVar.a("utm_medium", "android");
                gVar.a("app", "musically");
                gVar.a("iid", AppLog.getInstallId());
                replaceAll = gVar.a();
            }
            shareInfo.setShareUrl(replaceAll);
            String shareUrl2 = shareInfo.getShareUrl();
            if (in.d()) {
                return shareUrl2;
            }
            return l.a(str, "copy_link", shareUrl2).cE_();
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f123731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qrcode.view.a f123732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123733c;

        static {
            Covode.recordClassIndex(81213);
        }

        b(h hVar, com.ss.android.ugc.aweme.qrcode.view.a aVar, Context context) {
            this.f123731a = hVar;
            this.f123732b = aVar;
            this.f123733c = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            com.ss.android.ugc.aweme.qrcode.view.a aVar = this.f123732b;
            if (aVar != null) {
                aVar.dismiss();
            }
            if (this.f123731a.f123724d.length() != 0) {
                str = this.f123731a.f123724d + ' ' + str;
            }
            h hVar = this.f123731a;
            h.f.b.l.b(str, "");
            hVar.a(str, this.f123733c, this.f123731a.f123727g);
            if (!this.f123731a.f123725e) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f123733c).a(this.f123731a.f123726f).a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.improve.a.d, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        Aweme aweme;
        h.f.b.l.d(context, "");
        h.f.b.l.d(sharePackage, "");
        if (!com.ss.android.ugc.aweme.share.improve.c.a.a(this, context, this.f123723c, this.f123728h) || !this.f123723c.getAwemeControl().canShare()) {
            return;
        }
        if ((this.f123723c.getAwemeType() != 13 || aw.a(this.f123723c, context)) && (aweme = this.f123723c) != null && aweme.getShareInfo() != null) {
            h.f.b.l.d(this.f123723c, "");
            com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(context, context.getResources().getString(R.string.bdz));
            a2.a();
            f.a.h.a((Callable) new a(this, sharePackage)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, a2, context));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(Aweme aweme, String str, String str2, boolean z, int i2, PrivacyCert privacyCert) {
        super(str, false);
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(privacyCert, "");
        this.f123723c = aweme;
        this.f123728h = str;
        this.f123724d = str2;
        this.f123725e = z;
        this.f123726f = i2;
        this.f123727g = privacyCert;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, com.bytedance.bpea.basics.PrivacyCert r13, int r14) {
        /*
            r7 = this;
            r2 = r9
            r4 = r11
            r5 = r12
            r0 = r14 & 2
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x000a
            r2 = r3
        L_0x000a:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0025
        L_0x000e:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r4 = 0
        L_0x0014:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x001e
            r0 = 2131822777(0x7f1108b9, float:1.9278335E38)
            r5 = 2131822777(0x7f1108b9, float:1.9278335E38)
        L_0x001e:
            r0 = r7
            r1 = r8
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0025:
            r3 = r10
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.improve.a.h.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, int, com.bytedance.bpea.basics.PrivacyCert, int):void");
    }
}
