package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    static final LinkedList<WeakReference<Activity>> f68527a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final bd f68528b = new bd();

    private bd() {
    }

    static {
        Covode.recordClassIndex(42205);
    }

    static void a(Activity activity) {
        n.a((List) f68527a, (b) new a(activity));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<WeakReference<Activity>, Boolean> {
        final /* synthetic */ Activity $activity;

        static {
            Covode.recordClassIndex(42206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(WeakReference<Activity> weakReference) {
            boolean z;
            WeakReference<Activity> weakReference2 = weakReference;
            l.d(weakReference2, "");
            Activity activity = weakReference2.get();
            if (activity == null || l.a(activity, this.$activity)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final int a(Context context) {
        Object obj;
        if (!(context instanceof Activity)) {
            return 1;
        }
        WeakReference weakReference = (WeakReference) n.h((List) f68527a);
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (!l.a(obj, context)) {
            return 2;
        }
        return 3;
    }
}
