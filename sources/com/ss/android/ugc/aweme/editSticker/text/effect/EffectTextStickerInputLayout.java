package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.f.d;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.o;
import com.ss.android.ugc.aweme.editSticker.text.bean.p;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText;
import com.ss.android.ugc.aweme.editSticker.text.view.g;
import com.ss.android.ugc.aweme.editSticker.text.view.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EffectTextStickerInputLayout extends i {
    private final RelativeLayout N;
    private final ScrollView O;
    private final FrameLayout P;
    private InnerEffectTextLayoutConfig Q;

    /* renamed from: a  reason: collision with root package name */
    public float f88466a;

    /* renamed from: b  reason: collision with root package name */
    public float f88467b;

    /* renamed from: c  reason: collision with root package name */
    public final int f88468c;

    /* renamed from: d  reason: collision with root package name */
    public o f88469d = new o();

    /* renamed from: e  reason: collision with root package name */
    public final u f88470e;

    /* renamed from: f  reason: collision with root package name */
    public final n f88471f;

    static {
        Covode.recordClassIndex(55688);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void setData(TextStickerData textStickerData) {
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.Q;
    }

    public final o getScaleInfo() {
        return this.f88469d;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void b() {
        if (this.G) {
            AppCompatEditText focusableEditText = this.f88471f.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.b(focusableEditText, getContext());
                return;
            }
            return;
        }
        KeyboardUtils.b(this.f88680h, getContext());
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void c() {
        if (this.G) {
            AppCompatEditText focusableEditText = this.f88471f.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.c(focusableEditText, getContext());
            }
        } else {
            KeyboardUtils.c(this.f88680h, getContext());
        }
        this.f88471f.setEditable(false);
        d.a((EditText) this.f88680h, false);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final List<TextStickerTextWrap> getTextWrapList() {
        if (this.G) {
            n nVar = this.f88471f;
            ArrayList arrayList = new ArrayList();
            if (nVar == null) {
                return arrayList;
            }
            Iterator<T> it = nVar.getEditTextList().iterator();
            while (it.hasNext()) {
                arrayList.add(t.a(it.next().f88555a, (List<InteractTextStructWrap>) null));
            }
            return arrayList;
        }
        return n.d(t.a(this.f88680h, (List<InteractTextStructWrap>) null));
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectTextStickerInputLayout f88474a;

        static {
            Covode.recordClassIndex(55691);
        }

        b(EffectTextStickerInputLayout effectTextStickerInputLayout) {
            this.f88474a = effectTextStickerInputLayout;
        }

        public final void run() {
            this.f88474a.f88471f.setMaxTextWidth(this.f88474a.f88469d.f88438c);
            TextStickerEditText textStickerEditText = this.f88474a.f88680h;
            l.b(textStickerEditText, "");
            textStickerEditText.setMaxWidth(this.f88474a.f88469d.f88438c);
            float width = ((float) this.f88474a.getWidth()) / ((float) this.f88474a.f88469d.f88438c);
            this.f88474a.f88471f.setScaleX(width);
            this.f88474a.f88471f.setScaleY(width);
            this.f88474a.f88470e.setScale(width);
            TextStickerEditText textStickerEditText2 = this.f88474a.f88680h;
            l.b(textStickerEditText2, "");
            textStickerEditText2.setScaleX(width);
            TextStickerEditText textStickerEditText3 = this.f88474a.f88680h;
            l.b(textStickerEditText3, "");
            textStickerEditText3.setScaleY(width);
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void a() {
        g gVar = this.r;
        if (gVar.f88663a.size() <= 0 || !(gVar.f88663a.get(0).getTag() instanceof String)) {
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().a("default", gVar.f88666d);
        } else {
            com.ss.android.ugc.aweme.editSticker.text.a.b.a().f88281d = (String) gVar.f88663a.get(0).getTag();
        }
        gVar.f88665c.scrollTo(0, 0);
        super.a();
    }

    public final void setScaleInfo(o oVar) {
        l.d(oVar, "");
        if (!l.a(this.f88469d, oVar)) {
            this.f88469d = oVar;
            if (!oVar.f88436a) {
                post(new b(this));
            }
        }
    }

    public final void a(TextStickerData textStickerData) {
        if (textStickerData != null) {
            setInnerLayoutConfig(textStickerData.getEffectTextLayoutConfig());
            if (this.Q != null) {
                setEffectText(textStickerData.getTextWrapList());
            } else {
                b(textStickerData.getTextWrapList(), textStickerData.getBgMode(), textStickerData.getColor(), textStickerData.getAlign(), textStickerData.getFontType(), false, textStickerData.getFontSize(), 0);
            }
        }
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.Q = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.f88471f.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.G = true;
            TextStickerEditText textStickerEditText = this.f88680h;
            l.b(textStickerEditText, "");
            textStickerEditText.setVisibility(4);
            LinearLayout linearLayout = this.s;
            l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            this.f88471f.setVisibility(0);
            return;
        }
        this.G = false;
        TextStickerEditText textStickerEditText2 = this.f88680h;
        l.b(textStickerEditText2, "");
        textStickerEditText2.setVisibility(0);
        LinearLayout linearLayout2 = this.s;
        l.b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        this.f88471f.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void setEffectText(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty() || list == null) {
            this.f88471f.setText(n.d(new p(null, 0, false, false, 15)));
            return;
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new p(t.getText(), t.getSelectionStart(), false, t.getHasFocus()));
        }
        this.f88471f.setText(arrayList);
    }

    static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EffectTextStickerInputLayout f88473a;

        static {
            Covode.recordClassIndex(55690);
        }

        a(EffectTextStickerInputLayout effectTextStickerInputLayout) {
            this.f88473a = effectTextStickerInputLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f88473a.f88466a = x;
                this.f88473a.f88467b = y;
                return false;
            } else if (action != 1 || Math.abs(this.f88473a.f88467b - y) >= ((float) this.f88473a.f88468c) || Math.abs(this.f88473a.f88466a - x) >= ((float) this.f88473a.f88468c)) {
                return false;
            } else {
                this.f88473a.c();
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectTextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(4785);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.bq1);
        this.N = relativeLayout;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        l.b(viewConfiguration, "");
        this.f88468c = viewConfiguration.getScaledPagingTouchSlop();
        ScrollView scrollView = new ScrollView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        scrollView.setLayoutParams(layoutParams);
        scrollView.setFillViewport(true);
        relativeLayout.addView(scrollView);
        scrollView.setOnTouchListener(new a(this));
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(frameLayout);
        this.P = frameLayout;
        u uVar = new u(context, (byte) 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        uVar.setLayoutParams(layoutParams2);
        frameLayout.addView(uVar);
        this.f88470e = uVar;
        n nVar = new n(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        nVar.setLayoutParams(layoutParams3);
        nVar.setVisibility(4);
        nVar.setShowHint(true);
        String string = context.getString(R.string.esw);
        l.b(string, "");
        nVar.setHintString(string);
        nVar.setMaxViewWidth(dh.b(context));
        uVar.addView(nVar);
        this.f88471f = nVar;
        this.f88680h.addTextChangedListener(new TextWatcher(this) {
            /* class com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EffectTextStickerInputLayout f88472a;

            static {
                Covode.recordClassIndex(55689);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f88472a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                d.a(this.f88472a.f88680h, 20, com.ss.android.ugc.aweme.editSticker.b.a().f88048c, null);
            }
        });
        LinearLayout linearLayout = this.v;
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (this.q instanceof TextView) {
            View view = this.q;
            if (view != null) {
                ((TextView) view).setTextColor(androidx.core.content.b.c(context, R.color.a9));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.o(4785);
                throw nullPointerException;
            }
        }
        this.f88680h.bringToFront();
        TextStickerEditText textStickerEditText = this.f88680h;
        l.b(textStickerEditText, "");
        textStickerEditText.setHint(" ");
        TextStickerEditText textStickerEditText2 = this.f88680h;
        l.b(textStickerEditText2, "");
        ViewGroup.LayoutParams layoutParams4 = textStickerEditText2.getLayoutParams();
        layoutParams4.width = -2;
        TextStickerEditText textStickerEditText3 = this.f88680h;
        l.b(textStickerEditText3, "");
        textStickerEditText3.setLayoutParams(layoutParams4);
        MethodCollector.o(4785);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.view.i
    public final void a(List<TextStickerTextWrap> list, int i2, int i3, int i4, String str, boolean z, int i5, int i6) {
        this.f88471f.setEditable(true);
        d.a((EditText) this.f88680h, true);
        super.a(list, i2, i3, i4, str, z, i5, i6);
    }
}
