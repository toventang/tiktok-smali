package com.ss.android.ugc.aweme.feed.p.b.a;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.feed.p.a;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public Activity f93645a;

    /* renamed from: b  reason: collision with root package name */
    public View f93646b;

    /* renamed from: c  reason: collision with root package name */
    public a f93647c;

    /* renamed from: d  reason: collision with root package name */
    private int f93648d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b<Boolean, z> f93649e;

    static {
        Covode.recordClassIndex(59590);
    }

    public final void b() {
        a aVar = this.f93647c;
        if (aVar != null) {
            FrameLayout frameLayout = aVar.f93643a;
            l.b(frameLayout, "");
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.p.b.a.b
    public final void a() {
        try {
            b();
            b<Boolean, z> bVar = this.f93649e;
            l.d(bVar, "");
            if (com.ss.android.ugc.aweme.feed.p.b.a()) {
                a.a().b(bVar);
            }
            this.f93649e = null;
            this.f93648d = -1;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static c a(Activity activity, View view) {
        if (com.ss.android.ugc.aweme.feed.p.b.a()) {
            return new c(activity, view);
        }
        return null;
    }

    private c(Activity activity, View view) {
        AnonymousClass1 r1 = new b<Boolean, z>() {
            /* class com.ss.android.ugc.aweme.feed.p.b.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59591);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                m.a(new d(this, bool));
                return null;
            }
        };
        this.f93649e = r1;
        this.f93645a = activity;
        this.f93646b = view;
        l.d(r1, "");
        if (com.ss.android.ugc.aweme.feed.p.b.a()) {
            a.a().a(r1);
        }
    }
}
