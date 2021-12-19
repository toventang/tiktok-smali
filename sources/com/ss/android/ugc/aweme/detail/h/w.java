package com.ss.android.ugc.aweme.detail.h;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;

public final class w extends y {

    /* renamed from: a  reason: collision with root package name */
    private final String f79756a;
    private final String bx;
    private final String by;

    static {
        Covode.recordClassIndex(49565);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.f5z;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
        Aweme aD = aD();
        if (!(aD == null || aD.getInteractStickerStructs() == null)) {
            for (InteractStickerStruct interactStickerStruct : aD.getInteractStickerStructs()) {
                if (interactStickerStruct.getQaStruct() != null) {
                    try {
                        CommentServiceImpl.e().a(this.bv, interactStickerStruct.getQaStruct(), this.bx, "click_banner", "answer");
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
        }
    }

    public w(Bundle bundle) {
        this.f79756a = (String) bundle.getSerializable("question_content");
        this.bx = (String) bundle.getSerializable("enter_from");
        this.by = (String) bundle.getSerializable("enter_method");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        int i2;
        View a2 = a.a(LayoutInflater.from(this.bv), R.layout.ws, relativeLayout, false);
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.akx);
        String str = this.f79756a;
        if (str != null && !str.isEmpty()) {
            tuxTextView.setText(this.f79756a);
            if (gb.a()) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            tuxTextView.setTextDirection(i2);
        }
        return a2;
    }
}
