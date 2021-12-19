package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a;
import h.f.b.l;

public final class h implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f100562a;

    /* renamed from: b  reason: collision with root package name */
    private final a f100563b;

    static {
        Covode.recordClassIndex(64321);
    }

    public /* synthetic */ h() {
        this(null, null);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new GroupInviteViewModel(this.f100562a, this.f100563b);
    }

    public h(String str, a aVar) {
        this.f100562a = str;
        this.f100563b = aVar;
    }
}
