package com.ss.android.ugc.aweme.commentStickerPanel.itemview;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.qasticker.view.QaStickerView;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends ConstraintLayout {
    public static final a p = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public ConstraintLayout f73218g;

    /* renamed from: h  reason: collision with root package name */
    public CircleImageView f73219h;

    /* renamed from: i  reason: collision with root package name */
    public TuxEditText f73220i;

    /* renamed from: j  reason: collision with root package name */
    public long f73221j;

    /* renamed from: k  reason: collision with root package name */
    public long f73222k;

    /* renamed from: l  reason: collision with root package name */
    public long f73223l;

    /* renamed from: m  reason: collision with root package name */
    public String f73224m;
    public String n;
    public UrlModel o;
    private boolean q;

    static {
        Covode.recordClassIndex(45102);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45103);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.itemview.b$b  reason: collision with other inner class name */
    public static final class C1633b implements TextWatcher {
        static {
            Covode.recordClassIndex(45104);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        C1633b() {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                QaStickerView.a.a(editable);
            }
        }
    }

    public final boolean getTouchAble() {
        return this.q;
    }

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.f73218g;
        if (constraintLayout == null) {
            l.a("contentView");
        }
        return constraintLayout;
    }

    public final QaStruct getQaStruct() {
        String str;
        UrlModel urlModel = this.o;
        TuxEditText tuxEditText = this.f73220i;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        return new QaStruct(this.f73222k, this.f73223l, this.f73221j, urlModel, this.n, str, this.f73224m, null, null, 384, null);
    }

    public final void setTouchAble(boolean z) {
        this.q = z;
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.f73218g = constraintLayout;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.q) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAlpha(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        setAlpha(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        UrlModel urlModel = null;
        this.f73224m = "";
        this.n = "";
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        this.o = e2 != null ? e2.f() : urlModel;
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.cs, this, true);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a2;
        this.f73218g = constraintLayout;
        if (constraintLayout == null) {
            l.a("contentView");
        }
        View findViewById = constraintLayout.findViewById(R.id.dec);
        l.b(findViewById, "");
        this.f73219h = (CircleImageView) findViewById;
        ConstraintLayout constraintLayout2 = this.f73218g;
        if (constraintLayout2 == null) {
            l.a("contentView");
        }
        View findViewById2 = constraintLayout2.findViewById(R.id.ded);
        l.b(findViewById2, "");
        this.f73220i = (TuxEditText) findViewById2;
        CircleImageView circleImageView = this.f73219h;
        if (circleImageView == null) {
            l.a("avatarImage");
        }
        com.ss.android.ugc.tools.c.a.a(circleImageView, this.o, -1, -1);
        TuxEditText tuxEditText = this.f73220i;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        tuxEditText.addTextChangedListener(new C1633b());
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
