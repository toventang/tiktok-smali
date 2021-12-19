package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.shortvideo.util.bn;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class c extends d<User> {

    /* renamed from: d  reason: collision with root package name */
    private SocialTouchableEditText f127765d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f127766e;

    static {
        Covode.recordClassIndex(83738);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final int getLayoutResId() {
        return R.layout.agj;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final LinearLayout c() {
        View findViewById = findViewById(R.id.cle);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        return (LinearLayout) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final String getContent() {
        return bn.a((User) getCurModel());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final SocialTouchableEditText a() {
        View findViewById = findViewById(R.id.ayb);
        l.b(findViewById, "");
        SocialTouchableEditText socialTouchableEditText = (SocialTouchableEditText) findViewById;
        this.f127765d = socialTouchableEditText;
        if (socialTouchableEditText == null) {
            l.a("editText");
        }
        return socialTouchableEditText;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final TextView b() {
        View findViewById = findViewById(R.id.f1i);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f127766e = textView;
        if (textView == null) {
            l.a("iconView");
        }
        Context context = getContext();
        l.b(context, "");
        textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "mention_and_hashtag.ttf"));
        TextView textView2 = this.f127766e;
        if (textView2 == null) {
            l.a("iconView");
        }
        textView2.setText("@");
        TextView textView3 = this.f127766e;
        if (textView3 == null) {
            l.a("iconView");
        }
        return textView3;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d
    public final void g() {
        SocialTouchableEditText socialTouchableEditText = this.f127765d;
        if (socialTouchableEditText == null) {
            l.a("editText");
        }
        Context context = getContext();
        l.b(context, "");
        socialTouchableEditText.setHint(context.getResources().getString(R.string.axw));
    }

    public final MentionStruct getMentionStruct() {
        User user = (User) getCurModel();
        if (user == null) {
            return new MentionStruct();
        }
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = str;
        }
        String secUid = user.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        String a2 = bn.a(user);
        String a3 = bn.a(user);
        UrlModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb == null) {
            avatarThumb = null;
        }
        return new MentionStruct(uid, str, a2, a3, avatarThumb);
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
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        l.d(context, "");
    }
}
