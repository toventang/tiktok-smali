package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji.widget.g;
import com.bytedance.android.live.design.a;
import com.bytedance.android.live.design.widget.b.e;
import com.bytedance.covode.number.Covode;

public class LiveTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9579a = a.C0139a.f9358a.a();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f9580b = a.C0139a.f9358a.f9356b;

    /* renamed from: c  reason: collision with root package name */
    private g f9581c;

    /* renamed from: e  reason: collision with root package name */
    private a f9582e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9583f;

    /* renamed from: g  reason: collision with root package name */
    private e f9584g;

    private g getEmojiTextViewHelper() {
        if (this.f9581c == null) {
            this.f9581c = new g(this);
        }
        return this.f9581c;
    }

    private a getInputFilterHelper() {
        if (this.f9582e == null) {
            this.f9582e = new a(this);
        }
        return this.f9582e;
    }

    private e getTextStyleableHelper() {
        if (this.f9584g == null) {
            this.f9584g = new e(this);
        }
        return this.f9584g;
    }

    static {
        Covode.recordClassIndex(4855);
    }

    public final void a(int i2) {
        getTextStyleableHelper().b(i2);
    }

    public LiveTextView(Context context) {
        super(context);
        a(null, 0);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (f9579a) {
            getEmojiTextViewHelper().a(z);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (f9580b) {
            a inputFilterHelper = getInputFilterHelper();
            int length = inputFilterArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    int length2 = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
                    inputFilterArr2[length2] = inputFilterHelper.f9585a;
                    inputFilterArr = inputFilterArr2;
                    break;
                } else if (inputFilterArr[i2] instanceof d) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (f9579a) {
            super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
        } else {
            super.setFilters(inputFilterArr);
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        getTextStyleableHelper().a(i2);
    }

    public void a(AttributeSet attributeSet, int i2) {
        if (!this.f9583f) {
            this.f9583f = true;
            getTextStyleableHelper().a(attributeSet, i2, 0);
            if (f9579a) {
                getEmojiTextViewHelper().f2835a.a();
            }
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        a(attributeSet, 0);
    }
}
