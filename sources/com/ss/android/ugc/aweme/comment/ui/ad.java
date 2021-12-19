package com.ss.android.ugc.aweme.comment.ui;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.g;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

final /* synthetic */ class ad implements b {

    /* renamed from: a  reason: collision with root package name */
    private final k f72502a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f72503b;

    /* renamed from: c  reason: collision with root package name */
    private final g f72504c;

    static {
        Covode.recordClassIndex(44683);
    }

    ad(k kVar, Resources resources, g gVar) {
        this.f72502a = kVar;
        this.f72503b = resources;
        this.f72504c = gVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        k kVar = this.f72502a;
        Resources resources = this.f72503b;
        g gVar = this.f72504c;
        com.bytedance.tux.dialog.b.b bVar = (com.bytedance.tux.dialog.b.b) obj;
        bVar.f44820b = true;
        bVar.a(resources.getString(R.string.alh), new au(kVar, gVar));
        bVar.b(resources.getString(R.string.alg), new av(kVar));
        return null;
    }
}
