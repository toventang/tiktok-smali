package com.bytedance.lighten.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.a;
import com.bytedance.lighten.a.c.f;
import com.bytedance.lighten.a.c.h;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.c.l;
import com.bytedance.lighten.a.c.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

public class v {
    public static final v P;
    public q A = q.MEDIUM;
    public String B;
    public Executor C;
    public d D = d.DEFAULT;
    public l E;
    public ImageView F;
    public k G;
    public l H;
    public n I;
    public boolean J;
    public boolean K;
    public boolean L;
    public a M;
    public int N = a.f39807a.f39808b;
    public f O;
    private Object Q;

    /* renamed from: a  reason: collision with root package name */
    public Uri f39905a;

    /* renamed from: b  reason: collision with root package name */
    public Context f39906b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39907c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f39908d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39909e;

    /* renamed from: f  reason: collision with root package name */
    public int f39910f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f39911g;

    /* renamed from: h  reason: collision with root package name */
    public int f39912h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f39913i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f39914j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f39915k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f39916l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f39917m = -1;
    public Drawable n;
    public w o;
    public int p = -1;
    public w q;
    public Drawable r;
    public int s;
    public w t;
    public Bitmap.Config u;
    public w v;
    public e w;
    public b x;
    public f y;
    public x z;

    public final v a() {
        this.J = true;
        this.f39910f = 1;
        return this;
    }

    static {
        Covode.recordClassIndex(24620);
        v vVar = new v(new a(Collections.emptyList()));
        vVar.f39905a = Uri.parse("");
        P = vVar;
    }

    public final void c() {
        if (this.E == null && this.F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        r.a(b());
    }

    public final u b() {
        String str;
        a aVar;
        if (!(this.Q == null || this.M != null || this.f39905a != null || r.a().p == null || r.a().p.a() == null)) {
            this.M = r.a().p.a().a(this.Q, this);
        }
        if (this.f39905a == null && ((aVar = this.M) == null || aVar.a())) {
            return null;
        }
        if (this.u == null) {
            this.u = r.a().f39867b;
        }
        if (this.f39910f == -1) {
            this.f39910f = r.a().f39868c;
        }
        if (this == P) {
            Context applicationContext = r.a().f39866a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f39906b = applicationContext;
        }
        if (this.f39906b == null) {
            l lVar = this.E;
            if (lVar instanceof View) {
                Context context = ((View) lVar).getContext();
                this.f39906b = context;
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        this.f39906b = ((ContextWrapper) context).getBaseContext();
                    }
                }
            } else {
                ImageView imageView = this.F;
                if (imageView != null) {
                    Context context2 = imageView.getContext();
                    this.f39906b = context2;
                    if (!(context2 instanceof Activity)) {
                        if (context2 instanceof ContextWrapper) {
                            this.f39906b = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
            }
            if (this.f39906b == null) {
                this.f39906b = r.a().f39866a;
            }
        }
        Context context3 = this.f39906b;
        if (context3 == null || !(context3 instanceof Activity)) {
            str = "";
        } else {
            str = context3.getClass().getSimpleName();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.B)) {
                this.B = str + "-" + this.B;
            } else {
                this.B = str;
            }
        }
        TextUtils.isEmpty(this.B);
        return new u(this);
    }

    public final v b(int[] iArr) {
        if (iArr.length == 2) {
            this.f39914j = iArr[0];
            this.f39915k = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public v(Uri uri) {
        this.f39905a = uri;
    }

    public final v a(h hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        this.z = new x(arrayList);
        return this;
    }

    public v(a aVar) {
        this.M = aVar;
    }

    public final v a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.B = str;
        }
        return this;
    }

    public v(Object obj) {
        this.Q = obj;
    }

    public final v a(int[] iArr) {
        if (iArr.length == 2) {
            this.f39912h = iArr[0];
            this.f39913i = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public v(String str) {
        this.f39905a = Uri.parse(str);
    }

    public final void a(k kVar) {
        if (this.E == null && this.F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        }
        this.G = kVar;
        r.a(b());
    }

    public final void a(n nVar) {
        this.I = nVar;
        r.b(b());
    }

    public final v b(int i2, int i3) {
        this.f39914j = i2;
        this.f39915k = i3;
        return this;
    }

    public final v a(int i2, int i3) {
        this.f39912h = i2;
        this.f39913i = i3;
        return this;
    }

    public final v a(int i2, f fVar) {
        this.N = i2;
        this.O = fVar;
        return this;
    }
}
