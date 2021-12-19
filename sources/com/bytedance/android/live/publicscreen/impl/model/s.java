package com.bytedance.android.live.publicscreen.impl.model;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.ck;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class s extends k<ck> {

    /* renamed from: e  reason: collision with root package name */
    private b f12492e = d.a.a();

    static {
        Covode.recordClassIndex(6869);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((ck) this.f12190d).f19497a;
    }

    private int s() {
        if (this.f12492e == null || ((ck) this.f12190d).f19497a == null) {
            return 0;
        }
        return R.color.a1f;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        String str;
        String str2;
        if (!(this.f12492e == null || ((ck) this.f12190d).f19497a == null)) {
            if (this.f12492e.getId() == ((ck) this.f12190d).f19497a.getId() && ((ck) this.f12190d).f19498f != null) {
                com.bytedance.android.livesdk.an.a.a().a(new a(((ck) this.f12190d).f19498f.f19502d));
            }
        }
        User user = ((ck) this.f12190d).f19497a;
        ck.a aVar = ((ck) this.f12190d).f19498f;
        if (user != null) {
            str = user.getNickName();
        } else {
            str = null;
        }
        if (aVar != null) {
            str2 = String.valueOf(aVar.f19499a);
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + y.a((int) R.string.gwu, str2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(y.b(s())), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(y.b((int) R.color.a1e)), str.length(), str.length() + 6, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(y.b(s())), str.length() + 6, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f12493a;

        static {
            Covode.recordClassIndex(6870);
        }

        a(String str) {
            this.f12493a = str;
        }
    }

    public s(ck ckVar) {
        super(ckVar);
    }
}
