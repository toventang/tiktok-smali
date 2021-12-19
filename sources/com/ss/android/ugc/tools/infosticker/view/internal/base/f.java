package com.ss.android.ugc.tools.infosticker.view.internal.base;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.a.q;
import h.f.b.l;
import h.z;

public abstract class f<DATA> extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public DATA f149598d;

    /* renamed from: e  reason: collision with root package name */
    public c f149599e = c.NOT_DOWNLOAD;

    /* renamed from: f  reason: collision with root package name */
    public int f149600f;

    /* renamed from: g  reason: collision with root package name */
    public final b f149601g;

    /* renamed from: h  reason: collision with root package name */
    public final q<DATA, Integer, c, z> f149602h;

    static {
        Covode.recordClassIndex(98508);
    }

    /* access modifiers changed from: protected */
    public abstract void a(DATA data);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super DATA, ? super java.lang.Integer, ? super com.ss.android.ugc.tools.h.a.c, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, b bVar, q<? super DATA, ? super Integer, ? super c, z> qVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        l.d(qVar, "");
        this.f149601g = bVar;
        this.f149602h = qVar;
        view.setOnClickListener(new d(this) {
            /* class com.ss.android.ugc.tools.infosticker.view.internal.base.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f149603a;

            static {
                Covode.recordClassIndex(98509);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f149603a = r3;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                DATA data;
                if (this.f149603a.getAdapterPosition() != -1 && (data = this.f149603a.f149598d) != null) {
                    this.f149603a.f149602h.invoke(data, Integer.valueOf(this.f149603a.f149600f), this.f149603a.f149599e);
                }
            }
        });
    }

    public final void a(DATA data, int i2, c cVar, Integer num) {
        l.d(cVar, "");
        a(data);
        int i3 = g.f149604a[cVar.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            this.f149601g.a(1, 0);
        } else if (i3 == 5) {
            if (num == null) {
                this.f149601g.a(2, 0);
            } else {
                this.f149601g.a(5, num.intValue());
            }
        }
        this.f149598d = data;
        this.f149599e = cVar;
        this.f149600f = i2;
    }
}
