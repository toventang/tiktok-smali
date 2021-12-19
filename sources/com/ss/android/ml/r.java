package com.ss.android.ml;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ml.process.c;
import com.ss.android.ml.process.d;
import com.ss.android.ml.process.e;
import com.ss.android.ml.process.f;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class r implements l {

    /* renamed from: a  reason: collision with root package name */
    private MLConfigModel f59913a;

    /* renamed from: b  reason: collision with root package name */
    private MappedByteBuffer f59914b;

    /* renamed from: c  reason: collision with root package name */
    private float[][] f59915c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f59916d;

    /* renamed from: e  reason: collision with root package name */
    private int f59917e = -1;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Float> f59918f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f59919g = false;

    /* renamed from: h  reason: collision with root package name */
    private o f59920h;

    /* renamed from: i  reason: collision with root package name */
    private String f59921i = "ml#evaluator";

    static {
        Covode.recordClassIndex(37034);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer, float[][] fArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel);

    @Override // com.ss.android.ml.l
    public final void a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) {
        this.f59913a = mLConfigModel;
        FileChannel channel = fileInputStream.getChannel();
        this.f59914b = channel.map(FileChannel.MapMode.READ_ONLY, channel.position(), channel.size());
        int size = (mLConfigModel.output == null || mLConfigModel.output.labels == null) ? 1 : mLConfigModel.output.labels.size();
        if (size == 2) {
            size = 1;
        }
        int[] iArr = new int[2];
        iArr[1] = size;
        iArr[0] = 1;
        this.f59915c = (float[][]) Array.newInstance(float.class, iArr);
        this.f59919g = a(this.f59914b, mLConfigModel);
    }

    @Override // com.ss.android.ml.l
    public final boolean a() {
        return this.f59919g;
    }

    @Override // com.ss.android.ml.l
    public final void a(o oVar) {
        this.f59920h = oVar;
    }

    @Override // com.ss.android.ml.l
    public final void a(String str) {
        this.f59921i = str;
    }

    private void b(List<String> list, HashMap<String, Object> hashMap) {
        float f2;
        this.f59918f.clear();
        for (String str : list) {
            Object a2 = e.a(hashMap, str);
            int i2 = 0;
            float f3 = 0.0f;
            if (a2 instanceof Number[]) {
                Number[] numberArr = (Number[]) a2;
                while (i2 < numberArr.length) {
                    ArrayList<Float> arrayList = this.f59918f;
                    if (numberArr[i2] != null) {
                        f2 = numberArr[i2].floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    arrayList.add(Float.valueOf(f2));
                    i2++;
                }
                if (t.f59923a) {
                    Arrays.toString(numberArr);
                }
            } else if (a2 instanceof float[]) {
                float[] fArr = (float[]) a2;
                while (i2 < fArr.length) {
                    this.f59918f.add(Float.valueOf(fArr[i2]));
                    i2++;
                }
                if (t.f59923a) {
                    Arrays.toString(fArr);
                }
            } else if (a2 instanceof Number) {
                Number number = (Number) a2;
                ArrayList<Float> arrayList2 = this.f59918f;
                if (number != null) {
                    f3 = number.floatValue();
                }
                arrayList2.add(Float.valueOf(f3));
                if (t.f59923a && number != null) {
                    number.floatValue();
                }
            } else {
                this.f59918f.add(Float.valueOf(0.0f));
            }
        }
        int size = this.f59918f.size() * 4;
        if (this.f59916d == null || size != this.f59917e) {
            this.f59917e = size;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size);
            this.f59916d = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        if (t.f59923a) {
            this.f59918f.size();
        }
        this.f59916d.clear();
        Iterator<Float> it = this.f59918f.iterator();
        while (it.hasNext()) {
            this.f59916d.putFloat(it.next().floatValue());
        }
    }

    private void a(List<? extends c> list, HashMap<String, Object> hashMap) {
        if (!(list == null || list.isEmpty())) {
            o oVar = this.f59920h;
            if (oVar != null && oVar.f59888a) {
                oVar.f59899l.f59901a = System.currentTimeMillis();
            }
            for (c cVar : list) {
                d dVar = new d(hashMap, cVar);
                String operator = cVar.getOperator();
                e a2 = f.f59909a.a(operator);
                if (a2 != null) {
                    try {
                        a2.a(dVar);
                    } catch (Throwable th) {
                        t.a(th);
                    }
                } else {
                    throw new RuntimeException(operator + " don't support now");
                }
            }
            o oVar2 = this.f59920h;
            if (oVar2 != null && oVar2.f59888a) {
                oVar2.f59899l.f59902b = System.currentTimeMillis();
            }
        }
    }

    private static void a(a aVar, Map<String, Float> map, float[][] fArr) {
        if (map != null && aVar.getLabels() != null && !aVar.getLabels().isEmpty()) {
            List<String> labels = aVar.getLabels();
            int size = labels.size();
            if (size == 2) {
                map.put(labels.get(0), Float.valueOf(1.0f - fArr[0][0]));
                map.put(labels.get(1), Float.valueOf(fArr[0][0]));
            } else if (size == fArr[0].length) {
                int i2 = 0;
                for (String str : labels) {
                    map.put(str, Float.valueOf(fArr[0][i2]));
                    i2++;
                }
            }
        }
    }

    private void a(a aVar, float[] fArr, List<String> list) {
        if (aVar != null) {
            o oVar = this.f59920h;
            if (oVar != null) {
                oVar.e();
            }
            d dVar = new d(fArr, list, aVar);
            String operator = aVar.getOperator();
            e a2 = f.f59909a.a(operator);
            if (a2 != null) {
                try {
                    a2.a(dVar);
                } catch (Throwable th) {
                    t.a(th);
                }
                o oVar2 = this.f59920h;
                if (oVar2 != null) {
                    oVar2.f();
                    return;
                }
                return;
            }
            throw new RuntimeException(operator + " don't support now");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    @Override // com.ss.android.ml.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(java.util.Map<java.lang.String, java.lang.Object> r6, java.util.List<? extends com.ss.android.ml.process.c> r7, com.ss.android.ml.process.a r8, java.util.List<java.lang.String> r9) {
        /*
            r5 = this;
            com.ss.android.ml.o r0 = r5.f59920h
            if (r0 == 0) goto L_0x0007
            r0.b()
        L_0x0007:
            r3 = 1
            r2 = 0
            r4 = 0
            float[][] r0 = r5.f59915c     // Catch:{ all -> 0x004e }
            r0 = r0[r4]     // Catch:{ all -> 0x004e }
            r0[r4] = r2     // Catch:{ all -> 0x004e }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x004e }
            r0.<init>(r6)     // Catch:{ all -> 0x004e }
            r5.a(r7, r0)     // Catch:{ all -> 0x004e }
            r5.b(r9, r0)     // Catch:{ all -> 0x004e }
            com.ss.android.ml.o r0 = r5.f59920h     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0022
            r0.c()     // Catch:{ all -> 0x004e }
        L_0x0022:
            java.nio.ByteBuffer r1 = r5.f59916d     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x002b
            float[][] r0 = r5.f59915c     // Catch:{ all -> 0x004e }
            r5.a(r1, r0)     // Catch:{ all -> 0x004e }
        L_0x002b:
            com.ss.android.ml.o r0 = r5.f59920h     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0032
            r0.d()     // Catch:{ all -> 0x004e }
        L_0x0032:
            float[][] r0 = r5.f59915c     // Catch:{ all -> 0x004e }
            r1 = r0[r4]     // Catch:{ all -> 0x004e }
            r0 = 0
            r5.a(r8, r1, r0)     // Catch:{ all -> 0x004e }
            float[][] r1 = r5.f59915c     // Catch:{ all -> 0x004c }
            r0 = r1[r4]     // Catch:{ all -> 0x004c }
            r2 = r0[r4]     // Catch:{ all -> 0x004c }
            r0 = r1[r4]     // Catch:{ all -> 0x004c }
            r1 = r0[r4]     // Catch:{ all -> 0x004c }
            com.ss.android.ml.o r0 = r5.f59920h
            if (r0 == 0) goto L_0x004b
            r0.a(r3, r2)
        L_0x004b:
            return r1
        L_0x004c:
            r1 = move-exception
            goto L_0x0050
        L_0x004e:
            r1 = move-exception
            r3 = 0
        L_0x0050:
            com.ss.android.ml.o r0 = r5.f59920h
            if (r0 == 0) goto L_0x0057
            r0.a(r3, r2)
        L_0x0057:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.r.a(java.util.Map, java.util.List, com.ss.android.ml.process.a, java.util.List):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    @Override // com.ss.android.ml.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> a(java.util.Map<java.lang.String, java.lang.Object> r7, java.util.List<? extends com.ss.android.ml.process.c> r8, com.ss.android.ml.process.a r9, java.util.List<java.lang.String> r10, java.util.Map<java.lang.String, java.lang.Float> r11) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.r.a(java.util.Map, java.util.List, com.ss.android.ml.process.a, java.util.List, java.util.Map):java.util.List");
    }
}
