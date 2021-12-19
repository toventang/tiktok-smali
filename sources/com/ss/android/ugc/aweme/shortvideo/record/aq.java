package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.context.f;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import h.f.b.l;

public final class aq implements f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f130056a;

    /* renamed from: b  reason: collision with root package name */
    public String f130057b;

    /* renamed from: c  reason: collision with root package name */
    public String f130058c;

    /* renamed from: d  reason: collision with root package name */
    public int f130059d;

    /* renamed from: e  reason: collision with root package name */
    public int f130060e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f130061f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f130062g;

    static {
        Covode.recordClassIndex(85340);
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final boolean a() {
        return this.f130056a;
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final String b() {
        return this.f130057b;
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final String c() {
        return this.f130058c;
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final int d() {
        return this.f130059d;
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final int e() {
        return this.f130060e;
    }

    @Override // com.ss.android.ugc.asve.context.f
    public final boolean f() {
        return this.f130061f;
    }

    public aq(CameraComponentModel cameraComponentModel) {
        boolean z;
        String str = "";
        l.d(cameraComponentModel, str);
        GameDuetResource gameDuetResource = cameraComponentModel.v;
        if (gameDuetResource == null || gameDuetResource.gameSticker == null) {
            z = false;
        } else {
            z = true;
        }
        this.f130056a = z;
        String str2 = cameraComponentModel.o.f124723d;
        this.f130057b = str2 == null ? str : str2;
        String str3 = cameraComponentModel.o.f124722c;
        this.f130058c = str3 != null ? str3 : str;
        this.f130059d = cameraComponentModel.o.f124727h;
        this.f130060e = cameraComponentModel.o.f124728i;
        this.f130062g = cameraComponentModel.o.s;
    }
}
