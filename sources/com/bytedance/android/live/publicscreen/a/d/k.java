package com.bytedance.android.live.publicscreen.a.d;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public abstract class k<MESSAGE extends com.bytedance.android.livesdk.ac.b.a> implements g, i, com.bytedance.android.livesdk.chatroom.f.b {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f12188b;

    /* renamed from: c  reason: collision with root package name */
    protected g f12189c;

    /* renamed from: d  reason: collision with root package name */
    public final MESSAGE f12190d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12191e;

    /* renamed from: f  reason: collision with root package name */
    private final a f12192f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final c f12193g = new c();

    /* renamed from: h  reason: collision with root package name */
    private final b f12194h = new b();

    public interface a {
        static {
            Covode.recordClassIndex(6708);
        }

        void a(Bitmap bitmap, k<? extends com.bytedance.android.livesdk.ac.b.a> kVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(6709);
        }

        void a(Spannable spannable);
    }

    static {
        Covode.recordClassIndex(6707);
    }

    public boolean B() {
        return true;
    }

    public ImageModel J() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence a();

    @Override // com.bytedance.android.live.publicscreen.a.d.d
    public void e() {
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.d
    public void f() {
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.d
    public void g() {
    }

    public int h_() {
        return 2131234646;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.f
    public boolean k() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public boolean m() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public boolean n() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public boolean o() {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public long p() {
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.d
    public final a d() {
        return this.f12192f;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.e
    public final b h() {
        return this.f12194h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean i() {
        return this.f12191e;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.f
    public final c l() {
        return this.f12193g;
    }

    @Override // com.bytedance.android.livesdk.chatroom.f.b
    public final int G() {
        return y.b((int) R.color.a0e);
    }

    @Override // com.bytedance.android.livesdk.chatroom.f.b
    public final int H() {
        return y.b((int) R.color.a0e);
    }

    @Override // com.bytedance.android.livesdk.chatroom.f.b
    public final int I() {
        return y.b((int) R.color.a1t);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public final long q() {
        return this.f12190d.getMessageId();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.h
    public void r() {
        d();
        this.f12188b = null;
    }

    public final g A() {
        g gVar = this.f12189c;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        return gVar;
    }

    public final boolean C() {
        g gVar = this.f12189c;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        return gVar.f12205i;
    }

    public final long E() {
        User b2 = b();
        if (b2 != null) {
            return b2.getId();
        }
        return 0;
    }

    public com.bytedance.android.livesdk.model.message.c.b F() {
        com.bytedance.android.livesdkapi.h.b bVar = this.f12190d.O;
        if (bVar != null) {
            return bVar.f23218j;
        }
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.f
    public final boolean j() {
        if (i()) {
            return false;
        }
        return k();
    }

    public final boolean D() {
        if (E() == 0) {
            return false;
        }
        long E = E();
        g gVar = this.f12189c;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        if (E == gVar.f12199c) {
            return true;
        }
        return false;
    }

    public final CharSequence z() {
        String a2;
        if (TextUtils.isEmpty(this.f12188b)) {
            CharSequence charSequence = null;
            if (!B() || !this.f12190d.a()) {
                charSequence = a();
            } else {
                com.bytedance.android.livesdk.model.message.c.b F = F();
                if (F != null) {
                    String str = F.f19422b;
                    String str2 = F.f19421a;
                    if (!(str2 == null || str2.length() == 0 || (a2 = com.bytedance.android.livesdk.i18n.b.a().a(F.f19421a)) == null || a2.length() == 0)) {
                        str = a2;
                    }
                    if (!(str == null || str.length() == 0)) {
                        charSequence = c.a(str, F, this);
                    }
                }
            }
            this.f12188b = charSequence;
        }
        return this.f12188b;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.g
    public final void a(g gVar) {
        l.d(gVar, "");
        this.f12189c = gVar;
        l.d(gVar, "");
        b(gVar);
    }

    public k(MESSAGE message) {
        l.d(message, "");
        this.f12190d = message;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.g
    public void b(g gVar) {
        boolean z;
        l.d(gVar, "");
        l.d(gVar, "");
        long E = E();
        f b2 = u.a().b();
        l.b(b2, "");
        if (E == b2.c()) {
            z = true;
        } else {
            z = false;
        }
        this.f12191e = z;
        this.f12188b = null;
    }
}
