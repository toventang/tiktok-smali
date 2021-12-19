package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class VoiceRecognizeStickerHandler extends b implements au {

    /* renamed from: a  reason: collision with root package name */
    public volatile Effect f135337a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f135338b;

    /* renamed from: c  reason: collision with root package name */
    public final String f135339c;

    /* renamed from: d  reason: collision with root package name */
    private final m f135340d;

    /* renamed from: e  reason: collision with root package name */
    private final p f135341e;

    /* renamed from: f  reason: collision with root package name */
    private final h<Boolean> f135342f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f135343g;

    /* renamed from: h  reason: collision with root package name */
    private final a<z> f135344h;

    /* renamed from: i  reason: collision with root package name */
    private final a<Boolean> f135345i;

    /* renamed from: j  reason: collision with root package name */
    private final a<Boolean> f135346j;

    static {
        Covode.recordClassIndex(88421);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135337a = null;
        c.f149151f.d(this.f135339c + " cancelSticker isStop " + this.f135342f);
        if (l.a((Object) this.f135342f.a(), (Object) true)) {
            b(p.a.b.f135413a);
        } else {
            this.f135338b = true;
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        c.f149151f.d(this.f135339c + " onStop currentSticker " + this.f135337a);
        if (this.f135337a != null) {
            b(p.a.c.f135414a);
        }
    }

    public final void b(p.a aVar) {
        this.f135341e.b(aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return g.i(aVar.f135378a);
    }

    private final void c(p.a aVar) {
        i lifecycle = this.f135340d.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.STARTED) && this.f135346j.invoke().booleanValue()) {
            this.f135341e.a(aVar);
        }
    }

    public final void a(p.a aVar) {
        c.f149151f.d(this.f135339c + " reopenAudioRecorder lifecycleOwner isActive: currentSticker " + this.f135337a);
        if (this.f135337a == null) {
            return;
        }
        if (this.f135345i.invoke().booleanValue()) {
            c(aVar);
        } else {
            b(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        c.f149151f.d(this.f135339c + " useSticker lifecycleOwner isActive: sticker " + aVar.f135378a);
        a<z> aVar2 = this.f135344h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        this.f135337a = aVar.f135378a;
        if (this.f135345i.invoke().booleanValue()) {
            this.f135338b = false;
            c(p.a.f.f135417a);
            return;
        }
        j.a.b(this.f135343g, (int) R.string.h03, 1).a();
    }

    public /* synthetic */ VoiceRecognizeStickerHandler(m mVar, p pVar, h hVar, Context context, a aVar) {
        this(mVar, pVar, hVar, context, AnonymousClass1.f135347a, aVar);
    }

    private VoiceRecognizeStickerHandler(m mVar, p pVar, h<Boolean> hVar, Context context, a<Boolean> aVar, a<Boolean> aVar2) {
        l.d(mVar, "");
        l.d(pVar, "");
        l.d(hVar, "");
        l.d(context, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f135340d = mVar;
        this.f135341e = pVar;
        this.f135342f = hVar;
        this.f135343g = context;
        this.f135344h = null;
        this.f135345i = aVar;
        this.f135346j = aVar2;
        this.f135339c = "VoiceRecognizeStickerHandler";
        mVar.getLifecycle().a(this);
        hVar.a(mVar, new com.bytedance.als.m<Boolean>(this) {
            /* class com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ VoiceRecognizeStickerHandler f135348a;

            static {
                Covode.recordClassIndex(88423);
            }

            {
                this.f135348a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                c.f149151f.d(this.f135348a.f135339c + " observe isStop " + bool2 + " currentSticker " + this.f135348a.f135337a + " needStopAudioRecorderAfter " + this.f135348a.f135338b);
                l.b(bool2, "");
                if (bool2.booleanValue() && this.f135348a.f135337a == null && this.f135348a.f135338b) {
                    this.f135348a.b(p.a.C3523a.f135412a);
                    this.f135348a.f135338b = false;
                }
            }
        });
    }
}
