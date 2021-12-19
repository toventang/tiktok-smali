package com.ss.android.ugc.aweme.discover.lynx.b;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f81434a;

    /* renamed from: b  reason: collision with root package name */
    public final View f81435b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f81436c;

    /* renamed from: d  reason: collision with root package name */
    public final i f81437d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f81438e;

    static {
        Covode.recordClassIndex(50605);
    }

    private a(d dVar, View view, Uri uri, i iVar) {
        l.d(dVar, "");
        this.f81434a = dVar;
        this.f81435b = view;
        this.f81436c = uri;
        this.f81437d = iVar;
        this.f81438e = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, View view, Uri uri, i iVar, int i2) {
        this(dVar, (i2 & 2) != 0 ? null : view, (i2 & 4) != 0 ? null : uri, (i2 & 8) != 0 ? null : iVar);
    }
}
