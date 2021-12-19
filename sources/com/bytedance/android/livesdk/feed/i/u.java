package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class u implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f17570a;

    static {
        Covode.recordClassIndex(9722);
    }

    u(p pVar) {
        this.f17570a = pVar;
    }

    public final boolean onLongClick(View view) {
        MethodCollector.i(2454);
        p pVar = this.f17570a;
        int[] iArr = new int[2];
        pVar.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view2 = (View) pVar.itemView.getParent();
        view2.getLocationInWindow(iArr2);
        int a2 = y.a(78.0f);
        boolean z = false;
        int max = Math.max(0, iArr2[1] - iArr[1]);
        int height = (pVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + pVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
        float f2 = ((float) a2) / 2.0f;
        if (((float) height) >= (((float) pVar.itemView.getHeight()) / 2.0f) + f2) {
            View inflate = View.inflate(pVar.itemView.getContext(), R.layout.bdd, null);
            View findViewById = inflate.findViewById(R.id.amc);
            ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) pVar.itemView.getHeight()) / 2.0f) - f2) - ((float) max));
            PopupWindow popupWindow = new PopupWindow(inflate, pVar.itemView.getWidth(), height, true);
            inflate.setOnClickListener(new aa(popupWindow));
            findViewById.setOnClickListener(new s(pVar, popupWindow));
            popupWindow.showAtLocation(pVar.itemView, 51, iArr[0], iArr[1] + max);
            z = true;
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        MethodCollector.o(2454);
        return z;
    }
}
