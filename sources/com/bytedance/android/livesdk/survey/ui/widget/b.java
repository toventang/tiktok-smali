package com.bytedance.android.livesdk.survey.ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.survey.a.c;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21605a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(12749);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.survey.a.b f21606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LayoutInflater f21607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f21608c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f21609d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f21610e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f21611f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f21612g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ LinearLayoutCompat f21613h;

        static {
            Covode.recordClassIndex(12750);
        }

        a(com.bytedance.android.livesdk.survey.a.b bVar, LayoutInflater layoutInflater, int i2, int i3, float f2, m mVar, c cVar, LinearLayoutCompat linearLayoutCompat) {
            this.f21606a = bVar;
            this.f21607b = layoutInflater;
            this.f21608c = i2;
            this.f21609d = i3;
            this.f21610e = f2;
            this.f21611f = mVar;
            this.f21612g = cVar;
            this.f21613h = linearLayoutCompat;
        }

        public final void onClick(View view) {
            m mVar = this.f21611f;
            String str = this.f21612g.f21497a;
            l.b(str, "");
            mVar.invoke(str, Long.valueOf(this.f21606a.f21495a));
        }
    }

    public static void a(LinearLayoutCompat linearLayoutCompat, c cVar, int i2, int i3, float f2, m<? super String, ? super Long, z> mVar) {
        int a2;
        l.d(linearLayoutCompat, "");
        l.d(cVar, "");
        l.d(mVar, "");
        linearLayoutCompat.removeAllViews();
        LayoutInflater from = LayoutInflater.from(linearLayoutCompat.getContext());
        List<com.bytedance.android.livesdk.survey.a.b> list = cVar.f21500d;
        l.b(list, "");
        boolean z = false;
        int i4 = 0;
        for (T t : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                n.a();
            }
            T t2 = t;
            View a3 = com.a.a(from, i2, null, z);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveButton");
            LiveButton liveButton = (LiveButton) a3;
            if (i3 == 0) {
                a2 = -2;
            } else {
                a2 = y.a((float) i3);
            }
            LinearLayoutCompat.a aVar = new LinearLayoutCompat.a(-1, a2);
            if (i4 != 0) {
                aVar.topMargin = y.a(f2);
            }
            liveButton.setOnClickListener(new a(t2, from, i2, i3, f2, mVar, cVar, linearLayoutCompat));
            liveButton.setText(t2.f21496b);
            linearLayoutCompat.addView(liveButton, aVar);
            i4 = i5;
            z = false;
        }
    }
}
