package androidx.k;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.k.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends m {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<m> f3348a = new ArrayList<>();
    int p;
    boolean q = false;
    private boolean r = true;
    private int s = 0;

    static {
        Covode.recordClassIndex(1235);
    }

    @Override // androidx.k.m
    public final void a(s sVar) {
        if (a(sVar.f3356b)) {
            Iterator<m> it = this.f3348a.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.a(sVar.f3356b)) {
                    next.a(sVar);
                    sVar.f3357c.add(next);
                }
            }
        }
    }

    @Override // androidx.k.m
    public final void a(p pVar) {
        super.a(pVar);
        this.s |= 2;
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3348a.get(i2).a(pVar);
        }
    }

    @Override // androidx.k.m, java.lang.Object
    public /* synthetic */ Object clone() {
        return clone();
    }

    @Override // androidx.k.m
    public final m e() {
        q qVar = (q) super.clone();
        qVar.f3348a = new ArrayList<>();
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.a(this.f3348a.get(i2).clone());
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.k.m
    public final void b() {
        if (this.f3348a.isEmpty()) {
            c();
            d();
            return;
        }
        a aVar = new a(this);
        Iterator<m> it = this.f3348a.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        this.p = this.f3348a.size();
        if (!this.r) {
            for (int i2 = 1; i2 < this.f3348a.size(); i2++) {
                final m mVar = this.f3348a.get(i2);
                this.f3348a.get(i2 - 1).a(new n() {
                    /* class androidx.k.q.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(1236);
                    }

                    @Override // androidx.k.n, androidx.k.m.c
                    public final void a(m mVar) {
                        mVar.b();
                        mVar.b(this);
                    }
                });
            }
            m mVar2 = this.f3348a.get(0);
            if (mVar2 != null) {
                mVar2.b();
                return;
            }
            return;
        }
        Iterator<m> it2 = this.f3348a.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    static class a extends n {

        /* renamed from: a  reason: collision with root package name */
        q f3351a;

        static {
            Covode.recordClassIndex(1237);
        }

        a(q qVar) {
            this.f3351a = qVar;
        }

        @Override // androidx.k.n, androidx.k.m.c
        public final void a(m mVar) {
            q qVar = this.f3351a;
            qVar.p--;
            if (this.f3351a.p == 0) {
                this.f3351a.q = false;
                this.f3351a.d();
            }
            mVar.b(this);
        }

        @Override // androidx.k.n, androidx.k.m.c
        public final void d(m mVar) {
            if (!this.f3351a.q) {
                this.f3351a.c();
                this.f3351a.q = true;
            }
        }
    }

    @Override // androidx.k.m
    public final /* bridge */ /* synthetic */ m b(long j2) {
        return super.b(j2);
    }

    /* renamed from: c */
    public final q a(m.c cVar) {
        return (q) super.a(cVar);
    }

    @Override // androidx.k.m
    public final /* bridge */ /* synthetic */ m b(m.c cVar) {
        return super.b(cVar);
    }

    @Override // androidx.k.m
    public final /* synthetic */ m b(int i2) {
        for (int i3 = 0; i3 < this.f3348a.size(); i3++) {
            this.f3348a.get(i3).b(i2);
        }
        return super.b(i2);
    }

    public final m c(int i2) {
        if (i2 < 0 || i2 >= this.f3348a.size()) {
            return null;
        }
        return this.f3348a.get(i2);
    }

    @Override // androidx.k.m
    public final void d(View view) {
        super.d(view);
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3348a.get(i2).d(view);
        }
    }

    @Override // androidx.k.m
    public final void e(View view) {
        super.e(view);
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3348a.get(i2).e(view);
        }
    }

    public final q a(int i2) {
        if (i2 == 0) {
            this.r = true;
        } else if (i2 == 1) {
            this.r = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i2)));
        }
        return this;
    }

    @Override // androidx.k.m
    public final /* synthetic */ m b(View view) {
        for (int i2 = 0; i2 < this.f3348a.size(); i2++) {
            this.f3348a.get(i2).b(view);
        }
        return super.b(view);
    }

    @Override // androidx.k.m
    public final /* synthetic */ m c(View view) {
        for (int i2 = 0; i2 < this.f3348a.size(); i2++) {
            this.f3348a.get(i2).c(view);
        }
        return super.c(view);
    }

    public final q a(m mVar) {
        this.f3348a.add(mVar);
        mVar.f3329j = this;
        if (this.f3323d >= 0) {
            mVar.a(this.f3323d);
        }
        if ((this.s & 1) != 0) {
            mVar.a(this.f3324e);
        }
        if ((this.s & 2) != 0) {
            mVar.a(this.f3332m);
        }
        if ((this.s & 4) != 0) {
            mVar.a(this.o);
        }
        if ((this.s & 8) != 0) {
            mVar.a(this.n);
        }
        return this;
    }

    /* renamed from: b */
    public final q a(TimeInterpolator timeInterpolator) {
        this.s |= 1;
        ArrayList<m> arrayList = this.f3348a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3348a.get(i2).a(timeInterpolator);
            }
        }
        return (q) super.a(timeInterpolator);
    }

    /* renamed from: c */
    public final q a(long j2) {
        super.a(j2);
        if (this.f3323d >= 0) {
            int size = this.f3348a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3348a.get(i2).a(j2);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.k.m
    public final String a(String str) {
        String a2 = super.a(str);
        for (int i2 = 0; i2 < this.f3348a.size(); i2++) {
            a2 = a2 + "\n" + this.f3348a.get(i2).a(str + "  ");
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.k.m
    public final void c(s sVar) {
        super.c(sVar);
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3348a.get(i2).c(sVar);
        }
    }

    @Override // androidx.k.m
    public final void b(s sVar) {
        if (a(sVar.f3356b)) {
            Iterator<m> it = this.f3348a.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.a(sVar.f3356b)) {
                    next.b(sVar);
                    sVar.f3357c.add(next);
                }
            }
        }
    }

    @Override // androidx.k.m
    public final void a(g gVar) {
        super.a(gVar);
        this.s |= 4;
        for (int i2 = 0; i2 < this.f3348a.size(); i2++) {
            this.f3348a.get(i2).a(gVar);
        }
    }

    @Override // androidx.k.m
    public final void a(m.b bVar) {
        super.a(bVar);
        this.s |= 8;
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3348a.get(i2).a(bVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.k.m
    public final void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long j2 = this.f3322c;
        int size = this.f3348a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f3348a.get(i2);
            if (j2 > 0 && (this.r || i2 == 0)) {
                long j3 = mVar.f3322c;
                if (j3 > 0) {
                    mVar.b(j3 + j2);
                } else {
                    mVar.b(j2);
                }
            }
            mVar.a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
