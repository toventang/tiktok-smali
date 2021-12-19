package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.a.a;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f156398a;

    /* renamed from: b  reason: collision with root package name */
    private final com.zhihu.matisse.internal.entity.c f156399b;

    static {
        Covode.recordClassIndex(103873);
    }

    public final c a() {
        this.f156399b.f156434c = true;
        return this;
    }

    public final c b() {
        this.f156399b.f156435d = R.style.fz;
        return this;
    }

    public final c c() {
        this.f156399b.f156437f = false;
        return this;
    }

    public final c d() {
        this.f156399b.f156436e = -1;
        return this;
    }

    public final c e() {
        this.f156399b.o = 0.85f;
        return this;
    }

    public final c a(a aVar) {
        if (this.f156399b.f156441j == null) {
            this.f156399b.f156441j = new ArrayList();
        }
        this.f156399b.f156441j.add(aVar);
        return this;
    }

    public final void b(int i2) {
        Activity a2 = this.f156398a.a();
        if (a2 != null) {
            Intent intent = new Intent(a2, MatisseActivity.class);
            Fragment b2 = this.f156398a.b();
            if (b2 != null) {
                b2.startActivityForResult(intent, i2);
            } else {
                a2.startActivityForResult(intent, i2);
            }
        }
    }

    public final c a(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        } else if (this.f156399b.f156439h > 0 || this.f156399b.f156440i > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        } else {
            this.f156399b.f156438g = i2;
            return this;
        }
    }

    c(a aVar, Set<b> set) {
        this.f156398a = aVar;
        com.zhihu.matisse.internal.entity.c cVar = c.a.f156445a;
        cVar.f156432a = null;
        cVar.f156433b = true;
        cVar.f156434c = false;
        cVar.f156435d = R.style.g0;
        cVar.f156436e = 0;
        cVar.f156437f = false;
        cVar.f156438g = 1;
        cVar.f156439h = 0;
        cVar.f156440i = 0;
        cVar.f156441j = null;
        cVar.f156442k = false;
        cVar.f156443l = null;
        cVar.f156444m = 3;
        cVar.n = 0;
        cVar.o = 0.5f;
        cVar.p = true;
        cVar.r = false;
        cVar.s = false;
        cVar.t = Integer.MAX_VALUE;
        this.f156399b = cVar;
        cVar.f156432a = set;
        cVar.f156433b = true;
        cVar.f156436e = -1;
    }
}
