package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends n {

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout.LayoutParams f135836k;

    static {
        Covode.recordClassIndex(88777);
    }

    public a(Context context, char c2) {
        this(context, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final int getLayout() {
        return R.layout.ah_;
    }

    public final FrameLayout.LayoutParams getParams() {
        return this.f135836k;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final TextWatcher getTextWatcher() {
        return new C3540a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.a$a  reason: collision with other inner class name */
    public static final class C3540a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135837a;

        static {
            Covode.recordClassIndex(88778);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3540a(a aVar) {
            this.f135837a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            int length;
            if (editable != null) {
                EditText editText = this.f135837a.f135864a;
                l.b(editText, "");
                int selectionStart = editText.getSelectionStart();
                EditText editText2 = this.f135837a.f135864a;
                l.b(editText2, "");
                int selectionEnd = editText2.getSelectionEnd();
                if (editable.toString().length() > this.f135837a.f135871h && this.f135837a.f135871h > 0) {
                    String obj = editable.toString();
                    int i2 = selectionStart - 1;
                    if (i2 < 0 || selectionEnd < 0 || selectionEnd < i2 || i2 > (length = obj.length()) || selectionEnd > length) {
                        editable.delete(this.f135837a.f135871h, editable.toString().length());
                    } else {
                        editable.delete(i2, selectionEnd);
                    }
                    EditText editText3 = this.f135837a.f135864a;
                    l.b(editText3, "");
                    editText3.setText(editable);
                    this.f135837a.f135864a.setSelection(editable.toString().length());
                    EditText editText4 = this.f135837a.f135864a;
                    l.b(editText4, "");
                    j.a.b(editText4.getContext(), this.f135837a.f135870g, 0).a();
                } else if (this.f135837a.f135869f != null) {
                    this.f135837a.f135869f.a(editable.toString());
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
            this.f135837a.f135872i = charSequence.toString();
            if (this.f135837a.f135872i == null) {
                this.f135837a.f135872i = "";
            }
        }
    }

    public final void setParams(FrameLayout.LayoutParams layoutParams) {
        l.d(layoutParams, "");
        this.f135836k = layoutParams;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null);
        l.d(context, "");
        EditText editText = this.f135864a;
        l.b(editText, "");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this.f135836k = (FrameLayout.LayoutParams) layoutParams;
    }

    @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.n
    public final void a(int i2) {
        if (this.f135864a != null) {
            FrameLayout.LayoutParams layoutParams = this.f135836k;
            EditText editText = this.f135864a;
            l.b(editText, "");
            Context context = editText.getContext();
            l.b(context, "");
            layoutParams.bottomMargin = (int) (((float) i2) + r.a(context, 16.0f));
            EditText editText2 = this.f135864a;
            l.b(editText2, "");
            editText2.setLayoutParams(this.f135836k);
        }
        h.f.a.a aVar = this.f135873j;
        if (aVar != null) {
            View view = this.f135867d;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            Object invoke = aVar.invoke();
            l.b(invoke, "");
            layoutParams3.topMargin = ((Number) invoke).intValue();
            View view2 = this.f135867d;
            l.b(view2, "");
            view2.setLayoutParams(layoutParams3);
        }
    }

    private /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
