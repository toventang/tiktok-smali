package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b extends d<com.ss.android.ugc.aweme.video.hashtag.b> {

    /* renamed from: d  reason: collision with root package name */
    private SocialTouchableEditText f127644d;

    static {
        Covode.recordClassIndex(83684);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final int getLayoutResId() {
        return R.layout.afx;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final LinearLayout c() {
        View findViewById = findViewById(R.id.ber);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final SocialTouchableEditText a() {
        View findViewById = findViewById(R.id.aya);
        l.b(findViewById, "");
        SocialTouchableEditText socialTouchableEditText = (SocialTouchableEditText) findViewById;
        this.f127644d = socialTouchableEditText;
        if (socialTouchableEditText == null) {
            l.a("editText");
        }
        return socialTouchableEditText;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final String getContent() {
        AVChallenge aVChallenge;
        com.ss.android.ugc.aweme.video.hashtag.b bVar = (com.ss.android.ugc.aweme.video.hashtag.b) getCurModel();
        if (bVar == null || (aVChallenge = bVar.f143397a) == null) {
            return null;
        }
        return aVChallenge.challengeName;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final TextView b() {
        TextView textView = (TextView) findViewById(R.id.f1f);
        l.b(textView, "");
        Context context = getContext();
        l.b(context, "");
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "mention_and_hashtag.ttf"));
        textView.setText("#");
        return textView;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final void g() {
        SocialTouchableEditText socialTouchableEditText = this.f127644d;
        if (socialTouchableEditText == null) {
            l.a("editText");
        }
        Context context = getContext();
        l.b(context, "");
        socialTouchableEditText.setHint(context.getResources().getString(R.string.axt));
    }

    public final HashtagStruct getHashTagStruct() {
        String str;
        AVChallenge aVChallenge;
        if (getCurModel() == null) {
            return new HashtagStruct();
        }
        HashtagStruct hashtagStruct = new HashtagStruct();
        com.ss.android.ugc.aweme.video.hashtag.b bVar = (com.ss.android.ugc.aweme.video.hashtag.b) getCurModel();
        if (bVar == null || (aVChallenge = bVar.f143397a) == null || (str = aVChallenge.getChallengeName()) == null) {
            str = "";
        }
        hashtagStruct.setHashtagName(str);
        return hashtagStruct;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final void d() {
        String str;
        int i2;
        String content = getContent();
        Editable text = getMEditTextView().getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (!l.a((Object) str, (Object) content)) {
            getMEditTextView().setText(content);
            getMEditTextView().setHint("");
            SocialTouchableEditText mEditTextView = getMEditTextView();
            if (content != null) {
                i2 = content.length();
            } else {
                i2 = 0;
            }
            mEditTextView.setSelection(Math.min(50, i2));
            getMEditTextView().requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
    }
}
