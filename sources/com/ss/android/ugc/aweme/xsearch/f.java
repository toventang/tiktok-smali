package com.ss.android.ugc.aweme.xsearch;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f145157a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f145158b = i.a((h.f.a.a) a.f145159a);

    public static WeakHashMap<RecyclerView, a> a() {
        return (WeakHashMap) f145158b.getValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<WeakHashMap<RecyclerView, a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f145159a = new a();

        static {
            Covode.recordClassIndex(94919);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHashMap<RecyclerView, a> invoke() {
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(94918);
    }

    public static a a(View view) {
        l.d(view, "");
        ViewParent parent = view.getParent();
        while (!(parent instanceof RecyclerView)) {
            if (parent == null) {
                return null;
            }
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return a().get(parent);
    }
}
