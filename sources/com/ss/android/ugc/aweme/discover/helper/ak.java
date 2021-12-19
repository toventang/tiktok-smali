package com.ss.android.ugc.aweme.discover.helper;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ak implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    final boolean f81078a;

    /* renamed from: b  reason: collision with root package name */
    public int f81079b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f81080c;

    /* renamed from: d  reason: collision with root package name */
    ViewPager f81081d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f81082e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f81083f;

    /* renamed from: g  reason: collision with root package name */
    Method f81084g;

    /* renamed from: h  reason: collision with root package name */
    private long f81085h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnTouchListener f81086i;

    static {
        Covode.recordClassIndex(50394);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void b() {
        if (this.f81082e) {
            this.f81082e = false;
            this.f81083f.removeCallbacksAndMessages(null);
        }
    }

    public final void a() {
        if (!this.f81082e) {
            this.f81082e = true;
            this.f81083f.removeCallbacksAndMessages(null);
            this.f81083f.postDelayed(new a(this, this.f81085h), this.f81085h);
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private long f81089a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ak> f81090b;

        static {
            Covode.recordClassIndex(50397);
        }

        public final void run() {
            ak akVar;
            int i2;
            WeakReference<ak> weakReference = this.f81090b;
            if (weakReference != null && weakReference.get() != null && (akVar = this.f81090b.get()) != null && akVar.f81083f != null && akVar.f81082e) {
                if (!akVar.f81082e) {
                    akVar.f81083f.removeCallbacksAndMessages(null);
                } else {
                    int currentItem = akVar.f81081d.getCurrentItem();
                    if (akVar.f81078a) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    int i3 = currentItem + i2;
                    if (i3 < 0) {
                        i3 += akVar.f81079b;
                    }
                    if (akVar.f81084g != null) {
                        try {
                            Method method = akVar.f81084g;
                            ViewPager viewPager = akVar.f81081d;
                            Object[] objArr = {Integer.valueOf(i3), true, true, 1};
                            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{viewPager, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            if (((Boolean) a2.first).booleanValue()) {
                                Object obj = a2.second;
                            } else {
                                com.bytedance.helios.sdk.a.a(method.invoke(viewPager, objArr), method, new Object[]{viewPager, objArr}, "com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            }
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        }
                    }
                    akVar.f81081d.setCurrentItem(i3, true);
                }
                if (!akVar.f81082e) {
                    akVar.f81083f.removeCallbacksAndMessages(null);
                } else {
                    akVar.f81083f.postDelayed(this, this.f81089a);
                }
            }
        }

        a(ak akVar, long j2) {
            this.f81090b = new WeakReference<>(akVar);
            this.f81089a = j2;
        }
    }

    public ak(ViewPager viewPager) {
        this(viewPager, 5000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005f, code lost:
        if (r1.getResources().getConfiguration().getLayoutDirection() == 1) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ak(androidx.viewpager.widget.ViewPager r7, long r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.helper.ak.<init>(androidx.viewpager.widget.ViewPager, long):void");
    }
}
