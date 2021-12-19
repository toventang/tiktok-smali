package com.bytedance.tux.tooltip.a.a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.e;
import com.bytedance.tux.h.d;
import com.bytedance.tux.tooltip.a;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.tux.tooltip.b<b> {

    /* renamed from: c  reason: collision with root package name */
    public List<? extends a> f45483c = z.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    public int f45484d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f45485e = -1;

    /* renamed from: f  reason: collision with root package name */
    public e f45486f;

    static {
        Covode.recordClassIndex(27692);
    }

    @Override // com.bytedance.tux.tooltip.b
    public final a d() {
        a(true, (View.OnClickListener) null);
        c cVar = new c(this.f45512b, (byte) 0);
        cVar.setActions(this.f45483c);
        int i2 = this.f45484d;
        if (i2 >= 0) {
            cVar.setMinimumWidth(i2);
        }
        e eVar = this.f45486f;
        if (eVar != null) {
            Context context = cVar.getContext();
            l.a((Object) context, "");
            cVar.setDividerDrawable(eVar.a(context));
        }
        int i3 = this.f45485e;
        if (i3 >= 0) {
            cVar.setDividerPadding(i3);
        }
        a(cVar);
        return super.d();
    }

    public final b a(h.f.a.b<? super d, h.z> bVar) {
        l.c(bVar, "");
        d dVar = new d(this.f45512b);
        bVar.invoke(dVar);
        this.f45483c = dVar.f45487a;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.c(context, "");
        int[] iArr = {R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw};
        l.a((Object) iArr, "");
        Integer a2 = d.a(context, iArr, 0);
        if (a2 != null) {
            a(a2.intValue());
        }
    }
}
