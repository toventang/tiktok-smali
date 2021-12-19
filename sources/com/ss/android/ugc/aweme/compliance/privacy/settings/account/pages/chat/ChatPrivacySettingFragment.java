package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.GroupChatViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class ChatPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    public ChatViewModel f77685a;

    /* renamed from: b  reason: collision with root package name */
    public GroupChatViewModel f77686b;

    /* renamed from: c  reason: collision with root package name */
    private a f77687c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.a f77688d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f77689e;

    static {
        Covode.recordClassIndex(48081);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77689e == null) {
            this.f77689e = new SparseArray();
        }
        View view = (View) this.f77689e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77689e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77689e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b> c() {
        com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a[] aVarArr = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a[2];
        a aVar = this.f77687c;
        if (aVar == null) {
            l.a("chatAdapter");
        }
        aVarArr[0] = aVar;
        com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.a aVar2 = this.f77688d;
        if (aVar2 == null) {
            l.a("groupChatAdapter");
        }
        aVarArr[1] = aVar2;
        return n.b(aVarArr);
    }

    static final class a extends m implements h.f.a.b<c, c> {
        final /* synthetic */ ChatPrivacySettingFragment this$0;

        static {
            Covode.recordClassIndex(48082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ChatPrivacySettingFragment chatPrivacySettingFragment) {
            super(1);
            this.this$0 = chatPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show direct message setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "chatsets"));
            ChatViewModel chatViewModel = this.this$0.f77685a;
            if (chatViewModel == null) {
                l.a("chatViewModel");
            }
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", chatViewModel.f77673d.getValue());
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
        }
    }

    static final class b extends m implements h.f.a.b<c, c> {
        final /* synthetic */ ChatPrivacySettingFragment this$0;

        static {
            Covode.recordClassIndex(48083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChatPrivacySettingFragment chatPrivacySettingFragment) {
            super(1);
            this.this$0 = chatPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show group chat setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "group_chat"));
            GroupChatViewModel groupChatViewModel = this.this$0.f77686b;
            if (groupChatViewModel == null) {
                l.a("groupChatViewModel");
            }
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", groupChatViewModel.f77673d.getValue());
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(ChatViewModel.class);
        l.b(a2, "");
        this.f77685a = (ChatViewModel) a2;
        ChatViewModel chatViewModel = this.f77685a;
        if (chatViewModel == null) {
            l.a("chatViewModel");
        }
        this.f77687c = new a(chatViewModel, this);
        ac a3 = new ad(this).a(GroupChatViewModel.class);
        l.b(a3, "");
        this.f77686b = (GroupChatViewModel) a3;
        GroupChatViewModel groupChatViewModel = this.f77686b;
        if (groupChatViewModel == null) {
            l.a("groupChatViewModel");
        }
        this.f77688d = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.a(groupChatViewModel, this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.ne);
        a aVar = this.f77687c;
        if (aVar == null) {
            l.a("chatAdapter");
        }
        String d2 = aVar.d();
        if (d2 == null) {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat.a aVar2 = this.f77688d;
            if (aVar2 == null) {
                l.a("groupChatAdapter");
            }
            d2 = aVar2.d();
        }
        a(d2);
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new a(this));
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new b(this));
    }
}
