package com.ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.story.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static final h.f.a.b<ao, View> f91853a = d.f91860a;

    /* renamed from: b  reason: collision with root package name */
    static final h.f.a.b<ay, Boolean> f91854b = a.f91857a;

    /* renamed from: c  reason: collision with root package name */
    static final h.f.a.b<ao, View> f91855c = b.f91858a;

    /* renamed from: d  reason: collision with root package name */
    static final h.f.a.b<ao, View> f91856d = c.f91859a;

    static {
        Covode.recordClassIndex(57820);
    }

    static final class a extends m implements h.f.a.b<ay, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f91857a = new a();

        static {
            Covode.recordClassIndex(57821);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(ay ayVar) {
            l.d(ayVar, "");
            return true;
        }
    }

    static final class b extends m implements h.f.a.b<ao, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f91858a = new b();

        static {
            Covode.recordClassIndex(57822);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ao aoVar) {
            ao aoVar2 = aoVar;
            l.d(aoVar2, "");
            System.currentTimeMillis();
            Context context = aoVar2.f91593b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a2 = com.a.b.c.a((Activity) context, g.f137757a.b());
            System.currentTimeMillis();
            l.b(a2, "");
            return a2;
        }
    }

    static final class c extends m implements h.f.a.b<ao, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f91859a = new c();

        static {
            Covode.recordClassIndex(57823);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ao aoVar) {
            ao aoVar2 = aoVar;
            l.d(aoVar2, "");
            System.currentTimeMillis();
            Context context = aoVar2.f91593b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a2 = com.a.b.c.a((Activity) context, g.f137757a.c());
            System.currentTimeMillis();
            l.b(a2, "");
            return a2;
        }
    }

    static final class d extends m implements h.f.a.b<ao, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f91860a = new d();

        static {
            Covode.recordClassIndex(57824);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ao aoVar) {
            ao aoVar2 = aoVar;
            l.d(aoVar2, "");
            System.currentTimeMillis();
            Context context = aoVar2.f91593b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a2 = com.a.b.c.a((Activity) context, (int) R.layout.sa);
            System.currentTimeMillis();
            l.b(a2, "");
            return a2;
        }
    }

    public static final void a(aj ajVar, View.OnTouchListener onTouchListener, LongPressLayout.a aVar) {
        if (ajVar instanceof ce) {
            ce ceVar = (ce) ajVar;
            ceVar.a(onTouchListener);
            ceVar.a(aVar);
        }
    }
}
