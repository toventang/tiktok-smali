package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;

public abstract class d {
    static {
        Covode.recordClassIndex(2440);
    }

    public abstract h a(Activity activity, g gVar);

    public abstract h a(String str);

    public abstract void a(b bVar, c cVar);

    public abstract void a(f fVar);

    public abstract void a(i iVar, j jVar);

    public abstract void a(l lVar, m mVar);

    public abstract boolean a();

    public abstract Purchase.a b(String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5817a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f5818b;

        /* renamed from: c  reason: collision with root package name */
        public k f5819c;

        static {
            Covode.recordClassIndex(2441);
        }

        private a(Context context) {
            this.f5818b = context;
        }

        public /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }
}
