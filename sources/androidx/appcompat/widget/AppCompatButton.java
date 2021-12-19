package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.h.u;
import androidx.core.widget.b;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.framework.a.a;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

public class AppCompatButton extends Button implements u, b {

    /* renamed from: a  reason: collision with root package name */
    private final e f1368a;

    /* renamed from: b  reason: collision with root package name */
    private final s f1369b;

    static {
        Covode.recordClassIndex(397);
    }

    @Override // androidx.core.h.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1368a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // androidx.core.h.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1368a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.b
    public int getAutoSizeMaxTextSize() {
        if (f2633d) {
            return super.getAutoSizeMaxTextSize();
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1705d);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f2633d) {
            return super.getAutoSizeMinTextSize();
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1704c);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f2633d) {
            return super.getAutoSizeStepGranularity();
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            return Math.round(sVar.f1687a.f1703b);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f2633d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            return sVar.f1687a.f1706e;
        }
        return new int[0];
    }

    @Override // androidx.core.widget.b
    public int getAutoSizeTextType() {
        if (!f2633d) {
            s sVar = this.f1369b;
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

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        String str;
        try {
            super.drawableStateChanged();
            e eVar = this.f1368a;
            if (eVar != null) {
                eVar.d();
            }
            s sVar = this.f1369b;
            if (sVar != null) {
                sVar.a();
            }
        } catch (Exception e2) {
            a.a((Throwable) e2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("targetViewId", getId());
            jSONObject.put("targetViewClassName", getClass().getName());
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
            }
            Activity j2 = f.j();
            if (j2 != null) {
                str = j2.getClass().getName();
            } else {
                str = "";
            }
            jSONObject.put("currentActivity", str);
            jSONObject.put("errorMsg", Log.getStackTraceString(e2));
            com.bytedance.apm.b.a("detail_view_animation_crash", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(z);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1368a;
        if (eVar != null) {
            eVar.a(colorStateList);
        }
    }

    @Override // androidx.core.h.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1368a;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (f2633d) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1368a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1368a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.lz);
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (f2633d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(iArr, i2);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        if (f2633d) {
            super.setTextSize(i2, f2);
            return;
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(i2, f2);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) {
        super(ai.a(context), attributeSet, i2);
        e eVar = new e(this);
        this.f1368a = eVar;
        eVar.a(attributeSet, i2);
        s sVar = new s(this);
        this.f1369b = sVar;
        sVar.a(attributeSet, i2);
        sVar.a();
    }

    @Override // androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (f2633d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.a(i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        if (this.f1369b != null && !f2633d && this.f1369b.f1687a.b()) {
            this.f1369b.f1687a.a();
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        s sVar = this.f1369b;
        if (sVar != null) {
            sVar.b();
        }
    }
}
