package com.bytedance.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.c;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.n;
import com.bytedance.lottie.c.a.k;
import com.bytedance.lottie.c.b;
import com.bytedance.lottie.c.d;
import com.bytedance.lottie.g;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import com.bytedance.lottie.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h extends a {

    /* renamed from: g  reason: collision with root package name */
    private final char[] f40635g = new char[1];

    /* renamed from: h  reason: collision with root package name */
    private final RectF f40636h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f40637i = new Matrix();

    /* renamed from: j  reason: collision with root package name */
    private final Paint f40638j = new Paint() {
        /* class com.bytedance.lottie.c.c.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(24927);
        }

        {
            setStyle(Paint.Style.FILL);
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private final Paint f40639k = new Paint() {
        /* class com.bytedance.lottie.c.c.h.AnonymousClass2 */

        static {
            Covode.recordClassIndex(24928);
        }

        {
            setStyle(Paint.Style.STROKE);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final Map<d, List<c>> f40640l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final n f40641m;
    private final i n;
    private final g o;
    private a<Integer, Integer> p;
    private a<Integer, Integer> q;
    private a<Float, Float> r;
    private a<Float, Float> s;

    static {
        Covode.recordClassIndex(24926);
    }

    @Override // com.bytedance.lottie.c.f, com.bytedance.lottie.c.c.a
    public final <T> void a(T t, com.bytedance.lottie.g.c<T> cVar) {
        a<Float, Float> aVar;
        a<Float, Float> aVar2;
        a<Integer, Integer> aVar3;
        a<Integer, Integer> aVar4;
        super.a(t, cVar);
        if (t == m.f40802a && (aVar4 = this.p) != null) {
            aVar4.a(cVar);
        } else if (t == m.f40803b && (aVar3 = this.q) != null) {
            aVar3.a(cVar);
        } else if (t == m.f40812k && (aVar2 = this.r) != null) {
            aVar2.a(cVar);
        } else if (t == m.f40813l && (aVar = this.s) != null) {
            aVar.a(cVar);
        }
    }

    h(i iVar, d dVar) {
        super(iVar, dVar);
        this.n = iVar;
        this.o = dVar.f40614b;
        n b2 = dVar.q.a();
        this.f40641m = b2;
        b2.a(this);
        a(b2);
        k kVar = dVar.r;
        if (kVar != null) {
            if (kVar.f40475a != null) {
                a<Integer, Integer> a2 = kVar.f40475a.a();
                this.p = a2;
                a2.a(this);
                a(this.p);
            }
            if (kVar.f40476b != null) {
                a<Integer, Integer> a3 = kVar.f40476b.a();
                this.q = a3;
                a3.a(this);
                a(this.q);
            }
            if (kVar.f40477c != null) {
                a<Float, Float> a4 = kVar.f40477c.a();
                this.r = a4;
                a4.a(this);
                a(this.r);
            }
            if (kVar.f40478d != null) {
                a<Float, Float> a5 = kVar.f40478d.a();
                this.s = a5;
                a5.a(this);
                a(this.s);
            }
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
    @Override // com.bytedance.lottie.c.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        List<c> arrayList;
        canvas.save();
        if (!this.n.f()) {
            canvas.setMatrix(matrix);
        }
        b bVar = (b) this.f40641m.d();
        com.bytedance.lottie.c.c cVar = this.o.f40708d.get(bVar.f40488b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        a<Integer, Integer> aVar = this.p;
        if (aVar != null) {
            this.f40638j.setColor(aVar.d().intValue());
        } else {
            this.f40638j.setColor(bVar.f40494h);
        }
        a<Integer, Integer> aVar2 = this.q;
        if (aVar2 != null) {
            this.f40639k.setColor(aVar2.d().intValue());
        } else {
            this.f40639k.setColor(bVar.f40495i);
        }
        int intValue = (this.f40592f.f40450e.d().intValue() * 255) / 100;
        this.f40638j.setAlpha(intValue);
        this.f40639k.setAlpha(intValue);
        a<Float, Float> aVar3 = this.r;
        if (aVar3 != null) {
            this.f40639k.setStrokeWidth(aVar3.d().floatValue());
        } else {
            float a2 = com.bytedance.lottie.f.h.a(matrix);
            Paint paint = this.f40639k;
            double d2 = bVar.f40496j;
            double a3 = (double) com.bytedance.lottie.f.h.a();
            Double.isNaN(a3);
            double d3 = d2 * a3;
            double d4 = (double) a2;
            Double.isNaN(d4);
            paint.setStrokeWidth((float) (d3 * d4));
        }
        if (this.n.f()) {
            float f2 = ((float) bVar.f40489c) / 100.0f;
            float a4 = com.bytedance.lottie.f.h.a(matrix);
            String str = bVar.f40487a;
            for (int i3 = 0; i3 < str.length(); i3++) {
                d a5 = this.o.f40709e.a(d.a(str.charAt(i3), cVar.f40583a, cVar.f40585c), null);
                if (a5 != null) {
                    if (this.f40640l.containsKey(a5)) {
                        arrayList = this.f40640l.get(a5);
                    } else {
                        List<com.bytedance.lottie.c.b.n> list = a5.f40644a;
                        int size = list.size();
                        arrayList = new ArrayList<>(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(new c(this.n, this, list.get(i4)));
                        }
                        this.f40640l.put(a5, arrayList);
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        Path e2 = arrayList.get(i5).e();
                        e2.computeBounds(this.f40636h, false);
                        this.f40637i.set(matrix);
                        this.f40637i.preTranslate(0.0f, ((float) (-bVar.f40493g)) * com.bytedance.lottie.f.h.a());
                        this.f40637i.preScale(f2, f2);
                        e2.transform(this.f40637i);
                        if (bVar.f40497k) {
                            a(e2, this.f40638j, canvas);
                            a(e2, this.f40639k, canvas);
                        } else {
                            a(e2, this.f40639k, canvas);
                            a(e2, this.f40638j, canvas);
                        }
                    }
                    float a6 = ((float) a5.f40646c) * f2 * com.bytedance.lottie.f.h.a() * a4;
                    float f3 = ((float) bVar.f40491e) / 10.0f;
                    a<Float, Float> aVar4 = this.s;
                    if (aVar4 != null) {
                        f3 += aVar4.d().floatValue();
                    }
                    canvas.translate(a6 + (f3 * a4), 0.0f);
                }
            }
        } else {
            a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    private void a(b bVar, com.bytedance.lottie.c.c cVar, Matrix matrix, Canvas canvas) {
        int i2;
        float a2 = com.bytedance.lottie.f.h.a(matrix);
        i iVar = this.n;
        T t = (T) cVar.f40583a;
        T t2 = (T) cVar.f40585c;
        Typeface typeface = null;
        if (iVar.getCallback() != null) {
            if (iVar.f40770h == null) {
                iVar.f40770h = new com.bytedance.lottie.b.a(iVar.getCallback(), iVar.f40771i);
            }
            com.bytedance.lottie.b.a aVar = iVar.f40770h;
            if (aVar != null) {
                com.bytedance.lottie.c.h<String> hVar = aVar.f40455a;
                hVar.f40654a = t;
                hVar.f40655b = t2;
                Typeface typeface2 = aVar.f40456b.get(aVar.f40455a);
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    Typeface a3 = aVar.a(t);
                    if (a3 != null) {
                        boolean contains = t2.contains("Italic");
                        boolean contains2 = t2.contains("Bold");
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
                        if (a3.getStyle() == i2) {
                            typeface = a3;
                        } else {
                            typeface = Typeface.create(a3, i2);
                        }
                    }
                    aVar.f40456b.put(aVar.f40455a, typeface);
                    if (typeface == null) {
                        return;
                    }
                }
                String str = bVar.f40487a;
                t tVar = this.n.f40772j;
                if (tVar != null) {
                    if (tVar.f40838b && tVar.f40837a.containsKey(str)) {
                        str = tVar.f40837a.get(str);
                    } else if (tVar.f40838b) {
                        tVar.f40837a.put(str, str);
                    }
                }
                this.f40638j.setTypeface(typeface);
                Paint paint = this.f40638j;
                double d2 = bVar.f40489c;
                double a4 = (double) com.bytedance.lottie.f.h.a();
                Double.isNaN(a4);
                paint.setTextSize((float) (d2 * a4));
                this.f40639k.setTypeface(this.f40638j.getTypeface());
                this.f40639k.setTextSize(this.f40638j.getTextSize());
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    this.f40635g[0] = charAt;
                    if (bVar.f40497k) {
                        a(this.f40635g, this.f40638j, canvas);
                        a(this.f40635g, this.f40639k, canvas);
                    } else {
                        a(this.f40635g, this.f40639k, canvas);
                        a(this.f40635g, this.f40638j, canvas);
                    }
                    char[] cArr = this.f40635g;
                    cArr[0] = charAt;
                    float measureText = this.f40638j.measureText(cArr, 0, 1);
                    float f2 = ((float) bVar.f40491e) / 10.0f;
                    a<Float, Float> aVar2 = this.s;
                    if (aVar2 != null) {
                        f2 += aVar2.d().floatValue();
                    }
                    canvas.translate(measureText + (f2 * a2), 0.0f);
                }
            }
        }
    }
}
