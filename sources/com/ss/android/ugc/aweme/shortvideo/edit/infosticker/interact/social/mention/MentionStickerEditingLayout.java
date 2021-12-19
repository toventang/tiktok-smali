package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.shortvideo.util.bn;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MentionStickerEditingLayout extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b<User> {

    /* renamed from: l  reason: collision with root package name */
    public boolean f127661l = com.ss.android.ugc.aweme.tools.c.a(getContext());

    /* renamed from: m  reason: collision with root package name */
    public a f127662m;
    private final InputFilter n = d.f127666a;
    private final InputFilter o = new c(this);

    static {
        Covode.recordClassIndex(83692);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final Animator a() {
        a aVar = this.f127662m;
        if (aVar == null) {
            l.a("mMentionSearchListView");
        }
        return ObjectAnimator.ofFloat(aVar, "alpha", 1.0f, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d<User> b() {
        Context context = getContext();
        l.b(context, "");
        c cVar = new c(context);
        SocialTouchableEditText mEditTextView = cVar.getMEditTextView();
        Typeface customTypeface = getCustomTypeface();
        if (customTypeface != null) {
            mEditTextView.setTypeface(customTypeface);
        }
        mEditTextView.setFilters(new InputFilter[]{this.n, this.o});
        mEditTextView.addTextChangedListener(new a(this));
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void c() {
        User user;
        SocialTouchableEditText mEditTextView;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView = getMInputView();
        Editable editable = null;
        if (mInputView != null) {
            user = (User) mInputView.getCurModel();
        } else {
            user = null;
        }
        a aVar = this.f127662m;
        if (aVar == null) {
            l.a("mMentionSearchListView");
        }
        aVar.setSelectedUser$tools_camera_edit_release(user);
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView2 = getMInputView();
        if (!(mInputView2 == null || (mEditTextView = mInputView2.getMEditTextView()) == null)) {
            editable = mEditTextView.getText();
        }
        a(String.valueOf(editable));
    }

    public final void setRtlState(boolean z) {
        this.f127661l = z;
    }

    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MentionStickerEditingLayout f127663a;

        static {
            Covode.recordClassIndex(83693);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        a(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f127663a = mentionStickerEditingLayout;
        }

        public final void afterTextChanged(Editable editable) {
            User user;
            String str = "";
            l.d(editable, str);
            String obj = editable.toString();
            boolean z = false;
            if (obj.length() == 0) {
                MentionStickerEditingLayout mentionStickerEditingLayout = this.f127663a;
                if (com.ss.android.ugc.aweme.tools.c.a(mentionStickerEditingLayout.getContext())) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView = mentionStickerEditingLayout.getMInputView();
                    if (mInputView != null) {
                        mInputView.f();
                    }
                    z = true;
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView2 = mentionStickerEditingLayout.getMInputView();
                    if (mInputView2 != null) {
                        mInputView2.e();
                    }
                }
                mentionStickerEditingLayout.f127661l = z;
            } else if (e.a(obj)) {
                if (!this.f127663a.f127661l) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView3 = this.f127663a.getMInputView();
                    if (mInputView3 != null) {
                        mInputView3.f();
                    }
                    this.f127663a.setRtlState(true);
                }
            } else if (this.f127663a.f127661l) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView4 = this.f127663a.getMInputView();
                if (mInputView4 != null) {
                    mInputView4.e();
                }
                this.f127663a.setRtlState(false);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView5 = this.f127663a.getMInputView();
            if (mInputView5 != null) {
                mInputView5.a(true);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView6 = this.f127663a.getMInputView();
            if (mInputView6 != null) {
                user = (User) mInputView6.getCurModel();
            } else {
                user = null;
            }
            if (!l.a((Object) bn.a(user), (Object) obj)) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView7 = this.f127663a.getMInputView();
                if (mInputView7 != null) {
                    User user2 = new User();
                    if (obj != null) {
                        str = obj;
                    }
                    user2.setUniqueId(str);
                    a aVar = this.f127663a.f127662m;
                    if (aVar == null) {
                        l.a("mMentionSearchListView");
                    }
                    aVar.setSelectedUser$tools_camera_edit_release(user2);
                    mInputView7.setCurModel(user2);
                }
                if (this.f127663a.getMInputView() != null) {
                    this.f127663a.a(obj);
                }
            }
        }
    }

    public static final class b implements a.AbstractC3321a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MentionStickerEditingLayout f127664a;

        static {
            Covode.recordClassIndex(83694);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f127664a = mentionStickerEditingLayout;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.AbstractC3321a
        public final void a(User user) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView = this.f127664a.getMInputView();
            if (mInputView != null) {
                mInputView.setCurModel(user);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView2 = this.f127664a.getMInputView();
            if (mInputView2 != null) {
                mInputView2.d();
            }
            this.f127664a.e();
        }
    }

    public static final class c implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MentionStickerEditingLayout f127665a;

        static {
            Covode.recordClassIndex(83695);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(MentionStickerEditingLayout mentionStickerEditingLayout) {
            this.f127665a = mentionStickerEditingLayout;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            if (spanned == null) {
                l.b();
            }
            int length = 50 - (spanned.length() - (i5 - i4));
            int i6 = i3 - i2;
            if (length < i6) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f127665a.getContext()).a(R.string.b0q).a();
            }
            if (length <= 0) {
                return "";
            }
            if (length >= i6) {
                return null;
            }
            int i7 = length + i2;
            if (charSequence == null) {
                l.b();
            }
            if (!Character.isHighSurrogate(charSequence.charAt(i7 - 1)) || i7 - 1 != i2) {
                return charSequence.subSequence(i2, i7);
            }
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void setSearchListViewVisibility(int i2) {
        a aVar = this.f127662m;
        if (aVar == null) {
            l.a("mMentionSearchListView");
        }
        aVar.setVisibility(i2);
        if (i2 == 0) {
            a aVar2 = this.f127662m;
            if (aVar2 == null) {
                l.a("mMentionSearchListView");
            }
            aVar2.setAlpha(1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void a(ViewGroup viewGroup) {
        MethodCollector.i(3881);
        Context context = getContext();
        l.b(context, "");
        a aVar = new a(context, (byte) 0);
        this.f127662m = aVar;
        aVar.setCallback(new b(this));
        if (viewGroup != null) {
            a aVar2 = this.f127662m;
            if (aVar2 == null) {
                l.a("mMentionSearchListView");
            }
            viewGroup.addView(aVar2, new FrameLayout.LayoutParams(-1, -2, 80));
            MethodCollector.o(3881);
            return;
        }
        MethodCollector.o(3881);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void setSearchListMarginBottom(int i2) {
        a aVar = this.f127662m;
        if (aVar == null) {
            l.a("mMentionSearchListView");
        }
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i2;
        }
        a aVar2 = this.f127662m;
        if (aVar2 == null) {
            l.a("mMentionSearchListView");
        }
        aVar2.requestLayout();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void a(String str) {
        boolean z;
        List<User> list;
        a aVar = this.f127662m;
        if (aVar == null) {
            l.a("mMentionSearchListView");
        }
        if (!l.a((Object) aVar.f127671d.f127707c, (Object) str)) {
            aVar.getFetchedUidSet().clear();
        }
        aVar.b(0);
        if (str != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.c cVar = aVar.f127671d;
            l.d(str, "");
            cVar.f127707c = str;
            List<User> list2 = null;
            if (!TextUtils.isEmpty(str)) {
                if (!aVar.getMSummonFriendSearchPresenter().c()) {
                    aVar.getMSummonFriendSearchPresenter().f127623c = aVar;
                }
                if (aVar.f127670c.getItemCount() == 0) {
                    aVar.b(0);
                }
                ArrayList arrayList = new ArrayList();
                b.a.C3327a aVar2 = aVar.f127670c.f127685e;
                if (aVar2 != null) {
                    arrayList.addAll(aVar2.f127737a);
                    arrayList.addAll(aVar2.f127738b);
                    arrayList.addAll(aVar2.f127737a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    User user = (User) obj;
                    if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
                        arrayList2.add(obj);
                    }
                }
                aVar.f127669b.a(str, arrayList2).a(new a.g(aVar, str), i.f4826c, null);
                return;
            }
            List<? extends User> list3 = aVar.f127670c.f127682b;
            if (list3 == null || list3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b.a.C3327a aVar3 = aVar.f127670c.f127685e;
                if (aVar3 == null || (list = aVar3.f127742f) == null || list.isEmpty()) {
                    aVar.b(0);
                    aVar.a();
                    return;
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a.a aVar4 = aVar.f127670c;
                b.a.C3327a aVar5 = aVar.f127670c.f127685e;
                if (aVar5 != null) {
                    list2 = aVar5.f127742f;
                }
                aVar4.f127682b = list2;
                aVar.f127670c.notifyDataSetChanged();
                aVar.f127668a.b(0);
                aVar.a(-1);
                return;
            }
            aVar.a(-1);
            aVar.f127668a.b(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MentionStickerEditingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    static final class d implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final d f127666a = new d();

        static {
            Covode.recordClassIndex(83696);
        }

        d() {
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            CharSequence charSequence2;
            if (charSequence != null) {
                charSequence2 = p.b(charSequence);
            } else {
                charSequence2 = null;
            }
            if (TextUtils.isEmpty(charSequence2)) {
                return "";
            }
            String valueOf = String.valueOf(charSequence2);
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            if (valueOf.contentEquals("\n")) {
                return "";
            }
            return null;
        }
    }
}
