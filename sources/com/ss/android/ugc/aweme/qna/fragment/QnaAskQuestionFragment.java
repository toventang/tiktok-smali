package com.ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.model.AskQuestionParam;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@com.bytedance.ies.powerpage.a.a
public final class QnaAskQuestionFragment extends com.bytedance.ies.foundation.fragment.a implements com.bytedance.assem.arch.viewModel.h, KeyboardUtils.a {

    /* renamed from: j  reason: collision with root package name */
    public static final b f119371j = new b((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    c f119372e;

    /* renamed from: f  reason: collision with root package name */
    public final IQAInvitationService f119373f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends User> f119374g;

    /* renamed from: h  reason: collision with root package name */
    public List<? extends IMUser> f119375h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f119376i;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f119377k = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f119378l = h.i.a((h.f.a.a) new n(this));

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.a.a f119379m = new com.bytedance.assem.a.a(ab.a(QnaCreationViewModel.class), null, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.c.f25670a, a.INSTANCE, u.a((Fragment) this, true), u.b((Fragment) this, true));
    private Runnable n;
    private SparseArray o;

    public static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.qna.vm.g, com.ss.android.ugc.aweme.qna.vm.g> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(77515);
        }

        public a() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.qna.vm.g invoke(com.ss.android.ugc.aweme.qna.vm.g gVar) {
            h.f.b.l.c(gVar, "");
            return gVar;
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(77517);
        }
    }

    static {
        Covode.recordClassIndex(77514);
    }

    private final QnaCreationViewModel h() {
        return (QnaCreationViewModel) this.f119379m.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.o == null) {
            this.o = new SparseArray();
        }
        View view = (View) this.o.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void c() {
    }

    public final AskQuestionParam d() {
        return (AskQuestionParam) this.f119377k.getValue();
    }

    public final AskQuestionParam e() {
        return (AskQuestionParam) this.f119378l.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(77516);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public static final class s implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f119400b;

        static {
            Covode.recordClassIndex(77539);
        }

        s(QnaAskQuestionFragment qnaAskQuestionFragment, h.f.a.a aVar) {
            this.f119399a = qnaAskQuestionFragment;
            this.f119400b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f119400b.invoke();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119390a;

        static {
            Covode.recordClassIndex(77530);
        }

        l(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119390a = qnaAskQuestionFragment;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119390a.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f119390a.getContext()).a(R.string.de8).a();
            } else {
                this.f119390a.a(new h.f.a.a<z>(this.f119390a) {
                    /* class com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.l.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(77531);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
                        qnaAskQuestionFragment.g();
                        androidx.fragment.app.e activity = qnaAskQuestionFragment.getActivity();
                        if (activity != null) {
                            IQAInvitationService iQAInvitationService = qnaAskQuestionFragment.f119373f;
                            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
                            String enterFrom = qnaAskQuestionFragment.e().getEnterFrom();
                            if (enterFrom == null) {
                                enterFrom = "";
                            }
                            iQAInvitationService.a(activity, "ask_textual_question", enterFrom, com.ss.android.ugc.aweme.qainvitation.e.e.NEW_QUESTION, null, null, qnaAskQuestionFragment.f119375h, new m(qnaAskQuestionFragment));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119395a;

        static {
            Covode.recordClassIndex(77537);
        }

        q(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119395a = qnaAskQuestionFragment;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            ((TuxButton) this.f119395a.a(R.id.mf)).callOnClick();
        }
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a(false);
        j();
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f119380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119381b;

        static {
            Covode.recordClassIndex(77520);
        }

        f(String str, QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119380a = str;
            this.f119381b = qnaAskQuestionFragment;
        }

        public final void run() {
            TuxEditText tuxEditText = (TuxEditText) this.f119381b.a(R.id.mh);
            if (tuxEditText != null) {
                tuxEditText.setSelection(this.f119380a.length(), this.f119380a.length());
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ QnaAskQuestionFragment this$0;

        static {
            Covode.recordClassIndex(77521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(0);
            this.this$0 = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            KeyboardUtils.c(this.this$0.a(R.id.mh));
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<AskQuestionParam> {
        final /* synthetic */ QnaAskQuestionFragment this$0;

        static {
            Covode.recordClassIndex(77533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(0);
            this.this$0 = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AskQuestionParam invoke() {
            AskQuestionParam d2 = this.this$0.d();
            if (d2 == null) {
                return new AskQuestionParam(null, null, null, null, null, false, false, false, null, 511, null);
            }
            return d2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f119394b = true;

        static {
            Covode.recordClassIndex(77536);
        }

        p(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119393a = qnaAskQuestionFragment;
        }

        public final void run() {
            TuxEditText tuxEditText = (TuxEditText) this.f119393a.a(R.id.mh);
            if (tuxEditText == null) {
                return;
            }
            if (this.f119394b) {
                tuxEditText.requestFocus();
                KeyboardUtils.b(tuxEditText);
                return;
            }
            KeyboardUtils.c(tuxEditText);
        }
    }

    private final void j() {
        TuxEditText tuxEditText = (TuxEditText) a(R.id.mh);
        if (tuxEditText != null) {
            tuxEditText.postDelayed(new p(this), 100);
        }
    }

    public static final class k implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public String f119385a = "";

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119386b;

        static {
            Covode.recordClassIndex(77528);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f119387a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f119388b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f119389c;

            static {
                Covode.recordClassIndex(77529);
            }

            a(int i2, int i3, k kVar) {
                this.f119387a = i2;
                this.f119388b = i3;
                this.f119389c = kVar;
            }

            public final void run() {
                try {
                    ((TuxEditText) this.f119389c.f119386b.a(R.id.mh)).setSelection(this.f119387a, this.f119388b);
                    h.q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    h.q.m223constructorimpl(h.r.a(th));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119386b = qnaAskQuestionFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (!h.f.b.l.a((Object) str, (Object) this.f119386b.e().getQuestion())) {
                this.f119386b.f119376i = true;
            }
            if (editable != null) {
                String replace = new h.m.l("(?m)\t*\r?\n").replace(editable, "");
                TuxEditText tuxEditText = (TuxEditText) this.f119386b.a(R.id.mh);
                h.f.b.l.b(tuxEditText, "");
                int i2 = 0;
                if (tuxEditText.getLineCount() > 10) {
                    TuxEditText tuxEditText2 = (TuxEditText) this.f119386b.a(R.id.mh);
                    h.f.b.l.b(tuxEditText2, "");
                    int selectionStart = tuxEditText2.getSelectionStart();
                    TuxEditText tuxEditText3 = (TuxEditText) this.f119386b.a(R.id.mh);
                    h.f.b.l.b(tuxEditText3, "");
                    if (selectionStart != tuxEditText3.getSelectionEnd() || selectionStart >= replace.length() || selectionStart <= 0) {
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        replace = replace.substring(0, replace.length() - 1);
                        h.f.b.l.b(replace, "");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        String substring = replace.substring(0, selectionStart - 1);
                        h.f.b.l.b(substring, "");
                        StringBuilder append = sb.append(substring);
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = replace.substring(selectionStart);
                        h.f.b.l.b(substring2, "");
                        replace = append.append(substring2).toString();
                    }
                    ((TuxEditText) this.f119386b.a(R.id.mh)).setText(replace);
                    TuxEditText tuxEditText4 = (TuxEditText) this.f119386b.a(R.id.mh);
                    TuxEditText tuxEditText5 = (TuxEditText) this.f119386b.a(R.id.mh);
                    h.f.b.l.b(tuxEditText5, "");
                    Editable text = tuxEditText5.getText();
                    if (text != null) {
                        i2 = text.length();
                    }
                    tuxEditText4.setSelection(i2);
                } else if (!h.f.b.l.a((Object) replace, (Object) editable.toString())) {
                    ((TuxEditText) this.f119386b.a(R.id.mh)).setText(replace);
                    TuxEditText tuxEditText6 = (TuxEditText) this.f119386b.a(R.id.mh);
                    TuxEditText tuxEditText7 = (TuxEditText) this.f119386b.a(R.id.mh);
                    h.f.b.l.b(tuxEditText7, "");
                    Editable text2 = tuxEditText7.getText();
                    if (text2 != null) {
                        i2 = text2.length();
                    }
                    tuxEditText6.setSelection(i2);
                }
                this.f119385a = replace;
                QnaAskQuestionFragment qnaAskQuestionFragment = this.f119386b;
                Objects.requireNonNull(replace, "null cannot be cast to non-null type kotlin.CharSequence");
                qnaAskQuestionFragment.b(h.m.p.b((CharSequence) replace).toString().length());
                QnaAskQuestionFragment qnaAskQuestionFragment2 = this.f119386b;
                String str2 = this.f119385a;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                qnaAskQuestionFragment2.c(h.m.p.b((CharSequence) str2).toString().length());
                TuxEditText tuxEditText8 = (TuxEditText) this.f119386b.a(R.id.mh);
                h.f.b.l.b(tuxEditText8, "");
                int selectionStart2 = tuxEditText8.getSelectionStart();
                TuxEditText tuxEditText9 = (TuxEditText) this.f119386b.a(R.id.mh);
                h.f.b.l.b(tuxEditText9, "");
                int selectionEnd = tuxEditText9.getSelectionEnd();
                if (EOYServiceImpl.b().a((TextView) this.f119386b.a(R.id.mh))) {
                    ((TuxEditText) this.f119386b.a(R.id.mh)).post(new a(selectionStart2, selectionEnd, this));
                }
            }
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f119397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f119398c;

        static {
            Covode.recordClassIndex(77538);
        }

        r(QnaAskQuestionFragment qnaAskQuestionFragment, User user, View view) {
            this.f119396a = qnaAskQuestionFragment;
            this.f119397b = user;
            this.f119398c = view;
        }

        public final void run() {
            Resources resources;
            String string;
            Context context = this.f119396a.getContext();
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.f4d, in.b(this.f119397b))) != null) {
                Context context2 = this.f119396a.getContext();
                if (context2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(context2, "");
                h.f.b.l.b(string, "");
                ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(context2).b(this.f119398c).a(com.bytedance.tux.tooltip.h.TOP)).a(string).a(3000L).b(false).a().d().a();
            }
        }
    }

    public QnaAskQuestionFragment() {
        IQAInvitationService b2 = QAInvitationService.b();
        h.f.b.l.b(b2, "");
        this.f119373f = b2;
        this.f119374g = new ArrayList();
        this.f119375h = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        ArrayList arrayList;
        List<? extends IMUser> list = this.f119375h;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                String uid = t.getUid();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (!h.f.b.l.a((Object) uid, (Object) g2.getCurUserId())) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.f119375h = arrayList;
        List<? extends User> list2 = this.f119374g;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : list2) {
                String uid2 = t2.getUid();
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                if (!h.f.b.l.a((Object) uid2, (Object) g3.getCurUserId())) {
                    arrayList4.add(t2);
                }
            }
            arrayList2 = arrayList4;
        }
        this.f119374g = arrayList2;
        a(arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void b() {
        ArrayList<User> invitedUsers;
        User user;
        ArrayList<User> invitedUsers2 = e().getInvitedUsers();
        if (invitedUsers2 != null && !invitedUsers2.isEmpty()) {
            Keva repo = Keva.getRepo("question_repo");
            StringBuilder sb = new StringBuilder("ask_question_invite_message_show");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), true) && (invitedUsers = e().getInvitedUsers()) != null && (user = invitedUsers.get(0)) != null) {
                MultiAvatarView multiAvatarView = (MultiAvatarView) a(R.id.br9);
                h.f.b.l.b(multiAvatarView, "");
                h.f.b.l.b(user, "");
                r rVar = new r(this, user, multiAvatarView);
                this.n = rVar;
                multiAvatarView.postDelayed(rVar, 300);
                Keva repo2 = Keva.getRepo("question_repo");
                StringBuilder sb2 = new StringBuilder("ask_question_invite_message_show");
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                repo2.storeBoolean(sb2.append(g3.getCurUserId()).toString(), false);
            }
        }
    }

    public final void f() {
        String str;
        String enterMethod;
        TuxEditText tuxEditText = (TuxEditText) a(R.id.mh);
        if (tuxEditText != null) {
            tuxEditText.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = i();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                new com.ss.android.ugc.aweme.tux.a.i.a(tuxEditText.getContext()).a(R.string.de8).a();
                return;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            String str2 = "";
            h.f.b.l.b(g2, str2);
            if (!g2.isLogin()) {
                AskQuestionParam d2 = d();
                if (d2 == null || (str = d2.getEnterFrom()) == null) {
                    str = str2;
                }
                AskQuestionParam d3 = d();
                if (!(d3 == null || (enterMethod = d3.getEnterMethod()) == null)) {
                    str2 = enterMethod;
                }
                com.ss.android.ugc.aweme.login.c.a(this, str, str2, new q(this));
                return;
            }
            TuxButton tuxButton = (TuxButton) a(R.id.mf);
            if (tuxButton != null) {
                tuxButton.setLoading(true);
            }
            TuxButton tuxButton2 = (TuxButton) a(R.id.mf);
            if (tuxButton2 != null) {
                tuxButton2.setClickable(false);
            }
            TuxButton tuxButton3 = (TuxButton) a(R.id.mg);
            if (tuxButton3 != null) {
                tuxButton3.setClickable(false);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.mi);
            if (constraintLayout != null) {
                constraintLayout.setClickable(false);
            }
            String valueOf = String.valueOf(tuxEditText.getText());
            g();
            if (this.f119372e == null) {
                String replace = new h.m.l("(?m)^[ \t]*\r?\n").replace(valueOf, str2);
                Objects.requireNonNull(replace, "null cannot be cast to non-null type kotlin.CharSequence");
                if (h.m.p.b((CharSequence) replace).toString().length() == 0) {
                    a(true);
                    return;
                }
                QnaCreationViewModel h2 = h();
                CharSequence b2 = h.m.p.b((CharSequence) valueOf);
                List<? extends User> list = this.f119374g;
                h.f.b.l.d(b2, str2);
                h2.a(QnaCreationViewModel.a.f119631a);
                try {
                    String a2 = QnaCreationViewModel.a(list);
                    com.ss.android.ugc.aweme.qna.d.f fVar = h2.f119630j.f119324b;
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, str2);
                    String curUserId = g3.getCurUserId();
                    h.f.b.l.b(curUserId, str2);
                    Long g4 = h.m.p.g(curUserId);
                    String obj = b2.toString();
                    h.f.b.l.b(a2, str2);
                    f.a.b.b a3 = fVar.a(g4, obj, a2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new QnaCreationViewModel.b(h2), new QnaCreationViewModel.c(h2));
                    h.f.b.l.b(a3, str2);
                    h2.a(a3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119382a;

        static {
            Covode.recordClassIndex(77522);
        }

        h(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119382a = qnaAskQuestionFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119382a.a(new h.f.a.a<z>(this.f119382a) {
                /* class com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77523);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ArrayList arrayList;
                    QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
                    qnaAskQuestionFragment.g();
                    TuxEditText tuxEditText = (TuxEditText) qnaAskQuestionFragment.a(R.id.mh);
                    if (tuxEditText != null) {
                        if (qnaAskQuestionFragment.f119372e == null) {
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g2, "");
                            String curUserId = g2.getCurUserId();
                            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g3, "");
                            String e2 = in.e(g3.getCurUser());
                            IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g4, "");
                            String avatarUrl = g4.getAvatarUrl();
                            IAccountUserService g5 = com.ss.android.ugc.aweme.account.b.g();
                            h.f.b.l.b(g5, "");
                            String curSecUserId = g5.getCurSecUserId();
                            List<? extends User> list = qnaAskQuestionFragment.f119374g;
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    String uid = it.next().getUid();
                                    h.f.b.l.b(uid, "");
                                    arrayList2.add(Long.valueOf(Long.parseLong(uid)));
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            Context context = tuxEditText.getContext();
                            if (context != null) {
                                CommentService e3 = CommentServiceImpl.e();
                                h.f.b.l.b(curUserId, "");
                                long parseLong = Long.parseLong(curUserId);
                                UrlModel urlModel = new UrlModel();
                                urlModel.setUri(avatarUrl);
                                urlModel.setUrlList(h.a.n.a(avatarUrl));
                                String valueOf = String.valueOf(tuxEditText.getText());
                                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                                String obj = h.m.p.b((CharSequence) valueOf).toString();
                                if (arrayList == null) {
                                    arrayList = h.a.z.INSTANCE;
                                }
                                e3.a(context, new QaStruct(0, parseLong, 0, urlModel, e2, obj, curSecUserId, arrayList, null, 261, null), qnaAskQuestionFragment.e().getEnterFrom(), "ask_textual_question", "question");
                            }
                        } else if (qnaAskQuestionFragment.f119372e != null) {
                            String.valueOf(tuxEditText.getText());
                        }
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119383a;

        static {
            Covode.recordClassIndex(77524);
        }

        i(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119383a = qnaAskQuestionFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119383a.a(new h.f.a.a<z>(this.f119383a) {
                /* class com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77525);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ((QnaAskQuestionFragment) this.receiver).f();
                    return z.f158842a;
                }
            });
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f119391a = new o();

        static {
            Covode.recordClassIndex(77534);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            h.f.b.l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f119392a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        a(o.f119391a);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ QnaAskQuestionFragment this$0;

        static {
            Covode.recordClassIndex(77519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.this$0 = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            int i2;
            h.f.b.l.d(th, "");
            String enterFrom = this.this$0.e().getEnterFrom();
            List<? extends User> list = this.this$0.f119374g;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.qna.f.a.a(enterFrom, "ask_textual_question", 0L, Integer.valueOf(i2), 0);
            this.this$0.a(true);
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<List<? extends IMUser>, z> {
        final /* synthetic */ QnaAskQuestionFragment this$0;

        static {
            Covode.recordClassIndex(77532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.this$0 = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends IMUser> list) {
            QnaAskQuestionFragment qnaAskQuestionFragment;
            List<? extends User> list2;
            List<? extends IMUser> list3 = list;
            h.f.b.l.d(list3, "");
            List<User> b2 = this.this$0.f119373f.b(list3);
            boolean z = !h.f.b.l.a(this.this$0.f119374g, b2);
            this.this$0.f119374g = b2;
            this.this$0.f119375h = list3;
            QnaAskQuestionFragment qnaAskQuestionFragment2 = this.this$0;
            qnaAskQuestionFragment2.a(qnaAskQuestionFragment2.f119374g);
            if (z && (list2 = (qnaAskQuestionFragment = this.this$0).f119374g) != null) {
                if (list2.size() == 1) {
                    new com.bytedance.tux.g.b(qnaAskQuestionFragment).a(qnaAskQuestionFragment.getResources().getString(R.string.f4o, in.b((User) list2.get(0)))).b();
                } else if (list2.size() > 1) {
                    new com.bytedance.tux.g.b(qnaAskQuestionFragment).a(qnaAskQuestionFragment.getResources().getString(R.string.f4n, in.b((User) list2.get(0)), Integer.valueOf(list2.size() - 1))).b();
                }
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.question.model.a, z> {
        final /* synthetic */ QnaAskQuestionFragment this$0;

        static {
            Covode.recordClassIndex(77518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.this$0 = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.question.model.a aVar) {
            String str;
            Editable text;
            com.ss.android.ugc.aweme.question.model.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            TuxEditText tuxEditText = (TuxEditText) this.this$0.a(R.id.mh);
            if (tuxEditText == null || (text = tuxEditText.getText()) == null) {
                str = null;
            } else {
                str = text.toString();
            }
            int i2 = 0;
            if (!h.f.b.l.a((Object) this.this$0.e().getEnterFrom(), (Object) "eoy_hub") || !h.f.b.l.a((Object) this.this$0.e().getEnterMethod(), (Object) "click_header") || str == null || str.length() == 0 || !EOYServiceImpl.b().a(str)) {
                SmartRouter.buildRoute(this.this$0.getActivity(), "//qna/detail/").withParam("id", String.valueOf(aVar2.f120009a)).withParam("question_type", "textual").withParam("enter_from", this.this$0.e().getEnterFrom()).withParam("enter_method", "ask_question").open();
                String enterFrom = this.this$0.e().getEnterFrom();
                String enterMethod = this.this$0.e().getEnterMethod();
                Long valueOf = Long.valueOf(aVar2.f120009a);
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (enterFrom != null) {
                    dVar.a("enter_from", enterFrom);
                }
                if (enterMethod != null) {
                    dVar.a("enter_method", enterMethod);
                }
                if (valueOf != null) {
                    dVar.a("question_id", valueOf.longValue());
                }
                dVar.a("question_type", "textual");
                com.ss.android.ugc.aweme.common.r.a("post_question", dVar.f66730a);
                String enterFrom2 = this.this$0.e().getEnterFrom();
                Long valueOf2 = Long.valueOf(aVar2.f120009a);
                List<? extends User> list = this.this$0.f119374g;
                if (list != null) {
                    i2 = list.size();
                }
                com.ss.android.ugc.aweme.qna.f.a.a(enterFrom2, "ask_textual_question", valueOf2, Integer.valueOf(i2), 1);
            } else {
                KeyboardUtils.c(this.this$0.a(R.id.mh));
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.setResult(-1, new Intent().putExtra("question_id", String.valueOf(aVar2.f120009a)).putExtra("question_text", str));
                }
            }
            androidx.fragment.app.e activity2 = this.this$0.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            return z.f158842a;
        }
    }

    public final void b(int i2) {
        int i3 = 8;
        if (1 <= i2 && 5 > i2) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.me);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            TuxButton tuxButton = (TuxButton) a(R.id.mg);
            if (tuxButton != null) {
                tuxButton.setEnabled(true);
            }
            TuxButton tuxButton2 = (TuxButton) a(R.id.mg);
            if (tuxButton2 != null) {
                tuxButton2.setIconTintColorRes(R.attr.bc);
            }
            TuxButton tuxButton3 = (TuxButton) a(R.id.mf);
            if (tuxButton3 != null) {
                tuxButton3.setEnabled(false);
            }
        } else if (5 <= i2 && 150 >= i2) {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.me);
            if (tuxTextView2 != null) {
                if (i2 >= 130) {
                    i3 = 0;
                }
                tuxTextView2.setVisibility(i3);
            }
            TuxButton tuxButton4 = (TuxButton) a(R.id.mg);
            if (tuxButton4 != null) {
                tuxButton4.setEnabled(true);
            }
            TuxButton tuxButton5 = (TuxButton) a(R.id.mg);
            if (tuxButton5 != null) {
                tuxButton5.setIconTintColorRes(R.attr.bc);
            }
            TuxButton tuxButton6 = (TuxButton) a(R.id.mf);
            if (tuxButton6 != null) {
                tuxButton6.setEnabled(this.f119376i);
            }
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.me);
            if (tuxTextView3 != null) {
                if (i2 != 0) {
                    i3 = 0;
                }
                tuxTextView3.setVisibility(i3);
            }
            TuxButton tuxButton7 = (TuxButton) a(R.id.mg);
            if (tuxButton7 != null) {
                tuxButton7.setEnabled(false);
            }
            TuxButton tuxButton8 = (TuxButton) a(R.id.mg);
            if (tuxButton8 != null) {
                tuxButton8.setIconTintColorRes(R.attr.bd);
            }
            TuxButton tuxButton9 = (TuxButton) a(R.id.mf);
            if (tuxButton9 != null) {
                tuxButton9.setEnabled(false);
            }
        }
    }

    public final void c(int i2) {
        ForegroundColorSpan foregroundColorSpan;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        ForegroundColorSpan foregroundColorSpan2;
        Resources resources5;
        ForegroundColorSpan foregroundColorSpan3;
        Resources resources6;
        String valueOf = String.valueOf(i2);
        ForegroundColorSpan foregroundColorSpan4 = null;
        if (!gb.a(getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf + "/150");
            if (i2 > 150 || i2 <= 0) {
                Context context = getContext();
                if (context == null || (resources5 = context.getResources()) == null) {
                    foregroundColorSpan2 = null;
                } else {
                    foregroundColorSpan2 = new ForegroundColorSpan(resources5.getColor(R.color.ly));
                }
                spannableStringBuilder.setSpan(foregroundColorSpan2, 0, valueOf.length(), 18);
            } else {
                Context context2 = getContext();
                if (context2 == null || (resources6 = context2.getResources()) == null) {
                    foregroundColorSpan3 = null;
                } else {
                    foregroundColorSpan3 = new ForegroundColorSpan(resources6.getColor(R.color.c5));
                }
                spannableStringBuilder.setSpan(foregroundColorSpan3, 0, valueOf.length(), 18);
            }
            Context context3 = getContext();
            if (!(context3 == null || (resources4 = context3.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources4.getColor(R.color.c5));
            }
            spannableStringBuilder.setSpan(foregroundColorSpan4, valueOf.length(), spannableStringBuilder.length(), 18);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.me);
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("150/" + valueOf);
        Context context4 = getContext();
        if (context4 == null || (resources3 = context4.getResources()) == null) {
            foregroundColorSpan = null;
        } else {
            foregroundColorSpan = new ForegroundColorSpan(resources3.getColor(R.color.c5));
        }
        spannableStringBuilder2.setSpan(foregroundColorSpan, 0, 4, 18);
        if (i2 > 150 || i2 <= 0) {
            Context context5 = getContext();
            if (!(context5 == null || (resources = context5.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources.getColor(R.color.ly));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        } else {
            Context context6 = getContext();
            if (!(context6 == null || (resources2 = context6.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources2.getColor(R.color.c5));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.me);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(spannableStringBuilder2);
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        String str = "";
        h.f.b.l.b(g2, str);
        if (!g2.isLogin()) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                String enterFrom = e().getEnterFrom();
                if (enterFrom == null) {
                    enterFrom = str;
                }
                String enterMethod = e().getEnterMethod();
                if (enterMethod != null) {
                    str = enterMethod;
                }
                com.ss.android.ugc.aweme.login.c.a(activity, enterFrom, str, new s(this, aVar));
                return;
            }
            return;
        }
        aVar.invoke();
    }

    public final void a(List<? extends User> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MultiAvatarView multiAvatarView = (MultiAvatarView) a(R.id.br9);
            if (multiAvatarView != null) {
                multiAvatarView.setVisibility(8);
            }
            TuxTextView tuxTextView = (TuxTextView) a(R.id.br_);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                return;
            }
            return;
        }
        MultiAvatarView multiAvatarView2 = (MultiAvatarView) a(R.id.br9);
        if (multiAvatarView2 != null) {
            multiAvatarView2.setVisibility(0);
        }
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.br_);
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        }
        MultiAvatarView multiAvatarView3 = (MultiAvatarView) a(R.id.br9);
        if (multiAvatarView3 != null) {
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            multiAvatarView3.a(a2, h.g.a.a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
        }
        MultiAvatarView multiAvatarView4 = (MultiAvatarView) a(R.id.br9);
        if (multiAvatarView4 != null) {
            multiAvatarView4.a(list, (long) list.size());
        }
    }

    public final void a(boolean z) {
        Integer num;
        int i2;
        int i3;
        Editable text;
        TuxEditText tuxEditText = (TuxEditText) a(R.id.mh);
        if (tuxEditText == null || (text = tuxEditText.getText()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(text.length());
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        b(i2);
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        c(i3);
        TuxButton tuxButton = (TuxButton) a(R.id.mf);
        if (tuxButton != null) {
            tuxButton.setLoading(false);
        }
        TuxButton tuxButton2 = (TuxButton) a(R.id.mf);
        if (tuxButton2 != null) {
            tuxButton2.setClickable(true);
        }
        TuxButton tuxButton3 = (TuxButton) a(R.id.mg);
        if (tuxButton3 != null) {
            tuxButton3.setClickable(true);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.mi);
        if (constraintLayout != null) {
            constraintLayout.setClickable(true);
        }
        if (z) {
            new com.bytedance.tux.g.b(this).e(R.string.f3q).b();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        TuxNavBar tuxNavBar;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        int i2 = 0;
        if (!(context == null || (tuxNavBar = (TuxNavBar) a(R.id.mj)) == null)) {
            TuxNavBar.a aVar = new TuxNavBar.a();
            com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
            a2.f45194b = true;
            TuxNavBar.a a3 = aVar.a(a2.a((h.f.a.a<z>) new g(this)));
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            String string = context.getString(R.string.f3o);
            h.f.b.l.b(string, "");
            TuxNavBar.a a4 = a3.a(gVar.a(string));
            a4.f45188d = true;
            tuxNavBar.setNavActions(a4);
        }
        TuxButton tuxButton = (TuxButton) a(R.id.mg);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new h(this));
        }
        TuxButton tuxButton2 = (TuxButton) a(R.id.mf);
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new i(this));
        }
        TuxEditText tuxEditText = (TuxEditText) a(R.id.mh);
        if (tuxEditText != null) {
            tuxEditText.setRawInputType(1);
        }
        TuxEditText tuxEditText2 = (TuxEditText) a(R.id.mh);
        if (tuxEditText2 != null) {
            tuxEditText2.setOnEditorActionListener(new j(this));
        }
        TuxEditText tuxEditText3 = (TuxEditText) a(R.id.mh);
        if (tuxEditText3 != null) {
            tuxEditText3.addTextChangedListener(new k(this));
        }
        ((ConstraintLayout) a(R.id.mi)).setOnClickListener(new l(this));
        a(false);
        j();
        AskQuestionParam e2 = e();
        String enterFrom = e2.getEnterFrom();
        String enterMethod = e2.getEnterMethod();
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (enterFrom != null) {
            dVar.a("enter_from", enterFrom);
        }
        if (enterMethod != null) {
            dVar.a("enter_method", enterMethod);
        }
        com.ss.android.ugc.aweme.common.r.a("ask_question", dVar.f66730a);
        String question = e2.getQuestion();
        if (question != null && question.length() > 0 && question.length() <= 150) {
            TuxEditText tuxEditText4 = (TuxEditText) a(R.id.mh);
            if (tuxEditText4 != null) {
                tuxEditText4.setText(question);
            }
            TuxEditText tuxEditText5 = (TuxEditText) a(R.id.mh);
            if (tuxEditText5 != null) {
                tuxEditText5.post(new f(question, this));
            }
        }
        ArrayList<User> invitedUsers = e2.getInvitedUsers();
        if (invitedUsers != null && (!invitedUsers.isEmpty())) {
            this.f119374g = invitedUsers;
            this.f119375h = this.f119373f.a(invitedUsers);
        }
        String bannerText = e2.getBannerText();
        if (!(bannerText == null || bannerText.length() <= 0 || (tuxTextView = (TuxTextView) a(R.id.mb)) == null)) {
            tuxTextView.setText(bannerText);
        }
        if (e2.getBannerShow()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.mc);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            String bannerText2 = e2.getBannerText();
            if (bannerText2 == null || bannerText2.length() == 0) {
                Keva repo = Keva.getRepo("question_repo");
                StringBuilder sb = new StringBuilder("ask_question_banner_message_show");
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (repo.getBoolean(sb.append(g2.getCurUserId()).toString(), true)) {
                    Keva repo2 = Keva.getRepo("question_repo");
                    StringBuilder sb2 = new StringBuilder("ask_question_banner_message_show");
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    repo2.storeBoolean(sb2.append(g3.getCurUserId()).toString(), false);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.mc);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                }
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) a(R.id.mc);
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        }
        TuxButton tuxButton3 = (TuxButton) a(R.id.mg);
        if (tuxButton3 != null) {
            if (!e2.getRecordShow()) {
                i2 = 8;
            }
            tuxButton3.setVisibility(i2);
        }
        if (e2.getAutoInvite()) {
            ((ConstraintLayout) a(R.id.mi)).callOnClick();
        }
        a(this.f119374g);
        AssemViewModel.a(h(), l.f119433a, com.bytedance.assem.arch.viewModel.l.a(), new e(this), null, new d(this), 8);
        KeyboardUtils.a(this, getView(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.arg, viewGroup, false);
    }

    static final class j implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QnaAskQuestionFragment f119384a;

        static {
            Covode.recordClassIndex(77526);
        }

        j(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f119384a = qnaAskQuestionFragment;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 6) {
                return false;
            }
            TuxButton tuxButton = (TuxButton) this.f119384a.a(R.id.mf);
            h.f.b.l.b(tuxButton, "");
            if (!tuxButton.isEnabled()) {
                return false;
            }
            TuxButton tuxButton2 = (TuxButton) this.f119384a.a(R.id.mf);
            h.f.b.l.b(tuxButton2, "");
            if (!tuxButton2.isClickable()) {
                return false;
            }
            this.f119384a.a(new h.f.a.a<z>(this.f119384a) {
                /* class com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.j.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(77527);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    ((QnaAskQuestionFragment) this.receiver).f();
                    return z.f158842a;
                }
            });
            return true;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<com.bytedance.assem.arch.extensions.s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
