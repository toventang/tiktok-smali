package com.ss.android.ugc.aweme.bullet.module.base;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.business.a;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import h.f.b.l;

public class b extends a {
    static {
        Covode.recordClassIndex(42805);
    }

    public /* synthetic */ b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        this(bVar, new a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.bullet.module.base.a
    public final void a(e eVar) {
        l.d(eVar, "");
        OpenURLHintLayout openURLHintLayout = this.f69401h;
        if (openURLHintLayout != null) {
            openURLHintLayout.a(AwemeService.b().d(eVar.f()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r6 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r14 != null) goto L_0x001c;
     */
    @Override // com.ss.android.ugc.aweme.bullet.b.a, com.bytedance.ies.bullet.ui.common.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.c.e.a.b b(android.content.Context r14) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.b.b(android.content.Context):com.bytedance.ies.bullet.c.e.a.b");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        super(bVar, bVar2);
        l.d(bVar, "");
        l.d(bVar2, "");
    }
}
