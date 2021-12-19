package androidx.core.h.a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.h.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    private static int f2483d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f2484a;

    /* renamed from: b  reason: collision with root package name */
    public int f2485b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2486c = -1;

    static {
        Covode.recordClassIndex(814);
    }

    private static String b(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public final void a(boolean z) {
        this.f2484a.setCheckable(z);
    }

    public final boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return this.f2484a.isAccessibilityFocused();
    }

    public final void a(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2484a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f2501a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;

        /* renamed from: a  reason: collision with root package name */
        public static final a f2487a = new a(1);

        /* renamed from: b  reason: collision with root package name */
        public static final a f2488b = new a(2);

        /* renamed from: c  reason: collision with root package name */
        public static final a f2489c = new a(4);

        /* renamed from: d  reason: collision with root package name */
        public static final a f2490d = new a(8);

        /* renamed from: e  reason: collision with root package name */
        public static final a f2491e = new a(16);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2492f = new a(32);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2493g = new a(64);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2494h = new a(128);

        /* renamed from: i  reason: collision with root package name */
        public static final a f2495i = new a(256, g.b.class);

        /* renamed from: j  reason: collision with root package name */
        public static final a f2496j = new a(512, g.b.class);

        /* renamed from: k  reason: collision with root package name */
        public static final a f2497k = new a(1024, g.c.class);

        /* renamed from: l  reason: collision with root package name */
        public static final a f2498l = new a(2048, g.c.class);

        /* renamed from: m  reason: collision with root package name */
        public static final a f2499m = new a(4096);
        public static final a n = new a(8192);
        public static final a o = new a(16384);
        public static final a p = new a(32768);
        public static final a q = new a(65536);
        public static final a r = new a(131072, g.C0035g.class);
        public static final a s = new a(262144);
        public static final a t = new a(524288);
        public static final a u = new a(1048576);
        public static final a v = new a(2097152, g.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object L;
        protected final g M;
        private final int N;
        private final Class<? extends g.a> O;

        public final int hashCode() {
            Object obj = this.L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getId();
            }
            return 0;
        }

        public final CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getLabel();
            }
            return null;
        }

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            Covode.recordClassIndex(815);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            w = new a(accessibilityAction, 16908342, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityAction2 = null;
            }
            x = new a(accessibilityAction2, 16908343, g.e.class);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                accessibilityAction3 = null;
            }
            y = new a(accessibilityAction3, 16908344, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                accessibilityAction4 = null;
            }
            z = new a(accessibilityAction4, 16908345, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                accessibilityAction5 = null;
            }
            A = new a(accessibilityAction5, 16908346, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                accessibilityAction6 = null;
            }
            B = new a(accessibilityAction6, 16908347, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction7 = null;
            }
            C = new a(accessibilityAction7, 16908358, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction8 = null;
            }
            D = new a(accessibilityAction8, 16908359, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction9 = null;
            }
            E = new a(accessibilityAction9, 16908360, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction10 = null;
            }
            F = new a(accessibilityAction10, 16908361, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction11 = null;
            }
            G = new a(accessibilityAction11, 16908348, null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction12 = null;
            }
            H = new a(accessibilityAction12, 16908349, g.f.class);
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction13 = null;
            }
            I = new a(accessibilityAction13, 16908354, g.d.class);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction14 = null;
            }
            J = new a(accessibilityAction14, 16908356, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction15 = null;
            }
            K = new a(accessibilityAction15, 16908357, null);
        }

        private a(int i2) {
            this(null, i2, null);
        }

        a(Object obj) {
            this(obj, 0, null);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.L;
            if (obj2 == null) {
                if (aVar.L != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.L)) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean a(Bundle bundle) {
            if (this.M == null) {
                return false;
            }
            Class<? extends g.a> cls = this.O;
            if (cls != null) {
                try {
                    ((g.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).f2505a = bundle;
                } catch (Exception unused) {
                    Class<? extends g.a> cls2 = this.O;
                    if (cls2 != null) {
                        cls2.getName();
                    }
                }
            }
            return this.M.a();
        }

        private a(int i2, Class<? extends g.a> cls) {
            this(null, i2, cls);
        }

        private a(Object obj, int i2, Class<? extends g.a> cls) {
            this.N = i2;
            this.M = null;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.L = obj;
            } else {
                this.L = new AccessibilityNodeInfo.AccessibilityAction(i2, null);
            }
            this.O = cls;
        }
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2484a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final Bundle b() {
        int i2 = Build.VERSION.SDK_INT;
        return this.f2484a.getExtras();
    }

    private List<a> d() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList;
        if (Build.VERSION.SDK_INT < 21 || (actionList = this.f2484a.getActionList()) == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    private CharSequence c() {
        if (!(!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f2484a.getText();
        }
        List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2484a.getText(), 0, this.f2484a.getText().length()));
        for (int i2 = 0; i2 < a2.size(); i2++) {
            spannableString.setSpan(new a(a5.get(i2).intValue(), this, b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i2).intValue(), a3.get(i2).intValue(), a4.get(i2).intValue());
        }
        return spannableString;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        b(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ").append(this.f2484a.getPackageName());
        sb.append("; className: ").append(this.f2484a.getClassName());
        sb.append("; text: ").append(c());
        sb.append("; contentDescription: ").append(this.f2484a.getContentDescription());
        StringBuilder append = sb.append("; viewId: ");
        int i2 = Build.VERSION.SDK_INT;
        append.append(this.f2484a.getViewIdResourceName());
        sb.append("; checkable: ").append(this.f2484a.isCheckable());
        sb.append("; checked: ").append(this.f2484a.isChecked());
        sb.append("; focusable: ").append(this.f2484a.isFocusable());
        sb.append("; focused: ").append(this.f2484a.isFocused());
        sb.append("; selected: ").append(this.f2484a.isSelected());
        sb.append("; clickable: ").append(this.f2484a.isClickable());
        sb.append("; longClickable: ").append(this.f2484a.isLongClickable());
        sb.append("; enabled: ").append(this.f2484a.isEnabled());
        sb.append("; password: ").append(this.f2484a.isPassword());
        sb.append("; scrollable: " + this.f2484a.isScrollable());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> d2 = d();
            for (int i3 = 0; i3 < d2.size(); i3++) {
                a aVar = d2.get(i3);
                String b2 = b(aVar.a());
                if (b2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    b2 = aVar.b().toString();
                }
                sb.append(b2);
                if (i3 != d2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f2484a.getActions();
            if (actions != 0) {
                while (true) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                    actions &= numberOfTrailingZeros ^ -1;
                    sb.append(b(numberOfTrailingZeros));
                    if (actions == 0) {
                        break;
                    }
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2500a;

        static {
            Covode.recordClassIndex(816);
        }

        public b(Object obj) {
            this.f2500a = obj;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f2501a;

        static {
            Covode.recordClassIndex(817);
        }

        private c(Object obj) {
            this.f2501a = obj;
        }

        public static c a(int i2, int i3, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, false));
            }
            int i6 = Build.VERSION.SDK_INT;
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false));
        }
    }

    public static d a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    public final void b(Rect rect) {
        this.f2484a.getBoundsInScreen(rect);
    }

    public final void c(boolean z) {
        this.f2484a.setFocused(z);
    }

    public final void d(boolean z) {
        this.f2484a.setScrollable(z);
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2484a = accessibilityNodeInfo;
    }

    public static SparseArray<WeakReference<ClickableSpan>> b(View view) {
        return (SparseArray) view.getTag(R.id.ehp);
    }

    public final void a(int i2) {
        this.f2484a.addAction(i2);
    }

    public final void e(boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        this.f2484a.setDismissable(z);
    }

    public static ClickableSpan[] c(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final List<Integer> a(String str) {
        int i2 = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.f2484a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2484a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void b(CharSequence charSequence) {
        this.f2484a.setText(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2484a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f2484a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f2484a)) {
            return false;
        }
        if (this.f2486c == dVar.f2486c && this.f2485b == dVar.f2485b) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        this.f2484a.setFocusable(z);
    }

    public final void a(Rect rect) {
        this.f2484a.getBoundsInParent(rect);
    }

    public final void a(View view) {
        this.f2485b = -1;
        this.f2484a.setParent(view);
    }

    public final boolean b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2484a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
        return false;
    }

    public final void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2484a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
    }

    public final void a(CharSequence charSequence) {
        this.f2484a.setClassName(charSequence);
    }

    public static int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f2483d;
        f2483d = i3 + 1;
        return i3;
    }

    public final void a(int i2, boolean z) {
        Bundle b2 = b();
        if (b2 != null) {
            int i3 = b2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ -1);
            if (!z) {
                i2 = 0;
            }
            b2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }
}
