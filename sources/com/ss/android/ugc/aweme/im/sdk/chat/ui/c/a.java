package com.ss.android.ugc.aweme.im.sdk.chat.ui.c;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.c;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.HashMap;

public final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public BaseChatPanel f101195e;

    /* renamed from: f  reason: collision with root package name */
    private View f101196f;

    /* renamed from: g  reason: collision with root package name */
    private c f101197g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f101198h;

    static {
        Covode.recordClassIndex(64743);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f101198h == null) {
            this.f101198h = new HashMap();
        }
        View view = (View) this.f101198h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f101198h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.f101198h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void c() {
        BaseChatPanel baseChatPanel = this.f101195e;
        if (baseChatPanel != null) {
            baseChatPanel.g();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BaseChatPanel baseChatPanel = this.f101195e;
        if (baseChatPanel != null) {
            getLifecycle().b(baseChatPanel);
        }
        c cVar = this.f101197g;
        if (cVar != null) {
            getLifecycle().b(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.c.a$a  reason: collision with other inner class name */
    static final class C2517a extends m implements b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2517a f101199a = new C2517a();

        static {
            Covode.recordClassIndex(64744);
        }

        C2517a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f101200a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(C2517a.f101199a);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        ac a2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ac.a("enterChatRoom");
        Bundle arguments = getArguments();
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("key_session_info");
        } else {
            serializable = null;
        }
        if (serializable instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.a) {
            aVar = serializable;
        }
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar2 = aVar;
        if (aVar2 == null) {
            requireActivity().finish();
        } else {
            View view2 = this.f101196f;
            if (view2 == null) {
                l.a("rootView");
            }
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) view2.findViewById(R.id.a4z);
            if (aVar2.getChatType() != 3) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar3 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) aVar2;
                View view3 = this.f101196f;
                if (view3 == null) {
                    l.a("rootView");
                }
                this.f101195e = new SingleChatPanel(this, view3, aVar3);
                l.b(imTextTitleBar, "");
                this.f101197g = new SingleChatTitleBarComponent(aVar3, this, imTextTitleBar);
            } else {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar = (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b) aVar2;
                e requireActivity = requireActivity();
                l.b(requireActivity, "");
                l.d(requireActivity, "");
                l.d(bVar, "");
                ad a3 = ae.a(requireActivity, new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.a(bVar));
                String str = "GroupChatViewModel-" + bVar.getConversationId();
                if (GroupChatViewModel.class.equals(ScopeViewModel.class)) {
                    a2 = a3.a(str, GroupChatViewModel.class);
                } else {
                    a2 = a3.a(str, GroupChatViewModel.class);
                    ab.a(a2, a3);
                }
                l.b(a2, "");
                GroupChatViewModel groupChatViewModel = (GroupChatViewModel) a2;
                View view4 = this.f101196f;
                if (view4 == null) {
                    l.a("rootView");
                }
                this.f101195e = new GroupChatPanel(this, view4, bVar, groupChatViewModel);
                l.b(imTextTitleBar, "");
                this.f101197g = new GroupChatTitleBarComponent(groupChatViewModel, this, imTextTitleBar);
            }
            BaseChatPanel baseChatPanel = this.f101195e;
            if (baseChatPanel != null) {
                getLifecycle().a(baseChatPanel);
            }
            c cVar = this.f101197g;
            if (cVar != null) {
                getLifecycle().a(cVar);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ac.b("enterChatRoom");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        BaseChatPanel baseChatPanel = this.f101195e;
        if (baseChatPanel != null) {
            baseChatPanel.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a4q, viewGroup, false);
        l.b(a2, "");
        this.f101196f = a2;
        if (a2 == null) {
            l.a("rootView");
        }
        return a2;
    }
}
