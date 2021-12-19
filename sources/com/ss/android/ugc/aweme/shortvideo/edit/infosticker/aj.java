package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a;
import com.ss.android.ugc.tools.utils.o;
import com.zhiliaoapp.musically.R;

public final class aj implements h<a>, Cloneable {
    private static final float n = n.b(i.f115645a, 44.0f);
    private static final int o = ((int) n.b(i.f115645a, 12.0f));

    /* renamed from: a  reason: collision with root package name */
    public float f127112a = 0.15f;

    /* renamed from: b  reason: collision with root package name */
    public float f127113b = 3.0f;

    /* renamed from: c  reason: collision with root package name */
    public StickerItemModel f127114c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f127115d;

    /* renamed from: e  reason: collision with root package name */
    Paint f127116e = new Paint();

    /* renamed from: f  reason: collision with root package name */
    public RectF f127117f;

    /* renamed from: g  reason: collision with root package name */
    public RectF f127118g;

    /* renamed from: h  reason: collision with root package name */
    public Matrix f127119h;

    /* renamed from: i  reason: collision with root package name */
    public long f127120i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f127121j = true;

    /* renamed from: k  reason: collision with root package name */
    PointF[] f127122k = new PointF[4];

    /* renamed from: l  reason: collision with root package name */
    public float f127123l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f127124m = false;
    private final c p;
    private PointF[] q = {new PointF(), new PointF(), new PointF(), new PointF()};

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int d() {
        return this.f127114c.uiStartTime;
    }

    public final int hashCode() {
        return this.f127114c.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public aj clone() {
        try {
            return (aj) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    static {
        Covode.recordClassIndex(83393);
    }

    private void b() {
        int i2 = 0;
        do {
            this.f127122k[i2] = new PointF();
            i2++;
        } while (i2 < 4);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public a c() {
        return new a(this.f127114c.startTime, this.f127114c.endTime, this.f127114c.rotateAngle, this.f127114c.scale, this.f127114c.currentOffsetX, this.f127114c.currentOffsetY);
    }

    private void a() {
        RectF rectF = this.f127118g;
        float f2 = rectF.left;
        int i2 = o;
        rectF.left = f2 - ((float) i2);
        this.f127118g.right += (float) i2;
        this.f127118g.top -= (float) i2;
        this.f127118g.bottom += (float) i2;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int a(int i2) {
        return this.f127114c.startTime;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int b(int i2) {
        return this.f127114c.endTime;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final int c(int i2) {
        return this.f127114c.uiEndTime;
    }

    public final void a(float f2) {
        if (f2 != 0.0f) {
            this.f127119h.postRotate(f2, this.f127117f.centerX(), this.f127117f.centerY());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        return this.f127114c.equals(((aj) obj).f127114c);
    }

    public final void b(float f2) {
        float f3 = this.f127117f.right;
        float f4 = this.f127117f.left;
        float f5 = this.f127117f.bottom;
        float f6 = this.f127117f.top;
        this.f127123l *= f2;
        this.f127119h.postScale(f2, f2, this.f127117f.centerX(), this.f127117f.centerY());
        o.a(this.f127117f, f2);
        this.f127118g.set(this.f127117f);
        a();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.c
    public final void setAlpha(boolean z) {
        if (z) {
            this.p.f127135e.c(this.f127114c.getId(), 1.0f);
        } else {
            this.p.f127135e.c(this.f127114c.getId(), 0.3137255f);
        }
    }

    public final PointF[] c(float f2) {
        this.q[0].x = this.f127117f.left;
        this.q[0].y = this.f127117f.top;
        this.q[1].x = this.f127117f.right;
        this.q[1].y = this.f127117f.top;
        this.q[2].x = this.f127117f.right;
        this.q[2].y = this.f127117f.bottom;
        this.q[3].x = this.f127117f.left;
        this.q[3].y = this.f127117f.bottom;
        for (PointF pointF : this.q) {
            o.a(pointF, this.f127117f.centerX(), this.f127117f.centerY(), (float) Math.toRadians((double) this.f127114c.rotateAngle));
        }
        this.q[0].x -= f2;
        this.q[1].x -= f2;
        this.q[2].x -= f2;
        this.q[3].x -= f2;
        return this.q;
    }

    public final void a(float f2, float f3) {
        this.f127119h.postTranslate(f2, f3);
        this.f127117f.offset(f2, f3);
        this.f127118g.offset(f2, f3);
    }

    public aj(Context context, StickerItemModel stickerItemModel, c cVar) {
        this.f127114c = stickerItemModel;
        this.p = cVar;
        this.f127116e.setColor(b.c(context, R.color.f159928l));
        this.f127116e.setStyle(Paint.Style.STROKE);
        this.f127116e.setAntiAlias(true);
        this.f127116e.setStrokeWidth(2.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.h
    public final /* synthetic */ void a(a aVar, int i2, int i3) {
        a aVar2 = aVar;
        c cVar = this.p;
        cVar.a(this, aVar2.f127093a, aVar2.f127094b);
        a f2 = c();
        cVar.a(this, (aVar2.f127097e - f2.f127097e) * ((float) i2), (aVar2.f127098f - f2.f127098f) * ((float) i3));
        cVar.a(this, aVar2.f127095c - f2.f127095c);
        cVar.b(this, aVar2.f127096d / f2.f127096d);
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        float f2 = (float) i2;
        float f3 = ((f2 * 0.5f) - (this.f127114c.initWidth / 2.0f)) + ((float) i4);
        float f4 = ((((float) i3) * 0.5f) - (this.f127114c.initHeight / 2.0f)) + ((float) i5);
        this.f127117f = new RectF(f3, f4, this.f127114c.initWidth + f3, this.f127114c.initHeight + f4);
        this.f127119h = new Matrix();
        float f5 = n;
        this.f127112a = Math.max(f5 / this.f127114c.initWidth, f5 / this.f127114c.initHeight);
        if (this.f127114c.isMagnifier()) {
            this.f127112a = Math.max(f5 / this.f127114c.initWidth, f5 / this.f127114c.initHeight);
            this.f127113b = f2 / this.f127114c.initWidth;
        } else {
            this.f127112a = Math.max(f5 / this.f127114c.initWidth, f5 / this.f127114c.initHeight);
        }
        this.f127118g = new RectF(this.f127117f);
        a();
        b();
        return true;
    }
}
