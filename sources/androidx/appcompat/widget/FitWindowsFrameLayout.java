package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.y;
import com.bytedance.covode.number.Covode;

public class FitWindowsFrameLayout extends FrameLayout implements y {

    /* renamed from: a  reason: collision with root package name */
    private y.a f1391a;

    static {
        Covode.recordClassIndex(407);
    }

    @Override // androidx.appcompat.widget.y
    public void setOnFitSystemWindowsListener(y.a aVar) {
        this.f1391a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        y.a aVar = this.f1391a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
