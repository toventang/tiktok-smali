package com.ss.android.ugc.aweme.im.sdk.relations.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.e;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.g;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.h;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    public SharePackage f103350a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f103351b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f103352c;

    static {
        Covode.recordClassIndex(66232);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        int i2;
        h eVar;
        l.d(cls, "");
        SharePackage sharePackage = this.f103350a;
        boolean z = this.f103351b;
        boolean z2 = this.f103352c;
        if (sharePackage != null) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        c cVar = new c(i2, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.h.a(sharePackage));
        if (sharePackage != null) {
            cVar.f102984e = true;
        }
        cVar.f102986g = z;
        if (z2) {
            eVar = new g(cVar);
        } else {
            eVar = new e(cVar);
        }
        return new RelationViewModel(eVar);
    }

    public a(SharePackage sharePackage, boolean z, boolean z2) {
        this.f103350a = sharePackage;
        this.f103351b = z;
        this.f103352c = z2;
    }
}
