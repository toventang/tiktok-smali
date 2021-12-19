package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;
import java.util.Random;

public final class a implements a.AbstractC0502a, b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0487a f22553a = new C0487a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TypedArray f22554b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap[] f22555c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f22556d = new Random();

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.android.livesdk.model.a f22557e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.depend.c.a f22558f = new com.bytedance.android.livesdkapi.depend.c.a(this);

    /* renamed from: g  reason: collision with root package name */
    private final Context f22559g;

    /* renamed from: h  reason: collision with root package name */
    private final ViewGroup f22560h;

    static {
        Covode.recordClassIndex(13300);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.a$a  reason: collision with other inner class name */
    public static final class C0487a {
        static {
            Covode.recordClassIndex(13301);
        }

        private C0487a() {
        }

        public /* synthetic */ C0487a(byte b2) {
            this();
        }
    }

    private final boolean e() {
        try {
            TypedArray typedArray = this.f22554b;
            if (typedArray == null) {
                return false;
            }
            typedArray.length();
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.b
    public final void b() {
        this.f22558f.removeMessages(12);
        this.f22558f.removeMessages(13);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.b
    public final void c() {
        b();
        Bitmap[] bitmapArr = this.f22555c;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        TypedArray typedArray = this.f22554b;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.b
    public final void a() {
        int nextInt = this.f22556d.nextInt(6) + 5;
        long[] jArr = new long[nextInt];
        for (int i2 = 0; i2 < nextInt; i2++) {
            jArr[i2] = (long) this.f22556d.nextInt(3000);
            this.f22558f.sendEmptyMessageDelayed(13, jArr[i2]);
        }
        this.f22558f.sendEmptyMessageDelayed(12, 3000);
        StringBuilder append = new StringBuilder("Barrage count: ").append(nextInt).append(", at times: ");
        String arrays = Arrays.toString(jArr);
        l.b(arrays, "");
        com.bytedance.android.live.core.c.a.a(3, "BarrageLauncher", append.append(arrays).toString());
    }

    private final void d() {
        MethodCollector.i(5146);
        if (this.f22559g == null || this.f22560h == null) {
            MethodCollector.o(5146);
            return;
        }
        BarrageLayout barrageLayout = new BarrageLayout(this.f22559g, (AttributeSet) null, 6);
        barrageLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f22560h.addView(barrageLayout);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(p.class);
        if (a2 == null) {
            l.b();
        }
        com.bytedance.android.livesdk.model.a aVar = (com.bytedance.android.livesdk.model.a) ((p) a2).getDiggController(barrageLayout, 1400);
        this.f22557e = aVar;
        BarrageLayout.a(barrageLayout, aVar);
        int i2 = 0;
        do {
            Path path = new Path();
            path.moveTo((float) y.a(50.0f), (float) y.a(220.0f));
            float f2 = (float) (((i2 - 5) * 6) + 50);
            path.quadTo((float) y.a(f2), (float) y.a(220.0f), (float) y.a(f2), (float) y.a(40.0f));
            com.bytedance.android.livesdk.model.a aVar2 = this.f22557e;
            if (aVar2 != null) {
                aVar2.a(path);
            }
            i2++;
        } while (i2 < 10);
        MethodCollector.o(5146);
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        com.bytedance.android.livesdk.model.a aVar;
        TypedArray typedArray;
        TypedArray typedArray2;
        MethodCollector.i(5058);
        l.d(message, "");
        int i2 = message.what;
        if (i2 != 12) {
            if (i2 == 13) {
                if ((e() || ((typedArray2 = this.f22554b) != null && typedArray2.length() > 0)) && (aVar = this.f22557e) != null && aVar.b() < 24) {
                    Bitmap[] bitmapArr = this.f22555c;
                    if (bitmapArr != null) {
                        int nextInt = this.f22556d.nextInt(bitmapArr.length);
                        Bitmap bitmap = bitmapArr[nextInt];
                        Resources resources = null;
                        if ((bitmap == null || bitmap.isRecycled()) && (typedArray = this.f22554b) != null) {
                            Context context = this.f22559g;
                            if (context != null) {
                                resources = context.getResources();
                            }
                            bitmapArr[nextInt] = BitmapFactory.decodeResource(resources, typedArray.getResourceId(nextInt, 0));
                        }
                        Bitmap bitmap2 = bitmapArr[nextInt];
                        if (bitmap2 == null || !(!bitmap2.isRecycled())) {
                            MethodCollector.o(5058);
                            return;
                        }
                        com.bytedance.android.livesdk.model.a aVar2 = this.f22557e;
                        if (aVar2 != null) {
                            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(p.class);
                            if (a2 == null) {
                                l.b();
                            }
                            com.ss.ugc.live.barrage.a.a diggBarrage = ((p) a2).getDiggBarrage(bitmap2, Double.valueOf(this.f22556d.nextDouble()));
                            l.b(diggBarrage, "");
                            aVar2.a(diggBarrage, false);
                            MethodCollector.o(5058);
                            return;
                        }
                        MethodCollector.o(5058);
                        return;
                    }
                } else {
                    MethodCollector.o(5058);
                    return;
                }
            }
            MethodCollector.o(5058);
            return;
        }
        a();
        MethodCollector.o(5058);
    }

    public a(Context context, ViewGroup viewGroup) {
        TypedArray typedArray;
        this.f22559g = context;
        this.f22560h = viewGroup;
        Resources a2 = y.a();
        if (a2 != null) {
            typedArray = a2.obtainTypedArray(R.array.av);
        } else {
            typedArray = null;
        }
        this.f22554b = typedArray;
        if (typedArray != null) {
            this.f22555c = new Bitmap[typedArray.length()];
        }
        d();
    }
}
