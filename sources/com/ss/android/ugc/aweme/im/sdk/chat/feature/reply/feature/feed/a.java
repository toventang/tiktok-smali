package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class a extends c implements View.OnClickListener, com.ss.android.ugc.aweme.common.keyboard.c, DetailFeedInputView.a, SearchableEditText.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C2507a f100982c = new C2507a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f100983a;

    /* renamed from: b  reason: collision with root package name */
    public b f100984b;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b f100985d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f100986e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f100987f;

    public interface b {
        static {
            Covode.recordClassIndex(64594);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(64595);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(64592);
    }

    private View a(int i2) {
        if (this.f100987f == null) {
            this.f100987f = new HashMap();
        }
        View view = (View) this.f100987f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f100987f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.a$a  reason: collision with other inner class name */
    public static final class C2507a {
        static {
            Covode.recordClassIndex(64593);
        }

        private C2507a() {
        }

        public /* synthetic */ C2507a(byte b2) {
            this();
        }

        public static a a(i iVar) {
            l.d(iVar, "");
            Fragment a2 = iVar.a("ReplyKeyboardDialogFragment");
            if (a2 != null) {
                return (a) a2;
            }
            return new a();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText.b
    public final void b() {
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView.a
    public final void a() {
        dismiss();
        b bVar = this.f100984b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f100987f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f100986e) {
            dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f100983a = null;
        androidx.lifecycle.i lifecycle = getLifecycle();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar = this.f100985d;
        if (bVar == null) {
            l.a("inputView");
        }
        lifecycle.b(bVar);
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) a(R.id.dl6);
        l.b(measureLinearLayout, "");
        measureLinearLayout.getKeyBoardObservable().b(this);
        dismiss();
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) a(R.id.dl6);
        l.b(measureLinearLayout, "");
        measureLinearLayout.getKeyBoardObservable().a(this);
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        SearchableEditText searchableEditText = (SearchableEditText) a(R.id.coq);
        l.b(searchableEditText, "");
        searchableEditText.setCursorVisible(false);
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.l.a(getActivity(), a(R.id.aso));
        this.f100986e = false;
        c cVar = this.f100983a;
        if (cVar != null) {
            SearchableEditText searchableEditText2 = (SearchableEditText) a(R.id.coq);
            l.b(searchableEditText2, "");
            cVar.a(String.valueOf(searchableEditText2.getText()));
        }
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f100984b = bVar;
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yt);
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f100983a = cVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (l.a(view, a(R.id.dl6))) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        ((MeasureLinearLayout) a(R.id.dl6)).a();
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        l.b(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) a(R.id.dl6);
        l.b(measureLinearLayout, "");
        measureLinearLayout.setKeyBoardObservable(new com.ss.android.ugc.aweme.common.keyboard.b());
        SearchableEditText searchableEditText = (SearchableEditText) a(R.id.coq);
        searchableEditText.setMaxLines(1);
        searchableEditText.setEllipsize(TextUtils.TruncateAt.END);
        TuxIconView tuxIconView = (TuxIconView) a(R.id.e2c);
        l.b(tuxIconView, "");
        tuxIconView.setVisibility(8);
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.dyg);
        l.b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
        MeasureLinearLayout measureLinearLayout2 = (MeasureLinearLayout) a(R.id.dl6);
        l.b(measureLinearLayout2, "");
        DetailFeedInputView detailFeedInputView = new DetailFeedInputView(measureLinearLayout2, getArguments());
        this.f100985d = detailFeedInputView;
        Objects.requireNonNull(detailFeedInputView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedInputView");
        l.d(this, "");
        detailFeedInputView.f100979j = this;
        androidx.lifecycle.i lifecycle = getLifecycle();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b bVar = this.f100985d;
        if (bVar == null) {
            l.a("inputView");
        }
        lifecycle.a(bVar);
        ((MeasureLinearLayout) a(R.id.dl6)).setOnClickListener(this);
        ((SearchableEditText) a(R.id.coq)).setKeyImeChangeListener(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SearchableEditText searchableEditText2 = (SearchableEditText) a(R.id.coq);
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                l.b(searchableEditText2, "");
                searchableEditText2.setHint(charSequence.toString());
            }
            CharSequence charSequence2 = arguments.getCharSequence("text");
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                searchableEditText2.setText(charSequence2);
                searchableEditText2.setSelection(searchableEditText2.length());
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException unused) {
                super.dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final void show(i iVar, String str) {
        super.show(iVar, str);
        this.f100986e = true;
    }

    @Override // com.ss.android.ugc.aweme.common.keyboard.c
    public final void a(boolean z, int i2) {
        if (z) {
            SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView = (SoftInputResizeFuncLayoutView) a(R.id.d1k);
            l.b(softInputResizeFuncLayoutView, "");
            softInputResizeFuncLayoutView.setVisibility(8);
            return;
        }
        SoftInputResizeFuncLayoutView softInputResizeFuncLayoutView2 = (SoftInputResizeFuncLayoutView) a(R.id.d1k);
        l.b(softInputResizeFuncLayoutView2, "");
        softInputResizeFuncLayoutView2.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4u, viewGroup, false);
    }
}
