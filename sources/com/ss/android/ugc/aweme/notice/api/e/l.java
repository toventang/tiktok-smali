package com.ss.android.ugc.aweme.notice.api.e;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.websocket.a.c.a;
import com.ss.android.websocket.a.c.b;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f112720a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final b f112721b = new c();

    /* renamed from: c  reason: collision with root package name */
    private final b f112722c;

    /* renamed from: d  reason: collision with root package name */
    private final b f112723d = new g();

    /* renamed from: e  reason: collision with root package name */
    private final b f112724e;

    /* renamed from: f  reason: collision with root package name */
    private final b f112725f;

    /* renamed from: g  reason: collision with root package name */
    private final b f112726g;

    /* renamed from: h  reason: collision with root package name */
    private final b f112727h;

    /* renamed from: i  reason: collision with root package name */
    private final b f112728i;

    /* renamed from: j  reason: collision with root package name */
    private final b f112729j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray<b> f112730k;

    static {
        Covode.recordClassIndex(72460);
    }

    public l() {
        if (SettingsManager.a().a("ws_check_anr_enable", true)) {
            this.f112722c = new ab();
        } else {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                this.f112722c = createIIMServicebyMonsterPlugin.getImParser();
            } else {
                this.f112722c = new a();
            }
        }
        this.f112724e = new d();
        this.f112725f = new j();
        this.f112730k = new SparseArray<>();
        this.f112726g = new k();
        this.f112727h = new f();
        this.f112728i = new a();
        this.f112729j = new n();
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(com.ss.android.websocket.internal.a aVar) {
        if (aVar.getMethod() == 1 && aVar.getService() == 1) {
            return this.f112720a.a(aVar);
        }
        if ((aVar.getMethod() == 1 && aVar.getService() == 5) || (aVar.getMethod() == 1 && aVar.getService() == 1015)) {
            return this.f112722c.a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 6) {
            return this.f112721b.a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 7) {
            return this.f112723d.a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 1010) {
            return this.f112724e.a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 20003) {
            return this.f112725f.a(aVar);
        }
        if (aVar.getMethod() == 2 && aVar.getService() == 6) {
            return this.f112726g.a(aVar);
        }
        if (aVar.getMethod() == 1778 && aVar.getService() == 1777) {
            return this.f112727h.a(aVar);
        }
        if ((aVar.getMethod() == 1 && aVar.getService() == 20164) || (aVar.getMethod() == 1 && aVar.getService() == 20047)) {
            return this.f112728i.a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 50000) {
            return this.f112729j.a(aVar);
        }
        b bVar = this.f112730k.get(aVar.getService());
        if (bVar != null) {
            return bVar.a(aVar);
        }
        return null;
    }
}
