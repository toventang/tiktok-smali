package com.bytedance.ies.xelement.picker.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.c.a;
import com.bytedance.ies.xelement.picker.c.c;
import com.bytedance.ies.xelement.picker.view.WheelView;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public final class b extends a implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public c f37313j;

    /* renamed from: k  reason: collision with root package name */
    private e f37314k;

    static {
        Covode.recordClassIndex(22431);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.picker.view.a
    public final a a() {
        return this.f37313j;
    }

    @Override // com.bytedance.ies.xelement.picker.view.a
    public final boolean h() {
        return this.f37313j.w;
    }

    public final String i() {
        String str;
        Calendar a2 = this.f37314k.a();
        if (this.f37313j.Y != null) {
            str = this.f37313j.Y;
        } else {
            str = "-";
        }
        int i2 = a2.get(1);
        int i3 = a2.get(2) + 1;
        int i4 = a2.get(5);
        boolean[] zArr = this.f37313j.F;
        if (zArr.length != 3) {
            return com.a.a(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), str, Integer.valueOf(i4)});
        } else if (zArr[2]) {
            return com.a.a(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), str, Integer.valueOf(i4)});
        } else if (zArr[1]) {
            return com.a.a(Locale.getDefault(), "%04d%s%02d", new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3)});
        } else {
            return com.a.a(Locale.getDefault(), "%04d", new Object[]{Integer.valueOf(i2)});
        }
    }

    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.f37313j.D != null) {
                this.f37313j.D.a(i());
            }
            this.f37302i = true;
        } else if (str.equals("cancel")) {
            if (this.f37313j.f37256a != null) {
                this.f37313j.f37256a.a();
            }
            this.f37302i = true;
        }
        e();
    }

    public b(c cVar) {
        super(cVar.f37261f);
        int i2;
        String str;
        String str2;
        String str3;
        MethodCollector.i(11355);
        this.f37313j = cVar;
        Context context = cVar.f37261f;
        g();
        b();
        c();
        if (this.f37313j.f37257b == null) {
            LayoutInflater.from(context).inflate(R.layout.ak6, this.f37294a);
            TextView textView = (TextView) a(R.id.ev1);
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.drr);
            Button button = (Button) a(R.id.xl);
            Button button2 = (Button) a(R.id.xj);
            button.setTag("submit");
            button2.setTag("cancel");
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            Map<String, String> a2 = this.f37313j.X.a();
            if (TextUtils.isEmpty(this.f37313j.f37262g)) {
                str = a2.get("confirm");
            } else {
                str = this.f37313j.f37262g;
            }
            button.setText(str);
            if (TextUtils.isEmpty(this.f37313j.f37263h)) {
                str2 = a2.get("cancel");
            } else {
                str2 = this.f37313j.f37263h;
            }
            button2.setText(str2);
            if (TextUtils.isEmpty(this.f37313j.f37264i)) {
                str3 = "";
            } else {
                str3 = this.f37313j.f37264i;
            }
            textView.setText(str3);
            button.setTextColor(this.f37313j.f37265j);
            button2.setTextColor(this.f37313j.f37266k);
            textView.setTextColor(this.f37313j.f37267l);
            relativeLayout.setBackgroundColor(this.f37313j.n);
            button.setTextSize((float) this.f37313j.o);
            button2.setTextSize((float) this.f37313j.o);
            textView.setTextSize((float) this.f37313j.p);
        } else {
            LayoutInflater.from(context).inflate(this.f37313j.f37258c, this.f37294a);
        }
        LinearLayout linearLayout = (LinearLayout) a(R.id.aif);
        linearLayout.setBackgroundColor(this.f37313j.f37268m);
        this.f37314k = new e(linearLayout, this.f37313j.F, this.f37313j.f37260e, this.f37313j.q, this.f37313j.X);
        if (this.f37313j.E != null) {
            this.f37314k.n = new com.bytedance.ies.xelement.picker.e.c() {
                /* class com.bytedance.ies.xelement.picker.view.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22432);
                }

                @Override // com.bytedance.ies.xelement.picker.e.c
                public final void a() {
                    b.this.i();
                }
            };
        }
        if (this.f37313j.I == null) {
            this.f37313j.I = Calendar.getInstance();
            this.f37313j.I.set(1900, 0, 1);
        }
        if (this.f37313j.J == null) {
            this.f37313j.J = Calendar.getInstance();
            this.f37313j.J.set(2100, 11, 31);
        }
        if (this.f37313j.I.get(1) < 1900 || this.f37313j.I.get(1) > 2100) {
            this.f37313j.I.set(1900, 0, 1);
        }
        if (this.f37313j.J.get(1) < 1900 || this.f37313j.J.get(1) > 2100) {
            this.f37313j.J.set(2100, 11, 31);
        }
        e eVar = this.f37314k;
        Calendar calendar = this.f37313j.I;
        Calendar calendar2 = this.f37313j.J;
        if (calendar == null) {
            if (calendar2 != null) {
                int i3 = calendar2.get(1);
                int i4 = calendar2.get(2) + 1;
                int i5 = calendar2.get(5);
                if (i3 > eVar.f37325e) {
                    eVar.f37326f = i3;
                    eVar.f37328h = i4;
                    eVar.f37330j = i5;
                } else if (i3 == eVar.f37325e) {
                    if (i4 > eVar.f37327g) {
                        eVar.f37326f = i3;
                        eVar.f37328h = i4;
                        eVar.f37330j = i5;
                    } else if (i4 == eVar.f37327g && i5 > eVar.f37329i) {
                        eVar.f37326f = i3;
                        eVar.f37328h = i4;
                        eVar.f37330j = i5;
                    }
                }
            }
        } else if (calendar2 == null) {
            int i6 = calendar.get(1);
            int i7 = calendar.get(2) + 1;
            int i8 = calendar.get(5);
            if (i6 < eVar.f37326f) {
                eVar.f37327g = i7;
                eVar.f37329i = i8;
                eVar.f37325e = i6;
            } else if (i6 == eVar.f37326f) {
                if (i7 < eVar.f37328h) {
                    eVar.f37327g = i7;
                    eVar.f37329i = i8;
                    eVar.f37325e = i6;
                } else if (i7 == eVar.f37328h && i8 < eVar.f37330j) {
                    eVar.f37327g = i7;
                    eVar.f37329i = i8;
                    eVar.f37325e = i6;
                }
            }
        } else {
            eVar.f37325e = calendar.get(1);
            eVar.f37326f = calendar2.get(1);
            eVar.f37327g = calendar.get(2) + 1;
            eVar.f37328h = calendar2.get(2) + 1;
            eVar.f37329i = calendar.get(5);
            eVar.f37330j = calendar2.get(5);
        }
        if (this.f37313j.I == null || this.f37313j.J == null) {
            IllegalStateException illegalStateException = new IllegalStateException("you should call setRangDate() first");
            MethodCollector.o(11355);
            throw illegalStateException;
        }
        if (this.f37313j.H == null) {
            this.f37313j.H = Calendar.getInstance();
        }
        if (this.f37313j.H.getTimeInMillis() < this.f37313j.I.getTimeInMillis()) {
            this.f37313j.H.setTimeInMillis(this.f37313j.I.getTimeInMillis());
        }
        if (this.f37313j.H.getTimeInMillis() > this.f37313j.J.getTimeInMillis()) {
            this.f37313j.H.setTimeInMillis(this.f37313j.J.getTimeInMillis());
        }
        int i9 = this.f37313j.H.get(1);
        int i10 = this.f37313j.H.get(2) + 1;
        int i11 = this.f37313j.H.get(5);
        e eVar2 = this.f37314k;
        eVar2.f37331k = i9;
        eVar2.f37332l = i10;
        eVar2.f37333m = i11;
        eVar2.f37322b.setAdapter(new com.bytedance.ies.xelement.picker.a.b(eVar2.f37325e, eVar2.f37326f));
        eVar2.f37322b.setCurrentIndex(i9 - eVar2.f37325e);
        int i12 = 12;
        if (eVar2.f37325e == eVar2.f37326f) {
            i2 = eVar2.f37327g;
            i12 = eVar2.f37328h;
        } else if (i9 == eVar2.f37325e) {
            i2 = eVar2.f37327g;
        } else {
            i12 = i9 == eVar2.f37326f ? eVar2.f37328h : i12;
            i2 = 1;
        }
        eVar2.f37323c.setAdapter(new com.bytedance.ies.xelement.picker.a.b(i2, i12));
        eVar2.f37323c.setCurrentIndex(i10 - i2);
        eVar2.a(true, i9, i10, i11);
        e eVar3 = this.f37314k;
        String str4 = this.f37313j.L;
        String str5 = this.f37313j.M;
        String str6 = this.f37313j.N;
        if (str4 != null) {
            eVar3.f37322b.setLabel(str4);
        }
        if (str5 != null) {
            eVar3.f37323c.setLabel(str5);
        }
        if (str6 != null) {
            eVar3.f37324d.setLabel(str6);
        }
        e eVar4 = this.f37314k;
        int i13 = this.f37313j.R;
        int i14 = this.f37313j.S;
        int i15 = this.f37313j.T;
        eVar4.f37322b.setTextXOffset(i13);
        eVar4.f37323c.setTextXOffset(i14);
        eVar4.f37324d.setTextXOffset(i15);
        e eVar5 = this.f37314k;
        int i16 = this.f37313j.B;
        eVar5.f37324d.setItemsVisibleCount(i16);
        eVar5.f37323c.setItemsVisibleCount(i16);
        eVar5.f37322b.setItemsVisibleCount(i16);
        e eVar6 = this.f37314k;
        boolean z = this.f37313j.C;
        eVar6.f37324d.setAlphaGradient(z);
        eVar6.f37323c.setAlphaGradient(z);
        eVar6.f37322b.setAlphaGradient(z);
        a(this.f37313j.x);
        e eVar7 = this.f37314k;
        boolean z2 = this.f37313j.K;
        eVar7.f37322b.setCyclic(z2);
        eVar7.f37323c.setCyclic(z2);
        eVar7.f37324d.setCyclic(z2);
        e eVar8 = this.f37314k;
        int i17 = this.f37313j.t;
        eVar8.f37324d.setDividerColor(i17);
        eVar8.f37323c.setDividerColor(i17);
        eVar8.f37322b.setDividerColor(i17);
        e eVar9 = this.f37314k;
        WheelView.b bVar = this.f37313j.A;
        eVar9.f37324d.setDividerType(bVar);
        eVar9.f37323c.setDividerType(bVar);
        eVar9.f37322b.setDividerType(bVar);
        e eVar10 = this.f37314k;
        float f2 = this.f37313j.v;
        eVar10.f37324d.setLineSpacingMultiplier(f2);
        eVar10.f37323c.setLineSpacingMultiplier(f2);
        eVar10.f37322b.setLineSpacingMultiplier(f2);
        e eVar11 = this.f37314k;
        int i18 = this.f37313j.r;
        eVar11.f37324d.setTextColorOut(i18);
        eVar11.f37323c.setTextColorOut(i18);
        eVar11.f37322b.setTextColorOut(i18);
        e eVar12 = this.f37314k;
        int i19 = this.f37313j.s;
        eVar12.f37324d.setTextColorCenter(i19);
        eVar12.f37323c.setTextColorCenter(i19);
        eVar12.f37322b.setTextColorCenter(i19);
        e eVar13 = this.f37314k;
        boolean z3 = this.f37313j.y;
        eVar13.f37324d.f37280b = z3;
        eVar13.f37323c.f37280b = z3;
        eVar13.f37322b.f37280b = z3;
        MethodCollector.o(11355);
    }
}
