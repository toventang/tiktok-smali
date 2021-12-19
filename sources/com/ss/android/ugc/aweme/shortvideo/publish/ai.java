package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import androidx.core.content.a.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.photo.d;
import com.ss.android.ugc.tools.utils.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class ai {

    /* renamed from: i  reason: collision with root package name */
    public static final a f129709i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Paint f129710a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f129711b;

    /* renamed from: c  reason: collision with root package name */
    final int f129712c;

    /* renamed from: d  reason: collision with root package name */
    boolean f129713d;

    /* renamed from: e  reason: collision with root package name */
    int f129714e;

    /* renamed from: f  reason: collision with root package name */
    public final int f129715f;

    /* renamed from: g  reason: collision with root package name */
    public float f129716g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f129717h;

    /* renamed from: j  reason: collision with root package name */
    private final Context f129718j;

    static {
        Covode.recordClassIndex(85160);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85161);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f129719a;

        static {
            Covode.recordClassIndex(85164);
        }

        c(h.f.a.b bVar) {
            this.f129719a = bVar;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            this.f129719a.invoke(obj);
        }
    }

    public ai(Context context) {
        l.d(context, "");
        this.f129718j = context;
        Paint paint = new Paint();
        this.f129710a = paint;
        Paint paint2 = new Paint();
        this.f129711b = paint2;
        this.f129712c = f.b(context.getResources(), R.color.bl, context.getTheme());
        this.f129715f = (int) n.b(context, 8.0f);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 0.0f, 0.0f, f.b(context.getResources(), R.color.kr, context.getTheme()));
        boolean a2 = com.ss.android.ugc.aweme.tools.c.a(context);
        this.f129717h = a2;
        if (a2) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        paint2.setAntiAlias(true);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ String $content;
        final /* synthetic */ String $watermarkPath;
        final /* synthetic */ ai this$0;

        static {
            Covode.recordClassIndex(85162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ai aiVar, h.f.a.b bVar, String str, String str2) {
            super(1);
            this.this$0 = aiVar;
            this.$callback = bVar;
            this.$content = str;
            this.$watermarkPath = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            int i2;
            MethodCollector.i(11128);
            final Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.$callback.invoke(null);
            } else if (!bitmap2.isRecycled() && bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
                ai aiVar = this.this$0;
                aiVar.f129710a.setTextSize((((float) bitmap2.getHeight()) / 1280.0f) * 24.0f);
                aiVar.f129716g = aiVar.f129710a.getTextSize() + ((float) aiVar.f129715f);
                aiVar.f129714e = (int) (aiVar.f129710a.getTextSize() * 1.9f);
                final Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                final Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                if (this.this$0.f129717h) {
                    i2 = bitmap2.getWidth() - this.this$0.f129715f;
                } else {
                    i2 = this.this$0.f129715f;
                }
                canvas.drawText(this.$content, (float) i2, this.this$0.f129716g, this.this$0.f129710a);
                if (!i.a(this.$watermarkPath)) {
                    canvas.save();
                    canvas.restore();
                    this.$callback.invoke(createBitmap);
                } else {
                    String str = this.$watermarkPath;
                    if (str == null) {
                        l.b();
                    }
                    ai.a(str, new h.f.a.b<Bitmap, z>(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.publish.ai.b.AnonymousClass1 */
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(85163);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            if (bitmap2 != null) {
                                ai aiVar = this.this$0.this$0;
                                int height = bitmap2.getHeight();
                                if (!aiVar.f129713d) {
                                    aiVar.f129711b.setShader(new LinearGradient(0.0f, (float) (height - 300), 0.0f, (float) height, 0, aiVar.f129712c, Shader.TileMode.CLAMP));
                                    aiVar.f129713d = true;
                                }
                                canvas.drawRect(0.0f, (float) (bitmap2.getHeight() - 300), (float) bitmap2.getWidth(), (float) bitmap2.getHeight(), this.this$0.this$0.f129711b);
                                Canvas canvas = canvas;
                                ai aiVar2 = this.this$0.this$0;
                                Bitmap bitmap3 = bitmap2;
                                canvas.drawBitmap(bitmap2, (Rect) null, new Rect((int) ((((float) bitmap3.getWidth()) - (((float) bitmap2.getWidth()) * (((float) aiVar2.f129714e) / ((float) bitmap2.getHeight())))) - ((float) aiVar2.f129715f)), (bitmap3.getHeight() - aiVar2.f129714e) - aiVar2.f129715f, bitmap3.getWidth() - aiVar2.f129715f, bitmap3.getHeight() - aiVar2.f129715f), (Paint) null);
                                canvas.save();
                                canvas.restore();
                                this.this$0.$callback.invoke(createBitmap);
                                com.ss.android.ugc.tools.utils.c.a(bitmap2);
                            }
                            return z.f158842a;
                        }
                    });
                }
                com.ss.android.ugc.tools.utils.c.a(bitmap2);
            }
            z zVar = z.f158842a;
            MethodCollector.o(11128);
            return zVar;
        }
    }

    public static void a(String str, h.f.a.b<? super Bitmap, z> bVar) {
        int[] a2 = com.ss.android.ugc.tools.utils.c.a(str);
        if (a2 == null) {
            bVar.invoke(null);
        } else {
            com.ss.android.ugc.tools.c.a.a(d.a(Uri.parse(Uri.fromFile(new File(str)).toString())), a2[0], a2[1], new c(bVar));
        }
    }
}
