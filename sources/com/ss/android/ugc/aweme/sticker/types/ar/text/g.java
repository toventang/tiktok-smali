package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class g extends n {

    /* renamed from: k  reason: collision with root package name */
    private RelativeLayout.LayoutParams f135846k;

    /* renamed from: l  reason: collision with root package name */
    private View f135847l;

    static {
        Covode.recordClassIndex(88785);
    }

    public g(Context context, char c2) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final int getLayout() {
        return R.layout.agk;
    }

    public final RelativeLayout.LayoutParams getParams() {
        return this.f135846k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final TextWatcher getTextWatcher() {
        return new a(this);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final void a() {
        super.a();
        this.f135869f.b(this.f135872i);
    }

    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f135848a;

        static {
            Covode.recordClassIndex(88786);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f135848a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            if ((this.f135848a.f135872i.length() <= this.f135848a.f135871h || this.f135848a.f135871h <= 0) && this.f135848a.f135869f != null) {
                this.f135848a.f135869f.a(editable.toString());
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            this.f135848a.f135872i = charSequence.toString();
            if (this.f135848a.f135872i == null) {
                this.f135848a.f135872i = "";
            }
        }
    }

    public final void setParams(RelativeLayout.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        this.f135846k = layoutParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private g(Context context) {
        super(context, null);
        l.d(context, "");
        EditText editText = this.f135864a;
        l.b(editText, "");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        this.f135846k = (RelativeLayout.LayoutParams) layoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final void a(Context context) {
        super.a(context);
        this.f135847l = this.f135866c.findViewById(R.id.adr);
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final void setMaxTextCount(int i2) {
        super.setMaxTextCount(i2);
        EditText editText = this.f135864a;
        l.b(editText, "");
        editText.setFilters(new b[]{new b(this, this.f135871h)});
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final void a(int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f135847l;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i2;
        View view2 = this.f135847l;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
        }
        h.f.a.a aVar = this.f135873j;
        if (aVar != null) {
            View view3 = this.f135867d;
            l.b(view3, "");
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            Object invoke = aVar.invoke();
            l.b(invoke, "");
            layoutParams4.topMargin = ((Number) invoke).intValue();
            View view4 = this.f135867d;
            l.b(view4, "");
            view4.setLayoutParams(layoutParams4);
        }
    }

    private /* synthetic */ g(Context context, byte b2) {
        this(context);
    }

    public static final class b extends InputFilter.LengthFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f135849a;

        static {
            Covode.recordClassIndex(88787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, int i2) {
            super(i2);
            this.f135849a = gVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            l.d(charSequence, "");
            l.d(spanned, "");
            CharSequence filter = super.filter(charSequence, i2, i3, spanned, i4, i5);
            if (this.f135849a.f135871h - (spanned.length() - (i5 - i4)) < i3 - i2) {
                EditText editText = this.f135849a.f135864a;
                l.b(editText, "");
                j.a.b(editText.getContext(), this.f135849a.f135870g, 0).a();
            }
            return filter;
        }
    }
}
