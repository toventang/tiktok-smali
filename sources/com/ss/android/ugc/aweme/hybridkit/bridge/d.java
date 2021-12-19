package com.ss.android.ugc.aweme.hybridkit.bridge;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.f;
import com.bytedance.ies.bullet.service.base.a.c;
import com.bytedance.ies.bullet.service.f.a.b.q;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public abstract class d implements i {
    static {
        Covode.recordClassIndex(63589);
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final <T extends q> T a(Class<T> cls) {
        l.d(cls, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(Uri uri, b<? super Uri, z> bVar, b<? super Throwable, z> bVar2) {
        l.d(uri, "");
        l.d(bVar, "");
        l.d(bVar2, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(String str, List<String> list, List<? extends JSONObject> list2) {
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(Throwable th) {
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void a(List<String> list, f fVar) {
        l.d(list, "");
        l.d(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final <T extends c> T b(Class<T> cls) {
        l.d(cls, "");
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final Uri e() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final boolean h() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void i() {
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void j() {
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void k() {
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final q o_() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public void onEvent(p pVar) {
        l.d(pVar, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final Uri p_() {
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final void l() {
        i.a.a(this);
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final com.bytedance.ies.bullet.c.c.z a() {
        return new com.bytedance.ies.bullet.c.c.z("");
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final com.bytedance.ies.bullet.c.e.a.b c() {
        return new com.bytedance.ies.bullet.c.e.a.b();
    }

    @Override // com.bytedance.ies.bullet.c.c.i
    public final List<String> d() {
        return new ArrayList();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public com.bytedance.ies.bullet.service.base.a.q getLoggerWrapper() {
        return new com.bytedance.ies.bullet.service.base.a.q(null, "");
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.d(th, "");
        l.d(str, "");
        i.a.a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.d(str, "");
        l.d(pVar, "");
        l.d(str2, "");
        i.a.a(this, str, pVar, str2);
    }
}
