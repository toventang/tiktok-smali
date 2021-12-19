package com.ss.android.ugc.aweme.follow;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.following.ui.view.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public class NewFollowButton extends TuxButton implements a {

    /* renamed from: e  reason: collision with root package name */
    private boolean f96199e;

    /* renamed from: f  reason: collision with root package name */
    private String f96200f;

    static {
        Covode.recordClassIndex(60941);
    }

    public NewFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final String getMessageText() {
        return this.f96200f;
    }

    public final boolean getShouldShowMessageText() {
        return this.f96199e;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public m getLifeCycleOwner() {
        Activity d2 = o.d(this);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (e) d2;
    }

    public final void setMessageText(String str) {
        this.f96200f = str;
    }

    public final void setShouldShowMessageText(boolean z) {
        this.f96199e = z;
    }

    public void setFollowStatus(int i2) {
        a(i2, 0);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        CharSequence charSequence;
        CharSequence text;
        setVisibility(0);
        if (i2 == 0) {
            setButtonVariant(0);
            if (i3 == 1) {
                text = getResources().getText(R.string.byt);
            } else {
                text = getResources().getText(R.string.byp);
            }
            setText(text);
        } else {
            setButtonVariant(1);
            if (i2 == 1) {
                charSequence = getResources().getText(R.string.c06);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    setVisibility(8);
                } else if (i2 == 4) {
                    charSequence = getResources().getText(R.string.bzw);
                }
            } else if (this.f96199e) {
                String str = this.f96200f;
                if (str == null || str.length() == 0) {
                    charSequence = getResources().getText(R.string.d3z);
                } else {
                    charSequence = this.f96200f;
                }
            } else {
                charSequence = getResources().getText(R.string.bbg);
            }
            setText(charSequence);
        }
        setButtonSize(1);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3, String str) {
        a(i2, i3);
    }

    private /* synthetic */ NewFollowButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (int) R.attr.bo);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewFollowButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, R.attr.bo);
        l.d(context, "");
        a(true);
        setEllipsize(null);
    }
}
