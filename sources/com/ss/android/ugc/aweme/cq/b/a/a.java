package com.ss.android.ugc.aweme.cq.b.a;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.xelement.b.c;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Objects;

public final class a implements com.bytedance.ies.xelement.b.c, ActivityStack.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f78280a = i.a((h.f.a.a) C1820a.f78281a);

    static {
        Covode.recordClassIndex(48538);
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a> c() {
        return (com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a) this.f78280a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.cq.b.a.a$a  reason: collision with other inner class name */
    static final class C1820a extends m implements h.f.a.a<com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1820a f78281a = new C1820a();

        static {
            Covode.recordClassIndex(48539);
        }

        C1820a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a<c.a> invoke() {
            return new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a();
        }
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final boolean bk_() {
        return ActivityStack.isAppBackGround();
    }

    public a() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void a() {
        c().a(b.f78282a);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void b() {
        c().a(c.f78283a);
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void bl_() {
        Context a2 = d.a();
        Object a3 = b.a(a2, "activity");
        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) a3;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
            return;
        }
        Intent launchIntentForPackage = a2.getPackageManager().getLaunchIntentForPackage(a2.getPackageName());
        if (launchIntentForPackage != null) {
            com.ss.android.ugc.tiktok.security.a.a.a(launchIntentForPackage, a2);
            a2.startActivity(launchIntentForPackage);
        }
    }

    static final class c extends m implements h.f.a.b<c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78283a = new c();

        static {
            Covode.recordClassIndex(48541);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            l.d(aVar, "");
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78282a = new b();

        static {
            Covode.recordClassIndex(48540);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.c();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void a(c.a aVar) {
        l.d(aVar, "");
        c().a(aVar);
    }

    @Override // com.bytedance.ies.xelement.b.c
    public final void b(c.a aVar) {
        l.d(aVar, "");
        c().b(aVar);
    }
}
