package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.bytedance.tux.b.k;
import com.bytedance.tux.h.b;
import com.bytedance.tux.h.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TuxTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    private final k<TextView> f45147a;

    /* renamed from: b  reason: collision with root package name */
    private int f45148b;

    /* renamed from: c  reason: collision with root package name */
    public int f45149c;

    /* renamed from: e  reason: collision with root package name */
    private int f45150e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45151f;

    /* renamed from: g  reason: collision with root package name */
    private final h f45152g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f45153h;

    static {
        Covode.recordClassIndex(27529);
    }

    public TuxTextView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    private final b getAutoSizeHelper() {
        return (b) this.f45152g.getValue();
    }

    /* access modifiers changed from: protected */
    public final int getMinTextSize() {
        return this.f45150e;
    }

    static final class a extends m implements h.f.a.a<b> {
        final /* synthetic */ TuxTextView this$0;

        static {
            Covode.recordClassIndex(27531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TuxTextView tuxTextView) {
            super(0);
            this.this$0 = tuxTextView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b(this.this$0);
        }
    }

    private final void a() {
        setText(getText());
    }

    private final void b() {
        int i2 = this.f45148b;
        int i3 = this.f45150e;
        boolean z = true;
        if (1 <= i3 && i2 > i3) {
            getAutoSizeHelper().a(this.f45150e, this.f45148b);
        } else {
            getAutoSizeHelper().a();
            z = false;
        }
        this.f45151f = z;
    }

    /* access modifiers changed from: protected */
    public final void setMinTextSize(int i2) {
        this.f45150e = i2;
    }

    /* access modifiers changed from: protected */
    public final void b(boolean z) {
        this.f45153h = z;
        getAutoSizeHelper().f45090a = z;
    }

    public final void setMinTextSizePx(int i2) {
        this.f45150e = i2;
        b();
        a();
    }

    public final void setMinTextSize(float f2) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f45150e = h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()));
        b();
        a();
    }

    public final void setTextColorRes(int i2) {
        Integer a2;
        Context context = getContext();
        if (context != null && (a2 = d.a(context, i2)) != null) {
            setTextColor(a2.intValue());
        }
    }

    public final void a(float f2) {
        setTextSize(1, f2);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f45149c = h.g.a.a(TypedValue.applyDimension(1, f2 + 4.0f, system.getDisplayMetrics()));
        this.f45148b = (int) getTextSize();
        b();
        a();
    }

    public final void setTuxFont(int i2) {
        Map<Integer, Object> map;
        Object obj;
        this.f45147a.a(this, R.attr.ap4, i2);
        com.bytedance.tux.b.b a2 = f.a((int) R.attr.ap4, i2);
        if (!(a2 == null || (map = a2.f44666a) == null || (obj = map.get(Integer.valueOf(g.h().f44668a))) == null)) {
            g.h();
            l.c(obj, "");
            float floatValue = ((Number) obj).floatValue();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.f45148b = h.g.a.a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
        }
        b();
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        if (this.f45151f && !this.f45153h) {
            TextPaint paint = getPaint();
            l.a((Object) paint, "");
            paint.setTextSize((float) this.f45148b);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.bytedance.tux.f.d dVar;
        com.bytedance.tux.f.a.d dVar2;
        Integer valueOf;
        if (charSequence instanceof com.bytedance.tux.f.d) {
            dVar = (com.bytedance.tux.f.d) charSequence;
        } else {
            dVar = new com.bytedance.tux.f.d(charSequence);
        }
        int i2 = this.f45149c;
        if (i2 > 0) {
            com.bytedance.tux.f.a.d[] dVarArr = (com.bytedance.tux.f.a.d[]) dVar.getSpans(0, dVar.length(), com.bytedance.tux.f.a.d.class);
            l.a((Object) dVarArr, "");
            ArrayList arrayList = new ArrayList();
            for (com.bytedance.tux.f.a.d dVar3 : dVarArr) {
                if (true ^ dVar3.f45036a) {
                    arrayList.add(dVar3);
                }
            }
            Iterator it = arrayList.iterator();
            Object obj = null;
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int i3 = ((com.bytedance.tux.f.a.d) obj).f45037b;
                    do {
                        Object next = it.next();
                        int i4 = ((com.bytedance.tux.f.a.d) next).f45037b;
                        if (i3 < i4) {
                            obj = next;
                            i3 = i4;
                        }
                    } while (it.hasNext());
                }
            }
            com.bytedance.tux.f.a.d dVar4 = (com.bytedance.tux.f.a.d) obj;
            if (dVar4 == null || (valueOf = Integer.valueOf(dVar4.f45037b)) == null || valueOf.intValue() <= 0) {
                dVar2 = new com.bytedance.tux.f.a.d(i2);
                dVar2.f45036a = true;
            } else {
                dVar2 = new com.bytedance.tux.f.a.d(valueOf.intValue());
            }
            for (com.bytedance.tux.f.a.d dVar5 : dVarArr) {
                dVar.removeSpan(dVar5);
            }
            dVar.a(dVar2);
        }
        super.setText(dVar, bufferType);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TuxTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        k<TextView> kVar = new k<>(new com.bytedance.tux.b.a.a());
        this.f45147a = kVar;
        this.f45148b = -1;
        this.f45150e = -1;
        this.f45152g = i.a((h.f.a.a) new a(this));
        kVar.f44699a = new k.b(this) {
            /* class com.bytedance.tux.input.TuxTextView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxTextView f45154a;

            static {
                Covode.recordClassIndex(27530);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f45154a = r1;
            }

            @Override // com.bytedance.tux.b.k.b
            public final void a(Map<Integer, ? extends Object> map) {
                l.c(map, "");
                for (Map.Entry<Integer, ? extends Object> entry : map.entrySet()) {
                    if (entry.getKey().intValue() == g.k().f44668a) {
                        TuxTextView tuxTextView = this.f45154a;
                        g.k();
                        Object value = entry.getValue();
                        l.c(value, "");
                        tuxTextView.f45149c = ((Number) value).intValue();
                    }
                }
            }
        };
        int a2 = com.bytedance.tux.d.b.f44791a.a(this, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap4, R.attr.aq_}, i2, 0);
        l.a((Object) obtainStyledAttributes, "");
        this.f45150e = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        obtainStyledAttributes.recycle();
        setTuxFont(a2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f45151f) {
            getAutoSizeHelper().b();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.ce : i2);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f45151f) {
            getAutoSizeHelper().b();
        }
    }
}
