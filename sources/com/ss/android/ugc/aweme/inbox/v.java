package com.ss.android.ugc.aweme.inbox;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    static final b f104355a;

    /* renamed from: b  reason: collision with root package name */
    static final b f104356b;

    /* renamed from: c  reason: collision with root package name */
    static final b f104357c;

    /* renamed from: d  reason: collision with root package name */
    static final b f104358d;

    /* renamed from: e  reason: collision with root package name */
    static final b f104359e;

    /* renamed from: f  reason: collision with root package name */
    public static final v f104360f = new v();

    /* renamed from: g  reason: collision with root package name */
    private static final h f104361g = i.a((h.f.a.a) a.f104364a);

    /* renamed from: h  reason: collision with root package name */
    private static final b f104362h;

    /* renamed from: i  reason: collision with root package name */
    private static final b f104363i;

    private static int a() {
        return ((Number) f104361g.getValue()).intValue();
    }

    private v() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104364a = new a();

        static {
            Covode.recordClassIndex(66835);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(y.b((int) R.color.c4));
        }
    }

    static {
        Covode.recordClassIndex(66834);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f104355a = new b(h.g.a.a(TypedValue.applyDimension(1, 41.0f, system.getDisplayMetrics())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8190);
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        f104356b = new b(h.g.a.a(TypedValue.applyDimension(1, 44.0f, system2.getDisplayMetrics())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8190);
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        f104357c = new b(h.g.a.a(TypedValue.applyDimension(1, 56.0f, system3.getDisplayMetrics())), 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 8174);
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system4.getDisplayMetrics()));
        int a3 = a();
        Resources system5 = Resources.getSystem();
        l.a((Object) system5, "");
        int a4 = h.g.a.a(TypedValue.applyDimension(1, 3.0f, system5.getDisplayMetrics()));
        Resources system6 = Resources.getSystem();
        l.a((Object) system6, "");
        f104358d = new b(0, a2, 0, 0, 42, 16, 51, 0, a3, a4, 51, 0, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics())), 2189);
        Resources system7 = Resources.getSystem();
        l.a((Object) system7, "");
        int a5 = h.g.a.a(TypedValue.applyDimension(1, 56.0f, system7.getDisplayMetrics()));
        int a6 = a();
        Resources system8 = Resources.getSystem();
        l.a((Object) system8, "");
        f104359e = new b(0, a5, 0, 0, 42, 16, 51, 0, a6, h.g.a.a(TypedValue.applyDimension(1, 3.0f, system8.getDisplayMetrics())), 51, 0, 0, 6285);
        Resources system9 = Resources.getSystem();
        l.a((Object) system9, "");
        int a7 = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system9.getDisplayMetrics()));
        int a8 = a();
        Resources system10 = Resources.getSystem();
        l.a((Object) system10, "");
        f104362h = new b(0, a7, 0, 0, 42, 16, 51, 0, a8, h.g.a.a(TypedValue.applyDimension(1, 3.0f, system10.getDisplayMetrics())), 51, 0, 0, 6285);
        Resources system11 = Resources.getSystem();
        l.a((Object) system11, "");
        int a9 = h.g.a.a(TypedValue.applyDimension(1, 48.0f, system11.getDisplayMetrics()));
        Resources system12 = Resources.getSystem();
        l.a((Object) system12, "");
        int a10 = h.g.a.a(TypedValue.applyDimension(1, 38.0f, system12.getDisplayMetrics()));
        Resources system13 = Resources.getSystem();
        l.a((Object) system13, "");
        f104363i = new b(0, a9, a10, h.g.a.a(TypedValue.applyDimension(1, 34.0f, system13.getDisplayMetrics())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 8177);
    }

    public static void a(InboxAdapterWidget inboxAdapterWidget) {
        l.d(inboxAdapterWidget, "");
        inboxAdapterWidget.a(1, f104355a);
        b bVar = f104362h;
        inboxAdapterWidget.a(4, bVar);
        inboxAdapterWidget.a(5, bVar);
        inboxAdapterWidget.a(2, bVar);
        inboxAdapterWidget.a(-2, bVar);
        inboxAdapterWidget.a(3, f104363i);
    }
}
