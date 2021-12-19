package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.f.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Locale;

public final class SearchableEditText extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f101242d = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f101243c;

    /* renamed from: e  reason: collision with root package name */
    private final String f101244e;

    /* renamed from: f  reason: collision with root package name */
    private final Drawable f101245f;

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f101246g;

    /* renamed from: h  reason: collision with root package name */
    private b f101247h;

    public interface b {
        static {
            Covode.recordClassIndex(64765);
        }

        void b();
    }

    static {
        Covode.recordClassIndex(64763);
    }

    public SearchableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64764);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void setKeyImeChangeListener(b bVar) {
        l.d(bVar, "");
        this.f101247h = bVar;
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f101248a = new c();

        static {
            Covode.recordClassIndex(64766);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_x_mark_circle_fill;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bj);
            return z.f158842a;
        }
    }

    private void a(boolean z) {
        Drawable drawable;
        if (!this.f101243c || !z) {
            drawable = null;
        } else {
            drawable = this.f101245f;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        l.b(compoundDrawablesRelative, "");
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    public final void setSearchable(boolean z) {
        Drawable drawable;
        this.f101243c = z;
        if (z) {
            drawable = this.f101246g;
        } else {
            drawable = null;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        l.b(compoundDrawablesRelative, "");
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public final boolean onTextContextMenuItem(int i2) {
        if (i2 != 16908322) {
            return super.onTextContextMenuItem(i2);
        }
        try {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i2);
            if (onTextContextMenuItem) {
                Editable text = getText();
                if (text == null) {
                    l.b();
                }
                if (text.length() <= 1024) {
                    com.ss.android.ugc.aweme.emoji.i.b.b.a(this);
                }
            }
            return onTextContextMenuItem;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f101249a = new d();

        static {
            Covode.recordClassIndex(64767);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_tab_explore_fill;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()));
            aVar2.f44753e = Integer.valueOf((int) R.attr.bj);
            return z.f158842a;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 1) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            if (g.a(Locale.getDefault()) == 1) {
                if (drawable != null && motionEvent.getX() >= ((float) (getLeft() + getPaddingLeft())) && motionEvent.getX() <= ((float) (getLeft() + getPaddingLeft() + drawable.getBounds().width()))) {
                    setText("");
                }
            } else if (drawable != null && motionEvent.getX() <= ((float) (getWidth() - getPaddingRight())) && motionEvent.getX() >= ((float) ((getWidth() - getPaddingRight()) - drawable.getBounds().width()))) {
                setText("");
            }
        }
        String str = this.f101244e;
        StringBuilder append = new StringBuilder().append(motionEvent.getAction()).append(", ").append(getLineCount()).append(" line, ");
        Editable text = getText();
        if (text != null) {
            num = Integer.valueOf(text.length());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c(str, append.append(num).append(" character.").toString());
        int lineCount = getLineCount();
        boolean z = false;
        for (int i2 = 0; i2 < lineCount; i2++) {
            com.ss.android.ugc.aweme.im.service.m.a.c(this.f101244e, "Line " + i2 + " has " + (getLayout().getLineEnd(i2) - getLayout().getLineStart(i2)) + " character.");
        }
        try {
            z = super.onTouchEvent(motionEvent);
            return z;
        } catch (IndexOutOfBoundsException e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a(e2);
            return z;
        }
    }

    public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        b bVar;
        if (keyEvent == null || keyEvent.getAction() != 0 || 4 != keyEvent.getKeyCode() || (bVar = this.f101247h) == null) {
            return false;
        }
        bVar.b();
        return false;
    }

    private /* synthetic */ SearchableEditText(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtEditText
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        Editable text;
        super.onFocusChanged(z, i2, rect);
        boolean z2 = true;
        if (!z || !((text = getText()) == null || text.length() == 0)) {
            z2 = false;
        }
        a(z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchableEditText(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f101244e = "SearchableEditText";
        this.f101245f = com.bytedance.tux.c.c.a(c.f101248a).a(context);
        this.f101246g = com.bytedance.tux.c.c.a(d.f101249a).a(context);
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        l.d(charSequence, "");
        super.onTextChanged(charSequence, i2, i3, i4);
        boolean z = true;
        if (!isFocused() || charSequence.length() <= 0) {
            z = false;
        }
        a(z);
    }
}
