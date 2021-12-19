package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f100892a;

    /* renamed from: b  reason: collision with root package name */
    public IMUser f100893b;

    /* renamed from: c  reason: collision with root package name */
    public int f100894c;

    static {
        Covode.recordClassIndex(64543);
    }

    public c() {
        this(0, null, 0, 7);
    }

    private c(int i2, IMUser iMUser, int i3) {
        this.f100892a = i2;
        this.f100893b = iMUser;
        this.f100894c = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, IMUser iMUser, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? null : iMUser, (i4 & 4) != 0 ? 0 : i3);
    }
}
