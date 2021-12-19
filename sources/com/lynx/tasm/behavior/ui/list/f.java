package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f56220a = 80;

    /* renamed from: b  reason: collision with root package name */
    a f56221b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f56222c;

    static {
        Covode.recordClassIndex(35125);
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<RecyclerView> f56223a;

        /* renamed from: b  reason: collision with root package name */
        Callback f56224b = null;

        /* renamed from: c  reason: collision with root package name */
        int f56225c;

        /* renamed from: d  reason: collision with root package name */
        String f56226d;

        /* renamed from: e  reason: collision with root package name */
        int f56227e;

        /* renamed from: f  reason: collision with root package name */
        View f56228f = null;

        /* renamed from: g  reason: collision with root package name */
        public boolean f56229g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f56230h;

        /* renamed from: i  reason: collision with root package name */
        private int f56231i;

        static {
            Covode.recordClassIndex(35126);
        }

        /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 478
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.f.a.run():void");
        }

        a(RecyclerView recyclerView) {
            this.f56223a = new WeakReference<>(recyclerView);
        }
    }

    f(Context context, RecyclerView recyclerView) {
        f56220a = context.getResources().getDisplayMetrics().densityDpi / 4;
        this.f56222c = recyclerView;
        this.f56221b = new a(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, Callback callback) {
        a aVar = this.f56221b;
        if (aVar == null || !aVar.f56229g) {
            RecyclerView.i layoutManager = this.f56222c.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).a(i2, i3);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).a(i2, i3);
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        if (UIList.f56161h) {
            LLog.a(6, "UIList", "ListScroller scrollToPositionSmoothly is scrolling ");
        }
        if (callback != null) {
            callback.invoke(1, "dumplicated, scrollToPositionSmoothly is working");
        }
    }
}
