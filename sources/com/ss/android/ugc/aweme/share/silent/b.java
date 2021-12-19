package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.aweme.services.external.IComplianceService;
import com.ss.android.ugc.aweme.share.b.a;

public abstract class b extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    protected IComplianceService f124327g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f124328h;

    static {
        Covode.recordClassIndex(81631);
    }

    public abstract void a(int i2);

    public abstract void a(CanCancelRadioButton.a aVar);

    public abstract void a(boolean z);

    public abstract String c();

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i2);

    public abstract void setSyncShareViewTextColor(int i2);

    public abstract void setSyncShareViewTextSize(float f2);

    public void setSyncShareViewTitle(String str) {
    }

    public IComplianceService getComplianceService() {
        return this.f124327g;
    }

    public Fragment getFragment() {
        return this.f124328h;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        Bundle bundle = new Bundle();
        IComplianceService iComplianceService = this.f124327g;
        if (iComplianceService != null) {
            bundle.putInt("publish_private_status", iComplianceService.getPublishPermission());
            bundle.putBoolean("music_prevent_download", this.f124327g.getMusicPreventDownload());
        }
        a.a("ug_publish_share_click", bundle);
    }

    public b(Context context) {
        super(context);
    }

    public void setComplianceService(IComplianceService iComplianceService) {
        this.f124327g = iComplianceService;
    }
}
