package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.types.game.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.h;
import h.m.p;
import h.z;
import org.json.JSONObject;

public final class GameStickerHandler extends b implements au, e, f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135305c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Effect f135306a;

    /* renamed from: b  reason: collision with root package name */
    public final h<m> f135307b;

    /* renamed from: d  reason: collision with root package name */
    private SafeHandler f135308d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<z> f135309e;

    static {
        Covode.recordClassIndex(88408);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135306a = null;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88410);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @v(a = i.a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f135307b.isInitialized()) {
            this.f135307b.getValue().d();
        }
    }

    @v(a = i.a.ON_STOP)
    private final void onStop() {
        if (this.f135307b.isInitialized()) {
            this.f135307b.getValue().b();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.f
    public final boolean b() {
        if (!this.f135307b.isInitialized() || !this.f135307b.getValue().c()) {
            return false;
        }
        return true;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GameStickerHandler f135311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f135312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f135313c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f135314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f135315e;

        static {
            Covode.recordClassIndex(88411);
        }

        b(GameStickerHandler gameStickerHandler, int i2, int i3, int i4, String str) {
            this.f135311a = gameStickerHandler;
            this.f135312b = i2;
            this.f135313c = i3;
            this.f135314d = i4;
            this.f135315e = str;
        }

        public final void run() {
            String str;
            int i2 = this.f135312b;
            if (i2 != 45) {
                if (i2 == 48) {
                    this.f135311a.f135307b.getValue().a();
                }
            } else if (this.f135313c == 2) {
                GameStickerHandler gameStickerHandler = this.f135311a;
                int i3 = this.f135314d;
                String str2 = this.f135315e;
                try {
                    String optString = new JSONObject(str2).optString("effectPath");
                    Effect effect = gameStickerHandler.f135306a;
                    String str3 = null;
                    if (effect != null) {
                        str = effect.getUnzipPath();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        l.b(optString, "");
                        Effect effect2 = gameStickerHandler.f135306a;
                        if (effect2 == null || (str3 = effect2.getUnzipPath()) == null) {
                            l.b();
                        }
                        if (p.a((CharSequence) optString, (CharSequence) str3, true)) {
                            gameStickerHandler.f135307b.getValue().a(gameStickerHandler.f135306a, str2, i3);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return c.e(aVar.f135378a);
    }

    public /* synthetic */ GameStickerHandler(androidx.lifecycle.m mVar, h hVar) {
        this(mVar, hVar, AnonymousClass1.f135310a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f135309e.invoke();
        this.f135306a = aVar.f135378a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.types.game.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public GameStickerHandler(androidx.lifecycle.m mVar, h<? extends m> hVar, h.f.a.a<z> aVar) {
        l.d(mVar, "");
        l.d(hVar, "");
        l.d(aVar, "");
        this.f135307b = hVar;
        this.f135309e = aVar;
        this.f135308d = new SafeHandler(mVar);
        mVar.getLifecycle().a(this);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (c.e(this.f135306a)) {
            this.f135308d.post(new b(this, i2, i3, i4, str));
        }
    }
}
