package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.a.c;
import com.bytedance.android.monitorV2.a.f;
import com.bytedance.android.monitorV2.d.a;
import com.bytedance.android.monitorV2.d.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public String f24113a;

    /* renamed from: b  reason: collision with root package name */
    public final i f24114b;

    /* renamed from: c  reason: collision with root package name */
    public final b f24115c;

    /* renamed from: d  reason: collision with root package name */
    private final a f24116d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.android.monitorV2.d.b f24117e;

    static {
        Covode.recordClassIndex(14200);
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final JSONObject c() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final JSONObject d() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.a.c
    public final i a() {
        return this.f24114b;
    }

    @Override // com.bytedance.android.monitorV2.a.g, com.bytedance.android.monitorV2.a.c
    public final /* bridge */ /* synthetic */ f b() {
        return this.f24114b;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final b e() {
        return this.f24115c;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final f f() {
        return this.f24117e;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final f g() {
        return this.f24116d;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final String i() {
        return this.f24114b.f23904c;
    }

    @Override // com.bytedance.android.monitorV2.a.g
    public final String h() {
        b bVar = this.f24115c;
        if (bVar != null) {
            return bVar.f23824a;
        }
        return "";
    }

    public final String toString() {
        return "LynxMonitorReportData{bid=" + this.f24113a + ", eventType=" + h() + ", nativeBase=" + this.f24114b + ", nativeInfo=" + this.f24115c + "}";
    }

    public d(i iVar, b bVar, a aVar, com.bytedance.android.monitorV2.d.b bVar2) {
        l.c(iVar, "");
        this.f24114b = iVar;
        this.f24115c = bVar;
        this.f24116d = aVar;
        this.f24117e = bVar2;
    }
}
