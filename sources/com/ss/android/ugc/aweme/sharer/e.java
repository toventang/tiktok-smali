package com.ss.android.ugc.aweme.sharer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import h.f.b.l;

public abstract class e extends a {

    /* renamed from: f  reason: collision with root package name */
    public final b f124527f;

    static {
        Covode.recordClassIndex(81779);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return this.f124527f.b();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public boolean c() {
        return this.f124527f.c();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final float d() {
        return this.f124527f.d();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return this.f124527f.a();
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        return this.f124527f.a(context);
    }

    public e(b bVar) {
        l.d(bVar, "");
        this.f124527f = bVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean b(Context context) {
        l.d(context, "");
        return this.f124527f.b(context);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final void a(RemoteImageView remoteImageView, boolean z) {
        l.d(remoteImageView, "");
        this.f124527f.a(remoteImageView, z);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(Context context, h hVar) {
        l.d(context, "");
        l.d(hVar, "");
        return this.f124527f.a(context, hVar);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b, com.ss.android.ugc.aweme.sharer.a
    public final boolean a(k kVar, Context context) {
        l.d(kVar, "");
        l.d(context, "");
        return this.f124527f.a(kVar, context);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(l lVar, Context context) {
        l.d(lVar, "");
        l.d(context, "");
        return this.f124527f.a(lVar, context);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(m mVar, Context context) {
        l.d(mVar, "");
        l.d(context, "");
        return this.f124527f.a(mVar, context);
    }

    @Override // com.ss.android.ugc.aweme.sharer.b
    public final boolean a(n nVar, Context context) {
        l.d(nVar, "");
        l.d(context, "");
        return this.f124527f.a(nVar, context);
    }
}
