package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f1788a = getResources().getDimensionPixelOffset(R.dimen.e3);

    /* renamed from: b  reason: collision with root package name */
    private final int f1789b = getResources().getDimensionPixelOffset(R.dimen.e2);

    static {
        Covode.recordClassIndex(549);
    }

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1788a * 2), this.f1789b), 1073741824), i3);
    }
}
