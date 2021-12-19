package com.ss.android.ugc.aweme.im.service.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class ImWebSharePackage extends SharePackage {

    /* renamed from: a  reason: collision with root package name */
    public String f103936a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f103937b = true;

    static {
        Covode.recordClassIndex(66575);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImWebSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final /* synthetic */ h a(b bVar) {
        l.d(bVar, "");
        k kVar = new k(this.f124594h, this.f124592f, this.f124593g);
        String a2 = e.a(this.f103936a);
        if (!TextUtils.isEmpty(a2)) {
            l.b(a2, "");
            kVar.a("thumb_path", a2);
        }
        return kVar;
    }
}
