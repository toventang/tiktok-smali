package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.shortvideo.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class HashTagStickerEditingLayout extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b<com.ss.android.ugc.aweme.video.hashtag.b> {

    /* renamed from: l  reason: collision with root package name */
    public boolean f127624l = com.ss.android.ugc.aweme.tools.c.a(getContext());

    /* renamed from: m  reason: collision with root package name */
    private c f127625m;
    private final InputFilter n = d.f127629a;
    private final InputFilter o = new c(this);

    static {
        Covode.recordClassIndex(83665);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final Animator a() {
        c cVar = this.f127625m;
        if (cVar == null) {
            l.a("mHashTagSearchListView");
        }
        return ObjectAnimator.ofFloat(cVar, "alpha", 1.0f, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d<com.ss.android.ugc.aweme.video.hashtag.b> b() {
        Context context = getContext();
        l.b(context, "");
        b bVar = new b(context);
        SocialTouchableEditText mEditTextView = bVar.getMEditTextView();
        mEditTextView.setTypeface(getCustomTypeface());
        mEditTextView.setFilters(new InputFilter[]{this.n, this.o});
        mEditTextView.addTextChangedListener(new a(this));
        return bVar;
    }

    public final void setRtlState(boolean z) {
        this.f127624l = z;
    }

    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashTagStickerEditingLayout f127626a;

        static {
            Covode.recordClassIndex(83666);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        a(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f127626a = hashTagStickerEditingLayout;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            com.ss.android.ugc.aweme.video.hashtag.b bVar;
            AVChallenge aVChallenge;
            boolean z;
            l.d(editable, "");
            String obj = editable.toString();
            if (obj.length() == 0) {
                HashTagStickerEditingLayout hashTagStickerEditingLayout = this.f127626a;
                if (com.ss.android.ugc.aweme.tools.c.a(hashTagStickerEditingLayout.getContext())) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView = hashTagStickerEditingLayout.getMInputView();
                    if (mInputView != null) {
                        mInputView.f();
                    }
                    z = true;
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView2 = hashTagStickerEditingLayout.getMInputView();
                    if (mInputView2 != null) {
                        mInputView2.e();
                    }
                    z = false;
                }
                hashTagStickerEditingLayout.f127624l = z;
            } else if (e.a(obj)) {
                if (!this.f127626a.f127624l) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView3 = this.f127626a.getMInputView();
                    if (mInputView3 != null) {
                        mInputView3.f();
                    }
                    this.f127626a.setRtlState(true);
                }
            } else if (this.f127626a.f127624l) {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView4 = this.f127626a.getMInputView();
                if (mInputView4 != null) {
                    mInputView4.e();
                }
                this.f127626a.setRtlState(false);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView5 = this.f127626a.getMInputView();
            if (mInputView5 != null) {
                mInputView5.a(true);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView6 = this.f127626a.getMInputView();
            if (mInputView6 == null || (bVar = (com.ss.android.ugc.aweme.video.hashtag.b) mInputView6.getCurModel()) == null || (aVChallenge = bVar.f143397a) == null) {
                str = null;
            } else {
                str = aVChallenge.challengeName;
            }
            if (!l.a((Object) str, (Object) obj)) {
                AVChallenge aVChallenge2 = new AVChallenge();
                aVChallenge2.challengeName = obj;
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView7 = this.f127626a.getMInputView();
                if (mInputView7 != null) {
                    g gVar = new g();
                    gVar.f128515a = aVChallenge2;
                    mInputView7.setCurModel(com.ss.android.ugc.aweme.video.hashtag.b.a(gVar, false));
                }
                this.f127626a.a(editable.toString());
            }
        }
    }

    public static final class b implements e<com.ss.android.ugc.aweme.video.hashtag.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashTagStickerEditingLayout f127627a;

        static {
            Covode.recordClassIndex(83667);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f127627a = hashTagStickerEditingLayout;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.e
        public final /* synthetic */ void a(com.ss.android.ugc.aweme.video.hashtag.b bVar) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView = this.f127627a.getMInputView();
            if (mInputView != null) {
                mInputView.setCurModel(bVar);
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mInputView2 = this.f127627a.getMInputView();
            if (mInputView2 != null) {
                mInputView2.d();
            }
            this.f127627a.e();
        }
    }

    public static final class c implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HashTagStickerEditingLayout f127628a;

        static {
            Covode.recordClassIndex(83668);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(HashTagStickerEditingLayout hashTagStickerEditingLayout) {
            this.f127628a = hashTagStickerEditingLayout;
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            if (spanned == null) {
                l.b();
            }
            int length = 50 - (spanned.length() - (i5 - i4));
            int i6 = i3 - i2;
            if (length < i6) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f127628a.getContext()).a(R.string.b0q).a();
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
        c cVar = this.f127625m;
        if (cVar == null) {
            l.a("mHashTagSearchListView");
        }
        cVar.setVisibility(i2);
        if (i2 == 0) {
            c cVar2 = this.f127625m;
            if (cVar2 == null) {
                l.a("mHashTagSearchListView");
            }
            cVar2.setAlpha(1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void a(ViewGroup viewGroup) {
        MethodCollector.i(4576);
        Context context = getContext();
        l.b(context, "");
        c cVar = new c(context);
        this.f127625m = cVar;
        cVar.setOnHashTagItemClickListener(new b(this));
        if (viewGroup != null) {
            c cVar2 = this.f127625m;
            if (cVar2 == null) {
                l.a("mHashTagSearchListView");
            }
            viewGroup.addView(cVar2, new FrameLayout.LayoutParams(-1, -2, 80));
            MethodCollector.o(4576);
            return;
        }
        MethodCollector.o(4576);
    }

    public final void setModel(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        c cVar = this.f127625m;
        if (cVar == null) {
            l.a("mHashTagSearchListView");
        }
        ak.f a2 = com.ss.android.ugc.aweme.shortvideo.publish.b.a(videoPublishEditModel);
        l.d(a2, "");
        cVar.f127648b = a2;
        ak.f fVar = cVar.f127648b;
        if (fVar == null) {
            l.a("mSearchParams");
        }
        fVar.f115589f = 2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void setSearchListMarginBottom(int i2) {
        c cVar = this.f127625m;
        if (cVar == null) {
            l.a("mHashTagSearchListView");
        }
        ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i2;
        }
        c cVar2 = this.f127625m;
        if (cVar2 == null) {
            l.a("mHashTagSearchListView");
        }
        cVar2.requestLayout();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b
    public final void a(String str) {
        c cVar = this.f127625m;
        if (cVar == null) {
            l.a("mHashTagSearchListView");
        }
        if (cVar.f127649c && cVar.f127648b != null) {
            cVar.b();
            if (str == null || str.length() == 0) {
                ak.d dVar = cVar.f127652f;
                if (dVar == null) {
                    l.a("recommendHashTagViewModel");
                }
                ak.f fVar = cVar.f127648b;
                if (fVar == null) {
                    l.a("mSearchParams");
                }
                dVar.a(fVar);
                return;
            }
            ak.c cVar2 = cVar.f127653g;
            if (cVar2 == null) {
                l.a("mChallengeSearchPresenter");
            }
            cVar2.a(str, c.f127645h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashTagStickerEditingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    static final class d implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final d f127629a = new d();

        static {
            Covode.recordClassIndex(83669);
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
