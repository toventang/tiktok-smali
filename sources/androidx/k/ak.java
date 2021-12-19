package androidx.k;

import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class ak extends p {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f3260a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // androidx.k.p
    public final String[] a() {
        return f3260a;
    }

    static {
        Covode.recordClassIndex(1182);
    }

    public static int b(s sVar) {
        return a(sVar, 0);
    }

    public static int c(s sVar) {
        return a(sVar, 1);
    }

    @Override // androidx.k.p
    public final void a(s sVar) {
        View view = sVar.f3356b;
        Object obj = sVar.f3355a.get("android:visibility:visibility");
        if (obj == null) {
            obj = Integer.valueOf(view.getVisibility());
        }
        sVar.f3355a.put("android:visibilityPropagation:visibility", obj);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        sVar.f3355a.put("android:visibilityPropagation:center", iArr);
    }

    private static int a(s sVar, int i2) {
        int[] iArr;
        if (sVar == null || (iArr = (int[]) sVar.f3355a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i2];
    }
}
