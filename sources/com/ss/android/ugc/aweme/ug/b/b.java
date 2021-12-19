package com.ss.android.ugc.aweme.ug.b;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.ug.a.b;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f141746a;

    /* renamed from: b  reason: collision with root package name */
    public static final IMSAdaptionService f141747b = MSAdaptionService.c();

    /* renamed from: c  reason: collision with root package name */
    public static final b f141748c = new b();

    private b() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.foundation.activity.a f141749a;

        static {
            Covode.recordClassIndex(92650);
        }

        public a(com.bytedance.ies.foundation.activity.a aVar) {
            this.f141749a = aVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.ug.c.a.a(this.f141749a);
            ShareServiceImpl.d().c().a();
            b.f141747b.a((e) this.f141749a);
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141751a = new c();

        static {
            Covode.recordClassIndex(92652);
        }

        c() {
        }

        public final void run() {
            if (!b.f141746a) {
                try {
                    b.f141746a = true;
                    i.b(b.a.f141713a, i.f4824a);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(92649);
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.b.b$b  reason: collision with other inner class name */
    public static final class C3770b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C3770b f141750a = new C3770b();

        static {
            Covode.recordClassIndex(92651);
        }

        C3770b() {
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            w f2 = ae.f();
            l.b(f2, "");
            f.a(f2);
            return null;
        }
    }
}
