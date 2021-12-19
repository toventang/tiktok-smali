package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.share.a.a;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f103411a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f103412b = i.a((h.f.a.a) C2627b.f103414a);

    /* renamed from: c  reason: collision with root package name */
    private final SharePanelViewModel f103413c;

    static {
        Covode.recordClassIndex(66268);
    }

    private final List<IMContact> a() {
        return (List) this.f103412b.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66269);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b$b  reason: collision with other inner class name */
    static final class C2627b extends m implements h.f.a.a<List<IMContact>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2627b f103414a = new C2627b();

        static {
            Covode.recordClassIndex(66270);
        }

        C2627b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return a().size();
    }

    public b(SharePanelViewModel sharePanelViewModel) {
        l.d(sharePanelViewModel, "");
        this.f103413c = sharePanelViewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        IMContact iMContact = a().get(i2);
        if (iMContact instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a) {
            return 2;
        }
        if (iMContact instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.b.a) {
            return 3;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i iVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i) viewHolder;
        if (iVar != null) {
            iVar.f103504f = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        String second;
        String uid;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        IMUser iMUser = null;
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i iVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i) viewHolder;
        if (iVar != null) {
            int i2 = 1;
            iVar.f103504f = true;
            p<Boolean, String> pVar = iVar.f103505g;
            if (!(pVar == null || (second = pVar.getSecond()) == null || second.length() == 0)) {
                IMContact iMContact = iVar.f103501c;
                if (iMContact instanceof IMUser) {
                    iMUser = iMContact;
                }
                IMUser iMUser2 = iMUser;
                if (!(iMUser2 == null || (uid = iMUser2.getUid()) == null || iVar.f103508j.c().contains(uid))) {
                    boolean booleanValue = pVar.getFirst().booleanValue();
                    String second2 = pVar.getSecond();
                    l.d("share_head_online_status_show", "");
                    JSONObject jSONObject = new JSONObject();
                    if (!booleanValue) {
                        i2 = 0;
                    }
                    try {
                        jSONObject.put("online_dot", i2);
                        jSONObject.put("online_status", second2);
                        jSONObject.put("to_user_id", uid);
                    } catch (Throwable unused) {
                    }
                    r.a("share_head_online_status_show", jSONObject);
                    iVar.f103508j.c().add(uid);
                }
            }
            IMContact iMContact2 = iVar.f103501c;
            if (iMContact2 instanceof com.ss.android.ugc.aweme.social.c.a) {
                SharePanelViewModel sharePanelViewModel = iVar.f103508j;
                IMUser iMUser3 = (IMUser) iMContact2;
                l.d(iMUser3, "");
                if (!sharePanelViewModel.f103602i.contains(iMUser3.getUid())) {
                    Set<String> set = sharePanelViewModel.f103602i;
                    String uid2 = iMUser3.getUid();
                    l.b(uid2, "");
                    set.add(uid2);
                    String uid3 = iMUser3.getUid();
                    l.b(uid3, "");
                    com.ss.android.ugc.aweme.im.sdk.share.a.a.a("horizontal", "show", uid3);
                    return;
                }
                return;
            }
            IMContact iMContact3 = iVar.f103501c;
            if (iMContact3 != null) {
                com.ss.android.ugc.aweme.im.sdk.share.a.a.a(iMContact3, iVar.f103502d, "row", iVar.f103508j.f103597d, false, a.C2623a.f103354a);
            }
        }
    }

    public final void a(List<? extends IMContact> list) {
        StringBuilder sb = new StringBuilder("setData: ");
        Integer num = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelHeadAdapter", sb.append(num).toString());
        List<IMContact> a2 = a();
        if (!(list == null || list.isEmpty() || a2 == null)) {
            a2.clear();
            if (this.f103413c.f()) {
                a2.add(new com.ss.android.ugc.aweme.im.sdk.share.panel.b.a(com.ss.android.ugc.aweme.im.sdk.b.a.a().getBoolean("has_upvote_bounce_shown_" + com.ss.android.ugc.aweme.im.sdk.b.a.b(), false)));
            }
            if (list == null) {
                l.b();
            }
            a2.addAll(list);
            a2.add(new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a());
            notifyDataSetChanged();
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("SharePanelHeadAdapter", "setData finish: " + a().size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        IMContact iMContact;
        String str;
        T t;
        int i3;
        String str2;
        Bundle bundle;
        List<String> urlList;
        boolean z;
        l.d(viewHolder, "");
        if (viewHolder instanceof g) {
            g gVar = (g) viewHolder;
            IMContact iMContact2 = a().get(i2);
            l.d(iMContact2, "");
            gVar.f103488c = iMContact2;
            gVar.f103486a.setImageDrawable(d.a().getResources().getDrawable(gVar.f103487b));
            return;
        }
        float f2 = 0.34f;
        boolean z2 = false;
        if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i iVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i) viewHolder;
            IMContact iMContact3 = a().get(i2);
            l.d(iMContact3, "");
            iVar.f103501c = iMContact3;
            iVar.f103502d = i2;
            iVar.f103505g = null;
            iVar.a(iVar.f103508j.b().contains(iMContact3));
            i.d dVar = new i.d(iVar);
            iVar.f103505g = null;
            dVar.a(2);
            boolean z3 = iMContact3 instanceof IMUser;
            if (z3) {
                IMUser iMUser = (IMUser) iMContact3;
                iVar.a(iMUser);
                e.a(iVar.f103500b, iMUser.getDisplayAvatar());
            } else if (iMContact3 instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) iMContact3;
                iVar.a(iMConversation);
                UrlModel displayAvatar = iMConversation.getDisplayAvatar();
                if (!(displayAvatar == null || (urlList = displayAvatar.getUrlList()) == null || urlList.isEmpty() || displayAvatar == null)) {
                    e.a(iVar.f103500b, displayAvatar);
                }
            }
            if (!iVar.f103508j.f103595b || (z3 && IMUser.isFriend(((IMUser) iMContact3).getFollowStatus()))) {
                z = false;
            } else {
                z = true;
            }
            if (iVar.f103508j.f103596c || z) {
                z2 = true;
            }
            iVar.f103507i = z2;
            iVar.f103506h = z;
            if (z) {
                iVar.f103507i = true;
            }
            View view = iVar.itemView;
            l.b(view, "");
            if (!iVar.f103506h) {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
        } else if (viewHolder instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h hVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h) viewHolder;
            IMContact iMContact4 = a().get(i2);
            l.d(iMContact4, "");
            if (!(iMContact4 instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.b.a)) {
                iMContact = null;
            } else {
                iMContact = iMContact4;
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.b.a aVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.b.a) iMContact;
            if (aVar != null) {
                SharePackage sharePackage = hVar.f103492a.f103597d;
                if (sharePackage == null || (bundle = sharePackage.f124595i) == null || (str = bundle.getString("aid")) == null) {
                    str = "";
                }
                l.b(str, "");
                List<com.ss.android.ugc.aweme.upvote.c.h> a2 = UpvoteServiceImpl.d().a(str);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                String curUserId = g2.getCurUserId();
                Iterator<T> it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    User user = t.getUser();
                    if (user != null) {
                        str2 = user.getUid();
                    } else {
                        str2 = null;
                    }
                    if (l.a((Object) str2, (Object) curUserId)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null) {
                    i3 = 0;
                } else if (t2.getCacheState() == com.ss.android.ugc.aweme.upvote.c.d.PRE_PUBLISH) {
                    i3 = 1;
                } else if (t2.getCacheState() == com.ss.android.ugc.aweme.upvote.c.d.PRE_REMOVE) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
                if (h.a.i.a(new Integer[]{0, 1}, Integer.valueOf(i3))) {
                    int intValue = ((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8l), Integer.valueOf((int) R.string.fd0))).intValue();
                    hVar.a().setAnimation((String) com.ss.android.ugc.aweme.upvote.b.b.a("im_upvote_recommend_guide.json", "im_upvote_repost_guide.json"));
                    TuxTextView b2 = hVar.b();
                    l.b(b2, "");
                    b2.setText(com.ss.android.ugc.aweme.base.utils.h.b(intValue));
                } else {
                    int intValue2 = ((Number) com.ss.android.ugc.aweme.upvote.b.b.a(2131232807, 2131232808)).intValue();
                    int intValue3 = ((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f8m), Integer.valueOf((int) R.string.fd1))).intValue();
                    hVar.a().setImageResource(intValue2);
                    TuxTextView b3 = hVar.b();
                    l.b(b3, "");
                    b3.setText(com.ss.android.ugc.aweme.base.utils.h.b(intValue3));
                }
                if (hVar.a(i3)) {
                    AnimationImageView a3 = hVar.a();
                    l.b(a3, "");
                    a3.setAlpha(0.34f);
                    TuxTextView b4 = hVar.b();
                    l.b(b4, "");
                    b4.setAlpha(0.34f);
                } else {
                    AnimationImageView a4 = hVar.a();
                    l.b(a4, "");
                    a4.setAlpha(1.0f);
                    TuxTextView b5 = hVar.b();
                    l.b(b5, "");
                    b5.setAlpha(1.0f);
                }
                if (!aVar.getHasShownGuide() && i3 == 0) {
                    com.ss.android.ugc.aweme.im.sdk.b.a.a().storeBoolean("has_upvote_bounce_shown_" + com.ss.android.ugc.aweme.im.sdk.b.a.b(), true);
                    AnimationImageView a5 = hVar.a();
                    l.b(a5, "");
                    a5.setRepeatCount(3);
                    hVar.a().a();
                }
                if (hVar.a(i3)) {
                    hVar.a().setOnClickListener(null);
                } else {
                    hVar.a().setOnClickListener(new h.c(hVar, iMContact4));
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(7594);
        l.d(viewGroup, "");
        if (i2 == 2) {
            SharePanelViewModel sharePanelViewModel = bVar.f103413c;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5d, viewGroup, false);
            l.b(a3, "");
            viewHolder = new g(a3, sharePanelViewModel);
        } else if (i2 != 3) {
            SharePanelViewModel sharePanelViewModel2 = bVar.f103413c;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel2, "");
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6t, viewGroup, false);
            l.b(a4, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i(a4, sharePanelViewModel2);
        } else {
            SharePanelViewModel sharePanelViewModel3 = bVar.f103413c;
            l.d(viewGroup, "");
            l.d(sharePanelViewModel3, "");
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6w, viewGroup, false);
            l.b(a5, "");
            viewHolder = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h(a5, sharePanelViewModel3);
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
        MethodCollector.o(7594);
        return viewHolder;
    }
}
