package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

final class q {

    /* renamed from: a  reason: collision with root package name */
    boolean f4190a = true;

    /* renamed from: b  reason: collision with root package name */
    int f4191b;

    /* renamed from: c  reason: collision with root package name */
    int f4192c;

    /* renamed from: d  reason: collision with root package name */
    int f4193d;

    /* renamed from: e  reason: collision with root package name */
    int f4194e;

    /* renamed from: f  reason: collision with root package name */
    int f4195f;

    /* renamed from: g  reason: collision with root package name */
    int f4196g;

    /* renamed from: h  reason: collision with root package name */
    boolean f4197h;

    /* renamed from: i  reason: collision with root package name */
    boolean f4198i;

    static {
        Covode.recordClassIndex(1618);
    }

    q() {
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.f4191b + ", mCurrentPosition=" + this.f4192c + ", mItemDirection=" + this.f4193d + ", mLayoutDirection=" + this.f4194e + ", mStartLine=" + this.f4195f + ", mEndLine=" + this.f4196g + '}';
    }

    /* access modifiers changed from: package-private */
    public final View a(RecyclerView.o oVar) {
        View c2 = oVar.c(this.f4192c);
        this.f4192c += this.f4193d;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(RecyclerView.s sVar) {
        int i2 = this.f4192c;
        if (i2 < 0 || i2 >= sVar.a()) {
            return false;
        }
        return true;
    }
}
