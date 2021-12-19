package com.squareup.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;
import com.squareup.b.w;
import java.util.concurrent.atomic.AtomicInteger;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicInteger f58138c = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    final w.a f58139a;

    /* renamed from: b  reason: collision with root package name */
    boolean f58140b;

    /* renamed from: d  reason: collision with root package name */
    private final t f58141d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58142e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f58143f;

    /* renamed from: g  reason: collision with root package name */
    private int f58144g;

    /* renamed from: h  reason: collision with root package name */
    private int f58145h;

    /* renamed from: i  reason: collision with root package name */
    private int f58146i;

    /* renamed from: j  reason: collision with root package name */
    private int f58147j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f58148k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f58149l;

    /* renamed from: m  reason: collision with root package name */
    private Object f58150m;

    static {
        Covode.recordClassIndex(36091);
    }

    x() {
        this.f58143f = true;
        this.f58139a = new w.a(null, null);
    }

    private Drawable a() {
        if (this.f58144g != 0) {
            return this.f58141d.f58076d.getResources().getDrawable(this.f58144g);
        }
        return this.f58148k;
    }

    private w a(long j2) {
        int andIncrement = f58138c.getAndIncrement();
        w c2 = this.f58139a.c();
        c2.f58112a = andIncrement;
        c2.f58113b = j2;
        boolean z = this.f58141d.f58085m;
        if (z) {
            ae.a("Main", "created", c2.b(), c2.toString());
        }
        w a2 = this.f58141d.a(c2);
        if (a2 != c2) {
            a2.f58112a = andIncrement;
            a2.f58113b = j2;
            if (z) {
                ae.a("Main", "changed", a2.a(), "into ".concat(String.valueOf(a2)));
            }
        }
        return a2;
    }

    public x(t tVar, Uri uri) {
        this.f58143f = true;
        if (!tVar.n) {
            this.f58141d = tVar;
            this.f58139a = new w.a(uri, tVar.f58083k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    public final void a(ImageView imageView, e eVar) {
        Bitmap a2;
        long nanoTime = System.nanoTime();
        ae.a();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f58139a.a()) {
            this.f58141d.a(imageView);
            if (this.f58143f) {
                u.a(imageView, a());
            }
        } else {
            if (this.f58140b) {
                if (!this.f58139a.b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f58143f) {
                            u.a(imageView, a());
                        }
                        this.f58141d.a(imageView, new h(this, imageView, eVar));
                        return;
                    }
                    this.f58139a.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w a3 = a(nanoTime);
            String a4 = ae.a(a3);
            if (!p.a(this.f58146i) || (a2 = this.f58141d.a(a4)) == null) {
                if (this.f58143f) {
                    u.a(imageView, a());
                }
                this.f58141d.a((a) new l(this.f58141d, imageView, a3, this.f58146i, this.f58147j, this.f58145h, this.f58149l, a4, this.f58150m, eVar, this.f58142e));
                return;
            }
            this.f58141d.a(imageView);
            u.a(imageView, this.f58141d.f58076d, a2, t.d.MEMORY, this.f58142e, this.f58141d.f58084l);
            if (this.f58141d.f58085m) {
                ae.a("Main", "completed", a3.b(), "from " + t.d.MEMORY);
            }
            if (eVar != null) {
                eVar.a();
            }
        }
    }
}
