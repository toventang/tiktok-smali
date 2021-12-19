package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.log.ae;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.PollApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.PollResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.ss.android.ugc.aweme.sticker.i;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class l extends RelativeLayout implements m {

    /* renamed from: l  reason: collision with root package name */
    public static final b f130577l = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DispatchTouchEventView f130578a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f130579b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f130580c;

    /* renamed from: d  reason: collision with root package name */
    public final DispatchTouchEventView f130581d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f130582e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f130583f;

    /* renamed from: g  reason: collision with root package name */
    public String f130584g = "";

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f130585h;

    /* renamed from: i  reason: collision with root package name */
    public long f130586i;

    /* renamed from: j  reason: collision with root package name */
    public PollStruct f130587j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.k.c f130588k;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f130589m;
    private final ViewGroup n;
    private final ViewGroup o;
    private boolean p;
    private final PollApi q;
    private j r;
    private int s;
    private float[] t;
    private final Paint u;
    private final Path v;
    private final FrameLayout w;
    private InteractStickerStruct x;
    private a y;
    private final c z;

    public interface c {
        static {
            Covode.recordClassIndex(85621);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(85618);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(85620);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final c getAnimEndListener() {
        return this.z;
    }

    public final j getInteractStickerParams() {
        return this.r;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        return this.x;
    }

    public final Path getPath() {
        return this.v;
    }

    public final a getPbListener() {
        return this.y;
    }

    public final float[] getPoints() {
        return this.t;
    }

    public final FrameLayout getPollView() {
        return this.w;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.m
    public final int getStatus() {
        return this.s;
    }

    public final void a(String str) {
        String str2;
        j jVar = this.r;
        Long l2 = null;
        if (jVar != null && (str2 = jVar.f134927h) != null && str2.length() != 0) {
            Context context = getContext();
            h.f.b.l.b(context, "");
            j jVar2 = this.r;
            String str3 = jVar2 != null ? jVar2.f134927h : null;
            j jVar3 = this.r;
            String str4 = jVar3 != null ? jVar3.f134928i : null;
            j jVar4 = this.r;
            String valueOf = String.valueOf(jVar4 != null ? Long.valueOf(jVar4.f134929j) : null);
            j jVar5 = this.r;
            if (jVar5 == null || (l2 = Long.valueOf(jVar5.f134930k)) == null) {
                h.f.b.l.b();
            }
            long longValue = l2.longValue();
            h.f.b.l.d(context, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(valueOf, "");
            if (str3 != null && str3.length() != 0) {
                ae.a(context, "draw_ad", "poll_sticker_click", ae.a(ae.a(context, str3), str), str4, valueOf, longValue);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.m
    /* renamed from: getStatus  reason: collision with other method in class */
    public final Integer m221getStatus() {
        return Integer.valueOf(this.s);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f130585h.dispose();
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f130591a;

        static {
            Covode.recordClassIndex(85622);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l.c
        public final void a() {
            String str = this.f130591a.f130584g;
            if (str == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.b.a(str, this.f130591a.f130586i));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(l lVar) {
            this.f130591a = lVar;
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f130595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PollStruct f130596b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.k.c f130597c;

        static {
            Covode.recordClassIndex(85625);
        }

        g(l lVar, PollStruct pollStruct, com.ss.android.ugc.aweme.sticker.k.c cVar) {
            this.f130595a = lVar;
            this.f130596b = pollStruct;
            this.f130597c = cVar;
        }

        public final void run() {
            String str;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            TextView textView = this.f130595a.f130579b;
            l lVar = this.f130595a;
            PollStruct pollStruct = this.f130596b;
            String str2 = null;
            if (pollStruct == null || (options2 = pollStruct.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
                str = null;
            } else {
                str = optionsBean2.getOptionText();
            }
            textView.setText(lVar.b(str));
            TextView textView2 = this.f130595a.f130582e;
            l lVar2 = this.f130595a;
            PollStruct pollStruct2 = this.f130596b;
            if (!(pollStruct2 == null || (options = pollStruct2.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                str2 = optionsBean.getOptionText();
            }
            textView2.setText(lVar2.b(str2));
            DispatchTouchEventView dispatchTouchEventView = this.f130595a.f130578a;
            if (dispatchTouchEventView != null) {
                dispatchTouchEventView.setListener(this.f130597c);
            }
            DispatchTouchEventView dispatchTouchEventView2 = this.f130595a.f130581d;
            if (dispatchTouchEventView2 != null) {
                dispatchTouchEventView2.setListener(this.f130597c);
            }
            l lVar3 = this.f130595a;
            lVar3.setStatus(lVar3.getPollStatus());
            this.f130595a.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f130598a;

                static {
                    Covode.recordClassIndex(85626);
                }

                {
                    this.f130598a = r1;
                }

                public final void run() {
                    l lVar = this.f130598a.f130595a;
                    int status = this.f130598a.f130595a.getStatus();
                    if (status == 0) {
                        l.a(lVar.f130578a, lVar.f130579b, lVar.f130580c);
                        l.a(lVar.f130581d, lVar.f130582e, lVar.f130583f);
                    } else if (status == 1) {
                        lVar.f130578a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5u));
                        lVar.f130581d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5w));
                        float a2 = lVar.a(0, 0);
                        TextView textView = lVar.f130580c;
                        StringBuilder sb = new StringBuilder();
                        String a3 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a2)}, 1));
                        h.f.b.l.b(a3, "");
                        textView.setText(sb.append(a3).append("%").toString());
                        TextView textView2 = lVar.f130583f;
                        StringBuilder sb2 = new StringBuilder();
                        String a4 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a2)}, 1));
                        h.f.b.l.b(a4, "");
                        textView2.setText(sb2.append(a4).append("%").toString());
                        int i2 = (int) a2;
                        lVar.c(lVar.f130578a, lVar.f130579b, lVar.f130580c, i2);
                        lVar.c(lVar.f130581d, lVar.f130582e, lVar.f130583f, 100 - i2);
                    } else if (status == 2) {
                        lVar.f130581d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5u));
                        lVar.f130578a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5w));
                        float a5 = lVar.a(0, 0);
                        TextView textView3 = lVar.f130580c;
                        StringBuilder sb3 = new StringBuilder();
                        String a6 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a5)}, 1));
                        h.f.b.l.b(a6, "");
                        textView3.setText(sb3.append(a6).append("%").toString());
                        TextView textView4 = lVar.f130583f;
                        StringBuilder sb4 = new StringBuilder();
                        String a7 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a5)}, 1));
                        h.f.b.l.b(a7, "");
                        textView4.setText(sb4.append(a7).append("%").toString());
                        int i3 = (int) a5;
                        lVar.c(lVar.f130578a, lVar.f130579b, lVar.f130580c, i3);
                        lVar.c(lVar.f130581d, lVar.f130582e, lVar.f130583f, 100 - i3);
                    } else if (status == 3) {
                        lVar.f130580c.setVisibility(0);
                        lVar.f130583f.setVisibility(0);
                        lVar.f130581d.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5w));
                        lVar.f130578a.setProgressDrawable(lVar.getResources().getDrawable(R.drawable.b5w));
                        float a8 = lVar.a(0, 0);
                        if (a8 == 101.0f) {
                            TextView textView5 = lVar.f130580c;
                            StringBuilder sb5 = new StringBuilder();
                            String a9 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                            h.f.b.l.b(a9, "");
                            textView5.setText(sb5.append(a9).append("%").toString());
                            TextView textView6 = lVar.f130583f;
                            StringBuilder sb6 = new StringBuilder();
                            String a10 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                            h.f.b.l.b(a10, "");
                            textView6.setText(sb6.append(a10).append("%").toString());
                            lVar.c(lVar.f130581d, lVar.f130582e, lVar.f130583f, 0);
                            lVar.c(lVar.f130578a, lVar.f130579b, lVar.f130580c, 0);
                            return;
                        }
                        TextView textView7 = lVar.f130580c;
                        StringBuilder sb7 = new StringBuilder();
                        String a11 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a8)}, 1));
                        h.f.b.l.b(a11, "");
                        textView7.setText(sb7.append(a11).append("%").toString());
                        TextView textView8 = lVar.f130583f;
                        StringBuilder sb8 = new StringBuilder();
                        String a12 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a8)}, 1));
                        h.f.b.l.b(a12, "");
                        textView8.setText(sb8.append(a12).append("%").toString());
                        int i4 = (int) a8;
                        lVar.c(lVar.f130578a, lVar.f130579b, lVar.f130580c, i4);
                        lVar.c(lVar.f130581d, lVar.f130582e, lVar.f130583f, 100 - i4);
                    }
                }
            });
        }
    }

    public final int getPollStatus() {
        Long l2;
        Long l3;
        Long l4;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        if (this.p) {
            return 3;
        }
        PollStruct pollStruct = this.f130587j;
        Long l5 = null;
        if (pollStruct != null) {
            l2 = Long.valueOf(pollStruct.getSelectOptionId());
        } else {
            l2 = null;
        }
        PollStruct pollStruct2 = this.f130587j;
        if (pollStruct2 == null || (options2 = pollStruct2.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
            l3 = null;
        } else {
            l3 = Long.valueOf(optionsBean2.getOptionId());
        }
        if (h.f.b.l.a(l2, l3)) {
            return 1;
        }
        PollStruct pollStruct3 = this.f130587j;
        if (pollStruct3 != null) {
            l4 = Long.valueOf(pollStruct3.getSelectOptionId());
        } else {
            l4 = null;
        }
        PollStruct pollStruct4 = this.f130587j;
        if (!(pollStruct4 == null || (options = pollStruct4.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
            l5 = Long.valueOf(optionsBean.getOptionId());
        }
        if (h.f.b.l.a(l4, l5)) {
            return 2;
        }
        return 0;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        j jVar = this.r;
        String str5 = null;
        if (jVar == null || (iVar4 = jVar.r) == null) {
            str = null;
        } else {
            str = iVar4.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str);
        j jVar2 = this.r;
        if (jVar2 == null || (iVar3 = jVar2.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", str2);
        j jVar3 = this.r;
        if (jVar3 == null || (iVar2 = jVar3.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134904d;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("log_pb", str3);
        j jVar4 = this.r;
        if (!(jVar4 == null || (iVar = jVar4.r) == null)) {
            str5 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str5);
        StickerAttrStruct b2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(this.x);
        if (b2 == null || (str4 = b2.getPollStickerId()) == null) {
            str4 = "";
        }
        r.a("guest_poll_click", a5.a("prop_id", str4).f66730a);
    }

    public final void setInteractStickerParams(j jVar) {
        this.r = jVar;
    }

    public final void setInteractStickerStruct(InteractStickerStruct interactStickerStruct) {
        this.x = interactStickerStruct;
    }

    public final void setPoints(float[] fArr) {
        this.t = fArr;
    }

    public final void setStatus(int i2) {
        this.s = i2;
    }

    public final class a implements DispatchTouchEventView.a {
        static {
            Covode.recordClassIndex(85619);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispatchTouchEventView.a
        public final void a(int i2) {
            long j2;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            long j3;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            long j4;
            List<PollStruct.OptionsBean> options3;
            PollStruct.OptionsBean optionsBean3;
            List<PollStruct.OptionsBean> options4;
            PollStruct.OptionsBean optionsBean4;
            List<PollStruct.OptionsBean> options5;
            PollStruct.OptionsBean optionsBean5;
            String str;
            i iVar;
            long j5;
            List<PollStruct.OptionsBean> options6;
            PollStruct.OptionsBean optionsBean6;
            long j6;
            List<PollStruct.OptionsBean> options7;
            PollStruct.OptionsBean optionsBean7;
            long j7;
            List<PollStruct.OptionsBean> options8;
            PollStruct.OptionsBean optionsBean8;
            List<PollStruct.OptionsBean> options9;
            PollStruct.OptionsBean optionsBean9;
            List<PollStruct.OptionsBean> options10;
            PollStruct.OptionsBean optionsBean10;
            String str2;
            i iVar2;
            if (!in.d()) {
                Long l2 = null;
                if (i2 == R.id.d6l) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    if (!g2.isLogin()) {
                        Context context = l.this.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity = (Activity) context;
                        j interactStickerParams = l.this.getInteractStickerParams();
                        if (interactStickerParams == null || (iVar2 = interactStickerParams.r) == null || (str2 = iVar2.f134901a) == null) {
                            str2 = "";
                        }
                        com.ss.android.ugc.aweme.login.c.a(activity, str2, "");
                        return;
                    }
                    l lVar = l.this;
                    PollStruct pollStruct = lVar.f130587j;
                    if (pollStruct == null || (options10 = pollStruct.getOptions()) == null || (optionsBean10 = options10.get(0)) == null) {
                        j5 = 0;
                    } else {
                        j5 = optionsBean10.getOptionId();
                    }
                    lVar.f130586i = j5;
                    float a2 = l.this.a(0, 1);
                    TextView textView = l.this.f130580c;
                    StringBuilder sb = new StringBuilder();
                    String a3 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a2)}, 1));
                    h.f.b.l.b(a3, "");
                    textView.setText(sb.append(a3).append("%").toString());
                    TextView textView2 = l.this.f130583f;
                    StringBuilder sb2 = new StringBuilder();
                    String a4 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a2)}, 1));
                    h.f.b.l.b(a4, "");
                    textView2.setText(sb2.append(a4).append("%").toString());
                    l lVar2 = l.this;
                    int i3 = (int) a2;
                    lVar2.a(lVar2.f130578a, l.this.f130579b, l.this.f130580c, i3);
                    l lVar3 = l.this;
                    lVar3.b(lVar3.f130581d, l.this.f130582e, l.this.f130583f, 100 - i3);
                    l.this.setStatus(1);
                    l lVar4 = l.this;
                    PollStruct pollStruct2 = lVar4.f130587j;
                    if (!(pollStruct2 == null || (options9 = pollStruct2.getOptions()) == null || (optionsBean9 = options9.get(0)) == null)) {
                        l2 = Long.valueOf(optionsBean9.getOptionId());
                    }
                    lVar4.a(l2);
                    PollStruct pollStruct3 = l.this.f130587j;
                    if (pollStruct3 != null) {
                        PollStruct pollStruct4 = l.this.f130587j;
                        if (pollStruct4 == null || (options8 = pollStruct4.getOptions()) == null || (optionsBean8 = options8.get(0)) == null) {
                            j7 = 0;
                        } else {
                            j7 = optionsBean8.getOptionId();
                        }
                        pollStruct3.setSelectOptionId(j7);
                    }
                    PollStruct pollStruct5 = l.this.f130587j;
                    if (!(pollStruct5 == null || (options6 = pollStruct5.getOptions()) == null || (optionsBean6 = options6.get(0)) == null)) {
                        PollStruct pollStruct6 = l.this.f130587j;
                        if (pollStruct6 == null || (options7 = pollStruct6.getOptions()) == null || (optionsBean7 = options7.get(0)) == null) {
                            j6 = 0;
                        } else {
                            j6 = optionsBean7.getPollCount();
                        }
                        optionsBean6.setPollCount(j6 + 1);
                    }
                    l.this.a("A");
                    l.this.a();
                } else if (i2 == R.id.d6m) {
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    if (!g3.isLogin()) {
                        Context context2 = l.this.getContext();
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                        Activity activity2 = (Activity) context2;
                        j interactStickerParams2 = l.this.getInteractStickerParams();
                        if (interactStickerParams2 == null || (iVar = interactStickerParams2.r) == null || (str = iVar.f134901a) == null) {
                            str = "";
                        }
                        com.ss.android.ugc.aweme.login.c.a(activity2, str, "");
                        return;
                    }
                    l lVar5 = l.this;
                    PollStruct pollStruct7 = lVar5.f130587j;
                    if (pollStruct7 == null || (options5 = pollStruct7.getOptions()) == null || (optionsBean5 = options5.get(1)) == null) {
                        j2 = 0;
                    } else {
                        j2 = optionsBean5.getOptionId();
                    }
                    lVar5.f130586i = j2;
                    float a5 = l.this.a(1, 1);
                    TextView textView3 = l.this.f130583f;
                    StringBuilder sb3 = new StringBuilder();
                    String a6 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a5)}, 1));
                    h.f.b.l.b(a6, "");
                    textView3.setText(sb3.append(a6).append("%").toString());
                    TextView textView4 = l.this.f130580c;
                    StringBuilder sb4 = new StringBuilder();
                    String a7 = com.a.a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a5)}, 1));
                    h.f.b.l.b(a7, "");
                    textView4.setText(sb4.append(a7).append("%").toString());
                    l lVar6 = l.this;
                    int i4 = (int) a5;
                    lVar6.a(lVar6.f130581d, l.this.f130582e, l.this.f130583f, i4);
                    l lVar7 = l.this;
                    lVar7.b(lVar7.f130578a, l.this.f130579b, l.this.f130580c, 100 - i4);
                    l.this.setStatus(2);
                    l lVar8 = l.this;
                    PollStruct pollStruct8 = lVar8.f130587j;
                    if (!(pollStruct8 == null || (options4 = pollStruct8.getOptions()) == null || (optionsBean4 = options4.get(1)) == null)) {
                        l2 = Long.valueOf(optionsBean4.getOptionId());
                    }
                    lVar8.a(l2);
                    PollStruct pollStruct9 = l.this.f130587j;
                    if (pollStruct9 != null) {
                        PollStruct pollStruct10 = l.this.f130587j;
                        if (pollStruct10 == null || (options3 = pollStruct10.getOptions()) == null || (optionsBean3 = options3.get(1)) == null) {
                            j4 = 0;
                        } else {
                            j4 = optionsBean3.getOptionId();
                        }
                        pollStruct9.setSelectOptionId(j4);
                    }
                    PollStruct pollStruct11 = l.this.f130587j;
                    if (!(pollStruct11 == null || (options = pollStruct11.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                        PollStruct pollStruct12 = l.this.f130587j;
                        if (pollStruct12 == null || (options2 = pollStruct12.getOptions()) == null || (optionsBean2 = options2.get(1)) == null) {
                            j3 = 0;
                        } else {
                            j3 = optionsBean2.getPollCount();
                        }
                        optionsBean.setPollCount(j3 + 1);
                    }
                    l.this.a("B");
                    l.this.a();
                }
            }
        }
    }

    public static final class f implements z<PollResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f130594a;

        static {
            Covode.recordClassIndex(85624);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(l lVar) {
            this.f130594a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(PollResponse pollResponse) {
            h.f.b.l.d(pollResponse, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            h.f.b.l.d(bVar, "");
            this.f130594a.f130585h.a(bVar);
        }
    }

    public final void setPbListener(a aVar) {
        h.f.b.l.d(aVar, "");
        this.y = aVar;
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f130592a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f130593b;

        static {
            Covode.recordClassIndex(85623);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            com.ss.android.ugc.aweme.sticker.k.c cVar;
            if (this.f130593b && (cVar = this.f130592a.f130588k) != null) {
                cVar.c();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f130593b) {
                com.ss.android.ugc.aweme.sticker.k.c cVar = this.f130592a.f130588k;
                if (cVar != null) {
                    cVar.d();
                }
                c animEndListener = this.f130592a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.a();
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f130593b) {
                com.ss.android.ugc.aweme.sticker.k.c cVar = this.f130592a.f130588k;
                if (cVar != null) {
                    cVar.d();
                }
                c animEndListener = this.f130592a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.a();
                }
            }
        }

        e(l lVar, boolean z) {
            this.f130592a = lVar;
            this.f130593b = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(n.a(getContext(), 15.0f));
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 < 0) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (n.b(getContext(), 20.0f) + ((float) rect.width()) + n.b(getContext(), 49.0f) < ((float) this.f130578a.getWidth())) {
                length = length2;
                break;
            }
            length2--;
        }
        if (length >= str.length() - 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, length);
        h.f.b.l.b(substring, "");
        return sb.append(substring).append("...").toString();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(2833);
        super.onDraw(canvas);
        Context context = getContext();
        h.f.b.l.b(context, "");
        if (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a(context) && this.t != null) {
            this.v.reset();
            Path path = this.v;
            float[] fArr = this.t;
            if (fArr == null) {
                h.f.b.l.b();
            }
            float f2 = fArr[0];
            float[] fArr2 = this.t;
            if (fArr2 == null) {
                h.f.b.l.b();
            }
            path.moveTo(f2, fArr2[1]);
            Path path2 = this.v;
            float[] fArr3 = this.t;
            if (fArr3 == null) {
                h.f.b.l.b();
            }
            float f3 = fArr3[2];
            float[] fArr4 = this.t;
            if (fArr4 == null) {
                h.f.b.l.b();
            }
            path2.lineTo(f3, fArr4[3]);
            Path path3 = this.v;
            float[] fArr5 = this.t;
            if (fArr5 == null) {
                h.f.b.l.b();
            }
            float f4 = fArr5[6];
            float[] fArr6 = this.t;
            if (fArr6 == null) {
                h.f.b.l.b();
            }
            path3.lineTo(f4, fArr6[7]);
            Path path4 = this.v;
            float[] fArr7 = this.t;
            if (fArr7 == null) {
                h.f.b.l.b();
            }
            float f5 = fArr7[4];
            float[] fArr8 = this.t;
            if (fArr8 == null) {
                h.f.b.l.b();
            }
            path4.lineTo(f5, fArr8[5]);
            this.v.close();
            if (canvas != null) {
                canvas.drawPath(this.v, this.u);
                MethodCollector.o(2833);
                return;
            }
        }
        MethodCollector.o(2833);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        h.f.b.l.d(context, "");
        MethodCollector.i(2896);
        Object create = PollApi.a.f130308a.createNewRetrofit(Api.f66569d).create(PollApi.class);
        h.f.b.l.b(create, "");
        this.q = (PollApi) create;
        this.f130585h = new f.a.b.a();
        this.u = new Paint();
        this.v = new Path();
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bjw, this, false);
        if (a2 != null) {
            FrameLayout frameLayout = (FrameLayout) a2;
            this.w = frameLayout;
            this.y = new a();
            View findViewById = frameLayout.findViewById(R.id.d6n);
            h.f.b.l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.f130589m = textView;
            View findViewById2 = frameLayout.findViewById(R.id.dot);
            h.f.b.l.b(findViewById2, "");
            ViewGroup viewGroup = (ViewGroup) findViewById2;
            this.n = viewGroup;
            View findViewById3 = frameLayout.findViewById(R.id.d6l);
            h.f.b.l.b(findViewById3, "");
            DispatchTouchEventView dispatchTouchEventView = (DispatchTouchEventView) findViewById3;
            this.f130578a = dispatchTouchEventView;
            View findViewById4 = frameLayout.findViewById(R.id.eju);
            h.f.b.l.b(findViewById4, "");
            this.f130579b = (TextView) findViewById4;
            View findViewById5 = frameLayout.findViewById(R.id.d35);
            h.f.b.l.b(findViewById5, "");
            TextView textView2 = (TextView) findViewById5;
            this.f130580c = textView2;
            View findViewById6 = frameLayout.findViewById(R.id.dou);
            h.f.b.l.b(findViewById6, "");
            ViewGroup viewGroup2 = (ViewGroup) findViewById6;
            this.o = viewGroup2;
            View findViewById7 = frameLayout.findViewById(R.id.d6m);
            h.f.b.l.b(findViewById7, "");
            DispatchTouchEventView dispatchTouchEventView2 = (DispatchTouchEventView) findViewById7;
            this.f130581d = dispatchTouchEventView2;
            View findViewById8 = frameLayout.findViewById(R.id.ejv);
            h.f.b.l.b(findViewById8, "");
            this.f130582e = (TextView) findViewById8;
            View findViewById9 = frameLayout.findViewById(R.id.d36);
            h.f.b.l.b(findViewById9, "");
            TextView textView3 = (TextView) findViewById9;
            this.f130583f = textView3;
            textView2.setAlpha(0.0f);
            textView3.setAlpha(0.0f);
            dispatchTouchEventView.setStatusView(this);
            dispatchTouchEventView2.setStatusView(this);
            dispatchTouchEventView.setClickListener(this.y);
            dispatchTouchEventView2.setClickListener(this.y);
            v.a(viewGroup, n.b(getContext(), 4.0f));
            v.a(viewGroup2, n.b(getContext(), 4.0f));
            Typeface typefaceByFontName = AVExternalServiceImpl.a().typeFaceService().getTypefaceByFontName("");
            if (typefaceByFontName != null) {
                textView.setTypeface(typefaceByFontName);
            }
            int i2 = Build.VERSION.SDK_INT;
            frameLayout.setLayoutDirection(3);
            if (gb.a(getContext())) {
                viewGroup.setLayoutDirection(1);
                viewGroup2.setLayoutDirection(1);
            } else {
                viewGroup.setLayoutDirection(0);
                viewGroup2.setLayoutDirection(0);
            }
            addView(frameLayout);
            this.z = new d(this);
            MethodCollector.o(2896);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(2896);
        throw nullPointerException;
    }

    public final void a(Long l2) {
        PollStruct pollStruct;
        long j2;
        if (l2 != null && (pollStruct = this.f130587j) != null && Long.valueOf(pollStruct.getPollId()) != null) {
            PollApi pollApi = this.q;
            PollStruct pollStruct2 = this.f130587j;
            if (pollStruct2 != null) {
                j2 = pollStruct2.getPollId();
            } else {
                j2 = 0;
            }
            pollApi.poll(j2, l2.longValue()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new f(this));
        }
    }

    public final float a(int i2, int i3) {
        float f2;
        float f3;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        List<PollStruct.OptionsBean> options3;
        PollStruct.OptionsBean optionsBean3;
        PollStruct pollStruct = this.f130587j;
        float f4 = 0.0f;
        if (pollStruct == null || (options3 = pollStruct.getOptions()) == null || (optionsBean3 = options3.get(0)) == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) optionsBean3.getPollCount();
        }
        PollStruct pollStruct2 = this.f130587j;
        if (pollStruct2 == null || (options2 = pollStruct2.getOptions()) == null || (optionsBean2 = options2.get(1)) == null) {
            f3 = 0.0f;
        } else {
            f3 = (float) optionsBean2.getPollCount();
        }
        float f5 = (float) i3;
        float f6 = f2 + f3 + f5;
        if (f6 != 0.0f) {
            PollStruct pollStruct3 = this.f130587j;
            if (!(pollStruct3 == null || (options = pollStruct3.getOptions()) == null || (optionsBean = options.get(i2)) == null)) {
                f4 = (float) optionsBean.getPollCount();
            }
            return ((f4 + f5) / f6) * 100.0f;
        } else if (this.p) {
            return 101.0f;
        } else {
            return 50.0f;
        }
    }

    static void a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2) {
        dispatchTouchEventView.setProgress(0);
        textView2.setAlpha(0.0f);
        textView.setTranslationX(0.0f);
    }

    public final void a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i2) {
        dispatchTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.b5u));
        a(dispatchTouchEventView, textView, textView2, i2, true);
    }

    public final void b(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i2) {
        dispatchTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.b5w));
        a(dispatchTouchEventView, textView, textView2, i2, false);
    }

    /* access modifiers changed from: package-private */
    public final void c(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i2) {
        float width = ((float) ((dispatchTouchEventView.getWidth() - textView.getWidth()) / 2)) - n.b(getContext(), 20.0f);
        if (gb.a(getContext())) {
            width = -width;
        }
        dispatchTouchEventView.setProgress(i2);
        textView2.setAlpha(1.0f);
        textView.setTranslationX(-width);
    }

    private final void a(DispatchTouchEventView dispatchTouchEventView, TextView textView, TextView textView2, int i2, boolean z2) {
        float width = ((float) ((dispatchTouchEventView.getWidth() - textView.getWidth()) / 2)) - n.b(getContext(), 20.0f);
        if (gb.a(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dispatchTouchEventView, "progress", 0, i2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, -width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new e(this, z2));
        animatorSet.start();
    }

    public final void a(PollStruct pollStruct, boolean z2, String str, com.ss.android.ugc.aweme.sticker.k.c cVar, InteractStickerStruct interactStickerStruct) {
        String str2;
        this.f130587j = pollStruct;
        this.p = z2;
        if (str == null) {
            str = "";
        }
        this.f130584g = str;
        this.f130588k = cVar;
        this.x = interactStickerStruct;
        String str3 = null;
        if (pollStruct != null) {
            str2 = pollStruct.getQuestion();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f130589m.setVisibility(8);
        } else {
            this.f130589m.setVisibility(0);
            TextView textView = this.f130589m;
            if (pollStruct != null) {
                str3 = pollStruct.getQuestion();
            }
            textView.setText(str3);
        }
        this.f130579b.post(new g(this, pollStruct, cVar));
    }
}
