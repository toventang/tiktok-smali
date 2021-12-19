package com.bytedance.i.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.h.a;

public class gj extends a {

    /* renamed from: d  reason: collision with root package name */
    Paint f31545d;

    /* renamed from: e  reason: collision with root package name */
    Path f31546e;

    /* renamed from: f  reason: collision with root package name */
    Paint f31547f;

    /* renamed from: g  reason: collision with root package name */
    Path f31548g;

    /* renamed from: h  reason: collision with root package name */
    Paint f31549h;

    /* renamed from: i  reason: collision with root package name */
    Path f31550i;

    /* renamed from: j  reason: collision with root package name */
    Paint f31551j;

    /* renamed from: k  reason: collision with root package name */
    Path f31552k;

    static {
        Covode.recordClassIndex(18308);
    }

    @Override // com.bytedance.h.a
    public final void a() {
        this.f30626c.moveTo(24.0f, 48.0f);
        this.f30626c.cubicTo(37.2548f, 48.0f, 48.0f, 37.2548f, 48.0f, 24.0f);
        this.f30626c.cubicTo(48.0f, 10.7452f, 37.2548f, 0.0f, 24.0f, 0.0f);
        this.f30626c.cubicTo(10.7452f, 0.0f, 0.0f, 10.7452f, 0.0f, 24.0f);
        this.f30626c.cubicTo(0.0f, 37.2548f, 10.7452f, 48.0f, 24.0f, 48.0f);
        this.f30626c.close();
        this.f30626c.setFillType(Path.FillType.EVEN_ODD);
        this.f30625b.setStyle(Paint.Style.FILL);
        this.f30625b.setColor(-526345);
        this.f31545d = new Paint();
        Path path = new Path();
        this.f31546e = path;
        path.moveTo(20.6257f, 11.35f);
        this.f31546e.cubicTo(19.2272f, 11.351f, 18.0953f, 12.4837f, 18.0963f, 13.8795f);
        this.f31546e.cubicTo(18.0953f, 15.2752f, 19.2282f, 16.4079f, 20.6268f, 16.409f);
        this.f31546e.lineTo(23.1572f, 16.409f);
        this.f31546e.lineTo(23.1572f, 13.8805f);
        this.f31546e.cubicTo(23.1582f, 12.4848f, 22.0253f, 11.3521f, 20.6257f, 11.35f);
        this.f31546e.cubicTo(20.6268f, 11.35f, 20.6268f, 11.35f, 20.6257f, 11.35f);
        this.f31546e.lineTo(20.6257f, 11.35f);
        this.f31546e.close();
        this.f31546e.moveTo(20.6257f, 18.0967f);
        this.f31546e.lineTo(13.88f, 18.0967f);
        this.f31546e.cubicTo(12.4815f, 18.0977f, 11.3486f, 19.2304f, 11.3496f, 20.6262f);
        this.f31546e.cubicTo(11.3475f, 22.0219f, 12.4804f, 23.1546f, 13.879f, 23.1567f);
        this.f31546e.lineTo(20.6257f, 23.1567f);
        this.f31546e.cubicTo(22.0243f, 23.1556f, 23.1572f, 22.0229f, 23.1561f, 20.6272f);
        this.f31546e.cubicTo(23.1572f, 19.2304f, 22.0243f, 18.0977f, 20.6257f, 18.0967f);
        this.f31546e.close();
        this.f31546e.setFillType(Path.FillType.EVEN_ODD);
        this.f31545d.setStyle(Paint.Style.FILL);
        this.f31545d.setColor(-13187600);
        this.f30624a.add(this.f31545d);
        this.f31547f = new Paint();
        Path path2 = new Path();
        this.f31548g = path2;
        path2.moveTo(36.6499f, 20.6262f);
        this.f31548g.cubicTo(36.6509f, 19.2304f, 35.518f, 18.0977f, 34.1194f, 18.0967f);
        this.f31548g.cubicTo(32.7209f, 18.0977f, 31.588f, 19.2304f, 31.589f, 20.6262f);
        this.f31548g.lineTo(31.589f, 23.1567f);
        this.f31548g.lineTo(34.1194f, 23.1567f);
        this.f31548g.cubicTo(35.518f, 23.1556f, 36.6509f, 22.0229f, 36.6499f, 20.6262f);
        this.f31548g.close();
        this.f31548g.moveTo(29.9031f, 20.6262f);
        this.f31548g.lineTo(29.9031f, 13.8795f);
        this.f31548g.cubicTo(29.9041f, 12.4848f, 28.7722f, 11.3521f, 27.3737f, 11.35f);
        this.f31548g.cubicTo(25.9751f, 11.351f, 24.8422f, 12.4837f, 24.8433f, 13.8795f);
        this.f31548g.lineTo(24.8433f, 20.6262f);
        this.f31548g.cubicTo(24.8412f, 22.0219f, 25.9741f, 23.1546f, 27.3727f, 23.1567f);
        this.f31548g.cubicTo(28.7712f, 23.1556f, 29.9041f, 22.0229f, 29.9031f, 20.6262f);
        this.f31548g.close();
        this.f31548g.setFillType(Path.FillType.EVEN_ODD);
        this.f31547f.setStyle(Paint.Style.FILL);
        this.f31547f.setColor(-13715843);
        this.f30624a.add(this.f31547f);
        this.f31549h = new Paint();
        Path path3 = new Path();
        this.f31550i = path3;
        path3.moveTo(27.3727f, 36.65f);
        this.f31550i.cubicTo(28.7713f, 36.649f, 29.9042f, 35.5163f, 29.9031f, 34.1205f);
        this.f31550i.cubicTo(29.9042f, 32.7248f, 28.7713f, 31.5921f, 27.3727f, 31.5911f);
        this.f31550i.lineTo(24.8423f, 31.5911f);
        this.f31550i.lineTo(24.8423f, 34.1205f);
        this.f31550i.cubicTo(24.8413f, 35.5153f, 25.9742f, 36.648f, 27.3727f, 36.65f);
        this.f31550i.close();
        this.f31550i.moveTo(27.3727f, 29.9023f);
        this.f31550i.lineTo(34.1195f, 29.9023f);
        this.f31550i.cubicTo(35.518f, 29.9013f, 36.6509f, 28.7686f, 36.6499f, 27.3728f);
        this.f31550i.cubicTo(36.652f, 25.9771f, 35.5191f, 24.8444f, 34.1205f, 24.8423f);
        this.f31550i.lineTo(27.3737f, 24.8423f);
        this.f31550i.cubicTo(25.9752f, 24.8434f, 24.8423f, 25.9761f, 24.8433f, 27.3718f);
        this.f31550i.cubicTo(24.8423f, 28.7686f, 25.9742f, 29.9013f, 27.3727f, 29.9023f);
        this.f31550i.close();
        this.f31550i.setFillType(Path.FillType.EVEN_ODD);
        this.f31549h.setStyle(Paint.Style.FILL);
        this.f31549h.setColor(-1265106);
        this.f30624a.add(this.f31549h);
        this.f31551j = new Paint();
        Path path4 = new Path();
        this.f31552k = path4;
        path4.moveTo(11.3499f, 27.3728f);
        this.f31552k.cubicTo(11.3488f, 28.7685f, 12.4817f, 29.9012f, 13.8803f, 29.9023f);
        this.f31552k.cubicTo(15.2788f, 29.9012f, 16.4117f, 28.7685f, 16.4107f, 27.3728f);
        this.f31552k.lineTo(16.4107f, 24.8433f);
        this.f31552k.lineTo(13.8803f, 24.8433f);
        this.f31552k.cubicTo(12.4817f, 24.8443f, 11.3488f, 25.977f, 11.3499f, 27.3728f);
        this.f31552k.close();
        this.f31552k.moveTo(18.0966f, 27.3728f);
        this.f31552k.lineTo(18.0966f, 34.1195f);
        this.f31552k.cubicTo(18.0945f, 35.5152f, 19.2274f, 36.6479f, 20.626f, 36.65f);
        this.f31552k.cubicTo(22.0245f, 36.649f, 23.1574f, 35.5163f, 23.1564f, 34.1205f);
        this.f31552k.lineTo(23.1564f, 27.3748f);
        this.f31552k.cubicTo(23.1585f, 25.9791f, 22.0256f, 24.8464f, 20.627f, 24.8443f);
        this.f31552k.cubicTo(19.2274f, 24.8443f, 18.0956f, 25.977f, 18.0966f, 27.3728f);
        this.f31552k.cubicTo(18.0966f, 27.3728f, 18.0966f, 27.3738f, 18.0966f, 27.3728f);
        this.f31552k.close();
        this.f31552k.setFillType(Path.FillType.EVEN_ODD);
        this.f31551j.setStyle(Paint.Style.FILL);
        this.f31551j.setColor(-2089382);
        this.f30624a.add(this.f31551j);
    }

    @Override // com.bytedance.h.a
    public final void a(Canvas canvas) {
        a(canvas, 48.0f);
        canvas.drawPath(this.f30626c, this.f30625b);
        canvas.drawPath(this.f31546e, this.f31545d);
        canvas.drawPath(this.f31548g, this.f31547f);
        canvas.drawPath(this.f31550i, this.f31549h);
        canvas.drawPath(this.f31552k, this.f31551j);
    }
}
