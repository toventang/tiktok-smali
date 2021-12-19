package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.sticker.p.e;
import com.ss.android.ugc.tools.view.e.b;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132325a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132326b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f132327c;

    /* renamed from: d  reason: collision with root package name */
    private final b f132328d;

    /* renamed from: e  reason: collision with root package name */
    private final j f132329e;

    /* renamed from: f  reason: collision with root package name */
    private final int f132330f = 2;

    static {
        Covode.recordClassIndex(86656);
    }

    k(Context context, String str, boolean z, b bVar, j jVar) {
        this.f132325a = context;
        this.f132326b = str;
        this.f132327c = z;
        this.f132328d = bVar;
        this.f132329e = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f132325a;
        String str = this.f132326b;
        boolean z = this.f132327c;
        b bVar = this.f132328d;
        c.f115629h.a(context, str, z, bVar, new aa.f(this.f132329e, str, this.f132330f, bVar, context, z) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass7 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f132309a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f132310b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f132311c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f132312d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Context f132313e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f132314f;

            static {
                Covode.recordClassIndex(86650);
            }

            @Override // com.ss.android.ugc.aweme.port.in.aa.f
            public final void a(Exception exc) {
                this.f132312d.dismiss();
                new Handler(Looper.getMainLooper()).post(new u(this.f132313e));
                if (this.f132314f) {
                    this.f132309a.a(exc);
                } else {
                    this.f132309a.a(new Bundle());
                }
            }

            @Override // com.ss.android.ugc.aweme.port.in.aa.f
            public final void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar) {
                Bundle bundle = new Bundle();
                if (!AVCommerceServiceImpl.h().a() || cVar.isCommerceMusic()) {
                    e.a(this.f132310b, str);
                    cVar.setMusicPriority(this.f132311c);
                    cr.a().a(cVar);
                    bundle.putString("path", str);
                    this.f132309a.a(bundle);
                    return;
                }
                this.f132309a.a(bundle);
            }

            {
                this.f132309a = r1;
                this.f132310b = r2;
                this.f132311c = r3;
                this.f132312d = r4;
                this.f132313e = r5;
                this.f132314f = r6;
            }
        });
        return null;
    }
}
