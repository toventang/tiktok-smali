package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.a.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class c extends a {
    static {
        Covode.recordClassIndex(85516);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f130393b;

        static {
            Covode.recordClassIndex(85517);
        }

        public a(c cVar, View view) {
            this.f130392a = cVar;
            this.f130393b = view;
        }

        public final void run() {
            this.f130392a.a(this.f130393b);
        }
    }

    public final void a(View view) {
        List<NormalTrackTimeStamp> a2;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(this.f130389e)) != null && (normalTrackTimeStamp = a2.get(0)) != null) {
            RectF a3 = a(normalTrackTimeStamp);
            view.setPivotX(((float) view.getWidth()) / 2.0f);
            view.setPivotY(((float) view.getHeight()) / 2.0f);
            view.setTranslationX(a3.left + ((a3.width() - ((float) view.getWidth())) / 2.0f));
            view.setTranslationY(a3.top + ((a3.height() - ((float) view.getHeight())) / 2.0f));
            view.setScaleX(a3.width() / ((float) view.getWidth()));
            view.setScaleY(a3.width() / ((float) view.getWidth()));
            view.setRotation(normalTrackTimeStamp.getRotation());
            view.setVisibility(0);
            view.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, b bVar) {
        String str;
        i iVar;
        l.d(bVar, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            Activity a2 = e.a(this.f130387c);
            if (a2 != null) {
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62401a = a2;
                j jVar = this.f130390f;
                if (jVar == null || (iVar = jVar.r) == null) {
                    str = null;
                } else {
                    str = iVar.f134901a;
                }
                dVar.f62402b = str;
                dVar.f62403c = "click";
                com.ss.android.ugc.aweme.account.b.b().showLoginAndRegisterView(dVar.a());
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar = this.f130388d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerInteractView");
        ((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e) aVar).c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e eVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, eVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(eVar, "");
        l.d(interactStickerStruct, "");
    }
}
