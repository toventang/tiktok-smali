package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.google.gson.t;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.models.a;
import com.twitter.sdk.android.core.models.b;
import l.l;

public final class m extends s {
    private final a apiError;
    private final int code;
    private final l response;
    private final t twitterRateLimit;

    static {
        Covode.recordClassIndex(103710);
    }

    public final l getResponse() {
        return this.response;
    }

    public final int getStatusCode() {
        return this.code;
    }

    public final t getTwitterRateLimit() {
        return this.twitterRateLimit;
    }

    public final int getErrorCode() {
        a aVar = this.apiError;
        if (aVar == null) {
            return 0;
        }
        return aVar.f156155b;
    }

    public final String getErrorMessage() {
        a aVar = this.apiError;
        if (aVar == null) {
            return null;
        }
        return aVar.f156154a;
    }

    public static t readApiRateLimit(l lVar) {
        return new t(lVar.f159305a.headers());
    }

    public m(l lVar) {
        this(lVar, readApiError(lVar), readApiRateLimit(lVar), lVar.f159305a.code());
    }

    private static a a(String str) {
        try {
            b bVar = (b) new g().a(new SafeListAdapter()).a(new SafeMapAdapter()).b().a(str, b.class);
            if (!bVar.f156156a.isEmpty()) {
                return bVar.f156156a.get(0);
            }
            return null;
        } catch (t unused) {
            k.c().a();
            return null;
        }
    }

    public static a readApiError(l lVar) {
        try {
            String r = lVar.f159307c.source().a().clone().r();
            if (!TextUtils.isEmpty(r)) {
                return a(r);
            }
            return null;
        } catch (Exception unused) {
            k.c().a();
            return null;
        }
    }

    private m(l lVar, a aVar, t tVar, int i2) {
        super("HTTP request failed, Status: ".concat(String.valueOf(i2)));
        this.apiError = aVar;
        this.twitterRateLimit = tVar;
        this.code = i2;
        this.response = lVar;
    }
}
