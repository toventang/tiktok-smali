package com.google.android.material.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.c.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g<String, i> f52139a = new g<>();

    static {
        Covode.recordClassIndex(32417);
    }

    public int hashCode() {
        return this.f52139a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f52139a + "}\n";
    }

    public final long a() {
        int size = this.f52139a.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i c2 = this.f52139a.c(i2);
            j2 = Math.max(j2, c2.f52140a + c2.f52141b);
        }
        return j2;
    }

    private static h a(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(hVar, list.get(i2));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f52139a.equals(((h) obj).f52139a);
    }

    public final i a(String str) {
        if (this.f52139a.get(str) != null) {
            return this.f52139a.get(str);
        }
        throw new IllegalArgumentException();
    }

    private void a(String str, i iVar) {
        this.f52139a.put(str, iVar);
    }

    public static h a(Context context, int i2) {
        MethodCollector.i(4781);
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                h a2 = a(((AnimatorSet) loadAnimator).getChildAnimations());
                MethodCollector.o(4781);
                return a2;
            } else if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                h a3 = a(arrayList);
                MethodCollector.o(4781);
                return a3;
            } else {
                MethodCollector.o(4781);
                return null;
            }
        } catch (Exception unused) {
            Integer.toHexString(i2);
            MethodCollector.o(4781);
            return null;
        }
    }

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.a(objectAnimator.getPropertyName(), i.a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
    }
}
