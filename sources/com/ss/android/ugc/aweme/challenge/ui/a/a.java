package com.ss.android.ugc.aweme.challenge.ui.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.challenge.ui.a.a.b;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.y.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a extends FrameLayout implements i, j {

    /* renamed from: g  reason: collision with root package name */
    public static final C1587a f70031g = new C1587a((byte) 0);
    private final List<l> A = new ArrayList();
    private final j B;
    private ChallengeDetailViewModel C;
    private final u<p<Integer, com.ss.android.ugc.aweme.challenge.g.a>> D;
    private final c E;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f70032a;

    /* renamed from: b  reason: collision with root package name */
    protected SmartImageView f70033b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f70034c;

    /* renamed from: d  reason: collision with root package name */
    public ViewStub f70035d;

    /* renamed from: e  reason: collision with root package name */
    protected ChallengeDetail f70036e;

    /* renamed from: f  reason: collision with root package name */
    protected Challenge f70037f;

    /* renamed from: h  reason: collision with root package name */
    private final String f70038h = "AbsCommonHeaderView";

    /* renamed from: i  reason: collision with root package name */
    private View f70039i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f70040j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f70041k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f70042l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f70043m;
    private ViewStub n;
    private View o;
    private TextView p;
    private RecyclerView q;
    private ViewStub r;
    private View s;
    private View t;
    private TextView u;
    private RecyclerView v;
    private com.ss.android.ugc.aweme.challenge.ui.a.a.a w;
    private FrameLayout x;
    private SmartImageView y;
    private View z;

    static {
        Covode.recordClassIndex(43204);
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public abstract int getAttrsResId();

    /* access modifiers changed from: protected */
    public abstract int getButtonResId();

    /* access modifiers changed from: protected */
    public abstract int getLayoutResId();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new g(a.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$a  reason: collision with other inner class name */
    public static final class C1587a {
        static {
            Covode.recordClassIndex(43205);
        }

        private C1587a() {
        }

        public /* synthetic */ C1587a(byte b2) {
            this();
        }

        public static boolean a(ChallengeDetail challengeDetail) {
            ChallengeTransform transfrom;
            l.d(challengeDetail, "");
            Challenge challenge = challengeDetail.challenge;
            if (challenge == null || (transfrom = challenge.getTransfrom()) == null || !b.a(transfrom.getText()) || !b.a(transfrom.getAction())) {
                return false;
            }
            return true;
        }
    }

    public static final class f extends RecyclerView.h {
        static {
            Covode.recordClassIndex(43210);
        }

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
            l.d(rect, "");
            l.d(view, "");
            l.d(recyclerView, "");
            l.d(sVar, "");
            int d2 = RecyclerView.d(view);
            if (d2 == 0) {
                rect.left = n.a(16.0d);
            }
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                l.b();
            }
            l.b(adapter, "");
            if (d2 == adapter.getItemCount() - 1) {
                rect.right = n.a(16.0d);
            } else {
                rect.right = n.a(4.0d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final View getMDescContainer() {
        return this.f70039i;
    }

    /* access modifiers changed from: protected */
    public final TextView getMDescTv() {
        return this.f70040j;
    }

    /* access modifiers changed from: protected */
    public final ImageView getMExpandIv() {
        return this.f70043m;
    }

    /* access modifiers changed from: protected */
    public final TextView getMExpandTv() {
        return this.f70042l;
    }

    /* access modifiers changed from: protected */
    public final j getMHeaderParam() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetailViewModel getMViewModel() {
        return this.C;
    }

    public final String getTag() {
        return this.f70038h;
    }

    public final ChallengeDetailParam getDetailParam() {
        return this.B.f70088f;
    }

    public final androidx.fragment.app.e getActivity() {
        Activity d2 = o.d(this);
        if (!(d2 instanceof androidx.fragment.app.e)) {
            d2 = null;
        }
        return (androidx.fragment.app.e) d2;
    }

    public final int getAvatarContainerHight() {
        SmartImageView smartImageView = this.f70033b;
        if (smartImageView == null) {
            l.a("mAvatar");
        }
        return smartImageView.getHeight();
    }

    /* access modifiers changed from: protected */
    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.f70033b;
        if (smartImageView == null) {
            l.a("mAvatar");
        }
        return smartImageView;
    }

    /* access modifiers changed from: protected */
    public final Challenge getMChallenge() {
        Challenge challenge = this.f70037f;
        if (challenge == null) {
            l.a("mChallenge");
        }
        return challenge;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.f70036e;
        if (challengeDetail == null) {
            l.a("mChallengeDetail");
        }
        return challengeDetail;
    }

    public final ViewStub getMDescContainerVs() {
        ViewStub viewStub = this.f70035d;
        if (viewStub == null) {
            l.a("mDescContainerVs");
        }
        return viewStub;
    }

    public final LinearLayout getMHeaderContainer() {
        LinearLayout linearLayout = this.f70032a;
        if (linearLayout == null) {
            l.a("mHeaderContainer");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final TextView getMTitle() {
        TextView textView = this.f70034c;
        if (textView == null) {
            l.a("mTitle");
        }
        return textView;
    }

    public final void c() {
        com.ss.android.ugc.aweme.arch.widgets.base.c<p<Integer, com.ss.android.ugc.aweme.challenge.g.a>> cVar;
        p<Integer, com.ss.android.ugc.aweme.challenge.g.a> value;
        com.ss.android.ugc.aweme.challenge.g.a second;
        ChallengeDetailViewModel challengeDetailViewModel = this.C;
        if (challengeDetailViewModel != null && (cVar = challengeDetailViewModel.f70246b) != null && (value = cVar.getValue()) != null && (second = value.getSecond()) != null) {
            ChallengeDetail challengeDetail = this.f70036e;
            if (challengeDetail == null) {
                l.a("mChallengeDetail");
            }
            second.a(challengeDetail.slideList);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.a(EventBus.a(), this);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        ChallengeDetailViewModel a2 = ChallengeDetailViewModel.a.a(activity);
        this.C = a2;
        if (a2 == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.arch.widgets.base.c<p<Integer, com.ss.android.ugc.aweme.challenge.g.a>> cVar = a2.f70246b;
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            l.b();
        }
        cVar.observe(activity2, this.D);
        c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.a().b(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.C;
        if (challengeDetailViewModel == null) {
            l.b();
        }
        challengeDetailViewModel.f70246b.removeObserver(this.D);
        this.C = null;
        Iterator<T> it = this.A.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void b() {
        View findViewById = findViewById(R.id.bf9);
        l.b(findViewById, "");
        this.f70032a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.or);
        l.b(findViewById2, "");
        this.f70033b = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.title);
        l.b(findViewById3, "");
        this.f70034c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.fl0);
        l.b(findViewById4, "");
        this.f70035d = (ViewStub) findViewById4;
        View findViewById5 = findViewById(R.id.fla);
        l.b(findViewById5, "");
        this.n = (ViewStub) findViewById5;
        View findViewById6 = findViewById(R.id.fl2);
        l.b(findViewById6, "");
        this.r = (ViewStub) findViewById6;
        View findViewById7 = findViewById(R.id.w9);
        l.b(findViewById7, "");
        this.z = findViewById7;
        Iterator<T> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.B);
        }
    }

    public final void d() {
        View view = this.z;
        if (view == null) {
            l.a("mBottomSpace");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout linearLayout = this.f70032a;
        if (linearLayout == null) {
            l.a("mHeaderContainer");
        }
        for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            LinearLayout linearLayout2 = this.f70032a;
            if (linearLayout2 == null) {
                l.a("mHeaderContainer");
            }
            View childAt = linearLayout2.getChildAt(childCount);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup != null) {
                int id = viewGroup.getId();
                if (id == R.id.p4 || id == R.id.e5t) {
                    layoutParams.height = n.a(32.0d);
                    return;
                }
                if (id != R.id.akc) {
                    CommerceChallengeServiceImpl.e();
                    if (id != R.id.ab3) {
                        return;
                    }
                }
                layoutParams.height = n.a(23.0d);
                return;
            }
        }
    }

    private final void e() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ChallengeDetail challengeDetail = this.f70036e;
        if (challengeDetail == null) {
            l.a("mChallengeDetail");
        }
        List<RelatedChallengeMusic> list = challengeDetail.relatedChallengeMusicList;
        l.b(list, "");
        for (T t2 : list) {
            l.b(t2, "");
            if (t2.categoryType == 1 && t2.music != null) {
                Music music = t2.music;
                l.b(music, "");
                sb.append(music.getMid()).append(",");
            } else if (t2.categoryType == 2 && t2.challenge != null) {
                Challenge challenge = t2.challenge;
                l.b(challenge, "");
                sb2.append(challenge.getCid()).append(",");
            }
        }
        h.m.p.a((CharSequence) sb, (CharSequence) ",");
        h.m.p.a((CharSequence) sb2, (CharSequence) ",");
        if (TextUtils.equals(this.B.f70086d, "from_related_tag")) {
            Challenge challenge2 = this.f70037f;
            if (challenge2 == null) {
                l.a("mChallenge");
            }
            str2 = challenge2.getCid();
            l.b(str2, "");
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
            jSONObject2.put("music", sb.toString());
            jSONObject2.put("challenge", sb2.toString());
            jSONObject.put("related", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        MobClick labelName = MobClick.obtain().setEventName("extend_challenge").setLabelName("challenge");
        Challenge challenge3 = this.f70037f;
        if (challenge3 == null) {
            l.a("mChallenge");
        }
        r.onEvent(labelName.setValue(challenge3.getCid()).setJsonObject(jSONObject));
    }

    /* access modifiers changed from: protected */
    public final void setMDescContainer(View view) {
        this.f70039i = view;
    }

    /* access modifiers changed from: protected */
    public final void setMDescTv(TextView textView) {
        this.f70040j = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMExpandIv(ImageView imageView) {
        this.f70043m = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setMExpandTv(TextView textView) {
        this.f70042l = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.C = challengeDetailViewModel;
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f70051a;

        static {
            Covode.recordClassIndex(43206);
        }

        b(a aVar) {
            this.f70051a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f70051a.c();
        }
    }

    public static final class c implements b.AbstractC1588b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f70053a;

        static {
            Covode.recordClassIndex(43207);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f70053a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.challenge.ui.a.a.b.AbstractC1588b
        public final void a(Aweme aweme) {
            com.ss.android.ugc.aweme.arch.widgets.base.c<p<Integer, com.ss.android.ugc.aweme.challenge.g.a>> cVar;
            p<Integer, com.ss.android.ugc.aweme.challenge.g.a> value;
            com.ss.android.ugc.aweme.challenge.g.a second;
            l.d(aweme, "");
            ChallengeDetailViewModel mViewModel = this.f70053a.getMViewModel();
            if (mViewModel != null && (cVar = mViewModel.f70246b) != null && (value = cVar.getValue()) != null && (second = value.getSecond()) != null) {
                ae.f95296a = second;
                t.a(t.a(), this.f70053a.getActivity(), com.ss.android.ugc.aweme.ck.u.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", "challenge").a("video_from", "from_challenge").a("challenge_id", this.f70053a.getMChallenge().getCid()).a("video_type", 2).a("profile_enterprise_type", aweme.getEnterpriseType()).a());
                com.ss.android.ugc.aweme.feed.d.b.a(aweme);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMAvatar(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        this.f70033b = smartImageView;
    }

    /* access modifiers changed from: protected */
    public final void setMChallenge(Challenge challenge) {
        l.d(challenge, "");
        this.f70037f = challenge;
    }

    /* access modifiers changed from: protected */
    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        l.d(challengeDetail, "");
        this.f70036e = challengeDetail;
    }

    public final void setMDescContainerVs(ViewStub viewStub) {
        l.d(viewStub, "");
        this.f70035d = viewStub;
    }

    public final void setMHeaderContainer(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f70032a = linearLayout;
    }

    /* access modifiers changed from: protected */
    public final void setMTitle(TextView textView) {
        l.d(textView, "");
        this.f70034c = textView;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f70056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f70057b;

        static {
            Covode.recordClassIndex(43209);
        }

        e(a aVar, String str) {
            this.f70056a = aVar;
            this.f70057b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f70056a.a(this.f70057b);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(l lVar) {
        l.d(lVar, "");
        this.A.add(lVar);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f70054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.y.c f70055b;

        static {
            Covode.recordClassIndex(43208);
        }

        d(a aVar, com.ss.android.ugc.aweme.y.c cVar) {
            this.f70054a = aVar;
            this.f70055b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IChallengeDetailLegacyService a2 = ChallengeDetailLegacyServiceImpl.a();
            Context context = this.f70054a.getContext();
            c.b bVar = this.f70055b.s;
            l.b(bVar, "");
            a2.a(context, bVar.f145316b);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        l.d(jVar, "");
        if (TextUtils.equals("challenge", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            Context context = getContext();
            SmartImageView smartImageView = this.f70033b;
            if (smartImageView == null) {
                l.a("mAvatar");
            }
            createIIMServicebyMonsterPlugin.showIMSnackbar(context, smartImageView, jVar);
        }
    }

    public final void setHeaderAlpha(float f2) {
        LinearLayout linearLayout = this.f70032a;
        if (linearLayout == null) {
            l.a("mHeaderContainer");
        }
        linearLayout.setAlpha(1.0f - f2);
        Iterator<T> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().a(f2);
        }
    }

    public final void a(String str) {
        String str2 = this.B.f70087e;
        Challenge challenge = this.f70037f;
        if (challenge == null) {
            l.a("mChallenge");
        }
        r.a("tag_detail_click_icon", new com.ss.android.ugc.aweme.app.f.d().a("process_id", str2).a("tag_id", challenge.getCid()).f66730a);
        IChallengeDetailLegacyService a2 = ChallengeDetailLegacyServiceImpl.a();
        androidx.fragment.app.e activity = getActivity();
        ap apVar = new ap();
        SmartImageView smartImageView = this.f70033b;
        if (smartImageView == null) {
            l.a("mAvatar");
        }
        ap a3 = apVar.a("extra_zoom_info", ZoomAnimationUtils.a(smartImageView));
        a3.f142646a.putFloat("wh_ratio", 0.1f);
        ap a4 = a3.a("enable_download_img", false);
        Challenge challenge2 = this.f70037f;
        if (challenge2 == null) {
            l.a("mChallenge");
        }
        ap a5 = a4.a("challenge_info", challenge2).a("process_id", this.B.f70087e);
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            str = new Uri.Builder().scheme("res").path("2131233140").build().toString();
        }
        strArr[0] = str;
        a2.a(activity, a5.a("uri", strArr).f142646a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023a A[LOOP:0: B:92:0x0234->B:94:0x023a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r28) {
        /*
        // Method dump skipped, instructions count: 1503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.a.a.a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, j jVar, AttributeSet attributeSet) {
        super(context, null);
        l.d(context, "");
        if (jVar == null) {
            l.b();
        }
        this.B = jVar;
        com.a.a(LayoutInflater.from(context), getLayoutResId(), this, true);
        a();
        b();
        this.D = new b(this);
        this.E = new c(this);
    }
}
