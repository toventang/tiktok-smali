package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.j;
import com.ss.android.ugc.aweme.g.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f79594a;

    /* renamed from: b  reason: collision with root package name */
    public final j f79595b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79596c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f79597d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f79598e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f79599f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f79600g = true;

    static {
        Covode.recordClassIndex(49445);
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void f() {
        g();
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void b() {
        j.a.b(this.f79595b);
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void c() {
        j.a.a(this.f79595b);
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void a() {
        this.f79594a.setVisibility(8);
        this.f79600g = false;
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void d() {
        if (this.f79597d) {
            h();
        } else {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void e() {
        if (this.f79597d) {
            g();
        } else {
            h();
        }
    }

    private void g() {
        if (this.f79600g && !this.f79596c) {
            this.f79594a.setVisibility(0);
            this.f79594a.startAnimation(a.a());
            this.f79596c = true;
            j.a.a(this.f79595b);
        }
    }

    private void h() {
        if (this.f79600g && this.f79596c) {
            j.a.b(this.f79595b);
            this.f79594a.startAnimation(a.b());
            this.f79594a.setVisibility(8);
            this.f79596c = false;
        }
    }

    public b(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        this.f79598e = context;
        this.f79599f = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e9v);
        l.b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f79594a = viewGroup2;
        this.f79595b = new c(context, viewGroup2);
        this.f79596c = true;
    }
}
