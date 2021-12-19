package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Iterator;

public final class BubbleDescView extends MentionTextView {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f71667a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.barrage.a f71668b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f71669c;

    /* renamed from: e  reason: collision with root package name */
    int f71670e = 2;

    /* renamed from: f  reason: collision with root package name */
    public final int f71671f = AVExternalServiceImpl.a().publishService().getAddVideosExperiConsuSideCode();

    /* renamed from: j  reason: collision with root package name */
    private Integer f71672j;

    /* renamed from: k  reason: collision with root package name */
    private h.f.a.a<z> f71673k;

    static {
        Covode.recordClassIndex(44086);
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.f71672j;
    }

    public final int getMMaxLinesWhenFold() {
        return this.f71670e;
    }

    public final h.f.a.a<z> getSpanClickInterceptor() {
        return this.f71673k;
    }

    public final Integer getTextColor() {
        return this.f71669c;
    }

    public final SpannableStringBuilder getEndText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...");
        Aweme aweme = this.f71667a;
        if (aweme != null) {
            spannableStringBuilder.append((CharSequence) a(aweme));
        }
        return spannableStringBuilder;
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BubbleDescView f71675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MentionTextView f71676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f71677c;

        static {
            Covode.recordClassIndex(44088);
        }

        public final void onGlobalLayout() {
            int lineCount;
            int i2;
            int i3;
            CharSequence subSequence;
            ViewTreeObserver viewTreeObserver = this.f71676b.getViewTreeObserver();
            if (this.f71676b.getWidth() != 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                if (this.f71675a.getContext() != null) {
                    int i4 = this.f71675a.f71670e;
                    SpannableStringBuilder endText = this.f71675a.getEndText();
                    int length = endText.length();
                    int i5 = length + 1;
                    if (this.f71676b.getLineCount() == 0) {
                        lineCount = i4;
                    } else {
                        lineCount = this.f71676b.getLineCount();
                    }
                    if (lineCount > i4) {
                        if (this.f71676b.getLayout() != null) {
                            int i6 = i4 - 1;
                            i3 = this.f71676b.getLayout().getLineStart(i6);
                            i2 = this.f71676b.getLayout().getLineEnd(i6);
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                        String obj = this.f71676b.getText().toString();
                        String spannableStringBuilder = this.f71675a.a(this.f71677c).toString();
                        l.b(spannableStringBuilder, "");
                        SpannableString spannableString = new SpannableString(p.a(obj, spannableStringBuilder, ""));
                        if (i2 == 0) {
                            i2 = spannableString.length() / 2;
                        }
                        if (i2 >= i5) {
                            int i7 = i2 - i5;
                            if (AVExternalServiceImpl.a().publishService().containEmoji(spannableString.subSequence(i7, i7 + 2).toString())) {
                                subSequence = spannableString.subSequence(0, Math.max(0, i7));
                                l.b(subSequence, "");
                                if (subSequence.length() > 0 && subSequence.charAt(subSequence.length() - 1) == '\n') {
                                    subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                                spannableStringBuilder2.append((CharSequence) this.f71675a.getEndText());
                                this.f71676b.setLines(this.f71675a.f71670e);
                                this.f71675a.setDescSafely(spannableStringBuilder2);
                                return;
                            }
                        }
                        BubbleDescView bubbleDescView = this.f71675a;
                        String spannableStringBuilder3 = endText.toString();
                        l.b(spannableStringBuilder3, "");
                        subSequence = spannableString.subSequence(0, Math.max(0, i2 - bubbleDescView.a(spannableString, spannableStringBuilder3, length, i3, i2)));
                        l.b(subSequence, "");
                        subSequence = subSequence.subSequence(0, subSequence.length() - 1);
                        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder22.append((CharSequence) this.f71675a.getEndText());
                        this.f71676b.setLines(this.f71675a.f71670e);
                        this.f71675a.setDescSafely(spannableStringBuilder22);
                        return;
                    }
                    MentionTextView mentionTextView = this.f71676b;
                    mentionTextView.setLines(mentionTextView.getLineCount());
                }
            }
        }

        public b(BubbleDescView bubbleDescView, MentionTextView mentionTextView, Aweme aweme) {
            this.f71675a = bubbleDescView;
            this.f71676b = mentionTextView;
            this.f71677c = aweme;
        }
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.f71672j = num;
    }

    public final void setMMaxLinesWhenFold(int i2) {
        this.f71670e = i2;
    }

    public final void setSpanClickInterceptor(h.f.a.a<z> aVar) {
        this.f71673k = aVar;
    }

    public final void setTextColor(Integer num) {
        this.f71669c = num;
    }

    public final class a implements MentionTextView.d {
        static {
            Covode.recordClassIndex(44087);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.d
        public final boolean a(TextExtraStruct textExtraStruct) {
            if (textExtraStruct == null) {
                return false;
            }
            if (textExtraStruct.getType() == 0 || textExtraStruct.getType() == 1 || textExtraStruct.getType() == 3) {
                return true;
            }
            return false;
        }
    }

    public static final class c implements MentionTextView.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BubbleDescView f71678a;

        static {
            Covode.recordClassIndex(44089);
        }

        public c(BubbleDescView bubbleDescView) {
            this.f71678a = bubbleDescView;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.f
        public final void a(TextExtraStruct textExtraStruct) {
            h.f.a.a<z> spanClickInterceptor;
            if (this.f71678a.getSpanClickInterceptor() != null && (spanClickInterceptor = this.f71678a.getSpanClickInterceptor()) != null) {
                spanClickInterceptor.invoke();
            }
        }
    }

    static final class d implements MentionTextView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BubbleDescView f71679a;

        static {
            Covode.recordClassIndex(44090);
        }

        d(BubbleDescView bubbleDescView) {
            this.f71679a = bubbleDescView;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.d
        public final boolean a(TextExtraStruct textExtraStruct) {
            l.d(textExtraStruct, "");
            if (this.f71679a.f71671f == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    public final void setDescSafely(CharSequence charSequence) {
        try {
            Aweme aweme = this.f71667a;
            if (aweme == null) {
                l.b();
            }
            a(charSequence, aweme.getDescLanguage());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    private final boolean a(TextExtraStruct textExtraStruct) {
        Aweme aweme = this.f71667a;
        if (aweme == null || aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0) {
            return false;
        }
        int end = textExtraStruct.getEnd();
        Aweme aweme2 = this.f71667a;
        if (aweme2 == null) {
            l.b();
        }
        if (end > aweme2.getDesc().length()) {
            return false;
        }
        int start = textExtraStruct.getStart();
        Aweme aweme3 = this.f71667a;
        if (aweme3 == null) {
            l.b();
        }
        if (start >= aweme3.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder a(Aweme aweme) {
        String str;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        boolean isSecret = curUser.isSecret();
        if (!m.a(aweme)) {
            return new SpannableStringBuilder();
        }
        AwemeStatus status = aweme.getStatus();
        l.b(status, "");
        if (status.getPrivateStatus() != 0) {
            AwemeStatus status2 = aweme.getStatus();
            l.b(status2, "");
            int privateStatus = status2.getPrivateStatus();
            if (privateStatus == 1) {
                Context context = getContext();
                l.b(context, "");
                str = context.getResources().getString(R.string.evo);
            } else if (privateStatus == 2) {
                Context context2 = getContext();
                l.b(context2, "");
                str = context2.getResources().getString(R.string.gct);
            } else if (isSecret) {
                Context context3 = getContext();
                l.b(context3, "");
                str = context3.getResources().getString(R.string.gcs);
            } else {
                str = "";
            }
            l.b(str, "");
        } else {
            if (isSecret) {
                Context context4 = getContext();
                l.b(context4, "");
                str = context4.getResources().getString(R.string.gcs);
            } else {
                str = "";
            }
            l.b(str, "");
        }
        if (str.length() == 0) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (" · " + p.a(str, " ", " "))).setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.a9)), 2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(52), 2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void setTextExtraList(Aweme aweme) {
        String str;
        TextExtraStruct next;
        int c2;
        String str2;
        String str3;
        if (aweme != null) {
            if (!aweme.isScheduleVideo()) {
                a(aweme.getTextExtra(), new a(), new d(this));
            }
            ICommerceChallengeService e2 = CommerceChallengeServiceImpl.e();
            com.ss.android.ugc.aweme.comment.barrage.a aVar = this.f71668b;
            String str4 = null;
            if (aVar != null) {
                str = aVar.f71533b;
            } else {
                str = null;
            }
            e2.a(this, aweme, str);
            if (aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
                Iterator<TextExtraStruct> it = aweme.getTextExtra().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    l.b(next, "");
                    if (!(a(next) && next.getType() == 0 && ((!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype() || 7 == next.getSubtype() || 5 == next.getSubtype()) && aweme.getDesc().charAt(next.getStart()) == '@')) && (!a(next) || this.f71671f != 1 || next.getType() != 5 || TextUtils.isEmpty(next.getAwemeId()))) {
                    }
                }
                Integer num = this.f71672j;
                if (num != null) {
                    c2 = num.intValue();
                } else {
                    c2 = androidx.core.content.b.c(getContext(), R.color.us);
                }
                Context context = getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.commercialize.ad.d dVar = new com.ss.android.ugc.aweme.commercialize.ad.d(context, (float) Math.round(((float) n.a(getContext())) - (n.b(getContext(), 100.0f) + getContext().getResources().getDimension(R.dimen.g5))), c2, androidx.core.content.b.c(getContext(), R.color.a9), next);
                dVar.f73655b = n.b(getContext(), 12.0f);
                dVar.f73656c = n.b(getContext(), 2.0f);
                dVar.f73654a = n.b(getContext(), 14.0f);
                a(next.getStart(), next.getEnd(), dVar);
                if (4 == next.getSubtype()) {
                    com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                    com.ss.android.ugc.aweme.comment.barrage.a aVar2 = this.f71668b;
                    if (aVar2 != null) {
                        str2 = aVar2.f71533b;
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar2.a("enter_from", str2);
                    Aweme aweme2 = this.f71667a;
                    if (aweme2 != null) {
                        str3 = aweme2.getAid();
                    } else {
                        str3 = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
                    Aweme aweme3 = this.f71667a;
                    if (aweme3 != null) {
                        str4 = aweme3.getAuthorUid();
                    }
                    r.a("duet_with_show", a3.a("author_id", str4).a("music_id", ac.d(this.f71667a)).f66730a);
                }
            }
            setAdHashTag(aweme);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BubbleDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }

    public final int a(CharSequence charSequence, String str, int i2, int i3, int i4) {
        try {
            int width = getWidth();
            float measureText = ((getPaint().measureText(charSequence, i3, i4) + (getPaint().measureText(str) + 100.0f)) + 0.0f) - ((float) width);
            if (measureText <= 0.0f) {
                return 0;
            }
            int i5 = 1;
            int i6 = (i4 - i3) + 1;
            if (i6 > 0) {
                while (getPaint().measureText(charSequence, i4 - i5, i4) < measureText) {
                    if (i5 != i6) {
                        i5++;
                    }
                }
                return i5;
            }
            return i2 + 1;
        } catch (Exception unused) {
            return i2;
        }
    }
}
