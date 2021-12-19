package com.ss.android.ugc.aweme.search.l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.d.d;
import h.f.b.l;
import h.h;
import h.i;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f121434a = com.bytedance.ies.abmock.b.a().a(true, "search_page_launch_booster", true);

    /* renamed from: b  reason: collision with root package name */
    public static final h f121435b = i.a((h.f.a.a) a.f121438a);

    /* renamed from: c  reason: collision with root package name */
    public static final m f121436c = new m();

    /* renamed from: d  reason: collision with root package name */
    private static final h f121437d = i.a((h.f.a.a) b.f121439a);

    public static boolean a() {
        return ((Boolean) f121437d.getValue()).booleanValue();
    }

    private m() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121438a = new a();

        static {
            Covode.recordClassIndex(79115);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "search_cancel_optimize", false));
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121439a = new b();

        static {
            Covode.recordClassIndex(79116);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "search_refresh_chunk_response", false));
        }
    }

    static {
        Covode.recordClassIndex(79114);
    }

    public static View a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        if (n.a(context) != null) {
            Context context2 = viewGroup.getContext();
            l.b(context2, "");
            d a2 = n.a(context2);
            if (a2 == null) {
                l.b();
            }
            return a2.getInflater().a(i2);
        }
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
        l.b(a3, "");
        return a3;
    }
}
