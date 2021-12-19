package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.h.c.a.b;
import com.ss.android.ugc.tools.utils.j;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public n f135880a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.story.h.c.a.b f135881b;

    /* renamed from: c  reason: collision with root package name */
    protected e f135882c;

    /* renamed from: d  reason: collision with root package name */
    public q f135883d;

    /* renamed from: e  reason: collision with root package name */
    protected b f135884e;

    /* renamed from: f  reason: collision with root package name */
    protected e f135885f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f135886g;

    /* renamed from: h  reason: collision with root package name */
    public int f135887h;

    /* renamed from: i  reason: collision with root package name */
    protected int f135888i;

    /* renamed from: j  reason: collision with root package name */
    protected String f135889j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f135890k;

    public interface b {
        static {
            Covode.recordClassIndex(88802);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(88800);
    }

    public int a(int i2, String str) {
        return 0;
    }

    public void a() {
    }

    public final void b() {
        this.f135886g = true;
        n nVar = this.f135880a;
        if (nVar != null) {
            nVar.c();
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.story.h.c.a.b bVar = this.f135881b;
        if (bVar != null) {
            bVar.a();
        }
        a("");
    }

    public final void d() {
        com.ss.android.ugc.aweme.story.h.c.a.b bVar = this.f135881b;
        if (bVar != null) {
            bVar.a(new a());
        }
    }

    class a implements b.a {
        static {
            Covode.recordClassIndex(88801);
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void c(int i2) {
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void a(int i2) {
            if (r.this.f135886g) {
                if (r.this.f135880a != null) {
                    r.this.f135880a.d();
                    r.this.f135880a.a(i2);
                }
                if (r.this.f135884e != null) {
                    r.this.f135884e.a(true);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.story.h.c.a.b.a
        public final void b(int i2) {
            if (r.this.f135886g) {
                r.this.f135886g = false;
                if (r.this.f135880a != null) {
                    r.this.a(r.this.f135880a.getText());
                    r.this.f135880a.setVisibility(8);
                    r.this.f135880a.setText("");
                }
                if (r.this.f135882c != null) {
                    r.this.f135882c.a();
                }
                if (r.this.f135884e != null) {
                    r.this.f135884e.a(false);
                }
            }
        }
    }

    public r a(n nVar) {
        this.f135880a = nVar;
        nVar.setVisibility(8);
        return this;
    }

    public final r a(b bVar) {
        this.f135884e = bVar;
        return this;
    }

    public final void a(String str) {
        q qVar;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        e eVar = this.f135882c;
        if (eVar != null && (qVar = this.f135883d) != null) {
            this.f135889j = str;
            eVar.a(str, qVar.f135877b, this.f135883d.f135878c, this.f135883d.f135879d);
        }
    }

    public r(e eVar, e eVar2, j jVar) {
        if (eVar != null) {
            this.f135885f = eVar;
            this.f135882c = eVar2;
            this.f135881b = new com.ss.android.ugc.aweme.story.h.c.a.b(eVar, jVar);
        }
    }
}
