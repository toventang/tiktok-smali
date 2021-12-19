package com.bytedance.android.livesdk.aj;

import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.android.livesdkapi.depend.model.c.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.a.c.c;
import com.ss.videoarch.a.g;
import java.util.Map;
import org.json.JSONObject;

public final class u implements g {

    /* renamed from: e  reason: collision with root package name */
    private static final SparseIntArray f13896e;

    /* renamed from: a  reason: collision with root package name */
    g f13897a;

    /* renamed from: b  reason: collision with root package name */
    aa f13898b;

    /* renamed from: c  reason: collision with root package name */
    g.a f13899c;

    /* renamed from: d  reason: collision with root package name */
    g.b f13900d;

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(int i2) {
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(boolean z, boolean z2, int i2) {
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(boolean z) {
        this.f13897a.a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a() {
        this.f13897a.e();
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void d() {
        this.f13897a.c();
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void e() {
        this.f13897a.h();
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void f() {
        this.f13897a.i();
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final String k() {
        return this.f13897a.P;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final boolean h() {
        com.ss.videoarch.a.g gVar = this.f13897a;
        if (gVar == null || !gVar.j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final JSONObject j() {
        com.ss.videoarch.a.g gVar = this.f13897a;
        if (gVar != null) {
            return gVar.n();
        }
        return new JSONObject();
    }

    static {
        Covode.recordClassIndex(7717);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f13896e = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final boolean g() {
        com.ss.videoarch.a.g gVar = this.f13897a;
        if (gVar == null || gVar.f154319j == null || !gVar.f154319j.p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final Point i() {
        return new Point(this.f13897a.k(), this.f13897a.l());
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b() {
        this.f13897a.a(2, 0);
        if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
            this.f13897a.a(18, 0);
            this.f13897a.a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
            this.f13897a.a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
            this.f13897a.a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
            this.f13897a.a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(35, 1);
            this.f13897a.a(33, 1);
            this.f13897a.a(34, 0);
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(36, 1);
        }
        if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(40, 0);
        }
        if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(42, 1);
        }
        this.f13897a.a(9, 2);
        this.f13897a.b();
        g.b bVar = this.f13900d;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c() {
        if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
            this.f13897a.a(18, 0);
            this.f13897a.a(19, LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue());
            this.f13897a.a(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
            this.f13897a.a(20, LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue());
            this.f13897a.a(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
        }
        if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(35, 1);
            this.f13897a.a(33, 1);
            this.f13897a.a(34, 0);
        }
        if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
            this.f13897a.a(36, 1);
        }
        this.f13897a.a(72, com.bytedance.android.livesdk.utils.g.a());
        this.f13897a.a(9, 2);
        this.f13897a.b();
        g.b bVar = this.f13900d;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b(String str) {
        this.f13897a.d(str);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c(boolean z) {
        this.f13897a.a(z);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(Surface surface) {
        this.f13897a.a(surface);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void b(boolean z) {
        com.ss.videoarch.a.g gVar;
        if (!z && (gVar = this.f13897a) != null) {
            gVar.a(41, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f13897a.a(86, str);
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void d(boolean z) {
        this.f13897a.a(76, z ? 1 : 0);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void e(boolean z) {
        this.f13897a.a(56, z ? 1 : 0);
    }

    public u(z zVar) {
        this.f13897a = zVar.a();
        aa aaVar = zVar.f13928g;
        this.f13898b = aaVar;
        g.a aVar = this.f13899c;
        if (aVar != null) {
            aaVar.f13805a = aVar;
            this.f13899c = null;
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(SurfaceHolder surfaceHolder) {
        this.f13897a.a(surfaceHolder);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(a aVar) {
        if (aVar == null) {
            aVar = new a("", "", "");
        }
        this.f13897a.a(63, aVar.f23027a + "-" + aVar.f23028b);
        this.f13897a.a(64, aVar.f23029c);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str) {
        this.f13897a.a(str);
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(g.a aVar, g.b bVar) {
        aa aaVar = this.f13898b;
        if (aaVar != null) {
            aaVar.f13805a = aVar;
            this.f13898b.f13806b = bVar;
        } else {
            this.f13899c = aVar;
        }
        this.f13900d = bVar;
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, q qVar) {
        boolean a2 = this.f13897a.a(str);
        if (qVar != null) {
            qVar.a(a2);
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, String str2) {
        this.f13897a.b(str);
        if (!m.a(str2)) {
            this.f13897a.a(43, str2);
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g
    public final void a(String str, Map<String, String> map, g.d dVar) {
        if (str.indexOf("://") <= 0) {
            this.f13897a.c(Uri.parse("file://".concat(String.valueOf(str))).toString());
            return;
        }
        this.f13897a.a(new c[]{new c(Uri.parse(str).toString(), map.get("sdk_params"))});
    }
}
