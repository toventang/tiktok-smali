package com.ss.texturerender.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.n;
import com.ss.texturerender.p;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected int f151773a;

    /* renamed from: b  reason: collision with root package name */
    protected int f151774b;

    /* renamed from: c  reason: collision with root package name */
    protected int f151775c;

    /* renamed from: d  reason: collision with root package name */
    public p f151776d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f151777e;

    /* renamed from: f  reason: collision with root package name */
    public n f151778f;

    /* renamed from: g  reason: collision with root package name */
    public a f151779g;

    /* renamed from: h  reason: collision with root package name */
    public a f151780h;

    static {
        Covode.recordClassIndex(101226);
    }

    public abstract f a(f fVar, i iVar);

    public String b(int i2) {
        return "";
    }

    public a a() {
        a aVar = this.f151780h;
        b();
        return aVar;
    }

    private void b() {
        a aVar = this.f151779g;
        if (aVar != null) {
            aVar.f151780h = this.f151780h;
        }
        a aVar2 = this.f151780h;
        if (aVar2 != null) {
            aVar2.f151779g = aVar;
        }
        this.f151780h = null;
        this.f151779g = null;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[").append(this.f151775c).append("]->");
        a aVar = this.f151780h;
        if (aVar != null) {
            str = aVar.toString();
        } else {
            str = "end";
        }
        return append.append(str).toString();
    }

    public int a(Bundle bundle) {
        this.f151777e = bundle;
        return 0;
    }

    public a(int i2) {
        this.f151773a = i2;
    }

    public void b(Bundle bundle) {
        a aVar = this.f151780h;
        if (aVar != null) {
            aVar.b(bundle);
        }
    }

    public int a(int i2) {
        if (i2 == 10004) {
            return this.f151774b;
        }
        if (i2 == 10005) {
            return this.f151773a;
        }
        if (i2 != 10011) {
            return -1;
        }
        return this.f151775c;
    }

    public final void a(a aVar) {
        a aVar2;
        a aVar3 = this;
        while (true) {
            int i2 = aVar.f151775c;
            if (i2 <= aVar3.f151775c) {
                aVar2 = aVar3.f151780h;
                if (aVar2 == null) {
                    aVar3.f151780h = aVar;
                    return;
                } else if (aVar2.f151775c < i2) {
                    aVar.f151779g = aVar3;
                    aVar.f151780h = aVar2;
                    aVar3.f151780h.f151779g = aVar;
                    aVar3.f151780h = aVar;
                    return;
                }
            } else {
                aVar2 = aVar3.f151779g;
                if (aVar2 == null) {
                    aVar3.f151779g = aVar;
                    return;
                } else if (aVar2.f151775c >= i2) {
                    aVar2.f151780h = aVar;
                    aVar.f151779g = aVar2;
                    aVar.f151780h = aVar3;
                    aVar3.f151779g = aVar;
                    return;
                }
            }
            aVar3 = aVar2;
        }
    }

    public void a(int i2, float f2) {
        a aVar = this.f151780h;
        if (aVar != null) {
            aVar.a(i2, f2);
        }
    }

    public void a(int i2, int i3) {
        a aVar;
        if (i2 != 10011) {
            a aVar2 = this.f151780h;
            if (aVar2 != null) {
                aVar2.a(i2, i3);
                return;
            }
            return;
        }
        this.f151775c = i3;
        a aVar3 = this.f151779g;
        if ((aVar3 != null && i3 > aVar3.f151775c) || ((aVar = this.f151780h) != null && i3 < aVar.f151775c)) {
            b();
            a(this);
        }
    }

    public void a(int i2, float[] fArr) {
        a aVar = this.f151780h;
        if (aVar != null) {
            aVar.a(i2, fArr);
        }
    }
}
