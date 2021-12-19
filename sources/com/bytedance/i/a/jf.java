package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class jf extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31633d;

    /* renamed from: e  reason: collision with root package name */
    Path f31634e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31635f;

    /* renamed from: g  reason: collision with root package name */
    Path f31636g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31637h;

    /* renamed from: i  reason: collision with root package name */
    Path f31638i;

    static {
        Covode.recordClassIndex(18385);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(36.8479f, 69.734f);
        this.f30626c.cubicTo(37.4283f, 70.1479f, 38.0945f, 70.3649f, 38.7759f, 70.3649f);
        this.f30626c.cubicTo(39.1191f, 70.3649f, 39.4674f, 70.3094f, 39.8106f, 70.1983f);
        this.f30626c.cubicTo(58.7271f, 63.9601f, 70.9613f, 49.1216f, 70.9714f, 32.4409f);
        this.f30626c.lineTo(70.9714f, 32.3803f);
        this.f30626c.cubicTo(70.9714f, 15.6593f, 55.28f, 2.0573f, 36.0f, 2.0573f);
        this.f30626c.cubicTo(16.72f, 2.0573f, 1.02856f, 15.6593f, 1.02856f, 32.3803f);
        this.f30626c.cubicTo(1.02856f, 48.9399f, 16.4223f, 62.446f, 35.4549f, 62.6983f);
        this.f30626c.lineTo(35.4549f, 67.0136f);
        this.f30626c.cubicTo(35.4549f, 68.0886f, 35.9748f, 69.1031f, 36.8479f, 69.734f);
        this.f30626c.close();
        this.f30626c.moveTo(38.0239f, 60.0833f);
        this.f30626c.cubicTo(37.7412f, 59.8108f, 37.3627f, 59.6543f, 36.969f, 59.6543f);
        this.f30626c.cubicTo(36.9589f, 59.6543f, 36.9438f, 59.6543f, 36.9337f, 59.6493f);
        this.f30626c.lineTo(36.6511f, 59.6594f);
        this.f30626c.cubicTo(36.434f, 59.6695f, 36.217f, 59.6745f, 36.0f, 59.6745f);
        this.f30626c.cubicTo(18.3856f, 59.6745f, 4.05683f, 47.4302f, 4.05683f, 32.3797f);
        this.f30626c.cubicTo(4.05683f, 17.3293f, 18.3856f, 5.08498f, 36.0f, 5.08498f);
        this.f30626c.cubicTo(53.6043f, 5.08498f, 67.9331f, 17.3192f, 67.9432f, 32.3697f);
        this.f30626c.lineTo(67.9432f, 32.405f);
        this.f30626c.cubicTo(67.9331f, 47.7936f, 56.5165f, 61.5016f, 38.8617f, 67.3259f);
        this.f30626c.cubicTo(38.781f, 67.3512f, 38.7002f, 67.336f, 38.6245f, 67.2805f);
        this.f30626c.cubicTo(38.5791f, 67.2502f, 38.4832f, 67.1644f, 38.4832f, 67.013f);
        this.f30626c.lineTo(38.4832f, 61.1685f);
        this.f30626c.cubicTo(38.4832f, 60.7597f, 38.3166f, 60.366f, 38.0239f, 60.0833f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-16777216);
        this.f31633d = new Paint();
        Path path = new Path();
        this.f31634e = path;
        path.moveTo(35.9998f, 30.4867f);
        this.f31634e.cubicTo(34.0769f, 30.4867f, 32.5173f, 32.0513f, 32.5173f, 33.9692f);
        this.f31634e.cubicTo(32.5173f, 35.8871f, 34.0819f, 37.4517f, 35.9998f, 37.4517f);
        this.f31634e.cubicTo(37.9177f, 37.4517f, 39.4823f, 35.8871f, 39.4823f, 33.9692f);
        this.f31634e.cubicTo(39.4823f, 32.0513f, 37.9228f, 30.4867f, 35.9998f, 30.4867f);
        this.f31634e.close();
        this.f31634e.setFillType(Path.FillType.WINDING);
        this.f31633d.setStyle(Paint.Style.FILL);
        this.f31633d.setColor(-16777216);
        this.f30624a.add(this.f31633d);
        this.f31635f = new Paint();
        Path path2 = new Path();
        this.f31636g = path2;
        path2.moveTo(19.7988f, 30.6541f);
        this.f31636g.cubicTo(17.8758f, 30.6541f, 16.3163f, 32.2187f, 16.3163f, 34.1366f);
        this.f31636g.cubicTo(16.3163f, 36.0545f, 17.8809f, 37.6191f, 19.7988f, 37.6191f);
        this.f31636g.cubicTo(21.7167f, 37.6191f, 23.2813f, 36.0545f, 23.2813f, 34.1366f);
        this.f31636g.cubicTo(23.2813f, 32.2187f, 21.7217f, 30.6541f, 19.7988f, 30.6541f);
        this.f31636g.close();
        this.f31636g.setFillType(Path.FillType.WINDING);
        this.f31635f.setStyle(Paint.Style.FILL);
        this.f31635f.setColor(-16777216);
        this.f30624a.add(this.f31635f);
        this.f31637h = new Paint();
        Path path3 = new Path();
        this.f31638i = path3;
        path3.moveTo(52.0752f, 30.4867f);
        this.f31638i.cubicTo(50.1522f, 30.4867f, 48.5927f, 32.0513f, 48.5927f, 33.9692f);
        this.f31638i.cubicTo(48.5927f, 35.8871f, 50.1573f, 37.4517f, 52.0752f, 37.4517f);
        this.f31638i.cubicTo(53.9931f, 37.4517f, 55.5577f, 35.8871f, 55.5577f, 33.9692f);
        this.f31638i.cubicTo(55.5577f, 32.0513f, 53.9931f, 30.4867f, 52.0752f, 30.4867f);
        this.f31638i.close();
        this.f31638i.setFillType(Path.FillType.WINDING);
        this.f31637h.setStyle(Paint.Style.FILL);
        this.f31637h.setColor(-16777216);
        this.f30624a.add(this.f31637h);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 72.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31634e, this.f31633d);
        canvas.drawPath(this.f31636g, this.f31635f);
        canvas.drawPath(this.f31638i, this.f31637h);
    }
}
