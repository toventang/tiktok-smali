package com.ss.android.ugc.aweme.ftc.components.sticker;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.tools.utils.o;

public final class a implements h<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a>, Cloneable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f97892m = n.b(i.f115645a, 44.0f);
    private static final int n = ((int) n.b(i.f115645a, 12.0f));

    /* renamed from: a  reason: collision with root package name */
    public float f97893a;

    /* renamed from: b  reason: collision with root package name */
    public StickerItemModel f97894b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f97895c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f97896d;

    /* renamed from: e  reason: collision with root package name */
    public RectF f97897e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f97898f;

    /* renamed from: g  reason: collision with root package name */
    public Matrix f97899g;

    /* renamed from: h  reason: collision with root package name */
    public long f97900h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f97901i;

    /* renamed from: j  reason: collision with root package name */
    public PointF[] f97902j;

    /* renamed from: k  reason: collision with root package name */
    public float f97903k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f97904l;
    private final com.ss.android.ugc.aweme.ftc.components.sticker.info.h o;
    private PointF[] p;

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int d() {
        return this.f97894b.uiStartTime;
    }

    public final int hashCode() {
        return this.f97894b.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    static {
        Covode.recordClassIndex(62219);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a c() {
        return new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a(this.f97894b.startTime, this.f97894b.endTime, this.f97894b.rotateAngle, this.f97894b.scale, this.f97894b.currentOffsetX, this.f97894b.currentOffsetY);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int a(int i2) {
        return this.f97894b.startTime;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int b(int i2) {
        return this.f97894b.endTime;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int c(int i2) {
        return this.f97894b.uiEndTime;
    }

    public final void a(float f2) {
        if (f2 != 0.0f) {
            this.f97899g.postRotate(f2, this.f97897e.centerX(), this.f97897e.centerY());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f97894b.equals(((a) obj).f97894b);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.c
    public final void setAlpha(boolean z) {
        if (z) {
            this.o.f98058d.c(this.f97894b.getId(), 1.0f);
        } else {
            this.o.f98058d.c(this.f97894b.getId(), 0.3137255f);
        }
    }

    public final void b(float f2) {
        float f3 = this.f97897e.right;
        float f4 = this.f97897e.left;
        float f5 = this.f97897e.bottom;
        float f6 = this.f97897e.top;
        this.f97903k *= f2;
        this.f97899g.postScale(f2, f2, this.f97897e.centerX(), this.f97897e.centerY());
        o.a(this.f97897e, f2);
        this.f97898f.set(this.f97897e);
        RectF rectF = this.f97898f;
        float f7 = rectF.left;
        int i2 = n;
        rectF.left = f7 - ((float) i2);
        this.f97898f.right += (float) i2;
        this.f97898f.top -= (float) i2;
        this.f97898f.bottom += (float) i2;
    }

    public final PointF[] c(float f2) {
        this.p[0].x = this.f97897e.left;
        this.p[0].y = this.f97897e.top;
        this.p[1].x = this.f97897e.right;
        this.p[1].y = this.f97897e.top;
        this.p[2].x = this.f97897e.right;
        this.p[2].y = this.f97897e.bottom;
        this.p[3].x = this.f97897e.left;
        this.p[3].y = this.f97897e.bottom;
        for (PointF pointF : this.p) {
            o.a(pointF, this.f97897e.centerX(), this.f97897e.centerY(), (float) Math.toRadians((double) this.f97894b.rotateAngle));
        }
        this.p[0].x -= f2;
        this.p[1].x -= f2;
        this.p[2].x -= f2;
        this.p[3].x -= f2;
        return this.p;
    }

    public final void a(float f2, float f3) {
        this.f97899g.postTranslate(f2, f3);
        this.f97897e.offset(f2, f3);
        this.f97898f.offset(f2, f3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a aVar, int i2, int i3) {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a aVar2 = aVar;
        com.ss.android.ugc.aweme.ftc.components.sticker.info.h hVar = this.o;
        hVar.a(this, aVar2.f127093a, aVar2.f127094b);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a b2 = c();
        hVar.a(this, (aVar2.f127097e - b2.f127097e) * ((float) i2), (aVar2.f127098f - b2.f127098f) * ((float) i3));
        hVar.a(this, aVar2.f127095c - b2.f127095c);
        hVar.b(this, aVar2.f127096d / b2.f127096d);
    }
}
