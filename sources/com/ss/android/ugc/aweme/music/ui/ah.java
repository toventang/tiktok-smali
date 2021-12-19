package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.a.d;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.challenge.ui.w;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.detail.h;
import com.ss.android.ugc.aweme.detail.m;
import com.ss.android.ugc.aweme.dh.d;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.music.b.e;
import com.ss.android.ugc.aweme.music.b.n;
import com.ss.android.ugc.aweme.music.f.c;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.RessoCollectInfo;
import com.ss.android.ugc.aweme.music.presenter.r;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public class ah extends com.ss.android.ugc.aweme.challenge.ui.b implements s.a, w, r, w.a, i, j {
    ImageView N;
    ImageView O;
    RecyclerView P;
    View Q;
    View R;
    TextView S;
    TextView T;
    DmtStatusView U;
    ImageView V;
    ViewStub W;
    ViewStub X;
    ViewStub Y;
    RelativeLayout Z;
    float aA;
    float aB;
    private TextView aC;
    private View aD;
    private ViewGroup aE;
    private ViewGroup aF;
    private ViewGroup aG;
    private RecyclerView aH;
    private RecyclerView aI;
    private n aJ;
    private e aK;
    private cr aL;
    private boolean aM;
    private boolean aN;
    private String aO;
    private Music aP;
    private String aQ;
    private String aR;
    private SafeHandler aS;
    private u aT;
    private s aU;
    private MusicDetail aV;
    private int aW;
    private String aX;
    private Handler aY;
    private boolean aZ;
    View aa;
    View ab;
    LinearLayout ac;
    SpringLayout ad;
    com.bytedance.ies.dmt.ui.tooltip.a ae;
    public String af;
    public com.ss.android.ugc.aweme.music.presenter.n ag;
    public String ah;
    boolean ai;
    ProgressDialog aj;
    public boolean ak;
    public e al;
    w am;
    public String an;
    d ao;
    boolean ap;
    public String aq;
    String ar = "musician";
    String as = "spotlight";
    public String at = "";
    public long au;
    public int av;
    bg aw;
    public String ax;
    public String ay;
    public int az;
    private long ba;
    private long bb;
    private boolean bc;
    private View bd;
    private boolean be;
    private String bf;
    private com.ss.android.ugc.aweme.v.a.a bg;
    private boolean bh;
    private long bi;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f111849d;

    /* renamed from: e  reason: collision with root package name */
    TextView f111850e;

    /* renamed from: j  reason: collision with root package name */
    TextView f111851j;

    /* renamed from: k  reason: collision with root package name */
    SmartImageView f111852k;

    /* renamed from: l  reason: collision with root package name */
    View f111853l;

    /* renamed from: m  reason: collision with root package name */
    View f111854m;
    TextView n;
    SmartImageView o;
    View p;
    CheckableImageView q;
    View r;
    TextView s;
    public ImageView t;
    ImageView u;

    static {
        Covode.recordClassIndex(71895);
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return i2 == 0 ? "single_song" : i2 == 1 ? "single_song_fresh" : "";
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new g(ah.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new g(ah.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new g(ah.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(38, new g(ah.class, "onMusicFeedBackEvent", c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(39, new g(ah.class, "onEvent", com.ss.android.ugc.aweme.music.ui.a.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.ale;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        return this.ah;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final l l() {
        return this.aL;
    }

    /* access modifiers changed from: package-private */
    public final void a(Activity activity) {
        TextView textView;
        if (activity != null && (textView = this.aC) != null && this.s != null) {
            if (a(activity, textView) || a(activity, this.s)) {
                this.aC.setVisibility(8);
                this.s.setVisibility(8);
                return;
            }
            this.aC.setVisibility(0);
            this.s.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.ah = bundle.getString("id");
            this.af = bundle.getString("extra_music_from");
            this.aO = bundle.getString("extra_previous_page_position");
            this.K = bundle.getString("sticker_id");
            this.aW = bundle.getInt("click_reason");
            this.an = bundle.getString("aweme_id");
            this.aX = bundle.getString("from_token");
            this.aQ = bundle.getString("partnerMusicId");
            this.aR = bundle.getString("partnerName");
            this.at = bundle.getString("process_id");
            this.av = bundle.getInt("extra_video_length", 0);
            this.bf = bundle.getString("extra_track_info");
            if ("share_from_resso".equals(this.af) && TextUtils.isEmpty(this.at)) {
                this.at = UUID.randomUUID().toString();
            }
            this.ax = bundle.getString("shoot_enter_from", "");
            this.ay = bundle.getString("banner_id", "");
            this.az = bundle.getInt("is_bundled", 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.r
    public final void a(boolean z) {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.N;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.O;
        if (imageView3 != null) {
            imageView3.clearAnimation();
            this.O.setVisibility(8);
        }
        if (z) {
            bV_();
            CheckableImageView checkableImageView = this.q;
            if (checkableImageView != null) {
                checkableImageView.setVisibility(8);
            }
            this.u.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void a(final Effect effect, final MusicModel musicModel) {
        b(true);
        com.ss.android.ugc.aweme.metrics.ah.f109483a = "single_song";
        final androidx.fragment.app.e activity = getActivity();
        if (TextUtils.isEmpty(this.aq)) {
            this.aq = UUID.randomUUID().toString();
        }
        AVExternalServiceImpl.a().asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71896);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                String str;
                String str2 = "share_from_resso";
                if (!str2.equals(ah.this.af)) {
                    str2 = "single_song";
                }
                RecordConfig.Builder videoLength = new RecordConfig.Builder().creationId(ah.this.aq).startRecordTime(ah.this.au).decompressTime(j2).reshootConfig(new ReshootConfig(true, true)).shootWay(ah.this.d()).translationType(com.ss.android.ugc.aweme.setting.i.c.a()).musicWithSticker(effect).musicOrigin(str2).videoLength(Integer.valueOf(ah.this.av));
                String e2 = ah.this.ag.e();
                if (!TextUtils.isEmpty(e2)) {
                    videoLength.shootFrom(e2);
                }
                if (!TextUtils.isEmpty(ah.this.K)) {
                    videoLength.stickers(com.ss.android.ugc.aweme.music.presenter.n.b(ah.this.K));
                    ArrayList<String> b2 = com.ss.android.ugc.aweme.music.presenter.n.b(ah.this.K);
                    if (!b2.isEmpty()) {
                        videoLength.musicSticker(b2.get(0));
                    }
                }
                String musicSticker = videoLength.build().getMusicSticker();
                Effect effect = effect;
                MusicModel musicModel = musicModel;
                if (musicModel != null) {
                    str = musicModel.getMusicId();
                } else {
                    str = null;
                }
                videoLength.recordPresetResource(new RecordPresetResource(musicSticker, effect, str, musicModel));
                if (effect == null || !AVExternalServiceImpl.a().abilityService().effectService().isEffectControlGame(effect)) {
                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build(), musicModel, true);
                } else {
                    asyncAVService.uiService().recordService().startRecord(activity, videoLength.build());
                }
                com.ss.android.ugc.aweme.music.h.a.a(musicModel.getMusicId(), ah.this.at, ah.this.aq, ah.this.an, 0);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.q
    public final void a(MusicDetail musicDetail) {
        u uVar;
        ViewGroup viewGroup;
        MethodCollector.i(13181);
        this.ad.setRefreshing(false);
        if (!ab_() || musicDetail == null) {
            MethodCollector.o(13181);
        } else if (musicDetail.music == null || musicDetail.music.getMusicStatus() == 0 || musicDetail.music.getPlayUrl().getUrlList() == null || musicDetail.music.getPlayUrl().getUrlList().isEmpty()) {
            this.V.setVisibility(4);
            this.ac.setVisibility(0);
            MethodCollector.o(13181);
        } else {
            if (!this.bh) {
                this.bh = true;
                com.bytedance.ies.watcher.c.a("music_detail_header", this.ah, musicDetail);
            }
            if (TextUtils.isEmpty(this.ah) || (musicDetail.music != null && !this.ah.equals(musicDetail.music.getMid()))) {
                this.ah = musicDetail.music.getMid();
                if (this.I != null && this.I.size() > 0) {
                    for (h hVar : this.I) {
                        if (hVar instanceof s) {
                            ((s) hVar).f70204c = this.ah;
                            if (hVar instanceof u) {
                                ((u) hVar).I = musicDetail.music;
                            }
                        }
                        hVar.j();
                    }
                }
            }
            this.aP = musicDetail.music;
            if (this.I.isEmpty()) {
                com.ss.android.ugc.aweme.account.b.a();
                com.ss.android.ugc.aweme.account.b.f62864a.e().getCurUser().getMusicComplianceAccount();
                Fragment a2 = getChildFragmentManager().a(v + 0);
                if (!(a2 instanceof u) || (uVar = (u) a2) == null) {
                    Music music = this.aP;
                    String str = this.ah;
                    String str2 = this.af;
                    String str3 = this.an;
                    String str4 = this.aO;
                    String str5 = this.at;
                    ba baVar = new ba();
                    uVar = new u();
                    Bundle bundle = new Bundle();
                    bundle.putInt("detail_aweme_list_type", 0);
                    bundle.putString("event_label", "single_song");
                    bundle.putString("detail_id", str);
                    bundle.putString("detail_aweme_from", str2);
                    bundle.putString("detail_aweme_from_aid", str3);
                    bundle.putString("detail_aweme_previous_page_position", str4);
                    bundle.putSerializable("detail_music_data", music);
                    bundle.putString("process_id", str5);
                    uVar.setArguments(bundle);
                    uVar.G = baVar;
                }
                uVar.z = this.G == 0;
                uVar.q = this.U;
                uVar.F = this;
                uVar.s = this;
                this.aT = uVar;
                this.I.add(this.aT);
                this.f70119a.add(0);
                this.aU = (s) getChildFragmentManager().a(v + 1);
                this.aN = true;
                this.J.clear();
                for (Object obj : this.I) {
                    this.J.add(obj);
                }
                this.aL.notifyDataSetChanged();
                this.B.setAdapter(this.aL);
                onPageSelected(this.G);
            }
            b(musicDetail);
            c(musicDetail);
            if (musicDetail.music == null || musicDetail.music.getMusicOwnerInfos() == null) {
                q();
            } else {
                List<MusicOwnerInfo> musicOwnerInfos = musicDetail.music.getMusicOwnerInfos();
                if (com.bytedance.common.utility.collection.b.a((Collection) musicOwnerInfos)) {
                    q();
                } else {
                    List<MusicOwnerInfo> a3 = a(musicOwnerInfos);
                    if (com.bytedance.common.utility.collection.b.a((Collection) a3)) {
                        q();
                    } else {
                        if (this.aF == null) {
                            this.aF = (ViewGroup) this.W.inflate();
                        }
                        if (this.aI == null) {
                            this.aI = (RecyclerView) this.aF.findViewById(R.id.cqv);
                            this.aI.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
                                /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass5 */

                                static {
                                    Covode.recordClassIndex(71902);
                                }

                                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
                                public final boolean g() {
                                    return false;
                                }
                            });
                            this.aI.b(new com.ss.android.ugc.aweme.views.g(androidx.core.content.b.c(getContext(), R.color.b6), (int) com.bytedance.common.utility.n.b(getActivity(), 0.5f), com.bytedance.common.utility.n.b(getActivity(), 16.0f), com.bytedance.common.utility.n.b(getActivity(), 16.0f)));
                            e eVar = new e();
                            this.aK = eVar;
                            eVar.f111326a = new al(this, a3);
                            this.aK.d(false);
                            this.aI.setAdapter(this.aK);
                        }
                        e eVar2 = this.aK;
                        if (eVar2 != null) {
                            eVar2.b_(a3);
                        }
                        this.aF.setVisibility(0);
                    }
                }
            }
            if (musicDetail.music == null || musicDetail.music.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(musicDetail.music.getMatchedPGCSoundInfo().getId())) {
                ViewGroup viewGroup2 = this.aG;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else {
                final MatchedPGCSoundInfo matchedPGCSoundInfo = musicDetail.music.getMatchedPGCSoundInfo();
                androidx.fragment.app.e activity = getActivity();
                if (this.aG == null && activity != null) {
                    com.ss.android.ugc.aweme.common.r.a("show_music_feedback_entrance", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").a("music_id", this.ah).a("process_id", this.at).f66730a);
                    String showInfo = matchedPGCSoundInfo.getShowInfo();
                    ViewGroup viewGroup3 = (ViewGroup) this.Y.inflate();
                    this.aG = viewGroup3;
                    final TextView textView = (TextView) viewGroup3.findViewById(R.id.f4e);
                    String string = getResources().getString(R.string.n, showInfo);
                    SpannableString spannableString = new SpannableString(string);
                    int lastIndexOf = string.lastIndexOf(showInfo);
                    int length = spannableString.length();
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(showInfo) && lastIndexOf >= 0) {
                        spannableString.setSpan(new StyleSpan(1), lastIndexOf, length, 17);
                        spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.bx)), lastIndexOf, length, 17);
                        spannableString.setSpan(new ClickableSpan() {
                            /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass6 */

                            static {
                                Covode.recordClassIndex(71903);
                            }

                            public final void updateDrawState(TextPaint textPaint) {
                                textPaint.setColor(androidx.core.content.b.c(textView.getContext(), R.color.bx));
                                textPaint.setUnderlineText(false);
                            }

                            public final void onClick(View view) {
                                String id = matchedPGCSoundInfo.getId();
                                String str = ah.this.ah;
                                com.ss.android.ugc.aweme.common.r.a("enter_music_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").a("enter_method", "music_feedback").a("music_id", id).a("from_music_id", str).a("process_id", ah.this.at).a("ugc_to_pgc_meta", "1").f66730a);
                                SmartRouter.buildRoute(ah.this.getContext(), "aweme://music/detail/").withParam("id", matchedPGCSoundInfo.getId()).withParam("process_id", UUID.randomUUID().toString()).open();
                            }
                        }, lastIndexOf, length, 17);
                    }
                    textView.setHighlightColor(androidx.core.content.b.c(getContext(), R.color.c9));
                    textView.setMovementMethod(com.ss.android.ugc.aweme.bt.a.a());
                    textView.setText(spannableString);
                }
            }
            if (CommerceMediaServiceImpl.f().b(musicDetail.music)) {
                this.V.setVisibility(8);
                this.t.setVisibility(8);
                this.r.setVisibility(8);
                this.aa.setVisibility(0);
                this.u.setVisibility(8);
                this.N.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.ab.getLayoutParams();
                ViewGroup viewGroup4 = this.aE;
                if ((viewGroup4 == null || viewGroup4.getVisibility() != 0) && ((viewGroup = this.aF) == null || viewGroup.getVisibility() != 0)) {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(4.0d);
                } else {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
                }
                this.ab.setLayoutParams(layoutParams);
                this.Z.setVisibility(8);
            }
            MethodCollector.o(13181);
        }
    }

    public final void a(MusicOwnerInfo musicOwnerInfo) {
        if (musicOwnerInfo != null && musicOwnerInfo.getUid() != null && musicOwnerInfo.getSecUid() != null) {
            if (musicOwnerInfo.getEnterType() == 1) {
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_musician_profile").a("to_user_id", musicOwnerInfo.getUid()).a(StringSet.type, this.as).a("enter_from", "single_song").f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_profile").a("to_user_id", musicOwnerInfo.getUid()).a(StringSet.type, this.ar).a("enter_from", "single_song").f66730a);
            }
            SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://user/profile/").withParam("uid", musicOwnerInfo.getUid()).withParam("sec_user_id", musicOwnerInfo.getSecUid()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.r
    public final void a(CharSequence charSequence) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.q
    public final void a(Exception exc) {
        this.ad.setRefreshing(false);
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (ab_()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            this.U.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        new com.bytedance.tux.g.b(this).a(str).b();
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(int i2, boolean z) {
        super.a(i2, z);
        if (System.currentTimeMillis() - this.bi >= 1000) {
            this.bi = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.a
    public final boolean b(int i2) {
        MethodCollector.i(13345);
        if (i2 == 0) {
            this.aM = true;
        } else if (i2 == 1) {
            this.aN = true;
        }
        if (this.aT == null) {
            this.aM = true;
        }
        if (this.aU == null) {
            this.aN = true;
        }
        if (this.aM && this.aN) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.w7, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.fat)).setText("");
            TuxTextView tuxTextView = new TuxTextView(getContext());
            tuxTextView.setGravity(17);
            tuxTextView.setTextColor(androidx.core.content.b.c(getContext(), R.color.c4));
            tuxTextView.setText(R.string.cyv);
            u uVar = this.aT;
            if (uVar != null) {
                uVar.a(inflate, tuxTextView);
            }
            s sVar = this.aU;
            if (sVar != null) {
                sVar.a(inflate, tuxTextView);
            }
        }
        MethodCollector.o(13345);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void a(float f2, float f3) {
        this.be = m.a(f2, f3, this.be, this);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void a(MusicModel musicModel) {
        com.ss.android.ugc.aweme.common.r.a("download_music", new com.ss.android.ugc.aweme.app.f.d().a("music_id", musicModel.getMusicId()).a("enter_from", "single_song").a("enter_method", "click_shoot").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void a(final String str, final MusicModel musicModel, int i2) {
        com.ss.android.ugc.aweme.metrics.ah.f109483a = "single_song";
        boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
        final androidx.fragment.app.e activity = getActivity();
        final long currentTimeMillis = System.currentTimeMillis() - this.au;
        if (!isRecording || activity == null) {
            if (TextUtils.isEmpty(this.aq)) {
                this.aq = UUID.randomUUID().toString();
            }
            AVExternalServiceImpl.a().asyncService("MusicDetailFragment", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(71899);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    String str = "share_from_resso";
                    if (!str.equals(ah.this.af)) {
                        str = "single_song";
                    }
                    RecordConfig.Builder shootExtraData = new RecordConfig.Builder().creationId(ah.this.aq).startRecordTime(ah.this.au).decompressTime(j2).musicDownloadDuration(currentTimeMillis).reshootConfig(new ReshootConfig(true, true)).shootWay(ah.this.d()).translationType(com.ss.android.ugc.aweme.setting.i.c.a()).musicWithSticker(ah.this.ag.k()).musicOrigin(str).videoLength(Integer.valueOf(ah.this.av)).shootExtraData(new ShootExtraData(ah.this.ax, ah.this.ay, Integer.valueOf(ah.this.az)));
                    String e2 = ah.this.ag.e();
                    if (!TextUtils.isEmpty(e2)) {
                        shootExtraData.shootFrom(e2);
                    }
                    if (!TextUtils.isEmpty(ah.this.K)) {
                        shootExtraData.stickers(com.ss.android.ugc.aweme.music.presenter.n.b(ah.this.K));
                        ArrayList<String> b2 = com.ss.android.ugc.aweme.music.presenter.n.b(ah.this.K);
                        if (!b2.isEmpty()) {
                            shootExtraData.musicSticker(b2.get(0));
                        }
                    }
                    if (ah.this.ag.k() == null || !AVExternalServiceImpl.a().abilityService().effectService().isEffectControlGame(ah.this.ag.k())) {
                        shootExtraData.musicPath(str);
                        asyncAVService.uiService().recordService().startRecord(activity, shootExtraData.build(), musicModel, true);
                    } else {
                        asyncAVService.uiService().recordService().startRecord(activity, shootExtraData.build());
                    }
                    com.ss.android.ugc.aweme.music.h.a.a(musicModel.getMusicId(), ah.this.at, ah.this.aq, ah.this.an, currentTimeMillis);
                }
            });
            return;
        }
        AVExternalServiceImpl.a().publishService().addMusic(musicModel);
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", 0);
        activity.setResult(-1, intent);
        activity.finish();
        if (TextUtils.equals(this.af, "choose_music_with_banner")) {
            activity.overridePendingTransition(0, R.anim.ah);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void a(MusicModel musicModel, boolean z) {
        if (z) {
            this.ak = true;
            SafeHandler safeHandler = new SafeHandler(getActivity());
            this.aS = safeHandler;
            safeHandler.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(71900);
                }

                public final void run() {
                    if (ah.this.ak && ah.this.getActivity() != null && !ah.this.getActivity().isFinishing()) {
                        ah ahVar = ah.this;
                        ahVar.al = e.b.a(ahVar.getActivity());
                        ah.this.al.setMessage(ah.this.getActivity().getResources().getString(R.string.g4k));
                    }
                }
            }, 300);
            return;
        }
        e a2 = e.b.a(getActivity(), e.a.VISIBLE_AFTER_5S, new ar(this, musicModel));
        this.aj = a2;
        a2.setIndeterminate(false);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final boolean bT_() {
        return isAdded();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        a(true, false);
    }

    private static boolean m() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void q() {
        ViewGroup viewGroup = this.aF;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void bS_() {
        com.ss.android.ugc.aweme.login.c.a(this, a(this.G), "click_music_shoot");
    }

    public final String d() {
        if ("share_from_resso".equals(this.af)) {
            return "share_from_resso";
        }
        return "single_song";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.music.presenter.n nVar = this.ag;
        if (nVar != null) {
            nVar.cd_();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.ag.d();
    }

    private void j() {
        this.r.setOnClickListener(new ak(this));
        this.q.setOnStateChangeListener(this.ag);
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.r
    public final void b() {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.N;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = this.O;
        if (imageView3 != null) {
            imageView3.clearAnimation();
            this.O.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        a(true, true);
        com.ss.android.ugc.aweme.common.r.a("refresh_page", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").f66730a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.challenge.ui.b, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(false);
        this.ag.p.a();
        this.am.b();
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.r
    public final void c() {
        MethodCollector.i(12898);
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.N;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        if (!(this.O == null || getContext() == null)) {
            this.O.setVisibility(0);
            this.O.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.d2));
        }
        MethodCollector.o(12898);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.w
    public final void bU_() {
        if (!this.bc) {
            this.bc = true;
            String str = this.ah;
            String str2 = this.at;
            String str3 = this.an;
            com.ss.android.ugc.aweme.common.r.a("music_detail_load_time", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").a("music_id", str).a("process_id", str2).a("group_id", str3).a("ttl_duration", SystemClock.elapsedRealtime() - this.ba).a("more_sounds_duration", this.bb).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void k() {
        View view = this.bd;
        if (view != null) {
            this.y = (ScrollableLayout) view.findViewById(R.id.dtd);
            this.z = (TextView) this.bd.findViewById(R.id.title);
            this.A = this.bd.findViewById(R.id.emi);
            this.B = (ViewPager) this.bd.findViewById(R.id.fk_);
            this.C = (DmtTabLayout) this.bd.findViewById(R.id.ehe);
            this.E = (ImageView) this.bd.findViewById(R.id.qb);
        }
        super.k();
        this.z.setAlpha(0.0f);
        this.C.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.q
    public final void a() {
        this.V.setVisibility(4);
        this.ac.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public class a extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        private MusicOwnerInfo f111878a;

        static {
            Covode.recordClassIndex(71907);
        }

        a() {
        }

        public void onClick(View view) {
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                ah.this.a(this.f111878a);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(androidx.core.content.b.c(ah.this.getContext(), R.color.c5));
            textPaint.setUnderlineText(false);
        }

        a(MusicOwnerInfo musicOwnerInfo) {
            this.f111878a = musicOwnerInfo;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        long f111880a;

        static {
            Covode.recordClassIndex(71908);
        }

        b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f111880a = System.currentTimeMillis();
            } else if (action != 1 || System.currentTimeMillis() - this.f111880a > 300) {
                return true;
            } else {
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof SpannedString) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    Layout layout = textView.getLayout();
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
                    a[] aVarArr = (a[]) ((SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, a.class);
                    if (aVarArr.length != 0) {
                        aVarArr[0].onClick(textView);
                        return true;
                    }
                }
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.w.a
    public final void e_(final boolean z) {
        if (z) {
            b(z);
        } else {
            com.ss.android.b.a.a.a.b(new Runnable() {
                /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(71901);
                }

                public final void run() {
                    if (ah.this.aj != null && ah.this.aj.isShowing()) {
                        ah.this.aj.setProgress(100);
                    }
                    ah.this.b(z);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ba = SystemClock.elapsedRealtime();
    }

    private static boolean a(Music music) {
        try {
            if (new JSONObject(music.getExtra()).getInt("has_edited") == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        if (getActivity() != null) {
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) getActivity(), (Throwable) exc, (int) R.string.g4j);
        }
    }

    @org.greenrobot.eventbus.r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/aweme/v1/music/detail/?")) {
            EventBus.a().d(aVar);
            a(true, false);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("music", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.f111854m, jVar);
        }
    }

    @org.greenrobot.eventbus.r
    public void onMusicFeedBackEvent(c cVar) {
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.g2j).a();
    }

    public final void b(boolean z) {
        if (z) {
            this.ak = false;
            bt.b(this.al);
            this.al = null;
        }
        ProgressDialog progressDialog = this.aj;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.aj.dismiss();
            this.aj = null;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.music.ui.a.a aVar) {
        if (getContext() != null && aVar.f111826a == getContext().hashCode() && aVar.f111827b != hashCode()) {
            this.ag.d();
        }
    }

    private static List<MusicOwnerInfo> a(List<MusicOwnerInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            for (MusicOwnerInfo musicOwnerInfo : list) {
                if (!TextUtils.isEmpty(musicOwnerInfo.getUid()) && !TextUtils.isEmpty(musicOwnerInfo.getSecUid()) && !TextUtils.isEmpty(musicOwnerInfo.getNickName()) && !TextUtils.isEmpty(musicOwnerInfo.getHandle())) {
                    arrayList.add(musicOwnerInfo);
                }
            }
        }
        return arrayList;
    }

    private void b(Activity activity) {
        MethodCollector.i(12790);
        if (this.aD == null) {
            this.aD = ((ViewStub) activity.findViewById(R.id.fl6)).inflate();
        }
        this.q = (CheckableImageView) this.aD.findViewById(R.id.cpr);
        this.r = this.aD.findViewById(R.id.cfu);
        this.s = (TextView) this.aD.findViewById(R.id.f34);
        if (this.aD.getVisibility() != 0) {
            this.aD.setVisibility(0);
        }
        j();
        MethodCollector.o(12790);
    }

    public void onEvent(com.ss.android.ugc.aweme.music.ui.a.b bVar) {
        if (!bVar.f111829a || this.aZ) {
            this.Z.setVisibility(8);
        } else {
            this.Z.setVisibility(0);
        }
    }

    @org.greenrobot.eventbus.r
    public void onVideoEvent(ag agVar) {
        Aweme b2;
        int userCount;
        if (agVar.f93450a == 2) {
            String str = (String) agVar.f93451b;
            if (ab_() && this.aV != null && !TextUtils.isEmpty(str) && (b2 = AwemeService.b().b(str)) != null && b2.getMusic() != null && b2.getMusic().getId() == this.aV.music.getId() && (userCount = this.aV.music.getUserCount()) > 0) {
                this.aV.music.setUserCount(userCount - 1);
                a(this.aV);
            }
        }
    }

    private void d(MusicDetail musicDetail) {
        String str;
        String str2;
        int i2;
        int i3;
        Music music = musicDetail.music;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<RelatedChallengeMusic> list = musicDetail.relatedChallengeMusicList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            RelatedChallengeMusic relatedChallengeMusic = list.get(i4);
            if (relatedChallengeMusic.categoryType == 1) {
                Music music2 = relatedChallengeMusic.music;
                if (music2 != null) {
                    sb = sb.append(music2.getMid()).append(",");
                }
            } else if (relatedChallengeMusic.categoryType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (music != null) {
                    sb2 = sb2.append(challenge.getCid()).append(",");
                }
            }
        }
        if (TextUtils.equals(this.af, "from_related_tag")) {
            str2 = this.ah;
            str = "1";
        } else {
            str = "0";
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str);
            jSONObject.put("enter_from", str2);
            JSONObject jSONObject2 = new JSONObject();
            String sb3 = sb.toString();
            if (sb.length() > 0) {
                i2 = sb.length() - 1;
            } else {
                i2 = 0;
            }
            jSONObject2.put("music", sb3.substring(0, i2));
            String sb4 = sb2.toString();
            if (sb2.length() > 0) {
                i3 = sb2.length() - 1;
            } else {
                i3 = 0;
            }
            jSONObject2.put("challenge", sb4.substring(0, i3));
            jSONObject.put("related", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("extend_music").setLabelName("music").setValue(this.ah).setJsonObject(jSONObject));
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.r
    public final void b(BaseResponse baseResponse) {
        Context context;
        RessoCollectInfo ressoCollectInfo;
        if (com.ss.android.ugc.aweme.base.h.d.f().a("is_need_show_collect_succed_dialog", true)) {
            a.C0731a a2 = new a.C0731a(getActivity()).b(R.string.pr).a(R.string.pp).a(R.string.d8x, (DialogInterface.OnClickListener) null, false);
            a2.x = -3476230;
            a2.f33408h = 2131233238;
            a2.n = new ao(this);
            a2.a().c();
            this.ap = true;
            com.ss.android.ugc.aweme.base.h.d.f().b("is_need_show_collect_succed_dialog", false);
        } else if (!this.ap && (context = getContext()) != null && (baseResponse instanceof CollectMusicResponse)) {
            CollectMusicResponse collectMusicResponse = (CollectMusicResponse) baseResponse;
            if (collectMusicResponse.action == 1 && com.ss.android.ugc.aweme.music.l.a.a(context) && (ressoCollectInfo = collectMusicResponse.ressoCollectInfo) != null && ressoCollectInfo.getAddedOnResso()) {
                String str = "";
                if (com.ss.android.ugc.aweme.base.h.d.f().a("is_need_show_sync_resso_collect_succed_guide", true)) {
                    ArrayList arrayList = new ArrayList();
                    d.a aVar = new d.a();
                    aVar.f45492d = R.string.day;
                    aVar.f45494f = new ap(ressoCollectInfo, context);
                    aVar.f45490b = R.attr.x;
                    arrayList.add(aVar);
                    com.ss.android.ugc.aweme.base.h.d.f().b("is_need_show_sync_resso_collect_succed_guide", false);
                    com.bytedance.tux.tooltip.a.a.b bVar = (com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b(context).a(com.bytedance.tux.tooltip.h.BOTTOM).b(this.r);
                    h.f.b.l.c(arrayList, str);
                    bVar.f45483c = arrayList;
                    bVar.d().a();
                    str = "Resso";
                } else {
                    new com.bytedance.tux.g.b(this).e(R.string.dax).b();
                }
                com.ss.android.ugc.aweme.common.r.a("favorite_sync_toast_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "single_song").a("music_id", this.ah).a("group_id", this.an).a("process_id", this.at).a("resso_track_id", Uri.parse(ressoCollectInfo.getDeepLink()).getQueryParameter("track_id")).a("anchor_type", str).f66730a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.ss.android.ugc.aweme.music.model.MusicDetail r18) {
        /*
        // Method dump skipped, instructions count: 868
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.ah.b(com.ss.android.ugc.aweme.music.model.MusicDetail):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final com.ss.android.ugc.aweme.g.a.g a(ViewGroup viewGroup) {
        com.ss.android.ugc.aweme.v.a.a aVar = new com.ss.android.ugc.aweme.v.a.a(requireContext(), getLayoutInflater(), R.string.fw0);
        this.bg = aVar;
        aVar.a(this.Z);
        viewGroup.findViewById(R.id.e9v).setOnClickListener(new bp() {
            /* class com.ss.android.ugc.aweme.music.ui.ah.AnonymousClass9 */

            static {
                Covode.recordClassIndex(71906);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                boolean z;
                String str;
                String str2;
                com.bytedance.track.b bVar;
                if (ah.this.getActivity() == null || !MSAdaptionService.c().b((Context) ah.this.getActivity())) {
                    ah.this.aq = UUID.randomUUID().toString();
                    ah.this.au = System.currentTimeMillis();
                    boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                    boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
                    androidx.fragment.app.e activity = ah.this.getActivity();
                    com.ss.android.ugc.aweme.music.presenter.n nVar = ah.this.ag;
                    Context requireContext = ah.this.requireContext();
                    String str3 = ah.this.aq;
                    if (!downloadEffectOrMusicAfterEnterCamera || (isRecording && activity != null)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", "single_song").a("enter_from", "single_song").a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(str3)).a("music_id", nVar.f111606k).a("group_id", nVar.o).a("is_ui_shoot", (Object) true);
                    if (!TextUtils.isEmpty(nVar.C)) {
                        a2.a("from_banner_id", nVar.C);
                    }
                    if ("homepage_hot".equals(nVar.f111607l)) {
                        a2.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(nVar.o, 0)));
                    }
                    String e2 = nVar.e();
                    if (!TextUtils.isEmpty(e2)) {
                        nVar.a(a2);
                    }
                    nVar.b(a2);
                    a2.a("shoot_enter_from", nVar.D);
                    a2.a("is_bundled", nVar.E);
                    AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a2.f66730a);
                    String str4 = "search_result";
                    if (nVar.f111605g == null || MusicService.m().a(nVar.f111605g.convertToMusicModel(), requireContext, true)) {
                        android.ss.com.vboost.a.a(android.ss.com.vboost.d.TT_TAB_PUBLISH_LOAD, 3000);
                        String str5 = nVar.w;
                        if (com.ss.android.ugc.aweme.account.b.g().getCurUser().isLive()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(requireContext).a(R.string.cp5).a();
                            return;
                        }
                        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
                        if (!publishService.isParallelPublishEnabled() ? publishService.isPublishing() : !publishService.isPublishable()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(requireContext).a(R.string.fal).a();
                        } else if (nVar.f111605g == null || TextUtils.isEmpty(nVar.f111605g.getOwnerBanShowInfo())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("route", "1");
                                jSONObject.put("group_id", nVar.o);
                            } catch (JSONException e3) {
                                e3.printStackTrace();
                            }
                            com.ss.android.ugc.aweme.metrics.ah.f109483a = "single_song";
                            com.ss.android.ugc.aweme.metrics.ah.f109485c = "click_music_publish";
                            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", str3).a("shoot_way", "single_song").a("enter_from", nVar.n).a("music_id", nVar.f111606k).a("process_id", str5).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(str3)).a("is_ui_shoot", (Object) false).a("group_id", nVar.o).a("previous_page_position", nVar.f111608m).a("search_type", SearchServiceImpl.t().p().get("searchType")).a("shoot_enter_from", nVar.D).a("is_bundled", nVar.E);
                            if (!TextUtils.isEmpty(nVar.C)) {
                                a3.a("from_banner_id", nVar.C);
                            }
                            if ("homepage_hot".equals(nVar.f111607l)) {
                                a3.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(nVar.o, 0)));
                            }
                            if ("general_search".equals(nVar.f111607l) || str4.equals(nVar.f111607l)) {
                                com.bytedance.track.b a4 = com.bytedance.track.c.a(null, "Search", com.ss.android.ugc.aweme.search.n.c.class);
                                if (a4 != null) {
                                    bVar = (com.bytedance.track.b) a4.makeCopy();
                                } else {
                                    bVar = null;
                                }
                                com.ss.android.ugc.aweme.search.n.c cVar = (com.ss.android.ugc.aweme.search.n.c) bVar;
                                if (cVar != null) {
                                    a3.a("search_id", cVar.f121543a.f121540a);
                                }
                            }
                            nVar.b(a3);
                            if (!TextUtils.isEmpty(nVar.e())) {
                                nVar.a(a3);
                            }
                            AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a3.f66730a);
                            if (TextUtils.equals(str4, nVar.f111607l) || TextUtils.equals("general_search", nVar.f111607l) || TextUtils.equals("search_for_you_list", nVar.f111607l)) {
                                com.ss.android.ugc.aweme.app.f.d a5 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", str3).a("shoot_way", "single_song").a("music_id", nVar.f111606k);
                                if (TextUtils.equals("general_search", nVar.f111607l)) {
                                    str = "general";
                                } else {
                                    str = "music";
                                }
                                com.ss.android.ugc.aweme.app.f.d a6 = a5.a("search_type", str);
                                if (TextUtils.equals("general_search", nVar.f111607l)) {
                                    str2 = str4;
                                } else {
                                    str2 = nVar.f111607l;
                                }
                                com.ss.android.ugc.aweme.common.r.a("search_shoot", a6.a("previous_page", str2).f66730a);
                            }
                            if (nVar.f111605g == null || MusicService.m().a(nVar.f111605g.convertToMusicModel(), requireContext, true)) {
                                nVar.r.a(nVar.f111604f, nVar.l(), nVar.A, z);
                                return;
                            }
                            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                            if (!TextUtils.equals("general_search", nVar.f111607l)) {
                                str4 = nVar.f111607l;
                            }
                            com.ss.android.ugc.aweme.common.r.a("user_music_failed", dVar.a("previous_page", str4).a("action_type", "shoot").a("music_id", nVar.f111606k).a("enter_from", nVar.f111607l).f66730a);
                        } else {
                            new com.ss.android.ugc.aweme.tux.a.i.a(requireContext).a(nVar.f111605g.getOwnerBanShowInfo()).a();
                        }
                    } else {
                        com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                        if (!TextUtils.equals("general_search", nVar.f111607l)) {
                            str4 = nVar.f111607l;
                        }
                        com.ss.android.ugc.aweme.app.f.d a7 = dVar2.a("previous_page", str4).a("action_type", "shoot").a("music_id", nVar.f111606k).a("enter_from", nVar.f111607l);
                        if (!TextUtils.isEmpty(e2)) {
                            nVar.a(a7);
                        }
                        com.ss.android.ugc.aweme.common.r.a("user_music_failed", a7.f66730a);
                    }
                } else {
                    Toast makeText = Toast.makeText(ah.this.getActivity(), ah.this.getString(R.string.bey), 0);
                    if (Build.VERSION.SDK_INT == 25) {
                        ic.a(makeText);
                    }
                    makeText.show();
                }
            }
        });
        return this.bg.a(viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r16 == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.ss.android.ugc.aweme.music.model.MusicDetail r19) {
        /*
        // Method dump skipped, instructions count: 1155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.ah.c(com.ss.android.ugc.aweme.music.model.MusicDetail):void");
    }

    public final void b(View view) {
        List<Aweme> p2;
        int id = view.getId();
        if (id == R.id.qb) {
            com.bytedance.a.b.c("music", "list");
            if (MSAdaptionService.c().c(getContext())) {
                SmartRouter.buildRoute(getContext(), "//duo").withParam("duo_type", "duo_back").open();
                return;
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (id == R.id.e0k) {
            com.ss.android.ugc.aweme.music.presenter.n nVar = this.ag;
            androidx.fragment.app.e activity2 = getActivity();
            u uVar = this.aT;
            if (uVar == null) {
                p2 = null;
            } else {
                p2 = uVar.p();
            }
            if (nVar.f111605g != null) {
                if (!MusicService.m().a(nVar.f111605g.convertToMusicModel(), activity2, true)) {
                    com.ss.android.ugc.aweme.common.r.a("user_music_failed", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "music_hot").a("action_type", "share").a("music_id", nVar.f111605g.getMid()).a("enter_from", nVar.f111607l).f66730a);
                    return;
                }
                activity2.getApplicationContext();
                com.ss.android.ugc.aweme.common.r.a("click_share_button", "music_hot", nVar.f111605g.getMid(), 0);
                com.ss.android.ugc.aweme.metrics.f a2 = new com.ss.android.ugc.aweme.metrics.f().a("music_hot");
                a2.t = "music_hot";
                a2.f109568a = nVar.o;
                a2.f();
            }
            if (nVar.f111604f != null) {
                com.ss.android.ugc.aweme.common.r.a("share_single_song", new com.ss.android.ugc.aweme.app.f.d().a("song_id", nVar.f111604f.getMusicId()).a("enter_from", "single_song").a("process_id", nVar.w).f66730a);
            }
            SecApiImpl.a().reportData("share");
            if (nVar.f111605g != null && nVar.f111605g.getShareInfo() != null) {
                com.ss.android.ugc.aweme.share.ah.f123352a.a(activity2, nVar.f111605g, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0109: INVOKE  
                      (wrap: com.ss.android.ugc.aweme.share.ShareService : 0x00fc: SGET  (r11v2 com.ss.android.ugc.aweme.share.ShareService) =  com.ss.android.ugc.aweme.share.ah.a com.ss.android.ugc.aweme.share.ShareService)
                      (r12v0 'activity2' androidx.fragment.app.e)
                      (wrap: com.ss.android.ugc.aweme.music.model.Music : 0x00fe: IGET  (r13v0 com.ss.android.ugc.aweme.music.model.Music) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) com.ss.android.ugc.aweme.music.presenter.n.g com.ss.android.ugc.aweme.music.model.Music)
                      (wrap: com.ss.android.ugc.aweme.music.presenter.n$1 : 0x0102: CONSTRUCTOR  (r14v0 com.ss.android.ugc.aweme.music.presenter.n$1) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) call: com.ss.android.ugc.aweme.music.presenter.n.1.<init>(com.ss.android.ugc.aweme.music.presenter.n):void type: CONSTRUCTOR)
                      (r15v1 'p2' java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
                      (wrap: java.lang.String : 0x0105: IGET  (r0v52 java.lang.String) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) com.ss.android.ugc.aweme.music.presenter.n.w java.lang.String)
                     type: INTERFACE call: com.ss.android.ugc.aweme.share.ShareService.a(android.app.Activity, com.ss.android.ugc.aweme.music.model.Music, com.ss.android.ugc.aweme.sharer.ui.g, java.util.List, java.lang.String):void in method: com.ss.android.ugc.aweme.music.ui.ah.b(android.view.View):void, file: classes5.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: CONSTRUCTOR  (r14v0 com.ss.android.ugc.aweme.music.presenter.n$1) = (r5v3 'nVar' com.ss.android.ugc.aweme.music.presenter.n) call: com.ss.android.ugc.aweme.music.presenter.n.1.<init>(com.ss.android.ugc.aweme.music.presenter.n):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.music.ui.ah.b(android.view.View):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.music.presenter.n, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                // Method dump skipped, instructions count: 514
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.ah.b(android.view.View):void");
            }

            @Override // com.ss.android.ugc.aweme.detail.a
            public final void a(int i2, int i3) {
                super.a(i2, i3);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.w.a
            public final void a_(int i2, boolean z) {
                ProgressDialog progressDialog;
                ProgressDialog progressDialog2;
                if (!z && (progressDialog = this.aj) != null) {
                    progressDialog.setProgress(i2);
                    if (i2 >= 98 && (progressDialog2 = this.aj) != null) {
                        progressDialog2.setCancelable(true);
                    }
                }
            }

            private static boolean a(List<MusicOwnerInfo> list, String str) {
                if (!(list == null || list.size() == 0 || TextUtils.isEmpty(str))) {
                    for (MusicOwnerInfo musicOwnerInfo : list) {
                        if (TextUtils.equals(musicOwnerInfo.getUid(), str)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            private void a(boolean z, boolean z2) {
                if (!ab_() || this.U == null) {
                    SpringLayout springLayout = this.ad;
                    if (springLayout != null) {
                        springLayout.setRefreshing(false);
                        return;
                    }
                    return;
                }
                getContext();
                if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                    com.ss.android.ugc.aweme.lancet.j.f107226e = m();
                }
                if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                    if (z) {
                        new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                    }
                    this.U.h();
                } else {
                    this.U.f();
                    if (!TextUtils.isEmpty(this.ah) || TextUtils.isEmpty(this.aQ)) {
                        com.bytedance.ies.watcher.c.b("md_start_activity_to_request_net_duration");
                        this.ag.a(this.ah, Integer.valueOf(this.aW), 0, Boolean.valueOf(z2));
                    } else {
                        this.ag.a(this.aQ, this.aR, 1, Boolean.valueOf(z2));
                    }
                    if (z) {
                        for (h hVar : this.I) {
                            hVar.a(false, z2);
                        }
                    }
                }
                if (z2) {
                    this.U.d();
                }
            }

            @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
            public final void b(int i2, int i3) {
                boolean z;
                super.b(i2, i3);
                com.ss.android.ugc.aweme.dh.d dVar = this.ao;
                if (dVar != null && dVar.isShowing()) {
                    this.ao.dismiss();
                }
                if (this.ae != null && i2 > com.ss.android.ugc.aweme.base.utils.n.a(44.0d)) {
                    this.ae.dismiss();
                }
                float f2 = 0.0f;
                if (this.aB == 0.0f) {
                    if (this.f111849d.getVisibility() == 0) {
                        this.aB = (float) (this.f111849d.getBottom() - this.A.getBottom());
                    } else if (this.T.getVisibility() == 0) {
                        this.aB = (float) (this.T.getBottom() - this.A.getBottom());
                    }
                }
                if (this.aA == 0.0f) {
                    this.aA = (float) (this.f111854m.getBottom() - this.A.getBottom());
                }
                float f3 = (float) i2;
                float f4 = this.aB;
                float f5 = this.aA;
                float f6 = (f3 - f4) / (f5 - f4);
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                float f7 = f3 / f5;
                if (f7 >= 0.0f) {
                    f2 = f7;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                }
                this.z.setAlpha(f2);
                ImageView imageView = this.t;
                imageView.setAlpha(1.0f - f6);
                if (imageView.getAlpha() >= 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                imageView.setClickable(z);
                this.be = m.a(f6, this.be, this);
            }

            private static boolean a(Activity activity, TextView textView) {
                if (activity == null) {
                    return false;
                }
                String charSequence = textView.getText().toString();
                if (TextUtils.isEmpty(charSequence)) {
                    return false;
                }
                Rect rect = new Rect();
                textView.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
                int width = rect.width();
                double a2 = (double) com.bytedance.common.utility.n.a(activity);
                Double.isNaN(a2);
                double b2 = (double) com.bytedance.common.utility.n.b(activity, 50.0f);
                Double.isNaN(b2);
                if ((a2 / 2.0d) - b2 < ((double) width)) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.challenge.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                this.bd = view;
                this.ad = (SpringLayout) view.findViewById(R.id.dk8);
                if (!com.ss.android.ugc.aweme.tux.a.b.a.a()) {
                    this.ad.setOverScrollMode(com.bytedance.tux.widget.spring.e.NONE);
                    this.ad.setScrollMode(com.bytedance.tux.widget.spring.g.NONE);
                    this.ad.setNestedHeader(null);
                } else {
                    this.ad.setOnRefreshListener(new ai(this));
                }
                this.f111849d = (ViewGroup) view.findViewById(R.id.cqo);
                this.f111850e = (TextView) view.findViewById(R.id.f3g);
                this.f111851j = (TextView) view.findViewById(R.id.f4k);
                this.f111852k = (SmartImageView) view.findViewById(R.id.cpt);
                this.f111853l = view.findViewById(R.id.emo);
                this.f111854m = view.findViewById(R.id.bez);
                this.n = (TextView) view.findViewById(R.id.fcq);
                this.o = (SmartImageView) view.findViewById(R.id.sr);
                this.t = (ImageView) view.findViewById(R.id.bz9);
                this.u = (ImageView) view.findViewById(R.id.cqy);
                this.N = (ImageView) view.findViewById(R.id.cr7);
                this.O = (ImageView) view.findViewById(R.id.cqn);
                this.P = (RecyclerView) view.findViewById(R.id.ei3);
                this.Q = view.findViewById(R.id.ei0);
                this.R = view.findViewById(R.id.al2);
                this.S = (TextView) view.findViewById(R.id.au_);
                this.T = (TextView) view.findViewById(R.id.crb);
                this.U = (DmtStatusView) view.findViewById(R.id.e_o);
                this.V = (ImageView) view.findViewById(R.id.e0k);
                this.W = (ViewStub) view.findViewById(R.id.fl7);
                this.X = (ViewStub) view.findViewById(R.id.flb);
                this.Y = (ViewStub) view.findViewById(R.id.d44);
                this.Z = (RelativeLayout) view.findViewById(R.id.e9y);
                this.aa = view.findViewById(R.id.abu);
                this.ab = view.findViewById(R.id.e7k);
                this.ac = (LinearLayout) view.findViewById(R.id.cpy);
                View findViewById = view.findViewById(R.id.qb);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new aj(this));
                }
                View findViewById2 = view.findViewById(R.id.cpt);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new as(this));
                }
                View findViewById3 = view.findViewById(R.id.e0k);
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(new at(this));
                }
                View findViewById4 = view.findViewById(R.id.cr7);
                if (findViewById4 != null) {
                    findViewById4.setOnClickListener(new au(this));
                }
                View findViewById5 = view.findViewById(R.id.cqy);
                if (findViewById5 != null) {
                    findViewById5.setOnClickListener(new av(this));
                }
                View findViewById6 = view.findViewById(R.id.cqo);
                if (findViewById6 != null) {
                    findViewById6.setOnClickListener(new aw(this));
                }
                super.onViewCreated(view, bundle);
                if (!TextUtils.isEmpty(this.ah) || !TextUtils.isEmpty(this.aQ)) {
                    this.I = new ArrayList();
                    this.J = new ArrayList();
                    this.f70119a = new ArrayList();
                    this.aL = new cr(getChildFragmentManager(), this.J, this.f70119a);
                    this.am = new w(getActivity(), this, false);
                    this.aY = new SafeHandler(this);
                    com.ss.android.ugc.aweme.music.presenter.n nVar = new com.ss.android.ugc.aweme.music.presenter.n();
                    this.ag = nVar;
                    nVar.a_(this);
                    com.ss.android.ugc.aweme.music.presenter.n nVar2 = this.ag;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        nVar2.f111606k = arguments.getString("id");
                        nVar2.f111607l = arguments.getString("extra_music_from");
                        nVar2.f111608m = arguments.getString("extra_previous_page_position");
                        nVar2.o = arguments.getString("aweme_id");
                        nVar2.w = arguments.getString("process_id");
                        nVar2.x = arguments.getString("sticker_id");
                        if ("share_from_resso".equals(nVar2.f111607l)) {
                            nVar2.n = "share_from_resso";
                        }
                        nVar2.A = arguments.getInt("extra_video_length", 0);
                        nVar2.C = arguments.getString("banner_id", "");
                        nVar2.B = arguments.getString("extra_track_info");
                        nVar2.f111598d = com.bytedance.ies.powerpreload.task.e.a(arguments);
                        nVar2.f111599e = Long.valueOf(arguments.getLong("EXTRA_PRELOAD_PAGE_START_TIME"));
                        nVar2.D = arguments.getString("shoot_enter_from", "");
                        nVar2.E = arguments.getInt("is_bundled", 0);
                    }
                    this.ag.r = this.am;
                    this.ag.t.observe(this, new ax(this));
                    if ("share_from_resso".equals(this.af)) {
                        this.ag.w = this.at;
                        com.ss.android.ugc.aweme.metrics.m o2 = new com.ss.android.ugc.aweme.metrics.m().o("share_from_resso");
                        o2.p = this.ah;
                        o2.r = this.at;
                        o2.f();
                    }
                    this.U.setBuilder(DmtStatusView.a.a(getContext()).b(new d.a(getContext()).a(2131232886).b(R.string.h2z).c(R.string.h2y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.h35, new ay(this)).f33648a));
                    a(false, false);
                    return;
                }
                getActivity().finish();
            }

            @Override // androidx.fragment.app.Fragment
            public void onActivityResult(int i2, int i3, Intent intent) {
                super.onActivityResult(i2, i3, intent);
                if (i2 == 0 && i3 == -1 && intent != null) {
                    com.ss.android.ugc.aweme.music.presenter.n nVar = this.ag;
                    String a2 = com.ss.android.ugc.aweme.music.presenter.n.a(intent, "MUSIC_TITLE");
                    if (nVar.f111605g != null) {
                        nVar.f111605g.setMusicName(a2);
                    }
                    if (nVar.f76397i != null) {
                        ((r) nVar.f76397i).a((CharSequence) a2);
                    }
                }
            }
        }
