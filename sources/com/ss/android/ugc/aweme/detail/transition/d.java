package com.ss.android.ugc.aweme.detail.transition;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final h f79877b = i.a(m.SYNCHRONIZED, b.f79880a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f79878c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f79879a;

    public static final class a {
        static {
            Covode.recordClassIndex(49693);
        }

        public static d a() {
            return (d) d.f79877b.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private d() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79880a = new b();

        static {
            Covode.recordClassIndex(49694);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(49692);
    }

    public final void a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f79879a;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            l.b(activity, "");
            if (!activity.isFinishing()) {
                activity.getWindow().clearFlags(16);
            }
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
