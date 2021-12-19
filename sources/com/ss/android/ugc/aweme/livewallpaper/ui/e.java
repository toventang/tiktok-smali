package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.profile.ui.ay;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveWallPaperPreviewActivity f108975a;

    static {
        Covode.recordClassIndex(69770);
    }

    e(LiveWallPaperPreviewActivity liveWallPaperPreviewActivity) {
        this.f108975a = liveWallPaperPreviewActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        LiveWallPaperPreviewActivity liveWallPaperPreviewActivity = this.f108975a;
        a aVar = new a(liveWallPaperPreviewActivity);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ay.a(liveWallPaperPreviewActivity.getResources().getString(R.string.b5g)));
        arrayList.add(new ay.a(liveWallPaperPreviewActivity.getResources().getString(R.string.a9e)));
        ay ayVar = new ay(liveWallPaperPreviewActivity, arrayList);
        aVar.f76416a.a(ayVar, new DialogInterface.OnClickListener(ayVar) {
            /* class com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ay f108955a;

            static {
                Covode.recordClassIndex(69759);
            }

            {
                this.f108955a = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                if (LiveWallPaperPreviewActivity.this.getResources().getString(R.string.b5g).equals(this.f108955a.f116894a.get(i2))) {
                    a.C0731a aVar = new a.C0731a(LiveWallPaperPreviewActivity.this);
                    aVar.f33402b = LiveWallPaperPreviewActivity.this.getResources().getString(R.string.b5s);
                    aVar.a(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.asg), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(69760);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            d dVar = d.f108899e;
                            String id = LiveWallPaperPreviewActivity.this.f108949d.getId();
                            if (!b.a((Collection) dVar.f108900a) && !TextUtils.isEmpty(id)) {
                                Iterator<LiveWallPaperBean> it = dVar.f108900a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    LiveWallPaperBean next = it.next();
                                    if (id.equals(next.getId())) {
                                        dVar.a(next);
                                        it.remove();
                                        dVar.b();
                                        com.a.a("Remove wallpaper: %s", new Object[]{next});
                                        break;
                                    }
                                }
                            }
                            LiveWallPaperPreviewActivity.this.finish();
                        }
                    }, false).b(LiveWallPaperPreviewActivity.this.getResources().getString(R.string.a9e), (DialogInterface.OnClickListener) null, false).a().b();
                }
            }
        });
        try {
            aVar.f76416a.b();
        } catch (Resources.NotFoundException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }
}
