package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.search.model.e;

public class SugCompletionView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f82824a;

    /* renamed from: b  reason: collision with root package name */
    private a f82825b;

    public interface a {
        static {
            Covode.recordClassIndex(51620);
        }

        void a();

        void a(e eVar, int i2);

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(51619);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public void setKeyboardDismissHandler(a aVar) {
        this.f82825b = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f82825b != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f82825b.a(false);
            } else if (action != 2) {
                this.f82825b.a(true);
            } else {
                float f2 = (float) this.f82824a;
                float f3 = -f2;
                if (x < f3 || y < f3 || x >= ((float) (getRight() - getLeft())) + f2 || y >= ((float) (getBottom() - getTop())) + f2) {
                    this.f82825b.a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SugCompletionView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        this.f82824a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
