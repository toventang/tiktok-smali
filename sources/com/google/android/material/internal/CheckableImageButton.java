package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.h.a;
import androidx.core.h.a.d;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f52483a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private boolean f52484b;

    public boolean isChecked() {
        return this.f52484b;
    }

    public void toggle() {
        setChecked(!this.f52484b);
    }

    static {
        Covode.recordClassIndex(32532);
    }

    public void setChecked(boolean z) {
        if (this.f52484b != z) {
            this.f52484b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public int[] onCreateDrawableState(int i2) {
        if (!this.f52484b) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f52483a;
        return mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wn);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        v.a(this, new a() {
            /* class com.google.android.material.internal.CheckableImageButton.AnonymousClass1 */

            static {
                Covode.recordClassIndex(32533);
            }

            @Override // androidx.core.h.a
            public final void d(View view, AccessibilityEvent accessibilityEvent) {
                super.d(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.h.a
            public final void a(View view, d dVar) {
                super.a(view, dVar);
                dVar.a(true);
                dVar.f2484a.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }
}
