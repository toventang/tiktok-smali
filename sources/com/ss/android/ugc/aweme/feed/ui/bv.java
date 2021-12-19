package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.af;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.translation.a.b;
import com.ss.android.ugc.aweme.translation.a.c;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.translation.ui.a;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class bv implements TranslationStatusView.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f94424a;

    /* renamed from: l  reason: collision with root package name */
    public static final int f94425l;

    /* renamed from: b  reason: collision with root package name */
    public TranslationStatusView f94426b;

    /* renamed from: c  reason: collision with root package name */
    public MentionTextView f94427c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f94428d;

    /* renamed from: e  reason: collision with root package name */
    public int f94429e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f94430f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.translation.b.a f94431g;

    /* renamed from: h  reason: collision with root package name */
    public String f94432h;

    /* renamed from: i  reason: collision with root package name */
    public String f94433i;

    /* renamed from: j  reason: collision with root package name */
    public int f94434j = -1;

    /* renamed from: k  reason: collision with root package name */
    public TextView f94435k;

    /* renamed from: m  reason: collision with root package name */
    public int f94436m;
    public int n;
    public boolean o = false;
    private Context p;
    private int q;
    private List<String> r = new ArrayList();

    public final void a(final MentionTextView mentionTextView, final String str, final List<TextExtraStruct> list, final int i2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f).setDuration(150L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f, 1.0f).setDuration(150L);
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.feed.ui.bv.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59977);
            }

            public final void onAnimationStart(Animator animator) {
                int lineCount;
                int lineCount2;
                if (!bv.f94424a) {
                    mentionTextView.setMaxLines(bv.f94425l);
                }
                bv.this.a((CharSequence) str);
                mentionTextView.a(list, new f(), (MentionTextView.d) null);
                bv bvVar = bv.this;
                MentionTextView mentionTextView = mentionTextView;
                int i2 = i2;
                if (bv.f94424a) {
                    mentionTextView.scrollTo(0, 0);
                    bvVar.f94428d.getLayoutParams().height = -2;
                }
                int b2 = af.b();
                if (i2 != 2) {
                    if (mentionTextView.getLineCount() == 0) {
                        lineCount = b2;
                    } else {
                        lineCount = mentionTextView.getLineCount();
                    }
                    if (lineCount > b2) {
                        if (bvVar.f94430f.getTransDesc() == null) {
                            bvVar.a(mentionTextView, lineCount, b2, i2);
                        }
                        bvVar.a(bvVar.f94430f.getEllipsizeTransDesc());
                        mentionTextView.setLines(b2);
                        if (bv.f94424a) {
                            lineCount = Math.min(bv.f94425l, lineCount);
                        }
                        mentionTextView.post(new bx(bvVar, mentionTextView, lineCount));
                        bvVar.f94435k.setVisibility(0);
                        bvVar.f94435k.setText(R.string.bv8);
                        return;
                    }
                    bvVar.a(mentionTextView);
                } else if (!bvVar.f94430f.getDesc().equals(bvVar.f94430f.getEllipsizeDesc())) {
                    bvVar.f94435k.setVisibility(0);
                    bvVar.f94435k.setText(R.string.bv8);
                    bvVar.a(bvVar.f94430f.getEllipsizeDesc());
                    mentionTextView.setLines(b2);
                } else {
                    if (mentionTextView.getLineCount() == 0) {
                        lineCount2 = b2;
                    } else {
                        lineCount2 = mentionTextView.getLineCount();
                    }
                    if (lineCount2 > b2) {
                        bvVar.f94435k.setVisibility(0);
                        bvVar.f94435k.setText(R.string.bv8);
                        bvVar.a(mentionTextView, lineCount2, b2, i2);
                        bvVar.a(bvVar.f94430f.getEllipsizeDesc());
                        mentionTextView.setLines(b2);
                        return;
                    }
                    bvVar.a(mentionTextView);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }

    public final void a(CharSequence charSequence) {
        String h2;
        try {
            if (this.f94434j == 0) {
                h2 = this.f94430f.getDescLanguage();
            } else {
                h2 = SettingServiceImpl.v().h();
            }
            this.f94427c.a(charSequence, h2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(String str, int i2) {
        this.f94432h = str;
        this.q = i2;
    }

    @Override // com.ss.android.ugc.aweme.translation.ui.a
    public final void a() {
        this.f94426b.setStatus(0);
    }

    static {
        int i2;
        Covode.recordClassIndex(59975);
        boolean a2 = com.ss.android.ugc.aweme.feed.v.a.a();
        f94424a = a2;
        if (a2) {
            i2 = 10;
        } else {
            i2 = 12;
        }
        f94425l = i2;
    }

    @Override // com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.a
    public final void a(int i2) {
        this.f94434j = i2;
    }

    public final void a(Aweme aweme) {
        a(aweme, false);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str) || this.f94430f == null) {
            return "";
        }
        boolean[] zArr = new boolean[str.length()];
        if (this.f94430f.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : this.f94430f.getTextExtra()) {
                for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(str.length(), textExtraStruct.getEnd()); max++) {
                    zArr[max] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!zArr[i2]) {
                sb.append(str.charAt(i2));
            }
        }
        return sb.toString().trim();
    }

    @Override // com.ss.android.ugc.aweme.translation.ui.a
    public final void a(c cVar) {
        String str;
        this.f94426b.setStatus(2);
        if (this.o) {
            r.a("see_original_show", new d().a("enter_from", this.f94432h).a("group_id", this.f94430f.getAid()).a("current_lang", SettingServiceImpl.v().h()).f66730a);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (cVar.f141015a == null) {
            str = "";
        } else {
            str = cVar.f141015a;
        }
        sb.append(str);
        sb.append(" ");
        if (this.f94430f.getTextExtra() != null) {
            for (int i2 = 0; i2 < this.f94430f.getTextExtra().size(); i2++) {
                TextExtraStruct textExtraStruct = this.f94430f.getTextExtra().get(i2);
                String substring = this.f94430f.getDesc().substring(Math.min(Math.max(textExtraStruct.getStart(), 0), this.f94430f.getDesc().length()), Math.min(textExtraStruct.getEnd(), this.f94430f.getDesc().length()));
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(sb.length());
                clone.setEnd(clone.getStart() + substring.length());
                arrayList.add(clone);
                sb.append(substring);
                sb.append(" ");
            }
        }
        com.ss.android.ugc.aweme.translation.a.d dVar = new com.ss.android.ugc.aweme.translation.a.d();
        dVar.f141018b = 2;
        dVar.f141017a = sb.toString();
        dVar.f141019c = arrayList;
        com.ss.android.ugc.aweme.translation.a a2 = com.ss.android.ugc.aweme.translation.a.a();
        String aid = this.f94430f.getAid();
        if (aid != null) {
            a2.f141007a.a(aid, dVar);
        }
        a(this.f94427c, dVar.f141017a, dVar.f141019c, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(MentionTextView mentionTextView) {
        this.f94435k.setVisibility(4);
        mentionTextView.post(new by(mentionTextView));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bv.a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    private void a(SpannableStringBuilder spannableStringBuilder, final SpannableStringBuilder spannableStringBuilder2, final boolean z) {
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.ugc.aweme.feed.ui.bv.AnonymousClass3 */

            static {
                Covode.recordClassIndex(59978);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(-1);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                ValueAnimator ofInt;
                bv.this.a(spannableStringBuilder2);
                bv.this.f94435k.setVisibility(0);
                bv bvVar = bv.this;
                bvVar.f94429e = bvVar.f94435k.getHeight();
                if (z) {
                    ofInt = ValueAnimator.ofInt(bv.this.n, bv.this.f94436m);
                } else {
                    ofInt = ValueAnimator.ofInt(bv.this.f94436m, bv.this.n);
                }
                ofInt.addUpdateListener(new bz(this, z));
                ofInt.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.feed.ui.bv.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(59979);
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (z) {
                            bv.this.f94435k.setText(R.string.bv7);
                        } else {
                            bv.this.f94435k.setText(R.string.bv8);
                        }
                        bv.this.f94435k.setVisibility(4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        int transDescLines;
                        if (!z) {
                            if (bv.f94424a) {
                                bv.this.f94427c.scrollTo(0, 0);
                            }
                            bv.this.f94427c.setLines(af.b());
                        } else if (bv.this.f94430f.getTransDescLines() != 0) {
                            MentionTextView mentionTextView = bv.this.f94427c;
                            if (bv.f94424a) {
                                transDescLines = Math.min(bv.f94425l, bv.this.f94430f.getTransDescLines());
                            } else {
                                transDescLines = bv.this.f94430f.getTransDescLines();
                            }
                            mentionTextView.setLines(transDescLines);
                        } else {
                            bv.this.f94427c.post(new cb(this));
                        }
                        bv.this.f94435k.setVisibility(0);
                    }
                });
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, bv.this.f94429e);
                ofInt2.addUpdateListener(new ca(this));
                ofInt2.setDuration(100L);
                ofInt2.setStartDelay(150);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofInt, ofInt2);
                animatorSet.start();
            }
        }, 0, spannableStringBuilder.length(), 33);
    }

    private int a(CharSequence charSequence, String str, int i2, int i3) {
        try {
            float measureText = this.f94427c.getPaint().measureText(str);
            int i4 = i2;
            while (i4 >= 3) {
                if (this.f94427c.getPaint().measureText(charSequence, i3 - i4, i3) < measureText) {
                    return i4 + 1;
                }
                i4--;
            }
            return i4 + 1;
        } catch (Exception unused) {
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0120 A[SYNTHETIC, Splitter:B:31:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.views.MentionTextView r17, int r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 491
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bv.a(com.ss.android.ugc.aweme.views.MentionTextView, int, int, int):void");
    }

    public bv(Context context, TranslationStatusView translationStatusView, MentionTextView mentionTextView, TextView textView, FrameLayout frameLayout) {
        this.p = context;
        this.f94431g = new com.ss.android.ugc.aweme.translation.b.a(new b(), this);
        this.f94426b = translationStatusView;
        this.f94427c = mentionTextView;
        this.f94428d = frameLayout;
        this.f94435k = textView;
    }
}
