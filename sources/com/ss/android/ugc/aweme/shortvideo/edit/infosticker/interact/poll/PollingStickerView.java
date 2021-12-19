package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.n;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.widget.i;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public final class PollingStickerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f127496a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f127497b = en.a(73.0d, i.f115645a);

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f127498c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f127499d;

    static {
        Covode.recordClassIndex(83592);
    }

    public final View b(int i2) {
        if (this.f127499d == null) {
            this.f127499d = new HashMap();
        }
        View view = (View) this.f127499d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f127499d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83593);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollEditText.setVisibility(0);
        Space space = (Space) b(R.id.c84);
        l.b(space, "");
        space.setVisibility(0);
    }

    public final PollStruct getPollStruct() {
        PollStruct pollStruct = new PollStruct();
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollStruct.setQuestion(String.valueOf(pollEditText.getText()));
        ArrayList arrayList = new ArrayList();
        PollStruct.OptionsBean optionsBean = new PollStruct.OptionsBean();
        PollEditText pollEditText2 = (PollEditText) b(R.id.ay8);
        l.b(pollEditText2, "");
        optionsBean.setPostOption(String.valueOf(pollEditText2.getText()));
        arrayList.add(optionsBean);
        PollStruct.OptionsBean optionsBean2 = new PollStruct.OptionsBean();
        PollEditText pollEditText3 = (PollEditText) b(R.id.ay9);
        l.b(pollEditText3, "");
        optionsBean2.setPostOption(String.valueOf(pollEditText3.getText()));
        arrayList.add(optionsBean2);
        pollStruct.setOptions(arrayList);
        return pollStruct;
    }

    public final void a() {
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollEditText.setVisibility(8);
        Space space = (Space) b(R.id.c84);
        l.b(space, "");
        space.setVisibility(8);
        PollEditText pollEditText2 = (PollEditText) b(R.id.ay_);
        l.b(pollEditText2, "");
        if (!p.a((CharSequence) String.valueOf(pollEditText2.getText()))) {
            PollEditText pollEditText3 = (PollEditText) b(R.id.ay_);
            l.b(pollEditText3, "");
            pollEditText3.setVisibility(0);
            Space space2 = (Space) b(R.id.c84);
            l.b(space2, "");
            space2.setVisibility(0);
        }
        PollEditText pollEditText4 = (PollEditText) b(R.id.ay8);
        l.b(pollEditText4, "");
        Editable text = pollEditText4.getText();
        if (text == null || text.length() == 0) {
            ((PollEditText) b(R.id.ay8)).setText(R.string.hdm);
        }
        PollEditText pollEditText5 = (PollEditText) b(R.id.ay9);
        l.b(pollEditText5, "");
        Editable text2 = pollEditText5.getText();
        if (text2 == null || text2.length() == 0) {
            ((PollEditText) b(R.id.ay9)).setText(R.string.hdn);
        }
    }

    public final int getLastTouchedIndex() {
        if (((PollEditText) b(R.id.ay_)).f127477a > ((PollEditText) b(R.id.ay8)).f127477a) {
            if (((PollEditText) b(R.id.ay_)).f127477a >= ((PollEditText) b(R.id.ay9)).f127477a || System.currentTimeMillis() - ((PollEditText) b(R.id.ay9)).f127477a >= 1000) {
                return 0;
            }
            return 2;
        } else if (((PollEditText) b(R.id.ay8)).f127477a > ((PollEditText) b(R.id.ay9)).f127477a) {
            if (System.currentTimeMillis() - ((PollEditText) b(R.id.ay8)).f127477a < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - ((PollEditText) b(R.id.ay9)).f127477a < 1000) {
            return 2;
        }
        return 0;
    }

    private final void c() {
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bks, this, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a2;
        this.f127498c = linearLayout;
        if (linearLayout == null) {
            l.a("container");
        }
        addView(linearLayout);
        e.f127522a = Math.max(n.d(getContext()) / 4, this.f127497b);
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        ((PollEditText) b(R.id.ay_)).addTextChangedListener(new c(pollEditText, (EditText) b(R.id.ay8)));
        PollEditText pollEditText2 = (PollEditText) b(R.id.ay8);
        l.b(pollEditText2, "");
        ((PollEditText) b(R.id.ay8)).addTextChangedListener(new b(pollEditText2, (EditText) b(R.id.ay9)));
        PollEditText pollEditText3 = (PollEditText) b(R.id.ay9);
        l.b(pollEditText3, "");
        ((PollEditText) b(R.id.ay9)).addTextChangedListener(new b(pollEditText3));
        Typeface c2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().c("");
        if (c2 != null) {
            PollEditText pollEditText4 = (PollEditText) b(R.id.ay_);
            l.b(pollEditText4, "");
            pollEditText4.setTypeface(c2);
        }
        e.a((EditText) b(R.id.ay_), 10.0d);
        e.a((EditText) b(R.id.ay8), 20.0d);
        e.a((EditText) b(R.id.ay9), 20.0d);
        ((PollEditText) b(R.id.ay8)).setLayerType(1, null);
        ((PollEditText) b(R.id.ay9)).setLayerType(1, null);
        PollEditText pollEditText5 = (PollEditText) b(R.id.ay8);
        l.b(pollEditText5, "");
        i.b.a(pollEditText5, Color.parseColor("#ffffff"), en.a(22.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), Color.parseColor("#3d000000"), en.a(4.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), 0, 0);
        PollEditText pollEditText6 = (PollEditText) b(R.id.ay9);
        l.b(pollEditText6, "");
        i.b.a(pollEditText6, Color.parseColor("#ffffff"), en.a(22.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), Color.parseColor("#3d000000"), en.a(4.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), 0, 0);
        ((PollEditText) b(R.id.ay_)).setOnKeyListener(d.f127504a);
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f127500a;

        /* renamed from: b  reason: collision with root package name */
        private final EditText f127501b;

        static {
            Covode.recordClassIndex(83594);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public /* synthetic */ b(EditText editText) {
            this(editText, null);
        }

        public final void afterTextChanged(Editable editable) {
            e.a(this.f127500a, 1);
            String valueOf = String.valueOf(editable);
            if (p.a((CharSequence) valueOf, '\r', 0, false, 6) >= 0 || p.a((CharSequence) valueOf, '\n', 0, false, 6) >= 0) {
                this.f127500a.setText(p.a(p.a(valueOf, "\r", "", false), "\n", "", false));
                EditText editText = this.f127500a;
                editText.setSelection(editText.getText().length());
                e.b(this.f127501b);
            }
        }

        public b(EditText editText, EditText editText2) {
            l.d(editText, "");
            this.f127500a = editText;
            this.f127501b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            e.a(this.f127500a, 20.0d);
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f127502a;

        /* renamed from: b  reason: collision with root package name */
        private final EditText f127503b;

        static {
            Covode.recordClassIndex(83595);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            e.a(this.f127502a, e.f127526e);
            e.f127527f = e.a(this.f127502a);
        }

        public c(EditText editText, EditText editText2) {
            l.d(editText, "");
            this.f127502a = editText;
            this.f127503b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            e.a(this.f127502a, 10.0d);
        }
    }

    public final void a(int i2) {
        e.f127526e = i2;
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollEditText.setMaxLines(e.f127526e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerView(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7710);
        c();
        MethodCollector.o(7710);
    }

    public final void setEditEnable(boolean z) {
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollEditText.setEnabled(z);
        PollEditText pollEditText2 = (PollEditText) b(R.id.ay8);
        l.b(pollEditText2, "");
        pollEditText2.setEnabled(z);
        PollEditText pollEditText3 = (PollEditText) b(R.id.ay9);
        l.b(pollEditText3, "");
        pollEditText3.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        ((PollEditText) b(R.id.ay_)).setMode(z);
        ((PollEditText) b(R.id.ay8)).setMode(z);
        ((PollEditText) b(R.id.ay9)).setMode(z);
    }

    public final void a(PollStruct pollStruct) {
        l.d(pollStruct, "");
        ((PollEditText) b(R.id.ay_)).setText(pollStruct.getQuestion());
        PollStruct.OptionsBean optionsBean = pollStruct.getOptions().get(0);
        l.b(optionsBean, "");
        ((PollEditText) b(R.id.ay8)).setText(optionsBean.getPostOption());
        PollStruct.OptionsBean optionsBean2 = pollStruct.getOptions().get(1);
        l.b(optionsBean2, "");
        ((PollEditText) b(R.id.ay9)).setText(optionsBean2.getPostOption());
    }

    public final void setEditTextFocusable(int i2) {
        PollEditText pollEditText = (PollEditText) b(R.id.ay_);
        l.b(pollEditText, "");
        pollEditText.setVisibility(0);
        Space space = (Space) b(R.id.c84);
        l.b(space, "");
        space.setVisibility(0);
        if (i2 == 0) {
            e.b((EditText) b(R.id.ay_));
        } else if (i2 == 1) {
            e.b((EditText) b(R.id.ay8));
        } else if (i2 == 2) {
            e.b((EditText) b(R.id.ay9));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollingStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(7714);
        c();
        MethodCollector.o(7714);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f127504a = new d();

        static {
            Covode.recordClassIndex(83596);
        }

        d() {
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (66 != i2) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() != 0 || e.f127527f < e.f127526e) {
                return false;
            }
            return true;
        }
    }
}
