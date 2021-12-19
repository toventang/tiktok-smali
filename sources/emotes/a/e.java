package emotes.a;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

public final class e extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public int f157092a;

    /* renamed from: b  reason: collision with root package name */
    public int f157093b;

    /* renamed from: c  reason: collision with root package name */
    public int f157094c;

    /* renamed from: d  reason: collision with root package name */
    private View f157095d;

    /* renamed from: e  reason: collision with root package name */
    private Context f157096e;

    /* renamed from: f  reason: collision with root package name */
    private int f157097f;

    static {
        Covode.recordClassIndex(104322);
    }

    public final void a(View view, int i2) {
        dismiss();
        if (view != null) {
            int i3 = this.f157093b;
            if (i3 == 0) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                showAtLocation(view, this.f157092a, iArr[0] + i2, (iArr[1] - this.f157097f) + 0);
            } else if (i3 == 1) {
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int i4 = this.f157092a;
                double width = (double) (iArr2[0] + (view.getWidth() / 2));
                double d2 = (double) this.f157094c;
                Double.isNaN(d2);
                Double.isNaN(width);
                showAtLocation(view, i4, (int) (width - (d2 * 0.6666666666666666d)), iArr2[1] + view.getHeight());
            } else if (i3 == 2) {
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                showAtLocation(view, this.f157092a, iArr3[0] - view.getWidth(), iArr3[1]);
            } else if (i3 == 3) {
                int[] iArr4 = new int[2];
                view.getLocationInWindow(iArr4);
                showAtLocation(view, this.f157092a, iArr4[0] + view.getWidth(), iArr4[1]);
            }
        }
    }

    public final void a(View view, Context context, int i2, int i3) {
        this.f157095d = view;
        this.f157096e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f157094c = i2;
        this.f157097f = i3;
    }
}
