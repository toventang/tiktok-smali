package com.ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.b.f;
import com.ss.android.ugc.aweme.emoji.i.b;
import com.ss.android.ugc.aweme.emoji.sysemoji.q;
import java.util.ArrayList;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public f f89277a;

    /* renamed from: b  reason: collision with root package name */
    public List<f> f89278b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f89279c;

    /* renamed from: d  reason: collision with root package name */
    private b f89280d;

    /* renamed from: e  reason: collision with root package name */
    private q f89281e;

    /* renamed from: f  reason: collision with root package name */
    private d f89282f;

    static {
        Covode.recordClassIndex(56103);
    }

    public final int b() {
        return this.f89278b.size();
    }

    public final int a() {
        f fVar = this.f89277a;
        if (fVar == null) {
            return 0;
        }
        return fVar.f();
    }

    public final f e(int i2) {
        return this.f89278b.get(i2);
    }

    private void a(f fVar) {
        if (this.f89278b == null) {
            this.f89278b = new ArrayList();
        }
        this.f89278b.add(fVar);
    }

    public final f b(int i2) {
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (f fVar : this.f89278b) {
            i3 += fVar.g();
            if (i2 < i3) {
                return fVar;
            }
        }
        return null;
    }

    public final void a(int i2) {
        if (i2 >= 0 && i2 < b()) {
            this.f89279c = i2;
            this.f89277a = this.f89278b.get(i2);
        }
    }

    public final List<a> c(int i2) {
        if (i2 < 0) {
            return new ArrayList();
        }
        int i3 = 0;
        for (f fVar : this.f89278b) {
            if (i2 < fVar.g() + i3) {
                return fVar.b(i2 - i3);
            }
            i3 += fVar.g();
        }
        return new ArrayList();
    }

    public final int d(int i2) {
        if (i2 < 0) {
            return 0;
        }
        int i3 = 0;
        for (f fVar : this.f89278b) {
            if (i2 < fVar.g() + i3) {
                return i2 - i3;
            }
            i3 += fVar.g();
        }
        return 0;
    }

    public m(d dVar) {
        this.f89282f = dVar;
        if (this.f89282f.f89223a) {
            if (this.f89280d == null) {
                this.f89280d = new b(d.a());
            }
            a(this.f89280d);
        }
        if (this.f89282f.f89227e) {
            if (this.f89281e == null) {
                this.f89281e = new q(d.a(), this.f89282f.f89229g);
            }
            a(this.f89281e);
        }
        a(0);
    }
}
