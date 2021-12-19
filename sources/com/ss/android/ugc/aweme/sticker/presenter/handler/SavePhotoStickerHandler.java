package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.text.TextUtils;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.j;
import h.f.b.l;
import org.json.JSONObject;

public final class SavePhotoStickerHandler extends b implements au, e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f135319d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Effect f135320a;

    /* renamed from: b  reason: collision with root package name */
    final g f135321b;

    /* renamed from: c  reason: collision with root package name */
    final j f135322c;

    /* renamed from: e  reason: collision with root package name */
    private SafeHandler f135323e;

    /* renamed from: f  reason: collision with root package name */
    private final d f135324f;

    static {
        Covode.recordClassIndex(88414);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135320a = null;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88415);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SavePhotoStickerHandler f135325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f135326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f135327c;

        static {
            Covode.recordClassIndex(88416);
        }

        b(SavePhotoStickerHandler savePhotoStickerHandler, int i2, String str) {
            this.f135325a = savePhotoStickerHandler;
            this.f135326b = i2;
            this.f135327c = str;
        }

        public final void run() {
            String extra;
            if (this.f135326b == 69) {
                SavePhotoStickerHandler savePhotoStickerHandler = this.f135325a;
                savePhotoStickerHandler.f135321b.a(this.f135327c);
                Effect effect = savePhotoStickerHandler.f135320a;
                if (effect != null && (extra = effect.getExtra()) != null) {
                    try {
                        savePhotoStickerHandler.f135321b.b(new JSONObject(extra).optString("hint_for_saving_captured_image"));
                    } catch (Exception e2) {
                        savePhotoStickerHandler.f135322c.a(e2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return g.B(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        String extra;
        l.d(bVar, "");
        l.d(aVar, "");
        Effect effect = aVar.f135378a;
        this.f135320a = effect;
        if (effect != null && (extra = effect.getExtra()) != null) {
            try {
                if (!TextUtils.isEmpty(new JSONObject(extra).optString("hint_for_saving_captured_image"))) {
                    this.f135321b.a(this.f135320a, this.f135324f);
                }
            } catch (Exception e2) {
                this.f135322c.a(e2);
            }
        }
    }

    public SavePhotoStickerHandler(d dVar, g gVar, j jVar) {
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(jVar, "");
        this.f135324f = dVar;
        this.f135321b = gVar;
        this.f135322c = jVar;
        this.f135323e = new SafeHandler(dVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (g.B(this.f135320a)) {
            this.f135323e.post(new b(this, i2, str));
        }
    }
}
