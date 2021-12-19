package com.ss.android.ugc.aweme.settingsrequest;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final f f123230a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.Editor f123231b;

    /* renamed from: c  reason: collision with root package name */
    private final IESSettingsProxy f123232c;

    static {
        Covode.recordClassIndex(80931);
    }

    j(f fVar, SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        this.f123230a = fVar;
        this.f123231b = editor;
        this.f123232c = iESSettingsProxy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f123230a.f123223a = SettingsRequestServiceImpl.i().a(this.f123231b, this.f123232c);
        return null;
    }
}
