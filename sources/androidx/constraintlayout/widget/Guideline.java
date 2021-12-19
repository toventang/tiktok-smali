package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

public class Guideline extends View {
    static {
        Covode.recordClassIndex(619);
    }

    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i2) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f2044a = i2;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f2045b = i2;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f2046c = f2;
        setLayoutParams(aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
