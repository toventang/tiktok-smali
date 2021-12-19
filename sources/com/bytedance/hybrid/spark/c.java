package com.bytedance.hybrid.spark;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.e.e;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.b;
import com.bytedance.lynx.hybrid.j.f;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<Object> f31104a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f31105b = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private static boolean f31106e;

    /* renamed from: c  reason: collision with root package name */
    private final Context f31107c;

    /* renamed from: d  reason: collision with root package name */
    private final SparkContext f31108d;

    public static final class a {
        static {
            Covode.recordClassIndex(18065);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(Context context, SparkContext sparkContext) {
            l.c(context, "");
            l.c(sparkContext, "");
            Iterator<T> it = c.f31104a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return new c(context, sparkContext, (byte) 0);
        }
    }

    private final void c() {
        f.a(this.f31108d.f40979f, "open_time", System.currentTimeMillis());
    }

    private static void d() {
        if (!f31106e) {
            com.bytedance.ies.xbridge.a.a(com.bytedance.hybrid.spark.b.a.class, null, null, 6);
            f31106e = true;
        }
    }

    static {
        Covode.recordClassIndex(18064);
    }

    public final com.bytedance.hybrid.spark.page.c b() {
        c();
        d();
        com.bytedance.hybrid.spark.e.c.a("Spark", "createView", this.f31108d);
        com.bytedance.hybrid.spark.page.c cVar = new com.bytedance.hybrid.spark.page.c(this.f31107c, (byte) 0);
        cVar.a(this.f31108d);
        return cVar;
    }

    public final void a() {
        c();
        d();
        int a2 = e.a.a(this.f31108d.f31050a);
        com.bytedance.hybrid.spark.e.c.a("Spark", "navigate type:".concat(String.valueOf(a2)), this.f31108d);
        if (a2 != 2 || !(this.f31107c instanceof androidx.fragment.app.e)) {
            Intent intent = new Intent(this.f31107c, SparkActivity.class);
            intent.putExtra("sparkContext", this.f31108d);
            intent.setFlags(268435456);
            Context context = this.f31107c;
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return;
        }
        String str = "SparkPopup#" + this.f31108d.f31050a.hashCode();
        Fragment a3 = ((androidx.fragment.app.e) this.f31107c).getSupportFragmentManager().a(str);
        if (a3 instanceof b) {
            b bVar = (b) a3;
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            l.a((Object) arguments, "");
            arguments.putParcelable("sparkContext", this.f31108d);
            bVar.setArguments(arguments);
            bVar.b();
            return;
        }
        b bVar2 = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sparkContext", this.f31108d);
        bVar2.setArguments(bundle);
        bVar2.show(((androidx.fragment.app.e) this.f31107c).getSupportFragmentManager(), str);
    }

    private c(Context context, SparkContext sparkContext) {
        this.f31107c = context;
        this.f31108d = sparkContext;
    }

    public /* synthetic */ c(Context context, SparkContext sparkContext, byte b2) {
        this(context, sparkContext);
    }
}
