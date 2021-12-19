package com.bytedance.lottie.e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.c.b.c;
import java.util.ArrayList;
import java.util.List;

public final class j implements af<c> {

    /* renamed from: a  reason: collision with root package name */
    private int f40676a;

    static {
        Covode.recordClassIndex(24957);
    }

    public j(int i2) {
        this.f40676a = i2;
    }

    private void a(c cVar, List<Float> list) {
        double d2;
        int i2 = this.f40676a * 4;
        if (list.size() > i2) {
            int size = (list.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i3 = 0;
            while (i2 < list.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) list.get(i2).floatValue();
                } else {
                    dArr2[i3] = (double) list.get(i2).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i4 = 0; i4 < cVar.f40503b.length; i4++) {
                int i5 = cVar.f40503b[i4];
                double d3 = (double) cVar.f40502a[i4];
                int i6 = 1;
                while (true) {
                    if (i6 >= size) {
                        d2 = dArr2[size - 1];
                        break;
                    }
                    int i7 = i6 - 1;
                    double d4 = dArr[i7];
                    double d5 = dArr[i6];
                    if (dArr[i6] >= d3) {
                        Double.isNaN(d3);
                        double d6 = dArr2[i7];
                        d2 = d6 + (((d3 - d4) / (d5 - d4)) * (dArr2[i6] - d6));
                        break;
                    }
                    i6++;
                }
                cVar.f40503b[i4] = Color.argb((int) (d2 * 255.0d), Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.e.af
    public final /* synthetic */ c a(JsonReader jsonReader, float f2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f40676a == -1) {
            this.f40676a = arrayList.size() / 4;
        }
        int i2 = this.f40676a;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f40676a * 4; i5++) {
            int i6 = i5 / 4;
            double floatValue = (double) arrayList.get(i5).floatValue();
            int i7 = i5 % 4;
            if (i7 == 0) {
                fArr[i6] = (float) floatValue;
            } else if (i7 == 1) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i7 == 2) {
                Double.isNaN(floatValue);
                i4 = (int) (floatValue * 255.0d);
            } else if (i7 == 3) {
                Double.isNaN(floatValue);
                iArr[i6] = Color.argb(255, i3, i4, (int) (floatValue * 255.0d));
            }
        }
        c cVar = new c(fArr, iArr);
        a(cVar, arrayList);
        return cVar;
    }
}
