package com.lynx.tasm.behavior.ui;

import android.content.ClipboardManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class b extends AccessibilityNodeProvider {

    /* renamed from: g  reason: collision with root package name */
    private static String f56127g = "LynxAccessibilityNodeProvider";

    /* renamed from: a  reason: collision with root package name */
    public int f56128a;

    /* renamed from: b  reason: collision with root package name */
    final UIGroup f56129b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<a> f56130c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    final View f56131d;

    /* renamed from: e  reason: collision with root package name */
    a f56132e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56133f = true;

    /* renamed from: h  reason: collision with root package name */
    private final int f56134h = 50;

    /* renamed from: i  reason: collision with root package name */
    private final AccessibilityManager f56135i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56136j;

    static {
        Covode.recordClassIndex(35059);
    }

    private static String c(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI.mAccessibilityElementStatus == -1) {
            return this.f56133f;
        }
        if (lynxBaseUI.mAccessibilityElementStatus == 1) {
            return true;
        }
        return false;
    }

    public b(UIGroup uIGroup) {
        this.f56129b = uIGroup;
        this.f56131d = uIGroup.getRealParentView();
        this.f56135i = (AccessibilityManager) a(uIGroup.mContext, "accessibility");
        this.f56128a = DisplayMetricsHolder.a().heightPixels / 50;
    }

    private static Rect b(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            a(((LynxUI) lynxBaseUI).mView, rect);
            rect.set(rect.left, rect.top, rect.left + lynxBaseUI.getWidth(), rect.top + lynxBaseUI.getHeight());
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            while (true) {
                if (parentBaseUI != null) {
                    if (parentBaseUI instanceof LynxUI) {
                        T t = ((LynxUI) parentBaseUI).mView;
                        a(t, rect);
                        rect.offset(-t.getScrollX(), -t.getScrollY());
                        rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                        rect.set(rect.left, rect.top, rect.left + lynxBaseUI.getWidth(), rect.top + lynxBaseUI.getHeight());
                        break;
                    }
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                } else {
                    break;
                }
            }
        }
        return rect;
    }

    private String d(LynxBaseUI lynxBaseUI) {
        if (!a(lynxBaseUI)) {
            return "";
        }
        String c2 = c(lynxBaseUI);
        if (TextUtils.isEmpty(c2)) {
            if (!(lynxBaseUI instanceof LynxFlattenUI) || this.f56129b.mContext.r) {
                Iterator<LynxBaseUI> it = lynxBaseUI.mChildren.iterator();
                while (it.hasNext()) {
                    c2 = ((Object) c2) + c(it.next());
                }
            } else {
                LynxBaseUI lynxBaseUI2 = (LynxBaseUI) lynxBaseUI.mParent;
                if (lynxBaseUI2 != null) {
                    for (LynxBaseUI lynxBaseUI3 : lynxBaseUI2.mChildren) {
                        if (!(lynxBaseUI.getBound() == null || lynxBaseUI3.getBound() == null || !lynxBaseUI.getBound().contains(lynxBaseUI3.getBound()))) {
                            c2 = ((Object) c2) + c(lynxBaseUI3);
                        }
                    }
                }
            }
        }
        return c2.toString();
    }

    private void a(View view) {
        boolean z;
        boolean z2 = true;
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (view.getImportantForAccessibility() != 1 && (view.getImportantForAccessibility() == 2 || TextUtils.isEmpty(view.getContentDescription()))) {
            z2 = false;
        }
        if (z && z2) {
            Rect rect = new Rect();
            a(view, rect);
            this.f56130c.add(new a(view, rect));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2));
            }
        }
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i3;
        boolean z;
        boolean z2 = false;
        if (i2 == -1) {
            accessibilityNodeInfo = AccessibilityNodeInfo.obtain(this.f56131d);
            this.f56130c.clear();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f56129b);
            while (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LynxBaseUI lynxBaseUI = (LynxBaseUI) it.next();
                    for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.mChildren) {
                        arrayList2.add(lynxBaseUI2);
                    }
                    if (a(lynxBaseUI)) {
                        this.f56130c.add(new a(lynxBaseUI, b(lynxBaseUI)));
                    }
                    if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mChildren.isEmpty()) {
                        LynxUI lynxUI = (LynxUI) lynxBaseUI;
                        if (lynxUI.mView instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) lynxUI.mView;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                a(viewGroup.getChildAt(i4));
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
            Collections.sort(this.f56130c, new Comparator() {
                /* class com.lynx.tasm.behavior.ui.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35060);
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Rect rect = ((a) obj).f56140c;
                    Rect rect2 = ((a) obj2).f56140c;
                    int i2 = (rect.top / b.this.f56128a) - (rect2.top / b.this.f56128a);
                    int i3 = rect.left - rect2.left;
                    if (i2 == 0) {
                        return i3;
                    }
                    return i2;
                }
            });
            this.f56131d.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            for (int i5 = 0; i5 < this.f56130c.size(); i5++) {
                accessibilityNodeInfo.addChild(this.f56131d, i5);
            }
            Rect rect = new Rect();
            a(this.f56131d, rect);
            rect.set(rect.left, rect.top, rect.left + this.f56129b.getWidth(), rect.top + this.f56129b.getHeight());
        } else if (i2 < 0 || i2 >= this.f56130c.size()) {
            return null;
        } else {
            a aVar = this.f56130c.get(i2);
            accessibilityNodeInfo = AccessibilityNodeInfo.obtain(this.f56131d, i2);
            this.f56131d.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (aVar.f56138a != null) {
                aVar.f56140c = b(aVar.f56138a);
                accessibilityNodeInfo.setBoundsInScreen(aVar.f56140c);
                accessibilityNodeInfo.setClassName(aVar.f56138a.getClass().getName());
                String d2 = d(aVar.f56138a);
                accessibilityNodeInfo.setContentDescription(d2);
                accessibilityNodeInfo.setText(d2);
            } else if (aVar.f56139b != null) {
                aVar.f56139b.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setSource(this.f56131d, i2);
            }
            accessibilityNodeInfo.setParent(this.f56131d);
            if (this.f56132e != aVar) {
                i3 = 64;
            } else {
                i3 = 128;
            }
            accessibilityNodeInfo.addAction(i3);
            if (this.f56132e == aVar) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfo.setAccessibilityFocused(z);
            if (this.f56132e == aVar) {
                z2 = true;
            }
            accessibilityNodeInfo.setFocused(z2);
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setVisibleToUser(true);
            accessibilityNodeInfo.setScrollable(true);
        }
        return accessibilityNodeInfo;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        LynxBaseUI f56138a;

        /* renamed from: b  reason: collision with root package name */
        View f56139b;

        /* renamed from: c  reason: collision with root package name */
        Rect f56140c;

        static {
            Covode.recordClassIndex(35061);
        }

        public a(View view, Rect rect) {
            this.f56139b = view;
            this.f56140c = rect;
        }

        public a(LynxBaseUI lynxBaseUI, Rect rect) {
            this.f56138a = lynxBaseUI;
            this.f56140c = rect;
        }
    }

    static void a(View view, Rect rect) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    private static Object a(j jVar, String str) {
        Object obj;
        MethodCollector.i(12086);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = jVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = jVar.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = jVar.getSystemService(str);
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
                    MethodCollector.o(12086);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
        LynxBaseUI lynxBaseUI;
        String c2;
        String c3;
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase();
        if (i2 == -1) {
            for (int i3 = 0; i3 < this.f56130c.size(); i3++) {
                if (!(this.f56130c.get(i3).f56138a == null || (c3 = c(this.f56130c.get(i3).f56138a)) == null || !c3.toString().toLowerCase().contains(lowerCase))) {
                    arrayList.add(createAccessibilityNodeInfo(i3));
                }
            }
        } else if (i2 > 0 && i2 < this.f56130c.size() && (lynxBaseUI = this.f56130c.get(i2).f56138a) != null && (c2 = c(lynxBaseUI)) != null && c2.toString().toLowerCase().contains(lowerCase)) {
            arrayList.add(createAccessibilityNodeInfo(i2));
        }
        return arrayList;
    }

    private void a(int i2, int i3) {
        if (this.f56135i.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            if (i2 >= 0) {
                a aVar = this.f56130c.get(i2);
                if (aVar.f56138a != null) {
                    obtain.setPackageName(this.f56131d.getContext().getPackageName());
                    obtain.setClassName(aVar.f56138a.getClass().getName());
                    obtain.setEnabled(true);
                    obtain.setContentDescription(d(aVar.f56138a));
                } else if (aVar.f56139b != null) {
                    aVar.f56139b.onInitializeAccessibilityEvent(obtain);
                } else {
                    return;
                }
                obtain.setSource(this.f56131d, i2);
                this.f56131d.invalidate();
                this.f56131d.getParent().requestSendAccessibilityEvent(this.f56131d, obtain);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f56136j) {
            if (action == 9 || action == 7) {
                a(i2, 128);
                this.f56136j = true;
            }
        } else if (action == 10 || action == 7) {
            this.f56136j = false;
            a(i2, 256);
        }
        if (action == 9) {
            this.f56131d.setHovered(true);
        } else if (action == 10) {
            this.f56131d.setHovered(false);
        }
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        LLog.a(f56127g, "performAction on virtualViewId " + i2 + " action " + i3);
        if (i2 == -1 || i2 < 0 || i2 >= this.f56130c.size()) {
            return false;
        }
        if (i3 == 64) {
            a(i2, 32768);
            a(i2, 4);
            return true;
        } else if (i3 != 128) {
            return false;
        } else {
            a(i2, 65536);
            return true;
        }
    }
}
