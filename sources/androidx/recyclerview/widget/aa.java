package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

final class aa {
    static {
        Covode.recordClassIndex(1528);
    }

    static int a(RecyclerView.s sVar, x xVar, View view, View view2, RecyclerView.i iVar, boolean z) {
        if (iVar.s() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view2)) + 1;
        }
        return Math.min(xVar.e(), xVar.b(view2) - xVar.a(view));
    }

    static int b(RecyclerView.s sVar, x xVar, View view, View view2, RecyclerView.i iVar, boolean z) {
        if (iVar.s() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.a();
        }
        return (int) ((((float) (xVar.b(view2) - xVar.a(view))) / ((float) (Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view2)) + 1))) * ((float) sVar.a()));
    }

    static int a(RecyclerView.s sVar, x xVar, View view, View view2, RecyclerView.i iVar, boolean z, boolean z2) {
        int max;
        if (iVar.s() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(RecyclerView.i.e(view), RecyclerView.i.e(view2));
        int max2 = Math.max(RecyclerView.i.e(view), RecyclerView.i.e(view2));
        if (z2) {
            max = Math.max(0, (sVar.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(xVar.b(view2) - xVar.a(view))) / ((float) (Math.abs(RecyclerView.i.e(view) - RecyclerView.i.e(view2)) + 1)))) + ((float) (xVar.b() - xVar.a(view))));
    }
}
