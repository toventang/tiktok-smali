package com.lynx.b.a.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a;
import com.lynx.b.a.a.e;
import com.lynx.b.a.a.f;
import com.lynx.b.a.a.g;
import com.lynx.b.a.a.h;
import com.lynx.b.a.a.i;
import com.lynx.b.a.b.c;
import com.lynx.b.a.e.b;

public abstract class a extends RelativeLayout implements g {
    protected View w;
    protected c x;
    protected g y;

    static {
        Covode.recordClassIndex(34604);
    }

    @Override // com.lynx.b.a.a.g
    public View getView() {
        View view = this.w;
        if (view == null) {
            return this;
        }
        return view;
    }

    @Override // com.lynx.b.a.a.g
    public c getSpinnerStyle() {
        c cVar = this.x;
        if (cVar != null) {
            return cVar;
        }
        g gVar = this.y;
        if (!(gVar == null || gVar == this)) {
            return gVar.getSpinnerStyle();
        }
        View view = this.w;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof a.c) {
                c cVar2 = ((a.c) layoutParams).f55128b;
                this.x = cVar2;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            if (layoutParams != null && (layoutParams.height == 0 || layoutParams.height == -1)) {
                c[] cVarArr = c.f55149f;
                for (c cVar3 : cVarArr) {
                    if (cVar3.f55152i) {
                        this.x = cVar3;
                        return cVar3;
                    }
                }
            }
        }
        c cVar4 = c.f55144a;
        this.x = cVar4;
        return cVar4;
    }

    @Override // com.lynx.b.a.a.g
    public boolean a() {
        g gVar = this.y;
        if (gVar == null || gVar == this || !gVar.a()) {
            return false;
        }
        return true;
    }

    public a(Context context) {
        super(context, null, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.view.View r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.lynx.b.a.a.g
            if (r0 == 0) goto L_0x000b
            r0 = r2
            com.lynx.b.a.a.g r0 = (com.lynx.b.a.a.g) r0
        L_0x0007:
            r1.<init>(r2, r0)
            return
        L_0x000b:
            r0 = 0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.b.a.f.a.<init>(android.view.View):void");
    }

    @Override // com.lynx.b.a.a.g
    public void setPrimaryColors(int... iArr) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            gVar.setPrimaryColors(iArr);
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof g) || getView() != ((g) obj).getView()) {
            return false;
        }
        return true;
    }

    public final boolean a(boolean z) {
        g gVar = this.y;
        if (!(gVar instanceof e) || !((e) gVar).a(z)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.b.a.a.g
    public int a(i iVar, boolean z) {
        g gVar = this.y;
        if (gVar == null || gVar == this) {
            return 0;
        }
        return gVar.a(iVar, z);
    }

    private a(View view, g gVar) {
        super(view.getContext(), null, 0);
        this.w = view;
        this.y = gVar;
        if ((this instanceof b) && (gVar instanceof f) && gVar.getSpinnerStyle() == c.f55148e) {
            gVar.getView().setScaleY(-1.0f);
        } else if (this instanceof com.lynx.b.a.e.c) {
            g gVar2 = this.y;
            if ((gVar2 instanceof e) && gVar2.getSpinnerStyle() == c.f55148e) {
                gVar.getView().setScaleY(-1.0f);
            }
        }
    }

    @Override // com.lynx.b.a.a.g
    public void b(i iVar, int i2, int i3) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            gVar.b(iVar, i2, i3);
        }
    }

    @Override // com.lynx.b.a.a.g
    public void a(float f2, int i2, int i3) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            gVar.a(f2, i2, i3);
        }
    }

    @Override // com.lynx.b.a.a.g
    public final void a(h hVar, int i2, int i3) {
        g gVar = this.y;
        if (gVar == null || gVar == this) {
            View view = this.w;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof a.c) {
                    hVar.a(this, ((a.c) layoutParams).f55127a);
                    return;
                }
                return;
            }
            return;
        }
        gVar.a(hVar, i2, i3);
    }

    @Override // com.lynx.b.a.a.g
    public void a(i iVar, int i2, int i3) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            gVar.a(iVar, i2, i3);
        }
    }

    @Override // com.lynx.b.a.g.f
    public void a(i iVar, com.lynx.b.a.b.b bVar, com.lynx.b.a.b.b bVar2) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            if ((this instanceof b) && (gVar instanceof f)) {
                if (bVar.isFooter) {
                    bVar = bVar.toHeader();
                }
                if (bVar2.isFooter) {
                    bVar2 = bVar2.toHeader();
                }
            } else if ((this instanceof com.lynx.b.a.e.c) && (gVar instanceof e)) {
                if (bVar.isHeader) {
                    bVar = bVar.toFooter();
                }
                if (bVar2.isHeader) {
                    bVar2 = bVar2.toFooter();
                }
            }
            g gVar2 = this.y;
            if (gVar2 != null) {
                gVar2.a(iVar, bVar, bVar2);
            }
        }
    }

    @Override // com.lynx.b.a.a.g
    public void a(boolean z, float f2, int i2, int i3, int i4) {
        g gVar = this.y;
        if (gVar != null && gVar != this) {
            gVar.a(z, f2, i2, i3, i4);
        }
    }
}
