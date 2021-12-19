package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f;

import android.content.Context;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f130386a = "BaseStickerPresenter";

    /* renamed from: c  reason: collision with root package name */
    public final Context f130387c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a f130388d;

    /* renamed from: e  reason: collision with root package name */
    public final InteractStickerStruct f130389e;

    /* renamed from: f  reason: collision with root package name */
    public j f130390f;

    static {
        Covode.recordClassIndex(85514);
    }

    /* access modifiers changed from: protected */
    public abstract List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct);

    /* access modifiers changed from: protected */
    public abstract void a(float f2, float f3, b bVar);

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final void a(j jVar) {
        l.d(jVar, "");
        this.f130390f = jVar;
    }

    public final RectF a(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f2;
        float f3;
        l.d(normalTrackTimeStamp, "");
        j jVar = this.f130390f;
        float f4 = 0.0f;
        if (jVar == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float width = jVar.f134920a * normalTrackTimeStamp.getWidth();
        j jVar2 = this.f130390f;
        if (jVar2 != null) {
            f2 = jVar2.f134921b;
        } else {
            f2 = 0.0f;
        }
        float height = f2 * normalTrackTimeStamp.getHeight();
        j jVar3 = this.f130390f;
        if (jVar3 != null) {
            f3 = jVar3.f134920a;
        } else {
            f3 = 0.0f;
        }
        float x = (f3 * normalTrackTimeStamp.getX()) - (width / 2.0f);
        j jVar4 = this.f130390f;
        if (jVar4 != null) {
            f4 = jVar4.f134921b;
        }
        float y = (f4 * normalTrackTimeStamp.getY()) - (height / 2.0f);
        return new RectF(x, y, width + x, height + y);
    }

    public a(Context context, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a aVar, InteractStickerStruct interactStickerStruct, j jVar) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(interactStickerStruct, "");
        this.f130387c = context;
        this.f130388d = aVar;
        this.f130389e = interactStickerStruct;
        this.f130390f = jVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public boolean a(long j2, int i2, float f2, float f3) {
        boolean contains;
        List<NormalTrackTimeStamp> a2 = a(j2, this.f130389e);
        if (a2 == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList();
        for (T t : a2) {
            if (t == null) {
                l.b();
            }
            arrayList.add(a((NormalTrackTimeStamp) t));
        }
        int i3 = 0;
        for (RectF rectF : arrayList) {
            if (a2.get(i3) != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = a2.get(i3);
                if (normalTrackTimeStamp == null) {
                    l.b();
                }
                float rotation = normalTrackTimeStamp.getRotation();
                if (Math.abs(rotation) <= 0.0f) {
                    contains = rectF.contains(f2, f3);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    double d2 = (double) (-rotation);
                    float sin = (float) Math.sin(Math.toRadians(d2));
                    float cos = (float) Math.cos(Math.toRadians(d2));
                    float f4 = f2 - centerX;
                    float f5 = f3 - centerY;
                    contains = rectF.contains((centerX + (f4 * cos)) - (f5 * sin), centerY + (f5 * cos) + (f4 * sin));
                }
                if (contains) {
                    return true;
                }
            }
            i3++;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, b bVar) {
        l.d(bVar, "");
        if (!a(j2, i2, f2, f3)) {
            return false;
        }
        a(f2, f3, bVar);
        return true;
    }
}
