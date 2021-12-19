package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    View f130464a;

    /* renamed from: l  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.b f130465l;

    /* renamed from: m  reason: collision with root package name */
    public Handler f130466m;
    public Runnable n;
    final g o;
    private final BusinessExtraData q;
    private final Aweme r;

    static {
        Covode.recordClassIndex(85557);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85559);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void j() {
        Handler handler;
        super.j();
        Runnable runnable = this.n;
        if (runnable != null && (handler = this.f130466m) != null) {
            handler.post(runnable);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void k() {
        super.k();
        Handler handler = this.f130466m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        MethodCollector.i(3210);
        if (c.a(this.f130436i)) {
            if (this.f130464a == null) {
                this.f130464a = new c(this.f130436i);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.f130464a;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            View view2 = this.f130464a;
            MethodCollector.o(3210);
            return view2;
        }
        if (this.f130464a == null) {
            this.f130464a = new FrameLayout(this.f130436i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view3 = this.f130464a;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams2);
            }
        }
        View view4 = this.f130464a;
        MethodCollector.o(3210);
        return view4;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        d dVar = new d();
        BusinessExtraData businessExtraData = this.q;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        d a2 = dVar.a("prop_id", str);
        j jVar = this.f130438k;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str2 = null;
        } else {
            str2 = iVar4.f134901a;
        }
        d a3 = a2.a("enter_from", str2);
        j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str3 = null;
        } else {
            str3 = iVar3.f134904d;
        }
        d a4 = a3.a("log_pb", str3);
        j jVar3 = this.f130438k;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str4 = null;
        } else {
            str4 = iVar2.f134902b;
        }
        d a5 = a4.a("author_id", str4);
        j jVar4 = this.f130438k;
        if (jVar4 == null || (iVar = jVar4.r) == null) {
            str5 = null;
        } else {
            str5 = iVar.f134903c;
        }
        d a6 = a5.a("group_id", str5);
        BusinessExtraData businessExtraData2 = this.q;
        if (businessExtraData2 != null) {
            str6 = businessExtraData2.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        d a7 = a6.a("enter_method", c.a(str6));
        BusinessExtraData businessExtraData3 = this.q;
        if (businessExtraData3 != null) {
            str7 = businessExtraData3.getSchemaUrlWebFirst();
        } else {
            str7 = null;
        }
        r.a("function_prop_click", a7.a("url", str7).f66730a);
        Aweme aweme = this.r;
        if (aweme != null && aweme.isAd()) {
            Context context = this.f130436i;
            Aweme aweme2 = this.r;
            com.ss.android.ugc.aweme.commercialize.log.j.b(context, "otherclick", aweme2, com.ss.android.ugc.aweme.commercialize.log.j.a(context, aweme2, "raw ad prop otherclick", "sticker"));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", this.r.getAwemeRawAd()).c();
            BusinessExtraData businessExtraData4 = this.q;
            if (businessExtraData4 != null) {
                str8 = businessExtraData4.getStickerId();
            } else {
                str8 = null;
            }
            com.ss.android.ugc.aweme.crossplatform.business.a.a.a("function_prop_click", str8, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        String str;
        MethodCollector.i(2991);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f130436i);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        CircleImageView circleImageView = new CircleImageView(this.f130436i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) n.b(this.f130436i, 32.0f), (int) n.b(this.f130436i, 32.0f));
        layoutParams2.setMargins(0, 0, (int) n.b(this.f130436i, 8.0f), 0);
        circleImageView.setLayoutParams(layoutParams2);
        ((com.facebook.drawee.f.a) circleImageView.getHierarchy()).c(2131232881);
        ((com.facebook.drawee.f.a) circleImageView.getHierarchy()).d(2131232881);
        BusinessExtraData businessExtraData = this.q;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        e.b(circleImageView, str, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(this.f130436i, null, 0, 6);
        tuxTextView.setTextColor(androidx.core.content.b.c(this.f130436i, R.color.a_));
        tuxTextView.setTuxFont(61);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) n.b(this.f130436i, 1.0f);
        tuxTextView.setLayoutParams(layoutParams3);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.q;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        }
        tuxTextView.setText(str2);
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f130436i);
        autoRTLImageView.setImageResource(R.drawable.b5y);
        linearLayout.addView(circleImageView);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(autoRTLImageView);
        MethodCollector.o(2991);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f0, code lost:
        if (com.ss.android.ugc.aweme.commercialize.utils.w.a(r1, r0, false) == false) goto L_0x00f2;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.f():void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        this.f130465l.a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void b(int i2) {
        super.b(i2);
        Handler handler = this.f130466m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(com.ss.android.ugc.aweme.dh.d dVar) {
        l.d(dVar, "");
        int b2 = (int) n.b(this.f130436i, 57.9f);
        dVar.f80098e = b2;
        dVar.setHeight(b2);
        com.ss.android.ugc.aweme.dh.a.f80086h = b2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        return this.f130465l.a(j2, i2, f2, f3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        l.d(bVar, "");
        return this.f130465l.a(j2, i2, f2, f3, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar, g gVar, BusinessExtraData businessExtraData, Aweme aweme) {
        super(i2, context, view, interactStickerStruct, jVar);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        l.d(context, "");
        l.d(view, "");
        l.d(interactStickerStruct, "");
        this.o = gVar;
        this.q = businessExtraData;
        this.r = aweme;
        this.f130465l = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.b(context, this, interactStickerStruct, jVar, businessExtraData);
        if (c.a(context)) {
            this.n = new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f130467a;

                static {
                    Covode.recordClassIndex(85558);
                }

                {
                    this.f130467a = r1;
                }

                public final void run() {
                    Handler handler;
                    long j2;
                    long j3;
                    b bVar = this.f130467a;
                    c cVar = (c) bVar.f130464a;
                    if (cVar != null) {
                        g gVar = bVar.o;
                        if (gVar != null) {
                            j2 = gVar.av();
                        } else {
                            j2 = 0;
                        }
                        List<? extends NormalTrackTimeStamp> list = bVar.f130434g;
                        ArrayList arrayList = null;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t : list) {
                                T t2 = t;
                                if (t2 != null) {
                                    j3 = (long) t2.getPts();
                                } else {
                                    j3 = 0;
                                }
                                long j4 = j2 - j3;
                                if (-160 <= j4 && 160 >= j4) {
                                    arrayList2.add(t);
                                }
                            }
                            ArrayList<NormalTrackTimeStamp> arrayList3 = arrayList2;
                            if (arrayList3 != null) {
                                arrayList = new ArrayList();
                                for (NormalTrackTimeStamp normalTrackTimeStamp : arrayList3) {
                                    if (normalTrackTimeStamp != null) {
                                        RectF a2 = bVar.f130465l.a(normalTrackTimeStamp);
                                        float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(normalTrackTimeStamp.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
                                        matrix.mapPoints(fArr);
                                        arrayList.add(fArr);
                                    }
                                }
                            }
                        }
                        cVar.setPoints(arrayList);
                    }
                    View view = bVar.f130464a;
                    if (view != null) {
                        view.postInvalidate();
                    }
                    Runnable runnable = this.f130467a.n;
                    if (!(runnable == null || (handler = this.f130467a.f130466m) == null)) {
                        handler.postDelayed(runnable, 100);
                    }
                }
            };
            Handler handler = new Handler();
            this.f130466m = handler;
            Runnable runnable = this.n;
            if (runnable != null) {
                handler.post(runnable);
            }
        }
        if (aweme != null && aweme.isAd()) {
            com.ss.android.ugc.aweme.commercialize.log.j.b(context, "othershow", aweme, com.ss.android.ugc.aweme.commercialize.log.j.a(context, aweme, "raw ad othershow", "sticker"));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", aweme.getAwemeRawAd()).c();
        }
        d dVar = new d();
        String str7 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        d a2 = dVar.a("prop_id", str);
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str2 = null;
        } else {
            str2 = iVar4.f134901a;
        }
        d a3 = a2.a("enter_from", str2);
        if (jVar == null || (iVar3 = jVar.r) == null) {
            str3 = null;
        } else {
            str3 = iVar3.f134904d;
        }
        d a4 = a3.a("log_pb", str3);
        if (jVar == null || (iVar2 = jVar.r) == null) {
            str4 = null;
        } else {
            str4 = iVar2.f134902b;
        }
        d a5 = a4.a("author_id", str4);
        if (jVar == null || (iVar = jVar.r) == null) {
            str5 = null;
        } else {
            str5 = iVar.f134903c;
        }
        d a6 = a5.a("group_id", str5);
        if (businessExtraData != null) {
            str6 = businessExtraData.getSchemaUrlWebFirst();
        } else {
            str6 = null;
        }
        r.a("function_prop_show", a6.a("enter_method", c.a(str6)).a("url", businessExtraData != null ? businessExtraData.getSchemaUrlWebFirst() : str7).f66730a);
    }
}
