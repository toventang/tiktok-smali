package com.bytedance.android.live.wallet.e;

import android.content.Context;
import com.bytedance.android.live.wallet.f.b.b;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public class a implements b, d {

    /* renamed from: a  reason: collision with root package name */
    public h f13130a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f13131b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13132c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.ies.web.a.a f13133d;

    static {
        Covode.recordClassIndex(7288);
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2) {
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public void a(int i2, int i3, int i4, Exception exc) {
        l.d(exc, "");
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public void a(DiamondPackageExtra diamondPackageExtra, List<c> list) {
        l.d(list, "");
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public void a(Exception exc, int i2) {
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public void b(int i2) {
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void c() {
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void l() {
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void m() {
    }

    public final h a() {
        h hVar = this.f13130a;
        if (hVar == null) {
            l.a("jsMsg");
        }
        return hVar;
    }

    public final JSONObject b() {
        JSONObject jSONObject = this.f13131b;
        if (jSONObject == null) {
            l.a("jsResult");
        }
        return jSONObject;
    }

    public final void a(h hVar) {
        l.d(hVar, "");
        this.f13130a = hVar;
    }

    public final void a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        this.f13131b = jSONObject;
    }

    public a(Context context, com.bytedance.ies.web.a.a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        this.f13132c = context;
        this.f13133d = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public void call(h hVar, JSONObject jSONObject) {
        l.d(hVar, "");
        l.d(jSONObject, "");
        this.f13130a = hVar;
        this.f13131b = jSONObject;
    }
}
