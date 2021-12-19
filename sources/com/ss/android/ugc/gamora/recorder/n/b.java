package com.ss.android.ugc.gamora.recorder.n;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.l;

public final class b implements Cloneable, Comparable<b> {

    /* renamed from: a  reason: collision with root package name */
    public final int f148158a;

    /* renamed from: b  reason: collision with root package name */
    public int f148159b;

    /* renamed from: c  reason: collision with root package name */
    public l f148160c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f148161d;

    /* renamed from: e  reason: collision with root package name */
    public a f148162e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f148163f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f148164g;

    /* renamed from: h  reason: collision with root package name */
    public int f148165h;

    /* renamed from: i  reason: collision with root package name */
    public a f148166i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f148167j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f148168k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f148169l;

    /* renamed from: m  reason: collision with root package name */
    private int f148170m;

    public interface a {
        static {
            Covode.recordClassIndex(97658);
        }

        void a(View view);
    }

    static {
        Covode.recordClassIndex(97657);
    }

    public final int hashCode() {
        return this.f148158a;
    }

    /* renamed from: a */
    public final b clone() {
        b bVar = new b(this.f148158a, this.f148159b, this.f148162e, this.f148165h, this.f148168k);
        bVar.f148160c = this.f148160c;
        bVar.f148161d = this.f148161d;
        bVar.f148163f = this.f148163f;
        bVar.f148164g = this.f148164g;
        bVar.f148167j = this.f148167j;
        bVar.f148166i = this.f148166i;
        return bVar;
    }

    public final void a(boolean z) {
        int i2;
        this.f148168k = z;
        if (z) {
            i2 = this.f148170m;
        } else {
            i2 = -1;
        }
        this.f148165h = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(b bVar) {
        return Integer.compare(this.f148158a, bVar.f148158a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f148158a == bVar.f148158a && this.f148159b == bVar.f148159b && this.f148165h == bVar.f148165h && this.f148161d == bVar.f148161d && this.f148160c == bVar.f148160c) {
            return true;
        }
        return false;
    }

    public b(int i2, int i3, a aVar, int i4, boolean z) {
        this(i2, i3, aVar, i4, true, z);
    }

    public b(int i2, int i3, a aVar, int i4, boolean z, boolean z2) {
        int i5;
        this.f148161d = true;
        this.f148167j = true;
        this.f148158a = i2;
        this.f148159b = i3;
        this.f148162e = aVar;
        if (z2) {
            i5 = i4;
        } else {
            i5 = -1;
        }
        this.f148165h = i5;
        this.f148170m = i4;
        this.f148161d = z;
        this.f148168k = z2;
    }
}
