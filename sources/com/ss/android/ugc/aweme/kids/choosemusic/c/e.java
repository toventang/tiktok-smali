package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.g.a;
import com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class e extends a implements u<b>, ScrollableLayout.b, a.AbstractC1744a, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b>, com.ss.android.ugc.aweme.kids.a.h.c, com.ss.android.ugc.aweme.kids.choosemusic.d.b, com.ss.android.ugc.aweme.kids.choosemusic.d.e, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final String f105539c = new StringBuilder("android:switcher:2131364352:").toString();
    private String A;
    private String B;
    private boolean C;
    private String D;
    private int E;
    private boolean F = true;
    private String G = "popular_song";
    private Music H;

    /* renamed from: a  reason: collision with root package name */
    public o f105540a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.kids.choosemusic.f.a f105541b;

    /* renamed from: d  reason: collision with root package name */
    TuxStatusView f105542d;

    /* renamed from: e  reason: collision with root package name */
    DmtTabLayout f105543e;

    /* renamed from: j  reason: collision with root package name */
    ViewPager f105544j;

    /* renamed from: k  reason: collision with root package name */
    ScrollableLayout f105545k;

    /* renamed from: l  reason: collision with root package name */
    View f105546l;

    /* renamed from: m  reason: collision with root package name */
    protected DataCenter f105547m;
    public int n;
    public MusicModel o;
    public l p;
    public j q;
    public com.ss.android.ugc.aweme.kids.choosemusic.g.a r;
    protected com.ss.android.ugc.aweme.kids.choosemusic.e.a s;
    public boolean t;
    public boolean u;
    private com.ss.android.ugc.aweme.arch.widgets.base.e v;
    private int w;
    private MusicBannerWidget y;
    private String z;

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(LinearLayout linearLayout);

    /* access modifiers changed from: protected */
    public abstract void a(b bVar);

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final boolean an_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(288, new g(e.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.kids.a.d.a.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final MusicModel h() {
        return this.o;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final void a(String str, final MusicModel musicModel, String str2) {
        com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel);
        final androidx.fragment.app.e activity = getActivity();
        int i2 = this.E;
        if (i2 == 0 || i2 == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicOrigin(str2).musicPath(str).musicModel(musicModel);
        AVExternalServiceImpl.a().asyncService("NewMusicTab", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.c.e.AnonymousClass5 */

            static {
                Covode.recordClassIndex(67612);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, false);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z e() {
        g();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final Activity i() {
        return getActivity();
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final boolean j() {
        return ab_();
    }

    private void g() {
        k();
        this.s.a(false, this.A, this.H);
    }

    private void k() {
        TuxStatusView tuxStatusView = this.f105542d;
        if (tuxStatusView != null) {
            tuxStatusView.a();
            this.f105542d.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.r;
        if (aVar != null) {
            aVar.f105361k = false;
        }
    }

    static {
        Covode.recordClassIndex(67607);
    }

    private boolean n() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    public final RecyclerView.a c() {
        int i2 = this.w;
        if (i2 == 0) {
            return this.p.f105521e;
        }
        if (i2 == 1) {
            return this.q.k();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        int i2 = this.w;
        if (i2 == 0) {
            return this.p.m();
        }
        if (i2 == 1) {
            return this.q.m();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.r;
        if (aVar != null) {
            aVar.a();
            this.r.d();
        }
        com.ss.android.ugc.aweme.kids.choosemusic.f.a aVar2 = this.f105541b;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
    }

    public final void d() {
        ScrollableLayout scrollableLayout = this.f105545k;
        if (scrollableLayout != null && scrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.f105545k.getParent()).getMeasuredHeight();
            int measuredHeight2 = this.f105545k.getChildAt(0).getMeasuredHeight();
            this.p.a((measuredHeight + this.f105545k.getCurScrollY()) - measuredHeight2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.r;
        if (aVar != null) {
            aVar.a();
            this.r.f105361k = true;
        }
        this.f105547m.a("music_position", (Object) -1);
        this.f105547m.a("music_index", (Object) -1);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.e
    public final void b(int i2) {
        this.n = i2;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.w);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void a(d.a aVar) {
        this.r.f105358h = aVar;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void b(MusicModel musicModel) {
        this.r.f105359i = this.G;
        this.r.c(musicModel, this.n, n());
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (i2 == 1) {
            this.s.b();
            this.f105544j.setCurrentItem(1);
            this.f105545k.getHelper().f76605b = this.q;
        } else if (i2 == 0) {
            this.f105544j.setCurrentItem(0);
            this.f105545k.getHelper().f76605b = this.p;
        }
        this.w = i2;
        if (i2 == 0) {
            this.n = 0;
        } else if (i2 == 1) {
            this.n = 1;
        } else if (i2 == 2) {
            this.n = 6;
        }
    }

    /* access modifiers changed from: protected */
    public final void c(MusicModel musicModel) {
        DmtTabLayout.f b2 = this.f105543e.b(1);
        if (b2 != null && b2.f33756i != null) {
            b2.f33756i.post(new h(this, b2, musicModel));
        }
    }

    @r(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.kids.a.d.a aVar) {
        if (this.f105547m != null && aVar != null && "music_detail".equals(aVar.f105302c)) {
            this.f105547m.a("music_collect_status", new com.ss.android.ugc.aweme.kids.choosemusic.b.a(0, aVar.f105300a, -1, -1, aVar.f105301b));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.z = arguments.getString("challenge");
        }
        this.A = arguments.getString("first_sticker_music_ids", null);
        this.C = arguments.getBoolean("is_busi_sticker", false);
        this.B = arguments.getString("first_sticker_id", null);
        this.E = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.H = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.D = arguments.getString("shoot_way");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        com.ss.android.ugc.aweme.shortvideo.c curMusic;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        switch (str.hashCode()) {
            case -2080369200:
                if (str.equals("pick_status")) {
                    if (((Integer) bVar2.a()).intValue() != 1) {
                        TuxStatusView tuxStatusView = this.f105542d;
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        Fragment parentFragment = getParentFragment();
                        if (parentFragment instanceof i) {
                            a aVar = (a) parentFragment;
                            if (aVar.ab_() && aVar.getActivity() != null && aVar.f105511k && (curMusic = AVExternalServiceImpl.a().publishService().getCurMusic()) != null) {
                                aVar.f105508d.setVisibility(0);
                                aVar.f105509e.setText(aVar.getActivity().getString(R.string.adp, new Object[]{curMusic.getMusicName()}));
                                if (aVar.f105512l) {
                                    aVar.f105510j.setAlpha(0.5f);
                                }
                                aVar.f105510j.setOnClickListener(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e8: INVOKE  
                                      (wrap: android.view.View : 0x00e1: IGET  (r1v2 android.view.View) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) com.ss.android.ugc.aweme.kids.choosemusic.c.a.j android.view.View)
                                      (wrap: com.ss.android.ugc.aweme.kids.choosemusic.c.a$1 : 0x00e5: CONSTRUCTOR  (r0v17 com.ss.android.ugc.aweme.kids.choosemusic.c.a$1) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) call: com.ss.android.ugc.aweme.kids.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.kids.choosemusic.c.a):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.kids.choosemusic.c.e.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:274)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e5: CONSTRUCTOR  (r0v17 com.ss.android.ugc.aweme.kids.choosemusic.c.a$1) = (r7v1 'aVar' com.ss.android.ugc.aweme.kids.choosemusic.c.a) call: com.ss.android.ugc.aweme.kids.choosemusic.c.a.1.<init>(com.ss.android.ugc.aweme.kids.choosemusic.c.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.kids.choosemusic.c.e.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void, file: classes10.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 39 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.kids.choosemusic.c.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 45 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 254
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.choosemusic.c.e.onChanged(java.lang.Object):void");
                            }

                            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
                            public final void a(MusicModel musicModel) {
                                com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.r;
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.ss.android.ugc.aweme.kids.a.a.c
                            public final /* synthetic */ void a(com.ss.android.ugc.aweme.kids.choosemusic.b.b bVar) {
                                com.ss.android.ugc.aweme.kids.choosemusic.b.b bVar2 = bVar;
                                String str = bVar2.f105502b;
                                MusicModel musicModel = bVar2.f105501a;
                                if ("follow_type".equals(str)) {
                                    this.s.a(musicModel, musicModel.getMusicId(), 1, bVar2.f105503c, bVar2.f105504d);
                                } else if ("unfollow_type".equals(str)) {
                                    this.s.a(musicModel, musicModel.getMusicId(), 0, bVar2.f105503c, bVar2.f105504d);
                                }
                            }

                            @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
                            public final void b(int i2, int i3) {
                                d();
                            }

                            @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
                            public final void a(float f2, float f3) {
                                RecyclerView recyclerView;
                                if (ab_()) {
                                    int i2 = this.w;
                                    if (i2 == 0) {
                                        recyclerView = (RecyclerView) this.p.m();
                                    } else if (i2 == 1) {
                                        recyclerView = (RecyclerView) this.q.m();
                                    } else {
                                        return;
                                    }
                                    if (recyclerView != null) {
                                        int childCount = recyclerView.getChildCount();
                                        if (childCount == 0) {
                                            this.f105545k.a();
                                            this.f105545k.setMaxScrollHeight(0);
                                            return;
                                        }
                                        View g2 = recyclerView.getLayoutManager().g(childCount - 1);
                                        int childCount2 = this.f105545k.getChildCount();
                                        if (childCount2 >= 2 && g2 != null) {
                                            int measuredHeight = ((View) this.f105545k.getParent()).getMeasuredHeight();
                                            this.f105545k.setMaxScrollHeight(((recyclerView.getTop() + g2.getBottom()) + this.f105545k.getChildAt(childCount2 - 1).getTop()) - measuredHeight);
                                        }
                                    }
                                }
                            }

                            /* access modifiers changed from: package-private */
                            public final /* synthetic */ void a(DmtTabLayout.f fVar, MusicModel musicModel) {
                                com.ss.android.ugc.aweme.kids.choosemusic.f.a aVar;
                                if (getActivity() != null && !getActivity().isFinishing() && (aVar = this.f105541b) != null) {
                                    DmtTabLayout.h hVar = fVar.f33756i;
                                    l.d(hVar, "");
                                    l.d(musicModel, "");
                                    if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                                        com.ss.android.ugc.aweme.base.e.b(aVar.f105639b, musicModel.getPicPremium(), -1, -1);
                                    } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                                        com.ss.android.ugc.aweme.base.e.b(aVar.f105639b, musicModel.getPicBig(), -1, -1);
                                    }
                                    aVar.setWidth(hVar.getWidth() + n.a(24.0d));
                                    if (!aVar.isShowing()) {
                                        aVar.showAsDropDown(hVar, (hVar.getWidth() - aVar.getWidth()) / 2, -((hVar.getHeight() + aVar.f105640c.getMeasuredHeight()) - n.a(16.0d)));
                                    }
                                    aVar.f105640c.removeCallbacks(aVar.f105638a);
                                    aVar.f105640c.postDelayed(aVar.f105638a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                                }
                            }

                            @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
                            public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.kids.choosemusic.a aVar) {
                                this.o = musicModel;
                                if (this.F) {
                                    this.r.f105642a = aVar;
                                    if (aVar != null && aVar.f105439h) {
                                        this.f105547m.a("last_play_music_id", musicModel.getMusicId());
                                    }
                                    this.r.a(musicModel, this.n, false);
                                    return;
                                }
                                this.r.c(musicModel, this.n, n());
                            }

                            @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
                            public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                int i2;
                                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior;
                                View a2 = com.a.a(layoutInflater, R.layout.adj, viewGroup, false);
                                this.f105542d = (TuxStatusView) a2.findViewById(R.id.e_o);
                                this.f105543e = (DmtTabLayout) a2.findViewById(R.id.ehe);
                                this.f105544j = (ViewPager) a2.findViewById(R.id.b5g);
                                this.f105545k = (ScrollableLayout) a2.findViewById(R.id.dtd);
                                this.f105546l = a2.findViewById(R.id.an5);
                                this.f105545k.setVisibility(4);
                                this.f105545k.setOnScrollListener(this);
                                if (bundle == null) {
                                    i2 = 0;
                                } else {
                                    i2 = bundle.getInt("KEY_CURRENT_TAB", 0);
                                }
                                this.w = i2;
                                DataCenter a3 = DataCenter.a(ae.a(this, (ad.b) null), this);
                                this.f105547m = a3;
                                a3.a("pick_status", (u<b>) this).a("data_banner", (u<b>) this).a("play_compeleted", (u<b>) this).a("music_collect_status", (u<b>) this);
                                this.f105547m.a("key_choose_music_type", Integer.valueOf(this.E));
                                this.f105547m.a("sticker_id", this.B);
                                this.f105547m.a("challenge_id", this.z);
                                this.f105547m.a("mvtheme_music_type", Boolean.valueOf(this.t));
                                this.f105547m.a("is_photo_mv_type", Boolean.valueOf(this.u));
                                this.f105547m.a("is_busi_sticker", Boolean.valueOf(this.C));
                                this.f105547m.a("shoot_way", this.D);
                                com.ss.android.ugc.aweme.arch.widgets.base.e a4 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, a2);
                                this.v = a4;
                                a4.a(this.f105547m);
                                this.y = new MusicBannerWidget();
                                this.s = new com.ss.android.ugc.aweme.kids.choosemusic.e.a(getContext(), this.f105547m);
                                this.v.b(R.id.cf2, this.y);
                                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                                StringBuilder sb = new StringBuilder();
                                String str = f105539c;
                                l lVar = (l) childFragmentManager.a(sb.append(str).append(0).toString());
                                this.p = lVar;
                                if (lVar == null) {
                                    int i3 = this.E;
                                    String str2 = this.z;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
                                    if (!TextUtils.isEmpty(str2)) {
                                        bundle2.putString("challenge", str2);
                                    }
                                    l lVar2 = new l();
                                    lVar2.setArguments(bundle2);
                                    this.p = lVar2;
                                }
                                this.p.f105519c = this.f105547m;
                                this.p.f105520d = this.v;
                                this.p.f105525m = this.s;
                                l lVar3 = this.p;
                                lVar3.f105522j = this;
                                if (lVar3.f105521e != null) {
                                    lVar3.f105521e.f105441d = lVar3.f105522j;
                                }
                                l lVar4 = this.p;
                                lVar4.f105523k = this;
                                if (lVar4.f105521e != null) {
                                    lVar4.f105521e.f105442e = lVar4.f105523k;
                                }
                                l lVar5 = this.p;
                                lVar5.f105524l = this;
                                if (lVar5.f105521e != null) {
                                    lVar5.f105521e.f105445h = lVar5.f105524l;
                                }
                                j jVar = (j) getChildFragmentManager().a(str + 1);
                                this.q = jVar;
                                if (jVar == null) {
                                    int i4 = this.E;
                                    String str3 = this.z;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i4);
                                    if (!TextUtils.isEmpty(str3)) {
                                        bundle3.putString("challenge", str3);
                                    }
                                    j jVar2 = new j();
                                    jVar2.setArguments(bundle3);
                                    this.q = jVar2;
                                }
                                this.q.f105531e = this.f105547m;
                                this.q.f105562l = this;
                                com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.g.a(this, new a.AbstractC2696a() {
                                    /* class com.ss.android.ugc.aweme.kids.choosemusic.c.e.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(67608);
                                    }

                                    @Override // com.ss.android.ugc.aweme.kids.choosemusic.g.a.AbstractC2696a
                                    public final void a() {
                                        if (e.this.o != null) {
                                            e.this.f105547m.a("play_compeleted", e.this.o.getMusicId());
                                        }
                                    }

                                    @Override // com.ss.android.ugc.aweme.kids.choosemusic.g.a.AbstractC2696a
                                    public final void b() {
                                        if (e.this.o != null) {
                                            e.this.f105547m.a("play_error", e.this.o.getMusicId());
                                        }
                                    }
                                });
                                this.r = aVar;
                                aVar.c();
                                this.r.b(this.E);
                                this.f105541b = new com.ss.android.ugc.aweme.kids.choosemusic.f.a(getContext());
                                this.f105544j.setOffscreenPageLimit(2);
                                this.f105544j.setAdapter(new androidx.fragment.app.l(getChildFragmentManager()) {
                                    /* class com.ss.android.ugc.aweme.kids.choosemusic.c.e.AnonymousClass2 */

                                    /* renamed from: b  reason: collision with root package name */
                                    private final int[] f105550b = {R.string.b8h, R.string.dcv};

                                    static {
                                        Covode.recordClassIndex(67609);
                                    }

                                    @Override // androidx.viewpager.widget.PagerAdapter
                                    public final int getCount() {
                                        return 2;
                                    }

                                    @Override // androidx.fragment.app.l
                                    public final Fragment a(int i2) {
                                        if (i2 == 0) {
                                            return e.this.p;
                                        }
                                        return e.this.q;
                                    }

                                    @Override // androidx.viewpager.widget.PagerAdapter
                                    public final CharSequence getPageTitle(int i2) {
                                        return e.this.getResources().getString(this.f105550b[i2]);
                                    }
                                });
                                this.f105543e.setCustomTabViewResId(R.layout.aa4);
                                this.f105543e.setTabMode(0);
                                this.f105543e.setAutoFillWhenScrollable(true);
                                this.f105543e.setupWithViewPager(this.f105544j);
                                a((LinearLayout) this.f105543e.getChildAt(0));
                                this.f105543e.setOnTabClickListener(new f(this));
                                b();
                                this.f105543e.a(new DmtTabLayout.c() {
                                    /* class com.ss.android.ugc.aweme.kids.choosemusic.c.e.AnonymousClass3 */

                                    static {
                                        Covode.recordClassIndex(67610);
                                    }

                                    @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
                                    public final void b(DmtTabLayout.f fVar) {
                                    }

                                    @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
                                    public final void a(DmtTabLayout.f fVar) {
                                        int i2 = fVar.f33752e;
                                        if (i2 == 1 && e.this.f105541b != null) {
                                            e.this.f105541b.dismiss();
                                        }
                                        RecyclerView.a c2 = e.this.c();
                                        if (c2 != null) {
                                            if (c2 instanceof com.ss.android.ugc.aweme.kids.choosemusic.a.b) {
                                                ((com.ss.android.ugc.aweme.kids.choosemusic.a.b) c2).l();
                                            } else if (c2 instanceof com.ss.android.ugc.aweme.kids.choosemusic.a.a) {
                                                ((com.ss.android.ugc.aweme.kids.choosemusic.a.a) c2).l();
                                            }
                                        }
                                        e.this.a(i2);
                                    }
                                });
                                this.f105543e.b(this.w).a();
                                a();
                                a(this.w);
                                g();
                                androidx.fragment.app.e activity = getActivity();
                                if ((activity instanceof ChooseMusicActivity) && (viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f105489c) != null) {
                                    viewPagerBottomSheetBehavior.a(this.f105544j);
                                }
                                return a2;
                            }
                        }
