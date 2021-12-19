package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a {
    static {
        Covode.recordClassIndex(85553);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f130456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f130457b;

        static {
            Covode.recordClassIndex(85554);
        }

        a(b bVar, View view) {
            this.f130456a = bVar;
            this.f130457b = view;
        }

        public final void run() {
            this.f130456a.b(this.f130457b);
        }
    }

    public final void a(View view) {
        l.d(view, "");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new a(this, view));
        } else {
            b(view);
        }
    }

    public final void b(View view) {
        List<NormalTrackTimeStamp> a2;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (a2 = c.a(this.f130389e)) != null && (normalTrackTimeStamp = a2.get(0)) != null) {
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

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.a(interactStickerStruct);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar = this.f130388d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.duet.DuetInteractStickerView");
        a aVar2 = (a) aVar;
        com.bytedance.tux.tooltip.b a2 = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b(aVar2.f130436i).a(-1001L)).a(new a.c(aVar2)).a(a.d.f130452a);
        a2.a(androidx.core.content.b.c(aVar2.f130436i, R.color.c7));
        a2.a(h.TOP);
        a2.a((int) f2, (int) f3);
        aVar2.f130431d = a2.d();
        com.bytedance.tux.tooltip.a aVar3 = aVar2.f130431d;
        if (aVar3 != null) {
            aVar3.a();
        }
        bVar.a(true);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return super.a(j2, i2, f2, f3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, a aVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, aVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(interactStickerStruct, "");
    }
}
