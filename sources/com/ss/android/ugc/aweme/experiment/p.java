package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f90269a = new p();

    private p() {
    }

    static {
        Covode.recordClassIndex(56617);
    }

    public static final ClaCrowdsourcingEntrypoints a() {
        try {
            return (ClaCrowdsourcingEntrypoints) SettingsManager.a().a("cla_crowdsourcing_entry_points", ClaCrowdsourcingEntrypoints.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
