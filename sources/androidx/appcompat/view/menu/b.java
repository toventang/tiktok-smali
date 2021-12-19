package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public abstract class b implements o {

    /* renamed from: a  reason: collision with root package name */
    protected Context f1157a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f1158b;

    /* renamed from: c  reason: collision with root package name */
    public h f1159c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f1160d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f1161e;

    /* renamed from: f  reason: collision with root package name */
    public o.a f1162f;

    /* renamed from: g  reason: collision with root package name */
    public p f1163g;

    /* renamed from: h  reason: collision with root package name */
    public int f1164h;

    /* renamed from: i  reason: collision with root package name */
    private int f1165i = R.layout.a5;

    /* renamed from: j  reason: collision with root package name */
    private int f1166j = R.layout.a4;

    static {
        Covode.recordClassIndex(327);
    }

    public abstract void a(j jVar, p.a aVar);

    @Override // androidx.appcompat.view.menu.o
    public boolean a() {
        return false;
    }

    public boolean a(j jVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean b(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final boolean c(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public final int b() {
        return this.f1164h;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean a(u uVar) {
        o.a aVar = this.f1162f;
        if (aVar != null) {
            return aVar.a(uVar);
        }
        return false;
    }

    public b(Context context) {
        this.f1157a = context;
        this.f1160d = LayoutInflater.from(context);
    }

    public p a(ViewGroup viewGroup) {
        if (this.f1163g == null) {
            p pVar = (p) a.a(this.f1160d, this.f1165i, viewGroup, false);
            this.f1163g = pVar;
            pVar.a(this.f1159c);
            a(true);
        }
        return this.f1163g;
    }

    @Override // androidx.appcompat.view.menu.o
    public final void a(o.a aVar) {
        this.f1162f = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(boolean z) {
        j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f1163g;
        if (viewGroup != null) {
            h hVar = this.f1159c;
            int i2 = 0;
            if (hVar != null) {
                hVar.j();
                ArrayList<j> i3 = this.f1159c.i();
                int size = i3.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    j jVar2 = i3.get(i5);
                    if (a(jVar2)) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (childAt instanceof p.a) {
                            jVar = ((p.a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View a2 = a(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f1163g).addView(a2, i4);
                        }
                        i4++;
                    }
                }
                i2 = i4;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(h hVar, boolean z) {
        o.a aVar = this.f1162f;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(Context context, h hVar) {
        this.f1158b = context;
        this.f1161e = LayoutInflater.from(context);
        this.f1159c = hVar;
    }

    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public View a(j jVar, View view, ViewGroup viewGroup) {
        p.a aVar;
        if (view instanceof p.a) {
            aVar = (p.a) view;
        } else {
            aVar = (p.a) a.a(this.f1160d, this.f1166j, viewGroup, false);
        }
        a(jVar, aVar);
        return (View) aVar;
    }
}
