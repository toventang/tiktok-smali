package com.ss.android.ugc.aweme.im.sdk.chat.feature.story;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.common.f.b {

    /* renamed from: b  reason: collision with root package name */
    public static final C2509a f101049b = new C2509a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.l.a f101050a;

    /* renamed from: c  reason: collision with root package name */
    private View f101051c;

    /* renamed from: d  reason: collision with root package name */
    private Aweme f101052d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f101053e;

    static {
        Covode.recordClassIndex(64643);
    }

    public final View a(int i2) {
        if (this.f101053e == null) {
            this.f101053e = new HashMap();
        }
        View view = (View) this.f101053e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f101053e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.story.a$a  reason: collision with other inner class name */
    public static final class C2509a {
        static {
            Covode.recordClassIndex(64644);
        }

        private C2509a() {
        }

        public /* synthetic */ C2509a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f101053e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        String str;
        Editable text;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        com.ss.android.ugc.aweme.im.service.l.a aVar = this.f101050a;
        if (aVar != null) {
            SearchableEditText searchableEditText = (SearchableEditText) a(R.id.coq);
            if (searchableEditText == null || (text = searchableEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            aVar.a(str);
        }
        if (a(R.id.coq) != null && Build.VERSION.SDK_INT < 23) {
            SearchableEditText searchableEditText2 = (SearchableEditText) a(R.id.coq);
            l.b(searchableEditText2, "");
            searchableEditText2.setCursorVisible(false);
        }
    }

    static final class c implements b.AbstractC2490b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101055a;

        static {
            Covode.recordClassIndex(64646);
        }

        c(a aVar) {
            this.f101055a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b.AbstractC2490b
        public final void a(int i2) {
            if (8 == i2) {
                this.f101055a.dismiss();
            }
        }
    }

    static final class d implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101056a;

        static {
            Covode.recordClassIndex(64647);
        }

        d(a aVar) {
            this.f101056a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            com.ss.android.ugc.aweme.im.service.l.a aVar = this.f101056a.f101050a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yp);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101054a;

        static {
            Covode.recordClassIndex(64645);
        }

        b(a aVar) {
            this.f101054a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.c(this.f101054a.a(R.id.d0t));
            this.f101054a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(21);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        User user;
        long j2;
        String str2;
        ShareStoryContent shareStoryContent;
        SearchableEditText searchableEditText;
        String uid;
        Window window;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new d(this));
        }
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("bindAweme");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Aweme)) {
            serializable = null;
        }
        this.f101052d = (Aweme) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("enter_from");
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", str);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_method", "story");
        a(R.id.d0t).setOnClickListener(new b(this));
        Aweme aweme = this.f101052d;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        IMUser fromUser = IMUser.fromUser(user);
        if (user == null || (uid = user.getUid()) == null) {
            j2 = 0;
        } else {
            j2 = Long.parseLong(uid);
        }
        String a2 = b.a.a(j2);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a();
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        aVar.setShareUserId(str2);
        aVar.setFromUser(fromUser);
        boolean z = true;
        if (a2.length() == 0 && user != null) {
            String uid2 = user.getUid();
            l.b(uid2, "");
            a2 = b.a.a(Long.parseLong(uid2));
        }
        aVar.setConversationId(a2);
        aVar.setEnterFrom(0);
        aVar.setChatType(0);
        aVar.setUnreadCount(0);
        Aweme aweme2 = this.f101052d;
        if (aweme2 != null) {
            shareStoryContent = ShareStoryContent.Companion.fromAweme(aweme2);
        } else {
            shareStoryContent = null;
        }
        View view2 = this.f101051c;
        if (view2 == null) {
            l.a("mRootView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view2;
        l.d(viewGroup, "");
        l.d(aVar, "");
        StoryInputView storyInputView = new StoryInputView(viewGroup, aVar, shareStoryContent);
        storyInputView.a(new c(this));
        getLifecycle().a(storyInputView);
        Bundle arguments3 = getArguments();
        if (!(arguments3 == null || (str3 = arguments3.getString("bindInputText")) == null || str3.length() == 0)) {
            z = false;
        }
        if (!z && (searchableEditText = (SearchableEditText) a(R.id.coq)) != null) {
            searchableEditText.setText(str3);
        }
        if (bundle != null) {
            dismiss();
        }
        SearchableEditText searchableEditText2 = (SearchableEditText) a(R.id.coq);
        if (searchableEditText2 != null) {
            searchableEditText2.requestFocus();
        }
        KeyboardUtils.b(a(R.id.coq));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.a4i, viewGroup, false);
        l.b(a2, "");
        this.f101051c = a2;
        if (a2 == null) {
            l.a("mRootView");
        }
        return a2;
    }
}
