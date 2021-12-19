package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.f.d;
import androidx.core.h.u;
import androidx.core.widget.b;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements u, b {

    /* renamed from: a  reason: collision with root package name */
    private final e f1377a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1378b;

    /* renamed from: c  reason: collision with root package name */
    private Future<d> f1379c;

    static {
        Covode.recordClassIndex(402);
    }

    public CharSequence getText() {
        a();
        return super.getText();
    }

    public d.a getTextMetricsParamsCompat() {
        return h.c(this);
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1377a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1377a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    private void a() {
        Future<d> future = this.f1379c;
        if (future != null) {
            try {
                this.f1379c = null;
                h.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1377a;
        if (eVar != null) {
            eVar.d();
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a();
        }
    }

    @Override // androidx.core.widget.b
    public int getAutoSizeMaxTextSize() {
        if (f2633d) {
            return super.getAutoSizeMaxTextSize();
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1705d);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f2633d) {
            return super.getAutoSizeMinTextSize();
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1704c);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f2633d) {
            return super.getAutoSizeStepGranularity();
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1703b);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f2633d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            return sVar.f1687a.f1706e;
        }
        return new int[0];
    }

    @Override // androidx.core.widget.b
    public int getAutoSizeTextType() {
        if (!f2633d) {
            s sVar = this.f1378b;
            if (sVar != null) {
                return sVar.f1687a.f1702a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setLineHeight(int i2) {
        h.e(this, i2);
    }

    public void setPrecomputedText(d dVar) {
        h.a(this, dVar);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1377a;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1377a;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextFuture(Future<d> future) {
        this.f1379c = future;
        requestLayout();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (f2633d) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1377a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1377a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            h.c(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            h.d(this, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMetricsParamsCompat(androidx.core.f.d.a r4) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTextMetricsParamsCompat(androidx.core.f.d$a):void");
    }

    public void onMeasure(int i2, int i3) {
        a();
        super.onMeasure(i2, i3);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (f2633d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a(iArr, i2);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        if (f2633d) {
            super.setTextSize(i2, f2);
            return;
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a(i2, f2);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1377a = eVar;
        eVar.a(attributeSet, i2);
        s sVar = new s(this);
        this.f1378b = sVar;
        sVar.a(attributeSet, i2);
        sVar.a();
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (f2633d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.a(i2, i3, i4, i5);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f1378b != null && !f2633d && this.f1378b.f1687a.b()) {
            this.f1378b.f1687a.a();
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        s sVar = this.f1378b;
        if (sVar != null) {
            sVar.b();
        }
    }
}
