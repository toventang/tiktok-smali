package com.ss.android.ugc.aweme.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import h.f.b.l;

public final class DetectSoftKeyEditText extends DmtEditText {

    /* renamed from: a  reason: collision with root package name */
    public View.OnKeyListener f144014a;

    /* renamed from: b  reason: collision with root package name */
    private b f144015b;

    public interface b {
        static {
            Covode.recordClassIndex(94232);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(94230);
    }

    public final void setOnSelectionChangedListener(b bVar) {
        this.f144015b = bVar;
    }

    public final void setSoftKeyListener(View.OnKeyListener onKeyListener) {
        l.d(onKeyListener, "");
        this.f144014a = onKeyListener;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(super.onCreateInputConnection(editorInfo));
    }

    final class a extends InputConnectionWrapper {
        static {
            Covode.recordClassIndex(94231);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            l.d(keyEvent, "");
            View.OnKeyListener onKeyListener = DetectSoftKeyEditText.this.f144014a;
            if (onKeyListener == null || !onKeyListener.onKey(DetectSoftKeyEditText.this, keyEvent.getKeyCode(), keyEvent)) {
                return super.sendKeyEvent(keyEvent);
            }
            return true;
        }

        public a(InputConnection inputConnection) {
            super(inputConnection, true);
        }

        public final boolean deleteSurroundingText(int i2, int i3) {
            if (i2 != 1 || i3 != 0) {
                return super.deleteSurroundingText(i2, i3);
            }
            if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                return false;
            }
            return true;
        }
    }

    public DetectSoftKeyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        b bVar = this.f144015b;
        if (bVar != null) {
            bVar.a(i2);
        }
    }
}
