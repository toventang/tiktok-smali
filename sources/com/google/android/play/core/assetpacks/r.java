package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.au;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.b.l;
import com.google.android.play.core.d.q;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.f;
import com.google.android.play.core.tasks.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class r implements dj {

    /* renamed from: a  reason: collision with root package name */
    static final b f53080a = new b("AssetPackServiceImpl");

    /* renamed from: g  reason: collision with root package name */
    private static final Intent f53081g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b  reason: collision with root package name */
    final String f53082b;

    /* renamed from: c  reason: collision with root package name */
    final ay f53083c;

    /* renamed from: d  reason: collision with root package name */
    l<ca> f53084d;

    /* renamed from: e  reason: collision with root package name */
    l<ca> f53085e;

    /* renamed from: f  reason: collision with root package name */
    final AtomicBoolean f53086f = new AtomicBoolean();

    static {
        Covode.recordClassIndex(32772);
    }

    r(Context context, ay ayVar) {
        this.f53082b = context.getPackageName();
        this.f53083c = ayVar;
        if (au.a(context)) {
            Context a2 = q.a(context);
            b bVar = f53080a;
            Intent intent = f53081g;
            this.f53084d = new l<>(a2, bVar, "AssetPackService", intent, dk.f53042a);
            this.f53085e = new l<>(q.a(context), bVar, "AssetPackService-keepAlive", intent, dl.f53043a);
        }
        f53080a.a("AssetPackService initiated.", new Object[0]);
    }

    static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10803);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    static Bundle b(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i2);
        return bundle;
    }

    static Bundle b(int i2, String str) {
        Bundle b2 = b(i2);
        b2.putString("module_name", str);
        return b2;
    }

    static /* synthetic */ Bundle c(int i2, String str, String str2, int i3) {
        Bundle b2 = b(i2, str);
        b2.putString("slice_id", str2);
        b2.putInt("chunk_number", i3);
        return b2;
    }

    private static <T> d<T> c() {
        f53080a.b("onError(%d)", -11);
        return f.a((Exception) new a(-11));
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final d<List<String>> a(Map<String, Long> map) {
        if (this.f53084d == null) {
            return c();
        }
        f53080a.d("syncPacks", new Object[0]);
        m mVar = new m();
        this.f53084d.a(new g(this, mVar, map, mVar));
        return mVar.f53383a;
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final synchronized void a() {
        MethodCollector.i(7625);
        if (this.f53085e == null) {
            f53080a.e("Keep alive connection manager is not initialized.", new Object[0]);
            MethodCollector.o(7625);
            return;
        }
        b bVar = f53080a;
        bVar.d("keepAlive", new Object[0]);
        if (!this.f53086f.compareAndSet(false, true)) {
            bVar.d("Service is already kept alive.", new Object[0]);
            MethodCollector.o(7625);
            return;
        }
        m mVar = new m();
        this.f53085e.a(new l(this, mVar, mVar));
        MethodCollector.o(7625);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2) {
        if (this.f53084d != null) {
            f53080a.d("notifySessionFailed", new Object[0]);
            m mVar = new m();
            this.f53084d.a(new j(this, mVar, i2, mVar));
            return;
        }
        throw new au("The Play Store app is not installed or is an unofficial version.", i2);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2, String str) {
        a(i2, str, 10);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str, int i3) {
        if (this.f53084d != null) {
            f53080a.d("notifyModuleCompleted", new Object[0]);
            m mVar = new m();
            this.f53084d.a(new i(this, mVar, i2, str, mVar, i3));
            return;
        }
        throw new au("The Play Store app is not installed or is an unofficial version.", i2);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2, String str, String str2, int i3) {
        if (this.f53084d != null) {
            f53080a.d("notifyChunkTransferred", new Object[0]);
            m mVar = new m();
            this.f53084d.a(new h(this, mVar, i2, str, str2, i3, mVar));
            return;
        }
        throw new au("The Play Store app is not installed or is an unofficial version.", i2);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(List<String> list) {
        if (this.f53084d != null) {
            f53080a.d("cancelDownloads(%s)", list);
            m mVar = new m();
            this.f53084d.a(new f(this, mVar, list, mVar));
        }
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final d<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        if (this.f53084d == null) {
            return c();
        }
        f53080a.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i3), Integer.valueOf(i2));
        m mVar = new m();
        this.f53084d.a(new k(this, mVar, i2, str, str2, i3, mVar));
        return mVar.f53383a;
    }
}
