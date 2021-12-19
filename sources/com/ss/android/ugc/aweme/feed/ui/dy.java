package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

final /* synthetic */ class dy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dw f94661a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94662b;

    /* renamed from: c  reason: collision with root package name */
    private final b f94663c;

    static {
        Covode.recordClassIndex(60074);
    }

    dy(dw dwVar, String str, b bVar) {
        this.f94661a = dwVar;
        this.f94662b = str;
        this.f94663c = bVar;
    }

    public final void run() {
        dw dwVar = this.f94661a;
        String str = this.f94662b;
        b bVar = this.f94663c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1661876786:
                if (str.equals("stopPlayAnimation") && !dwVar.f94646d) {
                    if (dwVar.f94644b != null) {
                        dwVar.f94644b.setProgress(0);
                        dwVar.f94644b.clearAnimation();
                        dwVar.f94644b.setVisibility(4);
                    }
                    if (dwVar.f94645c != null) {
                        dwVar.f94645c.clearAnimation();
                        dwVar.f94645c.c();
                        return;
                    }
                    return;
                }
                return;
            case -904341062:
                if (str.equals("load_progress_bar")) {
                    if (!((Boolean) bVar.a()).booleanValue()) {
                        dwVar.d();
                        return;
                    } else if (dwVar.f94645c != null) {
                        dwVar.f94645c.a();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 350216171:
                if (str.equals("on_page_selected")) {
                    dwVar.f94646d = true;
                    dwVar.b();
                    dwVar.o();
                    dwVar.e();
                    return;
                }
                return;
            case 1628582276:
                if (str.equals("on_page_unselected")) {
                    dwVar.f94646d = false;
                    dwVar.p();
                    dwVar.e();
                    dwVar.d();
                    return;
                }
                return;
            case 2000201256:
                if (str.equals("in_video_view_holder")) {
                    if (((Boolean) bVar.a()).booleanValue()) {
                        dwVar.o();
                        return;
                    } else {
                        dwVar.p();
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
