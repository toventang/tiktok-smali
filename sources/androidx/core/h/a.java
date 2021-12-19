package androidx.core.h;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.h.a.d;
import androidx.core.h.a.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2475b = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f2476a;

    /* renamed from: c  reason: collision with root package name */
    private final View.AccessibilityDelegate f2477c;

    public a() {
        this(f2475b);
    }

    static {
        Covode.recordClassIndex(807);
    }

    /* renamed from: androidx.core.h.a$a  reason: collision with other inner class name */
    public static final class C0034a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f2478a;

        static {
            Covode.recordClassIndex(808);
        }

        C0034a(a aVar) {
            this.f2478a = aVar;
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e a2 = this.f2478a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.f2502a;
            }
            return null;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2478a.b(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2478a.d(view, accessibilityEvent);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2478a.c(view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i2) {
            this.f2478a.a(view, i2);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2478a.a(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean booleanValue;
            boolean booleanValue2;
            d a2 = d.a(accessibilityNodeInfo);
            Boolean bool = (Boolean) new v.b<Boolean>(Boolean.class) {
                /* class androidx.core.h.v.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(875);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // androidx.core.h.v.b
                public final /* synthetic */ Boolean a(View view) {
                    return Boolean.valueOf(view.isScreenReaderFocusable());
                }
            }.b(view);
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                a2.f2484a.setScreenReaderFocusable(booleanValue);
            } else {
                a2.a(1, booleanValue);
            }
            Boolean bool2 = (Boolean) new v.b<Boolean>(Boolean.class) {
                /* class androidx.core.h.v.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(877);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // androidx.core.h.v.b
                public final /* synthetic */ Boolean a(View view) {
                    return Boolean.valueOf(view.isAccessibilityHeading());
                }
            }.b(view);
            if (bool2 == null) {
                booleanValue2 = false;
            } else {
                booleanValue2 = bool2.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                a2.f2484a.setHeading(booleanValue2);
            } else {
                a2.a(2, booleanValue2);
            }
            CharSequence A = v.A(view);
            if (Build.VERSION.SDK_INT >= 28) {
                a2.f2484a.setPaneTitle(A);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                a2.f2484a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", A);
            }
            this.f2478a.a(view, a2);
            CharSequence text = accessibilityNodeInfo.getText();
            int i3 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT < 26) {
                int i4 = Build.VERSION.SDK_INT;
                a2.f2484a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                a2.f2484a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                a2.f2484a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                a2.f2484a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray<WeakReference<ClickableSpan>> b2 = d.b(view);
                if (b2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < b2.size(); i5++) {
                        if (b2.valueAt(i5).get() == null) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        b2.remove(((Integer) arrayList.get(i6)).intValue());
                    }
                }
                ClickableSpan[] c2 = d.c(text);
                if (c2 != null && c2.length > 0) {
                    a2.b().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.ap);
                    SparseArray<WeakReference<ClickableSpan>> b3 = d.b(view);
                    if (b3 == null) {
                        b3 = new SparseArray<>();
                        view.setTag(R.id.ehp, b3);
                    }
                    for (int i7 = 0; i7 < c2.length; i7++) {
                        int a3 = d.a(c2[i7], b3);
                        b3.put(a3, new WeakReference<>(c2[i7]));
                        ClickableSpan clickableSpan = c2[i7];
                        Spanned spanned = (Spanned) text;
                        a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
                        a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
                        a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
                        a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(a3));
                    }
                }
            }
            List<d.a> b4 = a.b(view);
            for (int i8 = 0; i8 < b4.size(); i8++) {
                a2.a(b4.get(i8));
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2478a.a(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f2478a.a(view, i2, bundle);
        }
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2477c = accessibilityDelegate;
        this.f2476a = new C0034a(this);
    }

    static List<d.a> b(View view) {
        List<d.a> list = (List) view.getTag(R.id.eho);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public e a(View view) {
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2477c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new e(accessibilityNodeProvider);
        }
        return null;
    }

    public void a(View view, int i2) {
        this.f2477c.sendAccessibilityEvent(view, i2);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2477c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2477c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f2477c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f2477c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void a(View view, d dVar) {
        this.f2477c.onInitializeAccessibilityNodeInfo(view, dVar.f2484a);
    }

    public boolean a(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List<d.a> b2 = b(view);
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= b2.size()) {
                break;
            }
            d.a aVar = b2.get(i3);
            if (aVar.a() == i2) {
                boolean a2 = aVar.a(bundle);
                if (a2) {
                    return a2;
                }
            } else {
                i3++;
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean performAccessibilityAction = this.f2477c.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.ap) {
            return performAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.ehp);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            ClickableSpan[] c2 = d.c(view.createAccessibilityNodeInfo().getText());
            int i6 = 0;
            if (c2 != null) {
                while (true) {
                    if (i6 >= c2.length) {
                        break;
                    } else if (clickableSpan.equals(c2[i6])) {
                        clickableSpan.onClick(view);
                        z = true;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        return z;
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2477c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
