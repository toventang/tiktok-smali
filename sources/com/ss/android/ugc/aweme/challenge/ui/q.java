package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.google.gson.f;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commerce.challenge.a;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.h;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.views.ChallengeViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class q implements com.ss.android.ugc.aweme.challenge.service.d {

    /* renamed from: a  reason: collision with root package name */
    public Challenge f70188a;

    /* renamed from: b  reason: collision with root package name */
    public j f70189b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager f70190c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtTabLayout f70191d;

    /* renamed from: e  reason: collision with root package name */
    private final View f70192e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f70193f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f70194g;

    /* renamed from: h  reason: collision with root package name */
    private ChallengeDetail f70195h;

    /* renamed from: i  reason: collision with root package name */
    private g f70196i;

    static {
        Covode.recordClassIndex(43298);
    }

    public static final class a extends com.google.gson.b.a<g> {
        static {
            Covode.recordClassIndex(43299);
        }

        a() {
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.d
    public final void a() {
        this.f70191d.r.clear();
    }

    public final cr<com.ss.android.ugc.aweme.base.f.a> b() {
        PagerAdapter adapter = this.f70190c.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
        return (cr) adapter;
    }

    public static final class c implements DmtTabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f70198a;

        static {
            Covode.recordClassIndex(43301);
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void b(DmtTabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(q qVar) {
            this.f70198a = qVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
        public final void a(DmtTabLayout.f fVar) {
            String type;
            if (fVar != null) {
                int i2 = fVar.f33752e;
                q qVar = this.f70198a;
                if (i2 == 0) {
                    type = "output";
                } else {
                    Challenge challenge = qVar.f70188a;
                    if (challenge == null) {
                        l.a("mChallenge");
                    }
                    type = challenge.showItems.get(i2 - 1).getType();
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                Challenge challenge2 = qVar.f70188a;
                if (challenge2 == null) {
                    l.a("mChallenge");
                }
                r.a("change_inter_tag", dVar.a("tag_id", challenge2.getCid()).a("tag_name", type).f66730a);
            }
        }
    }

    static final class b implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f70197a;

        static {
            Covode.recordClassIndex(43300);
        }

        b(q qVar) {
            this.f70197a = qVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            l.b(fVar, "");
            fVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.d
    public final void a(float f2) {
        Fragment a2 = b().a(this.f70190c.getCurrentItem());
        if ((a2 instanceof com.ss.android.ugc.aweme.commerce.challenge.a) && f2 != 0.0f) {
            ((com.ss.android.ugc.aweme.commerce.challenge.a) a2).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.d
    public final void b(int i2) {
        Fragment a2 = b().a(this.f70190c.getCurrentItem());
        if ((a2 instanceof com.ss.android.ugc.aweme.commerce.challenge.a) && i2 != 0) {
            ((com.ss.android.ugc.aweme.commerce.challenge.a) a2).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.d
    public final boolean a(int i2) {
        if (i2 == R.id.e9v) {
            com.ss.android.ugc.aweme.commerce_sticker_api.service.a b2 = CommerceStickerServiceImpl.c().b();
            g gVar = this.f70196i;
            if (gVar != null && b2.a(gVar)) {
                b2.a(this.f70194g, this.f70196i, "challenge");
                return true;
            }
        }
        return false;
    }

    public static final class d extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f70199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f70200b;

        /* renamed from: c  reason: collision with root package name */
        private int f70201c;

        static {
            Covode.recordClassIndex(43302);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            Fragment a2 = this.f70199a.b().a(i2);
            if (!(a2 instanceof com.ss.android.ugc.aweme.commerce.challenge.a)) {
                a2 = null;
            }
            if (a2 != null) {
                Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                new Handler().postDelayed(new a.RunnableC1637a((com.ss.android.ugc.aweme.commerce.challenge.a) a2), 100);
            }
            Fragment a3 = this.f70199a.b().a(this.f70201c);
            if ((a3 instanceof com.ss.android.ugc.aweme.commerce.challenge.a) && a3 != null) {
                Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment");
                CommonBizWebView a4 = ((com.ss.android.ugc.aweme.commerce.challenge.a) a3).a();
                if (a4 != null) {
                    a4.a("brand_room_left", new JSONObject());
                }
            }
            this.f70201c = i2;
        }

        d(q qVar, z.c cVar) {
            this.f70199a = qVar;
            this.f70200b = cVar;
            this.f70201c = cVar.element;
        }
    }

    public q(View view, Fragment fragment) {
        l.d(view, "");
        l.d(fragment, "");
        View findViewById = view.findViewById(R.id.fk_);
        l.b(findViewById, "");
        this.f70190c = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(R.id.ehe);
        l.b(findViewById2, "");
        this.f70191d = (DmtTabLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.cu3);
        l.b(findViewById3, "");
        this.f70192e = findViewById3;
        this.f70193f = (ImageView) view.findViewById(R.id.e9z);
        Context context = view.getContext();
        l.b(context, "");
        this.f70194g = context;
        this.f70189b = (j) fragment;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.d
    public final void a(ChallengeDetail challengeDetail, int i2) {
        ImageView imageView;
        l.d(challengeDetail, "");
        this.f70195h = challengeDetail;
        Challenge challenge = challengeDetail.challenge;
        l.b(challenge, "");
        this.f70188a = challenge;
        try {
            f fVar = new f();
            Challenge challenge2 = this.f70188a;
            if (challenge2 == null) {
                l.a("mChallenge");
            }
            this.f70196i = (g) fVar.a(challenge2.getChallengeStickerDetail(), new a().type);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!(this.f70196i == null || !CommerceStickerServiceImpl.c().b().a(this.f70196i) || (imageView = this.f70193f) == null)) {
            imageView.setImageResource(2131233884);
        }
        Challenge challenge3 = this.f70188a;
        if (challenge3 == null) {
            l.a("mChallenge");
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) challenge3.showItems)) {
            this.f70191d.setVisibility(8);
            return;
        }
        ViewPager viewPager = this.f70190c;
        Objects.requireNonNull(viewPager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
        ((ChallengeViewPager) viewPager).setPagingEnable(true);
        this.f70190c.setOffscreenPageLimit(2);
        this.f70191d.setVisibility(0);
        this.f70192e.setVisibility(0);
        z.c cVar = new z.c();
        cVar.element = this.f70190c.getCurrentItem();
        h hVar = this.f70189b.g().get(0);
        Integer num = b().f117097c.get(0);
        T t = b().f117096b.get(0);
        l.b(t, "");
        t.x = true;
        List<h> g2 = this.f70189b.g();
        g2.clear();
        g2.add(hVar);
        List<T> list = b().f117096b;
        list.clear();
        list.add(t);
        List<Integer> list2 = b().f117097c;
        list2.clear();
        list2.add(num);
        Challenge challenge4 = this.f70188a;
        if (challenge4 == null) {
            l.a("mChallenge");
        }
        List<ShowItemsStruct> list3 = challenge4.showItems;
        l.b(list3, "");
        for (T t2 : list3) {
            com.ss.android.ugc.aweme.commerce.challenge.a aVar = new com.ss.android.ugc.aweme.commerce.challenge.a();
            aVar.f73405b = t2.getDesc();
            aVar.f73406c = t2.getSchema();
            Challenge challenge5 = this.f70188a;
            if (challenge5 == null) {
                l.a("mChallenge");
            }
            aVar.f73404a = challenge5.getCid();
            this.f70189b.g().add(aVar);
            b().f117096b.add(aVar);
            b().f117097c.add(Integer.valueOf(aVar.hashCode()));
        }
        Iterator<T> it = this.f70189b.g().iterator();
        while (it.hasNext()) {
            it.next().b(true);
        }
        b().notifyDataSetChanged();
        int size = b().f117096b.size();
        if (i2 >= 0 && size > i2) {
            cVar.element = i2;
        }
        this.f70191d.setupWithViewPager(this.f70190c);
        this.f70191d.setOnTabClickListener(new b(this));
        this.f70191d.a(new c(this));
        this.f70190c.setCurrentItem(cVar.element);
        this.f70190c.addOnPageChangeListener(new d(this, cVar));
        this.f70189b.onPageSelected(cVar.element);
    }
}
