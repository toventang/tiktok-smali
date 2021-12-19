package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.im.sdk.share.a.a;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.e;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: c  reason: collision with root package name */
    public static final C2626a f103404c = new C2626a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f103405a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f103406b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final h f103407d = i.a((h.f.a.a) b.f103410a);

    /* renamed from: e  reason: collision with root package name */
    private final SharePanelViewModel f103408e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.share.a.b f103409f;

    static {
        Covode.recordClassIndex(66265);
    }

    public final List<IMContact> a() {
        return (List) this.f103407d.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a$a  reason: collision with other inner class name */
    public static final class C2626a {
        static {
            Covode.recordClassIndex(66266);
        }

        private C2626a() {
        }

        public /* synthetic */ C2626a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<List<IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103410a = new b();

        static {
            Covode.recordClassIndex(66267);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return a().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        IMContact iMContact = a().get(i2);
        if (iMContact instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a) {
            return 2;
        }
        if (iMContact instanceof f) {
            return 3;
        }
        if (iMContact instanceof com.ss.android.ugc.aweme.social.c.a) {
            return 4;
        }
        return 1;
    }

    public a(SharePanelViewModel sharePanelViewModel, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        l.d(sharePanelViewModel, "");
        this.f103408e = sharePanelViewModel;
        this.f103409f = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        IMContact iMContact;
        int i3;
        float f2;
        l.d(viewHolder, "");
        if (viewHolder instanceof e) {
            e eVar = (e) viewHolder;
            IMContact iMContact2 = a().get(i2);
            l.d(iMContact2, "");
            eVar.f103468c = iMContact2;
            eVar.f103466a.setImageDrawable(d.a().getResources().getDrawable(eVar.f103467b));
            return;
        }
        boolean z = true;
        if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a aVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a) viewHolder;
            IMContact iMContact3 = a().get(i2);
            Objects.requireNonNull(iMContact3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMBatchGroup");
            f fVar = (f) iMContact3;
            l.d(fVar, "");
            if (fVar.getBatchContacts().isEmpty()) {
                aVar.e().setVisibility(8);
            } else if (fVar.getBatchContacts().size() == 1) {
                com.ss.android.ugc.aweme.base.e.a(aVar.a(), fVar.getBatchContacts().get(0).getDisplayAvatar());
                aVar.a().setVisibility(0);
                aVar.e().setVisibility(0);
                aVar.b().setVisibility(8);
                aVar.c().setVisibility(8);
                aVar.d().setVisibility(8);
            } else {
                com.ss.android.ugc.aweme.base.e.a(aVar.b(), fVar.getBatchContacts().get(0).getDisplayAvatar());
                com.ss.android.ugc.aweme.base.e.a(aVar.c(), fVar.getBatchContacts().get(1).getDisplayAvatar());
                aVar.a().setVisibility(8);
                aVar.e().setVisibility(0);
                aVar.b().setVisibility(0);
                aVar.c().setVisibility(0);
                aVar.d().setVisibility(0);
            }
            ((TextView) aVar.f103422a.getValue()).setText(fVar.getDisplayName());
            aVar.itemView.setOnClickListener(new a.c(aVar, fVar));
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(fVar, aVar.getBindingAdapterPosition(), "column", aVar.f103423b.f103597d, true, a.C2623a.f103354a);
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f fVar2 = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f) viewHolder;
            IMContact iMContact4 = a().get(i2);
            boolean contains = this.f103405a.contains(Integer.valueOf(i2));
            boolean contains2 = this.f103406b.contains(Integer.valueOf(i2));
            l.d(iMContact4, "");
            fVar2.f103476c = iMContact4;
            if (!(iMContact4 instanceof IMUser)) {
                iMContact = null;
            } else {
                iMContact = iMContact4;
            }
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser != null) {
                i3 = iMUser.getFollowStatus();
            } else {
                i3 = -1;
            }
            boolean z2 = !IMUser.isFriend(i3);
            if (!fVar2.f103479f.f103595b || !z2) {
                z = false;
            }
            fVar2.f103477d = z;
            TextView textView = fVar2.f103474a;
            String displayName = iMContact4.getDisplayName();
            if (displayName == null) {
                displayName = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.d.a("");
            }
            textView.setText(displayName);
            fVar2.b(contains);
            fVar2.a(contains2);
            View view = fVar2.itemView;
            l.b(view, "");
            if (fVar2.f103477d) {
                f2 = 0.34f;
            } else {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            com.ss.android.ugc.aweme.base.e.a(fVar2.f103475b, iMContact4.getDisplayAvatar());
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(iMContact4, i2, "column", fVar2.f103479f.f103597d, false, a.C2623a.f103354a);
            fVar2.f103478e.a(iMContact4, i2);
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d dVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d) viewHolder;
            IMContact iMContact5 = a().get(i2);
            Objects.requireNonNull(iMContact5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.social.model.MAFIMUser");
            com.ss.android.ugc.aweme.social.c.a aVar2 = (com.ss.android.ugc.aweme.social.c.a) iMContact5;
            l.d(aVar2, "");
            dVar.f103450a = aVar2;
            User a2 = com.ss.android.ugc.aweme.social.c.b.a(aVar2);
            AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) dVar.f103452c.getValue();
            avatarImageWithVerify.setUserData(new UserVerify(a2.getAvatarThumb(), a2.getCustomVerify(), a2.getEnterpriseVerifyReason(), Integer.valueOf(a2.getVerificationType())));
            avatarImageWithVerify.a();
            MutualRelationView mutualRelationView = (MutualRelationView) dVar.f103455f.getValue();
            TuxTextView tuxTextView = (TuxTextView) dVar.f103454e.getValue();
            mutualRelationView.setVisibility(8);
            tuxTextView.setVisibility(8);
            if (a2.getMutualStruct() != null) {
                mutualRelationView.setVisibility(0);
                tuxTextView.setVisibility(4);
                View view2 = dVar.itemView;
                l.b(view2, "");
                mutualRelationView.setTextColor(androidx.core.content.b.c(view2.getContext(), R.color.c5));
                mutualRelationView.a(a2.getMutualStruct(), com.ss.android.ugc.aweme.friends.e.d());
            } else if (hk.a(a2.getRecommendReason())) {
                tuxTextView.setVisibility(0);
                tuxTextView.setText(a2.getRecommendReason());
            }
            ((TuxTextView) dVar.f103453d.getValue()).setText(a2.getNickname());
            dVar.b().a(a2);
            dVar.itemView.setOnClickListener(dVar.a(a2));
            dVar.a().setOnClickListener(dVar.a(a2));
            dVar.f103451b.a(aVar2, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        l.d(viewHolder, "");
        l.d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i2, list);
        } else if (com.ss.android.ugc.aweme.im.service.c.e.c()) {
            if (!(viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f)) {
                viewHolder = null;
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f fVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f) viewHolder;
            if (fVar != null) {
                Object obj = list.get(0);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                fVar.a(((Boolean) obj).booleanValue());
            }
        } else if (com.ss.android.ugc.aweme.im.service.c.e.a()) {
            if (!(viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f)) {
                viewHolder = null;
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f fVar2 = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f) viewHolder;
            if (fVar2 != null) {
                Object obj2 = list.get(0);
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                fVar2.b(((Boolean) obj2).booleanValue());
            }
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(7359);
        l.d(viewGroup, "");
        if (i2 == 2) {
            SharePanelViewModel sharePanelViewModel = aVar.f103408e;
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8q, viewGroup, false);
            com.ss.android.ugc.aweme.im.service.m.a.b("LongPressShareListMoreContactViewHolder", "create(): itemView = ".concat(String.valueOf(a3)));
            l.b(a3, "");
            viewHolder = new e(a3, sharePanelViewModel);
        } else if (i2 == 3) {
            SharePanelViewModel sharePanelViewModel2 = aVar.f103408e;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel2, "");
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8o, viewGroup, false);
            l.b(a4, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a(a4, sharePanelViewModel2);
        } else if (i2 != 4) {
            SharePanelViewModel sharePanelViewModel3 = aVar.f103408e;
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = aVar.f103409f;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel3, "");
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8p, viewGroup, false);
            l.b(a5, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f(a5, sharePanelViewModel3, bVar);
        } else {
            SharePanelViewModel sharePanelViewModel4 = aVar.f103408e;
            com.ss.android.ugc.aweme.im.service.share.a.b bVar2 = aVar.f103409f;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel4, "");
            View a6 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a8n, viewGroup, false);
            l.b(a6, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d(a6, sharePanelViewModel4, bVar2);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(7359);
        return viewHolder;
    }
}
