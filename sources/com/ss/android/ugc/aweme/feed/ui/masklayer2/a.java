package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.e;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c;
import com.ss.android.ugc.aweme.settings.DislikeReason;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a implements s<ag>, e, i {

    /* renamed from: a  reason: collision with root package name */
    public final SharePackage f94864a;

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f94865b;

    /* renamed from: c  reason: collision with root package name */
    public final String f94866c;

    static {
        Covode.recordClassIndex(60169);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.i.s
    public final /* bridge */ /* synthetic */ void a(ag agVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    public final SharePackage a() {
        return this.f94864a;
    }

    @Override // com.ss.android.ugc.aweme.feed.n.e
    public final String a_(boolean z) {
        return this.f94866c;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    public final com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e a(f fVar) {
        l.d(fVar, "");
        return new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e(this, fVar);
    }

    public final List<e> c(f fVar) {
        l.d(fVar, "");
        ArrayList arrayList = new ArrayList();
        try {
            Object a2 = SettingsManager.a().a("dislike_reasons", DislikeReason[].class);
            l.b(a2, "");
            DislikeReason[] dislikeReasonArr = (DislikeReason[]) a2;
            for (DislikeReason dislikeReason : dislikeReasonArr) {
                arrayList.add(new e(new c(dislikeReason.getId(), dislikeReason.getText()), new g(this, fVar)));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c7  */
    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.feed.ui.masklayer2.g> b(com.ss.android.ugc.aweme.feed.ui.masklayer2.f r14) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.b(com.ss.android.ugc.aweme.feed.ui.masklayer2.f):java.util.List");
    }

    public a(Aweme aweme, String str) {
        l.d(str, "");
        this.f94865b = aweme;
        this.f94866c = str;
        ShareService shareService = ah.f123352a;
        Context a2 = d.a();
        if (aweme == null) {
            l.b();
        }
        this.f94864a = shareService.a(a2, aweme, str, "long_press_download");
    }
}
