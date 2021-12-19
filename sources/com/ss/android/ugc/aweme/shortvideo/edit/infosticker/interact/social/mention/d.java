package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;

public final class d extends e<User> {
    public static final a q = new a((byte) 0);

    static {
        Covode.recordClassIndex(83739);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83740);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final MentionStruct getMentionStruct() {
        MentionStruct mentionStruct;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView = getMBaseView();
        if (!(mBaseView instanceof c)) {
            mBaseView = null;
        }
        c cVar = (c) mBaseView;
        if (cVar == null || (mentionStruct = cVar.getMentionStruct()) == null) {
            return new MentionStruct();
        }
        return mentionStruct;
    }

    public d(Context context) {
        super(context);
    }

    public final void a(b<User> bVar, MentionStruct mentionStruct) {
        MethodCollector.i(6082);
        if (getMBaseView() == null && bVar != null) {
            setMBaseView(bVar.b());
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView = getMBaseView();
            if (mBaseView != null) {
                User user = new User();
                if (mentionStruct != null) {
                    String userId = mentionStruct.getUserId();
                    if (userId == null || userId.length() == 0) {
                        user.setNickname(mentionStruct.getUsername());
                    } else {
                        user.setUid(mentionStruct.getUserId());
                        user.setSecUid(mentionStruct.getSecUid());
                        user.setNickname(mentionStruct.getUsername());
                        user.setAvatarThumb(mentionStruct.getAvatarUrl());
                    }
                }
                mBaseView.setCurModel(user);
                mBaseView.d();
                SocialTouchableEditText mEditTextView = mBaseView.getMEditTextView();
                mEditTextView.setMode(true);
                com.ss.android.ugc.aweme.editSticker.f.d.a((EditText) mEditTextView, false);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerInputView");
                MethodCollector.o(6082);
                throw nullPointerException;
            }
        }
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(getMBaseView());
                MethodCollector.o(6082);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(6082);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(6082);
        throw nullPointerException3;
    }
}
