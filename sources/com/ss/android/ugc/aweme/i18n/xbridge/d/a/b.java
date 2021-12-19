package com.ss.android.ugc.aweme.i18n.xbridge.d.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.d;
import com.bytedance.ies.xbridge.base.runtime.a.e;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.utils.permission.e;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;

public final class b implements com.ss.android.ugc.aweme.i18n.xbridge.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f100016c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final WeakReference<Activity> f100017a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.i18n.xbridge.a.b f100018b;

    static {
        Covode.recordClassIndex(63746);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63747);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.b$b  reason: collision with other inner class name */
    static final class C2453b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(63748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2453b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            Activity activity = bVar.f100017a.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 700);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final void a(d dVar) {
        l.d(dVar, "");
        C2453b bVar = new C2453b(this);
        l.d(bVar, "");
        Activity activity = this.f100017a.get();
        if (activity == null) {
            return;
        }
        if (e.c(activity) == 0) {
            bVar.invoke();
        } else {
            com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new c(this, bVar));
        }
    }

    public b(WeakReference<Activity> weakReference, com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar) {
        l.d(weakReference, "");
        l.d(bVar, "");
        this.f100017a = weakReference;
        this.f100018b = bVar;
    }

    static final class c implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f100019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f100020b;

        static {
            Covode.recordClassIndex(63749);
        }

        c(b bVar, h.f.a.a aVar) {
            this.f100019a = bVar;
            this.f100020b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f100020b.invoke();
            } else {
                this.f100019a.f100018b.a(-6, "Permission not granted");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.i18n.xbridge.a.a
    public final boolean a(int i2, int i3, Intent intent) {
        if (i2 == 700) {
            if (i3 == 0 || intent == null) {
                this.f100018b.a(-7, "User cancelled");
                return true;
            }
            Activity activity = this.f100017a.get();
            if (activity == null) {
                this.f100018b.a(0, "Activity not found");
                return true;
            }
            Uri data = intent.getData();
            if (data == null || com.bytedance.common.utility.m.a(data.toString())) {
                this.f100018b.a(0, "Video doesn't exist");
                return true;
            }
            String uri = data.toString();
            l.b(uri, "");
            List<e.a> a2 = n.a(new e.a(uri, c.b.e.a(activity, data), "video"));
            com.ss.android.ugc.aweme.i18n.xbridge.a.b bVar = this.f100018b;
            com.bytedance.ies.xbridge.base.runtime.a.e eVar = new com.bytedance.ies.xbridge.base.runtime.a.e();
            eVar.f35800a = a2;
            bVar.a(eVar);
        }
        return true;
    }
}
