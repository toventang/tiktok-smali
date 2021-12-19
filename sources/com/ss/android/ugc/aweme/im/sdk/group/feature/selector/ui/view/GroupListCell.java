package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class GroupListCell extends PowerCell<c> {

    /* renamed from: a  reason: collision with root package name */
    final h f102755a = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(65851);
    }

    static final class a extends m implements h.f.a.a<GroupListViewModel> {
        final /* synthetic */ GroupListCell this$0;

        static {
            Covode.recordClassIndex(65852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupListCell groupListCell) {
            super(0);
            this.this$0 = groupListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GroupListViewModel invoke() {
            return PowerCell.b(this.this$0, GroupListViewModel.class);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        this.itemView.setOnClickListener(new b(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a5a, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupListCell f102756a;

        static {
            Covode.recordClassIndex(65853);
        }

        b(GroupListCell groupListCell) {
            this.f102756a = groupListCell;
        }

        public final void onClick(View view) {
            c cVar;
            IMConversation iMConversation;
            GroupListViewModel groupListViewModel;
            ClickAgent.onClick(view);
            if (this.f102756a.f34234d != null && (cVar = (c) this.f102756a.f34234d) != null && (iMConversation = cVar.f102763a) != null && (groupListViewModel = (GroupListViewModel) this.f102756a.f102755a.getValue()) != null) {
                l.d(iMConversation, "");
                groupListViewModel.f102777c.setValue(iMConversation);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        View view = this.itemView;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) view.findViewById(R.id.ad3);
        l.b(tuxCheckBox, "");
        tuxCheckBox.setVisibility(8);
        e.a((RemoteImageView) view.findViewById(R.id.pf), cVar2.f102763a.getDisplayAvatar());
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.csg);
        l.b(tuxTextView, "");
        tuxTextView.setText(cVar2.f102763a.getDisplayName());
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.al5);
        l.b(tuxTextView2, "");
        Context context = view.getContext();
        l.b(context, "");
        tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.cy, cVar2.f102763a.getConversationMemberCount(), Integer.valueOf(cVar2.f102763a.getConversationMemberCount())));
        l.b(view, "");
        v.a(view);
    }
}
