package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class b implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f17510a;

    static {
        Covode.recordClassIndex(9697);
    }

    b(a aVar) {
        this.f17510a = aVar;
    }

    public final boolean onLongClick(View view) {
        MethodCollector.i(1219);
        a aVar = this.f17510a;
        Room room = aVar.f17502i;
        boolean z = false;
        if (!(room == null || room.getOwner() == null)) {
            int[] iArr = new int[2];
            aVar.itemView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            View view2 = (View) aVar.itemView.getParent();
            view2.getLocationInWindow(iArr2);
            int a2 = y.a(78.0f);
            int max = Math.max(0, iArr2[1] - iArr[1]);
            int height = (aVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + aVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
            float f2 = ((float) a2) / 2.0f;
            if (((float) height) >= (((float) aVar.itemView.getHeight()) / 2.0f) + f2) {
                View inflate = View.inflate(aVar.itemView.getContext(), R.layout.bdd, null);
                View findViewById = inflate.findViewById(R.id.amc);
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) aVar.itemView.getHeight()) / 2.0f) - f2) - ((float) max));
                PopupWindow popupWindow = new PopupWindow(inflate, aVar.itemView.getWidth(), height, true);
                inflate.setOnClickListener(new g(popupWindow));
                findViewById.setOnClickListener(new h(aVar, room, popupWindow));
                popupWindow.showAtLocation(aVar.itemView, 51, iArr[0], iArr[1] + max);
                z = true;
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        MethodCollector.o(1219);
        return z;
    }
}
