package com.ss.android.ugc.aweme.bullet.business;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.improve.a.d;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class ShareBusiness extends AbsShareBusiness {

    /* renamed from: l  reason: collision with root package name */
    public WebView f69250l;

    static {
        Covode.recordClassIndex(42695);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        if (r8.f69199e != false) goto L_0x00a8;
     */
    @Override // com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.business.ShareBusiness.a():void");
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShareBusiness f69251a;

        static {
            Covode.recordClassIndex(42696);
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void b(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(ShareBusiness shareBusiness) {
            this.f69251a = shareBusiness;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
            if (hVar instanceof d) {
                this.f69251a.a(hVar.c());
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b
        public final void a(b bVar, boolean z, SharePackage sharePackage, Context context) {
            l.d(bVar, "");
            l.d(context, "");
            this.f69251a.a(bVar.a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }
}
