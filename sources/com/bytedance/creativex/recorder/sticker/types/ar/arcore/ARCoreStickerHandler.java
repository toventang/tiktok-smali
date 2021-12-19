package com.bytedance.creativex.recorder.sticker.types.ar.arcore;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ttvecamera.l;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import org.json.JSONObject;

public final class ARCoreStickerHandler extends b implements au, e {

    /* renamed from: a  reason: collision with root package name */
    public final d f28487a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f28488b;

    static {
        Covode.recordClassIndex(16739);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ARCoreStickerHandler f28489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l.a f28490b;

        static {
            Covode.recordClassIndex(16740);
        }

        a(ARCoreStickerHandler aRCoreStickerHandler, l.a aVar) {
            this.f28489a = aRCoreStickerHandler;
            this.f28490b = aVar;
        }

        public final void run() {
            if (this.f28489a.f28487a.b()) {
                this.f28489a.f28487a.c().a(true, this.f28490b, com.bytedance.bpea.store.a.a.A());
            } else {
                this.f28489a.f28487a.a(true, this.f28490b, com.bytedance.bpea.store.a.a.A());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        if (this.f28487a.b()) {
            this.f28487a.c().a(false, new l.a(), com.bytedance.bpea.store.a.a.B());
        } else {
            this.f28487a.a(false, new l.a(), com.bytedance.bpea.store.a.a.B());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(aVar, "");
        Effect effect = aVar.f135378a;
        if (!g.k(effect)) {
            return false;
        }
        return effect.getTypes().contains("ARCore");
    }

    public ARCoreStickerHandler(Activity activity, m mVar, d dVar) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(dVar, "");
        this.f28488b = activity;
        this.f28487a = dVar;
        mVar.getLifecycle().a(this);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (i2 == 80) {
            q.d("ARCoreStickerHandler received msg");
            if (TextUtils.isEmpty(str)) {
                q.d("ARCoreStickerHandler arg3 is empty");
                return;
            }
            try {
                l.a aVar = new l.a();
                JSONObject jSONObject = new JSONObject(str);
                aVar.f61811a = l.a.EnumC1344a.values()[jSONObject.optInt("augmentedFaceMode", 0)];
                aVar.f61812b = l.a.b.values()[jSONObject.optInt("cloudAnchorMode", 0)];
                aVar.f61813c = l.a.c.values()[jSONObject.optInt("depthMode", 0)];
                aVar.f61814d = l.a.d.values()[jSONObject.optInt("focusMode", 0)];
                aVar.f61815e = l.a.e.values()[jSONObject.optInt("lightEstimationMode", 0)];
                aVar.f61816f = l.a.f.values()[jSONObject.optInt("planeFindingMode", 0)];
                this.f28488b.runOnUiThread(new a(this, aVar));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
