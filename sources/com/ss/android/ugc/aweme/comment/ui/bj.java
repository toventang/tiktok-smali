package com.ss.android.ugc.aweme.comment.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ad;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.uikit.a.b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.comment.f.d;
import com.ss.android.ugc.aweme.comment.f.e;
import com.ss.android.ugc.aweme.comment.f.f;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.dc;
import com.ss.android.ugc.aweme.comment.util.k;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.story.d.a;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.p;
import h.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class bj extends b implements d, e {
    protected static long t;
    private View A;
    private Widget B;
    private ViewGroup C;
    private s<ag> D;
    private boolean E = false;
    private long F;
    private long G;
    private boolean H = false;

    /* renamed from: a  reason: collision with root package name */
    ViewPager f72579a;

    /* renamed from: b  reason: collision with root package name */
    public List<Fragment> f72580b;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f72581c;

    /* renamed from: d  reason: collision with root package name */
    protected ae f72582d;

    /* renamed from: e  reason: collision with root package name */
    protected DataCenter f72583e;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.comment.adapter.e f72584j;

    /* renamed from: k  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.arch.widgets.base.e f72585k;

    /* renamed from: l  reason: collision with root package name */
    protected h f72586l = new h("");

    /* renamed from: m  reason: collision with root package name */
    protected Aweme f72587m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public int q = -1;
    public long r;
    public String s = "";
    private CommentNestedLayout u;
    private ImageView v;
    private ImageView w;
    private TuxTextView x;
    private ViewGroup y;
    private DmtTabLayout z;

    static {
        Covode.recordClassIndex(44719);
    }

    public final void a(String str, int i2) {
        if (k() || h()) {
            r.a("enter_author_reaction_panel", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", a(str)).a("enter_from", this.f72586l.getEventType()).a("tab_name", a(i2)).a("group_id", this.f72586l.getAid()).a("story_type", a.d(this.f72587m) ? "story" : UGCMonitor.TYPE_POST).a("story_collection_id", a.b(this.f72587m)).a("vv_cnt", this.f72587m.getStatistics().getPlayCount()).f66730a);
        }
    }

    public final void a(String str, String str2, int i2, long j2) {
        if (k() || h()) {
            r.a("close_author_reaction_panel", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", a(str)).a("enter_from", this.f72586l.getEventType()).a("tab_name", a(i2)).a("group_id", this.f72586l.getAid()).a("duration", j2).a("exit_method", str2).a("story_type", a.d(this.f72587m) ? "story" : UGCMonitor.TYPE_POST).a("story_collection_id", a.b(this.f72587m)).a("vv_cnt", this.f72587m.getStatistics().getPlayCount()).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final void a(f fVar) {
        DmtTabLayout dmtTabLayout;
        int indexOf = this.f72580b.indexOf(fVar);
        if (indexOf >= 0 && (dmtTabLayout = this.z) != null) {
            dmtTabLayout.b(indexOf).a(fVar.d());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e, com.ss.android.ugc.aweme.comment.f.d
    public final boolean a() {
        CommentNestedLayout commentNestedLayout;
        return isVisible() && (commentNestedLayout = this.u) != null && commentNestedLayout.a();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(s<ag> sVar) {
        this.D = sVar;
        List<Fragment> list = this.f72580b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof d) {
                    ((d) fragment).a(sVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Comment comment, boolean z2) {
        List<Fragment> list = this.f72580b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof d) {
                    ((d) fragment).a(comment, z2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Comment comment) {
        List<Fragment> list = this.f72580b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof d) {
                    ((d) fragment).a(comment);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.d
    public final void a(Exception exc, int i2, Comment comment) {
        List<Fragment> list = this.f72580b;
        if (!(list == null || list.isEmpty())) {
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof d) {
                    ((d) fragment).a(exc, i2, comment);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final void b() {
        CommentNestedLayout commentNestedLayout = this.u;
        if (commentNestedLayout != null) {
            commentNestedLayout.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final boolean d() {
        CommentNestedLayout commentNestedLayout = this.u;
        if (commentNestedLayout == null || commentNestedLayout.f73000c == null || !commentNestedLayout.f73003f) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.arch.widgets.base.e eVar = this.f72585k;
        if (eVar != null) {
            eVar.b(this.B);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.F = System.currentTimeMillis();
    }

    private void g() {
        this.f72583e.a("comment_aweme_and_params", new p(this.f72587m, this.f72586l));
    }

    private boolean h() {
        Aweme aweme;
        if (!com.ss.android.ugc.aweme.experiment.f.a() || (aweme = this.f72587m) == null || a.d(aweme) || !in.a(this.f72587m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    private boolean k() {
        Aweme aweme = this.f72587m;
        if (aweme == null || !in.a(aweme.getAuthorUid()) || !a.d(this.f72587m)) {
            return false;
        }
        return true;
    }

    private void l() {
        if (h()) {
            if (r()) {
                o();
            }
        } else if (b(1)) {
            o();
        }
    }

    private void m() {
        if (i()) {
            if (q()) {
                o();
            }
        } else if (b(2)) {
            o();
        }
    }

    private void n() {
        if (j()) {
            if (p()) {
                o();
            }
        } else if (b(3)) {
            o();
        }
    }

    public final long e() {
        long j2;
        long currentTimeMillis = System.currentTimeMillis() - this.r;
        long j3 = this.G;
        if (currentTimeMillis > j3) {
            j2 = currentTimeMillis - j3;
        } else {
            j2 = 0;
        }
        this.r = 0;
        this.F = 0;
        this.G = 0;
        return j2;
    }

    private boolean i() {
        if (!((Boolean) com.ss.android.ugc.aweme.story.c.b.f136954b.getValue()).booleanValue() || !a.d(this.f72587m) || "story_archive".equals(this.f72586l.getEnterFrom()) || !in.a(this.f72587m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    private boolean j() {
        if (!((Boolean) com.ss.android.ugc.aweme.story.c.b.f136953a.getValue()).booleanValue() || !a.d(this.f72587m) || "story_archive".equals(this.f72586l.getEnterFrom()) || !in.a(this.f72587m.getAuthorUid())) {
            return false;
        }
        return true;
    }

    private boolean r() {
        if (this.f72581c.contains(1)) {
            return false;
        }
        this.f72580b.add(dc.a.a(requireActivity(), this.f72586l, this.f72587m, this));
        this.f72581c.add(1);
        com.ss.android.ugc.aweme.comment.adapter.e eVar = this.f72584j;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final void c() {
        if (this.u != null) {
            ae onShowHeightChangeListener = this.f72586l.getOnShowHeightChangeListener();
            this.f72582d = onShowHeightChangeListener;
            this.u.setOnShowHeightChangeListener(onShowHeightChangeListener);
            this.u.a(true, true);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.E) {
            this.E = false;
        } else if (a() && this.F != 0) {
            this.G += System.currentTimeMillis() - this.F;
            this.F = 0;
        }
    }

    private void o() {
        Iterator<Fragment> it = this.f72580b.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next instanceof f) {
                f fVar = (f) next;
                if (this.f72580b.size() == 1) {
                    z2 = true;
                }
                fVar.c(z2);
            }
        }
        if (this.f72580b.size() > 1) {
            this.z.setVisibility(0);
            this.z.setSelectedTabIndicatorHeight(n.a(2.0d));
            this.A.setVisibility(0);
            return;
        }
        this.z.setVisibility(8);
        this.A.setVisibility(8);
    }

    private boolean p() {
        if (this.f72581c.contains(3)) {
            return false;
        }
        com.ss.android.ugc.aweme.story.b b2 = g.f137757a.b(this.f72587m.getAid(), this.f72586l.getInsertVid());
        b2.b(this.f72587m);
        ((f) b2.a()).a(this.f72586l);
        ((f) b2.a()).a(this);
        this.f72580b.add(0, b2.a());
        this.f72581c.add(0, 3);
        com.ss.android.ugc.aweme.comment.adapter.e eVar = this.f72584j;
        if (eVar == null) {
            return true;
        }
        eVar.notifyDataSetChanged();
        return true;
    }

    private boolean q() {
        if (this.f72581c.contains(2)) {
            return false;
        }
        com.ss.android.ugc.aweme.story.b b2 = g.f137757a.b(this.f72587m.getAid());
        b2.b(this.f72587m);
        ((f) b2.a()).a(this.f72586l);
        ((f) b2.a()).a(this);
        this.f72580b.add(0, b2.a());
        this.f72581c.add(0, 2);
        com.ss.android.ugc.aweme.comment.adapter.e eVar = this.f72584j;
        if (eVar == null) {
            return true;
        }
        eVar.notifyDataSetChanged();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final void a(boolean z2) {
        CommentNestedLayout commentNestedLayout = this.u;
        if (commentNestedLayout != null) {
            commentNestedLayout.a(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.e
    public final void b(boolean z2) {
        int i2;
        ImageView imageView = this.v;
        if (imageView != null) {
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public static bj a(Context context) {
        androidx.fragment.app.e b2 = b(context);
        if (b2 == null) {
            return null;
        }
        Fragment a2 = b2.getSupportFragmentManager().a("comment_page");
        if (a2 instanceof bj) {
            return (bj) a2;
        }
        return null;
    }

    private static androidx.fragment.app.e b(Context context) {
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

    private static bj c(h hVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("id", hVar);
        bj bjVar = new bj();
        bjVar.setArguments(bundle);
        return bjVar;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f72586l = (h) arguments.getSerializable("id");
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        com.ss.android.ugc.aweme.comment.a.e.a("CommentListPageFragment onSaveInstanceState");
        bundle.putBoolean("should_remove", true);
        bundle.putSerializable("page_param", this.f72586l);
    }

    private String a(int i2) {
        List<Integer> list = this.f72581c;
        if (list != null && list.size() == 1) {
            i2 = 0;
        } else if (com.bytedance.common.utility.collection.b.a((Collection) this.f72581c) || i2 < 0 || i2 >= this.f72581c.size()) {
            return "";
        }
        return com.ss.android.ugc.aweme.comment.i.e.a(this.f72581c.get(i2).intValue());
    }

    private boolean b(int i2) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f72581c) && this.f72584j != null) {
            for (int i3 = 0; i3 < this.f72581c.size(); i3++) {
                if (this.f72581c.get(i3).intValue() == i2) {
                    this.f72581c.remove(i3);
                    this.f72580b.remove(i3);
                    this.f72584j.notifyDataSetChanged();
                    return true;
                }
            }
        }
        return false;
    }

    private String a(String str) {
        if (!TextUtils.isEmpty(str) || !TextUtils.equals(this.f72586l.getEventType(), "notification_page")) {
            return str;
        }
        return "click_notification";
    }

    private void c(boolean z2) {
        if (z2) {
            if (this.r == 0) {
                this.r = System.currentTimeMillis();
            }
            this.p = true;
            if (!this.o) {
                a(this.f72586l.getEnterMethod(), this.q);
                this.o = true;
            }
        } else if (this.r != 0) {
            this.p = false;
            a(this.f72586l.getEnterMethod(), "close", this.q, e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("should_remove", false);
            this.E = z2;
            if (z2) {
                a(false);
                getFragmentManager().a().a(this).c();
                return;
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof h) {
                this.f72586l = (h) serializable;
                this.f72587m = AwemeService.b().b(this.f72586l.getAid());
            }
        }
    }

    private void b(h hVar) {
        boolean z2;
        if (TextUtils.equals(hVar.getAid(), this.f72586l.getAid()) && hVar.isCommentClose() == this.f72586l.isCommentClose() && hVar.isCommentLimited() == this.f72586l.isCommentLimited() && hVar.isEnableComment() == this.f72586l.isEnableComment()) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(3, "CommentLog", "CommentListPageFragment: resetPageParam() => differentAweme = ".concat(String.valueOf(z2)));
        if (!z2) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, "CommentLog", "CommentListPageFragment: resetPageParam() => differentAweme = false, new aid = " + hVar.getAid());
            if (!TextUtils.equals(hVar.getEnterMethod(), this.f72586l.getEnterMethod())) {
                this.f72586l.setEnterMethod(hVar.getEnterMethod());
            }
            a(hVar);
            for (int i2 = 0; i2 < this.f72581c.size(); i2++) {
                if (this.f72580b.get(i2) instanceof d) {
                    ((f) this.f72580b.get(i2)).a(hVar);
                }
            }
            return;
        }
        this.f72586l = hVar;
        if (getContext() != null) {
            this.C.setVisibility(8);
        }
        l();
        m();
        n();
        if (this.f72586l.getLocatePageType() < 0) {
            this.f72586l.setLocatePageType(0);
        }
        a(this.f72586l);
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f72580b)) {
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof f) {
                    ((f) fragment).a(hVar);
                }
            }
        }
        g();
    }

    private void a(h hVar) {
        if (hVar != null && hVar.getLocatePageType() >= 0) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f72581c)) {
                int locatePageType = hVar.getLocatePageType();
                for (int i2 = 0; i2 < this.f72581c.size(); i2++) {
                    if (this.f72581c.get(i2).intValue() == locatePageType) {
                        if (this.f72579a != null && this.f72584j.getCount() > i2) {
                            this.o = false;
                            this.H = true;
                            this.f72579a.setCurrentItem(i2, false);
                            ((f) this.f72580b.get(i2)).a(true);
                            this.q = i2;
                            this.H = false;
                            return;
                        } else {
                            return;
                        }
                    }
                }
            } else if (this.f72579a != null && this.f72584j.getCount() > 0) {
                this.f72579a.setCurrentItem(0, false);
                ((f) this.f72580b.get(0)).a(true);
            }
        }
    }

    private void a(Aweme aweme) {
        if (this.f72587m != aweme) {
            this.f72587m = aweme;
            if (!com.bytedance.common.utility.collection.b.a((Collection) this.f72580b)) {
                for (Fragment fragment : this.f72580b) {
                    if (fragment instanceof f) {
                        ((f) fragment).a(aweme);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Boolean bool) {
        if (bool.booleanValue()) {
            if (getActivity() != null) {
                c.a(new com.ss.android.ugc.aweme.comment.c.e(1, getActivity().hashCode()));
            }
            List<Fragment> list = this.f72580b;
            if (list == null || list.isEmpty()) {
                return null;
            }
            for (Fragment fragment : this.f72580b) {
                if (fragment instanceof f) {
                    getActivity();
                    ((f) fragment).h();
                }
            }
            c(true);
            return null;
        }
        if (getActivity() != null) {
            c.a(new com.ss.android.ugc.aweme.comment.c.e(0, getActivity().hashCode()));
        }
        List<Fragment> list2 = this.f72580b;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        for (Fragment fragment2 : this.f72580b) {
            if (fragment2 instanceof f) {
                getActivity();
                ((f) fragment2).i();
            }
        }
        c(false);
        return null;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f72583e = DataCenter.a(androidx.lifecycle.ae.a(this, (ad.b) null), this);
        com.ss.android.ugc.aweme.arch.widgets.base.e a2 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, view);
        this.f72585k = a2;
        a2.a(this.f72583e);
        Widget b2 = AdCommentDependImpl.b().b(new bk(this));
        this.B = b2;
        this.f72585k.a(R.id.adc, b2);
        g();
        this.f72580b = new LinkedList();
        this.f72581c = new LinkedList();
        m();
        n();
        boolean z2 = true;
        if (!com.ss.android.ugc.aweme.story.c.b.j() || !a.d(this.f72587m) || !in.a(this.f72587m.getAuthorUid())) {
            if (this.f72580b.size() != 0 || h()) {
                z2 = false;
            }
            h hVar = this.f72586l;
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("id", hVar);
            bundle2.putBoolean("key_show_title", z2);
            k kVar = new k();
            kVar.setArguments(bundle2);
            kVar.b(this.f72587m);
            h hVar2 = this.f72586l;
            if (hVar2 != null) {
                kVar.f72763b = hVar2;
            }
            kVar.f72769l = this.w;
            kVar.f72770m = this.x;
            kVar.a(this);
            kVar.a(this.D);
            this.f72580b.add(kVar);
            this.f72581c.add(0);
        }
        l();
        o();
        com.ss.android.ugc.aweme.comment.adapter.e eVar = new com.ss.android.ugc.aweme.comment.adapter.e(getChildFragmentManager(), this.f72580b, this.f72581c);
        this.f72584j = eVar;
        this.f72579a.setAdapter(eVar);
        this.z.setupWithViewPager(this.f72579a);
        this.z.a(new DmtTabLayout.c() {
            /* class com.ss.android.ugc.aweme.comment.ui.bj.AnonymousClass1 */

            static {
                Covode.recordClassIndex(44720);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void b(DmtTabLayout.f fVar) {
                String str;
                String str2;
                new StringBuilder("onTabUnselected tab = ").append((Object) fVar.f33750c).append(", current tab type is ").append(bj.this.f72581c.get(fVar.f33752e));
                bj bjVar = bj.this;
                int intValue = bjVar.f72581c.get(fVar.f33752e).intValue();
                if (intValue == 2) {
                    str = "like_list";
                } else if (intValue != 3) {
                    str = "";
                } else {
                    str = "view_list";
                }
                bjVar.s = str;
                if (bj.this.r != 0) {
                    bj bjVar2 = bj.this;
                    if (bjVar2.n) {
                        str2 = "click_label";
                    } else {
                        str2 = "slide";
                    }
                    bjVar2.a(str2, "change_tab", fVar.f33752e, bj.this.e());
                }
                ((f) bj.this.f72580b.get(fVar.f33752e)).a(false);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void a(DmtTabLayout.f fVar) {
                String enterMethod;
                String enterFrom = bj.this.f72586l.getEnterFrom();
                new StringBuilder("onTabSelected tab = ").append((Object) fVar.f33750c).append(" enterFrom is = ").append(enterFrom).append(", enterMethod = ").append(bj.this.f72586l.getEnterMethod());
                bj.this.r = System.currentTimeMillis();
                bj bjVar = bj.this;
                if (!bjVar.p) {
                    enterMethod = bj.this.f72586l.getEnterMethod();
                } else if (bj.this.n) {
                    enterMethod = "click_label";
                } else {
                    enterMethod = "slide";
                }
                bjVar.a(enterMethod, fVar.f33752e);
                bj.this.q = fVar.f33752e;
                if (bj.this.f72580b.get(fVar.f33752e) instanceof k) {
                    ((k) bj.this.f72580b.get(fVar.f33752e)).f72763b.setTempEnterMethod(bj.this.s);
                }
                ((f) bj.this.f72580b.get(fVar.f33752e)).a(true);
                bj.this.n = false;
                bj.this.o = true;
            }
        });
        this.z.setOnTabClickListener(new bp(this));
        a(this.f72586l);
        c();
    }

    public static bj a(Activity activity, Aweme aweme, h hVar) {
        if (!(activity == null || aweme == null || activity.isFinishing())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - t <= 300) {
                com.ss.android.ugc.aweme.framework.a.a.a(6, "CommentLog", "CommentListPageFragment: showCommentList(): cancel because open again too fast");
                return null;
            }
            t = elapsedRealtime;
            com.ss.android.ugc.aweme.framework.a.a.b(4, "CommentLog", "CommentListPageFragment: showCommentList() aid = " + aweme.getAid());
            try {
                boolean c2 = MSAdaptionService.c().c(activity);
                Fragment a2 = MSAdaptionService.c().a();
                if (!c2 || a2 == null) {
                    i supportFragmentManager = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
                    bj bjVar = (bj) supportFragmentManager.a("comment_page");
                    if (bjVar == null) {
                        k.a(true, hVar.getEventType(), k.a(aweme, hVar));
                        bj c3 = c(hVar);
                        c3.a(aweme);
                        supportFragmentManager.a().a(R.id.bcd, c3, "comment_page").c();
                        return c3;
                    }
                    k.a(false, hVar.getEventType(), k.a(aweme, hVar));
                    bjVar.a(aweme);
                    bjVar.b(hVar);
                    bjVar.c();
                    return bjVar;
                }
                i fragmentManager = a2.getFragmentManager();
                bj bjVar2 = (bj) fragmentManager.a("comment_page");
                if (bjVar2 != null) {
                    fragmentManager.a().a(bjVar2).c();
                }
                k.a(true, hVar.getEventType(), k.a(aweme, hVar));
                bj c4 = c(hVar);
                c4.a(aweme);
                fragmentManager.a().a(R.id.b4z, c4, "comment_page").c();
                return c4;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.comment.a.e.a("CommentListFragment.showCommentList() error in try/catch. ErrorMessage: " + e2.getMessage());
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.ia, viewGroup, false);
        this.u = (CommentNestedLayout) a2.findViewById(R.id.dqk);
        this.f72579a = (ViewPager) a2.findViewById(R.id.dpg);
        this.y = (ViewGroup) a2.findViewById(R.id.b4w);
        this.A = a2.findViewById(R.id.flh);
        this.v = (ImageView) a2.findViewById(R.id.qb);
        this.w = (ImageView) a2.findViewById(R.id.rv);
        this.x = (TuxTextView) a2.findViewById(R.id.rz);
        DmtTabLayout dmtTabLayout = (DmtTabLayout) a2.findViewById(R.id.ehe);
        this.z = dmtTabLayout;
        dmtTabLayout.setTabMargin(12);
        this.C = (ViewGroup) a2.findViewById(R.id.adc);
        this.f72579a.setOffscreenPageLimit(3);
        this.u.setCommentContainer(this.f72579a);
        this.u.setScrollableContainer(new bl(this));
        this.u.setVisibleChangedListener(new bm(this));
        this.u.setPreScrollChangeListener(new bn(this));
        this.v.setOnClickListener(new bo(this));
        return a2;
    }
}
