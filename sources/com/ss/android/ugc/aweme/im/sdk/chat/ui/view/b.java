package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range;
import h.a.i;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;

public class b extends DmtEditText {

    /* renamed from: b  reason: collision with root package name */
    public static final a f101266b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    h.f.a.a<z> f101267a;

    /* renamed from: c  reason: collision with root package name */
    private View.OnKeyListener f101268c;

    static {
        Covode.recordClassIndex(64778);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64779);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final h.f.a.a<z> getHeightChangeListener() {
        return this.f101267a;
    }

    /* access modifiers changed from: protected */
    public final View.OnKeyListener getMOnKeyListener() {
        return this.f101268c;
    }

    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public int f101275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101276b;

        static {
            Covode.recordClassIndex(64782);
        }

        public final void onGlobalLayout() {
            if (this.f101276b.getHeight() != this.f101275a) {
                this.f101275a = this.f101276b.getHeight();
                h.f.a.a<z> aVar = this.f101276b.f101267a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f101276b = bVar;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f101271a;

        /* renamed from: b  reason: collision with root package name */
        public String f101272b;

        /* renamed from: c  reason: collision with root package name */
        public String f101273c;

        /* renamed from: d  reason: collision with root package name */
        public Range f101274d;

        static {
            Covode.recordClassIndex(64781);
        }

        public final int hashCode() {
            int i2;
            int i3;
            String str = this.f101272b;
            int i4 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = i2 * 31;
            String str2 = this.f101273c;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i6 = (((i5 + i3) * 31) + this.f101271a) * 31;
            Range range = this.f101274d;
            if (range != null) {
                i4 = range.hashCode();
            }
            return i6 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f101271a != cVar.f101271a || !l.a((Object) this.f101273c, (Object) cVar.f101273c) || !l.a((Object) this.f101272b, (Object) cVar.f101272b) || !l.a(this.f101274d, cVar.f101274d)) {
                return false;
            }
            return true;
        }
    }

    private final List<c> getMentionSpans() {
        Object[] spans;
        Editable text = getText();
        List<c> list = null;
        if (!(text == null || (spans = text.getSpans(0, text.length(), c.class)) == null || (list = i.j(spans)) == null)) {
            for (T t : list) {
                t.f101274d = new Range(text.getSpanStart(t), text.getSpanEnd(t));
            }
        }
        return list;
    }

    public final boolean a() {
        c a2;
        Editable text;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionEnd != selectionStart || (a2 = a(selectionStart, selectionEnd)) == null) {
            return false;
        }
        Range range = a2.f101274d;
        if (range == null || (text = getText()) == null) {
            return true;
        }
        text.delete(range.getFrom(), range.getTo());
        return true;
    }

    public final void setHeightChangeListener(h.f.a.a<z> aVar) {
        this.f101267a = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setMOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f101268c = onKeyListener;
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f101268c = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        l.d(editorInfo, "");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.b(onCreateInputConnection, "");
        return new C2520b(this, onCreateInputConnection, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.b$b  reason: collision with other inner class name */
    final class C2520b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final b f101269a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f101270b;

        static {
            Covode.recordClassIndex(64780);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            l.d(keyEvent, "");
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && this.f101269a.a()) {
                View.OnKeyListener mOnKeyListener = this.f101270b.getMOnKeyListener();
                if (mOnKeyListener == null) {
                    return true;
                }
                mOnKeyListener.onKey(this.f101269a, keyEvent.getKeyCode(), keyEvent);
                return true;
            } else if (super.sendKeyEvent(keyEvent)) {
                return true;
            } else {
                return false;
            }
        }

        public final boolean deleteSurroundingText(int i2, int i3) {
            if ((i2 != 1 || i3 != 0 || !this.f101269a.a()) && !super.deleteSurroundingText(i2, i3)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2520b(b bVar, InputConnection inputConnection, b bVar2) {
            super(inputConnection, true);
            l.d(inputConnection, "");
            l.d(bVar2, "");
            this.f101270b = bVar;
            this.f101269a = bVar2;
        }
    }

    public final boolean a(String str) {
        l.d(str, "");
        if (getEditableText() == null) {
            return false;
        }
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            com.ss.android.ugc.aweme.im.service.m.a.e("MentionEditText", "addEmojiText index invalid: ".concat(String.valueOf(selectionStart)));
            return false;
        }
        SpannableString spannableString = new SpannableString(str);
        Drawable a2 = new com.ss.android.ugc.aweme.emoji.i.b.a().a(getContext(), str);
        if (a2 != null) {
            int lineHeight = getLineHeight();
            a2.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a2.getIntrinsicWidth()) + 0.0f) / ((float) a2.getIntrinsicHeight()))) + 0.5f), lineHeight);
            spannableString.setSpan(new com.bytedance.ies.dmt.ui.common.a(a2), 0, spannableString.length(), 33);
        }
        Editable text = getText();
        if (text == null) {
            return true;
        }
        text.insert(selectionStart, spannableString);
        return true;
    }

    private final c a(int i2, int i3) {
        List<c> j2;
        Editable text = getText();
        if (text != null) {
            if (text.length() < i3) {
                Object[] spans = text.getSpans(0, text.length(), c.class);
                if (spans != null) {
                    j2 = i.j(spans);
                }
            } else {
                Object[] spans2 = text.getSpans(0, i3, c.class);
                if (spans2 != null) {
                    j2 = i.j(spans2);
                }
            }
            if (j2 != null) {
                for (c cVar : j2) {
                    cVar.f101274d = new Range(text.getSpanStart(cVar), text.getSpanEnd(cVar));
                }
                for (c cVar2 : j2) {
                    Range range = cVar2.f101274d;
                    if (!(range == null || !range.contains(i2, i3) || i3 == range.getFrom())) {
                        return cVar2;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        List<c> mentionSpans = getMentionSpans();
        if (mentionSpans != null) {
            Iterator<T> it = mentionSpans.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Range range = next.f101274d;
                if (range != null && range.isWrappedBy(i2, i3)) {
                    Range range2 = next.f101274d;
                    if (range2 != null) {
                        if (i2 == i3) {
                            try {
                                setSelection(range2.getAnchorPosition(i2));
                                return;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return;
                            }
                        } else {
                            if (i3 < range2.getTo()) {
                                setSelection(i2, range2.getTo());
                            }
                            if (i2 > range2.getFrom()) {
                                setSelection(range2.getFrom(), i3);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (i2 == i3) {
            setSelection(i2);
        }
    }

    private /* synthetic */ b(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        Context context2 = getContext();
        if (context2 != null) {
            int i3 = Build.VERSION.SDK_INT;
            Resources resources = context2.getResources();
            l.b(resources, "");
            Configuration configuration = resources.getConfiguration();
            l.b(configuration, "");
            if (configuration.getLayoutDirection() == 1) {
                int i4 = Build.VERSION.SDK_INT;
                setTextAlignment(5);
                setGravity(getGravity() | 8388611);
            }
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new d(this));
    }
}
