package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.f;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.GroupListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.IndexCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C2591a f102737b = new C2591a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    GroupListViewModel f102738a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f102739c;

    static {
        Covode.recordClassIndex(65816);
    }

    public final View a(int i2) {
        if (this.f102739c == null) {
            this.f102739c = new HashMap();
        }
        View view = (View) this.f102739c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f102739c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2591a {
        static {
            Covode.recordClassIndex(65817);
        }

        private C2591a() {
        }

        public /* synthetic */ C2591a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f102739c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Fragment fragment = this.this$0;
            i fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                if (fragmentManager.e() > 0) {
                    com.ss.android.ugc.aweme.im.service.m.a.c("GroupListFragment", "poping backstack");
                    fragmentManager.c();
                } else {
                    com.ss.android.ugc.aweme.im.service.m.a.c("GroupListFragment", "nothing in backstack");
                    fragmentManager.a().a(fragment).b();
                }
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f102742a = new e();

        static {
            Covode.recordClassIndex(65821);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_group;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102741a;

        static {
            Covode.recordClassIndex(65820);
        }

        d(a aVar) {
            this.f102741a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            IMConversation iMConversation = (IMConversation) obj;
            a aVar = this.f102741a;
            l.b(iMConversation, "");
            ChatRoomActivity.a.a(a.b.a(aVar.getContext(), iMConversation).b("existed_group").f103883a);
            androidx.fragment.app.e activity = aVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = ae.a(this, (ad.b) null).a(GroupListViewModel.class);
        l.b(a2, "");
        GroupListViewModel groupListViewModel = (GroupListViewModel) a2;
        groupListViewModel.f102776b.observe(this, new c(this));
        groupListViewModel.f102777c.observe(this, new d(this));
        this.f102738a = groupListViewModel;
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102740a;

        static {
            Covode.recordClassIndex(65819);
        }

        c(a aVar) {
            this.f102740a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f102740a;
            GroupListViewModel groupListViewModel = aVar.f102738a;
            if (groupListViewModel == null) {
                l.a("mViewModel");
            }
            List k2 = n.k(groupListViewModel.f102775a);
            if (!(!k2.isEmpty())) {
                k2 = null;
            }
            if (k2 != null) {
                PowerList powerList = (PowerList) aVar.a(R.id.bdb);
                l.b(powerList, "");
                f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
                state.a();
                int i2 = 0;
                for (T t : k2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (i2 == 0 || (!l.a((Object) t2.getInitialLetter(), (Object) ((IMConversation) k2.get(i2 - 1)).getInitialLetter()))) {
                        String initialLetter = t2.getInitialLetter();
                        l.b(initialLetter, "");
                        state.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.e(initialLetter));
                    }
                    state.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.c(t2));
                    i2 = i3;
                }
            } else {
                TuxStatusView tuxStatusView = (TuxStatusView) aVar.a(R.id.e_o);
                l.b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(e.f102742a));
                String string = aVar.getString(R.string.c8s);
                l.b(string, "");
                TuxStatusView.c a3 = a2.a(string);
                String string2 = aVar.getString(R.string.c8t);
                l.b(string2, "");
                ((TuxStatusView) aVar.a(R.id.e_o)).setStatus(a3.a((CharSequence) string2));
            }
            TuxDualBallView tuxDualBallView = (TuxDualBallView) aVar.a(R.id.ci9);
            l.b(tuxDualBallView, "");
            if (tuxDualBallView.getVisibility() == 0) {
                tuxDualBallView.c();
                tuxDualBallView.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().setupStatusBar(getActivity());
        TuxNavBar.a a2 = new TuxNavBar.a().a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new b(this)));
        g gVar = new g();
        String string = getString(R.string.c8r);
        l.b(string, "");
        TuxNavBar.a a3 = a2.a(gVar.a(string));
        a3.f45188d = true;
        ((TuxNavBar) a(R.id.csl)).setNavActions(a3);
        ((TuxDualBallView) a(R.id.ci9)).b();
        PowerList powerList = (PowerList) a(R.id.bdb);
        powerList.a(IndexCell.class, GroupListCell.class);
        GroupListViewModel groupListViewModel = this.f102738a;
        if (groupListViewModel == null) {
            l.a("mViewModel");
        }
        powerList.a(groupListViewModel.a());
        powerList.getState().a();
        GroupListViewModel groupListViewModel2 = this.f102738a;
        if (groupListViewModel2 == null) {
            l.a("mViewModel");
        }
        groupListViewModel2.a().f34367c.e();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4t, viewGroup, false);
    }
}
