package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.af;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.ies.im.core.api.b.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.k;
import com.ss.android.ugc.aweme.im.sdk.chat.b.g;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoUpdateTipsContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.a;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.p;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.q;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ac;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.f;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

public abstract class c extends a {
    private int A;
    private final List<b> B = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f101114d;

    /* renamed from: e  reason: collision with root package name */
    public e f101115e;

    /* renamed from: f  reason: collision with root package name */
    public ChatRoomViewModel f101116f;

    /* renamed from: g  reason: collision with root package name */
    Handler f101117g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f101118h = true;

    /* renamed from: i  reason: collision with root package name */
    public ai f101119i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f101120j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f101121k;

    /* renamed from: l  reason: collision with root package name */
    public Runnable f101122l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a f101123m;
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a n;
    public t<List<ai>> o;
    public final t<ai> p = new t<>();
    public ChatRoomLiveStateManager q;
    int r;
    int s;
    private q t;
    private View.OnClickListener u;
    private com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b v;
    private View.OnLongClickListener w;
    private View.OnTouchListener x;
    private com.bytedance.ies.uikit.d.c y;
    private IMUser z;

    public interface a {
        static {
            Covode.recordClassIndex(64696);
        }

        void a(ai aiVar);
    }

    public interface b {
        static {
            Covode.recordClassIndex(64697);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(64691);
    }

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, ai aiVar) {
    }

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, IMUser iMUser, ai aiVar);

    /* access modifiers changed from: protected */
    public void b(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a
    public final void a() {
        notifyDataSetChanged();
    }

    public final void a(List<ai> list, int i2) {
        boolean z2 = true;
        if (i2 == 4) {
            this.f101121k = true;
        }
        if (list != null && !list.isEmpty()) {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a aVar = this.f101123m;
            if (aVar != null) {
                aVar.a(this.f101115e, i2 == 5);
            }
            Message obtainMessage = this.f101117g.obtainMessage(1);
            ai aiVar = list.get(0);
            switch (i2) {
                case 0:
                    Runnable runnable = this.f101122l;
                    if (runnable != null) {
                        runnable.run();
                    }
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a aVar2 = this.f101123m;
                    if (aVar2 != null) {
                        aVar2.a();
                        break;
                    }
                    break;
                case 1:
                    if (this.f101101b.contains(aiVar)) {
                        obtainMessage = this.f101117g.obtainMessage(2);
                        break;
                    } else {
                        obtainMessage = this.f101117g.obtainMessage(5);
                        break;
                    }
                case 2:
                    if (!this.n.isStrangerChat()) {
                        if (list.size() == 1 && !this.f101101b.contains(aiVar)) {
                            obtainMessage = this.f101117g.obtainMessage(5);
                            break;
                        } else {
                            obtainMessage = this.f101117g.obtainMessage(2);
                            break;
                        }
                    } else {
                        obtainMessage = this.f101117g.obtainMessage(2);
                        this.n.setChatType(0);
                        break;
                    }
                    break;
                case 3:
                    if (this.f101101b.contains(aiVar)) {
                        obtainMessage = this.f101117g.obtainMessage(7);
                        break;
                    }
                    break;
                case 4:
                    if (list.size() != this.f101115e.e()) {
                        z2 = false;
                    }
                    this.f101118h = z2;
                    obtainMessage.arg1 = 4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (list.size() != this.f101115e.e()) {
                        z2 = false;
                    }
                    this.f101118h = z2;
                    b();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (aiVar.isRecalled()) {
                        obtainMessage = this.f101117g.obtainMessage(4);
                        break;
                    } else if (aiVar.getMsgType() != 40) {
                        return;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    obtainMessage = this.f101117g.obtainMessage(2);
                    break;
            }
            obtainMessage.obj = list;
            this.f101117g.sendMessage(obtainMessage);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public void a(Object obj, int i2) {
        int i3;
        if (obj != null) {
            try {
                List list = (List) obj;
                int size = list.size();
                int i4 = 0;
                ai aiVar = (ai) list.get(0);
                if (i2 == 0) {
                    int indexOf = this.f101101b.indexOf(aiVar);
                    if (indexOf != -1) {
                        while (i4 < list.size() && (i3 = i4 + indexOf) < getItemCount()) {
                            this.f101101b.set(i3, aiVar);
                            i4++;
                        }
                        notifyItemRangeChanged(indexOf, size);
                    }
                } else if (i2 == 1) {
                    this.f101101b.addAll(0, list);
                    notifyItemRangeInserted(0, size);
                    d f2 = d.f();
                    RecyclerView recyclerView = this.f101100a;
                    f2.f101420d = true;
                    f2.a(recyclerView, 0);
                    ChatRoomLiveStateManager chatRoomLiveStateManager = this.q;
                    if (chatRoomLiveStateManager != null) {
                        k.a(new ChatRoomLiveStateManager.j(chatRoomLiveStateManager));
                    }
                    if (this.f101100a != null && (this.f101100a.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) this.f101100a.getLayoutManager()).k() <= 10 && this.f101100a != null && (this.f101100a.getLayoutManager() instanceof LinearLayoutManager)) {
                        ((LinearLayoutManager) this.f101100a.getLayoutManager()).a(0, 0);
                    }
                } else if (i2 == 3) {
                    int indexOf2 = this.f101101b.indexOf(aiVar);
                    if (indexOf2 != -1) {
                        this.f101101b.removeAll(list);
                        notifyItemRangeRemoved(indexOf2, size);
                        if (indexOf2 > 0) {
                            notifyItemChanged(indexOf2 - 1);
                        }
                    }
                }
                super.a(obj, i2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
    }

    public void c() {
        this.f101101b = this.f101115e.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        if (this.f101101b != null) {
            return this.f101101b.size();
        }
        return 0;
    }

    public final void e() {
        if (this.f101114d == 1) {
            q qVar = this.t;
            if (qVar != null) {
                qVar.i();
                return;
            }
            return;
        }
        this.f101114d = 1;
        this.f101115e.g();
    }

    private void b() {
        q qVar = this.t;
        if (qVar != null) {
            qVar.j();
        }
        int i2 = this.A;
        if (i2 > 0 && i2 != this.f101115e.e()) {
            this.f101115e.a(this.A);
            this.A = 0;
        }
        this.f101114d = 0;
        if (this.f101101b.size() <= 1 && this.f101100a != null && this.f101100a.getLayoutManager() != null) {
            this.f101100a.getLayoutManager().e(0);
        }
    }

    public final void f() {
        this.f101120j = false;
        com.bytedance.ies.uikit.d.c cVar = this.y;
        if (cVar != null && !cVar.f35412b && !cVar.f35413c) {
            cVar.f35414d.removeCallbacks(cVar.f35415e);
            if (!cVar.f35412b) {
                try {
                    if (cVar.f35411a.isShowing()) {
                        cVar.f35411a.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
            cVar.f35412b = true;
        }
        d();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public final void b(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewDetachedFromWindow(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public /* bridge */ /* synthetic */ void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public /* bridge */ /* synthetic */ void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public final /* bridge */ /* synthetic */ void a(com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar) {
        super.a(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public /* synthetic */ void onViewAttachedToWindow(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewAttachedToWindow(aVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public /* synthetic */ void onViewDetachedFromWindow(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewDetachedFromWindow(aVar);
    }

    public final ai b(int i2) {
        return (ai) this.f101101b.get(i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewRecycled(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar2 = aVar;
        super.onViewRecycled(aVar2);
        aVar2.g();
    }

    public final void a(b bVar) {
        this.B.add(bVar);
    }

    public final void c(int i2) {
        this.A = this.f101115e.e();
        this.f101115e.a(i2);
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        return com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.valueOf((ai) this.f101101b.get(i2)).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        ai aiVar = (ai) this.f101101b.get(i2);
        long rowId = aiVar.getRowId();
        if (rowId >= 0) {
            return rowId;
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "Unsaved message showing in Adapter: ".concat(String.valueOf(aiVar)));
        long nextLong = h.i.c.Default.nextLong(Long.MIN_VALUE, 0);
        com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "Setting message stable id: ".concat(String.valueOf(nextLong)));
        return nextLong;
    }

    public c(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        this.n = aVar;
        this.f101101b = new ArrayList();
        this.f101117g = new g(this);
        this.z = IMUser.fromUser(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
        if (this.u == null) {
            this.u = new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(64692);
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a(ai aiVar) {
                    if (c.this.f101101b.indexOf(aiVar) >= 0 && c.this.f101100a != null) {
                        aiVar.addLocalExt("key_resend", "1");
                        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t.b(aiVar);
                    }
                }

                public final void onClick(final View view) {
                    final String str;
                    ai aiVar;
                    String str2;
                    String str3;
                    Serializable serializable;
                    ClickAgent.onClick(view);
                    if (view.getTag(50331648) == null) {
                        com.ss.android.ugc.aweme.im.service.m.a.d("MessageAdapter", "when click item ,but no type found ,maybe this is a bug!");
                        return;
                    }
                    int intValue = ((Integer) view.getTag(50331648)).intValue();
                    Object tag = view.getTag(150994945);
                    if (!(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
                        if (c.this.n == null || !c.this.n.isGroupChat()) {
                            str = "chat";
                        } else {
                            str = "group_chat";
                        }
                        com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "item click:".concat(String.valueOf(intValue)));
                        if (intValue == 2) {
                            c.this.a(view, (String) view.getTag(67108864), (ai) view.getTag(134217728), str);
                            return;
                        }
                        Aweme aweme = null;
                        if (intValue == 48) {
                            String str4 = (String) view.getTag(67108864);
                            Bundle bundle = (Bundle) view.getTag(50331652);
                            if (!(bundle == null || (serializable = bundle.getSerializable("currentAweme")) == null)) {
                                aweme = (Aweme) serializable;
                            }
                            if (str4 != null) {
                                l.d(str4, "");
                                Activity a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
                                if (a2 != null) {
                                    if (!fe.a(a2)) {
                                        new com.bytedance.tux.g.b(a2).e(R.string.de8).b();
                                        return;
                                    }
                                    if (aweme != null) {
                                        StoryServiceImpl.l().a(str4, aweme);
                                    }
                                    SmartRouter.buildRoute(a2, "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "chat_list").withParam("id", str4).open();
                                }
                            }
                        } else if (intValue == 3) {
                            String str5 = (String) view.getTag(67108864);
                            if (!TextUtils.isEmpty(str5)) {
                                if (c.this.n == null || !c.this.n.isAuthorSupporterChat() || com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.d()) {
                                    if (c.this.n.getChatType() == 3) {
                                        com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(str5, "group_chat");
                                    } else {
                                        com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(str5);
                                    }
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(str5, "", "pair", "click_head");
                                    com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(str5, str, "click_head");
                                }
                            }
                        } else if (intValue == 4) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) view.getTag(100663296);
                            if (shareAwemeContent != null && !TextUtils.isEmpty(shareAwemeContent.getUser())) {
                                if (shareAwemeContent.getIsAdFake().booleanValue()) {
                                    new com.bytedance.tux.g.b(view).e(R.string.of).b();
                                    return;
                                }
                                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(shareAwemeContent.getUser(), shareAwemeContent.getItemId(), "others", "click_head");
                                com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(shareAwemeContent.getUser(), str, "click_head");
                                ag.a(shareAwemeContent.getUser(), shareAwemeContent.getSecUid());
                                d.f().b();
                            }
                        } else if (intValue == 5) {
                            ai aiVar2 = (ai) view.getTag(67108864);
                            if (aiVar2 != null) {
                                RecyclerView recyclerView = c.this.f101100a;
                                c cVar = c.this;
                                b bVar = new b(recyclerView, cVar, aiVar2, cVar.n);
                                bz unused = i.a(bVar.f101105a, null, null, new b.a(bVar, null), 3);
                            }
                        } else if (intValue == 6) {
                            ai aiVar3 = (ai) view.getTag(67108864);
                            if (aiVar3 != null && aiVar3.isSelf()) {
                                Context context = view.getContext();
                                f fVar = new f(this, aiVar3);
                                l.d(context, "");
                                if (f.a(context)) {
                                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).b(R.string.cf_), new f.a(fVar)).a().b().show();
                                }
                            }
                        } else if (intValue == 9) {
                            com.ss.android.ugc.aweme.im.service.m.a.e("MessageAdapter", "Why MT has picture feature!!");
                        } else if (intValue == 11) {
                            Object tag2 = view.getTag(100663296);
                            if (tag2 instanceof VideoUpdateTipsContent) {
                                VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) tag2;
                                String uid = videoUpdateTipsContent.getUid();
                                String aid = videoUpdateTipsContent.getAid();
                                if (!TextUtils.isEmpty(uid) && !TextUtils.isEmpty(aid)) {
                                    SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.f.j(), u.a("aweme://aweme/detail/".concat(String.valueOf(aid))).f71178a.a()).withParam("video_from", "from_profile_other").withParam("video_type", 0).withParam("userid", uid).withParam("refer", "update_tips").open();
                                }
                            }
                        } else if (intValue == 12) {
                            String str6 = (String) view.getTag(67108864);
                            if (!TextUtils.isEmpty(str6)) {
                                SmartRouter.buildRoute(view.getContext(), u.a("aweme://aweme/detail/".concat(String.valueOf(str6))).f71178a.a()).withParam("refer", "chat").withParam("enter_method", "click_token").withParam("previous_page", "token").withParam("video_from", "from_chat").open();
                            }
                        } else if (intValue == 14) {
                            c.this.a(view, (String) view.getTag(67108864), (ai) view.getTag(134217728), "chat", ((CommentContent) view.getTag(100663296)).getCommentId());
                        } else if (intValue == 51) {
                            c.this.a(view, (String) view.getTag(67108864), (ai) view.getTag(134217728), "chat");
                        } else if (intValue == 17) {
                            Object tag3 = view.getTag(100663296);
                            if (tag3 instanceof ShareMusicContent) {
                                String uuid = UUID.randomUUID().toString();
                                ShareMusicContent shareMusicContent = (ShareMusicContent) tag3;
                                String musicId = shareMusicContent.getMusicId();
                                if (!TextUtils.isEmpty(musicId)) {
                                    SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.f.j(), u.a("aweme://music/detail/".concat(String.valueOf(musicId))).f71178a.a()).withParam("process_id", uuid).open();
                                }
                                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                String musicId2 = shareMusicContent.getMusicId();
                                String singleChatFromUserId = c.this.n.getSingleChatFromUserId();
                                String conversationId = c.this.n.getConversationId();
                                androidx.c.a aVar = new androidx.c.a();
                                aVar.put("to_user_id", singleChatFromUserId);
                                aVar.put("conversation_id", conversationId);
                                aVar.put("enter_from", "chat");
                                aVar.put("music_id", musicId2);
                                aVar.put("process_id", uuid);
                                r.a("enter_music_detail", aVar);
                            }
                        } else if (intValue == 49) {
                            Object tag4 = view.getTag(100663296);
                            if (tag4 instanceof ShareQnAContent) {
                                String uuid2 = UUID.randomUUID().toString();
                                ShareQnAContent shareQnAContent = (ShareQnAContent) tag4;
                                SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.f.j(), "aweme://qna/detail/").withParam("id", Long.valueOf(shareQnAContent.getQuestionId()).toString()).withParam("process_id", uuid2).open();
                                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                Long valueOf = Long.valueOf(shareQnAContent.getQuestionId());
                                String singleChatFromUserId2 = c.this.n.getSingleChatFromUserId();
                                String conversationId2 = c.this.n.getConversationId();
                                androidx.c.a aVar2 = new androidx.c.a();
                                aVar2.put("enter_from", "chat");
                                aVar2.put("enter_method", "chat_click");
                                aVar2.put("group_id", "");
                                aVar2.put("question_item_id", valueOf.toString());
                                aVar2.put("to_user_id", singleChatFromUserId2);
                                aVar2.put("conversation_id", conversationId2);
                                aVar2.put("process_id", uuid2);
                                r.a("enter_qa_detail_page", aVar2);
                            }
                        } else if (intValue == 45) {
                            Object tag5 = view.getTag(67108864);
                            if (tag5 != null) {
                                String str7 = (String) tag5;
                                if (!TextUtils.isEmpty(str7)) {
                                    c.a(com.bytedance.ies.ugc.appcontext.f.j(), str7);
                                }
                                Object tag6 = view.getTag(50331649);
                                if (tag6 != null && (tag6 instanceof ShareLiveEventContent)) {
                                    ShareLiveEventContent shareLiveEventContent = (ShareLiveEventContent) tag6;
                                    boolean a3 = af.a(Uri.parse(URLDecoder.decode(shareLiveEventContent.getLinkUrl())), "is_paid_event");
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(shareLiveEventContent.getEventId(), a3, "click");
                                }
                            }
                        } else if (intValue == 18) {
                            Object tag7 = view.getTag(67108864);
                            Object tag8 = view.getTag(50331649);
                            if (tag7 != null && tag8 != null) {
                                boolean booleanValue = ((Boolean) tag8).booleanValue();
                                String uuid3 = UUID.randomUUID().toString();
                                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), u.a("aweme://challenge/detail/".concat(String.valueOf(tag7))).f71178a.a());
                                if (booleanValue) {
                                    str3 = "1";
                                } else {
                                    str3 = "0";
                                }
                                buildRoute.withParam("is_commerce", str3).withParam("enter_from", "chat").withParam("process_id", uuid3).open();
                                String singleChatFromUserId3 = c.this.n.getSingleChatFromUserId();
                                String conversationId3 = c.this.n.getConversationId();
                                androidx.c.a aVar3 = new androidx.c.a();
                                aVar3.put("to_user_id", singleChatFromUserId3);
                                aVar3.put("conversation_id", conversationId3);
                                aVar3.put("enter_from", "chat");
                                aVar3.put("tag_id", tag7);
                                aVar3.put("process_id", uuid3);
                                r.a("enter_tag_detail", aVar3);
                            }
                        } else if (intValue == 21) {
                            Object tag9 = view.getTag(100663296);
                            if (tag9 instanceof ShareUserContent) {
                                ShareUserContent shareUserContent = (ShareUserContent) tag9;
                                ag.a(shareUserContent.getUid(), shareUserContent.getSecUid());
                            }
                        } else if (intValue == 22) {
                            Object tag10 = view.getTag(100663296);
                            if (tag10 instanceof ShareWebContent) {
                                AbsShareWebContent absShareWebContent = (AbsShareWebContent) tag10;
                                if (!TextUtils.isEmpty(absShareWebContent.getUrl())) {
                                    if (SmartRouter.canOpen(absShareWebContent.getUrl())) {
                                        SmartRouter.buildRoute(view.getContext(), absShareWebContent.getUrl()).open();
                                    } else {
                                        IEOYService b2 = EOYServiceImpl.b();
                                        if (b2 == null || !b2.a(view.getContext(), absShareWebContent.getUrl())) {
                                            Context context2 = view.getContext();
                                            String url = absShareWebContent.getUrl();
                                            l.d(context2, "");
                                            if (url == null || url.length() == 0) {
                                                com.ss.android.ugc.aweme.im.service.m.a.c("SafeUrlOpenHelper", "openUrl url empty");
                                            } else {
                                                com.ss.android.ugc.aweme.im.service.e b3 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
                                                if (b3 != null) {
                                                    b3.openUrl(context2, url, true);
                                                }
                                            }
                                        }
                                    }
                                    Object tag11 = view.getTag(50331649);
                                    if ((tag11 instanceof Boolean) && ((Boolean) tag11).booleanValue()) {
                                        String obj = view.getTag(50331650).toString();
                                        String obj2 = view.getTag(50331650).toString();
                                        androidx.c.a aVar4 = new androidx.c.a();
                                        aVar4.put("author_id", obj);
                                        aVar4.put("message_id", obj2);
                                        aVar4.put("message_type", "picture");
                                        r.a("click_in_message", aVar4);
                                    }
                                }
                            }
                        } else if (intValue == 47) {
                            Object tag12 = view.getTag(100663296);
                            if (tag12 instanceof ShareSearchContent) {
                                ShareSearchContent shareSearchContent = (ShareSearchContent) tag12;
                                if (!TextUtils.isEmpty(shareSearchContent.getSchema())) {
                                    c.a(view.getContext(), shareSearchContent.getSchema());
                                }
                            }
                        } else if (intValue == 23) {
                            ShareLiveContent shareLiveContent = (ShareLiveContent) view.getTag(100663296);
                            ai aiVar4 = (ai) view.getTag(134217728);
                            Bundle bundle2 = new Bundle();
                            if (aiVar4 != null) {
                                bundle2.putString("share_user_id", String.valueOf(aiVar4.getSender()));
                            }
                            if (shareLiveContent != null) {
                                User user = new User();
                                user.setUid(shareLiveContent.getRoomOwnerId());
                                user.setSecUid(shareLiveContent.getRoomSecOwnerId());
                                try {
                                    user.setBroadcasterRoomId(Long.parseLong(shareLiveContent.getRoomId()));
                                } catch (Exception unused2) {
                                }
                                LiveOuterService.s().i().a(view.getContext(), user, null, bundle2);
                            }
                        } else {
                            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar5 = null;
                            if (intValue == 24) {
                                ShareLiveContent shareLiveContent2 = (ShareLiveContent) view.getTag(100663296);
                                if (shareLiveContent2 != null) {
                                    ag.a(shareLiveContent2.getRoomOwnerId(), shareLiveContent2.getRoomSecOwnerId());
                                }
                            } else if (intValue == 38) {
                                Object tag13 = view.getTag(100663296);
                                if (tag13 instanceof ShareCompilationContent) {
                                    ShareCompilationContent shareCompilationContent = (ShareCompilationContent) tag13;
                                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", shareCompilationContent.getCompilationId()).withParam("event_type", "chat").open();
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                    String compilationId = shareCompilationContent.getCompilationId();
                                    String authorId = shareCompilationContent.getAuthorId();
                                    androidx.c.a aVar6 = new androidx.c.a();
                                    aVar6.put("enter_from", "chat");
                                    aVar6.put("enter_method", "chat_click");
                                    aVar6.put("compilation_id", compilationId);
                                    aVar6.put("author_id", authorId);
                                    r.a("enter_compilation_detail", aVar6);
                                }
                            } else if (intValue == 39) {
                                Object tag14 = view.getTag(100663296);
                                if (tag14 instanceof ShareStickerContent) {
                                    ShareStickerContent shareStickerContent = (ShareStickerContent) tag14;
                                    SmartRouter.buildRoute(view.getContext(), "aweme://stickers/detail/").withParam("id", shareStickerContent.getStickerId()).open();
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
                                    String stickerId = shareStickerContent.getStickerId();
                                    androidx.c.a aVar7 = new androidx.c.a();
                                    aVar7.put("enter_from", "chat");
                                    aVar7.put("prop_id", stickerId);
                                    r.a("enter_prop_detail", aVar7);
                                }
                            } else if (intValue == 41) {
                                Object tag15 = view.getTag(67108864);
                                if (tag15 != null) {
                                    c cVar2 = c.this;
                                    cVar2.f101115e.h().remove(tag15);
                                    cVar2.f101117g.sendMessage(cVar2.f101117g.obtainMessage(1));
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().openNotificationSetting(view.getContext(), c.this.n.getSingleChatFromUserId());
                                }
                            } else if (intValue == 46) {
                                Object tag16 = view.getTag(100663296);
                                if ((tag16 instanceof GroupInviteCardContent) && (aiVar = (ai) view.getTag(67108864)) != null) {
                                    GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) tag16;
                                    h a4 = a.C0745a.a().a(c.this.n.getConversationId());
                                    if (a4 != null) {
                                        aVar5 = new com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a();
                                        aVar5.setConversationId(a4.getConversationId());
                                        aVar5.setConversationShortId(new StringBuilder().append(a4.getConversationShortId()).toString());
                                        if (a4.getCoreInfo() != null) {
                                            aVar5.setAvatarUrl(a4.getCoreInfo().getIcon());
                                        }
                                        aVar5.setGroupSize(Integer.valueOf(a4.getMemberCount()));
                                        aVar5.setName(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.e(a4));
                                    }
                                    Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                                    long sender = aiVar.getSender();
                                    l.d(groupInviteCardContent, "");
                                    if (j2 instanceof androidx.fragment.app.e) {
                                        com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b bVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("arg_invite_id", groupInviteCardContent.getInviteId());
                                        bundle3.putSerializable("arg_default_group", aVar5);
                                        bundle3.putLong("arg_invite_sender", sender);
                                        bVar2.setArguments(bundle3);
                                        new a.C1112a().a(true).a(bVar2).a(new a.C2474a.DialogInterface$OnDismissListenerC2475a(j2)).f45299a.show(((androidx.fragment.app.e) j2).getSupportFragmentManager(), "GroupInviteCardSheet");
                                    }
                                    com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar8 = c.this.n;
                                    if (aVar8 != null) {
                                        androidx.c.a aVar9 = new androidx.c.a();
                                        if (aVar8.isGroupChat()) {
                                            str2 = "group";
                                        } else {
                                            str2 = "private";
                                        }
                                        aVar9.put("chat_type", str2);
                                        aVar9.put("conversation_id", aVar8.getConversationId());
                                        r.a("click_share_card", aVar9);
                                    }
                                }
                            } else if (intValue == 50) {
                                final String str8 = (String) view.getTag(67108864);
                                f.a.a().a(((Long) view.getTag(134217728)).longValue(), a.C0745a.a().a(c.this.n.getConversationId()), new com.bytedance.im.core.a.a.b() {
                                    /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(64693);
                                    }

                                    @Override // com.bytedance.im.core.a.a.b
                                    public final void a(Object obj) {
                                        c.this.a(view, str8, (ai) obj, str);
                                    }

                                    @Override // com.bytedance.im.core.a.a.b
                                    public final void a(com.bytedance.im.core.d.u uVar) {
                                        com.ss.android.ugc.aweme.im.service.m.a.e("MessageAdapter", "Not able to load message from server " + uVar.f38025c);
                                    }
                                });
                            }
                        }
                    } else {
                        com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", "onclick item content is illegal ".concat(String.valueOf(intValue)));
                    }
                }
            };
        }
        if (this.w == null) {
            this.w = new View.OnLongClickListener() {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                int f101129a;

                /* renamed from: b  reason: collision with root package name */
                BaseContent f101130b;

                /* renamed from: c  reason: collision with root package name */
                ai f101131c;

                static {
                    Covode.recordClassIndex(64694);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:99:0x0226, code lost:
                    if (r3.getType() == 504) goto L_0x00be;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:100:0x0228 A[FALL_THROUGH] */
                /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
                /* JADX WARNING: Removed duplicated region for block: B:64:0x018c  */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x01ad  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x01c7  */
                /* JADX WARNING: Removed duplicated region for block: B:77:0x01ca  */
                /* JADX WARNING: Removed duplicated region for block: B:78:0x01cc A[FALL_THROUGH] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean onLongClick(android.view.View r23) {
                    /*
                    // Method dump skipped, instructions count: 682
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.AnonymousClass2.onLongClick(android.view.View):boolean");
                }
            };
        }
        if (this.x == null) {
            this.x = new e(this);
        }
        if (aVar.getSelectMsgType() == 1 && this.v == null) {
            this.v = new d(this);
        }
    }

    public static boolean a(ai aiVar) {
        int msgType;
        if (aiVar.isSelf() || (msgType = aiVar.getMsgType()) == 14 || msgType == 1001 || msgType == 1002 || msgType == 1008 || msgType == 1009) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.g.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public final void a(int i2) {
        c();
        notifyDataSetChanged();
        List<b> list = this.B;
        if (list != null && !list.isEmpty()) {
            for (b bVar : this.B) {
                bVar.a();
            }
        }
        super.a(i2);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.sdk.chat.data.b.b("MessageAdapter.updateData"));
        if (i2 == 4) {
            com.ss.android.ugc.aweme.cc.c.a("im_chat_room", (com.ss.android.ugc.aweme.cc.b) null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a
    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar) {
        super.onViewAttachedToWindow(aVar);
    }

    public static void a(Context context, String str) {
        if (str != null) {
            String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.c.h.a(str, com.ss.android.ugc.aweme.im.sdk.common.controller.c.h.a());
            if (a2 == null || TextUtils.equals(a2, str)) {
                SmartRouter.buildRoute(context, str).open();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(a2));
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar, int i2) {
        boolean z2;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a aVar2 = aVar;
        ac.a("onBindViewHolder");
        if (aVar2.f101312c == com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.LOAD_MORE.getViewType()) {
            q qVar = (q) aVar2;
            this.t = qVar;
            qVar.i();
        } else {
            ai aiVar = (ai) this.f101101b.get(i2);
            if (i2 < this.f101101b.size() - 1) {
                try {
                    aVar2.a(aiVar, (ai) this.f101101b.get(i2 + 1), com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.content(aiVar), i2);
                } catch (ClassCastException e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("MessageAdapter", e2);
                }
            } else {
                aVar2.a(aiVar, null, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.content(aiVar), i2);
            }
            a(aVar2, this.z, aiVar);
            a(aVar2, aiVar);
            t<List<ai>> tVar = this.o;
            if (tVar == null || tVar.getValue() == null || !this.o.getValue().contains(aiVar)) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i3 = 8;
            if (aVar2.q == 1) {
                if (aVar2.f101320k != null) {
                    aVar2.f101320k.setOnClickListener(new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.c(aVar2, aiVar));
                    aVar2.f101320k.setVisibility(0);
                }
                if (aVar2.f101315f != null) {
                    aVar2.f101315f.setChecked(z2);
                }
                FrameLayout frameLayout = aVar2.f101316g;
                if (com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.b(aiVar)) {
                    i3 = 0;
                }
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.a(frameLayout, i3);
                if (aVar2.f101316g != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar2.f101316g.getLayoutParams();
                    marginLayoutParams.topMargin = 0;
                    aVar2.f101316g.setLayoutParams(marginLayoutParams);
                }
            } else {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.a(aVar2.f101316g, 8);
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a.a(aVar2.f101320k, 8);
            }
        }
        ac.b("onBindViewHolder");
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a viewHolder;
        ChatRoomLiveStateManager chatRoomLiveStateManager;
        Context context = viewGroup.getContext();
        com.ss.android.ugc.aweme.im.sdk.chat.data.e.b valueOf = com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.valueOf(i2);
        View a2 = com.a.a(LayoutInflater.from(context), valueOf.getItemLayoutId(), viewGroup, false);
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = cVar.n;
        boolean z2 = true;
        if (aVar == null || aVar.getSelectMsgType() != 1) {
            viewHolder = valueOf.getViewHolder(a2);
            viewHolder.q = 0;
        } else {
            RecyclerView.j jVar = new RecyclerView.j(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(jVar);
            frameLayout.addView(a2);
            frameLayout.addView(com.a.a(LayoutInflater.from(context), R.layout.a5i, viewGroup, false));
            viewHolder = valueOf.getViewHolder(frameLayout);
            viewHolder.q = cVar.n.getSelectMsgType();
        }
        cVar.b(viewHolder, valueOf);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b bVar = cVar.v;
        if (viewHolder.f101315f != null) {
            viewHolder.f101315f.setOnCheckedChangeListener(new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.b(viewHolder, bVar));
        }
        viewHolder.a(cVar.w);
        viewHolder.a(cVar.x);
        viewHolder.a(cVar.u);
        if ((viewHolder instanceof p) && (chatRoomLiveStateManager = cVar.q) != null) {
            p pVar = (p) viewHolder;
            l.d(pVar, "");
            if (!chatRoomLiveStateManager.c().contains(pVar)) {
                pVar.a(chatRoomLiveStateManager.a(), chatRoomLiveStateManager.b(), (Set) chatRoomLiveStateManager.f101283a.getValue());
                chatRoomLiveStateManager.c().add(pVar);
            }
        }
        cVar.a(viewHolder, valueOf);
        viewHolder.h();
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z2) {
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
            com.ss.android.ugc.aweme.profile.ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        return viewHolder;
    }

    public final void a(View view, String str, ai aiVar, String str2) {
        a(view, str, aiVar, str2, null);
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, String str, ai aiVar, String str2, String str3) {
        String str4;
        String str5;
        boolean z2;
        if (!TextUtils.isEmpty(str) && aiVar != null) {
            Bundle bundle = (Bundle) view.getTag(50331652);
            Aweme aweme = null;
            View view2 = (View) view.getTag(50331653);
            long j2 = -1;
            if (bundle != null) {
                j2 = bundle.getLong("position", -1);
                aweme = (Aweme) bundle.getSerializable("currentAweme");
            }
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getIMSetting().f103910g) {
                str4 = String.valueOf(aiVar.getIndex());
                com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().setIMAwemeProvider(new com.ss.android.ugc.aweme.im.sdk.chat.b.c(this.n.getConversationId(), aiVar, this.f101101b));
            } else {
                str4 = str;
            }
            if (((Integer) view.getTag(50331648)).intValue() == 50) {
                str5 = "click_quoted_message";
            } else {
                str5 = "click";
            }
            StringBuilder append = new StringBuilder("video clicked: ").append(str).append(" enter Method: ").append(str5).append(" , aweme is null: ");
            if (aweme == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.ss.android.ugc.aweme.im.service.m.a.c("MessageAdapter", append.append(z2).toString());
            if (aweme == null || com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b() == null) {
                d.f().b();
                d.f().b(aiVar.getUuid());
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), u.a("aweme://aweme/detail/".concat(String.valueOf(str4))).a()).withParam("refer", str2).withParam("video_from", "from_chat").withParam("enter_method", str5).withParam("key_from_chat_room_playing", true).withParam("key_from_chat_room_real_aid", str).withParam("message", aiVar);
                if (str3 != null && !str3.isEmpty()) {
                    withParam.withParam("enter_method", "click_shared_comment").withParam("cid", str3);
                }
                withParam.open();
                return;
            }
            com.ss.android.ugc.aweme.im.service.f a2 = d.f().a(aiVar.getUuid());
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().setSharePlayer(a2, Long.valueOf(j2));
            if (a2 != null) {
                a2.c();
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().setNeedToContinueToPlay(true);
            AwemeService.b().a(aweme);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key_from_chat_room_playing", true);
            bundle2.putString("key_from_chat_room_real_aid", str);
            bundle2.putString("enter_method", str5);
            bundle2.putSerializable("message", aiVar);
            if (str3 != null && !str3.isEmpty()) {
                bundle2.putString("cid", str3);
                bundle2.putString("enter_method", "click_shared_comment");
                bundle2.putString("realItemId", str);
            }
            d.f();
            com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().enterDetailActivity(view.getContext(), str4, str2, "from_chat", aweme.getEnterpriseType(), 7000, "", view2, bundle2);
            d.f().b(aiVar.getUuid());
            d f2 = d.f();
            aiVar.getUuid();
            f2.d();
        }
    }
}
