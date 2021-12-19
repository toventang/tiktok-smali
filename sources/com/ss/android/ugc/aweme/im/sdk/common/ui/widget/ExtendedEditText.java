package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class ExtendedEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<TextWatcher> f102529a;

    static {
        Covode.recordClassIndex(65665);
    }

    public final void a() {
        ArrayList<TextWatcher> arrayList = this.f102529a;
        if (arrayList != null) {
            Iterator<TextWatcher> it = arrayList.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            ArrayList<TextWatcher> arrayList2 = this.f102529a;
            if (arrayList2 == null) {
                l.b();
            }
            arrayList2.clear();
            this.f102529a = null;
        }
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        l.d(textWatcher, "");
        if (this.f102529a == null) {
            this.f102529a = new ArrayList<>();
        }
        ArrayList<TextWatcher> arrayList = this.f102529a;
        if (arrayList == null) {
            l.b();
        }
        arrayList.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList;
        l.d(textWatcher, "");
        ArrayList<TextWatcher> arrayList2 = this.f102529a;
        if (!(arrayList2 == null || arrayList2.indexOf(textWatcher) < 0 || (arrayList = this.f102529a) == null)) {
            arrayList.remove(textWatcher);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
