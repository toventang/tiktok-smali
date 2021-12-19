package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.p;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    List<a> f88544a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final Drawable f88545b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f88546c = true;

    /* renamed from: d  reason: collision with root package name */
    private int f88547d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f88548e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f88549f = " ";

    /* renamed from: g  reason: collision with root package name */
    private boolean f88550g;

    /* renamed from: h  reason: collision with root package name */
    private int f88551h;

    /* renamed from: i  reason: collision with root package name */
    private InnerEffectTextLayoutConfig f88552i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f88553j = new d(this);

    /* renamed from: k  reason: collision with root package name */
    private float f88554k;

    static {
        Covode.recordClassIndex(55724);
    }

    public final List<a> getEditTextList() {
        return this.f88544a;
    }

    public final boolean getEditable() {
        return this.f88546c;
    }

    public final String getHintString() {
        return this.f88549f;
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.f88552i;
    }

    public final int getMaxTextWidth() {
        return this.f88547d;
    }

    public final int getMaxViewWidth() {
        return this.f88548e;
    }

    public final boolean getShowHint() {
        return this.f88550g;
    }

    public final void a() {
        for (T t : this.f88544a) {
            t.f88555a.setMinWidth(t.f88555a.getWidth());
        }
    }

    public final AppCompatEditText getFocusableEditText() {
        T t;
        Iterator<T> it = this.f88544a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f88555a.hasFocus()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.f88555a;
        }
        return null;
    }

    public final void setShowHint(boolean z) {
        this.f88550g = z;
    }

    public final void setEditTextList(List<a> list) {
        l.d(list, "");
        this.f88544a = list;
    }

    public final void setHintString(String str) {
        l.d(str, "");
        this.f88549f = str;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public i f88555a;

        /* renamed from: b  reason: collision with root package name */
        public InnerEffectTextConfig f88556b = null;

        static {
            Covode.recordClassIndex(55725);
        }

        public a(i iVar) {
            l.d(iVar, "");
            this.f88555a = iVar;
        }
    }

    public final void setRotation(float f2) {
        if (this.f88552i != null) {
            super.setRotation(f2 + this.f88554k);
        } else {
            super.setRotation(f2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3570);
        Context context2 = getContext();
        l.b(context2, "");
        this.f88545b = context2.getResources().getDrawable(R.drawable.a85);
        MethodCollector.o(3570);
    }

    public final void setEditable(boolean z) {
        if (this.f88546c != z) {
            this.f88546c = z;
            Iterator<T> it = this.f88544a.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.editSticker.f.d.a(it.next().f88555a, this.f88546c);
            }
        }
    }

    public final void setMaxTextWidth(int i2) {
        if (this.f88547d != i2) {
            this.f88547d = i2;
            Iterator<T> it = this.f88544a.iterator();
            while (it.hasNext()) {
                it.next().f88555a.setMaxWidth(this.f88547d);
            }
        }
    }

    public final void setMaxViewWidth(int i2) {
        if (this.f88548e != i2) {
            this.f88548e = i2;
            Iterator<T> it = this.f88544a.iterator();
            while (it.hasNext()) {
                it.next().f88555a.setMaxViewWidth(this.f88548e);
            }
        }
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        if (!l.a(this.f88552i, innerEffectTextLayoutConfig)) {
            this.f88552i = innerEffectTextLayoutConfig;
            setOrientation(1);
            this.f88554k = 0.0f;
            setRotation(0.0f);
            setPadding(0, 0, 0, 0);
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = this.f88552i;
            if (innerEffectTextLayoutConfig2 != null) {
                setOrientation(innerEffectTextLayoutConfig2.getOrientation());
                this.f88554k = innerEffectTextLayoutConfig2.getRotation();
                setRotation(0.0f);
                setPadding(innerEffectTextLayoutConfig2.getPaddingStart(), innerEffectTextLayoutConfig2.getPaddingTop(), innerEffectTextLayoutConfig2.getPaddingEnd(), innerEffectTextLayoutConfig2.getPaddingBottom());
                List<InnerEffectTextConfig> textConfigs = innerEffectTextLayoutConfig2.getTextConfigs();
                b bVar = new b(this);
                if (textConfigs.size() < this.f88544a.size()) {
                    int size = this.f88544a.size() - 1;
                    int size2 = textConfigs.size();
                    if (size >= size2) {
                        while (true) {
                            removeView(this.f88544a.get(size).f88555a);
                            this.f88544a.remove(size);
                            if (size == size2) {
                                break;
                            }
                            size--;
                        }
                    }
                } else if (textConfigs.size() > this.f88544a.size()) {
                    int size3 = textConfigs.size();
                    for (int size4 = this.f88544a.size(); size4 < size3; size4++) {
                        Context context = getContext();
                        l.b(context, "");
                        i iVar = new i(context, (byte) 0);
                        iVar.setMaxWidth(this.f88547d);
                        iVar.setMaxViewWidth(this.f88548e);
                        addView(iVar);
                        iVar.setOnFocusChangeListener(this.f88553j);
                        this.f88544a.add(new a(iVar));
                    }
                }
                int size5 = textConfigs.size();
                for (int i2 = 0; i2 < size5; i2++) {
                    InnerEffectTextConfig innerEffectTextConfig = textConfigs.get(i2);
                    this.f88544a.get(i2).f88556b = innerEffectTextConfig;
                    bVar.a(this.f88544a.get(i2).f88555a, innerEffectTextConfig);
                }
                return;
            }
            return;
        }
        invalidate();
    }

    public final void setText(List<p> list) {
        T t;
        l.d(list, "");
        c cVar = new c(this);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.f88442d) {
                break;
            }
        }
        int i2 = 0;
        if (t != null) {
            this.f88551h = list.indexOf(t);
        } else if (!list.isEmpty()) {
            int size = list.size();
            int i3 = this.f88551h;
            if (size > i3) {
                list.get(i3).f88442d = true;
            } else {
                list.get(0).f88442d = true;
            }
        }
        if (list.size() > this.f88544a.size()) {
            int size2 = this.f88544a.size() - 1;
            while (i2 < size2) {
                cVar.a(this.f88544a.get(i2).f88555a, list.get(i2));
                i2++;
            }
            ArrayList arrayList = new ArrayList();
            int size3 = list.size();
            for (int size4 = this.f88544a.size() - 1; size4 < size3; size4++) {
                arrayList.add(list.get(size4));
            }
            p a2 = com.ss.android.ugc.aweme.editSticker.text.bean.d.a(arrayList);
            List<a> list2 = this.f88544a;
            cVar.a(list2.get(list2.size() - 1).f88555a, a2);
        } else if (list.size() < this.f88544a.size()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            int size5 = this.f88544a.size();
            for (int size6 = list.size(); size6 < size5; size6++) {
                arrayList2.add(new p(null, 0, false, false, 15));
            }
            int size7 = arrayList2.size();
            while (i2 < size7) {
                cVar.a(this.f88544a.get(i2).f88555a, (p) arrayList2.get(i2));
                i2++;
            }
        } else {
            int size8 = list.size();
            while (i2 < size8) {
                cVar.a(this.f88544a.get(i2).f88555a, list.get(i2));
                i2++;
            }
        }
    }

    static final class b extends m implements h.f.a.m<i, InnerEffectTextConfig, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(55726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, InnerEffectTextConfig innerEffectTextConfig) {
            a(iVar, innerEffectTextConfig);
            return z.f158842a;
        }

        public final void a(i iVar, InnerEffectTextConfig innerEffectTextConfig) {
            l.d(iVar, "");
            l.d(innerEffectTextConfig, "");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = innerEffectTextConfig.getMarginStart();
            layoutParams.rightMargin = innerEffectTextConfig.getMarginEnd();
            layoutParams.topMargin = innerEffectTextConfig.getMarginTop();
            layoutParams.bottomMargin = innerEffectTextConfig.getMarginBottom();
            iVar.setLayoutParams(layoutParams);
            iVar.setInnerTextConfig(innerEffectTextConfig);
            iVar.setBackground(null);
            com.ss.android.ugc.aweme.editSticker.f.d.a(iVar, this.this$0.getEditable());
        }
    }

    static final class c extends m implements h.f.a.m<i, p, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(55727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(2);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, p pVar) {
            a(iVar, pVar);
            return z.f158842a;
        }

        public final void a(i iVar, p pVar) {
            Editable text;
            l.d(iVar, "");
            l.d(pVar, "");
            iVar.setText(pVar.f88439a);
            if (pVar.f88442d) {
                iVar.setSelection(Math.min(String.valueOf(iVar.getText()).length(), pVar.f88440b));
                com.ss.android.ugc.aweme.editSticker.f.d.a(iVar);
            } else {
                String str = " ";
                if (this.this$0.getShowHint() && ((text = iVar.getText()) == null || text.length() == 0)) {
                    str = this.this$0.getHintString();
                }
                iVar.setHint(str);
            }
            iVar.setTextColor(pVar.f88441c);
        }
    }

    static final class d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f88557a;

        static {
            Covode.recordClassIndex(55728);
        }

        d(n nVar) {
            this.f88557a = nVar;
        }

        public final void onFocusChange(View view, boolean z) {
            EditText editText;
            Editable text;
            if ((view instanceof EditText) && this.f88557a.getEditable()) {
                if (z || !((text = (editText = (EditText) view).getText()) == null || text.length() == 0)) {
                    ((EditText) view).setHint(" ");
                } else {
                    editText.setHint(this.f88557a.getHintString());
                }
            }
        }
    }
}
