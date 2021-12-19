package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FileSelectionMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68967b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68968c = "fileSelection";

    static {
        Covode.recordClassIndex(42516);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42517);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68968c;
    }

    public static final class b extends com.ss.android.ugc.aweme.fe.method.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f68969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f68970b;

        static {
            Covode.recordClassIndex(42518);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f68971a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f68972b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f68973c;

            static {
                Covode.recordClassIndex(42519);
            }

            a(b bVar, int i2, String str) {
                this.f68971a = bVar;
                this.f68972b = i2;
                this.f68973c = str;
            }

            public final void run() {
                this.f68971a.f91205c.a();
                this.f68971a.f68970b.a(this.f68972b, this.f68973c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod$b$b  reason: collision with other inner class name */
        static final class RunnableC1560b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f68974a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ JSONArray f68975b;

            static {
                Covode.recordClassIndex(42520);
            }

            RunnableC1560b(b bVar, JSONArray jSONArray) {
                this.f68974a = bVar;
                this.f68975b = jSONArray;
            }

            public final void run() {
                this.f68974a.f91205c.a();
                this.f68974a.f68970b.a(this.f68975b, 1, "uploadSuccess");
            }
        }

        @Override // com.ss.android.ugc.aweme.fe.method.m
        public final void a(JSONArray jSONArray) {
            l.d(jSONArray, "");
            this.f68969a.runOnUiThread(new RunnableC1560b(this, jSONArray));
        }

        @Override // com.ss.android.ugc.aweme.fe.method.m
        public final void a(int i2, String str) {
            l.d(str, "");
            this.f68969a.runOnUiThread(new a(this, i2, str));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity, BaseBridgeMethod.a aVar, WeakReference weakReference) {
            super(weakReference);
            this.f68969a = activity;
            this.f68970b = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSelectionMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        for (Context e2 = e(); e2 != null; e2 = ((ContextWrapper) e2).getBaseContext()) {
            if (e2 instanceof Activity) {
                Activity activity = (Activity) e2;
                if (activity != null) {
                    new b(activity, aVar, new WeakReference(activity)).a(jSONObject);
                    return;
                }
                return;
            } else if (!(e2 instanceof ContextWrapper)) {
                return;
            }
        }
    }
}
