package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import h.f.b.z;
import java.io.File;
import java.net.InetAddress;
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public final class j extends a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    public static final int A = ((int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 32.0f));
    public static final b B = new b((byte) 0);
    public static final String t = CaptionServiceImpl.a().getCaptionCacheDir();
    public static final int u = ((int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 200.0f));
    public static final int v = ((int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 8.0f));
    public static final int w = (((int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 58.0f)) + com.ss.android.ugc.aweme.base.utils.i.b());
    public static final int x;
    public static final int y;
    public static final int z;
    private int C;
    private ValueAnimator D;
    private int E;
    private String F;
    private com.ss.android.ugc.aweme.sticker.data.c G;
    private int H;
    private final h.h I = h.i.a((h.f.a.a) g.f130528a);
    private int J;
    private FrameLayout K;
    private FrameLayout L;

    /* renamed from: a  reason: collision with root package name */
    public int f130516a = 2;

    /* renamed from: l  reason: collision with root package name */
    public volatile int f130517l;

    /* renamed from: m  reason: collision with root package name */
    public volatile String f130518m;
    public com.bytedance.tux.tooltip.a n;
    public final i o;
    public TextView p;
    public ImageView q;
    public View r;
    public Aweme s;

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int b() {
        return 11;
    }

    public final ITranslatedCaptionService c() {
        return (ITranslatedCaptionService) this.I.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void f() {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(203, new org.greenrobot.eventbus.g(j.class, "onAlwaysShowCaptionEvent", com.ss.android.ugc.aweme.al.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(204, new org.greenrobot.eventbus.g(j.class, "onCaptionHiddenStateEvent", com.ss.android.ugc.aweme.main.f.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(205, new org.greenrobot.eventbus.g(j.class, "onVideoPositionChangeEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(85583);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a(String str, String str2, Exception exc) {
        if (str2 == null || str == null) {
            a(exc);
        } else {
            ab.a((Callable) new CallableC3407j(str, str2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(this, exc), l.f130538a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3) {
        com.bytedance.tux.tooltip.a aVar = this.n;
        if (aVar != null && aVar.isShowing()) {
            return true;
        }
        FrameLayout frameLayout = this.K;
        if (frameLayout == null || frameLayout.getX() > f2 || frameLayout.getX() + ((float) frameLayout.getWidth()) < f2 || frameLayout.getY() > f3 || frameLayout.getY() + ((float) frameLayout.getHeight()) < f3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
    public final boolean a(long j2, int i2, float f2, float f3, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b bVar) {
        List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions;
        com.ss.android.ugc.aweme.sticker.data.b bVar2;
        String language;
        List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions2;
        com.ss.android.ugc.aweme.sticker.data.b bVar3;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        com.ss.android.ugc.aweme.sticker.i iVar4;
        com.ss.android.ugc.aweme.sticker.i iVar5;
        com.ss.android.ugc.aweme.sticker.i iVar6;
        List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions3;
        com.ss.android.ugc.aweme.sticker.data.b bVar4;
        h.f.b.l.d(bVar, "");
        bj.d("FeedCaptionView click captionview");
        if (!a(j2, i2, f2, f3)) {
            return false;
        }
        int i3 = this.f130516a;
        if (i3 == 2) {
            bj.d("FeedCaptionView click caption isFirst: " + (!com.ss.android.ugc.aweme.shortvideo.b.a()));
            if (!com.ss.android.ugc.aweme.shortvideo.b.a()) {
                Activity j3 = com.bytedance.ies.ugc.appcontext.f.j();
                if (!(j3 instanceof androidx.fragment.app.e)) {
                    j3 = null;
                }
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) j3;
                if (eVar != null) {
                    com.ss.android.ugc.aweme.shortvideo.b.f124987a.storeBoolean("has_tap_feed_caption", true);
                    i iVar7 = new i(this.f130436i, (byte) 0);
                    com.bytedance.tux.sheet.sheet.a aVar = new a.C1112a().a(iVar7).a(o.f130541a).f45299a;
                    iVar7.getBtnDismiss().setOnClickListener(new m(aVar));
                    iVar7.getIvClose().setOnClickListener(new n(aVar));
                    aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(true, false));
                }
                r();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", 0).a("have_transl", ah.b(this.s) ? 1 : 0).a("subtitle_type", "creator");
                com.ss.android.ugc.aweme.sticker.data.d e2 = com.ss.android.ugc.aweme.feed.x.g.e(this.s);
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_lang", (e2 == null || (autoCaptions3 = e2.getAutoCaptions()) == null || (bVar4 = autoCaptions3.get(0)) == null) ? null : bVar4.getLanguage());
                com.ss.android.ugc.aweme.sticker.j jVar = this.f130438k;
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", (jVar == null || (iVar6 = jVar.r) == null) ? null : iVar6.f134903c);
                com.ss.android.ugc.aweme.sticker.j jVar2 = this.f130438k;
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", (jVar2 == null || (iVar5 = jVar2.r) == null) ? null : iVar5.f134902b);
                com.ss.android.ugc.aweme.sticker.j jVar3 = this.f130438k;
                com.ss.android.ugc.aweme.common.r.a("subtitle_intro_show", a5.a("enter_from", (jVar3 == null || (iVar4 = jVar3.r) == null) ? null : iVar4.f134901a).f66730a);
            } else {
                com.bytedance.tux.tooltip.a aVar2 = this.n;
                if (aVar2 == null || !aVar2.isShowing()) {
                    b(f2, f3);
                    r();
                } else {
                    i();
                }
            }
        } else if (i3 == 0) {
            StringBuilder sb = new StringBuilder("FeedCaptionView flPb isVisibility ");
            FrameLayout frameLayout = this.L;
            bj.d(sb.append(frameLayout != null && frameLayout.getVisibility() == 0).append(" curDownloadStatus ").append(this.E).toString());
            FrameLayout frameLayout2 = this.L;
            if (frameLayout2 != null && frameLayout2.getVisibility() == 0) {
                return true;
            }
            c().a(false);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            com.ss.android.ugc.aweme.sticker.j jVar4 = this.f130438k;
            com.ss.android.ugc.aweme.app.f.d a6 = dVar.a("group_id", (jVar4 == null || (iVar3 = jVar4.r) == null) ? null : iVar3.f134903c);
            com.ss.android.ugc.aweme.sticker.j jVar5 = this.f130438k;
            com.ss.android.ugc.aweme.app.f.d a7 = a6.a("author_id", (jVar5 == null || (iVar2 = jVar5.r) == null) ? null : iVar2.f134902b);
            com.ss.android.ugc.aweme.sticker.j jVar6 = this.f130438k;
            com.ss.android.ugc.aweme.app.f.d a8 = a7.a("enter_from", (jVar6 == null || (iVar = jVar6.r) == null) ? null : iVar.f134901a).a("use_transl", 0).a("subtitle_type", "creator").a("have_transl", ah.b(this.s) ? 1 : 0);
            com.ss.android.ugc.aweme.sticker.data.d e3 = com.ss.android.ugc.aweme.feed.x.g.e(this.s);
            com.ss.android.ugc.aweme.common.r.a("expand_subtitle", a8.a("subtitle_lang", (e3 == null || (autoCaptions2 = e3.getAutoCaptions()) == null || (bVar3 = autoCaptions2.get(0)) == null) ? null : bVar3.getLanguage()).f66730a);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.a(true, this));
            int i4 = this.E;
            if (i4 == 1) {
                this.C = 1;
                ImageView imageView = this.q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                FrameLayout frameLayout3 = this.L;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                this.r = this.L;
            } else if (i4 != 2) {
                com.ss.android.ugc.aweme.sticker.data.d e4 = com.ss.android.ugc.aweme.feed.x.g.e(this.s);
                if (!(e4 == null || (autoCaptions = e4.getAutoCaptions()) == null || (bVar2 = (com.ss.android.ugc.aweme.sticker.data.b) h.a.n.b((List) autoCaptions, 0)) == null || (language = bVar2.getLanguage()) == null)) {
                    this.C = 1;
                    this.E = 1;
                    b(language);
                    ImageView imageView2 = this.q;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    FrameLayout frameLayout4 = this.L;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                    }
                    this.r = this.L;
                }
            } else {
                this.r = this.q;
                a(true);
            }
        }
        return true;
    }

    public final void a(boolean z2) {
        TextView textView;
        TextView textView2;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        TextView textView3;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct2;
        TextView textView4;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        h.f.b.l.b(ofInt, "");
        ofInt.setDuration(200L);
        this.D = ofInt;
        if (!gb.a() && (textView4 = this.p) != null) {
            textView4.setPivotX(0.0f);
        }
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null || captionStruct2.getLocation() != com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue()) {
            TextView textView5 = this.p;
            if (textView5 != null) {
                textView5.setPivotY(0.0f);
            }
        } else {
            TextView textView6 = this.p;
            if (textView6 != null) {
                textView6.setPivotY((float) textView6.getHeight());
            }
        }
        if (z2) {
            this.f130516a = 3;
            TextView textView7 = this.p;
            if (textView7 != null) {
                textView7.setScaleX(1.0f);
            }
            TextView textView8 = this.p;
            if (textView8 != null) {
                textView8.setScaleY(1.0f);
            }
            com.ss.android.ugc.aweme.sticker.data.c cVar = this.G;
            String a2 = cVar != null ? cVar.a(this.H) : null;
            boolean isEmpty = TextUtils.isEmpty(a2);
            z.c cVar2 = new z.c();
            int i2 = z;
            cVar2.element = i2;
            z.c cVar3 = new z.c();
            cVar3.element = A;
            if (isEmpty) {
                TextView textView9 = this.p;
                if (textView9 != null) {
                    textView9.setAlpha(1.0f);
                }
                TextView textView10 = this.p;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            } else {
                TextView textView11 = this.p;
                if (textView11 != null) {
                    textView11.setVisibility(0);
                }
                TextView textView12 = this.p;
                if (textView12 != null) {
                    textView12.setAlpha(0.0f);
                }
                TextView textView13 = this.p;
                if (textView13 != null) {
                    textView13.setText(a2);
                }
                TextView textView14 = this.p;
                if (textView14 != null) {
                    textView14.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                TextView textView15 = this.p;
                if (textView15 == null) {
                    h.f.b.l.b();
                }
                cVar2.element = textView15.getMeasuredWidth();
                TextView textView16 = this.p;
                if (textView16 == null) {
                    h.f.b.l.b();
                }
                cVar3.element = textView16.getMeasuredHeight();
                InteractStickerStruct interactStickerStruct2 = this.f130433f;
                if (!(interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || captionStruct.getLocation() != com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue() || (textView3 = this.p) == null)) {
                    textView3.setPivotY((float) cVar3.element);
                }
                if (gb.a() && (textView2 = this.p) != null) {
                    textView2.setPivotX((float) cVar2.element);
                }
            }
            ofInt.addUpdateListener(new c(this, isEmpty, cVar2, cVar3));
            ofInt.addListener(new d(this));
        } else {
            this.f130516a = 1;
            TextView textView17 = this.p;
            if (textView17 == null) {
                h.f.b.l.b();
            }
            int width = textView17.getWidth();
            TextView textView18 = this.p;
            if (textView18 == null) {
                h.f.b.l.b();
            }
            int height = textView18.getHeight();
            if (gb.a() && (textView = this.p) != null) {
                textView.setPivotX((float) width);
            }
            ImageView imageView = this.q;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.q;
            if (imageView2 != null) {
                imageView2.setAlpha(0.0f);
            }
            ofInt.addUpdateListener(new e(this, width, height));
            ofInt.addListener(new f(this));
        }
        ofInt.start();
    }

    static final class g extends h.f.b.m implements h.f.a.a<ITranslatedCaptionService> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f130528a = new g();

        static {
            Covode.recordClassIndex(85588);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ITranslatedCaptionService invoke() {
            return TranslatedCaptionCacheServiceImpl.j();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final void h() {
        q();
        this.n = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final View e() {
        MethodCollector.i(4328);
        View view = new View(this.f130436i);
        MethodCollector.o(4328);
        return view;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void i() {
        com.bytedance.tux.tooltip.a aVar = this.n;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    private void q() {
        if (this.f130517l != 0) {
            Downloader instance = Downloader.getInstance(this.f130436i);
            instance.removeMainThreadListener(this.f130517l, this.o);
            instance.cancel(this.f130517l, true);
            this.f130517l = 0;
            this.f130518m = null;
        }
    }

    private final void g() {
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        List<com.ss.android.ugc.aweme.sticker.data.h> utterances;
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct != null && (captionStruct = interactStickerStruct.getCaptionStruct()) != null && captionStruct.getUtterances() != null && (utterances = captionStruct.getUtterances()) != null) {
            h.a.n.a((Iterable) utterances, (Comparator) new a());
            this.G = new com.ss.android.ugc.aweme.sticker.data.c(utterances);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j$j  reason: collision with other inner class name */
    public static final class CallableC3407j<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f130534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f130535b;

        static {
            Covode.recordClassIndex(85591);
        }

        CallableC3407j(String str, String str2) {
            this.f130534a = str;
            this.f130535b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String a2 = com.bytedance.common.utility.d.a(new File(this.f130534a));
            InetAddress byName = InetAddress.getByName(new URL(this.f130535b).getHost());
            h.f.b.l.b(byName, "");
            bj.b("FeedCaptionView url: " + this.f130535b + " file_md5: " + a2 + " ip: " + byName.getHostAddress());
            return h.z.f158842a;
        }
    }

    private final void p() {
        if (!c().b()) {
            this.f130516a = 2;
            ImageView imageView = this.q;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(8);
                textView.setAlpha(1.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
            }
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (this.E == 2) {
                g();
                return;
            }
            return;
        }
        this.f130516a = 0;
        TextView textView2 = this.p;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView2 = this.q;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.q;
        if (imageView3 != null) {
            imageView3.setAlpha(1.0f);
        }
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
    }

    private final void r() {
        String str;
        String str2;
        String str3;
        com.ss.android.ugc.aweme.sticker.i iVar;
        com.ss.android.ugc.aweme.sticker.i iVar2;
        com.ss.android.ugc.aweme.sticker.i iVar3;
        List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions;
        com.ss.android.ugc.aweme.sticker.data.b bVar;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("have_transl", 0).a("use_transl", 0).a("subtitle_type", "creator");
        com.ss.android.ugc.aweme.sticker.data.d e2 = com.ss.android.ugc.aweme.feed.x.g.e(this.s);
        String str4 = null;
        if (e2 == null || (autoCaptions = e2.getAutoCaptions()) == null || (bVar = autoCaptions.get(0)) == null) {
            str = null;
        } else {
            str = bVar.getLanguage();
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_lang", str);
        com.ss.android.ugc.aweme.sticker.j jVar = this.f130438k;
        if (jVar == null || (iVar3 = jVar.r) == null) {
            str2 = null;
        } else {
            str2 = iVar3.f134903c;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", str2);
        com.ss.android.ugc.aweme.sticker.j jVar2 = this.f130438k;
        if (jVar2 == null || (iVar2 = jVar2.r) == null) {
            str3 = null;
        } else {
            str3 = iVar2.f134902b;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str3);
        com.ss.android.ugc.aweme.sticker.j jVar3 = this.f130438k;
        if (!(jVar3 == null || (iVar = jVar3.r) == null)) {
            str4 = iVar.f134901a;
        }
        com.ss.android.ugc.aweme.common.r.a("click_subtitle", a5.a("enter_from", str4).f66730a);
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f130530b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f130531c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f130532d;

        static {
            Covode.recordClassIndex(85589);
        }

        h(j jVar, String str, String str2, int i2) {
            this.f130529a = jVar;
            this.f130530b = str;
            this.f130531c = str2;
            this.f130532d = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            j jVar = this.f130529a;
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.f130530b);
            with.f83081f = j.t;
            StringBuilder sb = new StringBuilder();
            Aweme aweme = this.f130529a.s;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            with.f83078c = sb.append(str).append('_').append(this.f130531c).append(".json").toString();
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(this.f130532d).a(true);
            a2.C = this.f130529a.o;
            jVar.f130517l = a2.f();
            this.f130529a.f130518m = this.f130530b;
            bj.d("FeedCaptionView start download caption,downloadId: " + this.f130529a.f130517l + " downloadUrl: " + this.f130529a.f130518m);
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(85581);
        int a2 = (int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 16.0f);
        x = a2;
        int a3 = (int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 56.0f);
        y = a3;
        z = Math.min((int) r.a(com.bytedance.ies.ugc.appcontext.d.a(), 320.0f), (com.ss.android.ugc.aweme.base.utils.i.b(com.bytedance.ies.ugc.appcontext.d.a()) - a2) - a3);
    }

    private final void o() {
        int a2;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct2;
        if (this.p != null) {
            if (this.n == null) {
                InteractStickerStruct interactStickerStruct = this.f130433f;
                if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null || captionStruct2.getLocation() != com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue()) {
                    a2 = (int) r.a(this.f130436i, 8.0f);
                } else {
                    a2 = -((int) r.a(this.f130436i, 8.0f));
                }
                com.bytedance.tux.tooltip.a.a.b bVar = new com.bytedance.tux.tooltip.a.a.b(this.f130436i);
                TextView textView = this.p;
                if (textView == null) {
                    h.f.b.l.b();
                }
                com.bytedance.tux.tooltip.b d2 = ((com.bytedance.tux.tooltip.a.a.b) bVar.b(textView).a(androidx.core.content.b.c(this.f130436i, R.color.c7)).a(-1001L).b(0L)).a(new p(this)).b(a2).a(false).d(x);
                InteractStickerStruct interactStickerStruct2 = this.f130433f;
                if (interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || captionStruct.getLocation() != com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue()) {
                    d2.a(com.bytedance.tux.tooltip.h.BOTTOM);
                } else {
                    d2.a(com.bytedance.tux.tooltip.h.TOP);
                }
                this.n = d2.d();
            }
            com.bytedance.tux.tooltip.a aVar = this.n;
            if (aVar == null) {
                h.f.b.l.b();
            }
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public final View a() {
        int b2;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        com.ss.android.ugc.aweme.sticker.data.b bVar;
        String language;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        LayoutInflater from = LayoutInflater.from(this.f130436i);
        View view = this.f130437j;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View a2 = com.a.a(from, R.layout.bjh, (ViewGroup) view, false);
        v.b(a2, gb.a() ? 1 : 0);
        this.p = (TextView) a2.findViewById(R.id.ewm);
        this.K = (FrameLayout) a2.findViewById(R.id.b4o);
        this.q = (ImageView) a2.findViewById(R.id.buv);
        this.L = (FrameLayout) a2.findViewById(R.id.b63);
        ProgressBar progressBar = (ProgressBar) a2.findViewById(R.id.d2p);
        h.f.b.l.b(progressBar, "");
        progressBar.getIndeterminateDrawable().setColorFilter(androidx.core.content.b.c(this.f130436i, R.color.ac), PorterDuff.Mode.SRC_IN);
        this.C = 0;
        com.ss.android.ugc.aweme.sticker.data.d e2 = com.ss.android.ugc.aweme.feed.x.g.e(this.s);
        if (e2 != null) {
            com.ss.android.ugc.aweme.sticker.j jVar = this.f130438k;
            if (jVar != null) {
                b2 = (int) jVar.f134920a;
            } else {
                b2 = com.ss.android.ugc.aweme.base.utils.i.b(this.f130436i);
            }
            TextView textView = this.p;
            if (textView != null) {
                textView.setMaxWidth(z);
            }
            ViewParent parent = ((ViewGroup) this.f130437j).getParent();
            h.f.b.l.b(parent, "");
            ViewParent parent2 = parent.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            int width = ((ViewGroup) parent2).getWidth();
            if (width == 0) {
                width = com.ss.android.ugc.aweme.base.utils.i.b(this.f130436i);
            }
            bj.d("FeedCaptionView getView videoWidth " + b2 + " screenWidth " + width);
            int i3 = x;
            int i4 = ((b2 - width) / 2) + i3;
            InteractStickerStruct interactStickerStruct = this.f130433f;
            if (interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null || captionStruct.getLocation() != com.ss.android.ugc.aweme.sticker.data.a.LEFT_TOP.getValue()) {
                i2 = 80;
            } else {
                i2 = 48;
            }
            FrameLayout frameLayout = this.K;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.gravity = i2 | 8388611;
                layoutParams2.setMarginStart(i4);
                layoutParams2.setMarginEnd((y - i3) + i4);
            }
            if (!com.ss.android.ugc.tools.utils.d.a(e2.getUtterances())) {
                this.E = 2;
                List<com.ss.android.ugc.aweme.sticker.data.h> utterances = e2.getUtterances();
                if (utterances != null) {
                    this.G = new com.ss.android.ugc.aweme.sticker.data.c(utterances);
                }
            } else {
                this.E = 0;
                List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions = e2.getAutoCaptions();
                if (!(autoCaptions == null || (bVar = (com.ss.android.ugc.aweme.sticker.data.b) h.a.n.b((List) autoCaptions, 0)) == null || (language = bVar.getLanguage()) == null)) {
                    this.E = 1;
                    b(language);
                }
            }
        }
        p();
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(InteractStickerStruct interactStickerStruct) {
        super.a(interactStickerStruct);
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(85597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f130542a;

            static {
                Covode.recordClassIndex(85598);
            }

            a(p pVar) {
                this.f130542a = pVar;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                com.ss.android.ugc.aweme.sticker.i iVar;
                com.ss.android.ugc.aweme.sticker.i iVar2;
                com.ss.android.ugc.aweme.sticker.i iVar3;
                List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions;
                com.ss.android.ugc.aweme.sticker.data.b bVar;
                ClickAgent.onClick(view);
                this.f130542a.this$0.c().a(true);
                j jVar = this.f130542a.this$0;
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("use_transl", 0).a("subtitle_type", "creator").a("have_transl", ah.b(jVar.s) ? 1 : 0);
                com.ss.android.ugc.aweme.sticker.data.d e2 = com.ss.android.ugc.aweme.feed.x.g.e(jVar.s);
                String str4 = null;
                if (e2 == null || (autoCaptions = e2.getAutoCaptions()) == null || (bVar = autoCaptions.get(0)) == null) {
                    str = null;
                } else {
                    str = bVar.getLanguage();
                }
                com.ss.android.ugc.aweme.app.f.d a3 = a2.a("subtitle_lang", str);
                com.ss.android.ugc.aweme.sticker.j jVar2 = jVar.f130438k;
                if (jVar2 == null || (iVar3 = jVar2.r) == null) {
                    str2 = null;
                } else {
                    str2 = iVar3.f134903c;
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", str2);
                com.ss.android.ugc.aweme.sticker.j jVar3 = jVar.f130438k;
                if (jVar3 == null || (iVar2 = jVar3.r) == null) {
                    str3 = null;
                } else {
                    str3 = iVar2.f134902b;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str3);
                com.ss.android.ugc.aweme.sticker.j jVar4 = jVar.f130438k;
                if (!(jVar4 == null || (iVar = jVar4.r) == null)) {
                    str4 = iVar.f134901a;
                }
                com.ss.android.ugc.aweme.common.r.a("hide_subtitle", a5.a("enter_from", str4).f66730a);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.a(false, this.f130542a.this$0));
                this.f130542a.this$0.a(false);
                com.bytedance.tux.tooltip.a aVar = this.f130542a.this$0.n;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
            com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            d.b bVar = new d.b();
            bVar.f45497c = R.string.h_a;
            bVar.f45500f = new a(this);
            dVar2.a(bVar);
            return h.z.f158842a;
        }
    }

    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130523a;

        static {
            Covode.recordClassIndex(85585);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(j jVar) {
            this.f130523a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f130523a.r;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f130523a.f130516a = 2;
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130527a;

        static {
            Covode.recordClassIndex(85587);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(j jVar) {
            this.f130527a = jVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            TextView textView = this.f130527a.p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.f130527a.f130516a = 0;
        }
    }

    public static final class i extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130533a;

        static {
            Covode.recordClassIndex(85590);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(j jVar) {
            this.f130533a = jVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            j jVar = this.f130533a;
            if (downloadInfo != null) {
                str = downloadInfo.getTargetFilePath();
            } else {
                str = null;
            }
            jVar.a(str);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo r6, com.ss.android.socialbase.downloader.exception.BaseException r7) {
            /*
                r5 = this;
                super.onFailed(r6, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j r0 = r5.f130533a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.s
                java.lang.String r4 = ""
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r0.getAid()
                if (r3 != 0) goto L_0x0012
            L_0x0011:
                r3 = r4
            L_0x0012:
                if (r6 == 0) goto L_0x001a
                java.lang.String r0 = r6.getUrl()
                if (r0 != 0) goto L_0x0033
            L_0x001a:
                r1 = 0
                r0 = 1
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j.a(r0, r3, r4, r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j r2 = r5.f130533a
                r1 = 0
                if (r6 == 0) goto L_0x0031
                java.lang.String r0 = r6.getTargetFilePath()
                java.lang.String r1 = r6.getUrl()
            L_0x002d:
                r2.a(r0, r1, r7)
                return
            L_0x0031:
                r0 = r1
                goto L_0x002d
            L_0x0033:
                r4 = r0
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j.i.onFailed(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Exception f130537b;

        static {
            Covode.recordClassIndex(85592);
        }

        k(j jVar, Exception exc) {
            this.f130536a = jVar;
            this.f130537b = exc;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f130536a.a(this.f130537b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f130538a = new l();

        static {
            Covode.recordClassIndex(85593);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            bj.a((Throwable) obj);
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f130539a;

        static {
            Covode.recordClassIndex(85594);
        }

        m(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f130539a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130539a.dismiss();
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a f130540a;

        static {
            Covode.recordClassIndex(85595);
        }

        n(com.bytedance.tux.sheet.sheet.a aVar) {
            this.f130540a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130540a.dismiss();
        }
    }

    static final class o implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final o f130541a = new o();

        static {
            Covode.recordClassIndex(85596);
        }

        o() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.d(false, false));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void b(int i2) {
        super.b(i2);
        q();
        EventBus.a().b(this);
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onCaptionHiddenStateEvent(com.ss.android.ugc.aweme.main.f.a aVar) {
        h.f.b.l.d(aVar, "");
        if (aVar.f109258a && this.f130516a == 2) {
            return;
        }
        if (aVar.f109258a || this.f130516a != 0) {
            p();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onAlwaysShowCaptionEvent(com.ss.android.ugc.aweme.al.a aVar) {
        h.f.b.l.d(aVar, "");
        if (!h.f.b.l.a(this, aVar.f66362b)) {
            if (aVar.f66361a && this.f130516a == 2) {
                return;
            }
            if (aVar.f66361a || this.f130516a != 0) {
                p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f130520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f130521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.c f130522d;

        static {
            Covode.recordClassIndex(85584);
        }

        c(j jVar, boolean z, z.c cVar, z.c cVar2) {
            this.f130519a = jVar;
            this.f130520b = z;
            this.f130521c = cVar;
            this.f130522d = cVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f130519a.r;
            if (view != null) {
                h.f.b.l.b(valueAnimator, "");
                view.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f130520b) {
                TextView textView = this.f130519a.p;
                if (textView != null) {
                    h.f.b.l.b(valueAnimator, "");
                    textView.setAlpha(valueAnimator.getAnimatedFraction());
                }
                TextView textView2 = this.f130519a.p;
                if (textView2 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    textView2.setScaleX(((((float) j.A) * 1.0f) / ((float) this.f130521c.element)) + ((((float) (this.f130521c.element - j.A)) * valueAnimator.getAnimatedFraction()) / ((float) this.f130521c.element)));
                }
                TextView textView3 = this.f130519a.p;
                if (textView3 != null) {
                    h.f.b.l.b(valueAnimator, "");
                    textView3.setScaleY(((((float) j.A) * 1.0f) / ((float) this.f130522d.element)) + ((((float) (this.f130522d.element - j.A)) * valueAnimator.getAnimatedFraction()) / ((float) this.f130522d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f130524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f130525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f130526c;

        static {
            Covode.recordClassIndex(85586);
        }

        e(j jVar, int i2, int i3) {
            this.f130524a = jVar;
            this.f130525b = i2;
            this.f130526c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f130524a.q;
            if (imageView != null) {
                h.f.b.l.b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            TextView textView = this.f130524a.p;
            if (textView != null) {
                h.f.b.l.b(valueAnimator, "");
                textView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            TextView textView2 = this.f130524a.p;
            if (textView2 != null) {
                int i2 = this.f130525b;
                h.f.b.l.b(valueAnimator, "");
                textView2.setScaleX(((((float) i2) - (((float) (i2 - j.A)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f130525b));
            }
            TextView textView3 = this.f130524a.p;
            if (textView3 != null) {
                int i3 = this.f130526c;
                h.f.b.l.b(valueAnimator, "");
                textView3.setScaleY(((((float) i3) - (((float) (i3 - j.A)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f130526c));
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onVideoPositionChangeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.g gVar) {
        String str;
        String str2;
        int i2;
        int i3;
        h.f.b.l.d(gVar, "");
        Aweme aweme = this.s;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = gVar.f95111a;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (!(!h.f.b.l.a((Object) str, (Object) str2))) {
            Long l2 = gVar.f95112b;
            if (l2 != null) {
                i2 = (int) l2.longValue();
            } else {
                i2 = 0;
            }
            this.H = i2;
            if (this.f130516a == 2) {
                com.bytedance.tux.tooltip.a aVar = this.n;
                if (aVar == null || !aVar.isShowing()) {
                    com.ss.android.ugc.aweme.sticker.data.c cVar = this.G;
                    if (cVar != null) {
                        Long l3 = gVar.f95112b;
                        if (l3 != null) {
                            i3 = (int) l3.longValue();
                        } else {
                            i3 = 0;
                        }
                        str3 = cVar.a(i3);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        TextView textView = this.p;
                        if (textView != null) {
                            textView.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    TextView textView2 = this.p;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = this.p;
                    if (textView3 != null) {
                        textView3.setText(str3);
                    }
                }
            }
        }
    }

    private void b(String str) {
        String str2;
        String a2;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct2;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct3;
        StringBuilder append = new StringBuilder("FeedCaptionView switchCaptionLang trySelectLang ").append(str).append(" toSelectLang ").append(this.F).append(" aweme curSelectLang ");
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct == null || (captionStruct3 = interactStickerStruct.getCaptionStruct()) == null) {
            str2 = null;
        } else {
            str2 = captionStruct3.getSelectLang();
        }
        bj.d(append.append(str2).toString());
        if (str == null || str.length() == 0) {
            bj.d("FeedCaptionView selectLang has not initialized");
        } else if (!h.f.b.l.a((Object) str, (Object) this.F)) {
            this.F = str;
            this.J = 0;
            q();
            TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            InteractStickerStruct interactStickerStruct2 = this.f130433f;
            if (!(interactStickerStruct2 == null || (captionStruct2 = interactStickerStruct2.getCaptionStruct()) == null)) {
                captionStruct2.setSelectLang("null");
            }
            InteractStickerStruct interactStickerStruct3 = this.f130433f;
            if (!(interactStickerStruct3 == null || (captionStruct = interactStickerStruct3.getCaptionStruct()) == null)) {
                captionStruct.setUtterances(null);
            }
            this.G = null;
            if (!h.f.b.l.a((Object) "null", (Object) str) && (a2 = a(this.f130433f, this.F)) != null && a2.length() != 0) {
                if (h.m.p.b(a2, "http", false)) {
                    a(a2, this.F, 3);
                } else {
                    a(a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void a(com.ss.android.ugc.aweme.sticker.j jVar) {
        h.f.b.l.d(jVar, "");
        super.a(jVar);
    }

    public final void a(Exception exc) {
        String str;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        this.E = 3;
        StringBuilder sb = new StringBuilder("FeedCaptionView download captions failed aid ");
        Aweme aweme = this.s;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        bj.b(sb.append(str).append(" lang ").append(this.F).append(" url ").append(this.f130518m).toString());
        bj.a(exc);
        new com.bytedance.tux.g.b(this.f130437j).e(R.string.a_5).b();
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (!(interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null)) {
            str2 = captionStruct.getSelectLang();
        }
        this.F = str2;
        q();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public final void a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.j.a(java.lang.String):void");
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(85582);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.getStartTime()), Long.valueOf(t2.getStartTime()));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final boolean b(float f2, float f3) {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.i(hashCode()));
        o();
        return true;
    }

    private static String a(InteractStickerStruct interactStickerStruct, String str) {
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        List<String> urlList;
        String str2;
        if (interactStickerStruct == null || (captionStruct = interactStickerStruct.getCaptionStruct()) == null) {
            return null;
        }
        List<com.ss.android.ugc.aweme.sticker.data.b> autoCaptions = captionStruct.getAutoCaptions();
        if (autoCaptions == null) {
            autoCaptions = h.a.z.INSTANCE;
        }
        for (com.ss.android.ugc.aweme.sticker.data.b bVar : autoCaptions) {
            if (h.f.b.l.a((Object) bVar.getLanguage(), (Object) str)) {
                UrlModel url = bVar.getUrl();
                if (url == null || (urlList = url.getUrlList()) == null || (str2 = (String) h.a.n.b((List) urlList, 0)) == null) {
                    return "";
                }
                return str2;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a
    public final void b(int i2, int i3) {
        int value;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct;
        List<com.ss.android.ugc.aweme.sticker.data.h> utterances;
        com.ss.android.ugc.aweme.sticker.data.h hVar;
        com.ss.android.ugc.aweme.sticker.data.d captionStruct2;
        super.b(i2, i3);
        InteractStickerStruct interactStickerStruct = this.f130433f;
        if (interactStickerStruct == null || (captionStruct2 = interactStickerStruct.getCaptionStruct()) == null) {
            value = com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue();
        } else {
            value = captionStruct2.getLocation();
        }
        ViewParent parent = this.f130437j.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int i4 = viewGroup.getLayoutParams().height;
        InteractStickerStruct interactStickerStruct2 = this.f130433f;
        if (!(interactStickerStruct2 == null || (captionStruct = interactStickerStruct2.getCaptionStruct()) == null || (utterances = captionStruct.getUtterances()) == null || (hVar = (com.ss.android.ugc.aweme.sticker.data.h) h.a.n.b((List) utterances, 0)) == null)) {
            hVar.getText();
        }
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams6 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams7 == null) {
            return;
        }
        if (value == com.ss.android.ugc.aweme.sticker.data.a.LEFT_BOTTOM.getValue()) {
            layoutParams7.gravity = 8388691;
            TextView textView = this.p;
            if (textView != null) {
                layoutParams4 = textView.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
                layoutParams4 = null;
            }
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams4;
            if (layoutParams8 != null) {
                layoutParams8.gravity = 8388691;
            }
            ImageView imageView = this.q;
            if (imageView != null) {
                layoutParams5 = imageView.getLayoutParams();
            } else {
                layoutParams5 = null;
            }
            if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                layoutParams6 = layoutParams5;
            }
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams6;
            if (layoutParams9 != null) {
                layoutParams9.gravity = 8388691;
            }
            layoutParams7.bottomMargin = (((viewGroup.getLayoutParams().height + i3) / 2) - i2) + v;
            FrameLayout frameLayout2 = this.K;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams7);
            }
            bj.d("FeedCaptionView caption location: start_bottom bottomMargin: " + layoutParams7.bottomMargin);
        } else if (value == com.ss.android.ugc.aweme.sticker.data.a.LEFT_TOP.getValue()) {
            layoutParams7.gravity = 8388659;
            TextView textView2 = this.p;
            if (textView2 != null) {
                layoutParams2 = textView2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (!(layoutParams2 instanceof FrameLayout.LayoutParams)) {
                layoutParams2 = null;
            }
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams10 != null) {
                layoutParams10.gravity = 8388659;
            }
            ImageView imageView2 = this.q;
            if (imageView2 != null) {
                layoutParams3 = imageView2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams6 = layoutParams3;
            }
            FrameLayout.LayoutParams layoutParams11 = layoutParams6;
            if (layoutParams11 != null) {
                layoutParams11.gravity = 8388659;
            }
            layoutParams7.topMargin = ((viewGroup.getLayoutParams().height - i3) / 2) + w;
            FrameLayout frameLayout3 = this.K;
            if (frameLayout3 != null) {
                frameLayout3.setLayoutParams(layoutParams7);
            }
            bj.d("FeedCaptionView caption location: start_top topMargin: " + layoutParams7.topMargin);
        }
    }

    private final void a(String str, String str2, int i2) {
        b.i.b(new h(this, str, str2, i2), b.i.f4824a);
    }

    /* access modifiers changed from: private */
    public static void a(int i2, String str, String str2, long j2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aweme_id", str);
        jSONObject.put("url", str2);
        jSONObject.put("file_size", j2);
        if (i2 == 2 && s.a()) {
            jSONObject.put("content", str3);
            bj.b("FeedCaptionView parse failed content:".concat(String.valueOf(str3)));
        }
        com.bytedance.apm.b.a("load_captions", i2, jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, com.ss.android.ugc.aweme.sticker.j jVar, Aweme aweme) {
        super(i2, context, view, interactStickerStruct, jVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(interactStickerStruct, "");
        this.s = aweme;
        EventBus.a(EventBus.a(), this);
        this.o = new i(this);
    }
}
