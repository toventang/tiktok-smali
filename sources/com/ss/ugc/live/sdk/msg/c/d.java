package com.ss.ugc.live.sdk.msg.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.c;
import com.ss.ugc.live.sdk.msg.b.e;
import com.ss.ugc.live.sdk.msg.b.f;
import com.ss.ugc.live.sdk.msg.d.f;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> f154154a;

    /* renamed from: b  reason: collision with root package name */
    public f<com.ss.ugc.live.sdk.msg.b.f, ? extends Exception> f154155b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.ugc.live.sdk.msg.b.f f154156c;

    /* renamed from: d  reason: collision with root package name */
    public final f f154157d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f154158e;

    /* renamed from: f  reason: collision with root package name */
    public final long f154159f;

    /* renamed from: g  reason: collision with root package name */
    public final long f154160g;

    /* renamed from: h  reason: collision with root package name */
    public final long f154161h;

    /* renamed from: i  reason: collision with root package name */
    public final e f154162i;

    /* renamed from: j  reason: collision with root package name */
    public final c f154163j;

    /* renamed from: k  reason: collision with root package name */
    private SdkUplinkPacket f154164k;

    /* renamed from: l  reason: collision with root package name */
    private Exception f154165l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f154166m;

    static {
        Covode.recordClassIndex(102812);
    }

    public final SdkUplinkPacket a() {
        String str;
        Map<String, String> map = this.f154162i.f154111c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = this.f154162i.f154112d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        byte[] a2 = this.f154162i.a();
        l.a((Object) a2, "");
        try {
            Uri parse = Uri.parse(this.f154162i.f154110b);
            l.a((Object) parse, "");
            str = parse.getPath();
            if (str == null) {
                str = this.f154162i.f154110b;
            }
        } catch (Exception unused) {
            str = this.f154162i.f154110b;
        }
        SdkUplinkPacket build = new SdkUplinkPacket.Builder().uniqueID(Long.valueOf(this.f154159f)).serviceID(Long.valueOf(this.f154160g)).uri(str).queryParams(map2).headers(map).payload(i.of(Arrays.copyOf(a2, a2.length))).build();
        l.a((Object) build, "");
        return build;
    }

    public final f<com.ss.ugc.live.sdk.msg.b.f, Exception> b() {
        byte[] bArr;
        int i2;
        SdkUplinkPacket sdkUplinkPacket = this.f154164k;
        com.ss.ugc.live.sdk.msg.b.f fVar = this.f154156c;
        Exception exc = this.f154165l;
        if (sdkUplinkPacket != null) {
            i iVar = sdkUplinkPacket.payload;
            if (iVar == null || (bArr = iVar.toByteArray()) == null) {
                bArr = new byte[0];
            }
            f.a aVar = new f.a();
            Integer num = sdkUplinkPacket.statusCode;
            l.a((Object) num, "");
            f.a a2 = aVar.a(num.intValue()).a(sdkUplinkPacket.statusMessage).a(bArr);
            if (this.f154166m) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            f.a b2 = a2.b(i2);
            if (!(bArr.length == 0 || this.f154162i.f154118j == null)) {
                b2.a(this.f154162i.f154118j.a(bArr));
            }
            return f.a.a(b2.f154126a);
        } else if (fVar != null) {
            byte[] bArr2 = fVar.f154123d;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            f.a b3 = new f.a().a(fVar.f154120a).a(fVar.f154121b).a(bArr2).b(0);
            if (!(bArr2.length == 0 || this.f154162i.f154118j == null)) {
                b3.a(this.f154162i.f154118j.a(bArr2));
            }
            return f.a.a(b3.f154126a);
        } else if (exc != null) {
            return f.a.a(exc);
        } else {
            return f.a.a((Exception) new c(-3, "request not finish", null, 4, null));
        }
    }

    public final void a(Exception exc, g gVar, boolean z) {
        l.c(exc, "");
        l.c(gVar, "");
        this.f154165l = exc;
        this.f154157d.a(exc, gVar, z);
    }

    public final void a(SdkUplinkPacket sdkUplinkPacket, g gVar, boolean z, boolean z2) {
        l.c(sdkUplinkPacket, "");
        l.c(gVar, "");
        this.f154166m = z2;
        this.f154164k = sdkUplinkPacket;
        this.f154157d.a(sdkUplinkPacket, gVar, z);
    }

    public d(long j2, long j3, long j4, e eVar, c cVar) {
        l.c(eVar, "");
        l.c(cVar, "");
        this.f154159f = j2;
        this.f154160g = j3;
        this.f154161h = j4;
        this.f154162i = eVar;
        this.f154163j = cVar;
        this.f154157d = new f(j2, j3);
    }
}
