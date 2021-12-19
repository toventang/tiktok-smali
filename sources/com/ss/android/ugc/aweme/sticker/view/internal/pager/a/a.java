package com.ss.android.ugc.aweme.sticker.view.internal.pager.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.c;
import h.f.b.l;

public class a<DATA> extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public DATA f136354f;

    /* renamed from: g  reason: collision with root package name */
    public c f136355g = c.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f136356h = -1;

    static {
        Covode.recordClassIndex(89046);
    }

    /* access modifiers changed from: protected */
    public void a(DATA data, int i2) {
    }

    /* access modifiers changed from: protected */
    public void a(DATA data, c cVar, Integer num) {
        l.d(cVar, "");
    }

    public void a(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }

    public final void b(DATA data, c cVar, Integer num) {
        l.d(cVar, "");
        this.f136354f = data;
        this.f136355g = cVar;
        a(data, cVar, num);
    }

    public final void a(DATA data, c cVar, Integer num, int i2, int i3) {
        l.d(cVar, "");
        this.f136354f = data;
        this.f136355g = cVar;
        this.f136356h = i3;
        a(data, i2);
        a(data, cVar, num);
    }
}
