package com.bytedance.android.live.publicscreen.impl.model.chat;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.a.a;
import com.bytedance.android.live.publicscreen.impl.model.f;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.chatroom.ui.cz;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;

public class b extends a<i> implements f {

    /* renamed from: h  reason: collision with root package name */
    private boolean f12425h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12426i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f12427j;

    static {
        Covode.recordClassIndex(6826);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final boolean c() {
        return this.f12425h;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final boolean s() {
        return this.f12426i;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final CharSequence t() {
        return this.f12427j;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((i) this.f12190d).f19630g;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.h, com.bytedance.android.live.publicscreen.impl.model.chat.a
    public final void r() {
        super.r();
        this.f12425h = false;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final CharSequence u() {
        return z();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public CharSequence a() {
        if (TextUtils.isEmpty(v())) {
            return "";
        }
        String a2 = a.a(((i) this.f12190d).f19629f);
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(a2);
        spannableString.setSpan(new cz() {
            /* class com.bytedance.android.live.publicscreen.impl.model.chat.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(6827);
            }

            @Override // com.bytedance.android.livesdk.chatroom.ui.cz
            public final void a(View view) {
            }

            public final void updateDrawState(TextPaint textPaint) {
            }

            public final void onClick(View view) {
                b bVar = b.this;
                CharSequence v = bVar.v();
                if (bVar.b() != null && !TextUtils.isEmpty(v)) {
                    ap apVar = new ap(v.toString(), "positive_reply");
                    apVar.f15109e = bVar.b();
                    com.bytedance.android.livesdk.an.a.a().a(apVar);
                }
                com.bytedance.android.live.publicscreen.impl.f.b.b(bVar.f12190d);
            }
        }, 0, spannableString.length(), 33);
        return spannableString;
    }

    public b(i iVar) {
        super(iVar);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final void a(CharSequence charSequence) {
        this.f12427j = charSequence;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final void b(boolean z) {
        this.f12425h = z;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.f
    public final void a(boolean z) {
        this.f12426i = z;
    }
}
