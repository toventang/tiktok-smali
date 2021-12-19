package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.p;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class f extends a {
    static {
        Covode.recordClassIndex(85522);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f130402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f130403b;

        static {
            Covode.recordClassIndex(85523);
        }

        a(f fVar, View view) {
            this.f130402a = fVar;
            this.f130403b = view;
        }

        public final void run() {
            this.f130402a.b(this.f130403b);
        }
    }

    public final float[] a() {
        List<NormalTrackTimeStamp> a2 = a(0, this.f130389e);
        if (a2 == null || b.a((Collection) a2) || a2.get(0) == null) {
            return null;
        }
        NormalTrackTimeStamp normalTrackTimeStamp = a2.get(0);
        if (normalTrackTimeStamp == null) {
            l.b();
        }
        RectF a3 = a(normalTrackTimeStamp);
        float[] fArr = {a3.left, a3.top, a3.right, a3.top, a3.left, a3.bottom, a3.right, a3.bottom};
        Matrix matrix = new Matrix();
        NormalTrackTimeStamp normalTrackTimeStamp2 = a2.get(0);
        if (normalTrackTimeStamp2 == null) {
            l.b();
        }
        matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        l.d(interactStickerStruct, "");
        return c.a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a
    public final void a(float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar = this.f130388d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollInteractStickerView");
        p pVar = (p) aVar;
        Context context = pVar.f130436i;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        com.bytedance.tux.tooltip.b a2 = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b((Activity) context).a(-1001L)).a(new p.c(pVar)).a(p.d.f130629a);
        a2.a(androidx.core.content.b.c(pVar.f130436i, R.color.c7));
        a2.a(h.TOP);
        a2.a((int) f2, (int) f3);
        pVar.f130431d = a2.d();
        com.bytedance.tux.tooltip.a aVar2 = pVar.f130431d;
        if (aVar2 != null) {
            aVar2.a();
        }
        bVar.a(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, p pVar, InteractStickerStruct interactStickerStruct, j jVar) {
        super(context, pVar, interactStickerStruct, jVar);
        l.d(context, "");
        l.d(pVar, "");
        l.d(interactStickerStruct, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        User user;
        j jVar = this.f130390f;
        if (jVar != null) {
            user = jVar.f134922c;
        } else {
            user = null;
        }
        if (!in.g(user)) {
            return false;
        }
        return super.a(j2, i2, f2, f3);
    }
}
