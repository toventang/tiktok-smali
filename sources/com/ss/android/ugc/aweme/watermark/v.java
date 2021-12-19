package com.ss.android.ugc.aweme.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.bj;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.c.b.a.k;
import h.c.f;
import h.f.b.l;
import h.f.b.m;
import h.r;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.z;

public final class v {

    /* renamed from: f  reason: collision with root package name */
    public static final a f144836f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final z f144837a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f144838b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f144839c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f144840d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.account.model.a f144841e;

    /* renamed from: g  reason: collision with root package name */
    private final String f144842g;

    /* renamed from: h  reason: collision with root package name */
    private final String f144843h;

    /* renamed from: i  reason: collision with root package name */
    private final h.f.a.a<Boolean> f144844i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f144845j;

    /* access modifiers changed from: package-private */
    public static final class h extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(94716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(v vVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = vVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    static {
        Covode.recordClassIndex(94708);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94709);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean c() {
        return this.f144844i.invoke().booleanValue();
    }

    public final String d() {
        String h2 = this.f144841e.h();
        if (h2 == null) {
            return "";
        }
        return h2;
    }

    public final String e() {
        String str;
        String a2 = this.f144841e.a();
        if (a2 == null || a2.length() == 0) {
            str = this.f144841e.b();
        } else {
            str = this.f144841e.a();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String a() {
        MethodCollector.i(8504);
        String str = "";
        if (!this.f144845j) {
            MethodCollector.o(8504);
            return str;
        }
        String str2 = this.f144842g + "ending_watermark_audio.aac";
        if (!j.a().getBoolean("key_ending_audio_ready", false) || !com.ss.android.ugc.aweme.video.e.b(str2)) {
            this.f144838b = true;
            j.a(false);
            com.ss.android.ugc.aweme.video.e.a(str2, true);
            try {
                com.ss.android.ugc.tools.utils.i.a(this.f144839c.getAssets().open("ending_watermark_audio.aac"), new FileOutputStream(str2));
                j.a(true);
                str = str2;
            } catch (IOException e2) {
                com.ss.android.ugc.aweme.video.e.c(str2);
                q.a("WatermarkResourceLoader", e2);
            }
            MethodCollector.o(8504);
            return str;
        }
        MethodCollector.o(8504);
        return str2;
    }

    public final String b() {
        MethodCollector.i(8508);
        int intValue = this.f144840d.get(0).intValue();
        int intValue2 = this.f144840d.get(1).intValue();
        String str = this.f144843h;
        c cVar = null;
        if (str != null) {
            if (!com.ss.android.ugc.tools.utils.i.a(str)) {
                str = null;
            }
            if (str != null) {
                int[] iArr = new int[10];
                if (com.ss.android.ugc.aweme.tools.c.c.a(str, iArr) == 0) {
                    intValue = iArr[0];
                    intValue2 = iArr[1];
                }
            }
        }
        String str2 = this.f144842g + "ending_frame.png";
        if (!com.ss.android.ugc.aweme.video.e.b(str2) || !l.a((Object) j.a().getString("key_ending_frame_ready", ""), (Object) j.b(intValue, intValue2))) {
            this.f144838b = true;
            try {
                c cVar2 = new c();
                if (intValue > 0 && intValue2 > 0) {
                    cVar2.f144780a = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    new Canvas(cVar2.f144780a).drawColor(Color.parseColor("#0E0F1A"));
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.a(str2);
                }
                j.a(intValue, intValue2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.video.e.c(str2);
                j.a(-1, -1);
                q.a("WatermarkResourceLoader", e2);
                str2 = "";
            }
            MethodCollector.o(8508);
            return str2;
        }
        MethodCollector.o(8508);
        return str2;
    }

    public static final class b implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f144846a;

        static {
            Covode.recordClassIndex(94710);
        }

        b(h.c.d dVar) {
            this.f144846a = dVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            Exception exc;
            h.c.d dVar = this.f144846a;
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
            } else {
                exc = null;
            }
            dVar.resumeWith(h.q.m223constructorimpl(r.a(new Throwable("request watermark panel failed", exc))));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<Effect> allCategoryEffects;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 == null || (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) == null || allCategoryEffects.isEmpty()) {
                this.f144846a.resumeWith(h.q.m223constructorimpl(r.a(new Throwable("watermark panel empty"))));
            } else {
                this.f144846a.resumeWith(h.q.m223constructorimpl(allCategoryEffects));
            }
        }
    }

    public static final class c implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f144847a;

        static {
            Covode.recordClassIndex(94711);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        c(h.c.d dVar) {
            this.f144847a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            l.d(effect2, "");
            this.f144847a.resumeWith(h.q.m223constructorimpl(effect2.getUnzipPath()));
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f144847a.resumeWith(h.q.m223constructorimpl(r.a(new Throwable("download effect failed", exceptionResult.getException()))));
        }
    }

    public static final class d implements IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.c.d f144848a;

        static {
            Covode.recordClassIndex(94712);
        }

        d(h.c.d dVar) {
            this.f144848a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
            if (fVar == null) {
                this.f144848a.resumeWith(h.q.m223constructorimpl(r.a((Throwable) new RuntimeException("effect so fail"))));
            } else {
                this.f144848a.resumeWith(h.q.m223constructorimpl(fVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<EffectPlatformBuilder, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f144849a = new e();

        static {
            Covode.recordClassIndex(94713);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(EffectPlatformBuilder effectPlatformBuilder) {
            EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
            l.d(effectPlatformBuilder2, "");
            effectPlatformBuilder2.setRegion(com.ss.android.ugc.aweme.port.in.g.a().y().a());
            return h.z.f158842a;
        }
    }

    static final class g extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ h.f.a.r $onSuccess;
        int label;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(94715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(v vVar, h.f.a.r rVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = vVar;
            this.$onSuccess = rVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.this$0, this.$onSuccess, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                v vVar = this.this$0;
                this.label = 1;
                obj = vVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String a2 = this.this$0.a();
            String b2 = this.this$0.b();
            h.f.a.r rVar = this.$onSuccess;
            if (rVar != null) {
                rVar.a(Boolean.valueOf(this.this$0.f144838b), n.a(obj), b2, a2);
            }
            return h.z.f158842a;
        }
    }

    private final Effect a(List<? extends Effect> list) {
        T t = null;
        if (c()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t2 = next;
                if (t2.getTags() != null) {
                    List<String> tags = t2.getTags();
                    if (tags == null) {
                        l.b();
                    }
                    if (tags.contains("mark_subjective")) {
                        t = next;
                        break;
                    }
                }
            }
            return t;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            T t3 = next2;
            if (t3.getTags() != null) {
                List<String> tags2 = t3.getTags();
                if (tags2 == null) {
                    l.b();
                }
                if (tags2.contains("mark_objective")) {
                    t = next2;
                    break;
                }
            }
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.m f144851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f144852b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f144853c;

        static {
            Covode.recordClassIndex(94717);
        }

        i(kotlinx.coroutines.m mVar, v vVar, String str) {
            this.f144851a = mVar;
            this.f144852b = vVar;
            this.f144853c = str;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            boolean z;
            int i2;
            String str;
            int i3;
            boolean z2;
            float f2;
            int i4;
            MethodCollector.i(10897);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                q.a("WatermarkResourceLoader", new Throwable("requested user avatar is null"));
                bitmap = BitmapFactory.decodeResource(this.f144852b.f144839c.getResources(), 2131231611);
                l.b(bitmap, "");
                z = false;
            } else {
                z = true;
            }
            String d2 = this.f144852b.d();
            String e2 = this.f144852b.e();
            c cVar = new c();
            if (this.f144852b.c()) {
                int intValue = this.f144852b.f144840d.get(0).intValue();
                int intValue2 = this.f144852b.f144840d.get(1).intValue();
                if (intValue > 0 && intValue2 > 0) {
                    float min = (float) Math.min(bitmap.getWidth(), bitmap.getHeight());
                    float f3 = ((1.0f * min) / 128.0f) * 3.0f;
                    int round = Math.round(min + (f3 * 2.0f));
                    float f4 = ((float) round) / 2.0f;
                    Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    float f5 = f4 - f3;
                    canvas.drawCircle(f4, f4, f5, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, round, round), paint);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f3);
                    paint.setColor(-1);
                    paint.setXfermode(null);
                    canvas.drawCircle(f4, f4, f5, paint);
                    Matrix matrix = new Matrix();
                    float width = 135.0f / ((float) createBitmap.getWidth());
                    matrix.preScale(width, width);
                    cVar.f144780a = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    if (!cVar.f144780a.equals(createBitmap)) {
                        com.ss.android.ugc.tools.utils.c.a(createBitmap);
                    }
                    cVar.a(this.f144853c + "profile.png");
                }
                int intValue3 = this.f144852b.f144840d.get(0).intValue();
                int intValue4 = this.f144852b.f144840d.get(1).intValue();
                if (intValue3 > 0 && intValue4 > 0) {
                    cVar.f144780a = Bitmap.createBitmap(386, 35, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(cVar.f144780a);
                    canvas2.drawColor(0);
                    if (intValue3 < intValue4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TextPaint textPaint = new TextPaint(1);
                    if (z2) {
                        f2 = 36.0f;
                    } else {
                        f2 = 32.0f;
                    }
                    textPaint.setTextSize(f2);
                    textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(bj.a.f115611g));
                    textPaint.setStyle(Paint.Style.FILL);
                    textPaint.setColor(Color.parseColor("#E6FFFFFF"));
                    textPaint.setTextAlign(Paint.Align.CENTER);
                    int i5 = 20;
                    if (d2.length() > 20) {
                        if (Character.isHighSurrogate(d2.charAt(20))) {
                            i5 = 19;
                        }
                        d2 = d2.substring(0, i5) + "...";
                    }
                    float measureText = textPaint.measureText(d2);
                    if (measureText > 386.0f) {
                        int length = ((int) ((measureText - 386.0f) / (measureText / ((float) d2.length())))) + 3;
                        StringBuilder sb = new StringBuilder();
                        int length2 = d2.length() - length;
                        i4 = 0;
                        d2 = sb.append(d2.substring(0, length2)).append("...").toString();
                    } else {
                        i4 = 0;
                    }
                    textPaint.getTextBounds(d2, i4, d2.length(), new Rect());
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    canvas2.drawText(d2, 193.0f, (((fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom) + 17.0f, textPaint);
                    cVar.a(this.f144853c + "nickname.png");
                }
            }
            Context context = this.f144852b.f144839c;
            int intValue5 = this.f144852b.f144840d.get(0).intValue();
            int intValue6 = this.f144852b.f144840d.get(1).intValue();
            if (intValue5 > 0 && intValue6 > 0) {
                cVar.f144780a = Bitmap.createBitmap(261, 32, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(cVar.f144780a);
                canvas3.drawColor(0);
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232292);
                boolean z3 = true;
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setTextSize(28.0f);
                textPaint2.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(bj.a.f115605a));
                textPaint2.setColor(Color.parseColor("#E6FFFFFF"));
                textPaint2.setTextAlign(Paint.Align.CENTER);
                int length3 = e2.length();
                if (e2.length() <= 15) {
                    z3 = false;
                } else if (Character.isHighSurrogate(e2.charAt(15))) {
                    length3 = 14;
                } else {
                    length3 = 15;
                }
                Rect rect = new Rect();
                if (z3) {
                    i2 = 0;
                    str = e2.substring(0, length3) + "...";
                } else {
                    i2 = 0;
                    str = e2;
                }
                textPaint2.getTextBounds(str, i2, str.length(), rect);
                float width2 = (float) rect.width();
                float height = (float) rect.height();
                float f6 = 259.0f - height;
                if (width2 > f6) {
                    int ceil = (int) Math.ceil((double) ((width2 - f6) / (width2 / ((float) str.length()))));
                    if (!z3) {
                        ceil += 3;
                    }
                    i3 = 0;
                    e2 = e2.substring(0, length3 - ceil) + "...";
                } else {
                    i3 = 0;
                    if (z3) {
                        e2 = str;
                    }
                }
                Rect rect2 = new Rect();
                textPaint2.getTextBounds(e2, i3, e2.length(), rect2);
                int width3 = 261 - ((int) ((((float) rect2.width()) + height) + 2.0f));
                int width4 = (261 - (width3 / 2)) - (rect2.width() / 2);
                Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                int i6 = (int) (((float) width3) / 2.0f);
                int max = Math.max((int) (Math.ceil((double) (32.0f - height)) / 2.0d), 0) + ((int) (((float) (intValue5 * 2)) / 750.0f));
                canvas3.drawBitmap(decodeResource, (Rect) null, new Rect(i6, max, (int) (((float) i6) + height), (int) (((float) max) + height)), textPaint2);
                canvas3.drawText(e2, (float) width4, (((fontMetrics2.bottom - fontMetrics2.top) / 2.0f) - fontMetrics2.bottom) + 16.0f, textPaint2);
                cVar.a(this.f144853c + "username.png");
            }
            this.f144851a.resumeWith(h.q.m223constructorimpl(Boolean.valueOf(z)));
            MethodCollector.o(10897);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0204 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.watermark.v.a(h.c.d):java.lang.Object");
    }

    public static final class f extends h.c.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f144850a;

        static {
            Covode.recordClassIndex(94714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(f.c cVar, h.f.a.b bVar) {
            super(cVar);
            this.f144850a = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            q.a("WatermarkResourceLoader", th);
            h.f.a.b bVar = this.f144850a;
            if (bVar != null) {
                bVar.invoke(th);
            }
        }
    }

    public v(Context context, String str, List<Integer> list, String str2, com.ss.android.ugc.aweme.account.model.a aVar, h.f.a.a<Boolean> aVar2, boolean z) {
        l.d(context, "");
        l.d(str, "");
        l.d(list, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        this.f144839c = context;
        this.f144842g = str;
        this.f144840d = list;
        this.f144843h = str2;
        this.f144841e = aVar;
        this.f144844i = aVar2;
        this.f144845j = z;
        if (list.size() == 2) {
            this.f144837a = cd.a(null);
            return;
        }
        throw new IllegalArgumentException("video width or video height not available.");
    }
}
