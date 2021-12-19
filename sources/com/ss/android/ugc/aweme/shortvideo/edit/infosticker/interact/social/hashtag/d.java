package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.e;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.ui.SocialTouchableEditText;
import com.ss.android.ugc.aweme.shortvideo.g;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.video.hashtag.b;

public final class d extends e<b> {
    public static final a q = new a((byte) 0);

    static {
        Covode.recordClassIndex(83688);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83689);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final HashtagStruct getHashTagStruct() {
        HashtagStruct hashTagStruct;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView = getMBaseView();
        if (!(mBaseView instanceof b)) {
            mBaseView = null;
        }
        b bVar = (b) mBaseView;
        if (bVar == null || (hashTagStruct = bVar.getHashTagStruct()) == null) {
            return new HashtagStruct();
        }
        return hashTagStruct;
    }

    public d(Context context) {
        super(context);
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.b<b> bVar, HashtagStruct hashtagStruct) {
        MethodCollector.i(6465);
        if (getMBaseView() == null && bVar != null) {
            setMBaseView(bVar.b());
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.a.d mBaseView = getMBaseView();
            if (mBaseView != null) {
                AVChallenge aVChallenge = new AVChallenge();
                if (hashtagStruct != null) {
                    aVChallenge.challengeName = hashtagStruct.getHashtagName();
                }
                g gVar = new g();
                gVar.f128515a = aVChallenge;
                mBaseView.setCurModel(b.a(gVar, false));
                mBaseView.d();
                SocialTouchableEditText mEditTextView = mBaseView.getMEditTextView();
                mEditTextView.setMode(true);
                com.ss.android.ugc.aweme.editSticker.f.d.a((EditText) mEditTextView, false);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerInputView");
                MethodCollector.o(6465);
                throw nullPointerException;
            }
        }
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(getMBaseView());
                MethodCollector.o(6465);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(6465);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(6465);
        throw nullPointerException3;
    }
}
