package com.bytedance.android.livesdk.toolbar;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import com.bytedance.android.live.p.q;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.EnumMap;
import java.util.Map;
import java.util.Stack;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    static final Map<q, Stack<View>> f21740a = new EnumMap(q.class);

    /* renamed from: b  reason: collision with root package name */
    static androidx.b.a.a f21741b;

    /* renamed from: c  reason: collision with root package name */
    static LayoutInflater f21742c;

    /* renamed from: d  reason: collision with root package name */
    public static final m f21743d = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(12813);
    }

    static void a(q qVar) {
        androidx.b.a.a aVar = f21741b;
        if (aVar != null) {
            aVar.a(qVar.getLayoutId(), null, new a(qVar));
        }
    }

    public static View a(Context context, q qVar) {
        boolean z;
        l.d(qVar, "");
        Stack<View> stack = f21740a.get(qVar);
        if (stack == null || stack.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        MutableContextWrapper mutableContextWrapper = null;
        if (z) {
            LayoutInflater layoutInflater = f21742c;
            if (layoutInflater != null) {
                return com.a.a(layoutInflater, qVar.getLayoutId(), null, false);
            }
            return null;
        }
        View pop = stack.pop();
        l.b(pop, "");
        Context context2 = pop.getContext();
        if (context2 instanceof MutableContextWrapper) {
            mutableContextWrapper = context2;
        }
        MutableContextWrapper mutableContextWrapper2 = mutableContextWrapper;
        if (mutableContextWrapper2 != null) {
            mutableContextWrapper2.setBaseContext(context);
        }
        if (p.e()) {
            a(qVar);
        }
        return pop;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f21744a;

        static {
            Covode.recordClassIndex(12814);
        }

        a(q qVar) {
            this.f21744a = qVar;
        }

        @Override // androidx.b.a.a.d
        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
            Stack<View> stack = m.f21740a.get(this.f21744a);
            if (stack != null) {
                stack.push(view);
            }
        }
    }
}
