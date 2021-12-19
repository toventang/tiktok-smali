package com.bytedance.android.livesdk.chatroom.interaction;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.e;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.widget.l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.a.b;
import h.f.a.r;
import h.z;
import java.lang.reflect.Field;

public final class c extends l {

    /* renamed from: a  reason: collision with root package name */
    private final a f15648a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f15649b;

    /* renamed from: c  reason: collision with root package name */
    private final View f15650c;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<z> f15651d;

    /* renamed from: e  reason: collision with root package name */
    private final b<MotionEvent, Boolean> f15652e;

    /* renamed from: f  reason: collision with root package name */
    private final r<MotionEvent, MotionEvent, Float, Float, Boolean> f15653f;

    /* renamed from: g  reason: collision with root package name */
    private final r<MotionEvent, MotionEvent, Float, Float, Boolean> f15654g;

    /* renamed from: h  reason: collision with root package name */
    private final b<MotionEvent, Boolean> f15655h;

    static {
        Covode.recordClassIndex(8644);
    }

    @Override // com.bytedance.android.livesdk.widget.l
    public final boolean a(MotionEvent motionEvent) {
        Boolean invoke;
        b<MotionEvent, Boolean> bVar = this.f15655h;
        if (bVar == null || (invoke = bVar.invoke(motionEvent)) == null) {
            return super.a(motionEvent);
        }
        return invoke.booleanValue();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Boolean invoke;
        b<MotionEvent, Boolean> bVar = this.f15652e;
        if (bVar == null || (invoke = bVar.invoke(motionEvent)) == null) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        return invoke.booleanValue();
    }

    public final boolean onDown(MotionEvent motionEvent) {
        Object obj;
        if (!this.f15648a.isViewValid()) {
            return true;
        }
        try {
            e activity = this.f15648a.getActivity();
            InputMethodManager inputMethodManager = null;
            if (activity != null) {
                obj = a(activity, "input_method");
            } else {
                obj = null;
            }
            if (obj instanceof InputMethodManager) {
                inputMethodManager = obj;
            }
            InputMethodManager inputMethodManager2 = inputMethodManager;
            if (inputMethodManager2 == null) {
                return true;
            }
            inputMethodManager2.hideSoftInputFromWindow(this.f15650c.getWindowToken(), 0);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        Room room = (Room) this.f15649b.b(df.class);
        if (room != null) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.r(room));
            h.f.a.a<z> aVar = this.f15651d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    private static Object a(e eVar, String str) {
        Object obj;
        MethodCollector.i(10449);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
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
                    MethodCollector.o(10449);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (motionEvent == null || motionEvent2 == null || !this.f15653f.a(motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        r<MotionEvent, MotionEvent, Float, Float, Boolean> rVar;
        Boolean a2;
        if (motionEvent == null || motionEvent2 == null || (rVar = this.f15654g) == null || (a2 = rVar.a(motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3))) == null || !a2.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.r<? super android.view.MotionEvent, ? super android.view.MotionEvent, ? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.r<? super android.view.MotionEvent, ? super android.view.MotionEvent, ? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super android.view.MotionEvent, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, DataChannel dataChannel, View view, h.f.a.a<z> aVar2, b<? super MotionEvent, Boolean> bVar, r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar, r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar2, b<? super MotionEvent, Boolean> bVar2) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(dataChannel, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(rVar, "");
        this.f15648a = aVar;
        this.f15649b = dataChannel;
        this.f15650c = view;
        this.f15651d = aVar2;
        this.f15652e = bVar;
        this.f15653f = rVar;
        this.f15654g = rVar2;
        this.f15655h = bVar2;
    }
}
