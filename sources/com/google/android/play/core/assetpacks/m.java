package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.cb;
import java.util.List;

class m<T> extends cb {

    /* renamed from: a  reason: collision with root package name */
    final com.google.android.play.core.tasks.m<T> f53072a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f53073b;

    static {
        Covode.recordClassIndex(32767);
    }

    m(r rVar, com.google.android.play.core.tasks.m<T> mVar) {
        this.f53073b = rVar;
        this.f53072a = mVar;
    }

    m(r rVar, com.google.android.play.core.tasks.m mVar, byte b2) {
        this(rVar, mVar);
    }

    m(r rVar, com.google.android.play.core.tasks.m mVar, char c2) {
        this(rVar, mVar);
    }

    m(r rVar, com.google.android.play.core.tasks.m mVar, short s) {
        this(rVar, mVar);
    }

    @Override // com.google.android.play.core.b.cc
    public final void a(int i2) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onStartDownload(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.cc
    public void a(List<Bundle> list) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.b.cc
    public void a(Bundle bundle, Bundle bundle2) {
        this.f53073b.f53085e.a();
        r.f53080a.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.b.cc
    public void b(Bundle bundle, Bundle bundle2) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.b.cc
    public final void a() {
        this.f53073b.f53084d.a();
        r.f53080a.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.b.cc
    public void a(Bundle bundle) {
        this.f53073b.f53084d.a();
        int i2 = bundle.getInt("error_code");
        r.f53080a.b("onError(%d)", Integer.valueOf(i2));
        this.f53072a.b(new a(i2));
    }

    @Override // com.google.android.play.core.b.cc
    public final void b(int i2) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onCancelDownload(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.cc
    public final void b() {
        this.f53073b.f53084d.a();
        r.f53080a.d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.b.cc
    public final void c(int i2) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.cc
    public final void b(Bundle bundle) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.b.cc
    public final void c(Bundle bundle) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.b.cc
    public final void d(Bundle bundle) {
        this.f53073b.f53084d.a();
        r.f53080a.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.b.cc
    public final void c() {
        this.f53073b.f53084d.a();
        r.f53080a.d("onRemoveModule()", new Object[0]);
    }
}
