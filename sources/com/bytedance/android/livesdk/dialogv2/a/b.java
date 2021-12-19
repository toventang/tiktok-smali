package com.bytedance.android.livesdk.dialogv2.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.dialogv2.c.a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.lang.reflect.Field;

public final class b extends a {
    static {
        Covode.recordClassIndex(9414);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.livesdk.dialogv2.a.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public b(DataChannel dataChannel, LiveGiftDialogViewModel liveGiftDialogViewModel) {
        super(dataChannel, liveGiftDialogViewModel);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10759);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(10759);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.a.a
    public final a a(ViewGroup viewGroup, int i2) {
        Display defaultDisplay;
        l.d(viewGroup, "");
        a a2 = super.a(viewGroup, i2);
        Object a3 = a(y.e(), "window");
        if (!(a3 instanceof WindowManager)) {
            a3 = null;
        }
        WindowManager windowManager = (WindowManager) a3;
        Point point = new Point();
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getSize(point);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(point.x / 4, (int) n.b(y.e(), 110.0f));
        View view = a2.itemView;
        l.b(view, "");
        view.setLayoutParams(layoutParams);
        return a2;
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10761);
        a a3 = bVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(10761);
        return a3;
    }
}
