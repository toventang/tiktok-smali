package com.bytedance.android.live.broadcast.c.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.StickerGiftApi;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.a.a;
import com.bytedance.android.livesdk.gift.assets.d;
import com.bytedance.android.livesdk.gift.model.n;
import com.bytedance.android.livesdk.model.message.ax;
import com.bytedance.android.livesdk.model.message.cg;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public final class g implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    final List<cg> f7802a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7803b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHandler f7804c = new WeakHandler(this);

    /* renamed from: d  reason: collision with root package name */
    public cg f7805d;

    /* renamed from: e  reason: collision with root package name */
    public String f7806e;

    /* renamed from: f  reason: collision with root package name */
    private final a f7807f;

    /* renamed from: g  reason: collision with root package name */
    private final a f7808g = new a() {
        /* class com.bytedance.android.live.broadcast.c.a.g.AnonymousClass1 */

        /* renamed from: b  reason: collision with root package name */
        private boolean f7810b;

        static {
            Covode.recordClassIndex(3858);
        }

        @Override // com.bytedance.android.livesdk.gift.a.a
        public final void a() {
            this.f7810b = true;
            if (g.this.f7804c.hasMessages(140001)) {
                g.this.f7804c.removeMessages(140001);
            }
            g.this.f7804c.sendMessage(g.this.f7804c.obtainMessage(140001));
        }

        @Override // com.bytedance.android.livesdk.gift.a.a
        public final void a(y yVar) {
            if (!this.f7810b && yVar != null && yVar.t != null && 4 == yVar.t.f19762e) {
                t.a(new l(yVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m(this), n.f7819a);
            }
        }
    };

    static {
        Covode.recordClassIndex(3857);
    }

    public final void a() {
        try {
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).setGiftAnimationEngine(n.STICKER_GIFT, this.f7808g);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(6, "StickerMessageManager", e2.toString());
        }
    }

    public final void d() {
        this.f7804c.removeCallbacksAndMessages(null);
        ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).removeAnimationEngine(n.STICKER_GIFT);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!this.f7803b && !this.f7802a.isEmpty()) {
            this.f7805d = this.f7802a.remove(0);
            AnonymousClass2 r5 = new d() {
                /* class com.bytedance.android.live.broadcast.c.a.g.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(3859);
                }

                @Override // com.bytedance.android.livesdk.gift.assets.d, com.bytedance.android.livesdk.gift.assets.a
                public final void a() {
                    g.this.f7803b = false;
                }

                @Override // com.bytedance.android.livesdk.gift.assets.d, com.bytedance.android.livesdk.gift.assets.a
                public final void a(Throwable th) {
                    g.this.f7803b = false;
                }

                @Override // com.bytedance.android.livesdk.gift.assets.d, com.bytedance.android.livesdk.gift.assets.a
                public final void a(String str) {
                    if (str.equals(g.this.f7805d.f19676d)) {
                        cg cgVar = g.this.f7805d;
                        if (cgVar.q == null || cgVar.q.f19221b <= 0 || cgVar.q.f19222c <= 0 || TextUtils.isEmpty(g.this.f7806e)) {
                            g.this.f7804c.postDelayed(new o(this), 1000);
                            return;
                        }
                        g gVar = g.this;
                        String nickName = gVar.f7805d.f19679g.getNickName();
                        ((StickerGiftApi) d.a.a().a(StickerGiftApi.class)).checkUserNameLegality(nickName).a(new f()).a(new j(gVar, nickName), new k(gVar));
                    }
                }
            };
            this.f7803b = true;
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).downloadAssets("effects", this.f7805d.f19674b, r5, 4);
        }
    }

    public final void c() {
        cg cgVar;
        a aVar = this.f7807f;
        if (aVar != null && this.f7804c != null && (cgVar = this.f7805d) != null) {
            com.bytedance.android.livesdkapi.depend.model.a aVar2 = new com.bytedance.android.livesdkapi.depend.model.a();
            aVar2.f22995a = cgVar.f19682j;
            aVar2.c(cgVar.f19676d);
            aVar.a(aVar2);
            WeakHandler weakHandler = this.f7804c;
            weakHandler.sendMessageDelayed(weakHandler.obtainMessage(140001), this.f7805d.o);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (140001 == message.what) {
            this.f7807f.d_();
            this.f7805d = null;
            this.f7803b = false;
            b();
        }
    }

    public g(a aVar) {
        this.f7807f = aVar;
        t.a(h.f7812a).a(new f()).d(new i(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        Typeface createFromFile;
        String str2 = str;
        MethodCollector.i(7937);
        if (this.f7806e == null) {
            MethodCollector.o(7937);
            return;
        }
        ax axVar = this.f7805d.q;
        if (TextUtils.isEmpty(str2)) {
            str2 = axVar.f19223d;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.android.live.core.f.y.a((int) R.string.gps);
        }
        String str3 = this.f7806e + File.separator + com.bytedance.common.utility.d.b(str2) + ".png";
        String str4 = axVar.f19220a;
        String str5 = this.f7805d.f19676d + "font.ttf";
        if (!e.a(str3)) {
            axVar.f19225f = "#" + axVar.f19225f;
            axVar.f19229j = str5;
            axVar.f19223d = str2;
            axVar.f19228i = str3;
            String str6 = axVar.f19228i;
            Bitmap createBitmap = Bitmap.createBitmap(axVar.f19221b, axVar.f19222c, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint();
            boolean z = true;
            textPaint.setAntiAlias(true);
            textPaint.setDither(true);
            String str7 = axVar.f19229j;
            if (!TextUtils.isEmpty(str7) && new File(str7).exists()) {
                String str8 = axVar.f19229j;
                if (TypeFaceOptimizer.getSwitch() && str8 != null) {
                    if (TypeFaceLancet.cache.contains(str8)) {
                        createFromFile = (Typeface) TypeFaceLancet.cache.get(str8);
                    } else {
                        createFromFile = Typeface.createFromFile(str8);
                        if (createFromFile != null) {
                            TypeFaceLancet.cache.put(str8, createFromFile);
                        }
                    }
                }
                createFromFile = Typeface.createFromFile(str8);
            } else {
                createFromFile = b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
            }
            textPaint.setTypeface(createFromFile);
            textPaint.setTextSize((float) axVar.f19224e);
            textPaint.setColor(Color.parseColor(axVar.f19225f));
            if (axVar.f19226g != 1) {
                z = false;
            }
            float f2 = 0.0f;
            if (z) {
                int b2 = com.bytedance.android.live.core.f.y.b((int) R.color.a24);
                textPaint.setShadowLayer(2.0f, 0.0f, 5.0f, Color.argb(153, Color.red(b2), Color.green(b2), Color.blue(b2)));
            }
            String str9 = axVar.f19227h;
            if (TextUtils.equals(str9, "center")) {
                f2 = (((float) axVar.f19221b) - textPaint.measureText(axVar.f19223d)) / 2.0f;
            } else if (!TextUtils.equals(str9, "left") && TextUtils.equals(str9, "right")) {
                f2 = ((float) axVar.f19221b) - textPaint.measureText(axVar.f19223d);
            }
            textPaint.getTextBounds(axVar.f19223d, 0, axVar.f19223d.length(), new Rect());
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            canvas.drawText(axVar.f19223d, f2, (float) ((((axVar.f19222c - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), textPaint);
            com.bytedance.android.livesdk.chatroom.b.a.a(str6, createBitmap);
            createBitmap.recycle();
        }
        this.f7807f.a(str4, str3);
        c();
        MethodCollector.o(7937);
    }
}
