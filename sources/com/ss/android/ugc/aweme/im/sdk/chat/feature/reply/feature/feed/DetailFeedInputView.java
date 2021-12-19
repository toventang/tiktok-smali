package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class DetailFeedInputView extends BaseInputView implements TextWatcher, View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public a f100979j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f100980k = true;

    /* renamed from: l  reason: collision with root package name */
    private String f100981l = "";

    public interface a {
        static {
            Covode.recordClassIndex(64591);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(64590);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(com.ss.android.ugc.aweme.emoji.b.a aVar) {
        l.d(aVar, "");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final boolean r() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void o() {
        b.a("chat_video_detail");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void p() {
        b.b("chat_video_detail");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void j() {
        super.j();
        SearchableEditText a2 = a();
        a2.removeTextChangedListener(this);
        a2.addTextChangedListener(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void onDestroy() {
        a().removeTextChangedListener(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void q() {
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", "chat_video_detail");
        a aVar = this.f100979j;
        if (aVar != null) {
            aVar.a();
        }
        m();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void b(boolean z) {
        super.b(z);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final a.b a(a.b bVar) {
        l.d(bVar, "");
        return bVar.f().c();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void a(String str) {
        l.d(str, "");
        super.a(str);
    }

    private final void c(boolean z) {
        int i2;
        boolean isActivated = c().isActivated();
        c().setActivated(z);
        c().setEnabled(z);
        TuxIconView c2 = c();
        if (z) {
            i2 = R.attr.ay;
        } else {
            i2 = R.attr.ad;
        }
        c2.setTintColorRes(i2);
        if (z && !isActivated) {
            com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b.a(c());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.coq);
        l.b(findViewById, "");
        a((SearchableEditText) findViewById);
        View findViewById2 = viewGroup.findViewById(R.id.aso);
        l.b(findViewById2, "");
        a(findViewById2);
        View findViewById3 = viewGroup.findViewById(R.id.av5);
        l.b(findViewById3, "");
        a((TuxIconView) findViewById3);
        View findViewById4 = viewGroup.findViewById(R.id.dyg);
        l.b(findViewById4, "");
        b((TuxIconView) findViewById4);
        View findViewById5 = viewGroup.findViewById(R.id.d1k);
        l.b(findViewById5, "");
        a((SoftInputResizeFuncLayoutView) findViewById5);
        k();
        super.a(viewGroup);
    }

    public final void afterTextChanged(Editable editable) {
        int i2;
        boolean z;
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length) {
            if (!z2) {
                i2 = i3;
            } else {
                i2 = length;
            }
            if (l.a(valueOf.charAt(i2), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z2 = true;
            } else {
                i3++;
            }
        }
        if (TextUtils.isEmpty(valueOf.subSequence(i3, length + 1).toString())) {
            c(false);
            a().setMaxLines(1);
            a().setHint(this.f100981l);
            return;
        }
        c(true);
        if (this.f100980k) {
            a().setMaxLines(5);
            a().setHint("");
            this.f100980k = false;
        }
    }

    public DetailFeedInputView(ViewGroup viewGroup, Bundle bundle) {
        l.d(viewGroup, "");
        boolean z = true;
        a(viewGroup);
        j();
        if (bundle != null) {
            CharSequence charSequence = bundle.getCharSequence("hint");
            if (charSequence != null) {
                this.f100981l = charSequence.toString();
            }
            if (bundle.getBoolean("showEmojiPanel")) {
                a(1);
                b().setSelected(true);
            } else {
                a(-2);
                b().setSelected(false);
                a().requestFocus();
                z = false;
            }
            a(z);
        }
    }
}
