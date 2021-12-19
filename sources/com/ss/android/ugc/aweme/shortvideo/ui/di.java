package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.t;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class di implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131685a;

    /* renamed from: b  reason: collision with root package name */
    private final v f131686b;

    static {
        Covode.recordClassIndex(86238);
    }

    di(cj cjVar, v vVar) {
        this.f131685a = cjVar;
        this.f131686b = vVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        cj cjVar = this.f131685a;
        cjVar.a(new i.b((View) obj, this.f131686b) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass16 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f131617a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f131618b;

            static {
                Covode.recordClassIndex(86193);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
            public final void a() {
                this.f131617a.setAlpha(1.0f);
                t.a(1);
                this.f131618b.f129892d = false;
                this.f131617a.callOnClick();
                cj.this.G = false;
            }

            {
                this.f131617a = r2;
                this.f131618b = r3;
            }
        });
        return null;
    }
}
