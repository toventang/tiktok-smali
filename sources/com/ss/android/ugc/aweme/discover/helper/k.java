package com.ss.android.ugc.aweme.discover.helper;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface k {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f81126a = -1;

        static {
            Covode.recordClassIndex(50428);
        }
    }

    static {
        Covode.recordClassIndex(50427);
    }

    void a(a aVar);

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f81127a;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.b<View, Integer> f81128b;

        static {
            Covode.recordClassIndex(50429);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super android.view.View, java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ViewGroup viewGroup, h.f.a.b<? super View, Integer> bVar) {
            l.d(viewGroup, "");
            l.d(bVar, "");
            this.f81127a = viewGroup;
            this.f81128b = bVar;
        }
    }
}
