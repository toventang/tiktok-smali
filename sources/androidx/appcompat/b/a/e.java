package androidx.appcompat.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.b.a.b;
import com.bytedance.covode.number.Covode;

class e extends b {

    /* renamed from: b  reason: collision with root package name */
    public a f1060b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1061c;

    static {
        Covode.recordClassIndex(304);
    }

    @Override // androidx.appcompat.b.a.b
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class a extends b.AbstractC0021b {
        int[][] L;

        static {
            Covode.recordClassIndex(305);
        }

        public Drawable newDrawable() {
            return new e(this, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: int[][] */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.b.a.b.AbstractC0021b
        public void a() {
            Object obj;
            int[][] iArr = this.L;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.L;
                if (iArr3[length] != null) {
                    obj = iArr3[length].clone();
                } else {
                    obj = null;
                }
                iArr2[length] = obj;
            }
            this.L = iArr2;
        }

        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        /* access modifiers changed from: package-private */
        public final int b(int[] iArr) {
            int[][] iArr2 = this.L;
            int i2 = this.f1042j;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // androidx.appcompat.b.a.b.AbstractC0021b
        public final void b(int i2, int i3) {
            super.b(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.L, 0, iArr, 0, i2);
            this.L = iArr;
        }

        a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.L = aVar.L;
            } else {
                this.L = new int[this.f1041i.length][];
            }
        }
    }

    e() {
        this(null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public a b() {
        return new a(this.f1060b, this, null);
    }

    @Override // androidx.appcompat.b.a.b
    public Drawable mutate() {
        if (!this.f1061c && super.mutate() == this) {
            this.f1060b.a();
            this.f1061c = true;
        }
        return this;
    }

    e(byte b2) {
    }

    @Override // androidx.appcompat.b.a.b
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.b.a.b
    public void a(b.AbstractC0021b bVar) {
        super.a(bVar);
        if (bVar instanceof a) {
            this.f1060b = (a) bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.b.a.b
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b2 = this.f1060b.b(iArr);
        if (b2 < 0) {
            b2 = this.f1060b.b(StateSet.WILD_CARD);
        }
        if (a(b2) || onStateChange) {
            return true;
        }
        return false;
    }

    e(a aVar, Resources resources) {
        a(new a(aVar, this, resources));
        onStateChange(getState());
    }
}
