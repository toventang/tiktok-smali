package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.geofencing.PublishSettingItem;
import com.ss.android.ugc.aweme.shortvideo.k.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VideoPrivacySettingsItem extends PublishSettingItem implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private boolean f131211a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f131212b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f131213c;
    private String n;
    private String o;
    private String p;

    static {
        Covode.recordClassIndex(85965);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
    }

    private void a() {
        String str;
        int i2;
        String str2;
        String str3;
        if (e.a()) {
            boolean z = this.f131211a;
            String str4 = "";
            if (z || this.f131212b || this.f131213c) {
                String str5 = null;
                if (z) {
                    str = this.n;
                    i2 = 1;
                } else {
                    str = null;
                    i2 = 0;
                }
                if (this.f131212b) {
                    if (str == null) {
                        str = this.o;
                        str2 = null;
                    } else {
                        str2 = this.o;
                    }
                    i2++;
                } else {
                    str2 = null;
                }
                if (this.f131213c) {
                    if (str == null) {
                        str = this.p;
                    } else if (str2 == null) {
                        str2 = this.p;
                    } else {
                        str5 = this.p;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        str3 = getContext().getString(R.string.azz, str, str2);
                        l.b(str3, str4);
                    } else if (i2 == 3) {
                        str3 = getContext().getString(R.string.b00, str, str2, str5);
                        l.b(str3, str4);
                    }
                    str4 = str3;
                } else {
                    str3 = getContext().getString(R.string.azy, str);
                    l.b(str3, str4);
                    str4 = str3;
                }
                setBottomHintText(str4);
                setBottomHintTextVisibility(0);
                return;
            }
            setBottomHintText(str4);
            setBottomHintTextVisibility(8);
        }
    }

    public final void setCommentStatus(boolean z) {
        this.f131211a = z;
        a();
    }

    public final void setDuetStatus(boolean z) {
        this.f131212b = z;
        a();
    }

    public final void setStitchStatus(boolean z) {
        this.f131213c = z;
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoPrivacySettingsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        l.d(context, "");
        l.d(attributeSet, "");
        setDrawableLeft(b.a(context, 2131232711));
        setTitle(context.getString(R.string.b05));
        setSubtitle("");
        if (e.a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setBottomHintTextVisibility(i2);
        String string = context.getString(R.string.b01);
        l.b(string, "");
        this.n = string;
        String string2 = context.getString(R.string.b02);
        l.b(string2, "");
        this.o = string2;
        String string3 = context.getString(R.string.b03);
        l.b(string3, "");
        this.p = string3;
    }
}
