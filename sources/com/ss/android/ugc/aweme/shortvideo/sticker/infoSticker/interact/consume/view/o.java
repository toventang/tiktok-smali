package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.views.ChallengeViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class o extends com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f130608f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    TabLayout f130609a;

    /* renamed from: b  reason: collision with root package name */
    public ChallengeViewPager f130610b;

    /* renamed from: c  reason: collision with root package name */
    PollStruct f130611c;

    /* renamed from: d  reason: collision with root package name */
    public b f130612d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.f f130613e;

    /* renamed from: g  reason: collision with root package name */
    private View f130614g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b f130615h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f130616i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f130617j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f130618k;

    public interface b {
        static {
            Covode.recordClassIndex(85642);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(85640);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static o a(PollStruct pollStruct) {
            List<PollStruct.OptionsBean> options;
            if (pollStruct == null || (options = pollStruct.getOptions()) == null || options.size() < 2) {
                return null;
            }
            o oVar = new o();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_poll", pollStruct);
            oVar.setArguments(bundle);
            return oVar;
        }
    }

    public static final class f implements TabLayout.c {
        static {
            Covode.recordClassIndex(85646);
        }

        f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void a(TabLayout.f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f52655f;
            } else {
                view = null;
            }
            q qVar = (q) view;
            if (qVar != null) {
                qVar.setSelect(true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void b(TabLayout.f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f52655f;
            } else {
                view = null;
            }
            q qVar = (q) view;
            if (qVar != null) {
                qVar.setSelect(false);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f130618k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f130620a;

        static {
            Covode.recordClassIndex(85644);
        }

        d(o oVar) {
            this.f130620a = oVar;
        }

        public final void run() {
            View view;
            String str;
            long j2;
            View view2;
            List<PollStruct.OptionsBean> options;
            PollStruct.OptionsBean optionsBean;
            List<PollStruct.OptionsBean> options2;
            PollStruct.OptionsBean optionsBean2;
            String optionText;
            List<PollStruct.OptionsBean> options3;
            PollStruct.OptionsBean optionsBean3;
            List<PollStruct.OptionsBean> options4;
            PollStruct.OptionsBean optionsBean4;
            o oVar = this.f130620a;
            ChallengeViewPager challengeViewPager = oVar.f130610b;
            if (challengeViewPager == null) {
                l.b();
            }
            int currentItem = challengeViewPager.getCurrentItem();
            if (oVar.getContext() != null) {
                TabLayout tabLayout = oVar.f130609a;
                if (tabLayout != null) {
                    tabLayout.setupWithViewPager(oVar.f130610b);
                }
                int i2 = 1;
                q qVar = new q(oVar.getContext(), true);
                qVar.setLayoutParams(new TableLayout.LayoutParams(-1, -1));
                qVar.setPadding(0, 0, 0, 0);
                TabLayout tabLayout2 = oVar.f130609a;
                if (tabLayout2 == null) {
                    l.b();
                }
                TabLayout.f tabAt = tabLayout2.getTabAt(0);
                if (tabAt != null) {
                    tabAt.a(qVar);
                }
                q qVar2 = new q(oVar.getContext(), false);
                qVar2.setLayoutParams(new TableLayout.LayoutParams(-1, -1));
                qVar2.setPadding(0, 0, 0, 0);
                TabLayout tabLayout3 = oVar.f130609a;
                if (tabLayout3 == null) {
                    l.b();
                }
                TabLayout.f tabAt2 = tabLayout3.getTabAt(1);
                if (tabAt2 != null) {
                    tabAt2.a(qVar2);
                }
                TabLayout tabLayout4 = oVar.f130609a;
                if (tabLayout4 == null) {
                    l.b();
                }
                tabLayout4.addOnTabSelectedListener(new f());
                TabLayout tabLayout5 = oVar.f130609a;
                if (tabLayout5 == null) {
                    l.b();
                }
                TabLayout.f tabAt3 = tabLayout5.getTabAt(0);
                View view3 = null;
                if (tabAt3 != null) {
                    view = tabAt3.f52655f;
                } else {
                    view = null;
                }
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                q qVar3 = (q) view;
                PollStruct pollStruct = oVar.f130611c;
                String str2 = "";
                if (pollStruct == null || (options4 = pollStruct.getOptions()) == null || (optionsBean4 = options4.get(0)) == null || (str = optionsBean4.getOptionText()) == null) {
                    str = str2;
                }
                PollStruct pollStruct2 = oVar.f130611c;
                long j3 = 0;
                if (pollStruct2 == null || (options3 = pollStruct2.getOptions()) == null || (optionsBean3 = options3.get(0)) == null) {
                    j2 = 0;
                } else {
                    j2 = optionsBean3.getPollCount();
                }
                qVar3.a(str, j2);
                TabLayout tabLayout6 = oVar.f130609a;
                if (tabLayout6 == null) {
                    l.b();
                }
                TabLayout.f tabAt4 = tabLayout6.getTabAt(1);
                if (tabAt4 != null) {
                    view2 = tabAt4.f52655f;
                } else {
                    view2 = null;
                }
                Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                q qVar4 = (q) view2;
                PollStruct pollStruct3 = oVar.f130611c;
                if (!(pollStruct3 == null || (options2 = pollStruct3.getOptions()) == null || (optionsBean2 = options2.get(1)) == null || (optionText = optionsBean2.getOptionText()) == null)) {
                    str2 = optionText;
                }
                PollStruct pollStruct4 = oVar.f130611c;
                if (!(pollStruct4 == null || (options = pollStruct4.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
                    j3 = optionsBean.getPollCount();
                }
                qVar4.a(str2, j3);
                TabLayout tabLayout7 = oVar.f130609a;
                if (tabLayout7 == null) {
                    l.b();
                }
                if (currentItem == 1) {
                    i2 = 0;
                }
                TabLayout.f tabAt5 = tabLayout7.getTabAt(i2);
                if (tabAt5 != null) {
                    view3 = tabAt5.f52655f;
                }
                Objects.requireNonNull(view3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollTabView");
                ((q) view3).setSelect(false);
                TabLayout tabLayout8 = oVar.f130609a;
                if (tabLayout8 == null) {
                    l.b();
                }
                tabLayout8.setSelectedTabIndicatorHeight(0);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f130621a;

        static {
            Covode.recordClassIndex(85645);
        }

        e(o oVar) {
            this.f130621a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130621a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        b bVar = this.f130612d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.z1);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.f130611c = (PollStruct) serializable;
    }

    @Override // androidx.fragment.app.d, com.google.android.material.bottomsheet.b, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.d, androidx.appcompat.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        onCreateDialog.setOnShowListener(new c(this));
        return onCreateDialog;
    }

    static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f130619a;

        static {
            Covode.recordClassIndex(85643);
        }

        c(o oVar) {
            this.f130619a = oVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ChallengeViewPager challengeViewPager = this.f130619a.f130610b;
            View view = challengeViewPager;
            while (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof CoordinatorLayout.e) || !(((CoordinatorLayout.e) layoutParams).f2100a instanceof ViewPagerBottomSheetBehavior)) {
                    ViewParent parent = view.getParent();
                    if (parent != null && (parent instanceof View)) {
                        view = (View) parent;
                    } else {
                        return;
                    }
                } else {
                    challengeViewPager.addOnPageChangeListener(new a.C3400a(challengeViewPager, view, (byte) 0));
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final void show(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        try {
            super.show(iVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j2;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.bjt, viewGroup, false);
        l.b(a2, "");
        this.f130614g = a2;
        if (a2 == null) {
            l.a("rootView");
        }
        this.f130609a = (TabLayout) a2.findViewById(R.id.ehm);
        View view = this.f130614g;
        if (view == null) {
            l.a("rootView");
        }
        this.f130610b = (ChallengeViewPager) view.findViewById(R.id.fk_);
        View view2 = this.f130614g;
        if (view2 == null) {
            l.a("rootView");
        }
        this.f130616i = (TextView) view2.findViewById(R.id.title);
        View view3 = this.f130614g;
        if (view3 == null) {
            l.a("rootView");
        }
        this.f130617j = (ImageView) view3.findViewById(R.id.bve);
        i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b bVar = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b(childFragmentManager);
        this.f130615h = bVar;
        bVar.f130302a.add(a.C3398a.a(0, this.f130611c));
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b bVar2 = this.f130615h;
        if (bVar2 == null) {
            l.b();
        }
        bVar2.f130302a.add(a.C3398a.a(1, this.f130611c));
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b bVar3 = this.f130615h;
        if (bVar3 == null) {
            l.b();
        }
        Fragment fragment = bVar3.f130302a.get(0);
        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
        ((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a) fragment).f130317b = this.f130613e;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b bVar4 = this.f130615h;
        if (bVar4 == null) {
            l.b();
        }
        Fragment fragment2 = bVar4.f130302a.get(1);
        Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
        ((com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.a) fragment2).f130317b = this.f130613e;
        ChallengeViewPager challengeViewPager = this.f130610b;
        if (challengeViewPager != null) {
            challengeViewPager.setPagingEnable(false);
        }
        ChallengeViewPager challengeViewPager2 = this.f130610b;
        if (challengeViewPager2 != null) {
            challengeViewPager2.setAdapter(this.f130615h);
        }
        TabLayout tabLayout = this.f130609a;
        if (tabLayout != null) {
            tabLayout.post(new d(this));
        }
        PollStruct pollStruct = this.f130611c;
        long j3 = 0;
        if (pollStruct == null || (options2 = pollStruct.getOptions()) == null || (optionsBean2 = options2.get(0)) == null) {
            j2 = 0;
        } else {
            j2 = optionsBean2.getPollCount();
        }
        PollStruct pollStruct2 = this.f130611c;
        if (!(pollStruct2 == null || (options = pollStruct2.getOptions()) == null || (optionsBean = options.get(1)) == null)) {
            j3 = optionsBean.getPollCount();
        }
        String a3 = com.ss.android.ugc.aweme.i18n.b.a(j2 + j3);
        TextView textView = this.f130616i;
        if (textView != null) {
            String string = getResources().getString(R.string.hdk);
            l.b(string, "");
            String a4 = com.a.a(string, Arrays.copyOf(new Object[]{a3}, 1));
            l.b(a4, "");
            textView.setText(a4);
        }
        ImageView imageView = this.f130617j;
        if (imageView != null) {
            imageView.setOnClickListener(new e(this));
        }
        View view4 = this.f130614g;
        if (view4 == null) {
            l.a("rootView");
        }
        return view4;
    }
}
