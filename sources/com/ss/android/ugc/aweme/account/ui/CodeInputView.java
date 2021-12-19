package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Objects;

public final class CodeInputView extends DmtEditText implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public static final b f65354b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f65355a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f65356c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f65357d;

    /* renamed from: e  reason: collision with root package name */
    private int f65358e;

    /* renamed from: f  reason: collision with root package name */
    private float f65359f;

    /* renamed from: g  reason: collision with root package name */
    private float f65360g;

    /* renamed from: h  reason: collision with root package name */
    private float f65361h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f65362i;

    /* renamed from: j  reason: collision with root package name */
    private int f65363j;

    /* renamed from: k  reason: collision with root package name */
    private int f65364k;

    /* renamed from: l  reason: collision with root package name */
    private int f65365l;

    /* renamed from: m  reason: collision with root package name */
    private int f65366m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final h s;
    private final h t;
    private final h u;
    private int v;
    private a w;

    public interface a {
        static {
            Covode.recordClassIndex(40182);
        }

        void a_(String str);

        void b(String str);
    }

    static {
        Covode.recordClassIndex(40181);
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Rect getCharBounds() {
        return (Rect) this.u.getValue();
    }

    private final Paint getCursorPaint() {
        return (Paint) this.t.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.s.getValue();
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(40183);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class e implements ActionMode.Callback {
        static {
            Covode.recordClassIndex(40186);
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        e() {
        }
    }

    public final a getCallback() {
        return this.w;
    }

    static final class c extends m implements h.f.a.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65367a = new c();

        static {
            Covode.recordClassIndex(40184);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    static final class d extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65368a = new d();

        static {
            Covode.recordClassIndex(40185);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            return new Paint();
        }
    }

    static final class f extends m implements h.f.a.a<Paint> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f65369a = new f();

        static {
            Covode.recordClassIndex(40187);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Paint invoke() {
            return new Paint();
        }
    }

    public final void a() {
        super.setOnClickListener(new g(this));
    }

    public final void b() {
        super.setCustomSelectionActionModeCallback(new e());
    }

    public final void c() {
        getLinePaint().setColor(this.f65366m);
        invalidate();
    }

    public final void d() {
        getLinePaint().setColor(this.f65364k);
        invalidate();
    }

    private final void getNumberHeight() {
        boolean z;
        Editable text = getText();
        if (text == null || text.length() != 0) {
            z = false;
        } else {
            z = true;
            setText("0");
        }
        getCharBounds().setEmpty();
        getPaint().getTextBounds(String.valueOf(getText()), 0, 1, getCharBounds());
        this.f65360g = (float) (getCharBounds().bottom - getCharBounds().top);
        if (z) {
            setText("");
        }
    }

    public final void setCallback(a aVar) {
        this.w = aVar;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f65355a = onClickListener;
    }

    public final void setGravity(int i2) {
        super.setGravity(i2);
        this.v = i2;
    }

    public final void setInputLength(int i2) {
        if (i2 > 0) {
            this.q = 0;
            this.p = i2;
            com.ss.android.ugc.aweme.account.n.c.a(this, i2);
            invalidate();
        }
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.f65356c = true;
        setText(charSequence);
        this.f65356c = false;
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CodeInputView f65370a;

        static {
            Covode.recordClassIndex(40188);
        }

        g(CodeInputView codeInputView) {
            this.f65370a = codeInputView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            CodeInputView codeInputView = this.f65370a;
            Editable text = codeInputView.getText();
            if (text == null) {
                l.b();
            }
            codeInputView.setSelection(text.length());
            View.OnClickListener onClickListener = this.f65370a.f65355a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.f65357d = true;
        super.onRestoreInstanceState(parcelable);
        this.f65357d = false;
    }

    public final void setInputType(int i2) {
        int i3;
        super.setInputType(i2);
        if (v.e(this) == 1) {
            if (i2 == 2) {
                i3 = 8388613;
            } else {
                i3 = this.v;
            }
            setGravity(i3);
        }
    }

    public final void afterTextChanged(Editable editable) {
        int i2;
        a aVar;
        a aVar2;
        if (this.w != null) {
            if (editable != null) {
                i2 = editable.length();
            } else {
                i2 = 0;
            }
            int i3 = this.f65358e;
            if (i3 > 0 && i2 >= 0 && i3 > i2 && (aVar2 = this.w) != null) {
                aVar2.b(String.valueOf(editable));
            }
            if (((!l.a((Object) this.f65357d, (Object) true)) || this.f65356c) && i2 > 0 && i2 == this.p && (aVar = this.w) != null) {
                String valueOf = String.valueOf(editable);
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) valueOf).toString();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = obj.toLowerCase();
                l.b(lowerCase, "");
                aVar.a_(lowerCase);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r27) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.ui.CodeInputView.onDraw(android.graphics.Canvas):void");
    }

    private /* synthetic */ CodeInputView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CodeInputView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.sf);
        int i2;
        Integer num;
        l.d(context, "");
        this.f65362i = Integer.valueOf((int) R.color.a2);
        this.s = i.a((h.f.a.a) f.f65369a);
        this.t = i.a((h.f.a.a) d.f65368a);
        this.u = i.a((h.f.a.a) c.f65367a);
        setBackgroundResource(0);
        if (attributeSet != null) {
            i2 = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        } else {
            i2 = 4;
        }
        this.p = i2;
        if (attributeSet != null) {
            num = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", R.color.a2));
        } else {
            num = null;
        }
        this.f65362i = num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qq, R.attr.qs, R.attr.t9, R.attr.v3, R.attr.a2f, R.attr.a2g, R.attr.a2h});
        l.b(obtainStyledAttributes, "");
        this.f65364k = obtainStyledAttributes.getColor(4, -16777216);
        this.f65365l = obtainStyledAttributes.getColor(0, -65536);
        this.f65366m = obtainStyledAttributes.getColor(2, -65536);
        this.f65363j = obtainStyledAttributes.getDimensionPixelSize(1, n.a(2.0d));
        this.n = obtainStyledAttributes.getDimensionPixelSize(5, n.a(1.0d));
        this.o = obtainStyledAttributes.getDimensionPixelSize(3, n.a(10.0d));
        this.r = obtainStyledAttributes.getDimensionPixelSize(6, n.a(5.0d));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        l.b(paint, "");
        Integer num2 = this.f65362i;
        if (num2 == null) {
            l.b();
        }
        paint.setColor(androidx.core.content.b.c(context, num2.intValue()));
        getLinePaint().setColor(this.f65364k);
        getLinePaint().setStrokeWidth((float) this.n);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(this.f65365l);
        getCursorPaint().setStrokeWidth((float) this.f65363j);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Paint.Cap.ROUND);
        this.f65361h = getCursorPaint().getStrokeWidth() / 2.0f;
        setCursorVisible(false);
        this.v = getGravity();
        addTextChangedListener(this);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5;
        if (charSequence != null) {
            i5 = charSequence.length();
        } else {
            i5 = 0;
        }
        this.f65358e = i5;
    }
}
