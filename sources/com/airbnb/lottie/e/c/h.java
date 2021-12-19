package com.airbnb.lottie.e.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.n;
import com.airbnb.lottie.e;
import com.airbnb.lottie.e.a.k;
import com.airbnb.lottie.e.b;
import com.airbnb.lottie.e.d;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.r;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h extends a {

    /* renamed from: h  reason: collision with root package name */
    private final char[] f5511h = new char[1];

    /* renamed from: i  reason: collision with root package name */
    private final RectF f5512i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f5513j = new Matrix();

    /* renamed from: k  reason: collision with root package name */
    private final Paint f5514k = new Paint() {
        /* class com.airbnb.lottie.e.c.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2296);
        }

        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final Paint f5515l = new Paint() {
        /* class com.airbnb.lottie.e.c.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2297);
        }

        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private final Map<d, List<com.airbnb.lottie.a.a.d>> f5516m = new HashMap();
    private final n n;
    private final g o;
    private final e p;
    private a<Integer, Integer> q;
    private a<Integer, Integer> r;
    private a<Float, Float> s;
    private a<Float, Float> t;

    static {
        Covode.recordClassIndex(2295);
    }

    private void a(RectF rectF) {
        if (d.a.f5625a) {
            rectF.set(0.0f, 0.0f, (float) this.p.f5337h.width(), (float) this.p.f5337h.height());
        }
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        a(rectF);
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(RectF rectF, Matrix matrix) {
        super.b(rectF, matrix);
        a(rectF);
    }

    h(g gVar, d dVar) {
        super(gVar, dVar);
        this.o = gVar;
        this.p = dVar.f5490b;
        n c2 = dVar.p.a();
        this.n = c2;
        c2.a(this);
        a(c2);
        k kVar = dVar.q;
        if (kVar != null) {
            if (kVar.f5351a != null) {
                a<Integer, Integer> a2 = kVar.f5351a.a();
                this.q = a2;
                a2.a(this);
                a(this.q);
            }
            if (kVar.f5352b != null) {
                a<Integer, Integer> a3 = kVar.f5352b.a();
                this.r = a3;
                a3.a(this);
                a(this.r);
            }
            if (kVar.f5353c != null) {
                a<Float, Float> a4 = kVar.f5353c.a();
                this.s = a4;
                a4.a(this);
                a(this.s);
            }
            if (kVar.f5354d != null) {
                a<Float, Float> a5 = kVar.f5354d.a();
                this.t = a5;
                a5.a(this);
                a(this.t);
            }
        }
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.e.f
    public final <T> void a(T t2, c<T> cVar) {
        a<Float, Float> aVar;
        a<Float, Float> aVar2;
        a<Integer, Integer> aVar3;
        a<Integer, Integer> aVar4;
        super.a(t2, cVar);
        if (t2 == com.airbnb.lottie.k.f5735a && (aVar4 = this.q) != null) {
            aVar4.a(cVar);
        } else if (t2 == com.airbnb.lottie.k.f5736b && (aVar3 = this.r) != null) {
            aVar3.a(cVar);
        } else if (t2 == com.airbnb.lottie.k.o && (aVar2 = this.s) != null) {
            aVar2.a(cVar);
        } else if (t2 == com.airbnb.lottie.k.p && (aVar = this.t) != null) {
            aVar.a(cVar);
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private static void a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.e.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        List<com.airbnb.lottie.a.a.d> arrayList;
        canvas.save();
        if (!this.o.h()) {
            if (d.a.f5625a) {
                canvas.concat(matrix);
            } else {
                canvas.setMatrix(matrix);
            }
        }
        b bVar = (b) this.n.f();
        com.airbnb.lottie.e.c cVar = this.p.f5333d.get(bVar.f5364b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        a<Integer, Integer> aVar = this.q;
        if (aVar != null) {
            this.f5514k.setColor(aVar.f().intValue());
        } else {
            this.f5514k.setColor(bVar.f5370h);
        }
        a<Integer, Integer> aVar2 = this.r;
        if (aVar2 != null) {
            this.f5515l.setColor(aVar2.f().intValue());
        } else {
            this.f5515l.setColor(bVar.f5371i);
        }
        int intValue = (this.f5469g.f5294e.f().intValue() * 255) / 100;
        this.f5514k.setAlpha(intValue);
        this.f5515l.setAlpha(intValue);
        a<Float, Float> aVar3 = this.s;
        if (aVar3 != null) {
            this.f5515l.setStrokeWidth(aVar3.f().floatValue());
        } else {
            this.f5515l.setStrokeWidth(((float) bVar.f5372j) * com.airbnb.lottie.i.g.a() * com.airbnb.lottie.i.g.a(matrix));
        }
        if (this.o.h()) {
            float f2 = ((float) bVar.f5365c) / 100.0f;
            float a2 = com.airbnb.lottie.i.g.a(matrix);
            String str = bVar.f5363a;
            for (int i3 = 0; i3 < str.length(); i3++) {
                com.airbnb.lottie.e.d a3 = this.p.f5334e.a(com.airbnb.lottie.e.d.a(str.charAt(i3), cVar.f5459a, cVar.f5461c), null);
                if (a3 != null) {
                    if (this.f5516m.containsKey(a3)) {
                        arrayList = this.f5516m.get(a3);
                    } else {
                        List<com.airbnb.lottie.e.b.n> list = a3.f5519a;
                        int size = list.size();
                        arrayList = new ArrayList<>(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(new com.airbnb.lottie.a.a.d(this.o, this, list.get(i4)));
                        }
                        this.f5516m.put(a3, arrayList);
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        Path e2 = arrayList.get(i5).e();
                        e2.computeBounds(this.f5512i, false);
                        this.f5513j.set(matrix);
                        this.f5513j.preTranslate(0.0f, ((float) (-bVar.f5369g)) * com.airbnb.lottie.i.g.a());
                        this.f5513j.preScale(f2, f2);
                        e2.transform(this.f5513j);
                        if (bVar.f5373k) {
                            a(e2, this.f5514k, canvas);
                            a(e2, this.f5515l, canvas);
                        } else {
                            a(e2, this.f5515l, canvas);
                            a(e2, this.f5514k, canvas);
                        }
                    }
                    float a4 = ((float) a3.f5521c) * f2 * com.airbnb.lottie.i.g.a() * a2;
                    float f3 = ((float) bVar.f5367e) / 10.0f;
                    a<Float, Float> aVar4 = this.t;
                    if (aVar4 != null) {
                        f3 += aVar4.f().floatValue();
                    }
                    canvas.translate(a4 + (f3 * a2), 0.0f);
                }
            }
        } else {
            a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    private void a(b bVar, com.airbnb.lottie.e.c cVar, Matrix matrix, Canvas canvas) {
        int i2;
        float a2 = com.airbnb.lottie.i.g.a(matrix);
        g gVar = this.o;
        T t2 = (T) cVar.f5459a;
        T t3 = (T) cVar.f5461c;
        if (gVar.getCallback() != null) {
            if (gVar.f5562i == null) {
                gVar.f5562i = new com.airbnb.lottie.d.a(gVar.getCallback(), gVar.f5563j);
            }
            com.airbnb.lottie.d.a aVar = gVar.f5562i;
            if (aVar != null) {
                com.airbnb.lottie.e.h<String> hVar = aVar.f5319a;
                hVar.f5529a = t2;
                hVar.f5530b = t3;
                Typeface typeface = aVar.f5320b.get(aVar.f5319a);
                if (typeface == null) {
                    typeface = aVar.f5321c.get(t2);
                    if (typeface == null) {
                        typeface = Typeface.createFromAsset(aVar.f5322d, "fonts/" + ((String) t2) + aVar.f5324f);
                        aVar.f5321c.put(t2, typeface);
                    }
                    boolean contains = t3.contains("Italic");
                    boolean contains2 = t3.contains("Bold");
                    if (contains) {
                        if (contains2) {
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                    } else if (contains2) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (typeface.getStyle() != i2) {
                        typeface = Typeface.create(typeface, i2);
                    }
                    aVar.f5320b.put(aVar.f5319a, typeface);
                    if (typeface == null) {
                        return;
                    }
                }
                String str = bVar.f5363a;
                r rVar = this.o.f5564k;
                if (rVar != null) {
                    if (rVar.f5769b && rVar.f5768a.containsKey(str)) {
                        str = rVar.f5768a.get(str);
                    } else if (rVar.f5769b) {
                        rVar.f5768a.put(str, str);
                    }
                }
                this.f5514k.setTypeface(typeface);
                Paint paint = this.f5514k;
                double d2 = bVar.f5365c;
                double a3 = (double) com.airbnb.lottie.i.g.a();
                Double.isNaN(a3);
                paint.setTextSize((float) (d2 * a3));
                this.f5515l.setTypeface(this.f5514k.getTypeface());
                this.f5515l.setTextSize(this.f5514k.getTextSize());
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    this.f5511h[0] = charAt;
                    if (bVar.f5373k) {
                        a(this.f5511h, this.f5514k, canvas);
                        a(this.f5511h, this.f5515l, canvas);
                    } else {
                        a(this.f5511h, this.f5515l, canvas);
                        a(this.f5511h, this.f5514k, canvas);
                    }
                    char[] cArr = this.f5511h;
                    cArr[0] = charAt;
                    float measureText = this.f5514k.measureText(cArr, 0, 1);
                    float f2 = ((float) bVar.f5367e) / 10.0f;
                    a<Float, Float> aVar2 = this.t;
                    if (aVar2 != null) {
                        f2 += aVar2.f().floatValue();
                    }
                    canvas.translate(measureText + (f2 * a2), 0.0f);
                }
            }
        }
    }
}
