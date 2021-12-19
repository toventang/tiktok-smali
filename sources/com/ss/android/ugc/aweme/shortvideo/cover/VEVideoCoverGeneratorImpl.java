package com.ss.android.ugc.aweme.shortvideo.cover;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.cover.a;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.vesdk.x;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VEVideoCoverGeneratorImpl implements au, a {

    /* renamed from: a  reason: collision with root package name */
    private int[] f125221a;

    /* renamed from: b  reason: collision with root package name */
    int f125222b;

    /* renamed from: c  reason: collision with root package name */
    protected int f125223c;

    /* renamed from: d  reason: collision with root package name */
    g f125224d;

    /* renamed from: e  reason: collision with root package name */
    List<Long> f125225e;

    /* renamed from: f  reason: collision with root package name */
    x.a f125226f;

    /* renamed from: g  reason: collision with root package name */
    private String f125227g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f125228h;

    /* renamed from: i  reason: collision with root package name */
    private final String f125229i;

    static {
        Covode.recordClassIndex(82239);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.a
    public final int a() {
        return this.f125222b;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.a
    public final void b() {
        this.f125223c = -1;
        this.f125221a = null;
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f125224d.z();
        List<Long> list = this.f125225e;
        String str = this.f125227g;
        l.d(list, "");
        l.d(str, "");
        if (!list.isEmpty()) {
            c.f149149d.a("tool_performance_fetch_frames", new b().a("duration", n.v(list)).a("count", list.size()).a("scene", str).f149193a);
        }
    }

    /* access modifiers changed from: protected */
    public int[] a(int i2, int i3) {
        int[] iArr = new int[i3];
        int i4 = i2 / i3;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = i4 * i5;
        }
        return iArr;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.a
    public final void a(int i2, int i3, a.AbstractC3267a aVar) {
        int i4 = i2;
        int i5 = i3;
        if (this.f125223c <= 0 || this.f125228h) {
            this.f125223c = this.f125224d.j();
        }
        if (this.f125221a == null || this.f125228h) {
            this.f125221a = a(this.f125223c, this.f125222b);
        }
        int[] iArr = this.f125221a;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i5 > i4 && i4 != -1) {
            i5 = -1;
        } else if (i5 != -1) {
            i4 = -1;
        } else {
            i5 = -1;
        }
        b.i.b(new s(this, iArr, i4, i5, aVar, atomicInteger, System.currentTimeMillis()), b.i.f4824a);
    }

    public VEVideoCoverGeneratorImpl(g gVar, m mVar, int i2, x.a aVar, String str) {
        this(gVar, mVar, i2, aVar, str, (byte) 0);
    }

    private VEVideoCoverGeneratorImpl(g gVar, m mVar, int i2, x.a aVar, String str, byte b2) {
        this.f125225e = new ArrayList();
        this.f125229i = "VEVideoCoverGeneratorImpl";
        mVar.getLifecycle().a(this);
        this.f125224d = gVar;
        this.f125222b = i2;
        this.f125226f = aVar;
        this.f125227g = str;
        this.f125228h = false;
    }
}
