package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import com.ss.android.ugc.aweme.sharer.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;

public final class GroupShareChannelDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final PowerList f102671a;

    static {
        Covode.recordClassIndex(65741);
    }

    public static final class ShareChannelCell extends PowerCell<a> {

        /* renamed from: a  reason: collision with root package name */
        final h f102672a = i.a((h.f.a.a) new c(this));

        /* renamed from: b  reason: collision with root package name */
        final h f102673b = i.a((h.f.a.a) new b(this));

        static {
            Covode.recordClassIndex(65742);
        }

        static final class c extends m implements h.f.a.a<GroupShareViewModel> {
            final /* synthetic */ ShareChannelCell this$0;

            static {
                Covode.recordClassIndex(65745);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(ShareChannelCell shareChannelCell) {
                super(0);
                this.this$0 = shareChannelCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ GroupShareViewModel invoke() {
                return PowerCell.b(this.this$0, GroupShareViewModel.class);
            }
        }

        static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.sharer.h> {
            final /* synthetic */ ShareChannelCell this$0;

            static {
                Covode.recordClassIndex(65744);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(ShareChannelCell shareChannelCell) {
                super(0);
                this.this$0 = shareChannelCell;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.sharer.h invoke() {
                GroupSharePackage groupSharePackage;
                a aVar = (a) this.this$0.f34234d;
                if (aVar == null || (groupSharePackage = aVar.f102678b) == null) {
                    return null;
                }
                return groupSharePackage.a(aVar.f102677a);
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6u, viewGroup, false);
            l.b(a2, "");
            return a2;
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f102674a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f102675b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ShareChannelCell f102676c;

            static {
                Covode.recordClassIndex(65743);
            }

            a(com.ss.android.ugc.aweme.sharer.b bVar, String str, ShareChannelCell shareChannelCell) {
                this.f102674a = bVar;
                this.f102675b = str;
                this.f102676c = shareChannelCell;
            }

            public final void onClick(View view) {
                com.ss.android.ugc.aweme.sharer.h hVar;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.sharer.a.b.a(view, 1200) && (hVar = (com.ss.android.ugc.aweme.sharer.h) this.f102676c.f102673b.getValue()) != null) {
                    com.ss.android.ugc.aweme.sharer.b bVar = this.f102674a;
                    View view2 = this.f102676c.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    l.b(context, "");
                    bVar.a(hVar, context);
                    GroupShareViewModel groupShareViewModel = (GroupShareViewModel) this.f102676c.f102672a.getValue();
                    if (groupShareViewModel != null) {
                        groupShareViewModel.b();
                    }
                    String str = this.f102675b;
                    l.d(str, "");
                    r.a("share_group_via", v.a(com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101508c, "conversation_id"), v.a(com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101507b, "previous_page"), v.a(Integer.valueOf(com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101509d), "is_master"), v.a(str, "platform"));
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final /* synthetic */ void a(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.sharer.b bVar = aVar2.f102677a;
            String b2 = bVar.b();
            View view = this.itemView;
            l.b(view, "");
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.e0m);
            l.b(remoteImageView, "");
            bVar.a(remoteImageView, false);
            View view2 = this.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.e0n);
            l.b(tuxTextView, "");
            tuxTextView.setText(b2);
            this.itemView.setOnClickListener(new a(bVar, b2, this));
        }
    }

    public static final class a implements com.bytedance.ies.powerlist.b.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f102677a;

        /* renamed from: b  reason: collision with root package name */
        public final GroupSharePackage f102678b;

        static {
            Covode.recordClassIndex(65746);
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f102677a, aVar.f102677a) && l.a(this.f102678b, aVar.f102678b);
        }

        public final int hashCode() {
            b bVar = this.f102677a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            GroupSharePackage groupSharePackage = this.f102678b;
            if (groupSharePackage != null) {
                i2 = groupSharePackage.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "ShareGroupItem(channel=" + this.f102677a + ", sharePackage=" + this.f102678b + ")";
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
            return aVar.equals(this);
        }

        @Override // com.bytedance.ies.powerlist.b.a
        public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
            return aVar.equals(this);
        }

        public a(b bVar, GroupSharePackage groupSharePackage) {
            l.d(bVar, "");
            l.d(groupSharePackage, "");
            this.f102677a = bVar;
            this.f102678b = groupSharePackage;
        }
    }

    public GroupShareChannelDelegate(PowerList powerList) {
        l.d(powerList, "");
        this.f102671a = powerList;
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        powerList.setLayoutManager(linearLayoutManager);
        powerList.a(ShareChannelCell.class);
    }
}
