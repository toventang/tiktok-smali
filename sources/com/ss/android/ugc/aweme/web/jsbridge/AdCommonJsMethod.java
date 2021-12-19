package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.e;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.k;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class AdCommonJsMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f144914b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f144915a;

    /* renamed from: c  reason: collision with root package name */
    private final e f144916c;

    static {
        Covode.recordClassIndex(94752);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94753);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f144917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdCommonJsMethod f144918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f144919c;

        static {
            Covode.recordClassIndex(94754);
        }

        b(k kVar, AdCommonJsMethod adCommonJsMethod, k kVar2) {
            this.f144917a = kVar;
            this.f144918b = adCommonJsMethod;
            this.f144919c = kVar2;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            String str;
            f.b a2 = f.a();
            a2.f74804a = "draw_ad";
            String str2 = "deeplink_success";
            if (z) {
                str = str2;
            } else {
                str = "deeplink_failed";
            }
            a2.f74805b = str;
            a2.a(Long.valueOf(this.f144917a.f75781a)).e(this.f144917a.f75782b).b(Long.valueOf(this.f144917a.f75783c)).a(this.f144918b.f144915a.get());
            if (!z) {
                str2 = "deeplink_failed";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str2, String.valueOf(this.f144917a.f75781a), this.f144917a.f75782b, String.valueOf(this.f144917a.f75783c)).c();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ k $adInfo$inlined;

        static {
            Covode.recordClassIndex(94755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(2);
            this.$adInfo$inlined = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$adInfo$inlined.f75793m);
            } else {
                a2 = bVar2.a(this.$adInfo$inlined.f75793m);
            }
            l.b(a2, "");
            return a2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AdCommonJsMethod(java.lang.ref.WeakReference<android.content.Context> r6, com.ss.android.sdk.webview.e r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x002c
            com.bytedance.ies.web.a.a r0 = r7.f60185b
        L_0x0004:
            r5.<init>(r0)
            r5.f144915a = r6
            r5.f144916c = r7
            java.lang.String r4 = "openAdUrl"
            java.lang.String r3 = "messageTip"
            java.lang.String r2 = "sendAdLog"
            if (r7 == 0) goto L_0x002b
            com.bytedance.ies.web.a.a r1 = r7.f60185b
            if (r1 == 0) goto L_0x0021
            r0 = r5
            r1.a(r2, r0)
            r1.a(r3, r0)
            r1.a(r4, r0)
        L_0x0021:
            r0 = r5
            r7.a(r2, r0)
            r7.a(r3, r0)
            r7.a(r4, r0)
        L_0x002b:
            return
        L_0x002c:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.<init>(java.lang.ref.WeakReference, com.ss.android.sdk.webview.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a9, code lost:
        if (r7 != null) goto L_0x0198;
     */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handle(org.json.JSONObject r18, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r19) {
        /*
        // Method dump skipped, instructions count: 891
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.handle(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public /* synthetic */ AdCommonJsMethod(WeakReference weakReference, e eVar, byte b2) {
        this(weakReference, eVar);
    }
}
