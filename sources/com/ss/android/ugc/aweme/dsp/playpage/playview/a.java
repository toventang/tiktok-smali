package com.ss.android.ugc.aweme.dsp.playpage.playview;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.dsp.playpage.playview.a.b;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.d;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.e;
import com.ss.android.ugc.aweme.dsp.playpage.playview.common.MusicInfoView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.x.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends FrameLayout implements VideoSeekBar.c {

    /* renamed from: a  reason: collision with root package name */
    public MusicInfoView f83748a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playpage.playview.d.a f83749b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.b.c f83750c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playpage.base.b f83751d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<p<String, b>> f83752e;

    static {
        Covode.recordClassIndex(52246);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void a(SeekBar seekBar, int i2, boolean z) {
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        Iterator<T> it = this.f83752e.iterator();
        while (it.hasNext()) {
            it.next().getSecond();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        Iterator<T> it = this.f83752e.iterator();
        while (it.hasNext()) {
            ((b) it.next().getSecond()).h();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.a$a  reason: collision with other inner class name */
    public static final class HandlerC1993a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83753a;

        static {
            Covode.recordClassIndex(52247);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            if (message.what == 0) {
                this.f83753a.f83749b.o();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        HandlerC1993a(a aVar, Looper looper) {
            super(looper);
            this.f83753a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void a(SeekBar seekBar) {
        Integer num;
        LinearLayout linearLayout;
        com.ss.android.ugc.aweme.dsp.playpage.playview.d.a aVar = this.f83749b;
        View view = aVar.f83887d;
        if (view != null) {
            num = Integer.valueOf(view.getVisibility());
        } else {
            num = null;
        }
        aVar.f83888e = num;
        View view2 = aVar.f83887d;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        MusicInfoView musicInfoView = this.f83748a;
        d dVar = musicInfoView.f83871c;
        if (!(dVar == null || (linearLayout = dVar.f83838c) == null)) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = musicInfoView.f83870b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void b(SeekBar seekBar) {
        int i2;
        LinearLayout linearLayout;
        MusicInfoView musicInfoView = this.f83748a;
        d dVar = musicInfoView.f83871c;
        if (!(dVar == null || (linearLayout = dVar.f83838c) == null)) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = musicInfoView.f83870b;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.d.a aVar = this.f83749b;
        View view = aVar.f83887d;
        if (view != null) {
            Integer num = aVar.f83888e;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void setData(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        int i2;
        MusicInfoView musicInfoView = this.f83748a;
        if (cVar == null) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        musicInfoView.setVisibility(i2);
        this.f83748a.setData(cVar);
        Iterator<T> it = this.f83752e.iterator();
        while (it.hasNext()) {
            ((b) it.next().getSecond()).b(cVar);
        }
    }

    public final void setPageIndex(int i2) {
        this.f83748a.setPageIndex(i2);
        Iterator<T> it = this.f83752e.iterator();
        while (it.hasNext()) {
            ((b) it.next().getSecond()).a(i2);
        }
    }

    public static final class b implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiggLayout f83760b;

        static {
            Covode.recordClassIndex(52248);
        }

        @Override // com.ss.android.ugc.aweme.feed.x.r.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.feed.x.r.a
        public final void a(MotionEvent motionEvent) {
            com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a aVar;
            com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.b bVar;
            if (motionEvent != null && (aVar = this.f83759a.f83748a.f83872d) != null && (bVar = aVar.f83775b) != null) {
                if (!bVar.f83792d) {
                    if (bVar.a().isLike()) {
                        bVar.f83791c++;
                        bVar.f83792d = true;
                        bVar.a(true);
                    } else if (!bVar.a("click_double_like")) {
                        return;
                    }
                }
                this.f83760b.a(motionEvent.getRawX(), motionEvent.getRawY());
            }
        }

        b(a aVar, DiggLayout diggLayout) {
            this.f83759a = aVar;
            this.f83760b = diggLayout;
        }
    }

    public final void setPlayPage(com.ss.android.ugc.aweme.dsp.playpage.base.b bVar) {
        l.d(bVar, "");
        this.f83751d = bVar;
        this.f83748a.setPlayPage(bVar);
        Iterator<T> it = this.f83752e.iterator();
        while (it.hasNext()) {
            ((b) it.next().getSecond()).a(bVar);
        }
        int g2 = bVar.g();
        l.d(bVar, "");
        if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(bVar.m())) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            g2 += h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
        }
        i.b(this.f83748a, null, null, null, Integer.valueOf(g2), false, 23);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        View.OnTouchListener onTouchListener = null;
        MethodCollector.i(1955);
        ArrayList<p<String, b>> arrayList = new ArrayList<>();
        this.f83752e = arrayList;
        LayoutInflater.from(context).inflate(R.layout.am8, this);
        View findViewById = findViewById(R.id.fld);
        l.b(findViewById, "");
        com.ss.android.ugc.aweme.dsp.b.c cVar = new com.ss.android.ugc.aweme.dsp.b.c((ViewStub) findViewById);
        this.f83750c = cVar;
        View findViewById2 = findViewById(R.id.fle);
        l.b(findViewById2, "");
        com.ss.android.ugc.aweme.dsp.playpage.playview.d.a aVar = new com.ss.android.ugc.aweme.dsp.playpage.playview.d.a((ViewStub) findViewById2);
        this.f83749b = aVar;
        arrayList.add(new p<>("", aVar));
        arrayList.add(new p<>("", cVar));
        View findViewById3 = findViewById(R.id.cqj);
        l.b(findViewById3, "");
        MusicInfoView musicInfoView = (MusicInfoView) findViewById3;
        this.f83748a = musicInfoView;
        musicInfoView.setVisibility(4);
        LongPressLayout longPressLayout = (LongPressLayout) findViewById(R.id.cja);
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        onTouchListener = validTopActivity != null ? r.a(validTopActivity, new HandlerC1993a(this, Looper.getMainLooper()), false, new b(this, (DiggLayout) findViewById(R.id.am5))) : onTouchListener;
        longPressLayout.setListener(new c(this));
        longPressLayout.setTapListener(onTouchListener);
        MethodCollector.o(1955);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }

    static final class c implements LongPressLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83761a;

        static {
            Covode.recordClassIndex(52249);
        }

        c(a aVar) {
            this.f83761a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.feed.ui.LongPressLayout.a
        public final void a(float f2, float f3) {
            Object a2 = a(this.f83761a.getContext(), "vibrator");
            if (!(a2 instanceof Vibrator)) {
                a2 = null;
            }
            Vibrator vibrator = (Vibrator) a2;
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
            e eVar = this.f83761a.f83748a.f83873e;
            if (eVar != null) {
                eVar.a();
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(1994);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(1994);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }
}
