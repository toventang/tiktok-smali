package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final UrlModel f100144a;

    /* renamed from: b  reason: collision with root package name */
    public int f100145b;

    static {
        Covode.recordClassIndex(63830);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f100144a, hVar.f100144a) && this.f100145b == hVar.f100145b;
    }

    public final int hashCode() {
        UrlModel urlModel = this.f100144a;
        return ((urlModel != null ? urlModel.hashCode() : 0) * 31) + this.f100145b;
    }

    public final String toString() {
        return "UrlStatusModel(url=" + this.f100144a + ", status=" + this.f100145b + ")";
    }

    private h(UrlModel urlModel) {
        l.d(urlModel, "");
        this.f100144a = urlModel;
        this.f100145b = 0;
    }

    public /* synthetic */ h(UrlModel urlModel, byte b2) {
        this(urlModel);
    }
}
