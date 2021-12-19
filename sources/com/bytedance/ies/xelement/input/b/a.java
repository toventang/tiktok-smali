package com.bytedance.ies.xelement.input.b;

import android.text.Editable;
import android.text.Selection;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.input.g;
import h.f.b.l;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37131a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(22335);
    }

    @Override // com.bytedance.ies.xelement.input.g
    public final boolean a(Editable editable) {
        l.c(editable, "");
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        Object[] spans = editable.getSpans(selectionStart, selectionEnd, b.class);
        l.a((Object) spans, "");
        int length = spans.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = spans[i2];
            if (editable.getSpanEnd(obj) != selectionStart) {
                i2++;
            } else if (obj != null) {
                if (selectionStart == selectionEnd) {
                    z = true;
                }
                Selection.setSelection(editable, editable.getSpanStart(obj), editable.getSpanEnd(obj));
            }
        }
        return z;
    }
}
