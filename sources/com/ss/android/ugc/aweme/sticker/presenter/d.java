package com.ss.android.ugc.aweme.sticker.presenter;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.utils.ij;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public Effect f135287a;

    /* renamed from: b  reason: collision with root package name */
    public final ij<r> f135288b;

    /* renamed from: c  reason: collision with root package name */
    public final t<a> f135289c;

    /* renamed from: d  reason: collision with root package name */
    private final t<Effect> f135290d;

    /* renamed from: e  reason: collision with root package name */
    private final t<k> f135291e;

    /* renamed from: f  reason: collision with root package name */
    private final t<n> f135292f;

    /* renamed from: g  reason: collision with root package name */
    private final t<l> f135293g;

    /* renamed from: h  reason: collision with root package name */
    private final t<b> f135294h;

    /* renamed from: i  reason: collision with root package name */
    private final t<Effect> f135295i;

    /* renamed from: j  reason: collision with root package name */
    private final t<Effect> f135296j;

    /* renamed from: k  reason: collision with root package name */
    private String f135297k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f135298l;

    static {
        Covode.recordClassIndex(88401);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final Effect a() {
        return this.f135287a;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<Effect> b() {
        return this.f135290d;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<k> c() {
        return this.f135291e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<n> d() {
        return this.f135292f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<l> e() {
        return this.f135293g;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final /* bridge */ /* synthetic */ LiveData f() {
        return this.f135288b;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<b> g() {
        return this.f135294h;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<Effect> h() {
        return this.f135295i;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final LiveData<Effect> i() {
        return this.f135296j;
    }

    private d() {
        this.f135298l = false;
        this.f135290d = new t<>();
        this.f135291e = new t<>();
        this.f135292f = new t<>();
        this.f135293g = new t<>();
        this.f135294h = new t<>();
        this.f135295i = new t<>();
        this.f135296j = new t<>();
        this.f135297k = "";
        this.f135288b = new ij<>();
        this.f135289c = new t<>();
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final void a(a aVar) {
        l.d(aVar, "");
        this.f135289c.setValue(aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final void a(b bVar) {
        this.f135294h.setValue(bVar);
        if (bVar != null && !bVar.f135277e) {
            this.f135288b.setValue(new r(bVar.f135274b));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final void a(Effect effect) {
        Effect effect2;
        this.f135290d.setValue(effect);
        n value = this.f135292f.getValue();
        if (value != null) {
            effect2 = value.f135423b;
        } else {
            effect2 = null;
        }
        this.f135292f.setValue(new n(effect2, effect));
        this.f135291e.setValue(null);
        this.f135287a = effect;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final void b(Effect effect) {
        if (effect == null) {
            this.f135295i.setValue(null);
            this.f135296j.setValue(null);
            return;
        }
        this.f135295i.setValue(effect);
        if (!TextUtils.isEmpty(effect.getParentId())) {
            String parentId = effect.getParentId();
            if (parentId == null) {
                l.b();
            }
            this.f135297k = parentId;
            return;
        }
        this.f135296j.setValue(effect);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final boolean c(Effect effect) {
        List<String> children;
        Boolean valueOf;
        Effect effect2 = this.f135287a;
        if (effect2 == null || (children = effect2.getChildren()) == null || effect == null || (valueOf = Boolean.valueOf(children.contains(effect.getEffectId()))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.j
    public final void a(Effect effect, int i2) {
        int i3;
        k value = this.f135291e.getValue();
        if (value != null) {
            i3 = value.f135419b;
        } else {
            i3 = -1;
        }
        if (i3 != i2) {
            this.f135290d.setValue(effect);
            k value2 = this.f135291e.getValue();
            if (value2 == null) {
                value2 = new k();
            }
            l.b(value2, "");
            k kVar = new k(effect, i2);
            this.f135291e.setValue(kVar);
            this.f135293g.setValue(new l(value2, kVar));
        }
    }
}
