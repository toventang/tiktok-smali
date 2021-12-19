package com.ss.android.ugc.aweme.comment.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.cm.a;
import com.ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.api.CommentBatchManagementApi;
import com.ss.android.ugc.aweme.comment.b;
import com.ss.android.ugc.aweme.comment.f.c;
import com.ss.android.ugc.aweme.comment.f.d;
import com.ss.android.ugc.aweme.comment.f.e;
import com.ss.android.ugc.aweme.comment.f.f;
import com.ss.android.ugc.aweme.comment.f.i;
import com.ss.android.ugc.aweme.comment.j.p;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.ss.android.ugc.aweme.comment.model.CommentPrompt;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.comment.services.b;
import com.ss.android.ugc.aweme.comment.supporterpanel.j;
import com.ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi;
import com.ss.android.ugc.aweme.comment.ui.bs;
import com.ss.android.ugc.aweme.comment.ui.bx;
import com.ss.android.ugc.aweme.comment.util.k;
import com.ss.android.ugc.aweme.comment.util.v;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.experiment.ai;
import com.ss.android.ugc.aweme.feed.g.b;
import com.ss.android.ugc.aweme.feed.i.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.feed.x.t;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.metrics.q;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.bv;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import h.f.b.l;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class k extends a implements com.ss.android.ugc.aweme.comment.f.a, c, d, f, i, com.ss.android.ugc.aweme.comment.g.a, b, com.ss.android.ugc.aweme.comment.translatorinfo.a, k.a, h.a, com.ss.android.ugc.aweme.common.e.c<Comment>, org.greenrobot.eventbus.i, j {
    public static long D;
    private static boolean aq;
    v A;
    s<ag> B;
    a C;
    public DataCenter E;
    FrameLayout F;
    public boolean G = false;
    boolean H = false;
    public CommentBatchManagementViewModel I;
    com.ss.android.ugc.aweme.common.f.a J;
    e K;
    public boolean L;
    IVideoGiftService M = VideoGiftService.l();
    String N = "";
    public long O;
    private Comment P;
    private ConstraintLayout Q;
    private TuxTextView R;
    private ImageView S;
    private SmartImageView T;
    private View U;
    private TuxIconView V;
    private TuxIconView W;
    private ImageView X;
    private DmtStatusView Y;
    private RecyclerView Z;

    /* renamed from: a  reason: collision with root package name */
    final int f72762a = ((int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 30.0f));
    private long aA;
    private long aB;
    private String aC = "";
    private boolean aD;
    private boolean aE;
    private long aF;
    private long aG;
    private final long aH = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    private com.ss.android.ugc.aweme.comment.translatorinfo.b aI;
    private boolean aJ = false;
    private boolean aK = false;
    private TextView aa;
    private View ab;
    private View ac;
    private View ad;
    private com.ss.android.ugc.aweme.discover.c.a ae;
    private TextView af;
    private com.ss.android.ugc.aweme.commercialize.egg.e.a ag;
    private com.ss.android.ugc.aweme.comment.j.e ah;
    private com.ss.android.ugc.aweme.comment.j.h ai;
    private p aj;
    private String ak;
    private String al;
    private boolean am = false;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private long ar;
    private long as;
    private com.ss.android.ugc.aweme.arch.widgets.base.e at;
    private Widget au;
    private boolean av = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
    private boolean aw = false;
    private u<Integer> ax;
    private DmtStatusView.a ay;
    private Set<String> az = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.i.h f72763b = new com.ss.android.ugc.aweme.comment.i.h("");

    /* renamed from: c  reason: collision with root package name */
    public Aweme f72764c;

    /* renamed from: d  reason: collision with root package name */
    public Comment f72765d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f72766e;

    /* renamed from: j  reason: collision with root package name */
    MentionEditText f72767j;

    /* renamed from: k  reason: collision with root package name */
    TuxIconView f72768k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f72769l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f72770m;
    ImageView n;
    TextView o;
    TextView p;
    TextView q;
    View r;
    public com.bytedance.ies.dmt.ui.tooltip.a s;
    public bs t;
    public WrapLinearLayoutManager u;
    public com.ss.android.ugc.aweme.comment.adapter.a v;
    public com.ss.android.ugc.aweme.comment.j.k w;
    public bt y;
    public com.ss.android.ugc.aweme.comment.b z;

    static {
        Covode.recordClassIndex(44828);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(253, new g(k.class, "onExpandingCachedCommentReplies", com.ss.android.ugc.aweme.comment.c.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(54, new g(k.class, "onEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(254, new g(k.class, "onReportCommentEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(255, new g(k.class, "onEnterTextEvent", com.ss.android.ugc.aweme.comment.c.f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(256, new g(k.class, "onUserBlockedEvent", com.ss.android.ugc.aweme.profile.b.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(34, new g(k.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new g(k.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(257, new g(k.class, "onEvent", com.ss.android.ugc.aweme.comment.c.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(258, new g(k.class, "onDiggUpdateEvent", ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(259, new g(k.class, "onEvent", com.ss.android.ugc.aweme.commercialize.event.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new g(k.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(260, new g(k.class, "onEvent", com.ss.android.ugc.aweme.main.f.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(261, new g(k.class, "onEvent", ac.class, ThreadMode.POSTING, 0, false));
        hashMap.put(150, new g(k.class, "onAfterLoginInEvent", com.ss.android.ugc.aweme.al.f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public void onEvent(com.ss.android.ugc.aweme.forward.a.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final RecyclerView c() {
        return this.Z;
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void j() {
        A();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Aweme m() {
        return this.f72764c;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final Comment n() {
        return this.f72765d;
    }

    @Override // com.ss.android.ugc.aweme.comment.translatorinfo.a
    public final void r() {
        ab();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(Aweme aweme) {
        b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(com.ss.android.ugc.aweme.comment.i.h hVar) {
        this.aE = false;
        this.aF = 0;
        b(hVar);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void b(boolean z2) {
        if (z2 && com.ss.android.ugc.aweme.commercialize.e.a.b.ae(this.f72764c)) {
            this.E.a("comment_dialog_state", (Object) 3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(List list, List list2, int i2, Set set, int i3) {
        androidx.fragment.app.e activity = getActivity();
        String join = TextUtils.join(",", list);
        String join2 = TextUtils.join(",", list2);
        int height = this.F.getHeight();
        l.d(activity, "");
        l.d(join, "");
        l.d(join2, "");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_ids", join).appendQueryParameter("owner_ids", join2).appendQueryParameter("report_type", UGCMonitor.EVENT_COMMENT).appendQueryParameter("is_batch", "1").appendQueryParameter("locale", SettingServiceImpl.v().h());
        Bundle bundle = new Bundle();
        bundle.putInt("half_screen_height", height);
        com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, appendQueryParameter, bundle);
        int size = set.size();
        String enterFrom = this.f72763b.getEnterFrom();
        l.d(enterFrom, "");
        r.a("comment_batch_management_report_confirm_ck", new com.ss.android.ugc.aweme.app.f.d().a("c_number", i2).a("u_number", size).a("video_reply_number", i3).a("enter_from", enterFrom).f66730a);
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, Comment> map) {
        String str;
        int i2;
        HashSet hashSet = new HashSet();
        String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        Map<String, Comment> map2 = this.I.f72896c;
        map2.clear();
        Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
        int i3 = 0;
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Comment value = it.next().getValue();
            if (value.getUser() != null) {
                str = value.getUser().getUid();
            }
            if (!TextUtils.equals(curUserId, str)) {
                hashSet.add(str);
                map2.put(value.getCid(), value);
            }
            if (value.getAliasAweme() != null) {
                i3++;
            }
        }
        if (map2.size() == 0) {
            new com.bytedance.tux.g.b(this).a(getString(R.string.ajx)).b();
            return;
        }
        int size = hashSet.size();
        int size2 = hashSet.size();
        String enterFrom = this.f72763b.getEnterFrom();
        l.d(enterFrom, str);
        r.a("comment_batch_management_block_ck", new com.ss.android.ugc.aweme.app.f.d().a("c_number", size).a("u_number", size2).a("video_reply_number", i3).a("enter_from", enterFrom).f66730a);
        if (com.ss.android.ugc.aweme.comment.a.b.a().length == 3) {
            i2 = com.ss.android.ugc.aweme.comment.a.b.a()[2];
        } else {
            i2 = 100;
        }
        if (size > i2) {
            new com.bytedance.tux.g.b(this).a(getContext().getResources().getQuantityString(R.plurals.y, size, Integer.valueOf(size)) + getContext().getResources().getQuantityString(R.plurals.z, i2, Integer.valueOf(i2))).b();
        } else if (hashSet.size() > 0) {
            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(getContext());
            bVar.a(R.string.ajv, new p(this, hashSet, map, i3));
            bVar.b(R.string.ajz, q.f72811a);
            int size3 = hashSet.size();
            ((com.bytedance.tux.dialog.b) a.C1094a.a(requireContext()).b(getActivity().getResources().getQuantityString(R.plurals.a1, size3, Integer.valueOf(size3))).d(getActivity().getResources().getQuantityString(R.plurals.a0, size3, Integer.valueOf(size3))).a(bVar).a(false)).a().b().show();
            r.onEventV3("comment_batch_management_block_confirm_sw");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(final Set set, Map map, int i2) {
        CommentBatchManagementApi.a.a().userBatchBlock(TextUtils.join(",", set)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<com.ss.android.ugc.aweme.comment.api.f>() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass8 */

            static {
                Covode.recordClassIndex(44841);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.comment.api.f fVar) {
                if (k.this.I != null) {
                    k.this.a(set);
                    new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.t7).b();
                }
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ajw).b();
                } else if (k.this.I != null) {
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                    switch (aVar.getErrorCode()) {
                        case 3001210:
                        case 3001211:
                            new com.bytedance.tux.g.b(k.this.getActivity()).a(k.this.getString(R.string.ajw)).b();
                            return;
                        case 3002038:
                            k.this.a(aVar, set);
                            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(k.this.getContext());
                            bVar.a(R.string.erf, new be(this));
                            bVar.b(R.string.ere, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                            ((com.bytedance.tux.dialog.b) a.C1094a.a(k.this.requireContext()).d(k.this.getActivity().getResources().getString(R.string.erg)).a(bVar).a(false)).a().b().show();
                            return;
                        case 3002058:
                            k.this.a(aVar, set);
                            return;
                        default:
                            boolean unused = com.ss.android.ugc.aweme.comment.api.c.a(k.this.getContext(), aVar, R.string.ajw, false, false);
                            return;
                    }
                }
            }
        });
        int size = map.size();
        int size2 = set.size();
        String enterFrom = this.f72763b.getEnterFrom();
        l.d(enterFrom, "");
        r.a("comment_batch_management_block_confirm_ck", new com.ss.android.ugc.aweme.app.f.d().a("c_number", size).a("u_number", size2).a("video_reply_number", i2).a("enter_from", enterFrom).f66730a);
        return z.f158842a;
    }

    public final void a(com.ss.android.ugc.aweme.base.api.a.b.a aVar, Set<String> set) {
        com.ss.android.ugc.aweme.comment.api.f fVar = (com.ss.android.ugc.aweme.comment.api.f) aVar.getRawResponse();
        if (!TextUtils.isEmpty(fVar.f71465a) && !com.bytedance.common.utility.collection.b.a((Collection) set)) {
            List asList = Arrays.asList(fVar.f71465a.split(","));
            if (set.containsAll(asList)) {
                set.removeAll(asList);
            }
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) set)) {
            a(set);
            new com.bytedance.tux.g.b(this).e(R.string.ak5).b();
            return;
        }
        new com.bytedance.tux.g.b(this).e(R.string.ajw).b();
    }

    public final void a(Set<String> set) {
        if (!(this.A == null || com.bytedance.common.utility.collection.b.a((Collection) set) || com.bytedance.common.utility.collection.b.a((Collection) this.A.f72883a))) {
            List<CommentReplyListItem> list = this.A.f72883a;
            Map<String, Comment> map = this.I.f72895b;
            HashSet hashSet = new HashSet();
            int i2 = 0;
            int i3 = 0;
            for (CommentReplyListItem commentReplyListItem : list) {
                Comment comment = commentReplyListItem.mComment;
                if (comment != null) {
                    if (comment.getUser() != null && set.contains(comment.getUser().getUid())) {
                        map.put(comment.getCid(), comment);
                        hashSet.add(comment.getCid());
                        i2 = (int) (((long) i2) + comment.getReplyCommentTotal() + 1);
                    } else if (!com.bytedance.common.utility.collection.b.a((Collection) commentReplyListItem.mReplyComments)) {
                        for (Comment comment2 : commentReplyListItem.mReplyComments) {
                            if (comment2.getUser() == null || !set.contains(comment2.getUser().getUid())) {
                                i3++;
                            } else {
                                map.put(comment.getCid(), comment);
                                hashSet.add(comment2.getCid());
                                i2++;
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
            a(i2, (Set<String>) hashSet, map, false);
            if (i3 == 0 && this.O > 0) {
                v();
            }
            if (set.contains(V())) {
                this.y.f72627d = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(final Set set, int i2, Set set2, int i3) {
        CommentBatchManagementApi.a.a().commentBatchDelete(TextUtils.join(",", set), this.f72764c.getAid()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<com.ss.android.ugc.aweme.comment.api.b>() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass9 */

            static {
                Covode.recordClassIndex(44842);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(com.ss.android.ugc.aweme.comment.api.b bVar) {
                if (k.this.I != null) {
                    Map<String, Comment> map = k.this.I.f72895b;
                    k.this.a(k.this.I.f72894a, set, map, true);
                    new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ak2).b();
                }
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                long j2;
                if (com.bytedance.common.utility.collection.b.a((Collection) set) || !(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ak1).b();
                    return;
                }
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (aVar.getErrorCode() == 3017005) {
                    String str = ((com.ss.android.ugc.aweme.comment.api.b) aVar.getRawResponse()).f71460a;
                    if (k.this.I == null || TextUtils.isEmpty(str)) {
                        new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ak1).b();
                        return;
                    }
                    Map<String, Comment> map = k.this.I.f72895b;
                    int i2 = k.this.I.f72894a;
                    if (map.size() > 0 && i2 > 0) {
                        String[] split = str.split(",");
                        if (map.size() == split.length) {
                            new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ak1).b();
                            return;
                        }
                        for (String str2 : split) {
                            set.remove(str2);
                            i2--;
                            if (map.get(str2) != null) {
                                i2 = (int) (((long) i2) - map.get(str2).getReplyCommentTotal());
                            }
                        }
                        if (set.size() > 0 && k.this.y != null) {
                            k.this.y.a(set, map);
                            k kVar = k.this;
                            if (i2 > 0) {
                                j2 = (long) (-i2);
                            } else {
                                j2 = 0;
                            }
                            kVar.a(j2);
                            k.this.b(map);
                            k.this.I.b().postValue(Integer.valueOf(map.size()));
                        }
                        new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ak6).b();
                        return;
                    }
                    return;
                }
                boolean unused = com.ss.android.ugc.aweme.comment.api.c.a(k.this.getContext(), aVar, R.string.ak1, false, false);
            }
        });
        int size = set2.size();
        String enterFrom = this.f72763b.getEnterFrom();
        l.d(enterFrom, "");
        r.a("comment_batch_management_delete_confirm_ck", new com.ss.android.ugc.aweme.app.f.d().a("c_number", i2).a("u_number", size).a("video_reply_number", i3).a("enter_from", enterFrom).f66730a);
        return z.f158842a;
    }

    public final void a(int i2, Set<String> set, Map<String, Comment> map, boolean z2) {
        bt btVar;
        if (map.size() > 0 && i2 > 0 && !com.bytedance.common.utility.collection.b.a((Collection) set) && (btVar = this.y) != null) {
            btVar.a(set, map);
            a((long) (-i2));
            if (z2) {
                this.I.c();
                this.I.b().postValue(0);
                return;
            }
            b(map);
            this.I.b().postValue(Integer.valueOf(map.size()));
        }
    }

    private static void a(Set<String> set, Map<String, Comment> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            map.entrySet().removeIf(new t(set));
            return;
        }
        Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final boolean a() {
        e eVar;
        return getUserVisibleHint() && isVisible() && (eVar = this.K) != null && eVar.a();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        k.a aVar;
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        e(arrayList);
        this.y.a(exc, arrayList);
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.a(0);
        }
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && com.bytedance.common.utility.collection.b.a((Collection) this.A.f72884b)) {
            g(0);
        }
        if (com.ss.android.ugc.aweme.comment.util.k.f72844b != null) {
            k.c cVar = com.ss.android.ugc.aweme.comment.util.k.f72844b;
            if (cVar != null) {
                cVar.f72852g = System.currentTimeMillis();
            }
            com.ss.android.ugc.aweme.framework.a.a.b(4, "CommentLog", "CommentPageLoadTimer: onDataLoadFailed");
            k.c cVar2 = com.ss.android.ugc.aweme.comment.util.k.f72844b;
            if (!(cVar2 == null || (aVar = cVar2.f72854i) == null)) {
                k.c cVar3 = com.ss.android.ugc.aweme.comment.util.k.f72844b;
                aVar.a(cVar3 != null ? cVar3.d() : -1, false, 0);
            }
            com.ss.android.ugc.aweme.comment.util.k.b();
            com.ss.android.ugc.aweme.comment.util.k.f72844b = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    /* renamed from: a */
    public final void d(List<Comment> list, boolean z2) {
        int size;
        boolean z3;
        com.ss.android.ugc.aweme.comment.j.k kVar = this.w;
        if (kVar == null || kVar.f76396h == null || this.w.f76396h.mData == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() with return");
            return;
        }
        StringBuilder sb = new StringBuilder("onRefreshResult(): aid = ");
        Aweme aweme = this.f72764c;
        StringBuilder append = sb.append(aweme == null ? null : aweme.getAid()).append(" load size = ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        com.ss.android.ugc.aweme.framework.a.a.b(4, UGCMonitor.EVENT_COMMENT, append.append(size).toString());
        long j2 = D;
        if (j2 > 0) {
            b.i.b(new v(this, j2), b.i.f4824a);
            D = 0;
        }
        e eVar = this.K;
        if (eVar == null || !eVar.d()) {
            Aweme aweme2 = this.f72764c;
            if (aweme2 == null || !aweme2.getAwemeControl().canShowComment()) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() => showLoadEmpty() because canCommentShow == false");
                list.clear();
                f();
            }
            com.ss.android.ugc.aweme.comment.b bVar = this.z;
            if (bVar != null) {
                bVar.a(0);
            }
            a(list);
            b(list);
            long h2 = h(true);
            com.ss.android.ugc.aweme.comment.b bVar2 = this.z;
            if (bVar2 != null) {
                if (this.w.f76396h.mData.replyStyle == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bVar2.f71474h = z3;
            }
            d(list);
            e(list);
            if (ai()) {
                Comment comment = new Comment();
                comment.setCommentType(222);
                if (list != null) {
                    list.add(0, comment);
                }
            }
            if (this.w.f76396h.mData.hasFilteredComments()) {
                this.v.a((CharSequence) az());
                this.v.a(LinkMovementMethod.getInstance());
                this.v.f71323f = true;
            }
            this.y.a(list, z2);
            if (com.ss.android.ugc.aweme.story.d.a.d(this.f72764c) || (at() && !TextUtils.isEmpty(this.w.e()))) {
                this.Z.b(0);
            }
            g(h2);
            this.f72763b.setInsertCids(this.w.e(), this.f72763b.showReplyWithInsertCid(), this.f72763b.isForceOpenReply());
            as();
            com.ss.android.ugc.aweme.comment.util.k.a(list != null ? list.size() : 0);
            if (this.O > 0) {
                a(this.w.f76396h.mData.commentPrompt);
            }
            if (this.w.f76396h.mData.topGiftList != null && !this.w.f76396h.mData.topGiftList.isEmpty()) {
                View view = this.ab;
                if (view != null) {
                    this.ae.b(view);
                }
                this.ab = com.a.a(getLayoutInflater(), R.layout.jt, (ViewGroup) getView(), false);
                y yVar = new y(this);
                this.ab.findViewById(R.id.eog).setOnClickListener(yVar);
                this.ab.setOnClickListener(yVar);
                RecyclerView recyclerView = (RecyclerView) this.ab.findViewById(R.id.eof);
                com.ss.android.ugc.aweme.comment.gift.a aVar = new com.ss.android.ugc.aweme.comment.gift.a((ViewGroup) getView(), getContext(), yVar);
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.setAdapter(aVar);
                recyclerView.setOnClickListener(yVar);
                List<CommentGiftStruct> list2 = this.w.f76396h.mData.topGiftList;
                if (list2 != null) {
                    aVar.f71801a = (ArrayList) list2;
                    aVar.notifyDataSetChanged();
                }
                this.ae.a(this.ab);
                a(this.f72764c, this.w.f76396h.mData.topGiftList);
            }
            ab();
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() => postDelay onRefreshResult() because mCommentNestedLayout.needBlockDataLoading()");
        this.Z.postDelayed(new w(this, list, z2), 100);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Comment> list, boolean z2) {
        if (this.w.f76396h.mData.hasFilteredComments()) {
            this.v.a((CharSequence) az());
            this.v.a(LinkMovementMethod.getInstance());
            this.v.f71323f = true;
        }
        this.y.b(list, z2);
        g(h(false));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
        this.y.a(exc);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void a(String str, com.ss.android.ugc.aweme.comment.i.g gVar) {
        a((long) (-e(str)));
        this.y.a(str, gVar);
        boolean z2 = false;
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(4, new Object[]{this.f72763b.getAid(), str}));
        if (!(this.f72764c == null || this.P == null)) {
            com.ss.android.ugc.aweme.compliance.api.a.d().a(getActivity(), this.f72764c, this.P);
        }
        if (at()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.a(3, gVar.f72016c));
        }
        if (this.P.getAliasAweme() != null) {
            z2 = true;
        }
        if (com.ss.android.ugc.aweme.comment.a.f.a() && z2) {
            new com.bytedance.tux.g.b(getActivity()).e(R.string.am5).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.c
    public final void a(String str, String str2, Exception exc) {
        String str3;
        this.y.a(str, str2, exc);
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 3002043) {
            this.f72763b.setCommentClose(true);
            b(this.f72763b);
        }
        if (!TextUtils.isEmpty(this.ak)) {
            boolean f2 = f(str);
            boolean equals = TextUtils.equals(this.al, this.f72764c.getAuthorUid());
            String enterFrom = this.f72763b.getEnterFrom();
            String enterMethod = this.f72763b.getEnterMethod();
            Aweme aweme = this.f72764c;
            String str4 = this.al;
            boolean isHotPlayer = this.f72763b.isHotPlayer();
            int ae2 = ae();
            String lastGroupId = this.f72763b.getLastGroupId();
            if (f2) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            com.ss.android.ugc.aweme.comment.m.b.a(enterFrom, enterMethod, aweme, str, false, "list", str4, isHotPlayer, str2, ae2, lastGroupId, str3, !equals ? 1 : 0, this.f72763b.getAid(), com.ss.android.ugc.aweme.account.b.g().getCurUser().getPredictedAgeGroup(), g(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.c
    public final void a(Object... objArr) {
        String str;
        this.y.a(objArr[0]);
        if (!TextUtils.isEmpty(this.ak)) {
            boolean f2 = f((String) objArr[0]);
            boolean equals = TextUtils.equals(this.al, this.f72764c.getAuthorUid());
            String enterFrom = this.f72763b.getEnterFrom();
            String enterMethod = this.f72763b.getEnterMethod();
            Aweme aweme = this.f72764c;
            String str2 = (String) objArr[0];
            String str3 = this.al;
            boolean isHotPlayer = this.f72763b.isHotPlayer();
            String str4 = (String) objArr[1];
            int ae2 = ae();
            String lastGroupId = this.f72763b.getLastGroupId();
            if (f2) {
                str = "1";
            } else {
                str = "0";
            }
            com.ss.android.ugc.aweme.comment.m.b.a(enterFrom, enterMethod, aweme, str2, true, "list", str3, isHotPlayer, str4, ae2, lastGroupId, str, !equals ? 1 : 0, this.f72763b.getNewsId(), com.ss.android.ugc.aweme.account.b.g().getCurUser().getPredictedAgeGroup(), g((String) objArr[0]));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(getActivity(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", this.f72763b.getEventType()).withParam("extra_from_pre_page", "notification_page").withParam("sec_uid", str2).open();
            String eventType = this.f72763b.getEventType();
            String aid = this.f72763b.getAid();
            this.f72763b.getAuthorUid();
            String requestId = this.f72763b.getRequestId();
            Aweme aweme = this.f72764c;
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("group_id", aid).a("request_id", requestId).a("enter_from", eventType).a("enter_method", str3).a("enter_type", "normal_way").a()));
            r.a("enter_personal_detail_backup", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("to_user_id", str).a("group_id", aid).a("request_id", requestId).a("enter_method", str3).a("enter_type", "normal_way").f66730a);
            if (aweme != null) {
                r.onEvent(MobClick.obtain().setEventName("head").setLabelName(eventType).setValue(aweme.getAuthorUid()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("request_id", aweme.getRequestId()).a("group_id", aweme.getAid()).a()));
            }
            q qVar = (q) new q().o(eventType).a(str3);
            qVar.Y = "comment_list";
            qVar.Z = "comment_list";
            q f2 = qVar.g(aweme);
            f2.q = str;
            f2.f();
            com.ss.android.ugc.aweme.feed.s.a(af.PROFILE);
            com.ss.android.ugc.d.a.c.a(new ag(36));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void a(com.ss.android.ugc.aweme.comment.f.k kVar, Comment comment) {
        if (comment != null && a() && !com.ss.android.ugc.aweme.story.d.a.j(this.f72764c) && !m.a(comment)) {
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme != null) {
                Context context = getContext();
                if (context != null && !TextUtils.isEmpty(aliasAweme.getAid())) {
                    SmartRouter.buildRoute(context, "aweme://aweme/detail/").withParam("id", aliasAweme.getAid()).withParam("refer", UGCMonitor.EVENT_COMMENT).withParam("last_group_id", this.f72763b.getAid()).open();
                    String enterFrom = this.f72763b.getEnterFrom();
                    String aid = this.f72763b.getAid();
                    String cid = comment.getCid();
                    r.a("click_video_comment", com.ss.android.ugc.aweme.comment.m.b.a(enterFrom, aid).a("comment_id", cid).a("to_group_id", aliasAweme.getAid()).f66730a);
                }
            } else if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(getActivity(), this.f72763b.getEventType(), "reply_comment", new ap().a("group_id", this.f72763b.getAid()).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(this.f72763b.getAid())).f142646a, new ac(this, kVar, comment));
            } else if (!ag()) {
                b(comment, "click_text");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025b, code lost:
        if (r17 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cb, code lost:
        if (r10 != 7) goto L_0x016a;
     */
    @Override // com.ss.android.ugc.aweme.comment.g.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final com.ss.android.ugc.aweme.comment.f.k r19, final com.ss.android.ugc.aweme.comment.model.Comment r20, final com.ss.android.ugc.aweme.comment.f.g r21) {
        /*
        // Method dump skipped, instructions count: 910
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.k.a(com.ss.android.ugc.aweme.comment.f.k, com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.f.g):void");
    }

    public final void a(int i2, int i3) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        if (i3 != 0) {
            new com.bytedance.tux.g.b(activity).a(activity.getString(i2)).b(i3).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
        } else {
            new com.bytedance.tux.g.b(activity).a(activity.getString(i2)).a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).b();
        }
    }

    public final void a(final com.ss.android.ugc.aweme.comment.f.g gVar, boolean z2) {
        gVar.a(true);
        final LiveData<com.ss.android.ugc.aweme.comment.c.h> b2 = gVar.b(z2);
        if (b2 != null) {
            b2.observe(this, new u<com.ss.android.ugc.aweme.comment.c.h>() {
                /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(44834);
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ z a(com.ss.android.ugc.aweme.comment.f.g gVar) {
                    k.this.a(gVar, true);
                    k.a("comment_restr_pin_opt_pin_anyway_click", gVar.a());
                    return z.f158842a;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.comment.c.h hVar) {
                    com.ss.android.ugc.aweme.comment.c.h hVar2 = hVar;
                    if (hVar2.f71758a == com.ss.android.ugc.aweme.comment.c.k.SUCCESS) {
                        Comment comment = k.this.y.f72627d;
                        if (comment != null) {
                            comment.setAuthorPin(false);
                            k.this.y.b(comment);
                        }
                        Comment a2 = gVar.a();
                        a2.setAuthorPin(true);
                        k.this.y.f72627d = a2;
                        gVar.c();
                        new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.alk).b();
                    } else if (hVar2.f71758a == com.ss.android.ugc.aweme.comment.c.k.FAIL) {
                        new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ald).b();
                    } else if (hVar2.f71758a == com.ss.android.ugc.aweme.comment.c.k.LIMIT && hVar2.f71759b != null) {
                        int i2 = hVar2.f71759b.f71760a;
                        if (i2 == 1) {
                            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(k.this.getActivity());
                            bVar.a(R.string.c7, new bg(this, gVar));
                            new com.bytedance.tux.dialog.b(k.this.getActivity()).d(hVar2.f71759b.f71762c).a(bVar).a().b().show();
                            k.a("comment_restr_pin_popup_show", gVar.a());
                        } else if (i2 == 2) {
                            new com.bytedance.tux.g.b(k.this.getActivity()).a(hVar2.f71759b.f71762c).b();
                            k.a("comment_restr_pin_toast_show", gVar.a());
                        } else if (i2 == 3) {
                            com.bytedance.tux.dialog.b.b bVar2 = new com.bytedance.tux.dialog.b.b(k.this.getActivity());
                            bVar2.a(hVar2.f71759b.f71764e, new bh(this, gVar));
                            bVar2.b(hVar2.f71759b.f71763d, new bi(this, gVar));
                            new com.bytedance.tux.dialog.b(k.this.getActivity()).d(hVar2.f71759b.f71762c).a(bVar2).a().b().show();
                            k.a("comment_restr_pin_opt_popup_show", gVar.a());
                        }
                    }
                    gVar.d();
                    b2.removeObserver(this);
                }
            });
            com.ss.android.ugc.aweme.comment.m.c.a(true, gVar.a(), this.f72763b.getEventType(), this.f72763b.getAuthorUid(), this.f72763b.getAid());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(com.ss.android.ugc.aweme.comment.f.g gVar) {
        a(gVar, false);
        com.ss.android.ugc.aweme.comment.m.c.a(this.f72763b.getEventType(), "replace", this.f72763b.getAuthorUid(), this.f72763b.getAid());
        return null;
    }

    public final void a(Comment comment, String str) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = this.v;
        if (aVar != null) {
            String str2 = "comment_press";
            if (!TextUtils.equals(str2, str)) {
                str2 = "comment_click";
            }
            aVar.a(comment, "reply_via_video", str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void a(String str, String str2) {
        SmartRouter.buildRoute(getActivity(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", "like_banner").withParam("sec_uid", str2).open();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    @Override // com.ss.android.ugc.aweme.comment.g.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct r18, com.ss.android.ugc.aweme.comment.f.h r19) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.k.a(com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct, com.ss.android.ugc.aweme.comment.f.h):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void d(Comment comment) {
        int i2;
        m.a aVar;
        String text = comment.getText();
        Comment comment2 = null;
        m.a aVar2 = m.f72082a.get(comment.getFakeId());
        if (aVar2 != null) {
            comment2 = aVar2.f72089f;
        }
        m.a aVar3 = m.f72082a.get(comment.getFakeId());
        if (aVar3 != null) {
            i2 = aVar3.f72088e;
        } else {
            i2 = -1;
        }
        a(comment2, i2, com.ss.android.ugc.aweme.emoji.i.b.b.a(text), text, true, "");
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            Map<String, m.a> map = m.f72082a;
            String fakeId = comment.getFakeId();
            l.b(fakeId, "");
            m.a aVar4 = m.f72082a.get(comment.getFakeId());
            if (aVar4 == null || (aVar = m.a.a(aVar4, 3, null, 0, null, 0, null, 62)) == null) {
                aVar = new m.a(3, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
            com.ss.android.ugc.aweme.comment.i.a i3 = m.i(comment);
            if (i3 != null) {
                bVar.f71471e.a(i3);
            } else {
                m.c(comment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Comment comment, String str, String str2, int i2, int i3) {
        boolean z2;
        if (this.f72763b.getSource() == 0) {
            String aid = this.f72763b.getAid();
            String enterFrom = this.f72763b.getEnterFrom();
            String cid = comment.getCid();
            String authorUid = this.f72764c.getAuthorUid();
            String str3 = "";
            String uid = comment.getUser() != null ? comment.getUser().getUid() : str3;
            if (comment.getAliasAweme() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            r.onEvent(MobClick.obtain().setEventName("delete_comment").setLabelName("video_page").setValue(aid));
            com.ss.android.ugc.aweme.app.f.d a2 = com.ss.android.ugc.aweme.comment.m.b.a(enterFrom, aid).a("comment_id", cid);
            if (i3 != -1) {
                a2 = a2.a("secondary_position", i3);
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("author_id", authorUid);
            if (!TextUtils.isEmpty(uid)) {
                str3 = uid;
            }
            r.a("delete_comment", a3.a("comment_user_id", str3).a("parent_position", i2).a("parent_comment_id", str).a("comment_category", str2).a("is_video", z2 ? "1" : "0").f66730a);
        }
        if (this.ah != null && !TextUtils.isEmpty(comment.getCid())) {
            ((com.ss.android.ugc.aweme.comment.j.c) this.ah.f76396h).f72023c = this.f72763b.getAid();
            ((com.ss.android.ugc.aweme.comment.j.c) this.ah.f76396h).f72024d = new com.ss.android.ugc.aweme.comment.i.g(ai(), com.ss.android.ugc.aweme.story.d.a.d(this.f72764c), comment);
            this.ah.a(comment.getCid(), Integer.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.f72763b.getEventType())));
            this.P = comment;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(s<ag> sVar) {
        this.B = sVar;
    }

    /* access modifiers changed from: package-private */
    public final void b(Aweme aweme) {
        this.f72764c = aweme;
        ar();
        a(getView());
        if (aweme != null) {
            if (aweme.getUserDigg() == 1) {
                this.az.add(aweme.getAid());
            }
            if (aweme.getStatistics() != null) {
                this.aG = aweme.getStatistics().getCommentCount();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str) {
        this.as = System.currentTimeMillis();
        this.aC = str;
        String enterFrom = this.f72763b.getEnterFrom();
        Aweme aweme = this.f72764c;
        String a2 = com.ss.android.ugc.aweme.comment.m.b.a(this.f72765d);
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(enterFrom, aweme)).a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(aweme, "list")).a("comment_category", a2);
        if (!str.isEmpty()) {
            dVar.a("enter_method", str);
        }
        if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
            dVar.a("country_name", aweme.getAuthor().getRegion());
        }
        r.a("enter_text", dVar.f66730a);
        Comment comment = this.f72765d;
        if (comment != null) {
            this.y.a(true, comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(int i2, int i3, String str, String str2, boolean z2) {
        a(this.f72765d, i2, i3, str, false, str2);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Comment comment, boolean z2) {
        if (comment != null && comment.isStoryEmojiComment()) {
            String aid = this.f72763b.getAid();
            String awemeId = comment.getAwemeId();
            comment.getFakeId();
            comment.getText();
            if (!TextUtils.equals(aid, awemeId)) {
                return;
            }
        }
        int[] au2 = au();
        if (this.aj == null) {
            ah();
        }
        this.y.a(comment, au2[0], au2[1], ai());
        a(1);
        Object[] objArr = new Object[2];
        objArr[0] = this.f72763b.getAid();
        objArr[1] = comment == null ? null : comment.clone();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(3, objArr));
        if (at()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.a(2, comment));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Comment comment) {
        bt btVar;
        if (comment != null && comment.isStoryEmojiComment()) {
            String aid = this.f72763b.getAid();
            String awemeId = comment.getAwemeId();
            comment.getFakeId();
            comment.getText();
            if (!TextUtils.equals(aid, awemeId)) {
                return;
            }
        }
        if (ab_() && comment != null && (btVar = this.y) != null) {
            btVar.a(comment, ai());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r12.getErrorCode() != 3057) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.comment.services.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Exception r12, int r13, com.ss.android.ugc.aweme.comment.model.Comment r14) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.k.b(java.lang.Exception, int, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void a(String str, int i2) {
        com.ss.android.ugc.aweme.comment.m.b.a(str, i2, this.f72763b.getEnterFrom(), this.f72763b.getAid(), this.f72763b.getAuthorUid());
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void b(String str) {
        com.ss.android.ugc.aweme.comment.m.b.a(str, this.f72763b.getEnterFrom(), this.f72763b.getAid(), this.f72763b.getAuthorUid());
    }

    @Override // com.ss.android.ugc.aweme.comment.f.i
    public final void a(String str, List<Comment> list) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar;
        int c2;
        bt btVar = this.y;
        String str2 = "";
        if (!TextUtils.isEmpty(str) && !com.bytedance.common.utility.collection.b.a((Collection) list) && (aVar = (com.ss.android.ugc.aweme.comment.adapter.a) btVar.a()) != null && (c2 = aVar.c(str, 11)) >= 0 && btVar.f72626c != null) {
            Comment comment = (Comment) aVar.e().get(c2);
            if (comment instanceof CommentReplyButtonStruct) {
                str2 = ((CommentReplyButtonStruct) comment).getCommentId();
            }
            List<Comment> a2 = bt.a(aVar);
            v vVar = btVar.f72626c;
            if (list != null && !com.bytedance.common.utility.collection.b.a((Collection) vVar.f72884b)) {
                Comment comment2 = vVar.f72884b.get(c2);
                if (comment2 instanceof CommentReplyButtonStruct) {
                    vVar.f72884b.addAll(c2, list);
                    p.a(((CommentReplyButtonStruct) comment2).getCommentId(), list.size());
                    try {
                        CommentReplyListItem commentReplyListItem = vVar.f72883a.get(Integer.valueOf(comment2.getCid()).intValue());
                        if (!commentReplyListItem.mReplyComments.containsAll(list)) {
                            commentReplyListItem.mReplyComments.addAll(list);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            bv.a(aVar, a2, aVar.e());
        }
        if (!TextUtils.isEmpty(str2)) {
            p.a(str2, false);
            String enterFrom = this.f72763b.getEnterFrom();
            String aid = this.f72763b.getAid();
            int i2 = p.a(str2).f72072h;
            com.ss.android.ugc.aweme.app.f.d a3 = com.ss.android.ugc.aweme.comment.m.b.a(enterFrom, aid);
            a3.a("parent_comment_id", str2);
            a3.a("click_cnt", i2);
            r.a("show_more_reply", a3.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.i
    public final void b(String str, List<Comment> list) {
        int c2;
        bt btVar = this.y;
        String str2 = "";
        if (!TextUtils.isEmpty(str) && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
            com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) btVar.a();
            if (aVar == null) {
                c2 = -1;
            } else {
                c2 = aVar.c(str, 11);
            }
            if (c2 - list.size() >= 0) {
                Comment comment = (Comment) aVar.e().get(c2);
                if (comment instanceof CommentReplyButtonStruct) {
                    str2 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                List<Comment> a2 = bt.a(aVar);
                v vVar = btVar.f72626c;
                if (vVar.f72884b != null) {
                    vVar.f72884b.removeAll(list);
                }
                bv.a(aVar, a2, aVar.e());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            p.a(str2, true);
            com.ss.android.ugc.aweme.app.f.d a3 = com.ss.android.ugc.aweme.comment.m.b.a(this.f72763b.getEnterFrom(), this.f72763b.getAid());
            a3.a("parent_comment_id", str2);
            r.a("hide_all_reply", a3.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(boolean z2) {
        View view;
        this.aJ = z2;
        ImageView imageView = this.f72769l;
        if (imageView != null) {
            if (z2) {
                imageView.setEnabled(true);
                this.f72769l.setImageResource(2131231190);
            } else {
                imageView.setEnabled(false);
                this.f72769l.setImageResource(2131231192);
            }
        }
        if (this.f72770m != null && (view = this.r) != null) {
            if (!z2 || view.getVisibility() != 0) {
                this.o.setVisibility(8);
                e eVar = this.K;
                if (eVar != null) {
                    eVar.b(false);
                    return;
                }
                return;
            }
            this.o.setVisibility(0);
            e eVar2 = this.K;
            if (eVar2 != null) {
                eVar2.b(true);
            }
        }
    }

    public final void b(Map<String, Comment> map) {
        v vVar = this.A;
        if (!(vVar == null || com.bytedance.common.utility.collection.b.a((Collection) vVar.f72883a))) {
            List<CommentReplyListItem> list = this.A.f72883a;
            HashSet hashSet = new HashSet();
            for (CommentReplyListItem commentReplyListItem : list) {
                Comment comment = commentReplyListItem.mComment;
                if (comment != null) {
                    hashSet.add(comment.getCid());
                    if (!com.bytedance.common.utility.collection.b.a((Collection) commentReplyListItem.mReplyComments)) {
                        for (Comment comment2 : commentReplyListItem.mReplyComments) {
                            hashSet.add(comment2.getCid());
                        }
                    }
                }
            }
            a(hashSet, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.util.k.a
    public final void a(long j2, boolean z2, int i2) {
        Aweme aweme = this.f72764c;
        if (aweme != null) {
            com.ss.android.ugc.aweme.comment.m.c.a(aweme.getAid(), this.f72764c.getAuthorUid(), this.f72763b.getEnterFrom(), z2 ? i2 == 0 ? "null" : "success" : "fail", j2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(boolean z2, Aweme aweme) {
        if (z2) {
            com.ss.android.ugc.aweme.comment.b bVar = this.z;
            try {
                bz bzVar = (bz) bVar.f71468b.getChildFragmentManager().a("input");
                if (bzVar == null) {
                    return null;
                }
                String str = bVar.f71475i;
                if (bzVar.f72655h == null) {
                    return null;
                }
                if (bzVar.f72655h.getVisibility() != 0) {
                    return null;
                }
                if (bzVar.ac.h() || bzVar.getActivity() == null) {
                    return null;
                }
                String[] strArr = {"time_out"};
                bzVar.ab = new com.bytedance.ies.dmt.ui.tooltip.b(bzVar.getActivity()).a(bzVar.f72655h).b(48).a(3000L).a(bzVar.getResources().getString(R.string.hc1)).a(true).a(new View.OnClickListener(strArr) {
                    /* class com.ss.android.ugc.aweme.comment.ui.bz.AnonymousClass6 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ String[] f72669a;

                    static {
                        Covode.recordClassIndex(44764);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f72669a[0] = "click";
                        bz.this.ab.dismiss();
                    }

                    {
                        this.f72669a = r2;
                    }
                }).a();
                bzVar.ab.a();
                bzVar.ac.i();
                bz.a(bzVar.S, "", str, "show_gift_tooltip");
                bzVar.ab.a(new ch(bzVar, strArr, str));
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            TuxIconView tuxIconView = this.f72768k;
            if (tuxIconView == null || tuxIconView.getVisibility() != 0 || this.M.h() || getActivity() == null) {
                return null;
            }
            final String[] strArr2 = {"time_out"};
            com.bytedance.ies.dmt.ui.tooltip.a a2 = new com.bytedance.ies.dmt.ui.tooltip.b(getActivity()).a(this.f72768k).a(3000L).b(48).a(getResources().getString(R.string.hc1)).a(true).a(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(44838);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    strArr2[0] = "click";
                    k.this.s.dismiss();
                }
            }).a();
            this.s = a2;
            a2.a();
            this.M.i();
            a(aweme, "", "show_gift_tooltip");
            this.s.a(new ao(this, aweme, strArr2));
            return null;
        }
    }

    private void a(boolean z2, Comment comment, int i2) {
        if (this.f72764c != null && comment != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f72763b.getEnterFrom()).a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(this.f72764c)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(this.f72764c)).a("is_success", z2 ? 1 : 0).a("gift_id", comment.getGift() == null ? comment.getFakeGiftId() : comment.getGift().getId()).a("is_follow", com.ss.android.ugc.aweme.comment.util.s.b(this.f72764c)).a("is_like", com.ss.android.ugc.aweme.comment.util.s.a(this.f72764c)).a("is_comment", !com.google.c.a.p.a(comment.getText()) ? 1 : 0);
            if (i2 != 0) {
                a2.a("error_code", i2);
                a2.a("newtork_condition", b(getContext()));
            }
            if (!this.N.isEmpty()) {
                a2.a("enter_method", this.N);
            } else if (!this.z.o.isEmpty()) {
                a2.a("enter_method", this.z.o);
            } else {
                a2.a("enter_method", "send_button");
            }
            this.N = "";
            r.a("send_gift", a2.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Exception exc, int i2, Comment comment) {
        b(exc, i2, comment);
    }

    public final void b(Comment comment, String str) {
        if (!com.ss.android.ugc.aweme.story.d.a.j(this.f72764c) && isAdded()) {
            Comment comment2 = this.f72765d;
            if (comment2 == null || !comment2.equals(comment)) {
                this.f72765d = comment;
                com.ss.android.ugc.aweme.comment.b bVar = this.z;
                if (bVar != null) {
                    bVar.a(comment.getUser(), str);
                }
            } else {
                this.f72765d = comment;
                this.f72767j.performClick();
            }
            if (z()) {
                this.C.a(true, 1);
                com.ss.android.ugc.aweme.comment.i.h hVar = this.f72763b;
                if (hVar != null) {
                    com.ss.android.ugc.aweme.comment.m.c.a("keyboard", this.f72763b.getEnterFrom(), this.f72763b.getAid(), this.f72763b.getAuthorUid(), !TextUtils.equals(hVar.getAuthorUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()) ? 1 : 0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Aweme aweme, String str, String str2) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f72763b.getEnterFrom()).a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(aweme)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(aweme));
        if (str2.equals("show_gift_tooltip")) {
            r.a("show_gift_tooltip", a2.f66730a);
            return;
        }
        a2.a("enter_method", str);
        r.a("dismiss_gift_tooltip", a2.f66730a);
    }

    private void ax() {
        aw();
        av();
    }

    public final void A() {
        e eVar = this.K;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void B() {
        e eVar = this.K;
        if (eVar != null) {
            eVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object C() {
        ak();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
        this.y.bh_();
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void k() {
        c("click_gift_comment");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final String o() {
        return this.f72763b.getEventType();
    }

    private void P() {
        this.v.f71324g = new l(this);
    }

    private void Q() {
        com.ss.android.ugc.aweme.comment.n.a.a().a(getActivity());
    }

    private static boolean af() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z D() {
        com.ss.android.ugc.aweme.comment.m.c.b(this.f72763b.getEnterFrom(), "cancel");
        return z.f158842a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        com.bytedance.a.b.a(UGCMonitor.EVENT_COMMENT, "info");
        this.y.aO_();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        if (a()) {
            i(false);
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final int p() {
        if (this.an) {
            return 4;
        }
        if (this.f72765d != null) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        this.O = 0;
        X();
        aa();
    }

    private boolean K() {
        Aweme aweme;
        if (!com.ss.android.ugc.aweme.experiment.f.a() || (aweme = this.f72764c) == null || com.ss.android.ugc.aweme.story.d.a.d(aweme) || !in.a(this.f72764c.getAuthorUid())) {
            return false;
        }
        return true;
    }

    private boolean M() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!N() || (commentBatchManagementViewModel = this.I) == null || !commentBatchManagementViewModel.a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean N() {
        if (!in.a(this.f72763b.getAuthorUid()) || !com.ss.android.ugc.aweme.comment.a.c.a()) {
            return false;
        }
        return true;
    }

    private long S() {
        Aweme aweme = this.f72764c;
        if (aweme == null || aweme.getStatistics() == null) {
            return 0;
        }
        return this.f72764c.getStatistics().getDiggCount();
    }

    private String V() {
        bt btVar = this.y;
        if (!(btVar == null || btVar.f72627d == null)) {
            Comment comment = this.y.f72627d;
            if (comment.getUser() != null) {
                return comment.getUser().getUid();
            }
        }
        return "";
    }

    private void Y() {
        if (at() && this.v != null) {
            ArrayList arrayList = new ArrayList();
            e(arrayList);
            this.y.a(arrayList);
        }
    }

    private boolean ad() {
        com.ss.android.ugc.aweme.commercialize.model.s adCommentStruct;
        Aweme aweme = this.f72764c;
        if (aweme == null) {
            adCommentStruct = null;
        } else {
            adCommentStruct = aweme.getAdCommentStruct();
        }
        if (!am() || adCommentStruct == null || !adCommentStruct.showAsDefault()) {
            return false;
        }
        return true;
    }

    private int ae() {
        Comment comment;
        com.ss.android.ugc.aweme.comment.j.h hVar = this.ai;
        if (hVar == null || hVar.f76396h == null || (comment = ((com.ss.android.ugc.aweme.comment.j.f) this.ai.f76396h).f72030e) == null) {
            return -1;
        }
        return com.ss.android.ugc.aweme.story.b.h.a(comment.getUser());
    }

    private boolean ai() {
        if (!com.ss.android.ugc.aweme.story.d.a.d(this.f72764c) || com.ss.android.ugc.aweme.story.d.a.j(this.f72764c) || !com.ss.android.ugc.aweme.story.c.b.k()) {
            return false;
        }
        return true;
    }

    private boolean am() {
        Aweme aweme = this.f72764c;
        if (aweme == null || !aweme.isAd() || !ao() || this.f72763b.isCommentClose()) {
            return false;
        }
        return true;
    }

    private boolean ao() {
        if (!this.f72763b.isEnableComment() || com.ss.android.ugc.aweme.commercialize.e.a.b.U(this.f72764c)) {
            return false;
        }
        return true;
    }

    private boolean ap() {
        Aweme aweme = this.f72764c;
        if (aweme == null || !aweme.getAwemeControl().canComment() || this.f72763b.isCommentClose() || !ao()) {
            return false;
        }
        return true;
    }

    private void aq() {
        this.f72765d = null;
        this.an = false;
        this.f72767j.setText("");
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.l();
        }
    }

    private void ar() {
        AwemeRawAd awemeRawAd;
        this.am = false;
        Aweme aweme = this.f72764c;
        if (aweme != null && aweme.isAd() && (awemeRawAd = this.f72764c.getAwemeRawAd()) != null) {
            this.am = awemeRawAd.isCommentAreaSwitch();
        }
    }

    private int[] au() {
        int i2;
        int i3 = -1;
        if (a()) {
            i3 = this.u.k();
            i2 = this.u.m();
        } else {
            i2 = -1;
        }
        return new int[]{i3, i2};
    }

    private String ay() {
        int i2;
        if (K()) {
            i2 = R.string.boc;
        } else {
            i2 = R.string.al0;
        }
        return getString(i2);
    }

    public static boolean w() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean af2 = af();
        com.ss.android.ugc.aweme.lancet.j.f107229h = af2;
        return af2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z E() {
        com.ss.android.ugc.aweme.comment.m.c.a(this.f72763b.getEventType(), "cancel", this.f72763b.getAuthorUid(), this.f72763b.getAid());
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z I() {
        String enterFrom = this.f72763b.getEnterFrom();
        l.d(enterFrom, "");
        r.a("comment_batch_management_delete_cancel_ck", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", enterFrom).f66730a);
        return z.f158842a;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final boolean q() {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            return false;
        }
        s<ag> sVar = this.B;
        if (sVar == null) {
            return true;
        }
        sVar.a(new ag(20));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean t() {
        if (!in.a(this.f72763b.getAuthorUid()) || !com.ss.android.ugc.aweme.comment.a.c.b()) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        if (getActivity() == null) {
            return true;
        }
        if (w()) {
            return false;
        }
        a(R.string.de8, 0);
        return true;
    }

    public final long y() {
        if (com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            return this.f72764c.getStory().getTotalComments();
        }
        return this.O;
    }

    private String J() {
        if (K()) {
            return com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.bob).replace("%d", com.ss.android.ugc.aweme.i18n.b.a(this.aG));
        }
        return null;
    }

    private boolean R() {
        if (!TextUtils.equals(this.f72763b.getEventType(), "homepage_familiar") && !this.f72763b.isShowLikeUsers()) {
            return false;
        }
        Aweme aweme = this.f72764c;
        if ((aweme == null || !this.az.contains(aweme.getAid())) && S() <= 0 && com.bytedance.common.utility.collection.b.a((Collection) this.f72763b.getLikeUsers())) {
            return false;
        }
        return true;
    }

    private void W() {
        this.E.a("comment_aweme_and_params", new h.p(this.f72764c, this.f72763b));
        DataCenter dataCenter = this.E;
        Aweme aweme = this.f72764c;
        dataCenter.a("comment_aweme_and_link", new h.p(aweme, bh.a(aweme)));
    }

    private Long Z() {
        Aweme aweme = this.f72764c;
        if ((aweme == null && (aweme = AwemeService.b().d(this.f72763b.getAid())) == null) || aweme.getAwemeRawAd() == null || com.ss.android.ugc.aweme.commercialize.e.a.b.X(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    private void ac() {
        Aweme aweme = this.f72764c;
        if (aweme != null) {
            if (!aweme.isAd() || this.f72763b.getAdCommentStruct() == null) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.ae(this.f72764c)) {
                    P();
                }
                com.ss.android.ugc.aweme.commercialize.model.s a2 = com.ss.android.ugc.aweme.comment.util.g.a(this.f72764c);
                if (a2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a2);
                    this.v.b_(arrayList);
                }
            }
        }
    }

    private boolean ag() {
        if (in.d()) {
            new com.bytedance.tux.g.b(this).e(R.string.add).b();
            return true;
        } else if (this.G || M() || com.ss.android.ugc.aweme.story.d.a.j(this.f72764c)) {
            return true;
        } else {
            return false;
        }
    }

    private void ah() {
        p pVar = new p(this.f72763b.getAid(), this.f72763b.getEventType());
        this.aj = pVar;
        pVar.a(this.A);
        this.aj.f72062e = this.f72763b.getInsertCids();
        this.aj.f72058a = this;
    }

    private boolean aj() {
        com.ss.android.ugc.aweme.comment.j.k kVar = this.w;
        if (kVar == null || kVar.f76396h == null || this.w.f76396h.mData == null || this.w.f76396h.mData.replyStyle != 2) {
            return false;
        }
        return true;
    }

    private boolean at() {
        Aweme aweme;
        if (!this.f72763b.isMyProfile() || (aweme = this.f72764c) == null || com.ss.android.ugc.aweme.story.d.a.g(aweme) || !in.a(this.f72764c.getAuthorUid())) {
            return false;
        }
        if ((this.f72763b.getPageType() == 1000 || this.f72763b.getPageType() == 1014) && com.ss.android.ugc.aweme.experiment.f.c()) {
            return true;
        }
        return false;
    }

    private void aw() {
        this.ah.cd_();
        this.ah.h();
        this.w.cd_();
        this.w.h();
        this.ai.cd_();
        this.ai.h();
        p pVar = this.aj;
        if (pVar != null) {
            pVar.cd_();
            this.aj.h();
            this.aj = null;
        }
        this.an = false;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void i() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.ae(this.f72764c)) {
            this.E.a("comment_dialog_state", (Object) 5);
        }
        if (getUserVisibleHint() || (!this.aJ && K())) {
            an();
        }
        if (com.ss.android.ugc.aweme.comment.d.b.a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    public final void l() {
        com.ss.android.ugc.aweme.comment.j.k kVar = this.w;
        if (kVar != null) {
            kVar.a(4, this.f72763b.getAid(), "", Z(), Integer.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.f72763b.getEventType())));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.E.a("comment_dialog_state", (Object) 8);
        com.bytedance.a.b.c(UGCMonitor.EVENT_COMMENT, "info");
        if (am()) {
            if (this.aB > 0) {
                this.aA += System.currentTimeMillis() - this.aB;
            }
            this.aB = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.c();
        }
        T();
        this.H = false;
        this.p.setEnabled(false);
        this.p.setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
        this.p.setText(R.string.ak0);
        this.q.setEnabled(false);
        this.q.setTextColor(androidx.core.content.b.c(getContext(), R.color.bz));
    }

    private void L() {
        boolean z2;
        U();
        if (this.K != null && this.I != null) {
            if (N() || (!in.a(this.f72763b.getAuthorUid()) && this.I.a().getValue().booleanValue())) {
                if (!t() || this.f72763b.isCommentClose()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                o.b(z2, this.n);
                o.b(!this.f72763b.isCommentClose(), this.f72766e);
                this.K.b(false);
                o.b(false, this.o, this.r);
                this.I.a().postValue(false);
                s();
            }
        }
    }

    private void O() {
        Aweme aweme;
        AwemeStatistics statistics;
        long j2 = 0;
        if (ao() && !this.f72763b.isCommentClose() && (aweme = this.f72764c) != null && (statistics = aweme.getStatistics()) != null) {
            long commentCount = statistics.getCommentCount();
            if (commentCount <= 0 || ad()) {
                j2 = commentCount;
            } else {
                if (this.f72763b.getAdCommentStruct() != null) {
                    j2 = 1;
                }
                j2 += commentCount;
            }
        }
        g(j2);
        if (!this.f72763b.isForceHideKeyboard() && !this.G) {
            f(j2);
        }
    }

    private void T() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.ru);
        TextView textView = (TextView) getView().findViewById(R.id.ry);
        int visibility = this.n.getVisibility();
        int visibility2 = this.o.getVisibility();
        if (com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            visibility = 8;
            visibility2 = 8;
        }
        if (!K() || this.f72769l == null) {
            this.n = imageView;
            ImageView imageView2 = this.f72769l;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.o = textView;
            TextView textView2 = this.f72770m;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(8);
            this.n = this.f72769l;
            this.o = this.f72770m;
        }
        this.n.setVisibility(visibility);
        this.o.setVisibility(visibility2);
        this.n.setOnClickListener(new at(this));
        this.o.setOnClickListener(new az(this));
    }

    private void U() {
        if (this.I == null && ab_() && N() && !com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            this.I = CommentBatchManagementViewModel.a.a(getActivity());
            T();
            this.p.setOnClickListener(new ba(this));
            this.q.setOnClickListener(new bb(this));
            this.ax = new bc(this);
            this.I.b().observe(this, this.ax);
        }
    }

    private void X() {
        if (!ao() || this.f72763b.isCommentClose()) {
            Y();
            return;
        }
        com.ss.android.ugc.aweme.comment.util.k.a();
        this.w.a(1, this.f72763b.getAid(), this.f72763b.getInsertCids(), Z(), Integer.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.f72763b.getEventType())));
    }

    private void ab() {
        com.ss.android.ugc.aweme.comment.j.k kVar;
        if (this.aI != null && (kVar = this.w) != null && kVar.f76396h != null && this.w.f76396h.mData != null) {
            final CommentTranslatorInfoApi.a aVar = this.aI.f72455a;
            final CaptionItemModel b2 = t.b(this.f72764c);
            if (aVar != null && b2 != null && ah.a(this.f72764c)) {
                this.L = aVar.f72451c;
                bs bsVar = new bs(com.a.a(LayoutInflater.from(requireContext()), R.layout.jw, (ViewGroup) getView(), false));
                this.t = bsVar;
                bsVar.a(new bs.b(aVar.f72452d, aVar.f72450b, aVar.f72449a, aVar.f72451c, new bs.a() {
                    /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(44830);
                    }

                    private static boolean c() {
                        try {
                            return f.a.f68431a.c();
                        } catch (Exception unused) {
                            return false;
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.comment.ui.bs.a
                    public final void a() {
                        t.a(k.this.getContext(), aVar.f72450b, k.this.f72763b.getEnterFrom(), "comments", false, k.this.f72764c);
                    }

                    @Override // com.ss.android.ugc.aweme.comment.ui.bs.a
                    public final void b() {
                        k.this.getActivity();
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                            com.ss.android.ugc.aweme.lancet.j.f107229h = c();
                        }
                        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                            new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.de8).b();
                            return;
                        }
                        final boolean z = k.this.L;
                        k.this.t.a(!z);
                        CommentTranslatorInfoApi.b.a().updateTranslationLikeInfo(k.this.f72764c.getAid(), b2.getClaSubtitleId(), b2.getTranslatorId(), Boolean.valueOf(z)).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<BaseResponse>() {
                            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass10.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(44831);
                            }

                            @Override // f.a.ae
                            public final void onSubscribe(f.a.b.b bVar) {
                            }

                            @Override // f.a.ae
                            public final void onError(Throwable th) {
                                k.this.t.a(z);
                                new com.bytedance.tux.g.b(k.this.getActivity()).e(R.string.ge).b();
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // f.a.ae
                            public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
                                String str;
                                String str2;
                                if (!z) {
                                    k kVar = k.this;
                                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("enter_method", "profile").a("translator_id", aVar.f72450b);
                                    if (t.b(kVar.f72764c) != null) {
                                        str = t.b(kVar.f72764c).getLanguageName();
                                    } else {
                                        str = "";
                                    }
                                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("translator_lang", str).a("is_blacklisted", com.ss.android.ugc.aweme.experiment.p.a().isOptOut() ? 1 : 0);
                                    if (kVar.f72764c != null) {
                                        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(kVar.f72764c)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(kVar.f72764c));
                                        CaptionItemModel b2 = t.b(kVar.f72764c);
                                        String str3 = null;
                                        if (b2 != null) {
                                            str2 = b2.getLanguageName();
                                        } else {
                                            str2 = null;
                                        }
                                        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("transl_lang", str2);
                                        CaptionItemModel a6 = t.a(kVar.f72764c);
                                        if (a6 != null) {
                                            str3 = a6.getLanguageName();
                                        }
                                        a5.a("video_lang", str3);
                                    }
                                    r.a("like_transl", a3.f66730a);
                                }
                                k.this.t.a(!z);
                                k.this.L = !z;
                            }
                        });
                    }
                }));
                this.ae.b(this.t.f72610a);
                this.ae.a(this.t.f72610a);
            }
        }
    }

    private void av() {
        long j2;
        AwemeStatistics statistics;
        com.ss.android.ugc.aweme.comment.j.e eVar = new com.ss.android.ugc.aweme.comment.j.e();
        this.ah = eVar;
        eVar.a(new com.ss.android.ugc.aweme.comment.j.c());
        this.ah.a_(this);
        this.w = new com.ss.android.ugc.aweme.comment.j.k();
        com.ss.android.ugc.aweme.comment.j.i iVar = new com.ss.android.ugc.aweme.comment.j.i();
        iVar.f72038g = new de() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(44835);
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.de
            public final void b(Comment comment) {
                k.this.a((com.ss.android.ugc.aweme.comment.f.k) null, comment);
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.de
            public final void a(Comment comment) {
                if (comment.getUserDigged() == 0) {
                    k.this.c(comment);
                }
            }
        };
        iVar.f72039h = this.f72763b.isNeedAutoLikeComment();
        iVar.f72040i = this.f72763b.isNeedShowReplyPanel();
        Aweme aweme = this.f72764c;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j2 = 0;
        } else {
            j2 = statistics.getCommentCount();
        }
        iVar.f72037f = j2;
        this.w.a((com.ss.android.ugc.aweme.common.b) iVar);
        this.A.a(this.f72763b.getInsertCids());
        ((com.ss.android.ugc.aweme.comment.j.i) this.w.f76396h).f72036e = this.A;
        this.w.a_(this);
        com.ss.android.ugc.aweme.comment.j.h hVar = new com.ss.android.ugc.aweme.comment.j.h();
        this.ai = hVar;
        hVar.a_(this);
        this.ai.a(new com.ss.android.ugc.aweme.comment.j.f());
    }

    private SpannableStringBuilder az() {
        String string = getString(R.string.ajq);
        String string2 = getString(R.string.ajr);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + "\n" + string2);
        int length = string.length() + 1;
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass4 */

            static {
                Covode.recordClassIndex(44837);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                if (k.this.f72764c != null) {
                    r.a("filtered_comment_review_byvideo_ck", new com.ss.android.ugc.aweme.app.f.d().a("comments_number", k.this.O).f66730a);
                    SmartRouter.buildRoute(k.this.getActivity(), "//webview").withParam("url", "https://www.tiktok.com/inapp/filtered_comments/comments?aweme_id=" + k.this.f72764c.getAid() + "&enable_report_optimization=1").withParam("hide_nav_bar", true).open();
                }
            }
        }, length, length2, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.bx)), length, length2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 18);
        return spannableStringBuilder;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void h() {
        if (getUserVisibleHint()) {
            al();
        }
        if (com.ss.android.ugc.aweme.comment.d.b.a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.f71468b = null;
            bVar.f71471e.h();
            bVar.f71471e.cd_();
            bVar.f71472f = null;
        }
        aw();
        com.ss.android.ugc.aweme.arch.widgets.base.e eVar = this.at;
        if (eVar != null) {
            eVar.b(this.au);
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.b().removeObserver(this.ax);
            this.I.f72897d.clear();
        }
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            com.a.b.c.a("aweme_comment_fragment_input_comment");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.ao) {
            this.ao = false;
        } else if (a()) {
            i(true);
        }
        this.E.a("comment_dialog_state", (Object) 7);
        if (am()) {
            this.aB = System.currentTimeMillis();
        }
        this.z.a();
        com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(com.ss.android.ugc.aweme.account.b.g().getCurUser().getAvatarThumb()));
        a2.E = this.T;
        a2.c();
        this.T.setVisibility(0);
    }

    public final boolean z() {
        boolean z2;
        Comment comment;
        Aweme aweme = this.f72764c;
        if (aweme == null) {
            return false;
        }
        boolean a2 = com.ss.android.ugc.aweme.comment.util.n.a(aweme, this.f72765d);
        if (!com.ss.android.ugc.aweme.comment.a.g.a() || !in.a(this.f72764c.getAuthorUid())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((a2 || z2) && !com.ss.android.ugc.aweme.compliance.api.a.c().a(3) && aj() && (comment = this.f72765d) != null && comment.getCommentStructType() != 1 && !com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            return true;
        }
        return false;
    }

    private void aa() {
        this.ac.setVisibility(8);
        this.ad.setVisibility(8);
        this.f72767j.setVisibility(8);
        this.Y.setVisibility(8);
        this.f72766e.setVisibility(8);
        if (at()) {
            if (!ao()) {
                this.ac.setVisibility(0);
            } else if (this.f72763b.isCommentClose()) {
                this.ad.setVisibility(0);
            } else {
                this.f72767j.setVisibility(0);
                this.Y.setVisibility(0);
                if (!M()) {
                    this.f72766e.setVisibility(0);
                }
            }
            this.Z.setVisibility(0);
        } else if (!ao()) {
            this.ac.setVisibility(0);
            this.Z.setVisibility(8);
        } else if (this.f72763b.isCommentClose()) {
            this.ad.setVisibility(0);
            this.Z.setVisibility(8);
        } else {
            this.f72767j.setVisibility(0);
            this.Y.setVisibility(0);
            if (!M()) {
                this.f72766e.setVisibility(0);
            }
            this.Z.setVisibility(0);
        }
        if (this.G) {
            this.C.a();
            this.R.setVisibility(0);
            this.f72766e.setVisibility(0);
        }
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.a();
        }
        if (com.ss.android.ugc.aweme.story.d.a.j(this.f72764c)) {
            this.f72766e.setVisibility(8);
        }
    }

    private void al() {
        Activity j2;
        if (!this.ap) {
            if (getActivity() != null) {
                j2 = getActivity();
            } else {
                j2 = com.bytedance.ies.ugc.appcontext.f.j();
            }
            if (j2 != null) {
                a(j2);
                if (a((Context) j2) != null) {
                    ((CommentViewModelImpl) androidx.lifecycle.ae.a(a((Context) j2), (ad.b) null).a(CommentViewModelImpl.class)).f71253a.a();
                }
                a.C1605a.f71195c = "1";
                this.ap = true;
            } else {
                return;
            }
        }
        if (this.f72768k != null) {
            if (this.M.a(this.f72764c)) {
                this.f72768k.setVisibility(0);
            } else {
                this.f72768k.setVisibility(8);
            }
        }
        i(true);
        if (com.ss.android.ugc.aweme.comment.d.b.a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, false);
        }
        MentionEditText mentionEditText = this.f72767j;
        if (mentionEditText != null && TextUtils.isEmpty(mentionEditText.getText())) {
            this.C.a(false, false, false);
        }
        if (am()) {
            this.aA = 0;
            this.aB = System.currentTimeMillis();
            com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "othershow", this.f72764c.getAwemeRawAd()).b();
            com.ss.android.ugc.aweme.comment.adapter.a aVar = this.v;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    private void an() {
        com.ss.android.ugc.aweme.commercialize.model.s adCommentStruct;
        this.ap = false;
        com.ss.android.ugc.aweme.commercialize.egg.e.a aVar = this.ag;
        if (aVar != null) {
            aVar.a();
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.ae(this.f72764c)) {
            this.E.a("comment_dialog_state", (Object) 5);
        }
        a.C1605a.f71195c = "0";
        if (!(!this.am || this.Z == null || (adCommentStruct = this.f72763b.getAdCommentStruct()) == null)) {
            List e2 = this.v.e();
            if ((!com.bytedance.common.utility.collection.b.a((Collection) e2) || ad()) && (com.bytedance.common.utility.collection.b.a((Collection) e2) || !(e2.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.s))) {
                e2.add(0, adCommentStruct);
            }
        }
        i(false);
        this.Z.postDelayed(new ak(this), 120);
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.g();
        }
        if (com.ss.android.ugc.aweme.comment.d.b.a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
        if (am()) {
            if (this.aB > 0) {
                this.aA += System.currentTimeMillis() - this.aB;
            }
            this.aB = 0;
            com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "close", this.f72764c.getAwemeRawAd()).b("duration", Long.valueOf(this.aA)).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 < 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (android.text.TextUtils.equals(r6, "bubble_desc_click_faker_cid") != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        new com.bytedance.tux.g.b(r9).e(com.zhiliaoapp.musically.R.string.fco).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void as() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.k.as():void");
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = this.v;
        if (aVar != null) {
            List<Comment> e2 = aVar.e();
            if (c(e2)) {
                g(1);
                b(new ArrayList<>());
                this.y.a(e2, false);
                com.ss.android.ugc.aweme.comment.b bVar = this.z;
                if (bVar != null) {
                    bVar.a(0);
                }
            } else if (ad()) {
                if (e2 == null) {
                    e2 = new ArrayList<>();
                }
                g(0);
                a(e2);
                this.y.a(e2, false);
                com.ss.android.ugc.aweme.comment.b bVar2 = this.z;
                if (bVar2 != null) {
                    bVar2.a(0);
                }
            } else {
                com.ss.android.ugc.aweme.comment.b bVar3 = this.z;
                if (bVar3 != null) {
                    bVar3.a(0);
                }
                List<Comment> arrayList = new ArrayList<>();
                d(arrayList);
                e(arrayList);
                if (this.w.f76396h.mData.hasFilteredComments()) {
                    TuxTextView a2 = com.ss.android.ugc.aweme.comment.util.m.a(getActivity());
                    a2.setText(az());
                    a2.setMovementMethod(LinkMovementMethod.getInstance());
                    DmtStatusView dmtStatusView = this.Y;
                    dmtStatusView.setBuilder(dmtStatusView.c().b(b(a2)));
                }
                this.y.a(arrayList);
                String insertCids = this.f72763b.getInsertCids();
                if (!TextUtils.isEmpty(insertCids) && !TextUtils.equals(insertCids, "bubble_desc_click_faker_cid")) {
                    new com.bytedance.tux.g.b(this).e(R.string.fco).b();
                }
            }
            com.ss.android.ugc.aweme.comment.util.k.a(0);
        }
    }

    public final void u() {
        if (this.f72766e.getHeight() != 0 && !this.aw) {
            this.r.getLayoutParams().height = this.f72766e.getHeight();
            this.aw = true;
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.a().postValue(true);
            if (t()) {
                o.b(false, this.n);
            }
            this.K.b(true);
            o.a(false, this.f72766e);
            o.a(true, this.o, this.r);
            s();
            if (!(this.v == null || this.A == null)) {
                for (String str : m.f72082a.keySet()) {
                    this.y.a(str);
                }
            }
            r.onEventV3("comment_batch_management_sw");
        }
    }

    private void ak() {
        String tempEnterMethod;
        String insertCids;
        int i2;
        String str;
        if (TextUtils.isEmpty(this.f72763b.getTempEnterMethod())) {
            tempEnterMethod = this.f72763b.getEnterMethod();
        } else {
            tempEnterMethod = this.f72763b.getTempEnterMethod();
        }
        String enterFrom = this.f72763b.getEnterFrom();
        Aweme aweme = this.f72764c;
        if (TextUtils.isEmpty(this.f72763b.getInsertCids())) {
            insertCids = null;
        } else {
            insertCids = this.f72763b.getInsertCids();
        }
        String playListType = this.f72763b.getPlayListType();
        String playListIdKey = this.f72763b.getPlayListIdKey();
        String playListId = this.f72763b.getPlayListId();
        String previousPage = this.f72763b.getPreviousPage();
        String fromGroupId = this.f72763b.getFromGroupId();
        this.f72763b.getTabName();
        com.ss.android.ugc.aweme.metrics.ac.b(this.f72764c, this.f72763b.getPageType());
        String creationId = this.f72763b.getCreationId();
        Map<String, String> hotPlayerMap = this.f72763b.getHotPlayerMap();
        String searchId = this.f72763b.getSearchId();
        String searchResultId = this.f72763b.getSearchResultId();
        String tagId = this.f72763b.getTagId();
        String parentTagId = this.f72763b.getParentTagId();
        y();
        if (aweme != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(enterFrom, aweme));
            dVar.a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(aweme, "list"));
            dVar.a("previous_page", previousPage);
            dVar.a("follow_status", com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor()));
            com.ss.android.ugc.aweme.story.b.h.a(dVar, aweme);
            if (aweme.getStatistics() != null) {
                dVar.a("outter_comment_cnt", String.valueOf(aweme.getStatistics().getCommentCount()));
            }
            if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
                dVar.a("country_name", aweme.getAuthor().getRegion());
            }
            if (!TextUtils.isEmpty(tempEnterMethod)) {
                dVar.a("enter_method", tempEnterMethod);
            }
            if (!TextUtils.isEmpty(insertCids)) {
                dVar.a("trigger_comment_id", insertCids);
            }
            if (!TextUtils.isEmpty(playListType)) {
                dVar.a("playlist_type", playListType);
            }
            if (!TextUtils.isEmpty(playListId)) {
                dVar.a(playListIdKey, playListId);
            }
            if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().a()) && (TextUtils.equals(enterFrom, "homepage_fresh") || TextUtils.equals(enterFrom, "homepage_channel"))) {
                com.ss.android.ugc.aweme.w.a.a();
            }
            dVar.a("request_id", com.ss.android.ugc.aweme.metrics.ac.b(aweme));
            String str2 = "1";
            if (com.ss.android.ugc.aweme.detail.i.f79764a) {
                dVar.a("is_fullscreen", str2);
            }
            if (TextUtils.equals("homepage_familiar", enterFrom)) {
                if (in.a(aweme)) {
                    str = "follow";
                } else {
                    str = "unfollow";
                }
                dVar.a("relation_type", str);
                dVar.a("video_type", com.ss.android.ugc.aweme.metrics.ac.k(aweme));
                dVar.a("rec_uid", com.ss.android.ugc.aweme.metrics.ac.l(aweme));
            }
            if (TextUtils.equals(enterFrom, "general_search")) {
                if (com.ss.android.ugc.aweme.discover.mob.h.f81916a) {
                    if (aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                        dVar.a("video_tag", "");
                    } else {
                        dVar.a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                    }
                }
                if (!com.ss.android.ugc.aweme.detail.i.f79764a) {
                    str2 = "0";
                }
                dVar.a("is_fullscreen", str2);
                dVar.a("rank", com.ss.android.ugc.aweme.metrics.ac.b(aweme, 9));
                dVar.a("enter_from", enterFrom);
                dVar.a("search_id", searchId);
                dVar.a("search_result_id", searchResultId);
            }
            dVar.a("position", com.ss.android.ugc.aweme.video.v.O().n());
            dVar.a("impr_type", com.ss.android.ugc.aweme.metrics.ac.j(aweme));
            if (!TextUtils.isEmpty(aweme.getMixId())) {
                dVar.a("compilation_id", aweme.getMixId());
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                dVar.a("playlist_id", playListId);
            }
            dVar.a(y.b(previousPage, fromGroupId));
            int i3 = 2;
            if (in.d()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            dVar.a("is_child_mode", i2);
            dVar.a(aweme, "click_comment_button", enterFrom);
            dVar.a("tag_id", tagId);
            dVar.a("parent_tag_id", parentTagId);
            dVar.a("is_highlighted", Boolean.valueOf(aweme.isHighlighted()));
            dVar.a("rank_index", aweme.getOriginalPos());
            eu.a(dVar, aweme.getAuthor());
            com.ss.android.ugc.aweme.upvote.event.c.a(dVar, aweme, enterFrom);
            if (TextUtils.isEmpty(aweme.partN)) {
                if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            }
            dVar.a("is_long", i3);
            if (com.ss.android.ugc.aweme.metrics.ac.a(enterFrom)) {
                dVar.a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(aweme)));
            } else {
                if (!TextUtils.isEmpty(creationId)) {
                    dVar.a("creation_id", creationId);
                }
                if (TextUtils.equals(enterFrom, "homepage_fresh_topic")) {
                    dVar.a("enter_from", enterFrom);
                    if (!TextUtils.isEmpty(aweme.getHotSpot())) {
                        dVar.a("topic_name", aweme.getHotSpot());
                    } else if (aweme.getHotListStruct() != null && !TextUtils.isEmpty(aweme.getHotListStruct().getTitile())) {
                        dVar.a("topic_name", aweme.getHotListStruct().getTitile());
                    }
                } else if (hotPlayerMap != null) {
                    dVar.a("enter_from", hotPlayerMap.get("enter_from"));
                    dVar.a("enter_method", hotPlayerMap.get("enter_method"));
                    dVar.a("trending_topic", hotPlayerMap.get("trending_topic"));
                    dVar.a("order", hotPlayerMap.get("order"));
                    dVar.a("is_rising_topic", hotPlayerMap.get("is_rising_topic"));
                    dVar.a("is_fullscreen", hotPlayerMap.get("is_fullscreen"));
                }
            }
            r.a("click_comment_button", dVar.f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        com.bytedance.a.b.b(UGCMonitor.EVENT_COMMENT, "info", 1);
        this.y.b();
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.a(1);
        }
        this.E.a("comment_ad_view_state", (Object) 0);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final String d() {
        String J2 = J();
        if (!TextUtils.isEmpty(J2)) {
            return J2;
        }
        Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
        long j2 = this.aG;
        return resources.getQuantityString(R.plurals.ae, (int) j2, com.ss.android.ugc.aweme.i18n.b.a(j2));
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(e eVar) {
        this.K = eVar;
    }

    @org.greenrobot.eventbus.r
    public void onAfterLoginInEvent(com.ss.android.ugc.aweme.al.f fVar) {
        ViewGroup viewGroup = this.f72766e;
    }

    private void j(boolean z2) {
        e eVar = this.K;
        if (eVar != null) {
            eVar.a(z2);
        }
    }

    public final void a(long j2) {
        g(this.O + j2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(long j2) {
        h(j2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void c(long j2) {
        e(j2);
        return null;
    }

    private static void a(Activity activity) {
        com.ss.android.ugc.aweme.feed.i.d dVar = new com.ss.android.ugc.aweme.feed.i.d(1);
        dVar.f93469d = activity.hashCode();
        com.ss.android.ugc.d.a.c.a(dVar);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        this.y.c(exc);
    }

    @org.greenrobot.eventbus.r
    public void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        if (aVar.f34874a != 4) {
            j(true);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar;
        if (this.f72766e != null && (aVar = this.v) != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z2) {
        if (z2) {
            an();
        } else {
            al();
        }
        super.onHiddenChanged(z2);
    }

    static androidx.fragment.app.e a(Context context) {
        while (context != null) {
            if (context instanceof androidx.fragment.app.e) {
                return (androidx.fragment.app.e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static l.a b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107225d != l.a.UNKNOWN && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107225d;
        }
        l.a c2 = com.bytedance.common.utility.l.c(context);
        com.ss.android.ugc.aweme.lancet.j.f107225d = c2;
        return c2;
    }

    private static boolean c(List<Comment> list) {
        if (com.bytedance.common.utility.collection.b.a((Collection) list) || !(list.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.s)) {
            return false;
        }
        return true;
    }

    private void f(long j2) {
        if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71352a) {
            b.i.b(new z(this, j2), r.a());
        } else {
            e(j2);
        }
    }

    private static TextView h(String str) {
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        int c2 = androidx.core.content.b.c(a2, R.color.qj);
        TuxTextView a3 = com.ss.android.ugc.aweme.comment.util.m.a(a2);
        a3.setTextColor(c2);
        a3.setText(str);
        return a3;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.a
    public final void d(Exception exc) {
        this.y.d(exc);
        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 3002042) {
            this.f72763b.setCommentClose(true);
            b(this.f72763b);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void g(Comment comment) {
        if (comment != null && comment.getFakeGiftId() != 0) {
            a(true, comment, 0);
        }
    }

    @org.greenrobot.eventbus.r
    public void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        String str = aVar.f68097a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/comment/list/?") || str.contains("/aweme/v2/comment/list/?")) {
            EventBus.a().d(aVar);
            v();
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.comment.c.d dVar) {
        if (this.Z != null && TextUtils.equals(dVar.f71750a, this.f72763b.getAid())) {
            this.Z.b(0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        com.ss.android.ugc.aweme.comment.a.e.a("CommentListFragment onSaveInstanceState");
        bundle.putBoolean("should_hide", true);
        bundle.putSerializable("page_param", this.f72763b);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z2) {
        super.setUserVisibleHint(z2);
        if (isAdded()) {
            if (z2 && this.aE) {
                this.aE = false;
                f(this.aF);
            }
            i(z2);
        }
    }

    private void b(List<Comment> list) {
        Aweme aweme = this.f72764c;
        if (aweme != null) {
            if (!aweme.isAd() || this.f72763b.getAdCommentStruct() == null) {
                List e2 = this.v.e();
                if (c(e2)) {
                    list.addAll(0, e2);
                }
            }
        }
    }

    private boolean c(com.ss.android.ugc.aweme.comment.i.h hVar) {
        if (TextUtils.equals(hVar.getAid(), this.f72763b.getAid()) && hVar.isCommentClose() == this.f72763b.isCommentClose() && hVar.isCommentLimited() == this.f72763b.isCommentLimited() && hVar.isEnableComment() == this.f72763b.isEnableComment() && !d(hVar)) {
            return false;
        }
        return true;
    }

    private boolean d(com.ss.android.ugc.aweme.comment.i.h hVar) {
        Aweme aweme;
        boolean z2;
        if (hVar == null || hVar.getAdCommentStruct() == null) {
            aweme = null;
        } else {
            aweme = AwemeService.b().d(hVar.getAdCommentStruct().getAid());
        }
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isCommentAreaSwitch()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.am != z2) {
            return true;
        }
        return false;
    }

    private int e(String str) {
        v vVar = this.A;
        if (!com.bytedance.common.utility.collection.b.a((Collection) vVar.f72884b)) {
            for (Comment comment : vVar.f72884b) {
                if (TextUtils.equals(comment.getCid(), str)) {
                    return (int) (comment.getReplyCommentTotal() + 1);
                }
            }
        }
        return 1;
    }

    private boolean f(String str) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar = this.v;
        if (aVar != null) {
            List e2 = aVar.e();
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Comment comment = (Comment) e2.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getAliasAweme() != null) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private void g(boolean z2) {
        Aweme aweme;
        this.O = 0;
        X();
        aa();
        if (!(this.aI == null || (aweme = this.f72764c) == null || t.b(aweme) == null)) {
            this.aI.a(this.f72764c);
        }
        if (z2) {
            aq();
        }
    }

    private long h(boolean z2) {
        long d2 = this.w.d();
        if (!this.am || ad()) {
            return d2;
        }
        List e2 = this.v.e();
        if (!com.bytedance.common.utility.collection.b.a((Collection) e2) && (z2 || !(e2.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.s))) {
            d2++;
        }
        Aweme aweme = this.f72764c;
        if (aweme == null || aweme.getAdCommentStruct() == null || d2 <= 0) {
            return d2;
        }
        return d2 + 1;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f72763b = (com.ss.android.ugc.aweme.comment.i.h) arguments.getSerializable("id");
            this.aD = getArguments().getBoolean("key_show_title");
        }
        this.z = new com.ss.android.ugc.aweme.comment.b(this, hashCode(), this);
        if (com.ss.android.ugc.aweme.experiment.o.a()) {
            this.aI = new com.ss.android.ugc.aweme.comment.translatorinfo.b(requireContext(), this);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.commercialize.event.a aVar) {
        if (aVar != null) {
            if (aVar.f74039a == 1) {
                A();
            } else if (this.aK) {
                this.aK = false;
                B();
            }
        }
    }

    private void a(View view) {
        View a2;
        MethodCollector.i(1528);
        if (view == null) {
            MethodCollector.o(1528);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bf6);
        if (frameLayout == null) {
            MethodCollector.o(1528);
            return;
        }
        frameLayout.removeAllViews();
        if (com.ss.android.ugc.aweme.poi_api.service.c.f115540d == null || com.ss.android.ugc.aweme.poi_api.service.c.a() == null) {
            MethodCollector.o(1528);
            return;
        }
        if (!at() && (a2 = com.ss.android.ugc.aweme.poi_api.service.c.a().a(requireContext(), this.f72764c, this.f72763b.getEventType())) != null) {
            frameLayout.addView(a2);
            ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388613;
                layoutParams2.setMarginEnd(com.ss.android.ugc.aweme.base.utils.n.a(44.0d));
                this.n.setLayoutParams(layoutParams2);
            }
        }
        MethodCollector.o(1528);
    }

    private CommentLikeUsersStruct d(List<Comment> list) {
        if (!R() || this.f72764c == null) {
            return null;
        }
        CommentLikeUsersStruct commentLikeUsersStruct = new CommentLikeUsersStruct();
        commentLikeUsersStruct.setCommentType(220);
        commentLikeUsersStruct.setDialogHeight(this.F.getHeight());
        commentLikeUsersStruct.setEventType(this.f72763b.getEventType());
        commentLikeUsersStruct.setLikeUsers(this.f72763b.getLikeUsers());
        commentLikeUsersStruct.setLikeUsersCount(S());
        commentLikeUsersStruct.setAweme(this.f72764c);
        if (list != null) {
            list.add(0, commentLikeUsersStruct);
        }
        return commentLikeUsersStruct;
    }

    private String g(String str) {
        v vVar;
        List<CommentReplyListItem> list;
        if (!(str == null || (vVar = this.A) == null || com.bytedance.common.utility.collection.b.a((Collection) vVar.f72883a) || (list = this.A.f72883a) == null || com.bytedance.common.utility.collection.b.a((Collection) list))) {
            for (CommentReplyListItem commentReplyListItem : list) {
                if (str.equals(commentReplyListItem.mComment.getCid())) {
                    return commentReplyListItem.mComment.getUser().getPredictedAgeGroup();
                }
                if (commentReplyListItem.mReplyComments != null) {
                    for (Comment comment : commentReplyListItem.mReplyComments) {
                        if (str.equals(comment.getCid())) {
                            return commentReplyListItem.mComment.getUser().getPredictedAgeGroup();
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private void i(boolean z2) {
        com.ss.android.ugc.aweme.comment.adapter.a aVar;
        if (z2) {
            if (this.ar == 0) {
                if (this.av) {
                    b.i.b(new ah(this), com.ss.android.ugc.aweme.cw.g.c());
                } else {
                    ak();
                }
                this.ar = System.currentTimeMillis();
            }
        } else if (this.ar != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.ar;
            this.ar = 0;
            if (currentTimeMillis >= 0) {
                if (this.av) {
                    b.i.b(new aj(this, currentTimeMillis), com.ss.android.ugc.aweme.cw.g.c());
                } else {
                    h(currentTimeMillis);
                }
            } else {
                return;
            }
        }
        com.ss.android.ugc.aweme.comment.adapter.a aVar2 = this.v;
        if (aVar2 != null) {
            aVar2.a(z2);
        }
        if (aq && (aVar = this.v) != null && !com.bytedance.common.utility.collection.b.a((Collection) aVar.e())) {
            this.Z.b(0);
        }
        aq = false;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(boolean z2) {
        String str;
        if (z2) {
            IForwardStatisticsService b2 = ForwardStatisticsServiceImpl.b();
            String enterFrom = this.f72763b.getEnterFrom();
            Aweme aweme = this.f72764c;
            if (this.f72765d != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            b2.a(enterFrom, aweme, "list", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        W();
        this.f72767j.setKeyListener(null);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        this.u = wrapLinearLayoutManager;
        this.Z.setLayoutManager(wrapLinearLayoutManager);
        av();
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("should_hide", false);
            this.ao = z2;
            if (z2) {
                j(false);
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof com.ss.android.ugc.aweme.comment.i.h) {
                this.f72763b = (com.ss.android.ugc.aweme.comment.i.h) serializable;
                this.f72764c = AwemeService.b().b(this.f72763b.getAid());
            }
        }
        d(true);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEnterTextEvent(com.ss.android.ugc.aweme.comment.c.f fVar) {
        if (fVar.f71754a != null && !TextUtils.isEmpty(fVar.f71755b)) {
            Comment comment = fVar.f71754a;
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(getActivity(), this.f72763b.getEventType(), "reply_comment", new ap().a("group_id", this.f72763b.getAid()).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(this.f72763b.getAid())).f142646a, new am(this, comment));
            } else if (!ag()) {
                b(comment, fVar.f71755b);
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.feed.i.ac acVar) {
        this.aK = a();
        j(true);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onExpandingCachedCommentReplies(com.ss.android.ugc.aweme.comment.c.a aVar) {
        int intValue;
        int intValue2;
        if (aVar.f71742a == null) {
            intValue = -1;
        } else {
            intValue = aVar.f71742a.intValue();
        }
        if (aVar.f71743b == null) {
            intValue2 = 1;
        } else {
            intValue2 = aVar.f71743b.intValue();
        }
        if (intValue > 0 && intValue < this.v.getItemCount() && getContext() != null) {
            AnonymousClass3 r4 = new androidx.recyclerview.widget.r(getContext()) {
                /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(44836);
                }

                @Override // androidx.recyclerview.widget.r
                public final float a(DisplayMetrics displayMetrics) {
                    return 120.0f / ((float) displayMetrics.densityDpi);
                }

                @Override // androidx.recyclerview.widget.r
                public final int a(int i2, int i3, int i4, int i5, int i6) {
                    return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                }
            };
            r4.f3862g = intValue;
            if (intValue2 <= 5) {
                this.Z.postDelayed(new an(this, r4), (long) (intValue2 * 30));
                return;
            }
            this.Z.b(intValue - 5);
            this.u.a(r4);
        }
    }

    private void a(CommentPrompt commentPrompt) {
        if (commentPrompt.getType() > 0) {
            this.af.setVisibility(0);
            this.af.setText(commentPrompt.getContent());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.aa.getLayoutParams();
            layoutParams.setMargins(0, com.ss.android.ugc.aweme.base.utils.n.a(12.0d), 0, com.ss.android.ugc.aweme.base.utils.n.a(4.0d));
            this.aa.setLayoutParams(layoutParams);
            return;
        }
        this.af.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.aa.getLayoutParams();
        layoutParams2.setMargins(0, com.ss.android.ugc.aweme.base.utils.n.a(12.0d), 0, com.ss.android.ugc.aweme.base.utils.n.a(12.0d));
        this.aa.setLayoutParams(layoutParams2);
    }

    private View b(View view) {
        int i2;
        MethodCollector.i(520);
        if (!ai()) {
            MethodCollector.o(520);
            return view;
        }
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        LinearLayout linearLayout = new LinearLayout(a2);
        linearLayout.setBackgroundColor(androidx.core.content.b.c(a2, R.color.v));
        TuxTextView tuxTextView = new TuxTextView(a2);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(androidx.core.content.b.c(a2, R.color.c4));
        if (in.a(this.f72763b.getAuthorUid())) {
            i2 = R.string.h8x;
        } else {
            i2 = R.string.h8w;
        }
        tuxTextView.setText(a2.getText(i2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) n.b(a2, 12.0f);
        layoutParams.bottomMargin = (int) n.b(a2, 12.0f);
        layoutParams.leftMargin = (int) n.b(a2, 16.0f);
        layoutParams.rightMargin = (int) n.b(a2, 16.0f);
        linearLayout.addView(tuxTextView, layoutParams);
        FrameLayout frameLayout = new FrameLayout(a2);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(view, layoutParams2);
        MethodCollector.o(520);
        return frameLayout;
    }

    private void d(String str) {
        View findViewById;
        if (getView() != null && (findViewById = getView().findViewById(R.id.ao4)) != null) {
            Aweme b2 = AwemeService.b().b(str);
            List<AnchorCommonStruct> a2 = com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.a(b2);
            if (a2 == null || a2.size() <= 0 || at()) {
                findViewById.setVisibility(8);
                return;
            }
            findViewById.setVisibility(0);
            com.ss.android.ugc.aweme.comment.util.q.a(ac.a.f91473a.a(this.f72763b.getRequestId()), this.f72763b.getEnterFrom(), findViewById, b2, this.F);
        }
    }

    private void e(List<Comment> list) {
        if (at() && this.f72764c != null) {
            com.ss.android.ugc.aweme.comment.barrage.b bVar = new com.ss.android.ugc.aweme.comment.barrage.b();
            bVar.authorUid = this.f72763b.getAuthorUid();
            bVar.awemeId = this.f72764c.getAid();
            bVar.enterFrom = this.f72763b.getEnterFrom();
            bVar.eventType = this.f72763b.getEventType();
            bVar.mPlayListId = this.f72763b.getPlayListId();
            bVar.mPlayListType = this.f72763b.getPlayListType();
            bVar.requestId = this.f72763b.getRequestId();
            bVar.mPlayListIdKey = this.f72763b.getPlayListIdKey();
            bVar.pageType = this.f72763b.getPageType();
            bVar.tabName = this.f72763b.getTabName();
            bVar.aweme = this.f72764c;
            com.ss.android.ugc.aweme.comment.barrage.c cVar = new com.ss.android.ugc.aweme.comment.barrage.c(this.f72764c, bVar);
            cVar.setCommentType(221);
            cVar.setAwemeId(this.f72764c.getAid());
            if (TextUtils.isEmpty(this.f72764c.getDesc())) {
                cVar.setText("");
            } else {
                cVar.setText(this.f72764c.getDesc());
            }
            cVar.setTextExtra(this.f72764c.getTextExtra());
            cVar.setCreateTime((int) this.f72764c.getCreateTime());
            cVar.setUser(this.f72764c.getAuthor());
            list.add(0, cVar);
        }
    }

    private void g(long j2) {
        this.O = j2;
        if (ad()) {
            j2++;
        }
        if (j2 == 0) {
            this.aa.setText(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.o0));
            if (this.f72765d != null) {
                aq();
            }
        } else {
            String J2 = J();
            if (!TextUtils.isEmpty(J2)) {
                this.aa.setText(J2);
            } else {
                this.aa.setText(new a.C0730a().a(com.bytedance.ies.ugc.appcontext.d.a().getResources().getQuantityString(R.plurals.ae, (int) j2, com.ss.android.ugc.aweme.i18n.b.a(j2))).f33382a);
            }
        }
        this.aG = j2;
        this.aa.post(new aa(this, this.O));
        e eVar = this.K;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    private void h(long j2) {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        String str5;
        String enterFrom = this.f72763b.getEnterFrom();
        String enterMethod = this.f72763b.getEnterMethod();
        Aweme aweme = this.f72764c;
        boolean isHotPlayer = this.f72763b.isHotPlayer();
        h.f.b.l.d(enterFrom, "");
        h.f.b.l.d(enterMethod, "");
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = com.ss.android.ugc.aweme.comment.m.c.a(enterFrom, str).a("duration", j2);
        if (isHotPlayer) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("is_fullscreen", str2);
        if (TextUtils.equals(enterFrom, "homepage_fresh_topic")) {
            a3.a("enter_from", "homepage_fresh_topic");
        } else {
            if (isHotPlayer) {
                str3 = "trending_page";
            } else {
                str3 = enterFrom;
            }
            a3.a("enter_from", str3);
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("enter_method", enterMethod);
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("follow_status", com.ss.android.ugc.aweme.story.b.h.a(user));
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("story_type", str4);
        if (aweme == null || (str5 = com.ss.android.ugc.aweme.story.d.a.b(aweme)) == null) {
            str5 = "";
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("story_collection_id", str5);
        h.f.b.l.b(a7, "");
        com.ss.android.ugc.aweme.upvote.event.c.a(a7, aweme, enterFrom);
        r.a("close_comment", a3.f66730a);
        r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName("comment_page").setExtValueString(str).setValue(String.valueOf(j2)));
        com.bytedance.ies.ugc.appcontext.d.a();
        r.a("close_comment", "click_shadow", 0);
        com.bytedance.a.b.c(UGCMonitor.EVENT_COMMENT, "info");
        if (!this.w.f72051a) {
            com.ss.android.ugc.aweme.comment.util.k.a(UGCMonitor.EVENT_COMMENT, 2, this.f72763b.getEnterFrom(), true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        if (!this.M.a(this.f72764c) || this.z == null || this.f72767j == null) {
            new com.bytedance.tux.g.b(this).e(R.string.hb_).b();
        } else if (com.ss.android.ugc.aweme.comment.d.f.a()) {
            androidx.fragment.app.e activity = getActivity();
            com.ss.android.ugc.aweme.comment.b bVar = this.z;
            Aweme aweme = this.f72764c;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(bVar, "");
            com.ss.android.ugc.aweme.comment.supporterpanel.j jVar = new com.ss.android.ugc.aweme.comment.supporterpanel.j();
            h.f.b.l.d(bVar, "");
            jVar.f72411a = bVar;
            jVar.f72414d = aweme;
            a.C1112a a2 = new a.C1112a().a(jVar).a(1);
            double b2 = (double) n.b(activity);
            Double.isNaN(b2);
            com.bytedance.tux.sheet.sheet.a aVar = a2.b((int) (b2 * 0.66d)).b(false).c().a(false).a(new j.a.DialogInterface$OnDismissListenerC1625a(aweme)).f45299a;
            jVar.f72413c = aVar;
            aVar.show(activity.getSupportFragmentManager(), "VGSupportPanelFragment");
        } else {
            this.z.a(this.f72767j.getHint(), str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @org.greenrobot.eventbus.r
    public void onDiggUpdateEvent(ag agVar) {
        com.ss.android.ugc.aweme.common.a.f fVar;
        com.ss.android.ugc.aweme.common.a.f fVar2;
        if (agVar.f93450a == 13 && (agVar.f93451b instanceof String)) {
            Object obj = agVar.f93451b;
            if (this.az.contains(obj)) {
                this.az.remove(obj);
                if (S() < 1 && (fVar2 = (com.ss.android.ugc.aweme.common.a.f) this.y.a()) != null && fVar2.e() != null) {
                    Iterator it = fVar2.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Comment comment = (Comment) it.next();
                        if (comment.getCommentType() == 220) {
                            fVar2.e().remove(comment);
                            break;
                        }
                    }
                    fVar2.notifyDataSetChanged();
                    return;
                }
                return;
            }
            this.az.add(obj);
            bt btVar = this.y;
            CommentLikeUsersStruct d2 = d((List<Comment>) null);
            if (d2 != null && (fVar = (com.ss.android.ugc.aweme.common.a.f) btVar.a()) != null && fVar.e() != null) {
                List e2 = fVar.e();
                int i2 = 0;
                while (true) {
                    if (i2 >= e2.size() || ((Comment) e2.get(i2)).getCommentType() == 220) {
                        break;
                    } else if (((Comment) e2.get(i2)).getCommentType() == 221) {
                        e2.add(i2, d2);
                        break;
                    } else if (((Comment) e2.get(i2)).getCommentType() == 1) {
                        e2.add(i2, d2);
                        break;
                    } else {
                        i2++;
                    }
                }
                fVar.notifyDataSetChanged();
            }
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        String quantityString;
        if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, jVar.f103916d)) {
            int i2 = jVar.f103922j;
            String displayName = jVar.f103913a.getDisplayName();
            if (displayName.length() != 0) {
                if (displayName.length() >= 50) {
                    displayName = displayName.substring(0, 50) + "...";
                }
                if (i2 == 1) {
                    quantityString = getResources().getString(R.string.cas, displayName);
                } else {
                    int i3 = i2 - 1;
                    quantityString = getResources().getQuantityString(R.plurals.d1, i3, displayName, Integer.valueOf(i3));
                }
                new com.bytedance.tux.g.b(this).a(quantityString).b();
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onUserBlockedEvent(com.ss.android.ugc.aweme.profile.b.a aVar) {
        String uid;
        v vVar;
        bt btVar;
        User user = aVar.f116043a;
        if (!(user == null || (uid = user.getUid()) == null || "".equals(uid) || (vVar = this.A) == null || vVar.f72883a == null)) {
            v vVar2 = this.A;
            if (vVar2 != null && !com.bytedance.common.utility.collection.b.a((Collection) vVar2.f72883a) && !"".equals(uid)) {
                int i2 = 0;
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                for (CommentReplyListItem commentReplyListItem : this.A.f72883a) {
                    Comment comment = commentReplyListItem.mComment;
                    if (!(comment == null || comment.getUser() == null)) {
                        if (uid.equals(comment.getUser().getUid())) {
                            hashSet.add(comment.getCid());
                            i2 = (int) (((long) i2) + comment.getReplyCommentTotal() + 1);
                            hashMap.put(comment.getCid(), comment);
                        } else if (!com.bytedance.common.utility.collection.b.a((Collection) commentReplyListItem.mReplyComments)) {
                            for (Comment comment2 : commentReplyListItem.mReplyComments) {
                                if (comment2.getUser() != null && uid.equals(comment2.getUser().getUid())) {
                                    hashSet.add(comment2.getCid());
                                    hashMap.put(comment2.getCid(), comment2);
                                    i2++;
                                    p.a(comment.getCid(), -1);
                                }
                            }
                        }
                    }
                }
                if (hashMap.size() > 0 && i2 > 0 && !com.bytedance.common.utility.collection.b.a((Collection) hashSet) && (btVar = this.y) != null) {
                    btVar.a(hashSet, hashMap);
                    a((long) (-i2));
                }
            }
            if (TextUtils.equals(uid, V())) {
                this.y.f72627d = null;
            }
        }
    }

    private void b(com.ss.android.ugc.aweme.comment.i.h hVar) {
        boolean c2 = c(hVar);
        this.f72763b = hVar;
        this.G = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null && c2) {
            bVar.a();
        }
        O();
        this.z.b(this.G);
        d(this.f72763b.getAid());
        if (c2 || this.Z.getChildCount() == 0 || this.am) {
            ax();
            v vVar = this.A;
            if (vVar != null) {
                vVar.c();
                this.y.f();
            }
            d(c2);
            Q();
            W();
            a(new CommentPrompt());
            return;
        }
        if (this.f72763b.isForceRefresh()) {
            X();
        }
        aa();
        W();
        if (TextUtils.equals(this.f72763b.getInsertCids(), "bubble_desc_click_faker_cid")) {
            this.f72763b.setInsertCids("", false, false);
            this.Z.b(0);
        }
    }

    private void d(boolean z2) {
        if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71355d) {
            this.v = new com.ss.android.ugc.aweme.comment.adapter.a(this, this.f72763b, this.Z);
        } else {
            this.v = new com.ss.android.ugc.aweme.comment.adapter.a(this, this.f72763b);
        }
        this.v.b_(new ArrayList());
        this.v.f71320c = this.f72764c;
        this.v.f71319b = this.f72763b.getCommentTag();
        this.v.a((h.a) this);
        this.v.f71321d = this.f72763b.getRequestId();
        this.v.g(androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.c5));
        this.v.f71322e = this.A;
        TextView h2 = h(ay());
        DmtStatusView dmtStatusView = this.Y;
        dmtStatusView.setBuilder(dmtStatusView.c().b(b(h2)));
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        if (bVar != null) {
            bVar.m();
        }
        com.ss.android.ugc.aweme.discover.c.a aVar = new com.ss.android.ugc.aweme.discover.c.a(this.v);
        this.ae = aVar;
        this.Z.setAdapter(aVar);
        ac();
        this.v.f71325h = this.E;
        this.y.f72624a = this.f72763b.getAid();
        if (z2) {
            this.y.f72627d = null;
        }
        g(z2);
        if (z2 || this.O != 0) {
            L();
        }
    }

    private void e(long j2) {
        com.ss.android.ugc.aweme.comment.b bVar;
        MentionEditText mentionEditText;
        boolean z2 = true;
        if (!getUserVisibleHint()) {
            this.aE = true;
            this.aF = j2;
        } else if (!TextUtils.equals("click_comment_chain", this.f72763b.getEventType()) && !TextUtils.equals("click_comment_bubble", this.f72763b.getEventType()) && !TextUtils.equals("collection_comment", this.f72763b.getEventType()) && !M() && !com.ss.android.ugc.aweme.story.d.a.j(this.f72764c)) {
            if (ap() && this.M.a(this.f72764c)) {
                boolean equals = this.f72763b.getEnterMethod().equals("click_video_gift_stripe");
                if (equals && this.M.a(this.f72764c) && (bVar = this.z) != null && (mentionEditText = this.f72767j) != null) {
                    bVar.a(mentionEditText.getHint(), "click_video_gift_stripe");
                }
                if (j2 > 0) {
                    Aweme aweme = this.f72764c;
                    TuxIconView tuxIconView = this.f72768k;
                    if (tuxIconView != null && tuxIconView.getVisibility() == 0 && !this.M.f() && getActivity() != null) {
                        new Handler(Looper.getMainLooper()).post(new ap(this, aweme, equals));
                        this.M.g();
                    }
                }
                if (equals) {
                    return;
                }
            }
            if (j2 != 0 || !ap()) {
                z2 = false;
            }
            if (z2) {
                com.ss.android.ugc.aweme.comment.b bVar2 = this.z;
                if (bVar2 != null && !bVar2.e()) {
                    this.z.a(this.f72767j.getHint(), false);
                }
                r.a("keyboard_open", new com.ss.android.ugc.aweme.app.f.d().a("keyboard_open", "1").a("comment_cnt", j2).f66730a);
                return;
            }
            r.a("keyboard_open", new com.ss.android.ugc.aweme.app.f.d().a("keyboard_open", "0").a("comment_cnt", j2).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void c(Comment comment) {
        CharSequence charSequence;
        String str;
        getActivity();
        if (!w()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
        } else if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            com.ss.android.ugc.aweme.login.c.a(this, this.f72763b.getEventType(), "like_comment");
        } else if (comment != null) {
            if (comment.getUserDigged() == 0) {
                charSequence = "1";
            } else {
                charSequence = "2";
            }
            com.ss.android.ugc.aweme.comment.j.h hVar = this.ai;
            if (hVar != null && hVar.i()) {
                this.ai.a(comment.getCid(), comment.getAwemeId(), charSequence, this.f72763b.getCommentTag());
                ((com.ss.android.ugc.aweme.comment.j.f) this.ai.f76396h).f72030e = comment;
            }
            if (comment.getUser() != null) {
                this.al = comment.getUser().getUid();
            }
            this.ak = comment.getCid();
            boolean f2 = f(comment.getCid());
            boolean equals = TextUtils.equals(Comment.getAuthorUid(comment), this.f72764c.getAuthorUid());
            if (TextUtils.equals("1", charSequence)) {
                String eventType = this.f72763b.getEventType();
                String valueOf = String.valueOf(comment.getLabelType());
                String str2 = this.ak;
                String aid = this.f72763b.getAid();
                String authorUid = Comment.getAuthorUid(comment);
                int i2 = 1 ^ (equals ? 1 : 0);
                String newsId = this.f72763b.getNewsId();
                String predictedAgeGroup = com.ss.android.ugc.aweme.account.b.g().getCurUser().getPredictedAgeGroup();
                String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
                if ("1".equals(valueOf)) {
                    str = "author";
                } else if ("2".equals(valueOf)) {
                    str = "following";
                } else {
                    str = "common";
                }
                com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("attribute", str).a("reply_uid", authorUid).a("reply_comment_id", str2).a("user_level", predictedAgeGroup).a("comment_author_level", predictedAgeGroup2);
                if (f2) {
                    a2.a("is_others_video", Integer.valueOf(i2));
                }
                if (!TextUtils.isEmpty(newsId)) {
                    a2.a("news_id", newsId);
                }
                r.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(eventType).setValue(aid).setExtValueString(authorUid).setJsonObject(a2.a()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void f(Comment comment) {
        m.a aVar;
        bx.a.a(comment).show(getActivity().getSupportFragmentManager().a(), "GiftAnimationFragment");
        au();
        if (this.f72765d != null && (!this.an || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(Comment.getAuthorUid(this.f72765d));
            if (this.an && comment.getCommentType() != 0) {
                comment.setReplyToUserName(in.a(this.f72765d.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(in.a(this.f72765d.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f72765d);
            comment.setReplyComments(arrayList);
        }
        if (!m.e(comment)) {
            Comment comment2 = this.f72765d;
            if (comment != null) {
                Map<String, m.a> map = m.f72082a;
                String fakeId = comment.getFakeId();
                h.f.b.l.b(fakeId, "");
                m.a aVar2 = m.f72082a.get(comment.getFakeId());
                if (aVar2 == null || (aVar = m.a.a(aVar2, 0, null, 0, null, 0, comment2, 31)) == null) {
                    aVar = new m.a(0, null, 0, null, 0, comment2, 31);
                }
                map.put(fakeId, aVar);
            }
        }
        this.y.a(comment, ai());
        if (com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.l(1, comment));
        }
        if (at()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.a(1, comment));
        }
        aq();
        com.ss.android.ugc.aweme.commercialize.egg.e.a aVar3 = this.ag;
        if (aVar3 != null) {
            aVar3.a(new com.ss.android.ugc.aweme.commercialize.egg.d.d(UGCMonitor.EVENT_COMMENT, comment.getText(), this.f72763b.getEventType()));
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.main.f.b bVar) {
        j(true);
        com.ss.android.ugc.aweme.comment.b bVar2 = this.z;
        if (bVar2 != null && (bVar2.f71468b instanceof k) && bVar2.f71468b.getChildFragmentManager().a("comment_rethink") != null && bVar2.f71472f != null) {
            b.a aVar = bVar2.f71472f;
            if (aVar.f71520d != null && aVar.f71519c != null) {
                aVar.a(aVar.f71520d, true);
                aVar.f71519c.dismiss();
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onReportCommentEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        long j2;
        T t2;
        Comment comment;
        try {
            if (TextUtils.equals("commentReportSuccess", jVar.f91311b.getString("eventName"))) {
                String string = jVar.f91311b.getJSONObject("data").getString("object_id");
                Comment comment2 = new Comment();
                comment2.setCid(string);
                a((long) (-e(string)));
                this.y.a(string, new com.ss.android.ugc.aweme.comment.i.g(ai(), com.ss.android.ugc.aweme.story.d.a.d(this.f72764c), comment2));
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(4, new Object[]{this.f72763b.getAid(), string}));
                T t3 = this.w.f76396h;
                if (!(t3 == null || (t2 = t3.mData) == null || t2.replyStyle == 2)) {
                    bt btVar = this.y;
                    if (btVar.a() instanceof com.ss.android.ugc.aweme.comment.adapter.a) {
                        com.ss.android.ugc.aweme.comment.adapter.a aVar = (com.ss.android.ugc.aweme.comment.adapter.a) btVar.a();
                        if (!(aVar.c() == 0 || TextUtils.isEmpty(string))) {
                            Iterator it = aVar.f76354l.iterator();
                            boolean z2 = false;
                            while (it.hasNext()) {
                                Comment comment3 = (Comment) it.next();
                                if (!com.bytedance.common.utility.collection.b.a((Collection) comment3.getReplyComments()) && (comment = comment3.getReplyComments().get(0)) != null && TextUtils.equals(comment.getCid(), string)) {
                                    it.remove();
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                aVar.notifyDataSetChanged();
                            }
                        }
                    }
                }
            } else if (TextUtils.equals("commentBatchReportResult", jVar.f91311b.getString("eventName"))) {
                JSONArray jSONArray = jVar.f91311b.getJSONObject("data").getJSONArray("object_ids");
                if (this.I == null || jSONArray == null) {
                    new com.bytedance.tux.g.b(this).e(R.string.ak_).b();
                    return;
                }
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    hashSet.add(jSONArray.getString(i2));
                }
                Map<String, Comment> map = this.I.f72895b;
                Map<String, Comment> map2 = this.I.f72896c;
                int i3 = this.I.f72894a;
                if (map2.size() > 0 && i3 > 0) {
                    if (map2.size() == hashSet.size()) {
                        this.y.a(hashSet, map2);
                        a((long) (-i3));
                        if (map2.size() == map.size()) {
                            this.I.c();
                            this.I.b().postValue(0);
                        } else {
                            b(map);
                            this.I.b().postValue(Integer.valueOf(map.size()));
                        }
                        new com.bytedance.tux.g.b(this).e(R.string.akc).b();
                        return;
                    }
                    bt btVar2 = this.y;
                    if (btVar2 != null) {
                        btVar2.a(hashSet, map2);
                        for (Map.Entry<String, Comment> entry : map2.entrySet()) {
                            if (!hashSet.contains(entry.getKey()) && entry.getValue() != null) {
                                i3 = (int) (((long) i3) - (entry.getValue().getReplyCommentTotal() + 1));
                            }
                        }
                        if (i3 > 0) {
                            j2 = (long) (-i3);
                        } else {
                            j2 = 0;
                        }
                        a(j2);
                        b(map);
                        this.I.b().postValue(Integer.valueOf(map.size()));
                    }
                    new com.bytedance.tux.g.b(this).e(R.string.ak7).b();
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void c(boolean z2) {
        int i2;
        TextView textView = this.aa;
        if (textView != null) {
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            String aid = this.f72763b.getAid();
            if (aid == null) {
                aid = "";
            }
            jSONObject.put("group_id", aid);
            com.ss.android.ugc.aweme.ct.a.f79072b = SystemClock.uptimeMillis() - j2;
            jSONObject.put("duration", String.valueOf(com.ss.android.ugc.aweme.ct.a.f79072b));
            long n2 = com.ss.android.ugc.aweme.video.v.O().n();
            long j3 = (long) com.ss.android.ugc.aweme.comment.m.d.f72106c;
            long j4 = com.ss.android.ugc.aweme.comment.m.d.f72107d;
            Long.signum(j3);
            jSONObject.put("when", n2 + (j3 * j4));
            jSONObject.put("repeat", com.ss.android.ugc.aweme.comment.m.d.f72106c);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.common.c.a.a("comment_list", jSONObject);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(Comment comment) {
        b.C2263b a2;
        List<TextExtraStruct> textExtra;
        String str;
        com.ss.android.ugc.aweme.comment.i.h hVar;
        Aweme aweme = this.f72764c;
        Comment comment2 = null;
        if (aweme != null && aweme.isAd()) {
            String str2 = "draw_ad";
            if (TextUtils.equals(this.f72763b.getEventType(), "general_search")) {
                IAdCommentDepend b2 = AdCommentDependImpl.b();
                Context context = getContext();
                Aweme aweme2 = this.f72764c;
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme2) || (hVar = this.f72763b) == null || !hVar.isEnterFullScreen()) {
                    str2 = "result_ad";
                }
                b2.a(context, aweme2, str2, UGCMonitor.EVENT_COMMENT);
            } else {
                AdCommentDependImpl.b().a(getContext(), this.f72764c, (String) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a(str2, UGCMonitor.EVENT_COMMENT, this.f72764c.getAwemeRawAd()).a("anchor_id", com.ss.android.ugc.aweme.comment.util.a.b(this.f72764c)).a("room_id", com.ss.android.ugc.aweme.comment.util.a.a(this.f72764c)).c();
                ReportFeedAdAction.a(this.f72763b.getEnterFrom());
            }
        }
        if (!(comment == null || comment.getReplyComments() == null || (textExtra = comment.getTextExtra()) == null || this.z == null)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                Iterator<User> it = this.z.f71470d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                        if (next.getAtType() == 3) {
                            str = "follow";
                        } else if (next.getAtType() == 1) {
                            str = "search";
                        } else if (next.getAtType() == 4) {
                            str = "recent";
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            String aid = this.f72763b.getAid();
                            String uid = next.getUid();
                            com.bytedance.ies.ugc.appcontext.d.a();
                            r.a("comment_at", str, aid, uid);
                        }
                    }
                }
            }
        }
        int[] au2 = au();
        if (this.aj == null) {
            ah();
        }
        this.y.a(comment, au2[0], au2[1], ai());
        if (this.f72764c != null) {
            com.ss.android.ugc.aweme.feed.g.b bVar = b.a.f93183a;
            String aid2 = this.f72763b.getAid();
            if (ai.f93042a && (a2 = bVar.f93180e.a(aid2)) != null) {
                bVar.f93177b++;
                a2.f93186c = 1;
            }
        }
        a(1);
        Object[] objArr = new Object[2];
        objArr[0] = this.f72763b.getAid();
        if (comment != null) {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(3, objArr));
        if (com.ss.android.ugc.aweme.story.d.a.d(this.f72764c)) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.l(2, comment));
        }
        if (at()) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.o.a(2, comment));
        }
        if (!(comment == null || comment.getGift() == null)) {
            a(true, comment, 0);
        }
    }

    private void a(List<Comment> list) {
        com.ss.android.ugc.aweme.commercialize.model.s adCommentStruct;
        if (!this.am) {
            return;
        }
        if ((!com.bytedance.common.utility.collection.b.a((Collection) list) || ad()) && (adCommentStruct = this.f72763b.getAdCommentStruct()) != null) {
            if (com.bytedance.common.utility.collection.b.a((Collection) list) || !(list.get(0) instanceof com.ss.android.ugc.aweme.commercialize.model.s)) {
                list.add(0, adCommentStruct);
            }
            this.E.a("comment_ad_struct", adCommentStruct);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.g.a
    public final void b(Comment comment) {
        if (!com.ss.android.ugc.aweme.story.d.a.j(this.f72764c)) {
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(getActivity(), this.f72763b.getEventType(), "reply_comment", new ap().a("group_id", this.f72763b.getAid()).a("log_pb", com.ss.android.ugc.aweme.metrics.ac.c(this.f72763b.getAid())).f142646a, new ab(this, comment));
            } else if (!ag()) {
                b(comment, "click_button");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.b
    public final void e(boolean z2) {
        if (z2) {
            this.f72765d = null;
            this.an = false;
        } else {
            this.X.setVisibility(0);
        }
        this.V.setVisibility(0);
        this.W.setVisibility(0);
        this.C.a(!z2, false, false);
        if (this.as > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.as;
            this.as = 0;
            String enterFrom = this.f72763b.getEnterFrom();
            Aweme aweme = this.f72764c;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(enterFrom, aweme)).a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.b().a(aweme, "list")).a("stay_time", currentTimeMillis);
            if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
                dVar.a("country_name", aweme.getAuthor().getRegion());
            }
            r.a("close_text", dVar.f66730a);
        }
        this.y.a(false, (Comment) null);
    }

    public static void a(String str, Comment comment) {
        r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("comment_id", comment.getCid()).a("author_id", comment.getUser().getUid()).a("is_self_pin", in.a(comment.getUser().getUid()) ? 1 : 0).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Comment> list, boolean z2) {
        this.y.c(list, z2);
    }

    private void a(Aweme aweme, List<CommentGiftStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (CommentGiftStruct commentGiftStruct : list) {
            if (commentGiftStruct != null) {
                arrayList.add(String.valueOf(commentGiftStruct.getId()));
            } else {
                arrayList.add("");
            }
        }
        r.a("show_gift_summary_stripe", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f72763b.getEnterFrom()).a("group_id", com.ss.android.ugc.aweme.metrics.ac.e(aweme)).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(aweme)).a("gift_list", arrayList).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        super.onViewCreated(view, bundle);
        this.f72766e = (ViewGroup) view.findViewById(R.id.a_0);
        this.R = (TuxTextView) view.findViewById(R.id.a9w);
        this.S = (ImageView) view.findViewById(R.id.dlj);
        this.T = (SmartImageView) view.findViewById(R.id.a9v);
        this.f72767j = (MentionEditText) view.findViewById(R.id.a_7);
        this.V = (TuxIconView) view.findViewById(R.id.btt);
        this.W = (TuxIconView) view.findViewById(R.id.bwl);
        this.f72768k = (TuxIconView) view.findViewById(R.id.bx_);
        this.X = (ImageView) view.findViewById(R.id.aa2);
        this.Q = (ConstraintLayout) view.findViewById(R.id.a_6);
        this.U = view.findViewById(R.id.c5j);
        this.Y = (DmtStatusView) view.findViewById(R.id.e_o);
        this.Z = (RecyclerView) view.findViewById(R.id.djj);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.aa = textView;
        if (this.aD) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.n = (ImageView) view.findViewById(R.id.ru);
        this.o = (TextView) view.findViewById(R.id.ry);
        this.p = (TextView) view.findViewById(R.id.rx);
        this.q = (TextView) view.findViewById(R.id.s0);
        this.r = view.findViewById(R.id.rw);
        this.ac = view.findViewById(R.id.b8v);
        this.ad = view.findViewById(R.id.a9z);
        this.F = (FrameLayout) view.findViewById(R.id.b4w);
        this.af = (TextView) view.findViewById(R.id.a_z);
        ICommerceEggService c2 = CommerceEggServiceImpl.c();
        if (c2 != null) {
            this.ag = c2.a((ViewStub) view.findViewById(R.id.ab8));
        }
        a aVar = new a(this.Q);
        this.C = aVar;
        aVar.b(false, false, false);
        Context context = view.getContext();
        int c3 = androidx.core.content.b.c(context, R.color.qj);
        TuxTextView a2 = com.ss.android.ugc.aweme.comment.util.m.a(context);
        a2.setTextColor(c3);
        a2.setText(R.string.cyt);
        a2.setOnClickListener(new m(this));
        DmtStatusView.a c4 = DmtStatusView.a.a(context).b(b(h(ay()))).c(a2);
        c4.f33605g = 0;
        this.ay = c4;
        this.Y.setBuilder(c4);
        RecyclerView recyclerView = this.Z;
        if (recyclerView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView).setLabel("comment_list");
        }
        da.a.a("comment_list").a(this.Z);
        this.A = new v();
        this.y = new bt(getActivity(), this.Y, this.Z, this.A, this.f72764c);
        this.Z.a(new RecyclerView.n() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(44829);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                int m2 = k.this.u.m();
                int A = k.this.u.A();
                if (m2 >= 8 && A - m2 < 8 && ((com.ss.android.ugc.aweme.common.e.a) k.this.w.f76396h).isHasMore()) {
                    k.this.l();
                }
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.ae(k.this.f72764c)) {
                    k.this.E.a("comment_dialog_state", (Object) 3);
                }
            }
        });
        this.f72767j.setFocusable(false);
        this.f72767j.setMaxLines(1);
        this.f72767j.setEllipsize(TextUtils.TruncateAt.END);
        TuxTextView tuxTextView = this.R;
        String str = getString(R.string.aju) + " ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + getString(R.string.hch));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass7 */

            static {
                Covode.recordClassIndex(44840);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                com.ss.android.ugc.aweme.compliance.api.a.c().a(k.this.getContext(), "float_comment");
            }
        }, str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.bx)), str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        this.R.setMovementMethod(new LinkMovementMethod());
        this.z.a(this.f72767j, this.V, this.W, this.f72768k, this.R, this.f72763b.getAid(), this.f72763b.getEnterFrom());
        com.ss.android.ugc.aweme.comment.b bVar = this.z;
        ImageView imageView = this.S;
        ConstraintLayout constraintLayout = this.Q;
        bVar.f71478l = imageView;
        bVar.r = constraintLayout;
        boolean a3 = com.ss.android.ugc.aweme.compliance.api.a.c().a(3);
        this.G = a3;
        this.z.b(a3);
        this.f72767j.setTextSize(2, 15.0f);
        this.E = DataCenter.a(androidx.lifecycle.ae.a(this, (ad.b) null), this);
        com.ss.android.ugc.aweme.arch.widgets.base.e a4 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, view);
        this.at = a4;
        a4.a(this.E);
        Widget a5 = AdCommentDependImpl.b().a(new u(this));
        this.au = a5;
        this.at.a(R.id.ad8, a5);
        this.z.f71479m = this.E;
        a(view);
        this.z.f71476j = new x(this);
        this.z.a();
        this.X.setOnClickListener(new ai(this));
        O();
        Aweme aweme = this.f72764c;
        if (aweme != null) {
            d(aweme.getAid());
        }
        U();
        if (com.ss.android.ugc.aweme.comment.d.e.a()) {
            com.ss.android.ugc.aweme.lego.p.f107614a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.comment.ui.k.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(44839);
                }

                public final void run() {
                    if (!com.a.b.c.b(null, "aweme_comment_fragment_input_comment")) {
                        com.a.b.c.a((Context) null, "aweme_comment_fragment_input_comment");
                    }
                }
            }, 1000);
        }
        ah();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.b.c.a((Activity) getActivity(), (int) R.layout.i_);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z b(Comment comment, String str, String str2, int i2, int i3) {
        com.ss.android.ugc.aweme.comment.m.c.b(this.f72763b.getEnterFrom(), "delete");
        a(comment, str, str2, i2, i3);
        return z.f158842a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (r40 != null) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.aweme.comment.model.Comment r40, int r41, int r42, java.lang.String r43, boolean r44, java.lang.String r45) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.k.a(com.ss.android.ugc.aweme.comment.model.Comment, int, int, java.lang.String, boolean, java.lang.String):void");
    }
}
