package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116334a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(75111);
    }

    public static BioLinkReportConfig a() {
        try {
            return (BioLinkReportConfig) SettingsManager.a().a("bio_link_report_config", BioLinkReportConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
