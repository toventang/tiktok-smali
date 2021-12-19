package com.ss.android.ugc.aweme.cc;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.a;
import h.f.b.l;

public final class e implements com.ss.android.ugc.aweme.cc.a.a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.cc.a.b f69806a;

    static {
        Covode.recordClassIndex(43035);
    }

    @Override // com.ss.android.ugc.aweme.cc.a.a
    public final void a(com.ss.android.ugc.aweme.cc.a.b bVar) {
        this.f69806a = bVar;
    }

    public static final class a implements a.AbstractC1546a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f69807a;

        static {
            Covode.recordClassIndex(43036);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(e eVar) {
            this.f69807a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.base.utils.a.AbstractC1546a
        public final void a(Activity activity, boolean z) {
            l.d(activity, "");
            com.ss.android.ugc.aweme.cc.a.b bVar = this.f69807a.f69806a;
            if (bVar != null) {
                bVar.a(activity, z);
            }
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.utils.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f69808a;

        static {
            Covode.recordClassIndex(43037);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(e eVar) {
            this.f69808a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.d.b
        public final void onActivityDestroyed(Activity activity) {
            l.d(activity, "");
            super.onActivityDestroyed(activity);
            com.ss.android.ugc.aweme.cc.a.b bVar = this.f69808a.f69806a;
            if (bVar != null) {
                bVar.b(activity);
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.d.b
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.d(activity, "");
            super.onActivityCreated(activity, bundle);
            com.ss.android.ugc.aweme.cc.a.b bVar = this.f69808a.f69806a;
            if (bVar != null) {
                bVar.a(activity);
            }
        }
    }
}
