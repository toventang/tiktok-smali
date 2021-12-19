package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.e.a;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    private final a f124049a;

    /* renamed from: b  reason: collision with root package name */
    private final c f124050b;

    static {
        Covode.recordClassIndex(81447);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return this.f124049a.c();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return this.f124049a.a();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return this.f124049a.e();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        String b2 = this.f124049a.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    public n(a aVar, c cVar) {
        l.d(aVar, "");
        l.d(cVar, "");
        this.f124049a = aVar;
        this.f124050b = cVar;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        this.f124049a.a(context);
    }
}
